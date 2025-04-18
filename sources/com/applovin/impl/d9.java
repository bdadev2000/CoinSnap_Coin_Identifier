package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d9 implements m2 {
    private static final d9 H = new b().a();
    public static final m2.a I = new ss(11);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    private int G;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4218b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4219c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4220d;

    /* renamed from: f, reason: collision with root package name */
    public final int f4221f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4222g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4223h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4224i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4225j;

    /* renamed from: k, reason: collision with root package name */
    public final we f4226k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4227l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4228m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4229n;

    /* renamed from: o, reason: collision with root package name */
    public final List f4230o;

    /* renamed from: p, reason: collision with root package name */
    public final w6 f4231p;

    /* renamed from: q, reason: collision with root package name */
    public final long f4232q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4233r;

    /* renamed from: s, reason: collision with root package name */
    public final int f4234s;

    /* renamed from: t, reason: collision with root package name */
    public final float f4235t;
    public final int u;

    /* renamed from: v, reason: collision with root package name */
    public final float f4236v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f4237w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4238x;

    /* renamed from: y, reason: collision with root package name */
    public final p3 f4239y;

    /* renamed from: z, reason: collision with root package name */
    public final int f4240z;

    /* loaded from: classes.dex */
    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f4241b;

        /* renamed from: c, reason: collision with root package name */
        private String f4242c;

        /* renamed from: d, reason: collision with root package name */
        private int f4243d;

        /* renamed from: e, reason: collision with root package name */
        private int f4244e;

        /* renamed from: f, reason: collision with root package name */
        private int f4245f;

        /* renamed from: g, reason: collision with root package name */
        private int f4246g;

        /* renamed from: h, reason: collision with root package name */
        private String f4247h;

        /* renamed from: i, reason: collision with root package name */
        private we f4248i;

        /* renamed from: j, reason: collision with root package name */
        private String f4249j;

        /* renamed from: k, reason: collision with root package name */
        private String f4250k;

        /* renamed from: l, reason: collision with root package name */
        private int f4251l;

        /* renamed from: m, reason: collision with root package name */
        private List f4252m;

        /* renamed from: n, reason: collision with root package name */
        private w6 f4253n;

        /* renamed from: o, reason: collision with root package name */
        private long f4254o;

        /* renamed from: p, reason: collision with root package name */
        private int f4255p;

        /* renamed from: q, reason: collision with root package name */
        private int f4256q;

        /* renamed from: r, reason: collision with root package name */
        private float f4257r;

        /* renamed from: s, reason: collision with root package name */
        private int f4258s;

        /* renamed from: t, reason: collision with root package name */
        private float f4259t;
        private byte[] u;

        /* renamed from: v, reason: collision with root package name */
        private int f4260v;

        /* renamed from: w, reason: collision with root package name */
        private p3 f4261w;

        /* renamed from: x, reason: collision with root package name */
        private int f4262x;

        /* renamed from: y, reason: collision with root package name */
        private int f4263y;

        /* renamed from: z, reason: collision with root package name */
        private int f4264z;

        public b() {
            this.f4245f = -1;
            this.f4246g = -1;
            this.f4251l = -1;
            this.f4254o = Long.MAX_VALUE;
            this.f4255p = -1;
            this.f4256q = -1;
            this.f4257r = -1.0f;
            this.f4259t = 1.0f;
            this.f4260v = -1;
            this.f4262x = -1;
            this.f4263y = -1;
            this.f4264z = -1;
            this.C = -1;
            this.D = 0;
        }

        public b a(int i10) {
            this.C = i10;
            return this;
        }

        public b b(int i10) {
            this.f4245f = i10;
            return this;
        }

        public b c(int i10) {
            this.f4262x = i10;
            return this;
        }

        public b d(int i10) {
            this.D = i10;
            return this;
        }

        public b e(int i10) {
            this.A = i10;
            return this;
        }

        public b f(int i10) {
            this.B = i10;
            return this;
        }

        public b g(int i10) {
            this.f4256q = i10;
            return this;
        }

        public b h(int i10) {
            this.a = Integer.toString(i10);
            return this;
        }

        public b i(int i10) {
            this.f4251l = i10;
            return this;
        }

        public b j(int i10) {
            this.f4264z = i10;
            return this;
        }

        public b k(int i10) {
            this.f4246g = i10;
            return this;
        }

        public b l(int i10) {
            this.f4244e = i10;
            return this;
        }

        public b m(int i10) {
            this.f4258s = i10;
            return this;
        }

        public b n(int i10) {
            this.f4263y = i10;
            return this;
        }

        public b o(int i10) {
            this.f4243d = i10;
            return this;
        }

        public b p(int i10) {
            this.f4260v = i10;
            return this;
        }

        public b q(int i10) {
            this.f4255p = i10;
            return this;
        }

        public b a(String str) {
            this.f4247h = str;
            return this;
        }

        public b b(String str) {
            this.f4249j = str;
            return this;
        }

        public b c(String str) {
            this.a = str;
            return this;
        }

        public b d(String str) {
            this.f4241b = str;
            return this;
        }

        public b e(String str) {
            this.f4242c = str;
            return this;
        }

        public b f(String str) {
            this.f4250k = str;
            return this;
        }

        public b a(p3 p3Var) {
            this.f4261w = p3Var;
            return this;
        }

        public b b(float f10) {
            this.f4259t = f10;
            return this;
        }

        public b a(w6 w6Var) {
            this.f4253n = w6Var;
            return this;
        }

        public b a(float f10) {
            this.f4257r = f10;
            return this;
        }

        public b a(List list) {
            this.f4252m = list;
            return this;
        }

        public b a(we weVar) {
            this.f4248i = weVar;
            return this;
        }

        public b a(byte[] bArr) {
            this.u = bArr;
            return this;
        }

        public b a(long j3) {
            this.f4254o = j3;
            return this;
        }

        public d9 a() {
            return new d9(this);
        }

        private b(d9 d9Var) {
            this.a = d9Var.a;
            this.f4241b = d9Var.f4218b;
            this.f4242c = d9Var.f4219c;
            this.f4243d = d9Var.f4220d;
            this.f4244e = d9Var.f4221f;
            this.f4245f = d9Var.f4222g;
            this.f4246g = d9Var.f4223h;
            this.f4247h = d9Var.f4225j;
            this.f4248i = d9Var.f4226k;
            this.f4249j = d9Var.f4227l;
            this.f4250k = d9Var.f4228m;
            this.f4251l = d9Var.f4229n;
            this.f4252m = d9Var.f4230o;
            this.f4253n = d9Var.f4231p;
            this.f4254o = d9Var.f4232q;
            this.f4255p = d9Var.f4233r;
            this.f4256q = d9Var.f4234s;
            this.f4257r = d9Var.f4235t;
            this.f4258s = d9Var.u;
            this.f4259t = d9Var.f4236v;
            this.u = d9Var.f4237w;
            this.f4260v = d9Var.f4238x;
            this.f4261w = d9Var.f4239y;
            this.f4262x = d9Var.f4240z;
            this.f4263y = d9Var.A;
            this.f4264z = d9Var.B;
            this.A = d9Var.C;
            this.B = d9Var.D;
            this.C = d9Var.E;
            this.D = d9Var.F;
        }
    }

    private d9(b bVar) {
        this.a = bVar.a;
        this.f4218b = bVar.f4241b;
        this.f4219c = yp.f(bVar.f4242c);
        this.f4220d = bVar.f4243d;
        this.f4221f = bVar.f4244e;
        int i10 = bVar.f4245f;
        this.f4222g = i10;
        int i11 = bVar.f4246g;
        this.f4223h = i11;
        this.f4224i = i11 != -1 ? i11 : i10;
        this.f4225j = bVar.f4247h;
        this.f4226k = bVar.f4248i;
        this.f4227l = bVar.f4249j;
        this.f4228m = bVar.f4250k;
        this.f4229n = bVar.f4251l;
        this.f4230o = bVar.f4252m == null ? Collections.emptyList() : bVar.f4252m;
        w6 w6Var = bVar.f4253n;
        this.f4231p = w6Var;
        this.f4232q = bVar.f4254o;
        this.f4233r = bVar.f4255p;
        this.f4234s = bVar.f4256q;
        this.f4235t = bVar.f4257r;
        this.u = bVar.f4258s == -1 ? 0 : bVar.f4258s;
        this.f4236v = bVar.f4259t == -1.0f ? 1.0f : bVar.f4259t;
        this.f4237w = bVar.u;
        this.f4238x = bVar.f4260v;
        this.f4239y = bVar.f4261w;
        this.f4240z = bVar.f4262x;
        this.A = bVar.f4263y;
        this.B = bVar.f4264z;
        this.C = bVar.A == -1 ? 0 : bVar.A;
        this.D = bVar.B != -1 ? bVar.B : 0;
        this.E = bVar.C;
        if (bVar.D == 0 && w6Var != null) {
            this.F = 1;
        } else {
            this.F = bVar.D;
        }
    }

    private static Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private static String c(int i10) {
        return b(12) + "_" + Integer.toString(i10, 36);
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.class != obj.getClass()) {
            return false;
        }
        d9 d9Var = (d9) obj;
        int i11 = this.G;
        if (i11 != 0 && (i10 = d9Var.G) != 0 && i11 != i10) {
            return false;
        }
        if (this.f4220d == d9Var.f4220d && this.f4221f == d9Var.f4221f && this.f4222g == d9Var.f4222g && this.f4223h == d9Var.f4223h && this.f4229n == d9Var.f4229n && this.f4232q == d9Var.f4232q && this.f4233r == d9Var.f4233r && this.f4234s == d9Var.f4234s && this.u == d9Var.u && this.f4238x == d9Var.f4238x && this.f4240z == d9Var.f4240z && this.A == d9Var.A && this.B == d9Var.B && this.C == d9Var.C && this.D == d9Var.D && this.E == d9Var.E && this.F == d9Var.F && Float.compare(this.f4235t, d9Var.f4235t) == 0 && Float.compare(this.f4236v, d9Var.f4236v) == 0 && yp.a((Object) this.a, (Object) d9Var.a) && yp.a((Object) this.f4218b, (Object) d9Var.f4218b) && yp.a((Object) this.f4225j, (Object) d9Var.f4225j) && yp.a((Object) this.f4227l, (Object) d9Var.f4227l) && yp.a((Object) this.f4228m, (Object) d9Var.f4228m) && yp.a((Object) this.f4219c, (Object) d9Var.f4219c) && Arrays.equals(this.f4237w, d9Var.f4237w) && yp.a(this.f4226k, d9Var.f4226k) && yp.a(this.f4239y, d9Var.f4239y) && yp.a(this.f4231p, d9Var.f4231p) && a(d9Var)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i10;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.G == 0) {
            String str = this.a;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (hashCode + 527) * 31;
            String str2 = this.f4218b;
            if (str2 != null) {
                i10 = str2.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (i12 + i10) * 31;
            String str3 = this.f4219c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i14 = (((((((((i13 + hashCode2) * 31) + this.f4220d) * 31) + this.f4221f) * 31) + this.f4222g) * 31) + this.f4223h) * 31;
            String str4 = this.f4225j;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i15 = (i14 + hashCode3) * 31;
            we weVar = this.f4226k;
            if (weVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = weVar.hashCode();
            }
            int i16 = (i15 + hashCode4) * 31;
            String str5 = this.f4227l;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i17 = (i16 + hashCode5) * 31;
            String str6 = this.f4228m;
            if (str6 != null) {
                i11 = str6.hashCode();
            }
            this.G = ((((((((((((((((Float.floatToIntBits(this.f4236v) + ((((Float.floatToIntBits(this.f4235t) + ((((((((((i17 + i11) * 31) + this.f4229n) * 31) + ((int) this.f4232q)) * 31) + this.f4233r) * 31) + this.f4234s) * 31)) * 31) + this.u) * 31)) * 31) + this.f4238x) * 31) + this.f4240z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.a);
        sb2.append(", ");
        sb2.append(this.f4218b);
        sb2.append(", ");
        sb2.append(this.f4227l);
        sb2.append(", ");
        sb2.append(this.f4228m);
        sb2.append(", ");
        sb2.append(this.f4225j);
        sb2.append(", ");
        sb2.append(this.f4224i);
        sb2.append(", ");
        sb2.append(this.f4219c);
        sb2.append(", [");
        sb2.append(this.f4233r);
        sb2.append(", ");
        sb2.append(this.f4234s);
        sb2.append(", ");
        sb2.append(this.f4235t);
        sb2.append("], [");
        sb2.append(this.f4240z);
        sb2.append(", ");
        return vd.e.g(sb2, this.A, "])");
    }

    public d9 a(int i10) {
        return a().d(i10).a();
    }

    public int b() {
        int i10;
        int i11 = this.f4233r;
        if (i11 == -1 || (i10 = this.f4234s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    private static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public boolean a(d9 d9Var) {
        if (this.f4230o.size() != d9Var.f4230o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f4230o.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f4230o.get(i10), (byte[]) d9Var.f4230o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d9 a(Bundle bundle) {
        b bVar = new b();
        n2.a(bundle);
        int i10 = 0;
        String string = bundle.getString(b(0));
        d9 d9Var = H;
        bVar.c((String) a(string, d9Var.a)).d((String) a(bundle.getString(b(1)), d9Var.f4218b)).e((String) a(bundle.getString(b(2)), d9Var.f4219c)).o(bundle.getInt(b(3), d9Var.f4220d)).l(bundle.getInt(b(4), d9Var.f4221f)).b(bundle.getInt(b(5), d9Var.f4222g)).k(bundle.getInt(b(6), d9Var.f4223h)).a((String) a(bundle.getString(b(7)), d9Var.f4225j)).a((we) a((we) bundle.getParcelable(b(8)), d9Var.f4226k)).b((String) a(bundle.getString(b(9)), d9Var.f4227l)).f((String) a(bundle.getString(b(10)), d9Var.f4228m)).i(bundle.getInt(b(11), d9Var.f4229n));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(c(i10));
            if (byteArray == null) {
                b a10 = bVar.a(arrayList).a((w6) bundle.getParcelable(b(13)));
                String b3 = b(14);
                d9 d9Var2 = H;
                a10.a(bundle.getLong(b3, d9Var2.f4232q)).q(bundle.getInt(b(15), d9Var2.f4233r)).g(bundle.getInt(b(16), d9Var2.f4234s)).a(bundle.getFloat(b(17), d9Var2.f4235t)).m(bundle.getInt(b(18), d9Var2.u)).b(bundle.getFloat(b(19), d9Var2.f4236v)).a(bundle.getByteArray(b(20))).p(bundle.getInt(b(21), d9Var2.f4238x)).a((p3) n2.a(p3.f6898g, bundle.getBundle(b(22)))).c(bundle.getInt(b(23), d9Var2.f4240z)).n(bundle.getInt(b(24), d9Var2.A)).j(bundle.getInt(b(25), d9Var2.B)).e(bundle.getInt(b(26), d9Var2.C)).f(bundle.getInt(b(27), d9Var2.D)).a(bundle.getInt(b(28), d9Var2.E)).d(bundle.getInt(b(29), d9Var2.F));
                return bVar.a();
            }
            arrayList.add(byteArray);
            i10++;
        }
    }
}
