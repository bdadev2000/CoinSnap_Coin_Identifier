package Z0;

import a1.AbstractC0329c;
import a1.C0327a;
import a1.InterfaceC0328b;
import android.content.Context;
import androidx.work.o;
import b1.C0548a;
import b1.C0549b;
import b1.C0553f;
import b1.g;
import b1.h;
import g1.InterfaceC2286a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements InterfaceC0328b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f3875d = o.g("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f3876a;
    public final AbstractC0329c[] b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3877c;

    public c(Context context, InterfaceC2286a interfaceC2286a, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3876a = bVar;
        this.b = new AbstractC0329c[]{new C0327a((C0548a) h.j(applicationContext, interfaceC2286a).b, 0), new C0327a((C0549b) h.j(applicationContext, interfaceC2286a).f5270c, 1), new C0327a((g) h.j(applicationContext, interfaceC2286a).f5272f, 4), new C0327a((C0553f) h.j(applicationContext, interfaceC2286a).f5271d, 2), new C0327a((C0553f) h.j(applicationContext, interfaceC2286a).f5271d, 3), new AbstractC0329c((C0553f) h.j(applicationContext, interfaceC2286a).f5271d), new AbstractC0329c((C0553f) h.j(applicationContext, interfaceC2286a).f5271d)};
        this.f3877c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f3877c) {
            try {
                for (AbstractC0329c abstractC0329c : this.b) {
                    Object obj = abstractC0329c.b;
                    if (obj != null && abstractC0329c.b(obj) && abstractC0329c.f3912a.contains(str)) {
                        o.e().b(f3875d, "Work " + str + " constrained by " + abstractC0329c.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Iterable iterable) {
        synchronized (this.f3877c) {
            try {
                for (AbstractC0329c abstractC0329c : this.b) {
                    if (abstractC0329c.f3914d != null) {
                        abstractC0329c.f3914d = null;
                        abstractC0329c.d(null, abstractC0329c.b);
                    }
                }
                for (AbstractC0329c abstractC0329c2 : this.b) {
                    abstractC0329c2.c(iterable);
                }
                for (AbstractC0329c abstractC0329c3 : this.b) {
                    if (abstractC0329c3.f3914d != this) {
                        abstractC0329c3.f3914d = this;
                        abstractC0329c3.d(this, abstractC0329c3.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f3877c) {
            try {
                for (AbstractC0329c abstractC0329c : this.b) {
                    ArrayList arrayList = abstractC0329c.f3912a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC0329c.f3913c.b(abstractC0329c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
