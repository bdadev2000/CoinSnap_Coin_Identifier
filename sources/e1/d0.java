package e1;

/* loaded from: classes.dex */
public final class d0 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public e0 f30245a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30246b;

    /* renamed from: c, reason: collision with root package name */
    public int f30247c;
    public final /* synthetic */ e0 d;

    /* renamed from: f, reason: collision with root package name */
    public Object f30248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, h0.g gVar) {
        super(gVar);
        this.d = e0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30246b = obj;
        this.f30247c |= Integer.MIN_VALUE;
        return this.d.emit(null, this);
    }
}
