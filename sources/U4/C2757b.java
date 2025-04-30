package u4;

import x0.AbstractC2914a;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2757b {

    /* renamed from: a, reason: collision with root package name */
    public final String f23111a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23112c;

    public C2757b(String str, String str2, String str3) {
        if (str != null) {
            this.f23111a = str;
            this.b = str2;
            this.f23112c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2757b)) {
            return false;
        }
        C2757b c2757b = (C2757b) obj;
        if (this.f23111a.equals(c2757b.f23111a)) {
            String str = c2757b.b;
            String str2 = this.b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = c2757b.f23112c;
                String str4 = this.f23112c;
                if (str4 == null) {
                    if (str3 == null) {
                        return true;
                    }
                } else if (str4.equals(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f23111a.hashCode() ^ 1000003) * 1000003;
        int i9 = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f23112c;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 ^ i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f23111a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return AbstractC2914a.h(sb, this.f23112c, "}");
    }
}
