package com.applovin.impl;

import com.applovin.impl.dp;

/* loaded from: classes.dex */
public final class hj implements dp {

    /* renamed from: a, reason: collision with root package name */
    private final gj f24323a;

    /* renamed from: b, reason: collision with root package name */
    private final bh f24324b = new bh(32);

    /* renamed from: c, reason: collision with root package name */
    private int f24325c;
    private int d;
    private boolean e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24326f;

    public hj(gj gjVar) {
        this.f24323a = gjVar;
    }

    @Override // com.applovin.impl.dp
    public void a() {
        this.f24326f = true;
    }

    @Override // com.applovin.impl.dp
    public void a(bh bhVar, int i2) {
        boolean z2 = (i2 & 1) != 0;
        int d = z2 ? bhVar.d() + bhVar.w() : -1;
        if (this.f24326f) {
            if (!z2) {
                return;
            }
            this.f24326f = false;
            bhVar.f(d);
            this.d = 0;
        }
        while (bhVar.a() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int w = bhVar.w();
                    bhVar.f(bhVar.d() - 1);
                    if (w == 255) {
                        this.f24326f = true;
                        return;
                    }
                }
                int min = Math.min(bhVar.a(), 3 - this.d);
                bhVar.a(this.f24324b.c(), this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    this.f24324b.f(0);
                    this.f24324b.e(3);
                    this.f24324b.g(1);
                    int w2 = this.f24324b.w();
                    int w3 = this.f24324b.w();
                    this.e = (w2 & 128) != 0;
                    this.f24325c = (((w2 & 15) << 8) | w3) + 3;
                    int b2 = this.f24324b.b();
                    int i5 = this.f24325c;
                    if (b2 < i5) {
                        this.f24324b.a(Math.min(4098, Math.max(i5, this.f24324b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(bhVar.a(), this.f24325c - this.d);
                bhVar.a(this.f24324b.c(), this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.f24325c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.e) {
                        if (xp.a(this.f24324b.c(), 0, this.f24325c, -1) != 0) {
                            this.f24326f = true;
                            return;
                        }
                        this.f24324b.e(this.f24325c - 4);
                    } else {
                        this.f24324b.e(i7);
                    }
                    this.f24324b.f(0);
                    this.f24323a.a(this.f24324b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.applovin.impl.dp
    public void a(ho hoVar, m8 m8Var, dp.d dVar) {
        this.f24323a.a(hoVar, m8Var, dVar);
        this.f24326f = true;
    }
}
