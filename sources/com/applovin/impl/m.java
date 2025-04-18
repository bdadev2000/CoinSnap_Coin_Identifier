package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.n;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class m implements o7 {
    private final xg a;

    /* renamed from: b, reason: collision with root package name */
    private final yg f5925b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5926c;

    /* renamed from: d, reason: collision with root package name */
    private String f5927d;

    /* renamed from: e, reason: collision with root package name */
    private ro f5928e;

    /* renamed from: f, reason: collision with root package name */
    private int f5929f;

    /* renamed from: g, reason: collision with root package name */
    private int f5930g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5931h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5932i;

    /* renamed from: j, reason: collision with root package name */
    private long f5933j;

    /* renamed from: k, reason: collision with root package name */
    private d9 f5934k;

    /* renamed from: l, reason: collision with root package name */
    private int f5935l;

    /* renamed from: m, reason: collision with root package name */
    private long f5936m;

    public m() {
        this(null);
    }

    private void c() {
        this.a.c(0);
        n.b a = n.a(this.a);
        d9 d9Var = this.f5934k;
        if (d9Var == null || a.f6332c != d9Var.f4240z || a.f6331b != d9Var.A || !"audio/ac4".equals(d9Var.f4228m)) {
            d9 a10 = new d9.b().c(this.f5927d).f("audio/ac4").c(a.f6332c).n(a.f6331b).e(this.f5926c).a();
            this.f5934k = a10;
            this.f5928e.a(a10);
        }
        this.f5935l = a.f6333d;
        this.f5933j = (a.f6334e * 1000000) / this.f5934k.A;
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.f5928e);
        while (ygVar.a() > 0) {
            int i10 = this.f5929f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(ygVar.a(), this.f5935l - this.f5930g);
                        this.f5928e.a(ygVar, min);
                        int i11 = this.f5930g + min;
                        this.f5930g = i11;
                        int i12 = this.f5935l;
                        if (i11 == i12) {
                            long j3 = this.f5936m;
                            if (j3 != C.TIME_UNSET) {
                                this.f5928e.a(j3, 1, i12, 0, null);
                                this.f5936m += this.f5933j;
                            }
                            this.f5929f = 0;
                        }
                    }
                } else if (a(ygVar, this.f5925b.c(), 16)) {
                    c();
                    this.f5925b.f(0);
                    this.f5928e.a(this.f5925b, 16);
                    this.f5929f = 2;
                }
            } else if (b(ygVar)) {
                this.f5929f = 1;
                this.f5925b.c()[0] = -84;
                this.f5925b.c()[1] = (byte) (this.f5932i ? 65 : 64);
                this.f5930g = 2;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    public m(String str) {
        xg xgVar = new xg(new byte[16]);
        this.a = xgVar;
        this.f5925b = new yg(xgVar.a);
        this.f5929f = 0;
        this.f5930g = 0;
        this.f5931h = false;
        this.f5932i = false;
        this.f5936m = C.TIME_UNSET;
        this.f5926c = str;
    }

    private boolean b(yg ygVar) {
        int w10;
        while (true) {
            if (ygVar.a() <= 0) {
                return false;
            }
            if (!this.f5931h) {
                this.f5931h = ygVar.w() == 172;
            } else {
                w10 = ygVar.w();
                this.f5931h = w10 == 172;
                if (w10 == 64 || w10 == 65) {
                    break;
                }
            }
        }
        this.f5932i = w10 == 65;
        return true;
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f5930g);
        ygVar.a(bArr, this.f5930g, min);
        int i11 = this.f5930g + min;
        this.f5930g = i11;
        return i11 == i10;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f5927d = dVar.b();
        this.f5928e = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f5936m = j3;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f5929f = 0;
        this.f5930g = 0;
        this.f5931h = false;
        this.f5932i = false;
        this.f5936m = C.TIME_UNSET;
    }
}
