package s7;

/* loaded from: classes3.dex */
public final class j1 implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final j1 f24444i = new w0().a();

    /* renamed from: j, reason: collision with root package name */
    public static final String f24445j = n9.h0.E(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24446k = n9.h0.E(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24447l = n9.h0.E(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24448m = n9.h0.E(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f24449n = n9.h0.E(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f24450o = n9.h0.E(5);

    /* renamed from: p, reason: collision with root package name */
    public static final com.facebook.appevents.m f24451p = new com.facebook.appevents.m(23);

    /* renamed from: b, reason: collision with root package name */
    public final String f24452b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f24453c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f24454d;

    /* renamed from: f, reason: collision with root package name */
    public final l1 f24455f;

    /* renamed from: g, reason: collision with root package name */
    public final z0 f24456g;

    /* renamed from: h, reason: collision with root package name */
    public final f1 f24457h;

    public j1(String str, z0 z0Var, e1 e1Var, d1 d1Var, l1 l1Var, f1 f1Var) {
        this.f24452b = str;
        this.f24453c = e1Var;
        this.f24454d = d1Var;
        this.f24455f = l1Var;
        this.f24456g = z0Var;
        this.f24457h = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        if (n9.h0.a(this.f24452b, j1Var.f24452b) && this.f24456g.equals(j1Var.f24456g) && n9.h0.a(this.f24453c, j1Var.f24453c) && n9.h0.a(this.f24454d, j1Var.f24454d) && n9.h0.a(this.f24455f, j1Var.f24455f) && n9.h0.a(this.f24457h, j1Var.f24457h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f24452b.hashCode() * 31;
        e1 e1Var = this.f24453c;
        if (e1Var != null) {
            i10 = e1Var.hashCode();
        } else {
            i10 = 0;
        }
        return this.f24457h.hashCode() + ((this.f24455f.hashCode() + ((this.f24456g.hashCode() + ((this.f24454d.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31)) * 31);
    }
}
