package w4;

/* renamed from: w4.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2873d0 extends G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f23848a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23849c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23850d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23851e;

    /* renamed from: f, reason: collision with root package name */
    public final long f23852f;

    public C2873d0(Double d2, int i9, boolean z8, int i10, long j7, long j9) {
        this.f23848a = d2;
        this.b = i9;
        this.f23849c = z8;
        this.f23850d = i10;
        this.f23851e = j7;
        this.f23852f = j9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        Double d2 = this.f23848a;
        if (d2 != null ? d2.equals(((C2873d0) g02).f23848a) : ((C2873d0) g02).f23848a == null) {
            if (this.b == ((C2873d0) g02).b) {
                C2873d0 c2873d0 = (C2873d0) g02;
                if (this.f23849c == c2873d0.f23849c && this.f23850d == c2873d0.f23850d && this.f23851e == c2873d0.f23851e && this.f23852f == c2873d0.f23852f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9;
        Double d2 = this.f23848a;
        if (d2 == null) {
            hashCode = 0;
        } else {
            hashCode = d2.hashCode();
        }
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (this.f23849c) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i11 = (((i10 ^ i9) * 1000003) ^ this.f23850d) * 1000003;
        long j7 = this.f23851e;
        long j9 = this.f23852f;
        return ((i11 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f23848a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.f23849c);
        sb.append(", orientation=");
        sb.append(this.f23850d);
        sb.append(", ramUsed=");
        sb.append(this.f23851e);
        sb.append(", diskUsed=");
        return Q7.n0.k(sb, this.f23852f, "}");
    }
}
