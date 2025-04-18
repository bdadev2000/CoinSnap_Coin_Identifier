package f1;

/* loaded from: classes2.dex */
public final class d0 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30459a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.i f30461c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e1.i iVar, h0.g gVar) {
        super(2, gVar);
        this.f30461c = iVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        d0 d0Var = new d0(this.f30461c, gVar);
        d0Var.f30460b = obj;
        return d0Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create(obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30459a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            Object obj2 = this.f30460b;
            this.f30459a = 1;
            if (this.f30461c.emit(obj2, this) == aVar) {
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
