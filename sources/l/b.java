package l;

import android.os.Looper;

/* loaded from: classes.dex */
public final class b extends va.b {

    /* renamed from: j, reason: collision with root package name */
    public static volatile b f21083j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f21084k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final d f21085i = new d();

    public static b v() {
        if (f21083j != null) {
            return f21083j;
        }
        synchronized (b.class) {
            if (f21083j == null) {
                f21083j = new b();
            }
        }
        return f21083j;
    }

    public final void u(Runnable runnable) {
        this.f21085i.v(runnable);
    }

    public final boolean w() {
        this.f21085i.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public final void x(Runnable runnable) {
        d dVar = this.f21085i;
        if (dVar.f21090k == null) {
            synchronized (dVar.f21088i) {
                if (dVar.f21090k == null) {
                    dVar.f21090k = d.u(Looper.getMainLooper());
                }
            }
        }
        dVar.f21090k.post(runnable);
    }
}
