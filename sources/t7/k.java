package T7;

import t7.AbstractC2712a;
import t7.y;
import x7.EnumC2928a;
import y7.AbstractC2960i;

/* loaded from: classes3.dex */
public final class k extends AbstractC2960i implements F7.q {

    /* renamed from: g, reason: collision with root package name */
    public int f3063g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ c f3064h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3065i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ F7.p f3066j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(F7.p pVar, w7.f fVar) {
        super(3, fVar);
        this.f3066j = pVar;
    }

    @Override // F7.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        k kVar = new k(this.f3066j, (w7.f) obj3);
        kVar.f3064h = (c) obj;
        kVar.f3065i = obj2;
        return kVar.i(y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        c cVar;
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f3063g;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    AbstractC2712a.f(obj);
                    return y.f23029a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = this.f3064h;
            AbstractC2712a.f(obj);
        } else {
            AbstractC2712a.f(obj);
            cVar = this.f3064h;
            Object obj2 = this.f3065i;
            this.f3064h = cVar;
            this.f3063g = 1;
            obj = this.f3066j.g(obj2, this);
            if (obj == enumC2928a) {
                return enumC2928a;
            }
        }
        this.f3064h = null;
        this.f3063g = 2;
        if (cVar.a(obj, this) == enumC2928a) {
            return enumC2928a;
        }
        return y.f23029a;
    }
}
