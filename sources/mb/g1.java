package mb;

/* loaded from: classes3.dex */
public final class g1 extends j2 {
    public final Double a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21922b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21923c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21924d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21925e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21926f;

    public g1(Double d10, int i10, boolean z10, int i11, long j3, long j10) {
        this.a = d10;
        this.f21922b = i10;
        this.f21923c = z10;
        this.f21924d = i11;
        this.f21925e = j3;
        this.f21926f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        Double d10 = this.a;
        if (d10 != null ? d10.equals(((g1) j2Var).a) : ((g1) j2Var).a == null) {
            if (this.f21922b == ((g1) j2Var).f21922b) {
                g1 g1Var = (g1) j2Var;
                if (this.f21923c == g1Var.f21923c && this.f21924d == g1Var.f21924d && this.f21925e == g1Var.f21925e && this.f21926f == g1Var.f21926f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        Double d10 = this.a;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f21922b) * 1000003;
        if (this.f21923c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (((i11 ^ i10) * 1000003) ^ this.f21924d) * 1000003;
        long j3 = this.f21925e;
        long j10 = this.f21926f;
        return ((i12 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f21922b);
        sb2.append(", proximityOn=");
        sb2.append(this.f21923c);
        sb2.append(", orientation=");
        sb2.append(this.f21924d);
        sb2.append(", ramUsed=");
        sb2.append(this.f21925e);
        sb2.append(", diskUsed=");
        return a4.j.j(sb2, this.f21926f, "}");
    }
}
