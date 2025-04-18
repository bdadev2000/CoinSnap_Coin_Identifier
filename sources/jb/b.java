package jb;

/* loaded from: classes3.dex */
public final class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19875b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19876c;

    public b(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            this.f19875b = str2;
            this.f19876c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a.equals(bVar.a)) {
            String str = bVar.f19875b;
            String str2 = this.f19875b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = bVar.f19876c;
                String str4 = this.f19876c;
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
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        String str = this.f19875b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f19876c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f19875b);
        sb2.append(", firebaseAuthenticationToken=");
        return vd.e.h(sb2, this.f19876c, "}");
    }
}
