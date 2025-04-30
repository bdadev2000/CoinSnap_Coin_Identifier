package u4;

import com.applovin.impl.L;

/* renamed from: u4.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2777v {

    /* renamed from: a, reason: collision with root package name */
    public final String f23177a;
    public final String b;

    public C2777v(String str, String str2) {
        this.f23177a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2777v)) {
            return false;
        }
        C2777v c2777v = (C2777v) obj;
        if (G7.j.a(this.f23177a, c2777v.f23177a) && G7.j.a(this.b, c2777v.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        String str = this.f23177a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f23177a);
        sb.append(", authToken=");
        return L.k(sb, this.b, ')');
    }
}
