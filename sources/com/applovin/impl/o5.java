package com.applovin.impl;

/* loaded from: classes.dex */
public final class o5 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final d9 f6453b;

    /* renamed from: c, reason: collision with root package name */
    public final d9 f6454c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6455d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6456e;

    public o5(String str, d9 d9Var, d9 d9Var2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        a1.a(z10);
        this.a = a1.a(str);
        this.f6453b = (d9) a1.a(d9Var);
        this.f6454c = (d9) a1.a(d9Var2);
        this.f6455d = i10;
        this.f6456e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o5.class != obj.getClass()) {
            return false;
        }
        o5 o5Var = (o5) obj;
        if (this.f6455d == o5Var.f6455d && this.f6456e == o5Var.f6456e && this.a.equals(o5Var.a) && this.f6453b.equals(o5Var.f6453b) && this.f6454c.equals(o5Var.f6454c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f6454c.hashCode() + ((this.f6453b.hashCode() + vd.e.c(this.a, (((this.f6455d + 527) * 31) + this.f6456e) * 31, 31)) * 31);
    }
}
