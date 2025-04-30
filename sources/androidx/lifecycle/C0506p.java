package androidx.lifecycle;

import Q7.AbstractC0255x;
import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import y7.AbstractC2960i;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506p extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0507q f4899h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0506p(C0507q c0507q, w7.f fVar) {
        super(2, fVar);
        this.f4899h = c0507q;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        C0506p c0506p = new C0506p(this.f4899h, fVar);
        c0506p.f4898g = obj;
        return c0506p;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        C0506p c0506p = (C0506p) c((InterfaceC0253v) obj, (w7.f) obj2);
        t7.y yVar = t7.y.f23029a;
        c0506p.i(yVar);
        return yVar;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        AbstractC2712a.f(obj);
        InterfaceC0253v interfaceC0253v = (InterfaceC0253v) this.f4898g;
        C0507q c0507q = this.f4899h;
        if (((C0513x) c0507q.b).f4904d.compareTo(EnumC0504n.f4892c) >= 0) {
            c0507q.b.a(c0507q);
        } else {
            AbstractC0255x.c(interfaceC0253v.k(), null);
        }
        return t7.y.f23029a;
    }
}
