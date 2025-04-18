package s7;

import android.net.Uri;

/* loaded from: classes3.dex */
public class i1 implements i {

    /* renamed from: j, reason: collision with root package name */
    public static final String f24425j = n9.h0.E(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24426k = n9.h0.E(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24427l = n9.h0.E(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24428m = n9.h0.E(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f24429n = n9.h0.E(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f24430o = n9.h0.E(5);

    /* renamed from: p, reason: collision with root package name */
    public static final String f24431p = n9.h0.E(6);

    /* renamed from: q, reason: collision with root package name */
    public static final nb.a f24432q = new nb.a(1);

    /* renamed from: b, reason: collision with root package name */
    public final Uri f24433b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24434c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24435d;

    /* renamed from: f, reason: collision with root package name */
    public final int f24436f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24437g;

    /* renamed from: h, reason: collision with root package name */
    public final String f24438h;

    /* renamed from: i, reason: collision with root package name */
    public final String f24439i;

    public i1(h1 h1Var) {
        this.f24433b = (Uri) h1Var.f24388d;
        this.f24434c = (String) h1Var.a;
        this.f24435d = (String) h1Var.f24389e;
        this.f24436f = h1Var.f24386b;
        this.f24437g = h1Var.f24387c;
        this.f24438h = (String) h1Var.f24390f;
        this.f24439i = (String) h1Var.f24391g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (this.f24433b.equals(i1Var.f24433b) && n9.h0.a(this.f24434c, i1Var.f24434c) && n9.h0.a(this.f24435d, i1Var.f24435d) && this.f24436f == i1Var.f24436f && this.f24437g == i1Var.f24437g && n9.h0.a(this.f24438h, i1Var.f24438h) && n9.h0.a(this.f24439i, i1Var.f24439i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f24433b.hashCode() * 31;
        int i10 = 0;
        String str = this.f24434c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f24435d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (((((i11 + hashCode2) * 31) + this.f24436f) * 31) + this.f24437g) * 31;
        String str3 = this.f24438h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f24439i;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 + i10;
    }
}
