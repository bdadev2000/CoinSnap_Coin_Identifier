package w4;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class I extends t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23726a;
    public final byte[] b;

    public I(String str, byte[] bArr) {
        this.f23726a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        I i9;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f23726a.equals(((I) t0Var).f23726a)) {
            if (t0Var instanceof I) {
                i9 = (I) t0Var;
            } else {
                i9 = (I) t0Var;
            }
            if (Arrays.equals(this.b, i9.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23726a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.f23726a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
