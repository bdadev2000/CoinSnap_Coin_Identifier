package he;

import android.graphics.PointF;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.c1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class a0 implements ye.a, xe.f {

    /* renamed from: e, reason: collision with root package name */
    public static final fe.c f19026e = new fe.c(a0.class.getSimpleName());
    public te.i a;

    /* renamed from: c, reason: collision with root package name */
    public final y f19028c;

    /* renamed from: d, reason: collision with root package name */
    public final pe.j f19029d = new pe.j(new hb.d(this, 5));

    /* renamed from: b, reason: collision with root package name */
    public final Handler f19027b = new Handler(Looper.getMainLooper());

    public a0(c1 c1Var) {
        this.f19028c = c1Var;
        n(false);
    }

    public static void b(a0 a0Var, Throwable th2, boolean z10) {
        a0Var.getClass();
        fe.c cVar = f19026e;
        if (z10) {
            cVar.a(3, "EXCEPTION:", "Handler thread is gone. Replacing.");
            a0Var.n(false);
        }
        cVar.a(3, "EXCEPTION:", "Scheduling on the crash handler...");
        a0Var.f19027b.post(new c(6, a0Var, th2));
    }

    public abstract void A(float f10, PointF[] pointFArr, boolean z10);

    public final void B() {
        pe.j jVar = this.f19029d;
        f19026e.a(1, "START:", "scheduled. State:", jVar.f23631f);
        jVar.d(pe.f.OFF, pe.f.ENGINE, true, new w(this, 2)).onSuccessTask(new y7.q(this));
        D();
        E();
    }

    public abstract void C(se.a aVar, androidx.viewpager2.adapter.c cVar, PointF pointF);

    public final void D() {
        this.f19029d.d(pe.f.ENGINE, pe.f.BIND, true, new w(this, 4));
    }

    public final Task E() {
        return this.f19029d.d(pe.f.BIND, pe.f.PREVIEW, true, new w(this, 0));
    }

    public final Task F(boolean z10) {
        pe.j jVar = this.f19029d;
        f19026e.a(1, "STOP:", "scheduled. State:", jVar.f23631f);
        H(z10);
        G(z10);
        return jVar.d(pe.f.ENGINE, pe.f.OFF, !z10, new w(this, 3)).addOnSuccessListener(new y7.u(this));
    }

    public final void G(boolean z10) {
        this.f19029d.d(pe.f.BIND, pe.f.ENGINE, !z10, new w(this, 5));
    }

    public final void H(boolean z10) {
        this.f19029d.d(pe.f.PREVIEW, pe.f.BIND, !z10, new w(this, 1));
    }

    public abstract boolean c(ge.f fVar);

    public final void d(int i10, boolean z10) {
        Object[] objArr = {"DESTROY:", "state:", this.f19029d.f23631f, "thread:", Thread.currentThread(), "depth:", Integer.valueOf(i10), "unrecoverably:", Boolean.valueOf(z10)};
        fe.c cVar = f19026e;
        cVar.a(1, objArr);
        if (z10) {
            this.a.f25393b.setUncaughtExceptionHandler(new z());
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        F(true).addOnCompleteListener(this.a.f25395d, new x(countDownLatch));
        try {
            if (!countDownLatch.await(6L, TimeUnit.SECONDS)) {
                cVar.a(3, "DESTROY: Could not destroy synchronously after 6 seconds.", "Current thread:", Thread.currentThread(), "Handler thread:", this.a.f25393b);
                int i11 = i10 + 1;
                if (i11 < 2) {
                    n(true);
                    cVar.a(3, "DESTROY: Trying again on thread:", this.a.f25393b);
                    d(i11, z10);
                } else {
                    cVar.a(2, "DESTROY: Giving up because DESTROY_RETRIES was reached.");
                }
            }
        } catch (InterruptedException unused) {
        }
    }

    public abstract ze.b e(int i10);

    public final boolean f() {
        pe.j jVar = this.f19029d;
        synchronized (jVar.f23613d) {
            Iterator it = jVar.f23611b.iterator();
            while (it.hasNext()) {
                pe.d dVar = (pe.d) it.next();
                if (dVar.a.contains(" >> ") || dVar.a.contains(" << ")) {
                    if (!dVar.f23606b.getTask().isComplete()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public abstract Task g();

    public abstract Task h();

    public abstract Task i();

    public abstract Task j();

    public abstract Task k();

    public abstract Task l();

    public final void m() {
        ye.b bVar = ((v) this).f19086f;
        f19026e.a(1, "onSurfaceAvailable:", "Size is", new ze.b(bVar.f28178d, bVar.f28179e));
        D();
        E();
    }

    public final void n(boolean z10) {
        te.i iVar = this.a;
        if (iVar != null) {
            te.h hVar = iVar.f25393b;
            if (hVar.isAlive()) {
                hVar.interrupt();
                hVar.quit();
            }
            te.i.f25392f.remove(iVar.a);
        }
        te.i a = te.i.a("CameraViewEngine");
        this.a = a;
        a.f25393b.setUncaughtExceptionHandler(new h.s(this));
        if (z10) {
            pe.j jVar = this.f19029d;
            synchronized (jVar.f23613d) {
                HashSet hashSet = new HashSet();
                Iterator it = jVar.f23611b.iterator();
                while (it.hasNext()) {
                    hashSet.add(((pe.d) it.next()).a);
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    jVar.c(0, (String) it2.next());
                }
            }
        }
    }

    public final void o() {
        f19026e.a(1, "RESTART:", "scheduled. State:", this.f19029d.f23631f);
        F(false);
        B();
    }

    public final void p() {
        f19026e.a(1, "RESTART BIND:", "scheduled. State:", this.f19029d.f23631f);
        H(false);
        G(false);
        D();
        E();
    }

    public abstract void q(float f10, float[] fArr, PointF[] pointFArr, boolean z10);

    public abstract void r(ge.g gVar);

    public abstract void s(int i10);

    public abstract void t(boolean z10);

    public abstract void u(ge.i iVar);

    public abstract void v(Location location);

    public abstract void w(ge.k kVar);

    public abstract void x(boolean z10);

    public abstract void y(float f10);

    public abstract void z(ge.n nVar);
}
