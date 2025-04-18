package f1;

/* loaded from: classes2.dex */
public final class e extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30462a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.i f30464c;
    public final /* synthetic */ g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h0.g gVar, e1.i iVar, g gVar2) {
        super(2, gVar);
        this.f30464c = iVar;
        this.d = gVar2;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        e eVar = new e(gVar, this.f30464c, this.d);
        eVar.f30463b = obj;
        return eVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b1.d0) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30462a;
        d0.b0 b0Var = d0.b0.f30125a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            d1.r f2 = this.d.f((b1.d0) this.f30463b);
            this.f30462a = 1;
            Object N = p0.a.N(this.f30464c, f2, true, this);
            if (N != aVar) {
                N = b0Var;
            }
            if (N == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0Var;
    }
}
