package com.applovin.impl;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class a2 implements i5 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22668a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f22669b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    private int f22670c;
    private l5 d;

    public a2(boolean z2) {
        this.f22668a = z2;
    }

    @Override // com.applovin.impl.i5
    public final void a(xo xoVar) {
        b1.a(xoVar);
        if (this.f22669b.contains(xoVar)) {
            return;
        }
        this.f22669b.add(xoVar);
        this.f22670c++;
    }

    public final void b(l5 l5Var) {
        for (int i2 = 0; i2 < this.f22670c; i2++) {
            ((xo) this.f22669b.get(i2)).b(this, l5Var, this.f22668a);
        }
    }

    public final void c(l5 l5Var) {
        this.d = l5Var;
        for (int i2 = 0; i2 < this.f22670c; i2++) {
            ((xo) this.f22669b.get(i2)).a(this, l5Var, this.f22668a);
        }
    }

    public final void d(int i2) {
        l5 l5Var = (l5) xp.a(this.d);
        for (int i3 = 0; i3 < this.f22670c; i3++) {
            ((xo) this.f22669b.get(i3)).a(this, l5Var, this.f22668a, i2);
        }
    }

    public final void g() {
        l5 l5Var = (l5) xp.a(this.d);
        for (int i2 = 0; i2 < this.f22670c; i2++) {
            ((xo) this.f22669b.get(i2)).c(this, l5Var, this.f22668a);
        }
        this.d = null;
    }
}
