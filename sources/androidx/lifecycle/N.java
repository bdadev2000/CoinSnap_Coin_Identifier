package androidx.lifecycle;

import Q7.AbstractC0255x;
import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes.dex */
public final class N extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f4855g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4856h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0505o f4857i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ EnumC0504n f4858j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F7.p f4859k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC0505o abstractC0505o, EnumC0504n enumC0504n, F7.p pVar, w7.f fVar) {
        super(2, fVar);
        this.f4857i = abstractC0505o;
        this.f4858j = enumC0504n;
        this.f4859k = pVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        N n2 = new N(this.f4857i, this.f4858j, this.f4859k, fVar);
        n2.f4856h = obj;
        return n2;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((N) c((InterfaceC0253v) obj, (w7.f) obj2)).i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f4855g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            InterfaceC0253v interfaceC0253v = (InterfaceC0253v) this.f4856h;
            X7.e eVar = Q7.F.f2529a;
            R7.c cVar = V7.o.f3533a.f2766h;
            M m = new M(this.f4857i, this.f4858j, interfaceC0253v, this.f4859k, null);
            this.f4855g = 1;
            if (AbstractC0255x.s(m, this, cVar) == enumC2928a) {
                return enumC2928a;
            }
        }
        return t7.y.f23029a;
    }
}
