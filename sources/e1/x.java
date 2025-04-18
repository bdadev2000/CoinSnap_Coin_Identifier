package e1;

/* loaded from: classes.dex */
public final class x implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f30363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.p f30364b;

    public x(f1.s sVar, q0.p pVar) {
        this.f30363a = sVar;
        this.f30364b = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.b0] */
    @Override // e1.h
    public final Object collect(i iVar, h0.g gVar) {
        Object collect = this.f30363a.collect(new z(new Object(), iVar, this.f30364b), gVar);
        return collect == i0.a.f30806a ? collect : d0.b0.f30125a;
    }
}
