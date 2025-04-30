package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.thrid.okhttp.RealCall;
import com.mbridge.msdk.thrid.okhttp.internal.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Dispatcher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ExecutorService executorService;
    private Runnable idleCallback;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<RealCall.AsyncCall> readyAsyncCalls = new ArrayDeque();
    private final Deque<RealCall.AsyncCall> runningAsyncCalls = new ArrayDeque();
    private final Deque<RealCall> runningSyncCalls = new ArrayDeque();

    public Dispatcher(ExecutorService executorService) {
        this.executorService = executorService;
    }

    private boolean promoteAndExecute() {
        int i9;
        boolean z8;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                while (it.hasNext()) {
                    RealCall.AsyncCall next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (runningCallsForHost(next) < this.maxRequestsPerHost) {
                        it.remove();
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                if (runningCallsCount() > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i9 = 0; i9 < size; i9++) {
            ((RealCall.AsyncCall) arrayList.get(i9)).executeOn(executorService());
        }
        return z8;
    }

    private int runningCallsForHost(RealCall.AsyncCall asyncCall) {
        int i9 = 0;
        for (RealCall.AsyncCall asyncCall2 : this.runningAsyncCalls) {
            if (!asyncCall2.get().forWebSocket && asyncCall2.host().equals(asyncCall.host())) {
                i9++;
            }
        }
        return i9;
    }

    public synchronized void cancelAll() {
        try {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                it.next().get().cancel();
            }
            Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                it2.next().get().cancel();
            }
            Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                it3.next().cancel();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void enqueue(RealCall.AsyncCall asyncCall) {
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
        }
        promoteAndExecute();
    }

    public synchronized void executed(RealCall realCall) {
        this.runningSyncCalls.add(realCall);
    }

    public synchronized ExecutorService executorService() {
        try {
            if (this.executorService == null) {
                this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.executorService;
    }

    public void finished(RealCall.AsyncCall asyncCall) {
        finished(this.runningAsyncCalls, asyncCall);
    }

    public synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public synchronized List<Call> queuedCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().get());
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public synchronized List<Call> runningCalls() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            arrayList.addAll(this.runningSyncCalls);
            Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().get());
            }
        } catch (Throwable th) {
            throw th;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public void setMaxRequests(int i9) {
        if (i9 >= 1) {
            synchronized (this) {
                this.maxRequests = i9;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(o.h(i9, "max < 1: "));
    }

    public void setMaxRequestsPerHost(int i9) {
        if (i9 >= 1) {
            synchronized (this) {
                this.maxRequestsPerHost = i9;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(o.h(i9, "max < 1: "));
    }

    public void finished(RealCall realCall) {
        finished(this.runningSyncCalls, realCall);
    }

    private <T> void finished(Deque<T> deque, T t9) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t9)) {
                runnable = this.idleCallback;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (promoteAndExecute() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public Dispatcher() {
    }
}
