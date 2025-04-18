package e1;

/* loaded from: classes.dex */
public final class b extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public d1.q f30232a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f30234c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, h0.g gVar) {
        super(gVar);
        this.f30234c = cVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30233b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f30234c.c(null, this);
    }
}
