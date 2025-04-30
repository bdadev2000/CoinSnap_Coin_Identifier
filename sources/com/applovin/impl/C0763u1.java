package com.applovin.impl;

/* renamed from: com.applovin.impl.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763u1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11534a;
    public final float b;

    public C0763u1(int i9, float f9) {
        this.f11534a = i9;
        this.b = f9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0763u1.class != obj.getClass()) {
            return false;
        }
        C0763u1 c0763u1 = (C0763u1) obj;
        if (this.f11534a == c0763u1.f11534a && Float.compare(c0763u1.b, this.b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.b) + ((this.f11534a + 527) * 31);
    }
}
