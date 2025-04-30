package Q7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: Q7.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0256y extends K implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC0256y l;
    public static final long m;

    /* JADX WARN: Type inference failed for: r0v0, types: [Q7.L, Q7.y, Q7.K] */
    static {
        Long l2;
        ?? k6 = new K();
        l = k6;
        k6.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        m = timeUnit.toNanos(l2.longValue());
    }

    @Override // Q7.L
    public final Thread m() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(RunnableC0256y.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // Q7.K
    public final void r(Runnable runnable) {
        if (debugStatus != 4) {
            super.r(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean s5;
        m0.f2570a.set(this);
        try {
            synchronized (this) {
                int i9 = debugStatus;
                if (i9 != 2 && i9 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j7 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long p2 = p();
                        if (p2 == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j7 == Long.MAX_VALUE) {
                                j7 = m + nanoTime;
                            }
                            long j9 = j7 - nanoTime;
                            if (j9 <= 0) {
                                _thread = null;
                                t();
                                if (!s()) {
                                    m();
                                    return;
                                }
                                return;
                            }
                            if (p2 > j9) {
                                p2 = j9;
                            }
                        } else {
                            j7 = Long.MAX_VALUE;
                        }
                        if (p2 > 0) {
                            int i10 = debugStatus;
                            if (i10 == 2 || i10 == 3) {
                                break;
                            } else {
                                LockSupport.parkNanos(this, p2);
                            }
                        }
                    }
                    if (!s5) {
                        return;
                    } else {
                        return;
                    }
                }
                _thread = null;
                t();
                if (!s()) {
                    m();
                }
            }
        } finally {
            _thread = null;
            t();
            if (!s()) {
                m();
            }
        }
    }

    @Override // Q7.K, Q7.L
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void t() {
        int i9 = debugStatus;
        if (i9 != 2 && i9 != 3) {
            return;
        }
        debugStatus = 3;
        K.f2531i.set(this, null);
        K.f2532j.set(this, null);
        notifyAll();
    }
}
