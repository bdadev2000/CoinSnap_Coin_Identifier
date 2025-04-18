package k;

/* loaded from: classes3.dex */
public final class k extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public l f30880a;

    /* renamed from: b, reason: collision with root package name */
    public i.m f30881b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30882c;
    public /* synthetic */ Object d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f30883f;

    /* renamed from: g, reason: collision with root package name */
    public int f30884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h0.g gVar) {
        super(gVar);
        this.f30883f = lVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f30884g |= Integer.MIN_VALUE;
        return this.f30883f.a(this);
    }
}
