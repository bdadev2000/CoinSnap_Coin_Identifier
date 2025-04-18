package com.applovin.impl;

/* loaded from: classes2.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27449a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27450b;

    public v1(int i2, float f2) {
        this.f27449a = i2;
        this.f27450b = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v1.class != obj.getClass()) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f27449a == v1Var.f27449a && Float.compare(v1Var.f27450b, this.f27450b) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f27450b) + ((this.f27449a + 527) * 31);
    }
}
