package w4;

/* renamed from: w4.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2887k0 extends M0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23905a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23906c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23907d;

    public C2887k0(int i9, String str, String str2, boolean z8) {
        this.f23905a = i9;
        this.b = str;
        this.f23906c = str2;
        this.f23907d = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        if (this.f23905a == ((C2887k0) m02).f23905a) {
            C2887k0 c2887k0 = (C2887k0) m02;
            if (this.b.equals(c2887k0.b) && this.f23906c.equals(c2887k0.f23906c) && this.f23907d == c2887k0.f23907d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f23905a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23906c.hashCode()) * 1000003;
        if (this.f23907d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f23905a + ", version=" + this.b + ", buildVersion=" + this.f23906c + ", jailbroken=" + this.f23907d + "}";
    }
}
