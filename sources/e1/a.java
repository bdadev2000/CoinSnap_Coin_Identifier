package e1;

/* loaded from: classes.dex */
public final class a extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public f1.w f30223a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f30225c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, h0.g gVar) {
        super(gVar);
        this.f30225c = jVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30224b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f30225c.collect(null, this);
    }
}
