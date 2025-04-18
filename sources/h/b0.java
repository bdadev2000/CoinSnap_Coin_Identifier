package h;

/* loaded from: classes2.dex */
public final class b0 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f30648b;

    /* renamed from: c, reason: collision with root package name */
    public int f30649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, h0.g gVar) {
        super(gVar);
        this.f30648b = c0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30647a = obj;
        this.f30649c |= Integer.MIN_VALUE;
        return this.f30648b.c(null, this);
    }
}
