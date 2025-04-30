package w4;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class O extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23761a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23762c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23763d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23764e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23765f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23766g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23767h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23768i;

    public O(int i9, String str, int i10, long j7, long j9, boolean z8, int i11, String str2, String str3) {
        this.f23761a = i9;
        this.b = str;
        this.f23762c = i10;
        this.f23763d = j7;
        this.f23764e = j9;
        this.f23765f = z8;
        this.f23766g = i11;
        this.f23767h = str2;
        this.f23768i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        if (this.f23761a == ((O) x0Var).f23761a) {
            O o3 = (O) x0Var;
            if (this.b.equals(o3.b) && this.f23762c == o3.f23762c && this.f23763d == o3.f23763d && this.f23764e == o3.f23764e && this.f23765f == o3.f23765f && this.f23766g == o3.f23766g && this.f23767h.equals(o3.f23767h) && this.f23768i.equals(o3.f23768i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f23761a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23762c) * 1000003;
        long j7 = this.f23763d;
        int i10 = (hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j9 = this.f23764e;
        int i11 = (i10 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f23765f) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return ((((((i11 ^ i9) * 1000003) ^ this.f23766g) * 1000003) ^ this.f23767h.hashCode()) * 1000003) ^ this.f23768i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f23761a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.f23762c);
        sb.append(", ram=");
        sb.append(this.f23763d);
        sb.append(", diskSpace=");
        sb.append(this.f23764e);
        sb.append(", simulator=");
        sb.append(this.f23765f);
        sb.append(", state=");
        sb.append(this.f23766g);
        sb.append(", manufacturer=");
        sb.append(this.f23767h);
        sb.append(", modelClass=");
        return AbstractC2914a.h(sb, this.f23768i, "}");
    }
}
