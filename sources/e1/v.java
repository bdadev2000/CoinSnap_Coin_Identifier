package e1;

/* loaded from: classes2.dex */
public final class v extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f30353b;

    /* renamed from: c, reason: collision with root package name */
    public int f30354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, h0.g gVar) {
        super(gVar);
        this.f30353b = wVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30352a = obj;
        this.f30354c |= Integer.MIN_VALUE;
        return this.f30353b.emit(null, this);
    }
}
