package e1;

/* loaded from: classes4.dex */
public final class z0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30374a;

    @Override // e1.y0
    public final h a(f1.c0 c0Var) {
        switch (this.f30374a) {
            case 0:
                return new j();
            default:
                return new j(new c1(c0Var, null));
        }
    }

    public final String toString() {
        switch (this.f30374a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
