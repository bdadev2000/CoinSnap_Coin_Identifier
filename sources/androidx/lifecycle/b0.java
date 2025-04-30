package androidx.lifecycle;

import java.util.Iterator;
import s0.C2691b;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2691b f4882a = new C2691b();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C2691b c2691b = this.f4882a;
        if (c2691b != null) {
            if (c2691b.f22964d) {
                C2691b.a(autoCloseable);
                return;
            }
            synchronized (c2691b.f22962a) {
                autoCloseable2 = (AutoCloseable) c2691b.b.put(str, autoCloseable);
            }
            C2691b.a(autoCloseable2);
        }
    }

    public final void b() {
        C2691b c2691b = this.f4882a;
        if (c2691b != null && !c2691b.f22964d) {
            c2691b.f22964d = true;
            synchronized (c2691b.f22962a) {
                try {
                    Iterator it = c2691b.b.values().iterator();
                    while (it.hasNext()) {
                        C2691b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c2691b.f22963c.iterator();
                    while (it2.hasNext()) {
                        C2691b.a((AutoCloseable) it2.next());
                    }
                    c2691b.f22963c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        C2691b c2691b = this.f4882a;
        if (c2691b != null) {
            synchronized (c2691b.f22962a) {
                autoCloseable = (AutoCloseable) c2691b.b.get(str);
            }
            return autoCloseable;
        }
        return null;
    }

    public void d() {
    }
}
