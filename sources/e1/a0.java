package e1;

/* loaded from: classes2.dex */
public final class a0 extends j0.i implements q0.q {

    /* renamed from: a, reason: collision with root package name */
    public int f30226a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ i f30227b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30228c;
    public final /* synthetic */ q0.p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q0.p pVar, h0.g gVar) {
        super(3, gVar);
        this.d = pVar;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a0 a0Var = new a0(this.d, (h0.g) obj3);
        a0Var.f30227b = (i) obj;
        a0Var.f30228c = obj2;
        return a0Var.invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30226a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            iVar = this.f30227b;
            Object obj2 = this.f30228c;
            this.f30227b = iVar;
            this.f30226a = 1;
            obj = this.d.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.jvm.internal.q.m(obj);
                return d0.b0.f30125a;
            }
            iVar = this.f30227b;
            kotlin.jvm.internal.q.m(obj);
        }
        this.f30227b = null;
        this.f30226a = 2;
        if (iVar.emit(obj, this) == aVar) {
            return aVar;
        }
        return d0.b0.f30125a;
    }
}
