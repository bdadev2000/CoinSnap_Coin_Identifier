package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.AbstractC0714k;
import com.applovin.impl.d9;
import com.applovin.impl.ep;

/* renamed from: com.applovin.impl.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710j implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private final xg f8349a;
    private final yg b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8350c;

    /* renamed from: d, reason: collision with root package name */
    private String f8351d;

    /* renamed from: e, reason: collision with root package name */
    private ro f8352e;

    /* renamed from: f, reason: collision with root package name */
    private int f8353f;

    /* renamed from: g, reason: collision with root package name */
    private int f8354g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8355h;

    /* renamed from: i, reason: collision with root package name */
    private long f8356i;

    /* renamed from: j, reason: collision with root package name */
    private d9 f8357j;

    /* renamed from: k, reason: collision with root package name */
    private int f8358k;
    private long l;

    public C0710j() {
        this(null);
    }

    private void c() {
        this.f8349a.c(0);
        AbstractC0714k.b a6 = AbstractC0714k.a(this.f8349a);
        d9 d9Var = this.f8357j;
        if (d9Var == null || a6.f8507d != d9Var.f7223z || a6.f8506c != d9Var.f7195A || !yp.a((Object) a6.f8505a, (Object) d9Var.m)) {
            d9 a9 = new d9.b().c(this.f8351d).f(a6.f8505a).c(a6.f8507d).n(a6.f8506c).e(this.f8350c).a();
            this.f8357j = a9;
            this.f8352e.a(a9);
        }
        this.f8358k = a6.f8508e;
        this.f8356i = (a6.f8509f * 1000000) / this.f8357j.f7195A;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        AbstractC0669a1.b(this.f8352e);
        while (ygVar.a() > 0) {
            int i9 = this.f8353f;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int min = Math.min(ygVar.a(), this.f8358k - this.f8354g);
                        this.f8352e.a(ygVar, min);
                        int i10 = this.f8354g + min;
                        this.f8354g = i10;
                        int i11 = this.f8358k;
                        if (i10 == i11) {
                            long j7 = this.l;
                            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                this.f8352e.a(j7, 1, i11, 0, null);
                                this.l += this.f8356i;
                            }
                            this.f8353f = 0;
                        }
                    }
                } else if (a(ygVar, this.b.c(), 128)) {
                    c();
                    this.b.f(0);
                    this.f8352e.a(this.b, 128);
                    this.f8353f = 2;
                }
            } else if (b(ygVar)) {
                this.f8353f = 1;
                this.b.c()[0] = Ascii.VT;
                this.b.c()[1] = 119;
                this.f8354g = 2;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public C0710j(String str) {
        xg xgVar = new xg(new byte[128]);
        this.f8349a = xgVar;
        this.b = new yg(xgVar.f12177a);
        this.f8353f = 0;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f8350c = str;
    }

    private boolean b(yg ygVar) {
        while (true) {
            if (ygVar.a() <= 0) {
                return false;
            }
            if (!this.f8355h) {
                this.f8355h = ygVar.w() == 11;
            } else {
                int w2 = ygVar.w();
                if (w2 == 119) {
                    this.f8355h = false;
                    return true;
                }
                this.f8355h = w2 == 11;
            }
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i9) {
        int min = Math.min(ygVar.a(), i9 - this.f8354g);
        ygVar.a(bArr, this.f8354g, min);
        int i10 = this.f8354g + min;
        this.f8354g = i10;
        return i10 == i9;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f8351d = dVar.b();
        this.f8352e = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.l = j7;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f8353f = 0;
        this.f8354g = 0;
        this.f8355h = false;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
