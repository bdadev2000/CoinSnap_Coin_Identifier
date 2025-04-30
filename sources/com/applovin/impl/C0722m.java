package com.applovin.impl;

import com.applovin.impl.AbstractC0726n;
import com.applovin.impl.d9;
import com.applovin.impl.ep;

/* renamed from: com.applovin.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722m implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final xg f8877a;
    private final yg b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8878c;

    /* renamed from: d, reason: collision with root package name */
    private String f8879d;

    /* renamed from: e, reason: collision with root package name */
    private ro f8880e;

    /* renamed from: f, reason: collision with root package name */
    private int f8881f;

    /* renamed from: g, reason: collision with root package name */
    private int f8882g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8883h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8884i;

    /* renamed from: j, reason: collision with root package name */
    private long f8885j;

    /* renamed from: k, reason: collision with root package name */
    private d9 f8886k;
    private int l;
    private long m;

    public C0722m() {
        this(null);
    }

    private void c() {
        this.f8877a.c(0);
        AbstractC0726n.b a6 = AbstractC0726n.a(this.f8877a);
        d9 d9Var = this.f8886k;
        if (d9Var == null || a6.f9255c != d9Var.f7223z || a6.b != d9Var.f7195A || !"audio/ac4".equals(d9Var.m)) {
            d9 a9 = new d9.b().c(this.f8879d).f("audio/ac4").c(a6.f9255c).n(a6.b).e(this.f8878c).a();
            this.f8886k = a9;
            this.f8880e.a(a9);
        }
        this.l = a6.f9256d;
        this.f8885j = (a6.f9257e * 1000000) / this.f8886k.f7195A;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        AbstractC0669a1.b(this.f8880e);
        while (ygVar.a() > 0) {
            int i9 = this.f8881f;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int min = Math.min(ygVar.a(), this.l - this.f8882g);
                        this.f8880e.a(ygVar, min);
                        int i10 = this.f8882g + min;
                        this.f8882g = i10;
                        int i11 = this.l;
                        if (i10 == i11) {
                            long j7 = this.m;
                            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                this.f8880e.a(j7, 1, i11, 0, null);
                                this.m += this.f8885j;
                            }
                            this.f8881f = 0;
                        }
                    }
                } else if (a(ygVar, this.b.c(), 16)) {
                    c();
                    this.b.f(0);
                    this.f8880e.a(this.b, 16);
                    this.f8881f = 2;
                }
            } else if (b(ygVar)) {
                this.f8881f = 1;
                this.b.c()[0] = -84;
                this.b.c()[1] = (byte) (this.f8884i ? 65 : 64);
                this.f8882g = 2;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public C0722m(String str) {
        xg xgVar = new xg(new byte[16]);
        this.f8877a = xgVar;
        this.b = new yg(xgVar.f12177a);
        this.f8881f = 0;
        this.f8882g = 0;
        this.f8883h = false;
        this.f8884i = false;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8878c = str;
    }

    private boolean b(yg ygVar) {
        int w2;
        while (true) {
            if (ygVar.a() <= 0) {
                return false;
            }
            if (!this.f8883h) {
                this.f8883h = ygVar.w() == 172;
            } else {
                w2 = ygVar.w();
                this.f8883h = w2 == 172;
                if (w2 == 64 || w2 == 65) {
                    break;
                }
            }
        }
        this.f8884i = w2 == 65;
        return true;
    }

    private boolean a(yg ygVar, byte[] bArr, int i9) {
        int min = Math.min(ygVar.a(), i9 - this.f8882g);
        ygVar.a(bArr, this.f8882g, min);
        int i10 = this.f8882g + min;
        this.f8882g = i10;
        return i10 == i9;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f8879d = dVar.b();
        this.f8880e = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.m = j7;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f8881f = 0;
        this.f8882g = 0;
        this.f8883h = false;
        this.f8884i = false;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
