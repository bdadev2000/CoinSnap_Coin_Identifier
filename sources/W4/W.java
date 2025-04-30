package w4;

/* loaded from: classes2.dex */
public final class W extends A0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23798a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23799c;

    public W(String str, String str2, long j7) {
        this.f23798a = str;
        this.b = str2;
        this.f23799c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        if (this.f23798a.equals(((W) a02).f23798a)) {
            W w2 = (W) a02;
            if (this.b.equals(w2.b) && this.f23799c == w2.f23799c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f23798a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j7 = this.f23799c;
        return hashCode ^ ((int) ((j7 >>> 32) ^ j7));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f23798a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return Q7.n0.k(sb, this.f23799c, "}");
    }
}
