package mb;

/* loaded from: classes3.dex */
public final class s1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22094b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22095c;

    public s1(String str, String str2, boolean z10) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.f22094b = str2;
                this.f22095c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (this.a.equals(s1Var.a) && this.f22094b.equals(s1Var.f22094b) && this.f22095c == s1Var.f22095c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f22094b.hashCode()) * 1000003;
        if (this.f22095c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OsData{osRelease=" + this.a + ", osCodeName=" + this.f22094b + ", isRooted=" + this.f22095c + "}";
    }
}
