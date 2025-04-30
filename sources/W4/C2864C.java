package w4;

/* renamed from: w4.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2864C extends P0 {
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23696c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23697d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23698e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23699f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23700g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23701h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23702i;

    /* renamed from: j, reason: collision with root package name */
    public final String f23703j;

    /* renamed from: k, reason: collision with root package name */
    public final O0 f23704k;
    public final u0 l;
    public final r0 m;

    public C2864C(String str, String str2, int i9, String str3, String str4, String str5, String str6, String str7, String str8, O0 o02, u0 u0Var, r0 r0Var) {
        this.b = str;
        this.f23696c = str2;
        this.f23697d = i9;
        this.f23698e = str3;
        this.f23699f = str4;
        this.f23700g = str5;
        this.f23701h = str6;
        this.f23702i = str7;
        this.f23703j = str8;
        this.f23704k = o02;
        this.l = u0Var;
        this.m = r0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w4.B, java.lang.Object] */
    @Override // w4.P0
    public final C2863B a() {
        ?? obj = new Object();
        obj.f23686a = this.b;
        obj.b = this.f23696c;
        obj.f23687c = this.f23697d;
        obj.f23688d = this.f23698e;
        obj.f23689e = this.f23699f;
        obj.f23690f = this.f23700g;
        obj.f23691g = this.f23701h;
        obj.f23692h = this.f23702i;
        obj.f23693i = this.f23703j;
        obj.f23694j = this.f23704k;
        obj.f23695k = this.l;
        obj.l = this.m;
        obj.m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        if (this.b.equals(((C2864C) p02).b)) {
            C2864C c2864c = (C2864C) p02;
            if (this.f23696c.equals(c2864c.f23696c) && this.f23697d == c2864c.f23697d && this.f23698e.equals(c2864c.f23698e)) {
                String str = c2864c.f23699f;
                String str2 = this.f23699f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c2864c.f23700g;
                    String str4 = this.f23700g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = c2864c.f23701h;
                        String str6 = this.f23701h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.f23702i.equals(c2864c.f23702i) && this.f23703j.equals(c2864c.f23703j)) {
                                O0 o02 = c2864c.f23704k;
                                O0 o03 = this.f23704k;
                                if (o03 != null ? o03.equals(o02) : o02 == null) {
                                    u0 u0Var = c2864c.l;
                                    u0 u0Var2 = this.l;
                                    if (u0Var2 != null ? u0Var2.equals(u0Var) : u0Var == null) {
                                        r0 r0Var = c2864c.m;
                                        r0 r0Var2 = this.m;
                                        if (r0Var2 == null) {
                                            if (r0Var == null) {
                                                return true;
                                            }
                                        } else if (r0Var2.equals(r0Var)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.f23696c.hashCode()) * 1000003) ^ this.f23697d) * 1000003) ^ this.f23698e.hashCode()) * 1000003;
        int i9 = 0;
        String str = this.f23699f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f23700g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f23701h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.f23702i.hashCode()) * 1000003) ^ this.f23703j.hashCode()) * 1000003;
        O0 o02 = this.f23704k;
        if (o02 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = o02.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        u0 u0Var = this.l;
        if (u0Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = u0Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        r0 r0Var = this.m;
        if (r0Var != null) {
            i9 = r0Var.hashCode();
        }
        return i13 ^ i9;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.f23696c + ", platform=" + this.f23697d + ", installationUuid=" + this.f23698e + ", firebaseInstallationId=" + this.f23699f + ", firebaseAuthenticationToken=" + this.f23700g + ", appQualitySessionId=" + this.f23701h + ", buildVersion=" + this.f23702i + ", displayVersion=" + this.f23703j + ", session=" + this.f23704k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
