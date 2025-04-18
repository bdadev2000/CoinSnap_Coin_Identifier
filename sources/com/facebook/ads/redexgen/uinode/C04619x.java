package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04619x {
    public static final C04619x A04 = new C04619x(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C04619x(float f10) {
        this(f10, 1.0f, false);
    }

    public C04619x(float f10, float f11, boolean z10) {
        AbstractC0626Ha.A03(f10 > 0.0f);
        AbstractC0626Ha.A03(f11 > 0.0f);
        this.A01 = f10;
        this.A00 = f11;
        this.A02 = z10;
        this.A03 = Math.round(1000.0f * f10);
    }

    public final long A00(long j3) {
        return this.A03 * j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C04619x c04619x = (C04619x) obj;
        return this.A01 == c04619x.A01 && this.A00 == c04619x.A00 && this.A02 == c04619x.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
