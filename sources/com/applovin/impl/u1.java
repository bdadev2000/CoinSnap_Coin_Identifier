package com.applovin.impl;

/* loaded from: classes.dex */
public final class u1 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8323b;

    public u1(int i10, float f10) {
        this.a = i10;
        this.f8323b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1.class != obj.getClass()) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (this.a == u1Var.a && Float.compare(u1Var.f8323b, this.f8323b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f8323b) + ((this.a + 527) * 31);
    }
}
