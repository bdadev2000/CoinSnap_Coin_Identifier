package P4;

import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2421a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2422c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2423d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2424e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2425f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2426g;

    public b(String str, int i9, String str2, String str3, long j7, long j9, String str4) {
        this.f2421a = str;
        this.b = i9;
        this.f2422c = str2;
        this.f2423d = str3;
        this.f2424e = j7;
        this.f2425f = j9;
        this.f2426g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [P4.a, java.lang.Object] */
    public final a a() {
        ?? obj = new Object();
        obj.b = this.f2421a;
        obj.f2415a = this.b;
        obj.f2416c = this.f2422c;
        obj.f2417d = this.f2423d;
        obj.f2419f = Long.valueOf(this.f2424e);
        obj.f2420g = Long.valueOf(this.f2425f);
        obj.f2418e = this.f2426g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f2421a;
        if (str != null ? str.equals(bVar.f2421a) : bVar.f2421a == null) {
            if (AbstractC2965e.a(this.b, bVar.b)) {
                String str2 = bVar.f2422c;
                String str3 = this.f2422c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = bVar.f2423d;
                    String str5 = this.f2423d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f2424e == bVar.f2424e && this.f2425f == bVar.f2425f) {
                            String str6 = bVar.f2426g;
                            String str7 = this.f2426g;
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
        int i9 = 0;
        String str = this.f2421a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d2 = (((hashCode ^ 1000003) * 1000003) ^ AbstractC2965e.d(this.b)) * 1000003;
        String str2 = this.f2422c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (d2 ^ hashCode2) * 1000003;
        String str3 = this.f2423d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        long j7 = this.f2424e;
        int i12 = (i11 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j9 = this.f2425f;
        int i13 = (i12 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        String str4 = this.f2426g;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        return i9 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f2421a);
        sb.append(", registrationStatus=");
        int i9 = this.b;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            str = "null";
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        sb.append(str);
        sb.append(", authToken=");
        sb.append(this.f2422c);
        sb.append(", refreshToken=");
        sb.append(this.f2423d);
        sb.append(", expiresInSecs=");
        sb.append(this.f2424e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f2425f);
        sb.append(", fisError=");
        return AbstractC2914a.h(sb, this.f2426g, "}");
    }
}
