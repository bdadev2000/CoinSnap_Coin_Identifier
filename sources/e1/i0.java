package e1;

/* loaded from: classes.dex */
public final class i0 extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30281a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30282b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f30283c;
    public final /* synthetic */ l0 d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30284f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h hVar, l0 l0Var, Object obj, h0.g gVar) {
        super(2, gVar);
        this.f30283c = hVar;
        this.d = l0Var;
        this.f30284f = obj;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        i0 i0Var = new i0(this.f30283c, this.d, this.f30284f, gVar);
        i0Var.f30282b = obj;
        return i0Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((v0) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30281a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            int ordinal = ((v0) this.f30282b).ordinal();
            l0 l0Var = this.d;
            if (ordinal == 0) {
                this.f30281a = 1;
                if (this.f30283c.collect(l0Var, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal == 2) {
                android.support.v4.media.session.i iVar = t0.f30345a;
                Object obj2 = this.f30284f;
                if (obj2 == iVar) {
                    l0Var.n();
                } else {
                    l0Var.b(obj2);
                }
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
