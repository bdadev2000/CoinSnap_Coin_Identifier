package androidx.lifecycle;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class T implements InterfaceC0509t, Closeable {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final S f4866c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4867d;

    public T(String str, S s5) {
        this.b = str;
        this.f4866c = s5;
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        if (enumC0503m == EnumC0503m.ON_DESTROY) {
            this.f4867d = false;
            interfaceC0511v.getLifecycle().b(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void h(G0.e eVar, AbstractC0505o abstractC0505o) {
        G7.j.e(eVar, "registry");
        G7.j.e(abstractC0505o, "lifecycle");
        if (!this.f4867d) {
            this.f4867d = true;
            abstractC0505o.a(this);
            eVar.c(this.b, this.f4866c.f4865e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }
}
