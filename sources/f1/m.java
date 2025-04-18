package f1;

/* loaded from: classes2.dex */
public final class m extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30484a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f30486c;
    public final /* synthetic */ e1.i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, e1.i iVar, h0.g gVar) {
        super(2, gVar);
        this.f30486c = nVar;
        this.d = iVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        m mVar = new m(this.f30486c, this.d, gVar);
        mVar.f30485b = obj;
        return mVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((b1.d0) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30484a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            b1.d0 d0Var = (b1.d0) this.f30485b;
            ?? obj2 = new Object();
            n nVar = this.f30486c;
            e1.h hVar = nVar.d;
            l lVar = new l(obj2, d0Var, nVar, this.d);
            this.f30484a = 1;
            if (hVar.collect(lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return d0.b0.f30125a;
    }
}
