package j7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a {
    public final Iterable a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19772b;

    public a(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.f19772b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a.equals(aVar.a) && Arrays.equals(this.f19772b, aVar.f19772b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19772b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.f19772b) + "}";
    }
}
