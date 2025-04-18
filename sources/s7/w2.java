package s7;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class w2 implements i {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;

    /* renamed from: t, reason: collision with root package name */
    public static final Object f24833t = new Object();
    public static final Object u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static final j1 f24834v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f24835w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f24836x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f24837y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f24838z;

    /* renamed from: c, reason: collision with root package name */
    public Object f24840c;

    /* renamed from: f, reason: collision with root package name */
    public Object f24842f;

    /* renamed from: g, reason: collision with root package name */
    public long f24843g;

    /* renamed from: h, reason: collision with root package name */
    public long f24844h;

    /* renamed from: i, reason: collision with root package name */
    public long f24845i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24846j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24847k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f24848l;

    /* renamed from: m, reason: collision with root package name */
    public d1 f24849m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24850n;

    /* renamed from: o, reason: collision with root package name */
    public long f24851o;

    /* renamed from: p, reason: collision with root package name */
    public long f24852p;

    /* renamed from: q, reason: collision with root package name */
    public int f24853q;

    /* renamed from: r, reason: collision with root package name */
    public int f24854r;

    /* renamed from: s, reason: collision with root package name */
    public long f24855s;

    /* renamed from: b, reason: collision with root package name */
    public Object f24839b = f24833t;

    /* renamed from: d, reason: collision with root package name */
    public j1 f24841d = f24834v;

    static {
        w0 w0Var = new w0();
        w0Var.a = "com.google.android.exoplayer2.Timeline";
        w0Var.f24810b = Uri.EMPTY;
        f24834v = w0Var.a();
        f24835w = n9.h0.E(1);
        f24836x = n9.h0.E(2);
        f24837y = n9.h0.E(3);
        f24838z = n9.h0.E(4);
        A = n9.h0.E(5);
        B = n9.h0.E(6);
        C = n9.h0.E(7);
        D = n9.h0.E(8);
        E = n9.h0.E(9);
        F = n9.h0.E(10);
        G = n9.h0.E(11);
        H = n9.h0.E(12);
        I = n9.h0.E(13);
        new nb.a(13);
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f24848l;
        if (this.f24849m != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        v8.u0.m(z11);
        if (this.f24849m != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, j1 j1Var, Object obj2, long j3, long j10, long j11, boolean z10, boolean z11, d1 d1Var, long j12, long j13, int i10, int i11, long j14) {
        j1 j1Var2;
        Object obj3;
        boolean z12;
        e1 e1Var;
        this.f24839b = obj;
        if (j1Var != null) {
            j1Var2 = j1Var;
        } else {
            j1Var2 = f24834v;
        }
        this.f24841d = j1Var2;
        if (j1Var != null && (e1Var = j1Var.f24453c) != null) {
            obj3 = e1Var.f24349j;
        } else {
            obj3 = null;
        }
        this.f24840c = obj3;
        this.f24842f = obj2;
        this.f24843g = j3;
        this.f24844h = j10;
        this.f24845i = j11;
        this.f24846j = z10;
        this.f24847k = z11;
        if (d1Var != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f24848l = z12;
        this.f24849m = d1Var;
        this.f24851o = j12;
        this.f24852p = j13;
        this.f24853q = i10;
        this.f24854r = i11;
        this.f24855s = j14;
        this.f24850n = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !w2.class.equals(obj.getClass())) {
            return false;
        }
        w2 w2Var = (w2) obj;
        if (n9.h0.a(this.f24839b, w2Var.f24839b) && n9.h0.a(this.f24841d, w2Var.f24841d) && n9.h0.a(this.f24842f, w2Var.f24842f) && n9.h0.a(this.f24849m, w2Var.f24849m) && this.f24843g == w2Var.f24843g && this.f24844h == w2Var.f24844h && this.f24845i == w2Var.f24845i && this.f24846j == w2Var.f24846j && this.f24847k == w2Var.f24847k && this.f24850n == w2Var.f24850n && this.f24851o == w2Var.f24851o && this.f24852p == w2Var.f24852p && this.f24853q == w2Var.f24853q && this.f24854r == w2Var.f24854r && this.f24855s == w2Var.f24855s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f24841d.hashCode() + ((this.f24839b.hashCode() + 217) * 31)) * 31;
        Object obj = this.f24842f;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (hashCode2 + hashCode) * 31;
        d1 d1Var = this.f24849m;
        if (d1Var != null) {
            i10 = d1Var.hashCode();
        }
        int i12 = (i11 + i10) * 31;
        long j3 = this.f24843g;
        int i13 = (i12 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j10 = this.f24844h;
        int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f24845i;
        int i15 = (((((((i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f24846j ? 1 : 0)) * 31) + (this.f24847k ? 1 : 0)) * 31) + (this.f24850n ? 1 : 0)) * 31;
        long j12 = this.f24851o;
        int i16 = (i15 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f24852p;
        int i17 = (((((i16 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f24853q) * 31) + this.f24854r) * 31;
        long j14 = this.f24855s;
        return i17 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
