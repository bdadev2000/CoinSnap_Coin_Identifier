package f1;

/* loaded from: classes2.dex */
public final class o extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.h f30489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f30490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(e1.h hVar, a0 a0Var, h0.g gVar) {
        super(2, gVar);
        this.f30489b = hVar;
        this.f30490c = a0Var;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new o(this.f30489b, this.f30490c, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((b1.d0) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30488a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            this.f30488a = 1;
            if (this.f30489b.collect(this.f30490c, this) == aVar) {
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
