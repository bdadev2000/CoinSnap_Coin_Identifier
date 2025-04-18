package com.applovin.impl;

import com.applovin.impl.ep;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class c7 implements o7 {

    /* renamed from: b, reason: collision with root package name */
    private final String f4011b;

    /* renamed from: c, reason: collision with root package name */
    private String f4012c;

    /* renamed from: d, reason: collision with root package name */
    private ro f4013d;

    /* renamed from: f, reason: collision with root package name */
    private int f4015f;

    /* renamed from: g, reason: collision with root package name */
    private int f4016g;

    /* renamed from: h, reason: collision with root package name */
    private long f4017h;

    /* renamed from: i, reason: collision with root package name */
    private d9 f4018i;

    /* renamed from: j, reason: collision with root package name */
    private int f4019j;
    private final yg a = new yg(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    private int f4014e = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f4020k = C.TIME_UNSET;

    public c7(String str) {
        this.f4011b = str;
    }

    private void c() {
        byte[] c10 = this.a.c();
        if (this.f4018i == null) {
            d9 a = d7.a(c10, this.f4012c, this.f4011b, null);
            this.f4018i = a;
            this.f4013d.a(a);
        }
        this.f4019j = d7.a(c10);
        this.f4017h = (int) ((d7.d(c10) * 1000000) / this.f4018i.A);
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.f4013d);
        while (ygVar.a() > 0) {
            int i10 = this.f4014e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(ygVar.a(), this.f4019j - this.f4015f);
                        this.f4013d.a(ygVar, min);
                        int i11 = this.f4015f + min;
                        this.f4015f = i11;
                        int i12 = this.f4019j;
                        if (i11 == i12) {
                            long j3 = this.f4020k;
                            if (j3 != C.TIME_UNSET) {
                                this.f4013d.a(j3, 1, i12, 0, null);
                                this.f4020k += this.f4017h;
                            }
                            this.f4014e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(ygVar, this.a.c(), 18)) {
                    c();
                    this.a.f(0);
                    this.f4013d.a(this.a, 18);
                    this.f4014e = 2;
                }
            } else if (b(ygVar)) {
                this.f4014e = 1;
            }
        }
    }

    @Override // com.applovin.impl.o7
    public void b() {
    }

    private boolean b(yg ygVar) {
        while (ygVar.a() > 0) {
            int i10 = this.f4016g << 8;
            this.f4016g = i10;
            int w10 = i10 | ygVar.w();
            this.f4016g = w10;
            if (d7.a(w10)) {
                byte[] c10 = this.a.c();
                int i11 = this.f4016g;
                c10[0] = (byte) ((i11 >> 24) & 255);
                c10[1] = (byte) ((i11 >> 16) & 255);
                c10[2] = (byte) ((i11 >> 8) & 255);
                c10[3] = (byte) (i11 & 255);
                this.f4015f = 4;
                this.f4016g = 0;
                return true;
            }
        }
        return false;
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f4015f);
        ygVar.a(bArr, this.f4015f, min);
        int i11 = this.f4015f + min;
        this.f4015f = i11;
        return i11 == i10;
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f4012c = dVar.b();
        this.f4013d = k8Var.a(dVar.c(), 1);
    }

    @Override // com.applovin.impl.o7
    public void a(long j3, int i10) {
        if (j3 != C.TIME_UNSET) {
            this.f4020k = j3;
        }
    }

    @Override // com.applovin.impl.o7
    public void a() {
        this.f4014e = 0;
        this.f4015f = 0;
        this.f4016g = 0;
        this.f4020k = C.TIME_UNSET;
    }
}
