package y2;

import com.applovin.impl.L;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f24362a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24363c;

    public i(String str, String str2, String str3) {
        G7.j.e(str2, "cloudBridgeURL");
        this.f24362a = str;
        this.b = str2;
        this.f24363c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (G7.j.a(this.f24362a, iVar.f24362a) && G7.j.a(this.b, iVar.b) && G7.j.a(this.f24363c, iVar.f24363c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24363c.hashCode() + AbstractC2914a.b(this.f24362a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb.append(this.f24362a);
        sb.append(", cloudBridgeURL=");
        sb.append(this.b);
        sb.append(", accessKey=");
        return L.k(sb, this.f24363c, ')');
    }
}
