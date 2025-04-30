package c7;

/* renamed from: c7.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0617a0 {
    public static final Z Companion = new Z(null);
    private final String configExtension;
    private String signals;

    public C0617a0() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (G7.f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C0617a0 copy$default(C0617a0 c0617a0, String str, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = c0617a0.configExtension;
        }
        if ((i9 & 2) != 0) {
            str2 = c0617a0.signals;
        }
        return c0617a0.copy(str, str2);
    }

    public static final void write$Self(C0617a0 c0617a0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0617a0, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0617a0.configExtension != null) {
            bVar.u(gVar, 0, e8.k0.f20172a, c0617a0.configExtension);
        }
        if (bVar.o(gVar) || c0617a0.signals != null) {
            bVar.u(gVar, 1, e8.k0.f20172a, c0617a0.signals);
        }
    }

    public final String component1() {
        return this.configExtension;
    }

    public final String component2() {
        return this.signals;
    }

    public final C0617a0 copy(String str, String str2) {
        return new C0617a0(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0617a0)) {
            return false;
        }
        C0617a0 c0617a0 = (C0617a0) obj;
        if (G7.j.a(this.configExtension, c0617a0.configExtension) && G7.j.a(this.signals, c0617a0.signals)) {
            return true;
        }
        return false;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        int hashCode;
        String str = this.configExtension;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.signals;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    public final void setSignals(String str) {
        this.signals = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestExt(configExtension=");
        sb.append(this.configExtension);
        sb.append(", signals=");
        return com.applovin.impl.L.k(sb, this.signals, ')');
    }

    public /* synthetic */ C0617a0(int i9, String str, String str2, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i9 & 2) == 0) {
            this.signals = null;
        } else {
            this.signals = str2;
        }
    }

    public C0617a0(String str, String str2) {
        this.configExtension = str;
        this.signals = str2;
    }

    public /* synthetic */ C0617a0(String str, String str2, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getSignals$annotations() {
    }
}
