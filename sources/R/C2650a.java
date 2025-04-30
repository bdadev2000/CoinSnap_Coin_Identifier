package r;

import android.os.Looper;
import e1.f;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2650a extends f {
    public static volatile C2650a b;

    /* renamed from: c, reason: collision with root package name */
    public static final A0.c f22807c = new A0.c(1);

    /* renamed from: a, reason: collision with root package name */
    public final C2652c f22808a = new C2652c();

    public static C2650a v() {
        if (b != null) {
            return b;
        }
        synchronized (C2650a.class) {
            try {
                if (b == null) {
                    b = new C2650a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void w(Runnable runnable) {
        C2652c c2652c = this.f22808a;
        if (c2652c.f22811c == null) {
            synchronized (c2652c.f22810a) {
                try {
                    if (c2652c.f22811c == null) {
                        c2652c.f22811c = C2652c.v(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c2652c.f22811c.post(runnable);
    }
}
