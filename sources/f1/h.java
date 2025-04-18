package f1;

/* loaded from: classes2.dex */
public final class h extends j0.i implements q0.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30471a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30472b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f30473c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, h0.g gVar) {
        super(2, gVar);
        this.f30473c = iVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        h hVar = new h(this.f30473c, gVar);
        hVar.f30472b = obj;
        return hVar;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((e1.i) obj, (h0.g) obj2)).invokeSuspend(d0.b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.f30471a;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            e1.i iVar = (e1.i) this.f30472b;
            this.f30471a = 1;
            if (this.f30473c.g(iVar, this) == aVar) {
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
