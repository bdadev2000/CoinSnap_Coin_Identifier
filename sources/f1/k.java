package f1;

/* loaded from: classes2.dex */
public final class k extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public l f30477a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30478b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30479c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public int f30480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h0.g gVar) {
        super(gVar);
        this.d = lVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30479c = obj;
        this.f30480f |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
