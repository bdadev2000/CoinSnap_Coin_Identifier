package mb;

/* loaded from: classes3.dex */
public final class p0 extends o2 {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22042b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f22043c;

    /* renamed from: d, reason: collision with root package name */
    public final j2 f22044d;

    /* renamed from: e, reason: collision with root package name */
    public final k2 f22045e;

    /* renamed from: f, reason: collision with root package name */
    public final n2 f22046f;

    public p0(long j3, String str, i2 i2Var, j2 j2Var, k2 k2Var, n2 n2Var) {
        this.a = j3;
        this.f22042b = str;
        this.f22043c = i2Var;
        this.f22044d = j2Var;
        this.f22045e = k2Var;
        this.f22046f = n2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        p0 p0Var = (p0) ((o2) obj);
        if (this.a == p0Var.a) {
            if (this.f22042b.equals(p0Var.f22042b) && this.f22043c.equals(p0Var.f22043c) && this.f22044d.equals(p0Var.f22044d)) {
                k2 k2Var = p0Var.f22045e;
                k2 k2Var2 = this.f22045e;
                if (k2Var2 != null ? k2Var2.equals(k2Var) : k2Var == null) {
                    n2 n2Var = p0Var.f22046f;
                    n2 n2Var2 = this.f22046f;
                    if (n2Var2 == null) {
                        if (n2Var == null) {
                            return true;
                        }
                    } else if (n2Var2.equals(n2Var)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j3 = this.a;
        int hashCode2 = (((((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f22042b.hashCode()) * 1000003) ^ this.f22043c.hashCode()) * 1000003) ^ this.f22044d.hashCode()) * 1000003;
        int i10 = 0;
        k2 k2Var = this.f22045e;
        if (k2Var == null) {
            hashCode = 0;
        } else {
            hashCode = k2Var.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        n2 n2Var = this.f22046f;
        if (n2Var != null) {
            i10 = n2Var.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.f22042b + ", app=" + this.f22043c + ", device=" + this.f22044d + ", log=" + this.f22045e + ", rollouts=" + this.f22046f + "}";
    }
}
