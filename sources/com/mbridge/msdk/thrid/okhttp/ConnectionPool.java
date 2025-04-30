package com.mbridge.msdk.thrid.okhttp;

import Q7.n0;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import com.mbridge.msdk.thrid.okhttp.internal.connection.RealConnection;
import com.mbridge.msdk.thrid.okhttp.internal.connection.RouteDatabase;
import com.mbridge.msdk.thrid.okhttp.internal.connection.StreamAllocation;
import com.mbridge.msdk.thrid.okhttp.internal.platform.Platform;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    private final Runnable cleanupRunnable;
    boolean cleanupRunning;
    private final Deque<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    final RouteDatabase routeDatabase;

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    private int pruneAndGetAllocationCount(RealConnection realConnection, long j7) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i9 = 0;
        while (i9 < list.size()) {
            Reference<StreamAllocation> reference = list.get(i9);
            if (reference.get() != null) {
                i9++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((StreamAllocation.StreamAllocationReference) reference).callStackTrace);
                list.remove(i9);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j7 - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public long cleanup(long j7) {
        synchronized (this) {
            try {
                RealConnection realConnection = null;
                long j9 = Long.MIN_VALUE;
                int i9 = 0;
                int i10 = 0;
                for (RealConnection realConnection2 : this.connections) {
                    if (pruneAndGetAllocationCount(realConnection2, j7) > 0) {
                        i10++;
                    } else {
                        i9++;
                        long j10 = j7 - realConnection2.idleAtNanos;
                        if (j10 > j9) {
                            realConnection = realConnection2;
                            j9 = j10;
                        }
                    }
                }
                long j11 = this.keepAliveDurationNs;
                if (j9 < j11 && i9 <= this.maxIdleConnections) {
                    if (i9 > 0) {
                        return j11 - j9;
                    }
                    if (i10 > 0) {
                        return j11;
                    }
                    this.cleanupRunning = false;
                    return -1L;
                }
                this.connections.remove(realConnection);
                Util.closeQuietly(realConnection.socket());
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean connectionBecameIdle(RealConnection realConnection) {
        if (!realConnection.noNewStreams && this.maxIdleConnections != 0) {
            notifyAll();
            return false;
        }
        this.connections.remove(realConnection);
        return true;
    }

    public synchronized int connectionCount() {
        return this.connections.size();
    }

    public Socket deduplicate(Address address, StreamAllocation streamAllocation) {
        for (RealConnection realConnection : this.connections) {
            if (realConnection.isEligible(address, null) && realConnection.isMultiplexed() && realConnection != streamAllocation.connection()) {
                return streamAllocation.releaseAndAcquire(realConnection);
            }
        }
        return null;
    }

    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealConnection> it = this.connections.iterator();
                while (it.hasNext()) {
                    RealConnection next = it.next();
                    if (next.allocations.isEmpty()) {
                        next.noNewStreams = true;
                        arrayList.add(next);
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Util.closeQuietly(((RealConnection) it2.next()).socket());
        }
    }

    public RealConnection get(Address address, StreamAllocation streamAllocation, Route route) {
        for (RealConnection realConnection : this.connections) {
            if (realConnection.isEligible(address, route)) {
                streamAllocation.acquire(realConnection, true);
                return realConnection;
            }
        }
        return null;
    }

    public synchronized int idleConnectionCount() {
        int i9;
        Iterator<RealConnection> it = this.connections.iterator();
        i9 = 0;
        while (it.hasNext()) {
            if (it.next().allocations.isEmpty()) {
                i9++;
            }
        }
        return i9;
    }

    public void put(RealConnection realConnection) {
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            executor.execute(this.cleanupRunnable);
        }
        this.connections.add(realConnection);
    }

    public ConnectionPool(int i9, long j7, TimeUnit timeUnit) {
        this.cleanupRunnable = new Runnable() { // from class: com.mbridge.msdk.thrid.okhttp.ConnectionPool.1
            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    long cleanup = ConnectionPool.this.cleanup(System.nanoTime());
                    if (cleanup == -1) {
                        return;
                    }
                    if (cleanup > 0) {
                        long j9 = cleanup / 1000000;
                        long j10 = cleanup - (1000000 * j9);
                        synchronized (ConnectionPool.this) {
                            try {
                                ConnectionPool.this.wait(j9, (int) j10);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        };
        this.connections = new ArrayDeque();
        this.routeDatabase = new RouteDatabase();
        this.maxIdleConnections = i9;
        this.keepAliveDurationNs = timeUnit.toNanos(j7);
        if (j7 <= 0) {
            throw new IllegalArgumentException(n0.g(j7, "keepAliveDuration <= 0: "));
        }
    }
}
