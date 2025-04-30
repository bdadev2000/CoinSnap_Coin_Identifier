package c7;

/* loaded from: classes3.dex */
public final class B0 {
    public static final A0 Companion = new A0(null);
    private final boolean enabled;

    public /* synthetic */ B0(int i9, boolean z8, e8.g0 g0Var) {
        if (1 == (i9 & 1)) {
            this.enabled = z8;
        } else {
            e8.W.h(i9, 1, C0666z0.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ B0 copy$default(B0 b02, boolean z8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = b02.enabled;
        }
        return b02.copy(z8);
    }

    public static final void write$Self(B0 b02, d8.b bVar, c8.g gVar) {
        G7.j.e(b02, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.v(gVar, 0, b02.enabled);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final B0 copy(boolean z8) {
        return new B0(z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof B0) && this.enabled == ((B0) obj).enabled) {
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
        return Q7.n0.n(new StringBuilder("LoadOptimizationSettings(enabled="), this.enabled, ')');
    }

    public B0(boolean z8) {
        this.enabled = z8;
    }
}
