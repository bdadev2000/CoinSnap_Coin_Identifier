package h;

/* loaded from: classes.dex */
public final class y extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f30707a;

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.b0 f30708b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30709c;
    public final /* synthetic */ c0 d;

    /* renamed from: f, reason: collision with root package name */
    public int f30710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, h0.g gVar) {
        super(gVar);
        this.d = c0Var;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f30709c = obj;
        this.f30710f |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
