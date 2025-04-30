package k3;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f21433a;
    public final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.d f21434c;

    public j(String str, byte[] bArr, h3.d dVar) {
        this.f21433a = str;
        this.b = bArr;
        this.f21434c = dVar;
    }

    public static C.c a() {
        C.c cVar = new C.c(29, (char) 0);
        cVar.f349f = h3.d.b;
        return cVar;
    }

    public final j b(h3.d dVar) {
        C.c a6 = a();
        a6.A(this.f21433a);
        if (dVar != null) {
            a6.f349f = dVar;
            a6.f348d = this.b;
            return a6.l();
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f21433a.equals(jVar.f21433a) && Arrays.equals(this.b, jVar.b) && this.f21434c.equals(jVar.f21434c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21433a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.f21434c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.f21433a + ", " + this.f21434c + ", " + encodeToString + ")";
    }
}
