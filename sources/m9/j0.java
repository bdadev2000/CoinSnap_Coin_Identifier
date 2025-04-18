package m9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class j0 extends Handler implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final int f21674b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f21675c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21676d;

    /* renamed from: f, reason: collision with root package name */
    public i0 f21677f;

    /* renamed from: g, reason: collision with root package name */
    public IOException f21678g;

    /* renamed from: h, reason: collision with root package name */
    public int f21679h;

    /* renamed from: i, reason: collision with root package name */
    public Thread f21680i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21681j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f21682k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n0 f21683l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, Looper looper, k0 k0Var, i0 i0Var, int i10, long j3) {
        super(looper);
        this.f21683l = n0Var;
        this.f21675c = k0Var;
        this.f21677f = i0Var;
        this.f21674b = i10;
        this.f21676d = j3;
    }

    public final void a(boolean z10) {
        this.f21682k = z10;
        this.f21678g = null;
        if (hasMessages(0)) {
            this.f21681j = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f21681j = true;
                this.f21675c.cancelLoad();
                Thread thread = this.f21680i;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.f21683l.f21694c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i0 i0Var = this.f21677f;
            i0Var.getClass();
            i0Var.b(this.f21675c, elapsedRealtime, elapsedRealtime - this.f21676d, true);
            this.f21677f = null;
        }
    }

    public final void b(long j3) {
        boolean z10;
        n0 n0Var = this.f21683l;
        if (n0Var.f21694c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.m(z10);
        n0Var.f21694c = this;
        if (j3 > 0) {
            sendEmptyMessageDelayed(0, j3);
            return;
        }
        this.f21678g = null;
        ExecutorService executorService = n0Var.f21693b;
        j0 j0Var = n0Var.f21694c;
        j0Var.getClass();
        executorService.execute(j0Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f21682k) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f21678g = null;
            n0 n0Var = this.f21683l;
            ExecutorService executorService = n0Var.f21693b;
            j0 j0Var = n0Var.f21694c;
            j0Var.getClass();
            executorService.execute(j0Var);
            return;
        }
        if (i10 != 3) {
            this.f21683l.f21694c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f21676d;
            i0 i0Var = this.f21677f;
            i0Var.getClass();
            if (this.f21681j) {
                i0Var.b(this.f21675c, elapsedRealtime, j3, false);
                return;
            }
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f21678g = iOException;
                    int i12 = this.f21679h + 1;
                    this.f21679h = i12;
                    j8.e a = i0Var.a(this.f21675c, elapsedRealtime, j3, iOException, i12);
                    int i13 = a.a;
                    if (i13 == 3) {
                        this.f21683l.f21695d = this.f21678g;
                        return;
                    } else {
                        if (i13 != 2) {
                            if (i13 == 1) {
                                this.f21679h = 1;
                            }
                            long j10 = a.f19811b;
                            if (j10 == C.TIME_UNSET) {
                                j10 = Math.min((this.f21679h - 1) * 1000, 5000);
                            }
                            b(j10);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            try {
                i0Var.c(this.f21675c, elapsedRealtime, j3);
                return;
            } catch (RuntimeException e2) {
                n9.o.d("LoadTask", "Unexpected exception handling load completed", e2);
                this.f21683l.f21695d = new m0(e2);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                if (!this.f21681j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21680i = Thread.currentThread();
            }
            if (z10) {
                c6.k.c("load:".concat(this.f21675c.getClass().getSimpleName()));
                try {
                    this.f21675c.load();
                    c6.k.k();
                } catch (Throwable th2) {
                    c6.k.k();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f21680i = null;
                Thread.interrupted();
            }
            if (!this.f21682k) {
                sendEmptyMessage(1);
            }
        } catch (IOException e2) {
            if (!this.f21682k) {
                obtainMessage(2, e2).sendToTarget();
            }
        } catch (Error e10) {
            if (!this.f21682k) {
                n9.o.d("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(3, e10).sendToTarget();
            }
            throw e10;
        } catch (Exception e11) {
            if (!this.f21682k) {
                n9.o.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(2, new m0(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.f21682k) {
                n9.o.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(2, new m0(e12)).sendToTarget();
            }
        }
    }
}
