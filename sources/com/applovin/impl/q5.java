package com.applovin.impl;

/* loaded from: classes2.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26157a;

    /* renamed from: b, reason: collision with root package name */
    public final f9 f26158b;

    /* renamed from: c, reason: collision with root package name */
    public final f9 f26159c;
    public final int d;
    public final int e;

    public q5(String str, f9 f9Var, f9 f9Var2, int i2, int i3) {
        b1.a(i2 == 0 || i3 == 0);
        this.f26157a = b1.a(str);
        this.f26158b = (f9) b1.a(f9Var);
        this.f26159c = (f9) b1.a(f9Var2);
        this.d = i2;
        this.e = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q5.class != obj.getClass()) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return this.d == q5Var.d && this.e == q5Var.e && this.f26157a.equals(q5Var.f26157a) && this.f26158b.equals(q5Var.f26158b) && this.f26159c.equals(q5Var.f26159c);
    }

    public int hashCode() {
        return this.f26159c.hashCode() + ((this.f26158b.hashCode() + androidx.compose.foundation.text.input.a.b(this.f26157a, (((this.d + 527) * 31) + this.e) * 31, 31)) * 31);
    }
}
