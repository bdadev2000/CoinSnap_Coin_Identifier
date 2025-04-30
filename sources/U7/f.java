package U7;

import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class f extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f3353g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3354h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f3355i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, w7.f fVar) {
        super(2, fVar);
        this.f3355i = kVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        f fVar2 = new f(this.f3355i, fVar);
        fVar2.f3354h = obj;
        return fVar2;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((f) c((T7.c) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f3353g;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            T7.c cVar = (T7.c) this.f3354h;
            this.f3353g = 1;
            if (this.f3355i.t(cVar, this) == enumC2928a) {
                return enumC2928a;
            }
        }
        return y.f23029a;
    }
}
