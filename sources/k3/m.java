package k3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final h3.c f21440a;
    public final byte[] b;

    public m(h3.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.f21440a = cVar;
                this.b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f21440a.equals(mVar.f21440a)) {
            return false;
        }
        return Arrays.equals(this.b, mVar.b);
    }

    public final int hashCode() {
        return ((this.f21440a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f21440a + ", bytes=[...]}";
    }
}
