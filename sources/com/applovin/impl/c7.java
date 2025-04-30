package com.applovin.impl;

import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class c7 implements o7 {
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private String f6981c;

    /* renamed from: d, reason: collision with root package name */
    private ro f6982d;

    /* renamed from: f, reason: collision with root package name */
    private int f6984f;

    /* renamed from: g, reason: collision with root package name */
    private int f6985g;

    /* renamed from: h, reason: collision with root package name */
    private long f6986h;

    /* renamed from: i, reason: collision with root package name */
    private d9 f6987i;

    /* renamed from: j, reason: collision with root package name */
    private int f6988j;

    /* renamed from: a, reason: collision with root package name */
    private final yg f6980a = new yg(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    private int f6983e = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f6989k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public c7(String str) {
        this.b = str;
    }

    private void c() {
        byte[] c9 = this.f6980a.c();
        if (this.f6987i == null) {
            d9 a6 = d7.a(c9, this.f6981c, this.b, null);
            this.f6987i = a6;
            this.f6982d.a(a6);
        }
        this.f6988j = d7.a(c9);
        this.f6986h = (int) ((d7.d(c9) * 1000000) / this.f6987i.f7195A);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        AbstractC0669a1.b(this.f6982d);
        while (ygVar.a() > 0) {
            int i9 = this.f6983e;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int min = Math.min(ygVar.a(), this.f6988j - this.f6984f);
                        this.f6982d.a(ygVar, min);
                        int i10 = this.f6984f + min;
                        this.f6984f = i10;
                        int i11 = this.f6988j;
                        if (i10 == i11) {
                            long j7 = this.f6989k;
                            if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                this.f6982d.a(j7, 1, i11, 0, null);
                                this.f6989k += this.f6986h;
                            }
                            this.f6983e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(ygVar, this.f6980a.c(), 18)) {
                    c();
                    this.f6980a.f(0);
                    this.f6982d.a(this.f6980a, 18);
                    this.f6983e = 2;
                }
            } else if (b(ygVar)) {
                this.f6983e = 1;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    private boolean b(yg ygVar) {
        while (ygVar.a() > 0) {
            int i9 = this.f6985g << 8;
            this.f6985g = i9;
            int w2 = i9 | ygVar.w();
            this.f6985g = w2;
            if (d7.a(w2)) {
                byte[] c9 = this.f6980a.c();
                int i10 = this.f6985g;
                c9[0] = (byte) ((i10 >> 24) & 255);
                c9[1] = (byte) ((i10 >> 16) & 255);
                c9[2] = (byte) ((i10 >> 8) & 255);
                c9[3] = (byte) (i10 & 255);
                this.f6984f = 4;
                this.f6985g = 0;
                return true;
            }
        }
        return false;
    }

    private boolean a(yg ygVar, byte[] bArr, int i9) {
        int min = Math.min(ygVar.a(), i9 - this.f6984f);
        ygVar.a(bArr, this.f6984f, min);
        int i10 = this.f6984f + min;
        this.f6984f = i10;
        return i10 == i9;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f6981c = dVar.b();
        this.f6982d = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j7, int i9) {
        if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.f6989k = j7;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f6983e = 0;
        this.f6984f = 0;
        this.f6985g = 0;
        this.f6989k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
