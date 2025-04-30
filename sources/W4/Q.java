package w4;

/* loaded from: classes2.dex */
public final class Q extends L0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f23776a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final F0 f23777c;

    /* renamed from: d, reason: collision with root package name */
    public final G0 f23778d;

    /* renamed from: e, reason: collision with root package name */
    public final H0 f23779e;

    /* renamed from: f, reason: collision with root package name */
    public final K0 f23780f;

    public Q(long j7, String str, F0 f0, G0 g02, H0 h02, K0 k02) {
        this.f23776a = j7;
        this.b = str;
        this.f23777c = f0;
        this.f23778d = g02;
        this.f23779e = h02;
        this.f23780f = k02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w4.P, java.lang.Object] */
    public final P a() {
        ?? obj = new Object();
        obj.f23769a = this.f23776a;
        obj.b = this.b;
        obj.f23770c = this.f23777c;
        obj.f23771d = this.f23778d;
        obj.f23772e = this.f23779e;
        obj.f23773f = this.f23780f;
        obj.f23774g = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (this.f23776a == ((Q) l02).f23776a) {
            Q q9 = (Q) l02;
            if (this.b.equals(q9.b) && this.f23777c.equals(q9.f23777c) && this.f23778d.equals(q9.f23778d)) {
                H0 h02 = q9.f23779e;
                H0 h03 = this.f23779e;
                if (h03 != null ? h03.equals(h02) : h02 == null) {
                    K0 k02 = q9.f23780f;
                    K0 k03 = this.f23780f;
                    if (k03 == null) {
                        if (k02 == null) {
                            return true;
                        }
                    } else if (k03.equals(k02)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f23776a;
        int hashCode2 = (((((((((int) ((j7 >>> 32) ^ j7)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f23777c.hashCode()) * 1000003) ^ this.f23778d.hashCode()) * 1000003;
        int i9 = 0;
        H0 h02 = this.f23779e;
        if (h02 == null) {
            hashCode = 0;
        } else {
            hashCode = h02.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        K0 k02 = this.f23780f;
        if (k02 != null) {
            i9 = k02.hashCode();
        }
        return i10 ^ i9;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f23776a + ", type=" + this.b + ", app=" + this.f23777c + ", device=" + this.f23778d + ", log=" + this.f23779e + ", rollouts=" + this.f23780f + "}";
    }
}
