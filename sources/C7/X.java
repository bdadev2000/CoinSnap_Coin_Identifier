package c7;

import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class X {
    public static final W Companion = new W(null);
    private final String consentMessageVersion;
    private final String consentSource;
    private final String consentStatus;
    private final long consentTimestamp;

    public /* synthetic */ X(int i9, String str, String str2, long j7, String str3, e8.g0 g0Var) {
        if (15 != (i9 & 15)) {
            e8.W.h(i9, 15, V.INSTANCE.getDescriptor());
            throw null;
        }
        this.consentStatus = str;
        this.consentSource = str2;
        this.consentTimestamp = j7;
        this.consentMessageVersion = str3;
    }

    public static /* synthetic */ X copy$default(X x9, String str, String str2, long j7, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = x9.consentStatus;
        }
        if ((i9 & 2) != 0) {
            str2 = x9.consentSource;
        }
        String str4 = str2;
        if ((i9 & 4) != 0) {
            j7 = x9.consentTimestamp;
        }
        long j9 = j7;
        if ((i9 & 8) != 0) {
            str3 = x9.consentMessageVersion;
        }
        return x9.copy(str, str4, j9, str3);
    }

    public static final void write$Self(X x9, d8.b bVar, c8.g gVar) {
        G7.j.e(x9, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.k(gVar, 0, x9.consentStatus);
        bVar.k(gVar, 1, x9.consentSource);
        bVar.z(gVar, 2, x9.consentTimestamp);
        bVar.k(gVar, 3, x9.consentMessageVersion);
    }

    public final String component1() {
        return this.consentStatus;
    }

    public final String component2() {
        return this.consentSource;
    }

    public final long component3() {
        return this.consentTimestamp;
    }

    public final String component4() {
        return this.consentMessageVersion;
    }

    public final X copy(String str, String str2, long j7, String str3) {
        G7.j.e(str, "consentStatus");
        G7.j.e(str2, "consentSource");
        G7.j.e(str3, "consentMessageVersion");
        return new X(str, str2, j7, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x9 = (X) obj;
        if (G7.j.a(this.consentStatus, x9.consentStatus) && G7.j.a(this.consentSource, x9.consentSource) && this.consentTimestamp == x9.consentTimestamp && G7.j.a(this.consentMessageVersion, x9.consentMessageVersion)) {
            return true;
        }
        return false;
    }

    public final String getConsentMessageVersion() {
        return this.consentMessageVersion;
    }

    public final String getConsentSource() {
        return this.consentSource;
    }

    public final String getConsentStatus() {
        return this.consentStatus;
    }

    public final long getConsentTimestamp() {
        return this.consentTimestamp;
    }

    public int hashCode() {
        return this.consentMessageVersion.hashCode() + ((Long.hashCode(this.consentTimestamp) + AbstractC2914a.b(this.consentStatus.hashCode() * 31, 31, this.consentSource)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GDPR(consentStatus=");
        sb.append(this.consentStatus);
        sb.append(", consentSource=");
        sb.append(this.consentSource);
        sb.append(", consentTimestamp=");
        sb.append(this.consentTimestamp);
        sb.append(", consentMessageVersion=");
        return com.applovin.impl.L.k(sb, this.consentMessageVersion, ')');
    }

    public X(String str, String str2, long j7, String str3) {
        G7.j.e(str, "consentStatus");
        G7.j.e(str2, "consentSource");
        G7.j.e(str3, "consentMessageVersion");
        this.consentStatus = str;
        this.consentSource = str2;
        this.consentTimestamp = j7;
        this.consentMessageVersion = str3;
    }

    public static /* synthetic */ void getConsentMessageVersion$annotations() {
    }

    public static /* synthetic */ void getConsentSource$annotations() {
    }

    public static /* synthetic */ void getConsentStatus$annotations() {
    }

    public static /* synthetic */ void getConsentTimestamp$annotations() {
    }
}
