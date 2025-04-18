package e1;

/* loaded from: classes2.dex */
public final class t extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public u f30342a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f30344c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, h0.g gVar) {
        super(gVar);
        this.f30344c = uVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30343b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f30344c.emit(null, this);
    }
}
