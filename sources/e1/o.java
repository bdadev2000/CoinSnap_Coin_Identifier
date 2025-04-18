package e1;

/* loaded from: classes2.dex */
public final class o extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30309a;

    /* renamed from: b, reason: collision with root package name */
    public int f30310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f30311c;
    public Object d;

    /* renamed from: f, reason: collision with root package name */
    public i f30312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, h0.g gVar) {
        super(gVar);
        this.f30311c = pVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30309a = obj;
        this.f30310b |= Integer.MIN_VALUE;
        return this.f30311c.collect(null, this);
    }
}
