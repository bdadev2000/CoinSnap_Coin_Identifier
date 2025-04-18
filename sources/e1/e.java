package e1;

/* loaded from: classes2.dex */
public final class e extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f30253b;

    /* renamed from: c, reason: collision with root package name */
    public int f30254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h0.g gVar) {
        super(gVar);
        this.f30253b = fVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30252a = obj;
        this.f30254c |= Integer.MIN_VALUE;
        return this.f30253b.emit(null, this);
    }
}
