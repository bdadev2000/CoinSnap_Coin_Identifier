package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;

/* renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1155Fn {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Bitmap A0A;
    public final Layout.Alignment A0B;
    public final CharSequence A0C;
    public final boolean A0D;

    public C1155Fn(Bitmap bitmap, float f9, int i9, float f10, int i10, float f11, float f12) {
        this(null, null, bitmap, f10, 0, i10, f9, i9, Integer.MIN_VALUE, Float.MIN_VALUE, f11, f12, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C1155Fn(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C1155Fn(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11) {
        this(charSequence, alignment, f9, i9, i10, f10, i11, f11, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C1155Fn(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, null, f9, i9, i10, f10, i11, i12, f12, f11, Float.MIN_VALUE, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C1155Fn(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11, boolean z8, int i12) {
        this(charSequence, alignment, null, f9, i9, i10, f10, i11, Integer.MIN_VALUE, Float.MIN_VALUE, f11, Float.MIN_VALUE, z8, i12);
    }

    public C1155Fn(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f9, int i9, int i10, float f10, int i11, int i12, float f11, float f12, float f13, boolean z8, int i13) {
        this.A0C = charSequence;
        this.A0B = alignment;
        this.A0A = bitmap;
        this.A01 = f9;
        this.A06 = i9;
        this.A05 = i10;
        this.A02 = f10;
        this.A07 = i11;
        this.A03 = f12;
        this.A00 = f13;
        this.A0D = z8;
        this.A09 = i13;
        this.A08 = i12;
        this.A04 = f11;
    }
}
