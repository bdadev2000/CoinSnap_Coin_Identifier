package l;

/* loaded from: classes4.dex */
public final class k extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public l f31001a;

    /* renamed from: b, reason: collision with root package name */
    public j f31002b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f31003c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public int f31004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h0.g gVar) {
        super(gVar);
        this.d = lVar;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f31003c = obj;
        this.f31004f |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
