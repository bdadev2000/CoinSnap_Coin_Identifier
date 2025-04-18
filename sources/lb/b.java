package lb;

/* loaded from: classes3.dex */
public final class b extends n {

    /* renamed from: b, reason: collision with root package name */
    public final String f21298b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21299c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21300d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21301e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21302f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f21298b = str;
            if (str2 != null) {
                this.f21299c = str2;
                if (str3 != null) {
                    this.f21300d = str3;
                    if (str4 != null) {
                        this.f21301e = str4;
                        this.f21302f = j3;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f21298b.equals(((b) nVar).f21298b)) {
            b bVar = (b) nVar;
            if (this.f21299c.equals(bVar.f21299c) && this.f21300d.equals(bVar.f21300d) && this.f21301e.equals(bVar.f21301e) && this.f21302f == bVar.f21302f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f21298b.hashCode() ^ 1000003) * 1000003) ^ this.f21299c.hashCode()) * 1000003) ^ this.f21300d.hashCode()) * 1000003) ^ this.f21301e.hashCode()) * 1000003;
        long j3 = this.f21302f;
        return hashCode ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f21298b);
        sb2.append(", parameterKey=");
        sb2.append(this.f21299c);
        sb2.append(", parameterValue=");
        sb2.append(this.f21300d);
        sb2.append(", variantId=");
        sb2.append(this.f21301e);
        sb2.append(", templateVersion=");
        return a4.j.j(sb2, this.f21302f, "}");
    }
}
