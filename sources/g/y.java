package g;

/* loaded from: classes3.dex */
public final class y extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30582a;

    /* renamed from: b, reason: collision with root package name */
    public int f30583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f30584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r rVar, h0.g gVar) {
        super(gVar);
        this.f30584c = rVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30582a = obj;
        this.f30583b |= Integer.MIN_VALUE;
        return this.f30584c.emit(null, this);
    }
}
