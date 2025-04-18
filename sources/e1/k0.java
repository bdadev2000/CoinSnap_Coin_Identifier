package e1;

/* loaded from: classes4.dex */
public final class k0 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30299a;

    /* renamed from: b, reason: collision with root package name */
    public int f30300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.r f30301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g.r rVar, h0.g gVar) {
        super(gVar);
        this.f30301c = rVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30299a = obj;
        this.f30300b |= Integer.MIN_VALUE;
        return this.f30301c.emit(null, this);
    }
}
