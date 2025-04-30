package C6;

import F7.p;
import Q7.InterfaceC0253v;
import T7.o;
import T7.r;
import t7.AbstractC2712a;
import t7.y;
import u6.AbstractC2787c;
import w7.f;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class e extends AbstractC2960i implements p {

    /* renamed from: g, reason: collision with root package name */
    public int f578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC2787c f579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractC2787c abstractC2787c, f fVar) {
        super(2, fVar);
        this.f579h = abstractC2787c;
    }

    @Override // y7.AbstractC2952a
    public final f c(Object obj, f fVar) {
        return new e(this.f579h, fVar);
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        ((e) c((InterfaceC0253v) obj, (f) obj2)).i(y.f23029a);
        return EnumC2928a.b;
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f578g;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2712a.f(obj);
            throw new RuntimeException();
        }
        AbstractC2712a.f(obj);
        AbstractC2787c abstractC2787c = this.f579h;
        o ySensor = abstractC2787c.f23268q.getYSensor();
        c cVar = new c(abstractC2787c, 1);
        this.f578g = 1;
        ((r) ySensor).k(cVar, this);
        return enumC2928a;
    }
}
