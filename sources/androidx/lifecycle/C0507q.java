package androidx.lifecycle;

import Q7.AbstractC0255x;
import Q7.InterfaceC0253v;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507q implements InterfaceC0509t, InterfaceC0253v {
    public final AbstractC0505o b;

    /* renamed from: c, reason: collision with root package name */
    public final w7.k f4900c;

    public C0507q(AbstractC0505o abstractC0505o, w7.k kVar) {
        G7.j.e(kVar, "coroutineContext");
        this.b = abstractC0505o;
        this.f4900c = kVar;
        if (((C0513x) abstractC0505o).f4904d == EnumC0504n.b) {
            AbstractC0255x.c(kVar, null);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        AbstractC0505o abstractC0505o = this.b;
        if (((C0513x) abstractC0505o).f4904d.compareTo(EnumC0504n.b) <= 0) {
            abstractC0505o.b(this);
            AbstractC0255x.c(this.f4900c, null);
        }
    }

    @Override // Q7.InterfaceC0253v
    public final w7.k k() {
        return this.f4900c;
    }
}
