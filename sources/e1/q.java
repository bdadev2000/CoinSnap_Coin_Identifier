package e1;

/* loaded from: classes2.dex */
public final class q extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30316a;

    /* renamed from: b, reason: collision with root package name */
    public int f30317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f30318c;
    public r d;

    /* renamed from: f, reason: collision with root package name */
    public i f30319f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, h0.g gVar) {
        super(gVar);
        this.f30318c = rVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30316a = obj;
        this.f30317b |= Integer.MIN_VALUE;
        return this.f30318c.collect(null, this);
    }
}
