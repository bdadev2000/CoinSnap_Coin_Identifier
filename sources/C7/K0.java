package c7;

/* loaded from: classes3.dex */
public final class K0 {
    public static final J0 Companion = new J0(null);
    private final boolean enabled;

    public /* synthetic */ K0(int i9, boolean z8, e8.g0 g0Var) {
        if (1 == (i9 & 1)) {
            this.enabled = z8;
        } else {
            e8.W.h(i9, 1, I0.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ K0 copy$default(K0 k02, boolean z8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = k02.enabled;
        }
        return k02.copy(z8);
    }

    public static final void write$Self(K0 k02, d8.b bVar, c8.g gVar) {
        G7.j.e(k02, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.v(gVar, 0, k02.enabled);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final K0 copy(boolean z8) {
        return new K0(z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof K0) && this.enabled == ((K0) obj).enabled) {
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
        return Q7.n0.n(new StringBuilder("ReportIncentivizedSettings(enabled="), this.enabled, ')');
    }

    public K0(boolean z8) {
        this.enabled = z8;
    }
}
