package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.k;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class j implements o7 {
    private final xg a;

    /* renamed from: b, reason: collision with root package name */
    private final yg f5392b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5393c;

    /* renamed from: d, reason: collision with root package name */
    private String f5394d;

    /* renamed from: e, reason: collision with root package name */
    private ro f5395e;

    /* renamed from: f, reason: collision with root package name */
    private int f5396f;

    /* renamed from: g, reason: collision with root package name */
    private int f5397g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5398h;

    /* renamed from: i, reason: collision with root package name */
    private long f5399i;

    /* renamed from: j, reason: collision with root package name */
    private d9 f5400j;

    /* renamed from: k, reason: collision with root package name */
    private int f5401k;

    /* renamed from: l, reason: collision with root package name */
    private long f5402l;

    public j() {
        this(null);
    }

    private void c() {
        this.a.c(0);
        k.b a = k.a(this.a);
        d9 d9Var = this.f5400j;
        if (d9Var == null || a.f5559d != d9Var.f4240z || a.f5558c != d9Var.A || !yp.a((Object) a.a, (Object) d9Var.f4228m)) {
            d9 a10 = new d9.b().c(this.f5394d).f(a.a).c(a.f5559d).n(a.f5558c).e(this.f5393c).a();
            this.f5400j = a10;
            this.f5395e.a(a10);
        }
        this.f5401k = a.f5560e;
        this.f5399i = (a.f5561f * 1000000) / this.f5400j.A;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.f5395e);
        while (ygVar.a() > 0) {
            int i10 = this.f5396f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(ygVar.a(), this.f5401k - this.f5397g);
                        this.f5395e.a(ygVar, min);
                        int i11 = this.f5397g + min;
                        this.f5397g = i11;
                        int i12 = this.f5401k;
                        if (i11 == i12) {
                            long j3 = this.f5402l;
                            if (j3 != C.TIME_UNSET) {
                                this.f5395e.a(j3, 1, i12, 0, null);
                                this.f5402l += this.f5399i;
                            }
                            this.f5396f = 0;
                        }
                    }
                } else if (a(ygVar, this.f5392b.c(), 128)) {
                    c();
                    this.f5392b.f(0);
                    this.f5395e.a(this.f5392b, 128);
                    this.f5396f = 2;
                }
            } else if (b(ygVar)) {
                this.f5396f = 1;
                this.f5392b.c()[0] = Ascii.VT;
                this.f5392b.c()[1] = 119;
                this.f5397g = 2;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public j(String str) {
        xg xgVar = new xg(new byte[128]);
        this.a = xgVar;
        this.f5392b = new yg(xgVar.a);
        this.f5396f = 0;
        this.f5402l = C.TIME_UNSET;
        this.f5393c = str;
    }

    private boolean b(yg ygVar) {
        while (true) {
            if (ygVar.a() <= 0) {
                return false;
            }
            if (!this.f5398h) {
                this.f5398h = ygVar.w() == 11;
            } else {
                int w10 = ygVar.w();
                if (w10 == 119) {
                    this.f5398h = false;
                    return true;
                }
                this.f5398h = w10 == 11;
            }
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f5397g);
        ygVar.a(bArr, this.f5397g, min);
        int i11 = this.f5397g + min;
        this.f5397g = i11;
        return i11 == i10;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f5394d = dVar.b();
        this.f5395e = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f5402l = j3;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f5396f = 0;
        this.f5397g = 0;
        this.f5398h = false;
        this.f5402l = C.TIME_UNSET;
    }
}
