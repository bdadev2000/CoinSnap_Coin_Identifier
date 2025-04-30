package p5;

import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* renamed from: p5.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2570v extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f22365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C2549D f22366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2570v(C2549D c2549d, w7.f fVar) {
        super(2, fVar);
        this.f22366h = c2549d;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        return new C2570v(this.f22366h, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((C2570v) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f22365g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            C2549D c2549d = this.f22366h;
            k8.c cVar = c2549d.f22257d;
            T7.m mVar = new T7.m(c2549d, 2);
            this.f22365g = 1;
            if (cVar.k(mVar, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return t7.y.f23029a;
    }
}
