package i7;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19178b;

    /* renamed from: c, reason: collision with root package name */
    public final f7.d f19179c;

    public i(String str, byte[] bArr, f7.d dVar) {
        this.a = str;
        this.f19178b = bArr;
        this.f19179c = dVar;
    }

    public static h.c a() {
        h.c cVar = new h.c(21, 0);
        cVar.I(f7.d.DEFAULT);
        return cVar;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = this.a;
        objArr[1] = this.f19179c;
        byte[] bArr = this.f19178b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }

    public final i c(f7.d dVar) {
        h.c a = a();
        a.G(this.a);
        a.I(dVar);
        a.f18524d = this.f19178b;
        return a.o();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a.equals(iVar.a) && Arrays.equals(this.f19178b, iVar.f19178b) && this.f19179c.equals(iVar.f19179c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19178b)) * 1000003) ^ this.f19179c.hashCode();
    }
}
