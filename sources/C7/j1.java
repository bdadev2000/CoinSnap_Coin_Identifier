package c7;

import androidx.core.app.NotificationCompat;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class j1 {
    public static final c1 Companion = new c1(null);
    private final String carrier;
    private f1 ext;

    /* renamed from: h */
    private final int f5420h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private String ua;

    /* renamed from: w */
    private final int f5421w;

    public /* synthetic */ j1(int i9, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, f1 f1Var, e8.g0 g0Var) {
        if (119 != (i9 & 119)) {
            e8.W.h(i9, 119, V0.INSTANCE.getDescriptor());
            throw null;
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i9 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.f5421w = i10;
        this.f5420h = i11;
        if ((i9 & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i9 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i9 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i9 & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = f1Var;
        }
    }

    public static /* synthetic */ j1 copy$default(j1 j1Var, String str, String str2, String str3, String str4, String str5, int i9, int i10, String str6, String str7, Integer num, f1 f1Var, int i11, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i12;
        int i13;
        String str13;
        String str14;
        Integer num2;
        f1 f1Var2;
        if ((i11 & 1) != 0) {
            str8 = j1Var.make;
        } else {
            str8 = str;
        }
        if ((i11 & 2) != 0) {
            str9 = j1Var.model;
        } else {
            str9 = str2;
        }
        if ((i11 & 4) != 0) {
            str10 = j1Var.osv;
        } else {
            str10 = str3;
        }
        if ((i11 & 8) != 0) {
            str11 = j1Var.carrier;
        } else {
            str11 = str4;
        }
        if ((i11 & 16) != 0) {
            str12 = j1Var.os;
        } else {
            str12 = str5;
        }
        if ((i11 & 32) != 0) {
            i12 = j1Var.f5421w;
        } else {
            i12 = i9;
        }
        if ((i11 & 64) != 0) {
            i13 = j1Var.f5420h;
        } else {
            i13 = i10;
        }
        if ((i11 & 128) != 0) {
            str13 = j1Var.ua;
        } else {
            str13 = str6;
        }
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str14 = j1Var.ifa;
        } else {
            str14 = str7;
        }
        if ((i11 & 512) != 0) {
            num2 = j1Var.lmt;
        } else {
            num2 = num;
        }
        if ((i11 & 1024) != 0) {
            f1Var2 = j1Var.ext;
        } else {
            f1Var2 = f1Var;
        }
        return j1Var.copy(str8, str9, str10, str11, str12, i12, i13, str13, str14, num2, f1Var2);
    }

    public static final void write$Self(j1 j1Var, d8.b bVar, c8.g gVar) {
        G7.j.e(j1Var, "self");
        G7.j.e(bVar, "output");
        G7.j.e(gVar, "serialDesc");
        bVar.k(gVar, 0, j1Var.make);
        bVar.k(gVar, 1, j1Var.model);
        bVar.k(gVar, 2, j1Var.osv);
        if (bVar.o(gVar) || j1Var.carrier != null) {
            bVar.u(gVar, 3, e8.k0.f20172a, j1Var.carrier);
        }
        bVar.k(gVar, 4, j1Var.os);
        bVar.C(5, j1Var.f5421w, gVar);
        bVar.C(6, j1Var.f5420h, gVar);
        if (bVar.o(gVar) || j1Var.ua != null) {
            bVar.u(gVar, 7, e8.k0.f20172a, j1Var.ua);
        }
        if (bVar.o(gVar) || j1Var.ifa != null) {
            bVar.u(gVar, 8, e8.k0.f20172a, j1Var.ifa);
        }
        if (bVar.o(gVar) || j1Var.lmt != null) {
            bVar.u(gVar, 9, e8.K.f20127a, j1Var.lmt);
        }
        if (bVar.o(gVar) || j1Var.ext != null) {
            bVar.u(gVar, 10, d1.INSTANCE, j1Var.ext);
        }
    }

    public final String component1() {
        return this.make;
    }

    public final Integer component10() {
        return this.lmt;
    }

    public final f1 component11() {
        return this.ext;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.osv;
    }

    public final String component4() {
        return this.carrier;
    }

    public final String component5() {
        return this.os;
    }

    public final int component6() {
        return this.f5421w;
    }

    public final int component7() {
        return this.f5420h;
    }

    public final String component8() {
        return this.ua;
    }

    public final String component9() {
        return this.ifa;
    }

    public final j1 copy(String str, String str2, String str3, String str4, String str5, int i9, int i10, String str6, String str7, Integer num, f1 f1Var) {
        G7.j.e(str, "make");
        G7.j.e(str2, "model");
        G7.j.e(str3, "osv");
        G7.j.e(str5, "os");
        return new j1(str, str2, str3, str4, str5, i9, i10, str6, str7, num, f1Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (G7.j.a(this.make, j1Var.make) && G7.j.a(this.model, j1Var.model) && G7.j.a(this.osv, j1Var.osv) && G7.j.a(this.carrier, j1Var.carrier) && G7.j.a(this.os, j1Var.os) && this.f5421w == j1Var.f5421w && this.f5420h == j1Var.f5420h && G7.j.a(this.ua, j1Var.ua) && G7.j.a(this.ifa, j1Var.ifa) && G7.j.a(this.lmt, j1Var.lmt) && G7.j.a(this.ext, j1Var.ext)) {
            return true;
        }
        return false;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final f1 getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.f5420h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.f5421w;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int b = AbstractC2914a.b(AbstractC2914a.b(this.make.hashCode() * 31, 31, this.model), 31, this.osv);
        String str = this.carrier;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (Integer.hashCode(this.f5420h) + ((Integer.hashCode(this.f5421w) + AbstractC2914a.b((b + hashCode) * 31, 31, this.os)) * 31)) * 31;
        String str2 = this.ua;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (hashCode5 + hashCode2) * 31;
        String str3 = this.ifa;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num = this.lmt;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        f1 f1Var = this.ext;
        if (f1Var != null) {
            i9 = f1Var.hashCode();
        }
        return i12 + i9;
    }

    public final void setExt(f1 f1Var) {
        this.ext = f1Var;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.ua = str;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.f5421w + ", h=" + this.f5420h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public j1(String str, String str2, String str3, String str4, String str5, int i9, int i10, String str6, String str7, Integer num, f1 f1Var) {
        G7.j.e(str, "make");
        G7.j.e(str2, "model");
        G7.j.e(str3, "osv");
        G7.j.e(str5, "os");
        this.make = str;
        this.model = str2;
        this.osv = str3;
        this.carrier = str4;
        this.os = str5;
        this.f5421w = i9;
        this.f5420h = i10;
        this.ua = str6;
        this.ifa = str7;
        this.lmt = num;
        this.ext = f1Var;
    }

    public /* synthetic */ j1(String str, String str2, String str3, String str4, String str5, int i9, int i10, String str6, String str7, Integer num, f1 f1Var, int i11, G7.f fVar) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : str4, str5, i9, i10, (i11 & 128) != 0 ? null : str6, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str7, (i11 & 512) != 0 ? null : num, (i11 & 1024) != 0 ? null : f1Var);
    }
}
