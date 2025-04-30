package y0;

import F7.p;
import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import t7.y;
import w7.f;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2940a extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f24275g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f24276h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2940a(d dVar, f fVar) {
        super(2, fVar);
        this.f24276h = dVar;
    }

    @Override // y7.AbstractC2952a
    public final f c(Object obj, f fVar) {
        return new C2940a(this.f24276h, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2940a) c((InterfaceC0253v) obj, (f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f24275g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            A0.d dVar = this.f24276h.f24284a;
            this.f24275g = 1;
            obj = dVar.b(this);
            if (obj == enumC2928a) {
                return enumC2928a;
            }
        }
        return obj;
    }
}
