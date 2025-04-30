package com.applovin.impl;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9383a;
    public final d9 b;

    /* renamed from: c, reason: collision with root package name */
    public final d9 f9384c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9386e;

    public o5(String str, d9 d9Var, d9 d9Var2, int i9, int i10) {
        boolean z8;
        if (i9 != 0 && i10 != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        AbstractC0669a1.a(z8);
        this.f9383a = AbstractC0669a1.a(str);
        this.b = (d9) AbstractC0669a1.a(d9Var);
        this.f9384c = (d9) AbstractC0669a1.a(d9Var2);
        this.f9385d = i9;
        this.f9386e = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o5.class != obj.getClass()) {
            return false;
        }
        o5 o5Var = (o5) obj;
        if (this.f9385d == o5Var.f9385d && this.f9386e == o5Var.f9386e && this.f9383a.equals(o5Var.f9383a) && this.b.equals(o5Var.b) && this.f9384c.equals(o5Var.f9384c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9384c.hashCode() + ((this.b.hashCode() + AbstractC2914a.b((((this.f9385d + 527) * 31) + this.f9386e) * 31, 31, this.f9383a)) * 31);
    }
}
