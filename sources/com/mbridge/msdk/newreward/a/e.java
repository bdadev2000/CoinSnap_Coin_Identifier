package com.mbridge.msdk.newreward.a;

import com.mbridge.msdk.newout.RewardVideoListener;

/* loaded from: classes4.dex */
public final class e {
    private int A;
    private long B;
    private RewardVideoListener K;
    public b a;

    /* renamed from: b, reason: collision with root package name */
    int f14392b;

    /* renamed from: c, reason: collision with root package name */
    private String f14393c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14394d;

    /* renamed from: e, reason: collision with root package name */
    private int f14395e;

    /* renamed from: f, reason: collision with root package name */
    private int f14396f;

    /* renamed from: g, reason: collision with root package name */
    private int f14397g;

    /* renamed from: h, reason: collision with root package name */
    private int f14398h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14401k;

    /* renamed from: m, reason: collision with root package name */
    private long f14403m;

    /* renamed from: n, reason: collision with root package name */
    private long f14404n;

    /* renamed from: r, reason: collision with root package name */
    private String f14408r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14409s;
    private String u;

    /* renamed from: v, reason: collision with root package name */
    private String f14411v;

    /* renamed from: w, reason: collision with root package name */
    private int f14412w;

    /* renamed from: x, reason: collision with root package name */
    private String f14413x;

    /* renamed from: y, reason: collision with root package name */
    private String f14414y;

    /* renamed from: i, reason: collision with root package name */
    private int f14399i = 2;

    /* renamed from: j, reason: collision with root package name */
    private int f14400j = 60000;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14402l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14405o = false;

    /* renamed from: p, reason: collision with root package name */
    private int f14406p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f14407q = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f14410t = false;

    /* renamed from: z, reason: collision with root package name */
    private String f14415z = "";
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private com.mbridge.msdk.newreward.function.f.a F = new com.mbridge.msdk.newreward.function.f.a();
    private com.mbridge.msdk.newreward.function.f.d G = new com.mbridge.msdk.newreward.function.f.d();
    private com.mbridge.msdk.newreward.function.f.e H = new com.mbridge.msdk.newreward.function.f.e();
    private com.mbridge.msdk.newreward.function.f.c I = new com.mbridge.msdk.newreward.function.f.c();
    private int J = 25000;

    public e(boolean z10, int i10, String str, String str2, boolean z11) {
        this.f14394d = z10;
        this.f14412w = i10;
        this.u = str;
        this.f14411v = str2;
        this.f14401k = z11;
    }

    public final String A() {
        return this.f14411v;
    }

    public final boolean B() {
        return this.f14394d;
    }

    public final String C() {
        return this.u;
    }

    public final RewardVideoListener D() {
        return this.K;
    }

    public final int E() {
        return this.f14396f;
    }

    public final int F() {
        return this.f14394d ? 2 : 3;
    }

    public final int G() {
        return this.f14395e;
    }

    public final int H() {
        return this.f14399i;
    }

    public final int I() {
        int i10 = this.J;
        if (i10 <= 0) {
            return 25000;
        }
        return i10;
    }

    public final int J() {
        return this.f14400j;
    }

    public final boolean K() {
        return this.f14401k;
    }

    public final long L() {
        long f10;
        com.mbridge.msdk.newreward.function.f.a aVar = this.F;
        if (aVar != null && aVar.b() != null && this.F.b().n() > 0) {
            return this.F.b().n();
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.mbridge.msdk.videocommon.d.a a = this.H.a();
        if (a == null) {
            f10 = 3600000;
        } else {
            f10 = a.f();
        }
        return f10 + currentTimeMillis;
    }

    public final boolean a() {
        return this.f14409s;
    }

    public final String b() {
        return this.f14408r;
    }

    public final void c() {
        this.f14406p++;
    }

    public final void d() {
        this.f14407q++;
    }

    public final boolean e() {
        return this.f14405o;
    }

    public final long f() {
        return this.f14404n;
    }

    public final long g() {
        return this.f14403m;
    }

    public final boolean h() {
        return this.f14402l;
    }

    public final boolean i() {
        return this.f14410t;
    }

    public final int j() {
        return this.f14397g;
    }

    public final int k() {
        return this.f14398h;
    }

    public final boolean l() {
        return this.E;
    }

    public final boolean m() {
        return this.D;
    }

    public final boolean n() {
        return this.C;
    }

    public final long o() {
        return this.B;
    }

    public final int p() {
        return this.f14412w;
    }

    public final String q() {
        return this.f14415z;
    }

    public final com.mbridge.msdk.newreward.function.f.e r() {
        return this.H;
    }

    public final int s() {
        return this.A;
    }

    public final com.mbridge.msdk.newreward.function.f.c t() {
        return this.I;
    }

    public final int u() {
        return this.f14392b;
    }

    public final String v() {
        return this.f14413x;
    }

    public final String w() {
        return this.f14414y;
    }

    public final com.mbridge.msdk.newreward.function.f.a x() {
        return this.F;
    }

    public final com.mbridge.msdk.newreward.function.f.d y() {
        return this.G;
    }

    public final String z() {
        return this.f14393c;
    }

    public final void a(boolean z10) {
        this.f14409s = z10;
    }

    public final void b(boolean z10) {
        this.f14405o = z10;
    }

    public final void c(boolean z10) {
        this.f14402l = z10;
    }

    public final void d(boolean z10) {
        this.f14410t = z10;
    }

    public final void e(boolean z10) {
        this.E = z10;
    }

    public final void f(boolean z10) {
        this.D = z10;
    }

    public final void g(boolean z10) {
        this.C = z10;
    }

    public final void a(String str) {
        this.f14408r = str;
    }

    public final void b(long j3) {
        this.f14403m = j3;
    }

    public final void c(long j3) {
        this.B = j3;
    }

    public final void d(String str) {
        this.f14414y = str;
    }

    public final void e(String str) {
        this.f14393c = str;
    }

    public final void f(int i10) {
        this.f14400j = i10;
    }

    public final void a(long j3) {
        this.f14404n = j3;
    }

    public final void b(String str) {
        this.f14415z = str;
    }

    public final void c(int i10) {
        this.f14392b = i10;
    }

    public final void d(int i10) {
        this.f14399i = i10;
    }

    public final void e(int i10) {
        this.J = i10;
    }

    public final void a(int i10) {
        this.f14395e = i10;
    }

    public final void b(int i10) {
        this.A = i10;
    }

    public final void c(String str) {
        this.f14413x = str;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.e eVar) {
        this.H = eVar;
    }

    public final void a(com.mbridge.msdk.newreward.function.f.a aVar) {
        this.F = aVar;
    }

    public final void a(RewardVideoListener rewardVideoListener) {
        this.K = rewardVideoListener;
    }

    public final void a(int i10, int i11, int i12) {
        this.f14396f = i10;
        this.f14397g = i11;
        this.f14398h = i12;
    }
}
