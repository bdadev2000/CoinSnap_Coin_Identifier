package c7;

/* loaded from: classes3.dex */
public final class H0 {
    public static final G0 Companion = new G0(null);
    private final boolean enabled;

    public H0() {
        this(false, 1, (G7.f) null);
    }

    public static /* synthetic */ H0 copy$default(H0 h02, boolean z8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = h02.enabled;
        }
        return h02.copy(z8);
    }

    public static final void write$Self(H0 h02, d8.b bVar, c8.g gVar) {
        G7.j.e(h02, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || h02.enabled) {
            bVar.v(gVar, 0, h02.enabled);
        }
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final H0 copy(boolean z8) {
        return new H0(z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof H0) && this.enabled == ((H0) obj).enabled) {
            return true;
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        boolean z8 = this.enabled;
        if (z8) {
            return 1;
        }
        return z8 ? 1 : 0;
    }

    public String toString() {
        return Q7.n0.n(new StringBuilder("LoggingSettings(enabled="), this.enabled, ')');
    }

    public /* synthetic */ H0(int i9, boolean z8, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z8;
        }
    }

    public H0(boolean z8) {
        this.enabled = z8;
    }

    public /* synthetic */ H0(boolean z8, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? false : z8);
    }
}
