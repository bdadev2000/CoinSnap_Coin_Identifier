package i7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l {
    public final f7.c a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19186b;

    public l(f7.c cVar, byte[] bArr) {
        if (cVar != null) {
            if (bArr != null) {
                this.a = cVar;
                this.f19186b = bArr;
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.a.equals(lVar.a)) {
            return false;
        }
        return Arrays.equals(this.f19186b, lVar.f19186b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19186b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
