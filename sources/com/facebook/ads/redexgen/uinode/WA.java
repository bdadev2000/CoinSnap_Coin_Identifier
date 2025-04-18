package com.facebook.ads.redexgen.uinode;

import android.text.Layout;

/* loaded from: assets/audience_network.dex */
public final class WA extends C0589Fn {
    public final long A00;
    public final long A01;

    public WA(long j3, long j10, CharSequence charSequence) {
        this(j3, j10, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public WA(long j3, long j10, CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12);
        this.A01 = j3;
        this.A00 = j10;
    }

    public WA(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean A00() {
        return super.A01 == Float.MIN_VALUE && this.A02 == Float.MIN_VALUE;
    }
}
