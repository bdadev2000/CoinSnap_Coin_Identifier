package s7;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class j2 {
    public final i2 a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f24458b;

    /* renamed from: c, reason: collision with root package name */
    public final n9.a f24459c;

    /* renamed from: d, reason: collision with root package name */
    public int f24460d;

    /* renamed from: e, reason: collision with root package name */
    public Object f24461e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f24462f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24463g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24464h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24465i;

    public j2(o0 o0Var, i2 i2Var, x2 x2Var, int i10, n9.a aVar, Looper looper) {
        this.f24458b = o0Var;
        this.a = i2Var;
        this.f24462f = looper;
        this.f24459c = aVar;
    }

    public final synchronized void a(long j3) {
        boolean z10;
        boolean z11;
        v8.u0.m(this.f24463g);
        if (this.f24462f.getThread() != Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.m(z10);
        ((n9.c0) this.f24459c).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j3;
        while (true) {
            z11 = this.f24465i;
            if (z11 || j3 <= 0) {
                break;
            }
            this.f24459c.getClass();
            wait(j3);
            ((n9.c0) this.f24459c).getClass();
            j3 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z11) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z10) {
        this.f24464h = z10 | this.f24464h;
        this.f24465i = true;
        notifyAll();
    }

    public final void c() {
        v8.u0.m(!this.f24463g);
        this.f24463g = true;
        o0 o0Var = this.f24458b;
        synchronized (o0Var) {
            if (!o0Var.f24635z && o0Var.f24622l.getThread().isAlive()) {
                o0Var.f24620j.a(14, this).a();
                return;
            }
            n9.o.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
