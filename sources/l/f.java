package l;

/* loaded from: classes4.dex */
public final class f extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public i f30976a;

    /* renamed from: b, reason: collision with root package name */
    public l f30977b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30978c;
    public final /* synthetic */ i d;

    /* renamed from: f, reason: collision with root package name */
    public int f30979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, h0.g gVar) {
        super(gVar);
        this.d = iVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30978c = obj;
        this.f30979f |= Integer.MIN_VALUE;
        return this.d.d(null, this);
    }
}
