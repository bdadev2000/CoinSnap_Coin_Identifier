package U7;

import Q7.InterfaceC0253v;
import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class j extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f3368g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3369h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f3370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T7.c f3371j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(T7.c cVar, k kVar, w7.f fVar) {
        super(2, fVar);
        this.f3370i = kVar;
        this.f3371j = cVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        j jVar = new j(this.f3371j, this.f3370i, fVar);
        jVar.f3369h = obj;
        return jVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((j) c((InterfaceC0253v) obj, (w7.f) obj2)).i(y.f23029a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [G7.r, java.lang.Object] */
    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f3368g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            InterfaceC0253v interfaceC0253v = (InterfaceC0253v) this.f3369h;
            ?? obj2 = new Object();
            k kVar = this.f3370i;
            T7.b bVar = (T7.b) kVar.f3375g;
            i iVar = new i(obj2, interfaceC0253v, kVar, this.f3371j);
            this.f3368g = 1;
            if (bVar.k(iVar, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
