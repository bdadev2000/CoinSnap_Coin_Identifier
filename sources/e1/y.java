package e1;

/* loaded from: classes2.dex */
public final class y extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public z f30367a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30368b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30369c;
    public final /* synthetic */ z d;

    /* renamed from: f, reason: collision with root package name */
    public int f30370f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, h0.g gVar) {
        super(gVar);
        this.d = zVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30369c = obj;
        this.f30370f |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
