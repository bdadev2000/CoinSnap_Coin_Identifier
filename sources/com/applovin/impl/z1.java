package com.applovin.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class z1 implements g5 {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f9308b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f9309c;

    /* renamed from: d, reason: collision with root package name */
    private j5 f9310d;

    public z1(boolean z10) {
        this.a = z10;
    }

    @Override // com.applovin.impl.g5
    public final void a(yo yoVar) {
        a1.a(yoVar);
        if (!this.f9308b.contains(yoVar)) {
            this.f9308b.add(yoVar);
            this.f9309c++;
        }
    }

    public final void b(j5 j5Var) {
        for (int i10 = 0; i10 < this.f9309c; i10++) {
            ((yo) this.f9308b.get(i10)).b(this, j5Var, this.a);
        }
    }

    public final void c(j5 j5Var) {
        this.f9310d = j5Var;
        for (int i10 = 0; i10 < this.f9309c; i10++) {
            ((yo) this.f9308b.get(i10)).a(this, j5Var, this.a);
        }
    }

    public final void d(int i10) {
        j5 j5Var = (j5) yp.a(this.f9310d);
        for (int i11 = 0; i11 < this.f9309c; i11++) {
            ((yo) this.f9308b.get(i11)).a(this, j5Var, this.a, i10);
        }
    }

    public final void g() {
        j5 j5Var = (j5) yp.a(this.f9310d);
        for (int i10 = 0; i10 < this.f9309c; i10++) {
            ((yo) this.f9308b.get(i10)).c(this, j5Var, this.a);
        }
        this.f9310d = null;
    }
}
