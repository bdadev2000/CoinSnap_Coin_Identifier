package c7;

/* loaded from: classes3.dex */
public final class E0 {
    public static final D0 Companion = new D0(null);
    private final int errorLogLevel;
    private final boolean metricsEnabled;

    public /* synthetic */ E0(int i9, int i10, boolean z8, e8.g0 g0Var) {
        if (3 != (i9 & 3)) {
            e8.W.h(i9, 3, C0.INSTANCE.getDescriptor());
            throw null;
        }
        this.errorLogLevel = i10;
        this.metricsEnabled = z8;
    }

    public static /* synthetic */ E0 copy$default(E0 e02, int i9, boolean z8, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = e02.errorLogLevel;
        }
        if ((i10 & 2) != 0) {
            z8 = e02.metricsEnabled;
        }
        return e02.copy(i9, z8);
    }

    public static final void write$Self(E0 e02, d8.b bVar, c8.g gVar) {
        G7.j.e(e02, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.C(0, e02.errorLogLevel, gVar);
        bVar.v(gVar, 1, e02.metricsEnabled);
    }

    public final int component1() {
        return this.errorLogLevel;
    }

    public final boolean component2() {
        return this.metricsEnabled;
    }

    public final E0 copy(int i9, boolean z8) {
        return new E0(i9, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.errorLogLevel == e02.errorLogLevel && this.metricsEnabled == e02.metricsEnabled) {
            return true;
        }
        return false;
    }

    public final int getErrorLogLevel() {
        return this.errorLogLevel;
    }

    public final boolean getMetricsEnabled() {
        return this.metricsEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.errorLogLevel) * 31;
        boolean z8 = this.metricsEnabled;
        int i9 = z8;
        if (z8 != 0) {
            i9 = 1;
        }
        return hashCode + i9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LogMetricsSettings(errorLogLevel=");
        sb.append(this.errorLogLevel);
        sb.append(", metricsEnabled=");
        return Q7.n0.n(sb, this.metricsEnabled, ')');
    }

    public E0(int i9, boolean z8) {
        this.errorLogLevel = i9;
        this.metricsEnabled = z8;
    }

    public static /* synthetic */ void getErrorLogLevel$annotations() {
    }

    public static /* synthetic */ void getMetricsEnabled$annotations() {
    }
}
