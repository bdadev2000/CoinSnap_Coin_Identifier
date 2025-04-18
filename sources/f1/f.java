package f1;

/* loaded from: classes2.dex */
public final class f extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30465a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f30467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, h0.g gVar2) {
        super(2, gVar2);
        this.f30467c = gVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        f fVar = new f(this.f30467c, gVar);
        fVar.f30466b = obj;
        return fVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d1.q) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30465a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            d1.q qVar = (d1.q) this.f30466b;
            this.f30465a = 1;
            if (this.f30467c.c(qVar, this) == aVar) {
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
