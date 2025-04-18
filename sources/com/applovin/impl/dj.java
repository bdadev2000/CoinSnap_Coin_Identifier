package com.applovin.impl;

import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class dj implements ep {
    private final cj a;

    /* renamed from: b, reason: collision with root package name */
    private final yg f4311b = new yg(32);

    /* renamed from: c, reason: collision with root package name */
    private int f4312c;

    /* renamed from: d, reason: collision with root package name */
    private int f4313d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f4314e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4315f;

    public dj(cj cjVar) {
        this.a = cjVar;
    }

    @Override // com.applovin.impl.ep
    public void a(yg ygVar, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int d10 = z10 ? ygVar.d() + ygVar.w() : -1;
        if (this.f4315f) {
            if (!z10) {
                return;
            }
            this.f4315f = false;
            ygVar.f(d10);
            this.f4313d = 0;
        }
        while (ygVar.a() > 0) {
            int i11 = this.f4313d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int w10 = ygVar.w();
                    ygVar.f(ygVar.d() - 1);
                    if (w10 == 255) {
                        this.f4315f = true;
                        return;
                    }
                }
                int min = Math.min(ygVar.a(), 3 - this.f4313d);
                ygVar.a(this.f4311b.c(), this.f4313d, min);
                int i12 = this.f4313d + min;
                this.f4313d = i12;
                if (i12 == 3) {
                    this.f4311b.f(0);
                    this.f4311b.e(3);
                    this.f4311b.g(1);
                    int w11 = this.f4311b.w();
                    int w12 = this.f4311b.w();
                    this.f4314e = (w11 & 128) != 0;
                    this.f4312c = (((w11 & 15) << 8) | w12) + 3;
                    int b3 = this.f4311b.b();
                    int i13 = this.f4312c;
                    if (b3 < i13) {
                        this.f4311b.a(Math.min(4098, Math.max(i13, this.f4311b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(ygVar.a(), this.f4312c - this.f4313d);
                ygVar.a(this.f4311b.c(), this.f4313d, min2);
                int i14 = this.f4313d + min2;
                this.f4313d = i14;
                int i15 = this.f4312c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f4314e) {
                        if (yp.a(this.f4311b.c(), 0, this.f4312c, -1) != 0) {
                            this.f4315f = true;
                            return;
                        }
                        this.f4311b.e(this.f4312c - 4);
                    } else {
                        this.f4311b.e(i15);
                    }
                    this.f4311b.f(0);
                    this.a.a(this.f4311b);
                    this.f4313d = 0;
                }
            }
        }
    }

    @Override // com.applovin.impl.ep
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.a.a(ioVar, k8Var, dVar);
        this.f4315f = true;
    }

    @Override // com.applovin.impl.ep
    public void a() {
        this.f4315f = true;
    }
}
