package e1;

/* loaded from: classes2.dex */
public final class a1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f30229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f30230b;

    /* renamed from: c, reason: collision with root package name */
    public int f30231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, h0.g gVar) {
        super(gVar);
        this.f30230b = b1Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30229a = obj;
        this.f30231c |= Integer.MIN_VALUE;
        return this.f30230b.a(0, this);
    }
}
