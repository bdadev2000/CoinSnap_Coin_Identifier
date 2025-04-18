package k9;

import com.google.common.collect.b1;
import com.google.common.collect.r0;
import com.google.common.collect.u0;
import n9.h0;

/* loaded from: classes3.dex */
public class w implements s7.i {
    public final u0 A;
    public final b1 B;

    /* renamed from: b, reason: collision with root package name */
    public final int f20502b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20503c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20504d;

    /* renamed from: f, reason: collision with root package name */
    public final int f20505f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20506g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20507h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20508i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20509j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20510k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20511l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f20512m;

    /* renamed from: n, reason: collision with root package name */
    public final r0 f20513n;

    /* renamed from: o, reason: collision with root package name */
    public final int f20514o;

    /* renamed from: p, reason: collision with root package name */
    public final r0 f20515p;

    /* renamed from: q, reason: collision with root package name */
    public final int f20516q;

    /* renamed from: r, reason: collision with root package name */
    public final int f20517r;

    /* renamed from: s, reason: collision with root package name */
    public final int f20518s;

    /* renamed from: t, reason: collision with root package name */
    public final r0 f20519t;
    public final r0 u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20520v;

    /* renamed from: w, reason: collision with root package name */
    public final int f20521w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f20522x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f20523y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f20524z;

    static {
        new w(new v());
        h0.E(1);
        h0.E(2);
        h0.E(3);
        h0.E(4);
        h0.E(5);
        h0.E(6);
        h0.E(7);
        h0.E(8);
        h0.E(9);
        h0.E(10);
        h0.E(11);
        h0.E(12);
        h0.E(13);
        h0.E(14);
        h0.E(15);
        h0.E(16);
        h0.E(17);
        h0.E(18);
        h0.E(19);
        h0.E(20);
        h0.E(21);
        h0.E(22);
        h0.E(23);
        h0.E(24);
        h0.E(25);
        h0.E(26);
    }

    public w(v vVar) {
        this.f20502b = vVar.a;
        this.f20503c = vVar.f20482b;
        this.f20504d = vVar.f20483c;
        this.f20505f = vVar.f20484d;
        vVar.getClass();
        this.f20506g = 0;
        vVar.getClass();
        this.f20507h = 0;
        vVar.getClass();
        this.f20508i = 0;
        vVar.getClass();
        this.f20509j = 0;
        this.f20510k = vVar.f20485e;
        this.f20511l = vVar.f20486f;
        this.f20512m = vVar.f20487g;
        this.f20513n = vVar.f20488h;
        this.f20514o = vVar.f20489i;
        this.f20515p = vVar.f20490j;
        this.f20516q = vVar.f20491k;
        this.f20517r = vVar.f20492l;
        this.f20518s = vVar.f20493m;
        this.f20519t = vVar.f20494n;
        this.u = vVar.f20495o;
        this.f20520v = vVar.f20496p;
        this.f20521w = vVar.f20497q;
        this.f20522x = vVar.f20498r;
        this.f20523y = vVar.f20499s;
        this.f20524z = vVar.f20500t;
        this.A = u0.a(vVar.u);
        this.B = b1.l(vVar.f20501v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f20502b == wVar.f20502b && this.f20503c == wVar.f20503c && this.f20504d == wVar.f20504d && this.f20505f == wVar.f20505f && this.f20506g == wVar.f20506g && this.f20507h == wVar.f20507h && this.f20508i == wVar.f20508i && this.f20509j == wVar.f20509j && this.f20512m == wVar.f20512m && this.f20510k == wVar.f20510k && this.f20511l == wVar.f20511l && this.f20513n.equals(wVar.f20513n) && this.f20514o == wVar.f20514o && this.f20515p.equals(wVar.f20515p) && this.f20516q == wVar.f20516q && this.f20517r == wVar.f20517r && this.f20518s == wVar.f20518s && this.f20519t.equals(wVar.f20519t) && this.u.equals(wVar.u) && this.f20520v == wVar.f20520v && this.f20521w == wVar.f20521w && this.f20522x == wVar.f20522x && this.f20523y == wVar.f20523y && this.f20524z == wVar.f20524z) {
            u0 u0Var = this.A;
            u0Var.getClass();
            if (c6.k.m(u0Var, wVar.A) && this.B.equals(wVar.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.B.hashCode() + ((this.A.hashCode() + ((((((((((((this.u.hashCode() + ((this.f20519t.hashCode() + ((((((((this.f20515p.hashCode() + ((((this.f20513n.hashCode() + ((((((((((((((((((((((this.f20502b + 31) * 31) + this.f20503c) * 31) + this.f20504d) * 31) + this.f20505f) * 31) + this.f20506g) * 31) + this.f20507h) * 31) + this.f20508i) * 31) + this.f20509j) * 31) + (this.f20512m ? 1 : 0)) * 31) + this.f20510k) * 31) + this.f20511l) * 31)) * 31) + this.f20514o) * 31)) * 31) + this.f20516q) * 31) + this.f20517r) * 31) + this.f20518s) * 31)) * 31)) * 31) + this.f20520v) * 31) + this.f20521w) * 31) + (this.f20522x ? 1 : 0)) * 31) + (this.f20523y ? 1 : 0)) * 31) + (this.f20524z ? 1 : 0)) * 31)) * 31);
    }
}
