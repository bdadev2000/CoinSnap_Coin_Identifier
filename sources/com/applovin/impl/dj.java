package com.applovin.impl;

import com.applovin.impl.ep;

/* loaded from: classes.dex */
public final class dj implements ep {

    /* renamed from: a, reason: collision with root package name */
    private final cj f7305a;
    private final yg b = new yg(32);

    /* renamed from: c, reason: collision with root package name */
    private int f7306c;

    /* renamed from: d, reason: collision with root package name */
    private int f7307d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7308e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7309f;

    public dj(cj cjVar) {
        this.f7305a = cjVar;
    }

    @Override // com.applovin.impl.ep
    public void a(yg ygVar, int i9) {
        boolean z8 = (i9 & 1) != 0;
        int d2 = z8 ? ygVar.d() + ygVar.w() : -1;
        if (this.f7309f) {
            if (!z8) {
                return;
            }
            this.f7309f = false;
            ygVar.f(d2);
            this.f7307d = 0;
        }
        while (ygVar.a() > 0) {
            int i10 = this.f7307d;
            if (i10 < 3) {
                if (i10 == 0) {
                    int w2 = ygVar.w();
                    ygVar.f(ygVar.d() - 1);
                    if (w2 == 255) {
                        this.f7309f = true;
                        return;
                    }
                }
                int min = Math.min(ygVar.a(), 3 - this.f7307d);
                ygVar.a(this.b.c(), this.f7307d, min);
                int i11 = this.f7307d + min;
                this.f7307d = i11;
                if (i11 == 3) {
                    this.b.f(0);
                    this.b.e(3);
                    this.b.g(1);
                    int w9 = this.b.w();
                    int w10 = this.b.w();
                    this.f7308e = (w9 & 128) != 0;
                    this.f7306c = (((w9 & 15) << 8) | w10) + 3;
                    int b = this.b.b();
                    int i12 = this.f7306c;
                    if (b < i12) {
                        this.b.a(Math.min(4098, Math.max(i12, this.b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(ygVar.a(), this.f7306c - this.f7307d);
                ygVar.a(this.b.c(), this.f7307d, min2);
                int i13 = this.f7307d + min2;
                this.f7307d = i13;
                int i14 = this.f7306c;
                if (i13 != i14) {
                    continue;
                } else {
                    if (this.f7308e) {
                        if (yp.a(this.b.c(), 0, this.f7306c, -1) != 0) {
                            this.f7309f = true;
                            return;
                        }
                        this.b.e(this.f7306c - 4);
                    } else {
                        this.b.e(i14);
                    }
                    this.b.f(0);
                    this.f7305a.a(this.b);
                    this.f7307d = 0;
                }
            }
        }
    }

    @Override // com.applovin.impl.ep
    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.f7305a.a(ioVar, k8Var, dVar);
        this.f7309f = true;
    }

    @Override // com.applovin.impl.ep
    public void a() {
        this.f7309f = true;
    }
}
