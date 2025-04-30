package c7;

/* renamed from: c7.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0655u {
    public static final C0653t Companion = new C0653t(null);
    private final C0661x om;

    public C0655u() {
        this((C0661x) null, 1, (G7.f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C0655u copy$default(C0655u c0655u, C0661x c0661x, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            c0661x = c0655u.om;
        }
        return c0655u.copy(c0661x);
    }

    public static final void write$Self(C0655u c0655u, d8.b bVar, c8.g gVar) {
        G7.j.e(c0655u, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0655u.om != null) {
            bVar.u(gVar, 0, C0657v.INSTANCE, c0655u.om);
        }
    }

    public final C0661x component1() {
        return this.om;
    }

    public final C0655u copy(C0661x c0661x) {
        return new C0655u(c0661x);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0655u) && G7.j.a(this.om, ((C0655u) obj).om)) {
            return true;
        }
        return false;
    }

    public final C0661x getOm() {
        return this.om;
    }

    public int hashCode() {
        C0661x c0661x = this.om;
        if (c0661x == null) {
            return 0;
        }
        return c0661x.hashCode();
    }

    public String toString() {
        return "Viewability(om=" + this.om + ')';
    }

    public /* synthetic */ C0655u(int i9, C0661x c0661x, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.om = null;
        } else {
            this.om = c0661x;
        }
    }

    public C0655u(C0661x c0661x) {
        this.om = c0661x;
    }

    public /* synthetic */ C0655u(C0661x c0661x, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : c0661x);
    }
}
