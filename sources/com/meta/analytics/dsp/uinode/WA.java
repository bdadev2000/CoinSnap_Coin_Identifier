package com.meta.analytics.dsp.uinode;

import android.text.Layout;

/* loaded from: assets/audience_network.dex */
public final class WA extends C1155Fn {
    public final long A00;
    public final long A01;

    public WA(long j7, long j9, CharSequence charSequence) {
        this(j7, j9, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public WA(long j7, long j9, CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11) {
        super(charSequence, alignment, f9, i9, i10, f10, i11, f11);
        this.A01 = j7;
        this.A00 = j9;
    }

    public WA(CharSequence charSequence) {
        this(0L, 0L, charSequence);
    }

    public final boolean A00() {
        return super.A01 == Float.MIN_VALUE && this.A02 == Float.MIN_VALUE;
    }
}
