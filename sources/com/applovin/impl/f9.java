package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f9 implements o2 {
    private static final f9 H = new b().a();
    public static final o2.a I = new rs(10);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    private int G;

    /* renamed from: a, reason: collision with root package name */
    public final String f23830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23831b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23832c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final int f23833f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23834g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23835h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23836i;

    /* renamed from: j, reason: collision with root package name */
    public final String f23837j;

    /* renamed from: k, reason: collision with root package name */
    public final bf f23838k;

    /* renamed from: l, reason: collision with root package name */
    public final String f23839l;

    /* renamed from: m, reason: collision with root package name */
    public final String f23840m;

    /* renamed from: n, reason: collision with root package name */
    public final int f23841n;

    /* renamed from: o, reason: collision with root package name */
    public final List f23842o;

    /* renamed from: p, reason: collision with root package name */
    public final y6 f23843p;

    /* renamed from: q, reason: collision with root package name */
    public final long f23844q;

    /* renamed from: r, reason: collision with root package name */
    public final int f23845r;

    /* renamed from: s, reason: collision with root package name */
    public final int f23846s;

    /* renamed from: t, reason: collision with root package name */
    public final float f23847t;

    /* renamed from: u, reason: collision with root package name */
    public final int f23848u;

    /* renamed from: v, reason: collision with root package name */
    public final float f23849v;
    public final byte[] w;
    public final int x;

    /* renamed from: y, reason: collision with root package name */
    public final r3 f23850y;

    /* renamed from: z, reason: collision with root package name */
    public final int f23851z;

    /* loaded from: classes3.dex */
    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;

        /* renamed from: a, reason: collision with root package name */
        private String f23852a;

        /* renamed from: b, reason: collision with root package name */
        private String f23853b;

        /* renamed from: c, reason: collision with root package name */
        private String f23854c;
        private int d;
        private int e;

        /* renamed from: f, reason: collision with root package name */
        private int f23855f;

        /* renamed from: g, reason: collision with root package name */
        private int f23856g;

        /* renamed from: h, reason: collision with root package name */
        private String f23857h;

        /* renamed from: i, reason: collision with root package name */
        private bf f23858i;

        /* renamed from: j, reason: collision with root package name */
        private String f23859j;

        /* renamed from: k, reason: collision with root package name */
        private String f23860k;

        /* renamed from: l, reason: collision with root package name */
        private int f23861l;

        /* renamed from: m, reason: collision with root package name */
        private List f23862m;

        /* renamed from: n, reason: collision with root package name */
        private y6 f23863n;

        /* renamed from: o, reason: collision with root package name */
        private long f23864o;

        /* renamed from: p, reason: collision with root package name */
        private int f23865p;

        /* renamed from: q, reason: collision with root package name */
        private int f23866q;

        /* renamed from: r, reason: collision with root package name */
        private float f23867r;

        /* renamed from: s, reason: collision with root package name */
        private int f23868s;

        /* renamed from: t, reason: collision with root package name */
        private float f23869t;

        /* renamed from: u, reason: collision with root package name */
        private byte[] f23870u;

        /* renamed from: v, reason: collision with root package name */
        private int f23871v;
        private r3 w;
        private int x;

        /* renamed from: y, reason: collision with root package name */
        private int f23872y;

        /* renamed from: z, reason: collision with root package name */
        private int f23873z;

        public b() {
            this.f23855f = -1;
            this.f23856g = -1;
            this.f23861l = -1;
            this.f23864o = Long.MAX_VALUE;
            this.f23865p = -1;
            this.f23866q = -1;
            this.f23867r = -1.0f;
            this.f23869t = 1.0f;
            this.f23871v = -1;
            this.x = -1;
            this.f23872y = -1;
            this.f23873z = -1;
            this.C = -1;
            this.D = 0;
        }

        public b a(float f2) {
            this.f23867r = f2;
            return this;
        }

        public b b(float f2) {
            this.f23869t = f2;
            return this;
        }

        public b c(int i2) {
            this.x = i2;
            return this;
        }

        public b d(int i2) {
            this.D = i2;
            return this;
        }

        public b e(int i2) {
            this.A = i2;
            return this;
        }

        public b f(int i2) {
            this.B = i2;
            return this;
        }

        public b g(int i2) {
            this.f23866q = i2;
            return this;
        }

        public b i(int i2) {
            this.f23861l = i2;
            return this;
        }

        public b j(int i2) {
            this.f23873z = i2;
            return this;
        }

        public b k(int i2) {
            this.f23856g = i2;
            return this;
        }

        public b l(int i2) {
            this.e = i2;
            return this;
        }

        public b m(int i2) {
            this.f23868s = i2;
            return this;
        }

        public b n(int i2) {
            this.f23872y = i2;
            return this;
        }

        public b o(int i2) {
            this.d = i2;
            return this;
        }

        public b p(int i2) {
            this.f23871v = i2;
            return this;
        }

        public b q(int i2) {
            this.f23865p = i2;
            return this;
        }

        private b(f9 f9Var) {
            this.f23852a = f9Var.f23830a;
            this.f23853b = f9Var.f23831b;
            this.f23854c = f9Var.f23832c;
            this.d = f9Var.d;
            this.e = f9Var.f23833f;
            this.f23855f = f9Var.f23834g;
            this.f23856g = f9Var.f23835h;
            this.f23857h = f9Var.f23837j;
            this.f23858i = f9Var.f23838k;
            this.f23859j = f9Var.f23839l;
            this.f23860k = f9Var.f23840m;
            this.f23861l = f9Var.f23841n;
            this.f23862m = f9Var.f23842o;
            this.f23863n = f9Var.f23843p;
            this.f23864o = f9Var.f23844q;
            this.f23865p = f9Var.f23845r;
            this.f23866q = f9Var.f23846s;
            this.f23867r = f9Var.f23847t;
            this.f23868s = f9Var.f23848u;
            this.f23869t = f9Var.f23849v;
            this.f23870u = f9Var.w;
            this.f23871v = f9Var.x;
            this.w = f9Var.f23850y;
            this.x = f9Var.f23851z;
            this.f23872y = f9Var.A;
            this.f23873z = f9Var.B;
            this.A = f9Var.C;
            this.B = f9Var.D;
            this.C = f9Var.E;
            this.D = f9Var.F;
        }

        public b a(int i2) {
            this.C = i2;
            return this;
        }

        public b b(int i2) {
            this.f23855f = i2;
            return this;
        }

        public b c(String str) {
            this.f23852a = str;
            return this;
        }

        public b d(String str) {
            this.f23853b = str;
            return this;
        }

        public b e(String str) {
            this.f23854c = str;
            return this;
        }

        public b f(String str) {
            this.f23860k = str;
            return this;
        }

        public b h(int i2) {
            this.f23852a = Integer.toString(i2);
            return this;
        }

        public b a(long j2) {
            this.f23864o = j2;
            return this;
        }

        public b b(String str) {
            this.f23859j = str;
            return this;
        }

        public b a(bf bfVar) {
            this.f23858i = bfVar;
            return this;
        }

        public b a(r3 r3Var) {
            this.w = r3Var;
            return this;
        }

        public b a(y6 y6Var) {
            this.f23863n = y6Var;
            return this;
        }

        public b a(String str) {
            this.f23857h = str;
            return this;
        }

        public b a(List list) {
            this.f23862m = list;
            return this;
        }

        public b a(byte[] bArr) {
            this.f23870u = bArr;
            return this;
        }

        public f9 a() {
            return new f9(this);
        }
    }

    private f9(b bVar) {
        this.f23830a = bVar.f23852a;
        this.f23831b = bVar.f23853b;
        this.f23832c = xp.f(bVar.f23854c);
        this.d = bVar.d;
        this.f23833f = bVar.e;
        int i2 = bVar.f23855f;
        this.f23834g = i2;
        int i3 = bVar.f23856g;
        this.f23835h = i3;
        this.f23836i = i3 != -1 ? i3 : i2;
        this.f23837j = bVar.f23857h;
        this.f23838k = bVar.f23858i;
        this.f23839l = bVar.f23859j;
        this.f23840m = bVar.f23860k;
        this.f23841n = bVar.f23861l;
        this.f23842o = bVar.f23862m == null ? Collections.emptyList() : bVar.f23862m;
        y6 y6Var = bVar.f23863n;
        this.f23843p = y6Var;
        this.f23844q = bVar.f23864o;
        this.f23845r = bVar.f23865p;
        this.f23846s = bVar.f23866q;
        this.f23847t = bVar.f23867r;
        this.f23848u = bVar.f23868s == -1 ? 0 : bVar.f23868s;
        this.f23849v = bVar.f23869t == -1.0f ? 1.0f : bVar.f23869t;
        this.w = bVar.f23870u;
        this.x = bVar.f23871v;
        this.f23850y = bVar.w;
        this.f23851z = bVar.x;
        this.A = bVar.f23872y;
        this.B = bVar.f23873z;
        this.C = bVar.A == -1 ? 0 : bVar.A;
        this.D = bVar.B != -1 ? bVar.B : 0;
        this.E = bVar.C;
        if (bVar.D != 0 || y6Var == null) {
            this.F = bVar.D;
        } else {
            this.F = 1;
        }
    }

    private static Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private static String c(int i2) {
        return b(12) + "_" + Integer.toString(i2, 36);
    }

    public boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj == null || f9.class != obj.getClass()) {
            return false;
        }
        f9 f9Var = (f9) obj;
        int i3 = this.G;
        if (i3 == 0 || (i2 = f9Var.G) == 0 || i3 == i2) {
            return this.d == f9Var.d && this.f23833f == f9Var.f23833f && this.f23834g == f9Var.f23834g && this.f23835h == f9Var.f23835h && this.f23841n == f9Var.f23841n && this.f23844q == f9Var.f23844q && this.f23845r == f9Var.f23845r && this.f23846s == f9Var.f23846s && this.f23848u == f9Var.f23848u && this.x == f9Var.x && this.f23851z == f9Var.f23851z && this.A == f9Var.A && this.B == f9Var.B && this.C == f9Var.C && this.D == f9Var.D && this.E == f9Var.E && this.F == f9Var.F && Float.compare(this.f23847t, f9Var.f23847t) == 0 && Float.compare(this.f23849v, f9Var.f23849v) == 0 && xp.a((Object) this.f23830a, (Object) f9Var.f23830a) && xp.a((Object) this.f23831b, (Object) f9Var.f23831b) && xp.a((Object) this.f23837j, (Object) f9Var.f23837j) && xp.a((Object) this.f23839l, (Object) f9Var.f23839l) && xp.a((Object) this.f23840m, (Object) f9Var.f23840m) && xp.a((Object) this.f23832c, (Object) f9Var.f23832c) && Arrays.equals(this.w, f9Var.w) && xp.a(this.f23838k, f9Var.f23838k) && xp.a(this.f23850y, f9Var.f23850y) && xp.a(this.f23843p, f9Var.f23843p) && a(f9Var);
        }
        return false;
    }

    public int hashCode() {
        if (this.G == 0) {
            String str = this.f23830a;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f23831b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f23832c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.f23833f) * 31) + this.f23834g) * 31) + this.f23835h) * 31;
            String str4 = this.f23837j;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            bf bfVar = this.f23838k;
            int hashCode5 = (hashCode4 + (bfVar == null ? 0 : bfVar.hashCode())) * 31;
            String str5 = this.f23839l;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f23840m;
            this.G = ((((((((((((((((Float.floatToIntBits(this.f23849v) + ((((Float.floatToIntBits(this.f23847t) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f23841n) * 31) + ((int) this.f23844q)) * 31) + this.f23845r) * 31) + this.f23846s) * 31)) * 31) + this.f23848u) * 31)) * 31) + this.x) * 31) + this.f23851z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f23830a);
        sb.append(", ");
        sb.append(this.f23831b);
        sb.append(", ");
        sb.append(this.f23839l);
        sb.append(", ");
        sb.append(this.f23840m);
        sb.append(", ");
        sb.append(this.f23837j);
        sb.append(", ");
        sb.append(this.f23836i);
        sb.append(", ");
        sb.append(this.f23832c);
        sb.append(", [");
        sb.append(this.f23845r);
        sb.append(", ");
        sb.append(this.f23846s);
        sb.append(", ");
        sb.append(this.f23847t);
        sb.append("], [");
        sb.append(this.f23851z);
        sb.append(", ");
        return androidx.compose.foundation.text.input.a.n(sb, this.A, "])");
    }

    public f9 a(int i2) {
        return a().d(i2).a();
    }

    public int b() {
        int i2;
        int i3 = this.f23845r;
        if (i3 == -1 || (i2 = this.f23846s) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    private static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    public boolean a(f9 f9Var) {
        if (this.f23842o.size() != f9Var.f23842o.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f23842o.size(); i2++) {
            if (!Arrays.equals((byte[]) this.f23842o.get(i2), (byte[]) f9Var.f23842o.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f9 a(Bundle bundle) {
        b bVar = new b();
        p2.a(bundle);
        int i2 = 0;
        String string = bundle.getString(b(0));
        f9 f9Var = H;
        bVar.c((String) a(string, f9Var.f23830a)).d((String) a(bundle.getString(b(1)), f9Var.f23831b)).e((String) a(bundle.getString(b(2)), f9Var.f23832c)).o(bundle.getInt(b(3), f9Var.d)).l(bundle.getInt(b(4), f9Var.f23833f)).b(bundle.getInt(b(5), f9Var.f23834g)).k(bundle.getInt(b(6), f9Var.f23835h)).a((String) a(bundle.getString(b(7)), f9Var.f23837j)).a((bf) a((bf) bundle.getParcelable(b(8)), f9Var.f23838k)).b((String) a(bundle.getString(b(9)), f9Var.f23839l)).f((String) a(bundle.getString(b(10)), f9Var.f23840m)).i(bundle.getInt(b(11), f9Var.f23841n));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(c(i2));
            if (byteArray == null) {
                b a2 = bVar.a(arrayList).a((y6) bundle.getParcelable(b(13)));
                String b2 = b(14);
                f9 f9Var2 = H;
                a2.a(bundle.getLong(b2, f9Var2.f23844q)).q(bundle.getInt(b(15), f9Var2.f23845r)).g(bundle.getInt(b(16), f9Var2.f23846s)).a(bundle.getFloat(b(17), f9Var2.f23847t)).m(bundle.getInt(b(18), f9Var2.f23848u)).b(bundle.getFloat(b(19), f9Var2.f23849v)).a(bundle.getByteArray(b(20))).p(bundle.getInt(b(21), f9Var2.x)).a((r3) p2.a(r3.f26255g, bundle.getBundle(b(22)))).c(bundle.getInt(b(23), f9Var2.f23851z)).n(bundle.getInt(b(24), f9Var2.A)).j(bundle.getInt(b(25), f9Var2.B)).e(bundle.getInt(b(26), f9Var2.C)).f(bundle.getInt(b(27), f9Var2.D)).a(bundle.getInt(b(28), f9Var2.E)).d(bundle.getInt(b(29), f9Var2.F));
                return bVar.a();
            }
            arrayList.add(byteArray);
            i2++;
        }
    }
}
