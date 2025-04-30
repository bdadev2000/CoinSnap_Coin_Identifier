package com.mbridge.msdk.newreward.a;

import com.mbridge.msdk.newout.RewardVideoListener;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    private int f16986A;

    /* renamed from: B, reason: collision with root package name */
    private long f16987B;

    /* renamed from: K, reason: collision with root package name */
    private RewardVideoListener f16996K;

    /* renamed from: a, reason: collision with root package name */
    public b f16997a;
    int b;

    /* renamed from: c, reason: collision with root package name */
    private String f16998c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16999d;

    /* renamed from: e, reason: collision with root package name */
    private int f17000e;

    /* renamed from: f, reason: collision with root package name */
    private int f17001f;

    /* renamed from: g, reason: collision with root package name */
    private int f17002g;

    /* renamed from: h, reason: collision with root package name */
    private int f17003h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17006k;
    private long m;

    /* renamed from: n, reason: collision with root package name */
    private long f17007n;

    /* renamed from: r, reason: collision with root package name */
    private String f17011r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f17012s;

    /* renamed from: u, reason: collision with root package name */
    private String f17014u;

    /* renamed from: v, reason: collision with root package name */
    private String f17015v;

    /* renamed from: w, reason: collision with root package name */
    private int f17016w;

    /* renamed from: x, reason: collision with root package name */
    private String f17017x;

    /* renamed from: y, reason: collision with root package name */
    private String f17018y;

    /* renamed from: i, reason: collision with root package name */
    private int f17004i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f17005j = 60000;
    private boolean l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17008o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f17009p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f17010q = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f17013t = false;

    /* renamed from: z, reason: collision with root package name */
    private String f17019z = "";

    /* renamed from: C, reason: collision with root package name */
    private boolean f16988C = false;

    /* renamed from: D, reason: collision with root package name */
    private boolean f16989D = false;

    /* renamed from: E, reason: collision with root package name */
    private boolean f16990E = false;

    /* renamed from: F, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.a f16991F = new com.mbridge.msdk.newreward.function.f.a();

    /* renamed from: G, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.d f16992G = new com.mbridge.msdk.newreward.function.f.d();

    /* renamed from: H, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.e f16993H = new com.mbridge.msdk.newreward.function.f.e();

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.f.c f16994I = new com.mbridge.msdk.newreward.function.f.c();

    /* renamed from: J, reason: collision with root package name */
    private int f16995J = 25000;

    public e(boolean z8, int i9, String str, String str2, boolean z9) {
        this.f16999d = z8;
        this.f17016w = i9;
        this.f17014u = str;
        this.f17015v = str2;
        this.f17006k = z9;
    }

    public final String A() {
        return this.f17015v;
    }

    public final boolean B() {
        return this.f16999d;
    }

    public final String C() {
        return this.f17014u;
    }

    public final RewardVideoListener D() {
        return this.f16996K;
    }

    public final int E() {
        return this.f17001f;
    }

    public final int F() {
        if (this.f16999d) {
            return 2;
        }
        return 3;
    }

    public final int G() {
        return this.f17000e;
    }

    public final int H() {
        return this.f17004i;
    }

    public final int I() {
        int i9 = this.f16995J;
        if (i9 <= 0) {
            return 25000;
        }
        return i9;
    }

    public final int J() {
        return this.f17005j;
    }

    public final boolean K() {
        return this.f17006k;
    }

    public final long L() {
        long f9;
        com.mbridge.msdk.newreward.function.f.a aVar = this.f16991F;
        if (aVar != null && aVar.b() != null && this.f16991F.b().n() > 0) {
            return this.f16991F.b().n();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.mbridge.msdk.videocommon.d.a a6 = this.f16993H.a();
        if (a6 == null) {
            f9 = 3600000;
        } else {
            f9 = a6.f();
        }
        return f9 + currentTimeMillis;
    }

    public final boolean a() {
        return this.f17012s;
    }

    public final String b() {
        return this.f17011r;
    }

    public final void c() {
        this.f17009p++;
    }

    public final void d() {
        this.f17010q++;
    }

    public final boolean e() {
        return this.f17008o;
    }

    public final long f() {
        return this.f17007n;
    }

    public final long g() {
        return this.m;
    }

    public final boolean h() {
        return this.l;
    }

    public final boolean i() {
        return this.f17013t;
    }

    public final int j() {
        return this.f17002g;
    }

    public final int k() {
        return this.f17003h;
    }

    public final boolean l() {
        return this.f16990E;
    }

    public final boolean m() {
        return this.f16989D;
    }

    public final boolean n() {
        return this.f16988C;
    }

    public final long o() {
        return this.f16987B;
    }

    public final int p() {
        return this.f17016w;
    }

    public final String q() {
        return this.f17019z;
    }

    public final com.mbridge.msdk.newreward.function.f.e r() {
        return this.f16993H;
    }

    public final int s() {
        return this.f16986A;
    }

    public final com.mbridge.msdk.newreward.function.f.c t() {
        return this.f16994I;
    }

    public final int u() {
        return this.b;
    }

    public final String v() {
        return this.f17017x;
    }

    public final String w() {
        return this.f17018y;
    }

    public final com.mbridge.msdk.newreward.function.f.a x() {
        return this.f16991F;
    }

    public final com.mbridge.msdk.newreward.function.f.d y() {
        return this.f16992G;
    }

    public final String z() {
        return this.f16998c;
    }

    public final void a(boolean z8) {
        this.f17012s = z8;
    }

    public final void b(boolean z8) {
        this.f17008o = z8;
    }

    public final void c(boolean z8) {
        this.l = z8;
    }

    public final void d(boolean z8) {
        this.f17013t = z8;
    }

    public final void e(boolean z8) {
        this.f16990E = z8;
    }

    public final void f(boolean z8) {
        this.f16989D = z8;
    }

    public final void g(boolean z8) {
        this.f16988C = z8;
    }

    public final void a(String str) {
        this.f17011r = str;
    }

    public final void b(long j7) {
        this.m = j7;
    }

    public final void c(long j7) {
        this.f16987B = j7;
    }

    public final void d(String str) {
        this.f17018y = str;
    }

    public final void e(String str) {
        this.f16998c = str;
    }

    public final void f(int i9) {
        this.f17005j = i9;
    }

    public final void a(long j7) {
        this.f17007n = j7;
    }

    public final void b(String str) {
        this.f17019z = str;
    }

    public final void c(int i9) {
        this.b = i9;
    }

    public final void d(int i9) {
        this.f17004i = i9;
    }

    public final void e(int i9) {
        this.f16995J = i9;
    }

    public final void a(int i9) {
        this.f17000e = i9;
    }

    public final void b(int i9) {
        this.f16986A = i9;
    }

    public final void c(String str) {
        this.f17017x = str;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.e eVar) {
        this.f16993H = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.a aVar) {
        this.f16991F = aVar;
    }

    public final void a(RewardVideoListener rewardVideoListener) {
        this.f16996K = rewardVideoListener;
    }

    public final void a(int i9, int i10, int i11) {
        this.f17001f = i9;
        this.f17002g = i10;
        this.f17003h = i11;
    }
}
