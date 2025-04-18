package fc;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17774b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17775c;

    /* renamed from: d, reason: collision with root package name */
    public final b f17776d;

    /* renamed from: e, reason: collision with root package name */
    public final d f17777e;

    public a(String str, String str2, String str3, b bVar, d dVar) {
        this.a = str;
        this.f17774b = str2;
        this.f17775c = str3;
        this.f17776d = bVar;
        this.f17777e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.a;
        if (str != null ? str.equals(aVar.a) : aVar.a == null) {
            String str2 = this.f17774b;
            if (str2 != null ? str2.equals(aVar.f17774b) : aVar.f17774b == null) {
                String str3 = this.f17775c;
                if (str3 != null ? str3.equals(aVar.f17775c) : aVar.f17775c == null) {
                    b bVar = this.f17776d;
                    if (bVar != null ? bVar.equals(aVar.f17776d) : aVar.f17776d == null) {
                        d dVar = this.f17777e;
                        if (dVar == null) {
                            if (aVar.f17777e == null) {
                                return true;
                            }
                        } else if (dVar.equals(aVar.f17777e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i10 = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f17774b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f17775c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        b bVar = this.f17776d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        d dVar = this.f17777e;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return i10 ^ i14;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.f17774b + ", refreshToken=" + this.f17775c + ", authToken=" + this.f17776d + ", responseCode=" + this.f17777e + "}";
    }
}
