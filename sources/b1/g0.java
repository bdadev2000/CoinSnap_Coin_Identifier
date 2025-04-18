package b1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class g0 extends x0 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f22320k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f22321l;

    /* JADX WARN: Type inference failed for: r0v0, types: [b1.g0, b1.y0, b1.x0] */
    static {
        Long l2;
        ?? x0Var = new x0();
        f22320k = x0Var;
        x0Var.o0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f22321l = timeUnit.toNanos(l2.longValue());
    }

    @Override // b1.x0, b1.k0
    public final q0 E(long j2, Runnable runnable, h0.l lVar) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 >= 4611686018427387903L) {
            return x1.f22395a;
        }
        long nanoTime = System.nanoTime();
        u0 u0Var = new u0(runnable, j3 + nanoTime);
        w0(nanoTime, u0Var);
        return u0Var;
    }

    @Override // b1.y0
    public final Thread n0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean v02;
        d2.f22296a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 != 2 && i2 != 3) {
                    debugStatus = 1;
                    notifyAll();
                    long j2 = Long.MAX_VALUE;
                    while (true) {
                        Thread.interrupted();
                        long q02 = q0();
                        if (q02 == Long.MAX_VALUE) {
                            long nanoTime = System.nanoTime();
                            if (j2 == Long.MAX_VALUE) {
                                j2 = f22321l + nanoTime;
                            }
                            long j3 = j2 - nanoTime;
                            if (j3 <= 0) {
                                _thread = null;
                                x0();
                                if (v0()) {
                                    return;
                                }
                                n0();
                                return;
                            }
                            if (q02 > j3) {
                                q02 = j3;
                            }
                        } else {
                            j2 = Long.MAX_VALUE;
                        }
                        if (q02 > 0) {
                            int i3 = debugStatus;
                            if (i3 == 2 || i3 == 3) {
                                break;
                            } else {
                                LockSupport.parkNanos(this, q02);
                            }
                        }
                    }
                    if (v02) {
                        return;
                    } else {
                        return;
                    }
                }
                _thread = null;
                x0();
                if (v0()) {
                    return;
                }
                n0();
            }
        } finally {
            _thread = null;
            x0();
            if (!v0()) {
                n0();
            }
        }
    }

    @Override // b1.y0
    public final void s0(long j2, v0 v0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // b1.x0, b1.y0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // b1.x0
    public final void t0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.t0(runnable);
    }

    public final synchronized void x0() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            x0.f22392h.set(this, null);
            x0.f22393i.set(this, null);
            notifyAll();
        }
    }
}
