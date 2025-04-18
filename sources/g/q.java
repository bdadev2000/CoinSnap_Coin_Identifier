package g;

/* loaded from: classes3.dex */
public final class q extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30556a;

    /* renamed from: b, reason: collision with root package name */
    public int f30557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f30558c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, h0.g gVar) {
        super(gVar);
        this.f30558c = rVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30556a = obj;
        this.f30557b |= Integer.MIN_VALUE;
        return this.f30558c.emit(null, this);
    }
}
