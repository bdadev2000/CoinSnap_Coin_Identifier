package w4;

import x0.AbstractC2914a;

/* renamed from: w4.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2881h0 extends I0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23873a;
    public final String b;

    public C2881h0(String str, String str2) {
        this.f23873a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        if (this.f23873a.equals(((C2881h0) i02).f23873a) && this.b.equals(((C2881h0) i02).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23873a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f23873a);
        sb.append(", variantId=");
        return AbstractC2914a.h(sb, this.b, "}");
    }
}
