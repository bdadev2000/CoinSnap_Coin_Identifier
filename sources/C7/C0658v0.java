package c7;

/* renamed from: c7.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0658v0 {
    public static final C0656u0 Companion = new C0656u0(null);
    private final String adsEndpoint;
    private final String errorLogsEndpoint;
    private final String metricsEndpoint;
    private final String mraidEndpoint;
    private final String riEndpoint;

    public C0658v0() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (G7.f) null);
    }

    public static /* synthetic */ C0658v0 copy$default(C0658v0 c0658v0, String str, String str2, String str3, String str4, String str5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = c0658v0.adsEndpoint;
        }
        if ((i9 & 2) != 0) {
            str2 = c0658v0.riEndpoint;
        }
        String str6 = str2;
        if ((i9 & 4) != 0) {
            str3 = c0658v0.mraidEndpoint;
        }
        String str7 = str3;
        if ((i9 & 8) != 0) {
            str4 = c0658v0.metricsEndpoint;
        }
        String str8 = str4;
        if ((i9 & 16) != 0) {
            str5 = c0658v0.errorLogsEndpoint;
        }
        return c0658v0.copy(str, str6, str7, str8, str5);
    }

    public static final void write$Self(C0658v0 c0658v0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0658v0, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || c0658v0.adsEndpoint != null) {
            bVar.u(gVar, 0, e8.k0.f20172a, c0658v0.adsEndpoint);
        }
        if (bVar.o(gVar) || c0658v0.riEndpoint != null) {
            bVar.u(gVar, 1, e8.k0.f20172a, c0658v0.riEndpoint);
        }
        if (bVar.o(gVar) || c0658v0.mraidEndpoint != null) {
            bVar.u(gVar, 2, e8.k0.f20172a, c0658v0.mraidEndpoint);
        }
        if (bVar.o(gVar) || c0658v0.metricsEndpoint != null) {
            bVar.u(gVar, 3, e8.k0.f20172a, c0658v0.metricsEndpoint);
        }
        if (bVar.o(gVar) || c0658v0.errorLogsEndpoint != null) {
            bVar.u(gVar, 4, e8.k0.f20172a, c0658v0.errorLogsEndpoint);
        }
    }

    public final String component1() {
        return this.adsEndpoint;
    }

    public final String component2() {
        return this.riEndpoint;
    }

    public final String component3() {
        return this.mraidEndpoint;
    }

    public final String component4() {
        return this.metricsEndpoint;
    }

    public final String component5() {
        return this.errorLogsEndpoint;
    }

    public final C0658v0 copy(String str, String str2, String str3, String str4, String str5) {
        return new C0658v0(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0658v0)) {
            return false;
        }
        C0658v0 c0658v0 = (C0658v0) obj;
        if (G7.j.a(this.adsEndpoint, c0658v0.adsEndpoint) && G7.j.a(this.riEndpoint, c0658v0.riEndpoint) && G7.j.a(this.mraidEndpoint, c0658v0.mraidEndpoint) && G7.j.a(this.metricsEndpoint, c0658v0.metricsEndpoint) && G7.j.a(this.errorLogsEndpoint, c0658v0.errorLogsEndpoint)) {
            return true;
        }
        return false;
    }

    public final String getAdsEndpoint() {
        return this.adsEndpoint;
    }

    public final String getErrorLogsEndpoint() {
        return this.errorLogsEndpoint;
    }

    public final String getMetricsEndpoint() {
        return this.metricsEndpoint;
    }

    public final String getMraidEndpoint() {
        return this.mraidEndpoint;
    }

    public final String getRiEndpoint() {
        return this.riEndpoint;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.adsEndpoint;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.riEndpoint;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.mraidEndpoint;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.metricsEndpoint;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.errorLogsEndpoint;
        if (str5 != null) {
            i9 = str5.hashCode();
        }
        return i13 + i9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Endpoints(adsEndpoint=");
        sb.append(this.adsEndpoint);
        sb.append(", riEndpoint=");
        sb.append(this.riEndpoint);
        sb.append(", mraidEndpoint=");
        sb.append(this.mraidEndpoint);
        sb.append(", metricsEndpoint=");
        sb.append(this.metricsEndpoint);
        sb.append(", errorLogsEndpoint=");
        return com.applovin.impl.L.k(sb, this.errorLogsEndpoint, ')');
    }

    public /* synthetic */ C0658v0(int i9, String str, String str2, String str3, String str4, String str5, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.adsEndpoint = null;
        } else {
            this.adsEndpoint = str;
        }
        if ((i9 & 2) == 0) {
            this.riEndpoint = null;
        } else {
            this.riEndpoint = str2;
        }
        if ((i9 & 4) == 0) {
            this.mraidEndpoint = null;
        } else {
            this.mraidEndpoint = str3;
        }
        if ((i9 & 8) == 0) {
            this.metricsEndpoint = null;
        } else {
            this.metricsEndpoint = str4;
        }
        if ((i9 & 16) == 0) {
            this.errorLogsEndpoint = null;
        } else {
            this.errorLogsEndpoint = str5;
        }
    }

    public C0658v0(String str, String str2, String str3, String str4, String str5) {
        this.adsEndpoint = str;
        this.riEndpoint = str2;
        this.mraidEndpoint = str3;
        this.metricsEndpoint = str4;
        this.errorLogsEndpoint = str5;
    }

    public /* synthetic */ C0658v0(String str, String str2, String str3, String str4, String str5, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? null : str3, (i9 & 8) != 0 ? null : str4, (i9 & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ void getAdsEndpoint$annotations() {
    }

    public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
    }

    public static /* synthetic */ void getMetricsEndpoint$annotations() {
    }

    public static /* synthetic */ void getMraidEndpoint$annotations() {
    }

    public static /* synthetic */ void getRiEndpoint$annotations() {
    }
}
