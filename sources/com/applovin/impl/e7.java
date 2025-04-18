package com.applovin.impl;

import com.applovin.impl.dp;

/* loaded from: classes3.dex */
public final class e7 implements q7 {

    /* renamed from: b, reason: collision with root package name */
    private final String f23606b;

    /* renamed from: c, reason: collision with root package name */
    private String f23607c;
    private qo d;

    /* renamed from: f, reason: collision with root package name */
    private int f23608f;

    /* renamed from: g, reason: collision with root package name */
    private int f23609g;

    /* renamed from: h, reason: collision with root package name */
    private long f23610h;

    /* renamed from: i, reason: collision with root package name */
    private f9 f23611i;

    /* renamed from: j, reason: collision with root package name */
    private int f23612j;

    /* renamed from: a, reason: collision with root package name */
    private final bh f23605a = new bh(new byte[18]);
    private int e = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f23613k = -9223372036854775807L;

    public e7(String str) {
        this.f23606b = str;
    }

    private void c() {
        byte[] c2 = this.f23605a.c();
        if (this.f23611i == null) {
            f9 a2 = f7.a(c2, this.f23607c, this.f23606b, null);
            this.f23611i = a2;
            this.d.a(a2);
        }
        this.f23612j = f7.a(c2);
        this.f23610h = (int) ((f7.d(c2) * 1000000) / this.f23611i.A);
    }

    @Override // com.applovin.impl.q7
    public void a() {
        this.e = 0;
        this.f23608f = 0;
        this.f23609g = 0;
        this.f23613k = -9223372036854775807L;
    }

    @Override // com.applovin.impl.q7
    public void b() {
    }

    private boolean b(bh bhVar) {
        while (bhVar.a() > 0) {
            int i2 = this.f23609g << 8;
            this.f23609g = i2;
            int w = i2 | bhVar.w();
            this.f23609g = w;
            if (f7.a(w)) {
                byte[] c2 = this.f23605a.c();
                int i3 = this.f23609g;
                c2[0] = (byte) ((i3 >> 24) & 255);
                c2[1] = (byte) ((i3 >> 16) & 255);
                c2[2] = (byte) ((i3 >> 8) & 255);
                c2[3] = (byte) (i3 & 255);
                this.f23608f = 4;
                this.f23609g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.q7
    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.f23613k = j2;
        }
    }

    @Override // com.applovin.impl.q7
    public void a(bh bhVar) {
        b1.b(this.d);
        while (bhVar.a() > 0) {
            int i2 = this.e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(bhVar.a(), this.f23612j - this.f23608f);
                        this.d.a(bhVar, min);
                        int i3 = this.f23608f + min;
                        this.f23608f = i3;
                        int i4 = this.f23612j;
                        if (i3 == i4) {
                            long j2 = this.f23613k;
                            if (j2 != -9223372036854775807L) {
                                this.d.a(j2, 1, i4, 0, null);
                                this.f23613k += this.f23610h;
                            }
                            this.e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(bhVar, this.f23605a.c(), 18)) {
                    c();
                    this.f23605a.f(0);
                    this.d.a(this.f23605a, 18);
                    this.e = 2;
                }
            } else if (b(bhVar)) {
                this.e = 1;
            }
        }
    }

    private boolean a(bh bhVar, byte[] bArr, int i2) {
        int min = Math.min(bhVar.a(), i2 - this.f23608f);
        bhVar.a(bArr, this.f23608f, min);
        int i3 = this.f23608f + min;
        this.f23608f = i3;
        return i3 == i2;
    }

    @Override // com.applovin.impl.q7
    public void a(m8 m8Var, dp.d dVar) {
        dVar.a();
        this.f23607c = dVar.b();
        this.d = m8Var.a(dVar.c(), 1);
    }
}
