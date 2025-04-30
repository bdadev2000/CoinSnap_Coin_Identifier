package j3;

/* loaded from: classes.dex */
public final class w extends J {

    /* renamed from: a, reason: collision with root package name */
    public final I f21100a;
    public final H b;

    public w(I i9, H h6) {
        this.f21100a = i9;
        this.b = h6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j7 = (J) obj;
        I i9 = this.f21100a;
        if (i9 != null ? i9.equals(((w) j7).f21100a) : ((w) j7).f21100a == null) {
            H h6 = this.b;
            if (h6 == null) {
                if (((w) j7).b == null) {
                    return true;
                }
            } else if (h6.equals(((w) j7).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        I i10 = this.f21100a;
        if (i10 == null) {
            hashCode = 0;
        } else {
            hashCode = i10.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        H h6 = this.b;
        if (h6 != null) {
            i9 = h6.hashCode();
        }
        return i9 ^ i11;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f21100a + ", mobileSubtype=" + this.b + "}";
    }
}
