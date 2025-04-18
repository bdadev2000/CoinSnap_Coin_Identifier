package e1;

/* loaded from: classes.dex */
public final class c1 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30240a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30241b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f30242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(g1 g1Var, h0.g gVar) {
        super(2, gVar);
        this.f30242c = g1Var;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        c1 c1Var = new c1(this.f30242c, gVar);
        c1Var.f30241b = obj;
        return c1Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        ((c1) create((i) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
        return i0.a.f30806a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30240a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            b1 b1Var = new b1(new Object(), (i) this.f30241b);
            this.f30240a = 1;
            if (this.f30242c.collect(b1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        throw new RuntimeException();
    }
}
