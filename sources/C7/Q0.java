package c7;

/* loaded from: classes3.dex */
public final class Q0 {
    public static final P0 Companion = new P0(null);
    private final boolean heartbeatEnabled;

    public /* synthetic */ Q0(int i9, boolean z8, e8.g0 g0Var) {
        if (1 == (i9 & 1)) {
            this.heartbeatEnabled = z8;
        } else {
            e8.W.h(i9, 1, O0.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ Q0 copy$default(Q0 q02, boolean z8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = q02.heartbeatEnabled;
        }
        return q02.copy(z8);
    }

    public static final void write$Self(Q0 q02, d8.b bVar, c8.g gVar) {
        G7.j.e(q02, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.v(gVar, 0, q02.heartbeatEnabled);
    }

    public final boolean component1() {
        return this.heartbeatEnabled;
    }

    public final Q0 copy(boolean z8) {
        return new Q0(z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Q0) && this.heartbeatEnabled == ((Q0) obj).heartbeatEnabled) {
            return true;
        }
        return false;
    }

    public final boolean getHeartbeatEnabled() {
        return this.heartbeatEnabled;
    }

    public int hashCode() {
        boolean z8 = this.heartbeatEnabled;
        if (z8) {
            return 1;
        }
        return z8 ? 1 : 0;
    }

    public String toString() {
        return Q7.n0.n(new StringBuilder("Template(heartbeatEnabled="), this.heartbeatEnabled, ')');
    }

    public Q0(boolean z8) {
        this.heartbeatEnabled = z8;
    }

    public static /* synthetic */ void getHeartbeatEnabled$annotations() {
    }
}
