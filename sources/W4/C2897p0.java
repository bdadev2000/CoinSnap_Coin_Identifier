package w4;

/* renamed from: w4.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2897p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23944a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23945c;

    public C2897p0(String str, String str2, boolean z8) {
        if (str != null) {
            this.f23944a = str;
            if (str2 != null) {
                this.b = str2;
                this.f23945c = z8;
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
        if (!(obj instanceof C2897p0)) {
            return false;
        }
        C2897p0 c2897p0 = (C2897p0) obj;
        if (this.f23944a.equals(c2897p0.f23944a) && this.b.equals(c2897p0.b) && this.f23945c == c2897p0.f23945c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((this.f23944a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (this.f23945c) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f23944a + ", osCodeName=" + this.b + ", isRooted=" + this.f23945c + "}";
    }
}
