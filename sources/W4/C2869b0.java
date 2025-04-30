package w4;

/* renamed from: w4.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2869b0 extends E0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23827a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23828c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23829d;

    public C2869b0(String str, int i9, int i10, boolean z8) {
        this.f23827a = str;
        this.b = i9;
        this.f23828c = i10;
        this.f23829d = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.f23827a.equals(((C2869b0) e02).f23827a)) {
            C2869b0 c2869b0 = (C2869b0) e02;
            if (this.b == c2869b0.b && this.f23828c == c2869b0.f23828c && this.f23829d == c2869b0.f23829d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (((((this.f23827a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f23828c) * 1000003;
        if (this.f23829d) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f23827a + ", pid=" + this.b + ", importance=" + this.f23828c + ", defaultProcess=" + this.f23829d + "}";
    }
}
