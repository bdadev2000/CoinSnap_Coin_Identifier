package k;

/* loaded from: classes3.dex */
public final class j extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f30878b;

    /* renamed from: c, reason: collision with root package name */
    public int f30879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, h0.g gVar) {
        super(gVar);
        this.f30878b = lVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30877a = obj;
        this.f30879c |= Integer.MIN_VALUE;
        return this.f30878b.b(null, this);
    }
}
