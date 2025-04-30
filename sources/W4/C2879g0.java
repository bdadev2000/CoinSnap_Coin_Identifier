package w4;

/* renamed from: w4.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2879g0 extends J0 {

    /* renamed from: a, reason: collision with root package name */
    public final I0 f23869a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23870c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23871d;

    public C2879g0(I0 i02, String str, String str2, long j7) {
        this.f23869a = i02;
        this.b = str;
        this.f23870c = str2;
        this.f23871d = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        if (this.f23869a.equals(((C2879g0) j02).f23869a)) {
            C2879g0 c2879g0 = (C2879g0) j02;
            if (this.b.equals(c2879g0.b) && this.f23870c.equals(c2879g0.f23870c) && this.f23871d == c2879g0.f23871d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.f23869a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23870c.hashCode()) * 1000003;
        long j7 = this.f23871d;
        return hashCode ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f23869a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.f23870c);
        sb.append(", templateVersion=");
        return Q7.n0.k(sb, this.f23871d, "}");
    }
}
