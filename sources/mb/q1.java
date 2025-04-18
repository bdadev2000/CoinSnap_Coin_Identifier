package mb;

/* loaded from: classes3.dex */
public final class q1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22061b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22062c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22063d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22064e;

    /* renamed from: f, reason: collision with root package name */
    public final qa.a f22065f;

    public q1(String str, String str2, String str3, String str4, int i10, qa.a aVar) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.f22061b = str2;
                if (str3 != null) {
                    this.f22062c = str3;
                    if (str4 != null) {
                        this.f22063d = str4;
                        this.f22064e = i10;
                        if (aVar != null) {
                            this.f22065f = aVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
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
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        if (this.a.equals(q1Var.a) && this.f22061b.equals(q1Var.f22061b) && this.f22062c.equals(q1Var.f22062c) && this.f22063d.equals(q1Var.f22063d) && this.f22064e == q1Var.f22064e && this.f22065f.equals(q1Var.f22065f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f22061b.hashCode()) * 1000003) ^ this.f22062c.hashCode()) * 1000003) ^ this.f22063d.hashCode()) * 1000003) ^ this.f22064e) * 1000003) ^ this.f22065f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.a + ", versionCode=" + this.f22061b + ", versionName=" + this.f22062c + ", installUuid=" + this.f22063d + ", deliveryMechanism=" + this.f22064e + ", developmentPlatformProvider=" + this.f22065f + "}";
    }
}
