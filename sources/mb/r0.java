package mb;

import java.util.List;

/* loaded from: classes3.dex */
public final class r0 extends i2 {
    public final g2 a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22070b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22071c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f22072d;

    /* renamed from: e, reason: collision with root package name */
    public final h2 f22073e;

    /* renamed from: f, reason: collision with root package name */
    public final List f22074f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22075g;

    public r0(g2 g2Var, List list, List list2, Boolean bool, h2 h2Var, List list3, int i10) {
        this.a = g2Var;
        this.f22070b = list;
        this.f22071c = list2;
        this.f22072d = bool;
        this.f22073e = h2Var;
        this.f22074f = list3;
        this.f22075g = i10;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        h2 h2Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        r0 r0Var = (r0) ((i2) obj);
        if (this.a.equals(r0Var.a) && ((list = this.f22070b) != null ? list.equals(r0Var.f22070b) : r0Var.f22070b == null) && ((list2 = this.f22071c) != null ? list2.equals(r0Var.f22071c) : r0Var.f22071c == null) && ((bool = this.f22072d) != null ? bool.equals(r0Var.f22072d) : r0Var.f22072d == null) && ((h2Var = this.f22073e) != null ? h2Var.equals(r0Var.f22073e) : r0Var.f22073e == null) && ((list3 = this.f22074f) != null ? list3.equals(r0Var.f22074f) : r0Var.f22074f == null) && this.f22075g == r0Var.f22075g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        List list = this.f22070b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f22071c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        Boolean bool = this.f22072d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        h2 h2Var = this.f22073e;
        if (h2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = h2Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        List list3 = this.f22074f;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((i14 ^ i10) * 1000003) ^ this.f22075g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.a);
        sb2.append(", customAttributes=");
        sb2.append(this.f22070b);
        sb2.append(", internalKeys=");
        sb2.append(this.f22071c);
        sb2.append(", background=");
        sb2.append(this.f22072d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f22073e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f22074f);
        sb2.append(", uiOrientation=");
        return vd.e.g(sb2, this.f22075g, "}");
    }
}
