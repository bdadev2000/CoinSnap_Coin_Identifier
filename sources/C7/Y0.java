package c7;

/* loaded from: classes3.dex */
public final class Y0 extends b1 {
    public static final X0 Companion = new X0(null);
    private String amazonAdvertisingId;
    private String gaid;

    public Y0() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Y0 copy$default(Y0 y02, String str, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = y02.gaid;
        }
        if ((i9 & 2) != 0) {
            str2 = y02.amazonAdvertisingId;
        }
        return y02.copy(str, str2);
    }

    public static final void write$Self(Y0 y02, d8.b bVar, c8.g gVar) {
        G7.j.e(y02, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        b1.write$Self(y02, bVar, gVar);
        if (bVar.o(gVar) || y02.gaid != null) {
            bVar.u(gVar, 17, e8.k0.f20172a, y02.gaid);
        }
        if (bVar.o(gVar) || y02.amazonAdvertisingId != null) {
            bVar.u(gVar, 18, e8.k0.f20172a, y02.amazonAdvertisingId);
        }
    }

    public final String component1() {
        return this.gaid;
    }

    public final String component2() {
        return this.amazonAdvertisingId;
    }

    public final Y0 copy(String str, String str2) {
        return new Y0(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y0)) {
            return false;
        }
        Y0 y02 = (Y0) obj;
        if (G7.j.a(this.gaid, y02.gaid) && G7.j.a(this.amazonAdvertisingId, y02.amazonAdvertisingId)) {
            return true;
        }
        return false;
    }

    public final String getAmazonAdvertisingId() {
        return this.amazonAdvertisingId;
    }

    public final String getGaid() {
        return this.gaid;
    }

    public int hashCode() {
        int hashCode;
        String str = this.gaid;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.amazonAdvertisingId;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    public final void setAmazonAdvertisingId(String str) {
        this.amazonAdvertisingId = str;
    }

    public final void setGaid(String str) {
        this.gaid = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidAmazonExt(gaid=");
        sb.append(this.gaid);
        sb.append(", amazonAdvertisingId=");
        return com.applovin.impl.L.k(sb, this.amazonAdvertisingId, ')');
    }

    public /* synthetic */ Y0(int i9, String str, boolean z8, String str2, float f9, String str3, int i10, String str4, String str5, String str6, String str7, String str8, float f10, int i11, boolean z9, int i12, boolean z10, String str9, String str10, String str11, e8.g0 g0Var) {
        super(i9, str, z8, str2, f9, str3, i10, str4, str5, str6, str7, str8, f10, i11, z9, i12, z10, str9, g0Var);
        Y0 y02;
        if ((i9 & 131072) == 0) {
            y02 = this;
            y02.gaid = null;
        } else {
            y02 = this;
            y02.gaid = str10;
        }
        y02.amazonAdvertisingId = (i9 & 262144) != 0 ? str11 : null;
    }

    public /* synthetic */ Y0(String str, String str2, int i9, G7.f fVar) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2);
    }

    public Y0(String str, String str2) {
        this.gaid = str;
        this.amazonAdvertisingId = str2;
    }
}
