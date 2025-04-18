package h;

/* loaded from: classes4.dex */
public final class d extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f30655a;

    /* renamed from: b, reason: collision with root package name */
    public i1.f f30656b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30657c;
    public final /* synthetic */ e d;

    /* renamed from: f, reason: collision with root package name */
    public int f30658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h0.g gVar) {
        super(gVar);
        this.d = eVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30657c = obj;
        this.f30658f |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
