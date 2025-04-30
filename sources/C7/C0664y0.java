package c7;

import x0.AbstractC2914a;

/* renamed from: c7.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0664y0 {
    public static final C0662x0 Companion = new C0662x0(null);
    private final String buttonAccept;
    private final String buttonDeny;
    private final String consentMessage;
    private final String consentMessageVersion;
    private final String consentTitle;
    private final boolean isCountryDataProtected;

    public /* synthetic */ C0664y0(int i9, boolean z8, String str, String str2, String str3, String str4, String str5, e8.g0 g0Var) {
        if (63 != (i9 & 63)) {
            e8.W.h(i9, 63, C0660w0.INSTANCE.getDescriptor());
            throw null;
        }
        this.isCountryDataProtected = z8;
        this.consentTitle = str;
        this.consentMessage = str2;
        this.consentMessageVersion = str3;
        this.buttonAccept = str4;
        this.buttonDeny = str5;
    }

    public static /* synthetic */ C0664y0 copy$default(C0664y0 c0664y0, boolean z8, String str, String str2, String str3, String str4, String str5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z8 = c0664y0.isCountryDataProtected;
        }
        if ((i9 & 2) != 0) {
            str = c0664y0.consentTitle;
        }
        String str6 = str;
        if ((i9 & 4) != 0) {
            str2 = c0664y0.consentMessage;
        }
        String str7 = str2;
        if ((i9 & 8) != 0) {
            str3 = c0664y0.consentMessageVersion;
        }
        String str8 = str3;
        if ((i9 & 16) != 0) {
            str4 = c0664y0.buttonAccept;
        }
        String str9 = str4;
        if ((i9 & 32) != 0) {
            str5 = c0664y0.buttonDeny;
        }
        return c0664y0.copy(z8, str6, str7, str8, str9, str5);
    }

    public static final void write$Self(C0664y0 c0664y0, d8.b bVar, c8.g gVar) {
        G7.j.e(c0664y0, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.v(gVar, 0, c0664y0.isCountryDataProtected);
        bVar.k(gVar, 1, c0664y0.consentTitle);
        bVar.k(gVar, 2, c0664y0.consentMessage);
        bVar.k(gVar, 3, c0664y0.consentMessageVersion);
        bVar.k(gVar, 4, c0664y0.buttonAccept);
        bVar.k(gVar, 5, c0664y0.buttonDeny);
    }

    public final boolean component1() {
        return this.isCountryDataProtected;
    }

    public final String component2() {
        return this.consentTitle;
    }

    public final String component3() {
        return this.consentMessage;
    }

    public final String component4() {
        return this.consentMessageVersion;
    }

    public final String component5() {
        return this.buttonAccept;
    }

    public final String component6() {
        return this.buttonDeny;
    }

    public final C0664y0 copy(boolean z8, String str, String str2, String str3, String str4, String str5) {
        G7.j.e(str, "consentTitle");
        G7.j.e(str2, "consentMessage");
        G7.j.e(str3, "consentMessageVersion");
        G7.j.e(str4, "buttonAccept");
        G7.j.e(str5, "buttonDeny");
        return new C0664y0(z8, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0664y0)) {
            return false;
        }
        C0664y0 c0664y0 = (C0664y0) obj;
        if (this.isCountryDataProtected == c0664y0.isCountryDataProtected && G7.j.a(this.consentTitle, c0664y0.consentTitle) && G7.j.a(this.consentMessage, c0664y0.consentMessage) && G7.j.a(this.consentMessageVersion, c0664y0.consentMessageVersion) && G7.j.a(this.buttonAccept, c0664y0.buttonAccept) && G7.j.a(this.buttonDeny, c0664y0.buttonDeny)) {
            return true;
        }
        return false;
    }

    public final String getButtonAccept() {
        return this.buttonAccept;
    }

    public final String getButtonDeny() {
        return this.buttonDeny;
    }

    public final String getConsentMessage() {
        return this.consentMessage;
    }

    public final String getConsentMessageVersion() {
        return this.consentMessageVersion;
    }

    public final String getConsentTitle() {
        return this.consentTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public int hashCode() {
        boolean z8 = this.isCountryDataProtected;
        ?? r02 = z8;
        if (z8) {
            r02 = 1;
        }
        return this.buttonDeny.hashCode() + AbstractC2914a.b(AbstractC2914a.b(AbstractC2914a.b(AbstractC2914a.b(r02 * 31, 31, this.consentTitle), 31, this.consentMessage), 31, this.consentMessageVersion), 31, this.buttonAccept);
    }

    public final boolean isCountryDataProtected() {
        return this.isCountryDataProtected;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GDPRSettings(isCountryDataProtected=");
        sb.append(this.isCountryDataProtected);
        sb.append(", consentTitle=");
        sb.append(this.consentTitle);
        sb.append(", consentMessage=");
        sb.append(this.consentMessage);
        sb.append(", consentMessageVersion=");
        sb.append(this.consentMessageVersion);
        sb.append(", buttonAccept=");
        sb.append(this.buttonAccept);
        sb.append(", buttonDeny=");
        return com.applovin.impl.L.k(sb, this.buttonDeny, ')');
    }

    public C0664y0(boolean z8, String str, String str2, String str3, String str4, String str5) {
        G7.j.e(str, "consentTitle");
        G7.j.e(str2, "consentMessage");
        G7.j.e(str3, "consentMessageVersion");
        G7.j.e(str4, "buttonAccept");
        G7.j.e(str5, "buttonDeny");
        this.isCountryDataProtected = z8;
        this.consentTitle = str;
        this.consentMessage = str2;
        this.consentMessageVersion = str3;
        this.buttonAccept = str4;
        this.buttonDeny = str5;
    }

    public static /* synthetic */ void getButtonAccept$annotations() {
    }

    public static /* synthetic */ void getButtonDeny$annotations() {
    }

    public static /* synthetic */ void getConsentMessage$annotations() {
    }

    public static /* synthetic */ void getConsentMessageVersion$annotations() {
    }

    public static /* synthetic */ void getConsentTitle$annotations() {
    }

    public static /* synthetic */ void isCountryDataProtected$annotations() {
    }
}
