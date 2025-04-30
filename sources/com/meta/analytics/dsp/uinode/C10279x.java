package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10279x {
    public static final C10279x A04 = new C10279x(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C10279x(float f9) {
        this(f9, 1.0f, false);
    }

    public C10279x(float f9, float f10, boolean z8) {
        AbstractC1192Ha.A03(f9 > 0.0f);
        AbstractC1192Ha.A03(f10 > 0.0f);
        this.A01 = f9;
        this.A00 = f10;
        this.A02 = z8;
        this.A03 = Math.round(1000.0f * f9);
    }

    public final long A00(long j7) {
        return this.A03 * j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10279x c10279x = (C10279x) obj;
        return this.A01 == c10279x.A01 && this.A00 == c10279x.A00 && this.A02 == c10279x.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}
