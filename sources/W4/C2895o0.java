package w4;

import x0.AbstractC2914a;

/* renamed from: w4.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2895o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23933a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23934c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23935d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23936e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23937f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23938g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23939h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23940i;

    public C2895o0(int i9, String str, int i10, long j7, long j9, boolean z8, int i11, String str2, String str3) {
        this.f23933a = i9;
        if (str != null) {
            this.b = str;
            this.f23934c = i10;
            this.f23935d = j7;
            this.f23936e = j9;
            this.f23937f = z8;
            this.f23938g = i11;
            if (str2 != null) {
                this.f23939h = str2;
                if (str3 != null) {
                    this.f23940i = str3;
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
        if (!(obj instanceof C2895o0)) {
            return false;
        }
        C2895o0 c2895o0 = (C2895o0) obj;
        if (this.f23933a == c2895o0.f23933a && this.b.equals(c2895o0.b) && this.f23934c == c2895o0.f23934c && this.f23935d == c2895o0.f23935d && this.f23936e == c2895o0.f23936e && this.f23937f == c2895o0.f23937f && this.f23938g == c2895o0.f23938g && this.f23939h.equals(c2895o0.f23939h) && this.f23940i.equals(c2895o0.f23940i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f23933a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23934c) * 1000003;
        long j7 = this.f23935d;
        int i10 = (hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j9 = this.f23936e;
        int i11 = (i10 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        if (this.f23937f) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return ((((((i11 ^ i9) * 1000003) ^ this.f23938g) * 1000003) ^ this.f23939h.hashCode()) * 1000003) ^ this.f23940i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f23933a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", availableProcessors=");
        sb.append(this.f23934c);
        sb.append(", totalRam=");
        sb.append(this.f23935d);
        sb.append(", diskSpace=");
        sb.append(this.f23936e);
        sb.append(", isEmulator=");
        sb.append(this.f23937f);
        sb.append(", state=");
        sb.append(this.f23938g);
        sb.append(", manufacturer=");
        sb.append(this.f23939h);
        sb.append(", modelClass=");
        return AbstractC2914a.h(sb, this.f23940i, "}");
    }
}
