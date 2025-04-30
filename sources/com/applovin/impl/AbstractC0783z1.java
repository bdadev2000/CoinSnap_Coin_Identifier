package com.applovin.impl;

import java.util.ArrayList;

/* renamed from: com.applovin.impl.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0783z1 implements g5 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12491a;
    private final ArrayList b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f12492c;

    /* renamed from: d, reason: collision with root package name */
    private j5 f12493d;

    public AbstractC0783z1(boolean z8) {
        this.f12491a = z8;
    }

    @Override // com.applovin.impl.g5
    public final void a(yo yoVar) {
        AbstractC0669a1.a(yoVar);
        if (!this.b.contains(yoVar)) {
            this.b.add(yoVar);
            this.f12492c++;
        }
    }

    public final void b(j5 j5Var) {
        for (int i9 = 0; i9 < this.f12492c; i9++) {
            ((yo) this.b.get(i9)).b(this, j5Var, this.f12491a);
        }
    }

    public final void c(j5 j5Var) {
        this.f12493d = j5Var;
        for (int i9 = 0; i9 < this.f12492c; i9++) {
            ((yo) this.b.get(i9)).a(this, j5Var, this.f12491a);
        }
    }

    public final void d(int i9) {
        j5 j5Var = (j5) yp.a(this.f12493d);
        for (int i10 = 0; i10 < this.f12492c; i10++) {
            ((yo) this.b.get(i10)).a(this, j5Var, this.f12491a, i9);
        }
    }

    public final void g() {
        j5 j5Var = (j5) yp.a(this.f12493d);
        for (int i9 = 0; i9 < this.f12492c; i9++) {
            ((yo) this.b.get(i9)).c(this, j5Var, this.f12491a);
        }
        this.f12493d = null;
    }
}
