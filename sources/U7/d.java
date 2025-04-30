package U7;

import Q7.AbstractC0255x;
import Q7.EnumC0254w;
import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class d extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f3346g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3347h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T7.c f3348i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f3349j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(T7.c cVar, k kVar, w7.f fVar) {
        super(2, fVar);
        this.f3348i = cVar;
        this.f3349j = kVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        d dVar = new d(this.f3348i, this.f3349j, fVar);
        dVar.f3347h = obj;
        return dVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((d) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f3346g;
        y yVar = y.f23029a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            InterfaceC0253v interfaceC0253v = (InterfaceC0253v) this.f3347h;
            k kVar = this.f3349j;
            int i10 = kVar.f3372c;
            if (i10 == -3) {
                i10 = -2;
            }
            EnumC0254w enumC0254w = EnumC0254w.f2586d;
            F7.p eVar = new e(kVar, null);
            S7.o oVar = new S7.o(AbstractC0255x.m(interfaceC0253v, (w7.k) kVar.f3373d), S7.j.a(i10, (S7.a) kVar.f3374f, 4));
            oVar.X(enumC0254w, oVar, eVar);
            this.f3346g = 1;
            Object c9 = T7.s.c(this.f3348i, oVar, true, this);
            if (c9 != enumC2928a) {
                c9 = yVar;
            }
            if (c9 == enumC2928a) {
                return enumC2928a;
            }
        }
        return yVar;
    }
}
