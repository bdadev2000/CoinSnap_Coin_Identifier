package mb;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class h0 extends w1 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f21927b;

    public h0(String str, byte[] bArr) {
        this.a = str;
        this.f21927b = bArr;
    }

    public final boolean equals(Object obj) {
        h0 h0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        if (this.a.equals(((h0) w1Var).a)) {
            if (w1Var instanceof h0) {
                h0Var = (h0) w1Var;
            } else {
                h0Var = (h0) w1Var;
            }
            if (Arrays.equals(this.f21927b, h0Var.f21927b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f21927b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.f21927b) + "}";
    }
}
