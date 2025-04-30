package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC0725m2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class d9 implements InterfaceC0725m2 {

    /* renamed from: H, reason: collision with root package name */
    private static final d9 f7193H = new b().a();

    /* renamed from: I, reason: collision with root package name */
    public static final InterfaceC0725m2.a f7194I = new I(12);

    /* renamed from: A, reason: collision with root package name */
    public final int f7195A;

    /* renamed from: B, reason: collision with root package name */
    public final int f7196B;

    /* renamed from: C, reason: collision with root package name */
    public final int f7197C;

    /* renamed from: D, reason: collision with root package name */
    public final int f7198D;

    /* renamed from: E, reason: collision with root package name */
    public final int f7199E;

    /* renamed from: F, reason: collision with root package name */
    public final int f7200F;

    /* renamed from: G, reason: collision with root package name */
    private int f7201G;

    /* renamed from: a, reason: collision with root package name */
    public final String f7202a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7203c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7204d;

    /* renamed from: f, reason: collision with root package name */
    public final int f7205f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7206g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7207h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7208i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7209j;

    /* renamed from: k, reason: collision with root package name */
    public final we f7210k;
    public final String l;
    public final String m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7211n;

    /* renamed from: o, reason: collision with root package name */
    public final List f7212o;

    /* renamed from: p, reason: collision with root package name */
    public final w6 f7213p;

    /* renamed from: q, reason: collision with root package name */
    public final long f7214q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7215r;

    /* renamed from: s, reason: collision with root package name */
    public final int f7216s;

    /* renamed from: t, reason: collision with root package name */
    public final float f7217t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7218u;

    /* renamed from: v, reason: collision with root package name */
    public final float f7219v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f7220w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7221x;

    /* renamed from: y, reason: collision with root package name */
    public final p3 f7222y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7223z;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        private int f7224A;

        /* renamed from: B, reason: collision with root package name */
        private int f7225B;

        /* renamed from: C, reason: collision with root package name */
        private int f7226C;

        /* renamed from: D, reason: collision with root package name */
        private int f7227D;

        /* renamed from: a, reason: collision with root package name */
        private String f7228a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private String f7229c;

        /* renamed from: d, reason: collision with root package name */
        private int f7230d;

        /* renamed from: e, reason: collision with root package name */
        private int f7231e;

        /* renamed from: f, reason: collision with root package name */
        private int f7232f;

        /* renamed from: g, reason: collision with root package name */
        private int f7233g;

        /* renamed from: h, reason: collision with root package name */
        private String f7234h;

        /* renamed from: i, reason: collision with root package name */
        private we f7235i;

        /* renamed from: j, reason: collision with root package name */
        private String f7236j;

        /* renamed from: k, reason: collision with root package name */
        private String f7237k;
        private int l;
        private List m;

        /* renamed from: n, reason: collision with root package name */
        private w6 f7238n;

        /* renamed from: o, reason: collision with root package name */
        private long f7239o;

        /* renamed from: p, reason: collision with root package name */
        private int f7240p;

        /* renamed from: q, reason: collision with root package name */
        private int f7241q;

        /* renamed from: r, reason: collision with root package name */
        private float f7242r;

        /* renamed from: s, reason: collision with root package name */
        private int f7243s;

        /* renamed from: t, reason: collision with root package name */
        private float f7244t;

        /* renamed from: u, reason: collision with root package name */
        private byte[] f7245u;

        /* renamed from: v, reason: collision with root package name */
        private int f7246v;

        /* renamed from: w, reason: collision with root package name */
        private p3 f7247w;

        /* renamed from: x, reason: collision with root package name */
        private int f7248x;

        /* renamed from: y, reason: collision with root package name */
        private int f7249y;

        /* renamed from: z, reason: collision with root package name */
        private int f7250z;

        public b() {
            this.f7232f = -1;
            this.f7233g = -1;
            this.l = -1;
            this.f7239o = Long.MAX_VALUE;
            this.f7240p = -1;
            this.f7241q = -1;
            this.f7242r = -1.0f;
            this.f7244t = 1.0f;
            this.f7246v = -1;
            this.f7248x = -1;
            this.f7249y = -1;
            this.f7250z = -1;
            this.f7226C = -1;
            this.f7227D = 0;
        }

        public b a(int i9) {
            this.f7226C = i9;
            return this;
        }

        public b b(int i9) {
            this.f7232f = i9;
            return this;
        }

        public b c(int i9) {
            this.f7248x = i9;
            return this;
        }

        public b d(int i9) {
            this.f7227D = i9;
            return this;
        }

        public b e(int i9) {
            this.f7224A = i9;
            return this;
        }

        public b f(int i9) {
            this.f7225B = i9;
            return this;
        }

        public b g(int i9) {
            this.f7241q = i9;
            return this;
        }

        public b h(int i9) {
            this.f7228a = Integer.toString(i9);
            return this;
        }

        public b i(int i9) {
            this.l = i9;
            return this;
        }

        public b j(int i9) {
            this.f7250z = i9;
            return this;
        }

        public b k(int i9) {
            this.f7233g = i9;
            return this;
        }

        public b l(int i9) {
            this.f7231e = i9;
            return this;
        }

        public b m(int i9) {
            this.f7243s = i9;
            return this;
        }

        public b n(int i9) {
            this.f7249y = i9;
            return this;
        }

        public b o(int i9) {
            this.f7230d = i9;
            return this;
        }

        public b p(int i9) {
            this.f7246v = i9;
            return this;
        }

        public b q(int i9) {
            this.f7240p = i9;
            return this;
        }

        public b a(String str) {
            this.f7234h = str;
            return this;
        }

        public b b(String str) {
            this.f7236j = str;
            return this;
        }

        public b c(String str) {
            this.f7228a = str;
            return this;
        }

        public b d(String str) {
            this.b = str;
            return this;
        }

        public b e(String str) {
            this.f7229c = str;
            return this;
        }

        public b f(String str) {
            this.f7237k = str;
            return this;
        }

        public b a(p3 p3Var) {
            this.f7247w = p3Var;
            return this;
        }

        public b b(float f9) {
            this.f7244t = f9;
            return this;
        }

        public b a(w6 w6Var) {
            this.f7238n = w6Var;
            return this;
        }

        public b a(float f9) {
            this.f7242r = f9;
            return this;
        }

        public b a(List list) {
            this.m = list;
            return this;
        }

        public b a(we weVar) {
            this.f7235i = weVar;
            return this;
        }

        public b a(byte[] bArr) {
            this.f7245u = bArr;
            return this;
        }

        public b a(long j7) {
            this.f7239o = j7;
            return this;
        }

        public d9 a() {
            return new d9(this);
        }

        private b(d9 d9Var) {
            this.f7228a = d9Var.f7202a;
            this.b = d9Var.b;
            this.f7229c = d9Var.f7203c;
            this.f7230d = d9Var.f7204d;
            this.f7231e = d9Var.f7205f;
            this.f7232f = d9Var.f7206g;
            this.f7233g = d9Var.f7207h;
            this.f7234h = d9Var.f7209j;
            this.f7235i = d9Var.f7210k;
            this.f7236j = d9Var.l;
            this.f7237k = d9Var.m;
            this.l = d9Var.f7211n;
            this.m = d9Var.f7212o;
            this.f7238n = d9Var.f7213p;
            this.f7239o = d9Var.f7214q;
            this.f7240p = d9Var.f7215r;
            this.f7241q = d9Var.f7216s;
            this.f7242r = d9Var.f7217t;
            this.f7243s = d9Var.f7218u;
            this.f7244t = d9Var.f7219v;
            this.f7245u = d9Var.f7220w;
            this.f7246v = d9Var.f7221x;
            this.f7247w = d9Var.f7222y;
            this.f7248x = d9Var.f7223z;
            this.f7249y = d9Var.f7195A;
            this.f7250z = d9Var.f7196B;
            this.f7224A = d9Var.f7197C;
            this.f7225B = d9Var.f7198D;
            this.f7226C = d9Var.f7199E;
            this.f7227D = d9Var.f7200F;
        }
    }

    private d9(b bVar) {
        this.f7202a = bVar.f7228a;
        this.b = bVar.b;
        this.f7203c = yp.f(bVar.f7229c);
        this.f7204d = bVar.f7230d;
        this.f7205f = bVar.f7231e;
        int i9 = bVar.f7232f;
        this.f7206g = i9;
        int i10 = bVar.f7233g;
        this.f7207h = i10;
        this.f7208i = i10 != -1 ? i10 : i9;
        this.f7209j = bVar.f7234h;
        this.f7210k = bVar.f7235i;
        this.l = bVar.f7236j;
        this.m = bVar.f7237k;
        this.f7211n = bVar.l;
        this.f7212o = bVar.m == null ? Collections.emptyList() : bVar.m;
        w6 w6Var = bVar.f7238n;
        this.f7213p = w6Var;
        this.f7214q = bVar.f7239o;
        this.f7215r = bVar.f7240p;
        this.f7216s = bVar.f7241q;
        this.f7217t = bVar.f7242r;
        this.f7218u = bVar.f7243s == -1 ? 0 : bVar.f7243s;
        this.f7219v = bVar.f7244t == -1.0f ? 1.0f : bVar.f7244t;
        this.f7220w = bVar.f7245u;
        this.f7221x = bVar.f7246v;
        this.f7222y = bVar.f7247w;
        this.f7223z = bVar.f7248x;
        this.f7195A = bVar.f7249y;
        this.f7196B = bVar.f7250z;
        this.f7197C = bVar.f7224A == -1 ? 0 : bVar.f7224A;
        this.f7198D = bVar.f7225B != -1 ? bVar.f7225B : 0;
        this.f7199E = bVar.f7226C;
        if (bVar.f7227D != 0 || w6Var == null) {
            this.f7200F = bVar.f7227D;
        } else {
            this.f7200F = 1;
        }
    }

    private static Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private static String c(int i9) {
        return b(12) + "_" + Integer.toString(i9, 36);
    }

    public boolean equals(Object obj) {
        int i9;
        if (this == obj) {
            return true;
        }
        if (obj == null || d9.class != obj.getClass()) {
            return false;
        }
        d9 d9Var = (d9) obj;
        int i10 = this.f7201G;
        if (i10 != 0 && (i9 = d9Var.f7201G) != 0 && i10 != i9) {
            return false;
        }
        if (this.f7204d == d9Var.f7204d && this.f7205f == d9Var.f7205f && this.f7206g == d9Var.f7206g && this.f7207h == d9Var.f7207h && this.f7211n == d9Var.f7211n && this.f7214q == d9Var.f7214q && this.f7215r == d9Var.f7215r && this.f7216s == d9Var.f7216s && this.f7218u == d9Var.f7218u && this.f7221x == d9Var.f7221x && this.f7223z == d9Var.f7223z && this.f7195A == d9Var.f7195A && this.f7196B == d9Var.f7196B && this.f7197C == d9Var.f7197C && this.f7198D == d9Var.f7198D && this.f7199E == d9Var.f7199E && this.f7200F == d9Var.f7200F && Float.compare(this.f7217t, d9Var.f7217t) == 0 && Float.compare(this.f7219v, d9Var.f7219v) == 0 && yp.a((Object) this.f7202a, (Object) d9Var.f7202a) && yp.a((Object) this.b, (Object) d9Var.b) && yp.a((Object) this.f7209j, (Object) d9Var.f7209j) && yp.a((Object) this.l, (Object) d9Var.l) && yp.a((Object) this.m, (Object) d9Var.m) && yp.a((Object) this.f7203c, (Object) d9Var.f7203c) && Arrays.equals(this.f7220w, d9Var.f7220w) && yp.a(this.f7210k, d9Var.f7210k) && yp.a(this.f7222y, d9Var.f7222y) && yp.a(this.f7213p, d9Var.f7213p) && a(d9Var)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i9;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.f7201G == 0) {
            String str = this.f7202a;
            int i10 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (hashCode + 527) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i9 = str2.hashCode();
            } else {
                i9 = 0;
            }
            int i12 = (i11 + i9) * 31;
            String str3 = this.f7203c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i13 = (((((((((i12 + hashCode2) * 31) + this.f7204d) * 31) + this.f7205f) * 31) + this.f7206g) * 31) + this.f7207h) * 31;
            String str4 = this.f7209j;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            we weVar = this.f7210k;
            if (weVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = weVar.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str5 = this.l;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            String str6 = this.m;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            this.f7201G = ((((((((((((((((Float.floatToIntBits(this.f7219v) + ((((Float.floatToIntBits(this.f7217t) + ((((((((((i16 + i10) * 31) + this.f7211n) * 31) + ((int) this.f7214q)) * 31) + this.f7215r) * 31) + this.f7216s) * 31)) * 31) + this.f7218u) * 31)) * 31) + this.f7221x) * 31) + this.f7223z) * 31) + this.f7195A) * 31) + this.f7196B) * 31) + this.f7197C) * 31) + this.f7198D) * 31) + this.f7199E) * 31) + this.f7200F;
        }
        return this.f7201G;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f7202a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.f7209j);
        sb.append(", ");
        sb.append(this.f7208i);
        sb.append(", ");
        sb.append(this.f7203c);
        sb.append(", [");
        sb.append(this.f7215r);
        sb.append(", ");
        sb.append(this.f7216s);
        sb.append(", ");
        sb.append(this.f7217t);
        sb.append("], [");
        sb.append(this.f7223z);
        sb.append(", ");
        return AbstractC2914a.g(sb, this.f7195A, "])");
    }

    public d9 a(int i9) {
        return a().d(i9).a();
    }

    public int b() {
        int i9;
        int i10 = this.f7215r;
        if (i10 == -1 || (i9 = this.f7216s) == -1) {
            return -1;
        }
        return i10 * i9;
    }

    private static String b(int i9) {
        return Integer.toString(i9, 36);
    }

    public boolean a(d9 d9Var) {
        if (this.f7212o.size() != d9Var.f7212o.size()) {
            return false;
        }
        for (int i9 = 0; i9 < this.f7212o.size(); i9++) {
            if (!Arrays.equals((byte[]) this.f7212o.get(i9), (byte[]) d9Var.f7212o.get(i9))) {
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
        AbstractC0729n2.a(bundle);
        int i9 = 0;
        String string = bundle.getString(b(0));
        d9 d9Var = f7193H;
        bVar.c((String) a(string, d9Var.f7202a)).d((String) a(bundle.getString(b(1)), d9Var.b)).e((String) a(bundle.getString(b(2)), d9Var.f7203c)).o(bundle.getInt(b(3), d9Var.f7204d)).l(bundle.getInt(b(4), d9Var.f7205f)).b(bundle.getInt(b(5), d9Var.f7206g)).k(bundle.getInt(b(6), d9Var.f7207h)).a((String) a(bundle.getString(b(7)), d9Var.f7209j)).a((we) a((we) bundle.getParcelable(b(8)), d9Var.f7210k)).b((String) a(bundle.getString(b(9)), d9Var.l)).f((String) a(bundle.getString(b(10)), d9Var.m)).i(bundle.getInt(b(11), d9Var.f7211n));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(c(i9));
            if (byteArray == null) {
                b a6 = bVar.a(arrayList).a((w6) bundle.getParcelable(b(13)));
                String b8 = b(14);
                d9 d9Var2 = f7193H;
                a6.a(bundle.getLong(b8, d9Var2.f7214q)).q(bundle.getInt(b(15), d9Var2.f7215r)).g(bundle.getInt(b(16), d9Var2.f7216s)).a(bundle.getFloat(b(17), d9Var2.f7217t)).m(bundle.getInt(b(18), d9Var2.f7218u)).b(bundle.getFloat(b(19), d9Var2.f7219v)).a(bundle.getByteArray(b(20))).p(bundle.getInt(b(21), d9Var2.f7221x)).a((p3) AbstractC0729n2.a(p3.f9968g, bundle.getBundle(b(22)))).c(bundle.getInt(b(23), d9Var2.f7223z)).n(bundle.getInt(b(24), d9Var2.f7195A)).j(bundle.getInt(b(25), d9Var2.f7196B)).e(bundle.getInt(b(26), d9Var2.f7197C)).f(bundle.getInt(b(27), d9Var2.f7198D)).a(bundle.getInt(b(28), d9Var2.f7199E)).d(bundle.getInt(b(29), d9Var2.f7200F));
                return bVar.a();
            }
            arrayList.add(byteArray);
            i9++;
        }
    }
}
