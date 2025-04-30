package U7;

import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class e extends AbstractC2960i implements F7.p {

    /* renamed from: g, reason: collision with root package name */
    public int f3350g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f3352i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, w7.f fVar) {
        super(2, fVar);
        this.f3352i = kVar;
    }

    @Override // y7.AbstractC2952a
    public final w7.f c(Object obj, w7.f fVar) {
        e eVar = new e(this.f3352i, fVar);
        eVar.f3351h = obj;
        return eVar;
    }

    @Override // F7.p
    public final Object g(Object obj, Object obj2) {
        return ((e) c((S7.p) obj, (w7.f) obj2)).i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f3350g;
        y yVar = y.f23029a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            S7.p pVar = (S7.p) this.f3351h;
            this.f3350g = 1;
            k kVar = this.f3352i;
            kVar.getClass();
            Object t9 = kVar.t(new v(pVar), this);
            if (t9 != enumC2928a) {
                t9 = yVar;
            }
            if (t9 == enumC2928a) {
                return enumC2928a;
            }
        }
        return yVar;
    }
}
