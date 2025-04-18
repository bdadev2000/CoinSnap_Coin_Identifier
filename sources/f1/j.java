package f1;

/* loaded from: classes2.dex */
public final class j extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30474a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f30475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.i f30476c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, e1.i iVar, Object obj, h0.g gVar) {
        super(2, gVar);
        this.f30475b = nVar;
        this.f30476c = iVar;
        this.d = obj;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new j(this.f30475b, this.f30476c, this.d, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((b1.d0) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30474a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            q0.q qVar = this.f30475b.f30487f;
            this.f30474a = 1;
            if (qVar.invoke(this.f30476c, this.d, this) == aVar) {
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
