package mb;

/* loaded from: classes3.dex */
public final class n0 extends a2 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22019b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22020c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22021d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22022e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22023f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22024g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22025h;

    /* renamed from: i, reason: collision with root package name */
    public final String f22026i;

    public n0(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.a = i10;
        this.f22019b = str;
        this.f22020c = i11;
        this.f22021d = j3;
        this.f22022e = j10;
        this.f22023f = z10;
        this.f22024g = i12;
        this.f22025h = str2;
        this.f22026i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        if (this.a == ((n0) a2Var).a) {
            n0 n0Var = (n0) a2Var;
            if (this.f22019b.equals(n0Var.f22019b) && this.f22020c == n0Var.f22020c && this.f22021d == n0Var.f22021d && this.f22022e == n0Var.f22022e && this.f22023f == n0Var.f22023f && this.f22024g == n0Var.f22024g && this.f22025h.equals(n0Var.f22025h) && this.f22026i.equals(n0Var.f22026i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.f22019b.hashCode()) * 1000003) ^ this.f22020c) * 1000003;
        long j3 = this.f22021d;
        int i11 = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.f22022e;
        int i12 = (i11 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f22023f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((i12 ^ i10) * 1000003) ^ this.f22024g) * 1000003) ^ this.f22025h.hashCode()) * 1000003) ^ this.f22026i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.a);
        sb2.append(", model=");
        sb2.append(this.f22019b);
        sb2.append(", cores=");
        sb2.append(this.f22020c);
        sb2.append(", ram=");
        sb2.append(this.f22021d);
        sb2.append(", diskSpace=");
        sb2.append(this.f22022e);
        sb2.append(", simulator=");
        sb2.append(this.f22023f);
        sb2.append(", state=");
        sb2.append(this.f22024g);
        sb2.append(", manufacturer=");
        sb2.append(this.f22025h);
        sb2.append(", modelClass=");
        return vd.e.h(sb2, this.f22026i, "}");
    }
}
