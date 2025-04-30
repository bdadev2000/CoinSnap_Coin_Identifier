package c7;

/* loaded from: classes3.dex */
public final class T0 {
    public static final S0 Companion = new S0(null);
    private final boolean om;

    public /* synthetic */ T0(int i9, boolean z8, e8.g0 g0Var) {
        if (1 == (i9 & 1)) {
            this.om = z8;
        } else {
            e8.W.h(i9, 1, R0.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ T0 copy$default(T0 t02, boolean z8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = t02.om;
        }
        return t02.copy(z8);
    }

    public static final void write$Self(T0 t02, d8.b bVar, c8.g gVar) {
        G7.j.e(t02, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.v(gVar, 0, t02.om);
    }

    public final boolean component1() {
        return this.om;
    }

    public final T0 copy(boolean z8) {
        return new T0(z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof T0) && this.om == ((T0) obj).om) {
            return true;
        }
        return false;
    }

    public final boolean getOm() {
        return this.om;
    }

    public int hashCode() {
        boolean z8 = this.om;
        if (z8) {
            return 1;
        }
        return z8 ? 1 : 0;
    }

    public String toString() {
        return Q7.n0.n(new StringBuilder("ViewabilitySettings(om="), this.om, ')');
    }

    public T0(boolean z8) {
        this.om = z8;
    }
}
