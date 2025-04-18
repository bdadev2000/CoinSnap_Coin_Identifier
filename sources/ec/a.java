package ec;

import vd.e;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f17291h = 0;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final c f17292b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17293c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17294d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17295e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17296f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17297g;

    static {
        ob.c cVar = new ob.c();
        cVar.f23296f = 0L;
        cVar.v(c.ATTEMPT_MIGRATION);
        cVar.f23295e = 0L;
        cVar.j();
    }

    public a(String str, c cVar, String str2, String str3, long j3, long j10, String str4) {
        this.a = str;
        this.f17292b = cVar;
        this.f17293c = str2;
        this.f17294d = str3;
        this.f17295e = j3;
        this.f17296f = j10;
        this.f17297g = str4;
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
            if (this.f17292b.equals(aVar.f17292b)) {
                String str2 = aVar.f17293c;
                String str3 = this.f17293c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = aVar.f17294d;
                    String str5 = this.f17294d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f17295e == aVar.f17295e && this.f17296f == aVar.f17296f) {
                            String str6 = aVar.f17297g;
                            String str7 = this.f17297g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
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
        int i10 = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f17292b.hashCode()) * 1000003;
        String str2 = this.f17293c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f17294d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        long j3 = this.f17295e;
        int i13 = (i12 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j10 = this.f17296f;
        int i14 = (i13 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f17297g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i14;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.a);
        sb2.append(", registrationStatus=");
        sb2.append(this.f17292b);
        sb2.append(", authToken=");
        sb2.append(this.f17293c);
        sb2.append(", refreshToken=");
        sb2.append(this.f17294d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f17295e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f17296f);
        sb2.append(", fisError=");
        return e.h(sb2, this.f17297g, "}");
    }
}
