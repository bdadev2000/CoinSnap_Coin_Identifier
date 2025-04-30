package c7;

/* loaded from: classes3.dex */
public final class m1 {
    public static final l1 Companion = new l1(null);
    private final String params;
    private final String vendorKey;
    private final String vendorURL;

    public m1() {
        this((String) null, (String) null, (String) null, 7, (G7.f) null);
    }

    public static /* synthetic */ m1 copy$default(m1 m1Var, String str, String str2, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = m1Var.params;
        }
        if ((i9 & 2) != 0) {
            str2 = m1Var.vendorKey;
        }
        if ((i9 & 4) != 0) {
            str3 = m1Var.vendorURL;
        }
        return m1Var.copy(str, str2, str3);
    }

    public static final void write$Self(m1 m1Var, d8.b bVar, c8.g gVar) {
        G7.j.e(m1Var, "self");
        if (Q7.n0.u(bVar, "output", gVar, "serialDesc", gVar) || m1Var.params != null) {
            bVar.u(gVar, 0, e8.k0.f20172a, m1Var.params);
        }
        if (bVar.o(gVar) || m1Var.vendorKey != null) {
            bVar.u(gVar, 1, e8.k0.f20172a, m1Var.vendorKey);
        }
        if (bVar.o(gVar) || m1Var.vendorURL != null) {
            bVar.u(gVar, 2, e8.k0.f20172a, m1Var.vendorURL);
        }
    }

    public final String component1() {
        return this.params;
    }

    public final String component2() {
        return this.vendorKey;
    }

    public final String component3() {
        return this.vendorURL;
    }

    public final m1 copy(String str, String str2, String str3) {
        return new m1(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (G7.j.a(this.params, m1Var.params) && G7.j.a(this.vendorKey, m1Var.vendorKey) && G7.j.a(this.vendorURL, m1Var.vendorURL)) {
            return true;
        }
        return false;
    }

    public final String getParams() {
        return this.params;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVendorURL() {
        return this.vendorURL;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.params;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.vendorKey;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.vendorURL;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OmSdkData(params=");
        sb.append(this.params);
        sb.append(", vendorKey=");
        sb.append(this.vendorKey);
        sb.append(", vendorURL=");
        return com.applovin.impl.L.k(sb, this.vendorURL, ')');
    }

    public /* synthetic */ m1(int i9, String str, String str2, String str3, e8.g0 g0Var) {
        if ((i9 & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i9 & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i9 & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public m1(String str, String str2, String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }

    public /* synthetic */ m1(String str, String str2, String str3, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? null : str3);
    }
}
