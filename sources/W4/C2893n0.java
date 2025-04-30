package w4;

/* renamed from: w4.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2893n0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23925a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23926c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23927d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23928e;

    /* renamed from: f, reason: collision with root package name */
    public final r4.c f23929f;

    public C2893n0(String str, String str2, String str3, String str4, int i9, r4.c cVar) {
        if (str != null) {
            this.f23925a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.f23926c = str3;
                    if (str4 != null) {
                        this.f23927d = str4;
                        this.f23928e = i9;
                        this.f23929f = cVar;
                        return;
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2893n0)) {
            return false;
        }
        C2893n0 c2893n0 = (C2893n0) obj;
        if (this.f23925a.equals(c2893n0.f23925a) && this.b.equals(c2893n0.b) && this.f23926c.equals(c2893n0.f23926c) && this.f23927d.equals(c2893n0.f23927d) && this.f23928e == c2893n0.f23928e && this.f23929f.equals(c2893n0.f23929f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f23925a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23926c.hashCode()) * 1000003) ^ this.f23927d.hashCode()) * 1000003) ^ this.f23928e) * 1000003) ^ this.f23929f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f23925a + ", versionCode=" + this.b + ", versionName=" + this.f23926c + ", installUuid=" + this.f23927d + ", deliveryMechanism=" + this.f23928e + ", developmentPlatformProvider=" + this.f23929f + "}";
    }
}
