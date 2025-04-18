package e1;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f30266a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.l f30267b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.p f30268c;

    public g(h hVar, q0.p pVar) {
        m mVar = m.f30304a;
        this.f30266a = hVar;
        this.f30267b = mVar;
        this.f30268c = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // e1.h
    public final Object collect(i iVar, h0.g gVar) {
        ?? obj = new Object();
        obj.f30930a = f1.c.f30458b;
        Object collect = this.f30266a.collect(new f(this, obj, iVar), gVar);
        return collect == i0.a.f30806a ? collect : d0.b0.f30125a;
    }
}
