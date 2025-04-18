package e1;

/* loaded from: classes.dex */
public final class h1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public i1 f30274a;

    /* renamed from: b, reason: collision with root package name */
    public i f30275b;

    /* renamed from: c, reason: collision with root package name */
    public j1 f30276c;
    public b1.h1 d;

    /* renamed from: f, reason: collision with root package name */
    public Object f30277f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f30278g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i1 f30279h;

    /* renamed from: i, reason: collision with root package name */
    public int f30280i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, h0.g gVar) {
        super(gVar);
        this.f30279h = i1Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30278g = obj;
        this.f30280i |= Integer.MIN_VALUE;
        return this.f30279h.collect(null, this);
    }
}
