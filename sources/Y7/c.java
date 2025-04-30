package Y7;

import F7.l;
import Q7.C0238f;
import Q7.InterfaceC0237e;
import Q7.r0;
import V7.u;
import t7.y;
import w7.k;

/* loaded from: classes3.dex */
public final class c implements InterfaceC0237e, r0 {
    public final C0238f b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3825c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f3826d;

    public c(d dVar, C0238f c0238f) {
        this.f3826d = dVar;
        this.b = c0238f;
    }

    @Override // Q7.r0
    public final void a(u uVar, int i9) {
        this.b.a(uVar, i9);
    }

    @Override // w7.f
    public final void e(Object obj) {
        this.b.e(obj);
    }

    @Override // Q7.InterfaceC0237e
    public final H0.a f(Object obj, l lVar) {
        d dVar = this.f3826d;
        b bVar = new b(dVar, this, 1);
        H0.a f9 = this.b.f((y) obj, bVar);
        if (f9 != null) {
            d.f3827h.set(dVar, this.f3825c);
        }
        return f9;
    }

    @Override // w7.f
    public final k getContext() {
        return this.b.f2566g;
    }

    @Override // Q7.InterfaceC0237e
    public final boolean l(Throwable th) {
        return this.b.l(th);
    }

    @Override // Q7.InterfaceC0237e
    public final void o(Object obj) {
        this.b.o(obj);
    }
}
