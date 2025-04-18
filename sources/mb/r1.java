package mb;

/* loaded from: classes3.dex */
public final class r1 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22076b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22077c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22078d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22079e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22080f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22081g;

    /* renamed from: h, reason: collision with root package name */
    public final String f22082h;

    /* renamed from: i, reason: collision with root package name */
    public final String f22083i;

    public r1(int i10, String str, int i11, long j3, long j10, boolean z10, int i12, String str2, String str3) {
        this.a = i10;
        if (str != null) {
            this.f22076b = str;
            this.f22077c = i11;
            this.f22078d = j3;
            this.f22079e = j10;
            this.f22080f = z10;
            this.f22081g = i12;
            if (str2 != null) {
                this.f22082h = str2;
                if (str3 != null) {
                    this.f22083i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        if (this.a == r1Var.a && this.f22076b.equals(r1Var.f22076b) && this.f22077c == r1Var.f22077c && this.f22078d == r1Var.f22078d && this.f22079e == r1Var.f22079e && this.f22080f == r1Var.f22080f && this.f22081g == r1Var.f22081g && this.f22082h.equals(r1Var.f22082h) && this.f22083i.equals(r1Var.f22083i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.f22076b.hashCode()) * 1000003) ^ this.f22077c) * 1000003;
        long j3 = this.f22078d;
        int i11 = (hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.f22079e;
        int i12 = (i11 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        if (this.f22080f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((i12 ^ i10) * 1000003) ^ this.f22081g) * 1000003) ^ this.f22082h.hashCode()) * 1000003) ^ this.f22083i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.a);
        sb2.append(", model=");
        sb2.append(this.f22076b);
        sb2.append(", availableProcessors=");
        sb2.append(this.f22077c);
        sb2.append(", totalRam=");
        sb2.append(this.f22078d);
        sb2.append(", diskSpace=");
        sb2.append(this.f22079e);
        sb2.append(", isEmulator=");
        sb2.append(this.f22080f);
        sb2.append(", state=");
        sb2.append(this.f22081g);
        sb2.append(", manufacturer=");
        sb2.append(this.f22082h);
        sb2.append(", modelClass=");
        return vd.e.h(sb2, this.f22083i, "}");
    }
}
