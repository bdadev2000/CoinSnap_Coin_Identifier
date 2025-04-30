package Q7;

/* loaded from: classes3.dex */
public final class Z extends C0238f {

    /* renamed from: k, reason: collision with root package name */
    public final d0 f2546k;

    public Z(w7.f fVar, C0245m c0245m) {
        super(1, fVar);
        this.f2546k = c0245m;
    }

    @Override // Q7.C0238f
    public final Throwable r(d0 d0Var) {
        Throwable b;
        Object F4 = this.f2546k.F();
        if ((F4 instanceof b0) && (b = ((b0) F4).b()) != null) {
            return b;
        }
        if (F4 instanceof C0247o) {
            return ((C0247o) F4).f2575a;
        }
        return d0Var.A();
    }

    @Override // Q7.C0238f
    public final String z() {
        return "AwaitContinuation";
    }
}
