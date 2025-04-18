package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;

/* renamed from: com.facebook.ads.redexgen.X.Fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0589Fn {
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

    public C0589Fn(Bitmap bitmap, float f10, int i10, float f11, int i11, float f12, float f13) {
        this(null, null, bitmap, f11, 0, i11, f10, i10, Integer.MIN_VALUE, Float.MIN_VALUE, f12, f13, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C0589Fn(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C0589Fn(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, f10, i10, i11, f11, i12, f12, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C0589Fn(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, int i13, float f13) {
        this(charSequence, alignment, null, f10, i10, i11, f11, i12, i13, f13, f12, Float.MIN_VALUE, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public C0589Fn(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13) {
        this(charSequence, alignment, null, f10, i10, i11, f11, i12, Integer.MIN_VALUE, Float.MIN_VALUE, f12, Float.MIN_VALUE, z10, i13);
    }

    public C0589Fn(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14) {
        this.A0C = charSequence;
        this.A0B = alignment;
        this.A0A = bitmap;
        this.A01 = f10;
        this.A06 = i10;
        this.A05 = i11;
        this.A02 = f11;
        this.A07 = i12;
        this.A03 = f13;
        this.A00 = f14;
        this.A0D = z10;
        this.A09 = i14;
        this.A08 = i13;
        this.A04 = f12;
    }
}
