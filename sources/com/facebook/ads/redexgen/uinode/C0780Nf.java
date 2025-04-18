package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.Nf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0780Nf extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C0780Nf(C1070Yn c1070Yn) {
        super(c1070Yn);
        this.A03 = new ImageView(c1070Yn);
        this.A02 = new ImageView(c1070Yn);
        A00();
    }

    public C0780Nf(C1070Yn c1070Yn, AttributeSet attributeSet) {
        super(c1070Yn, attributeSet);
        this.A03 = new ImageView(c1070Yn, attributeSet);
        this.A02 = new ImageView(c1070Yn, attributeSet);
        A00();
    }

    public C0780Nf(C1070Yn c1070Yn, AttributeSet attributeSet, int i10) {
        super(c1070Yn, attributeSet, i10);
        this.A03 = new ImageView(c1070Yn, attributeSet, i10);
        this.A02 = new ImageView(c1070Yn, attributeSet, i10);
        A00();
    }

    public C0780Nf(C1070Yn c1070Yn, AttributeSet attributeSet, int i10, int i11) {
        super(c1070Yn, attributeSet, i10, i11);
        this.A03 = new ImageView(c1070Yn, attributeSet, i10, i11);
        this.A02 = new ImageView(c1070Yn, attributeSet, i10, i11);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        LI.A04(this.A03, LI.A0A);
        setId(AbstractC0737Lo.A00());
    }

    public ImageView getBodyImageView() {
        return this.A03;
    }

    public int getImageHeight() {
        return this.A00;
    }

    public int getImageWidth() {
        return this.A01;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = this.A01;
        if (i15 <= 0 || (i14 = this.A00) <= 0) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        float min = Math.min(i16 / i15, i17 / i14);
        int i18 = (int) (this.A01 * min);
        int blurBorderViewWidth = (int) (this.A00 * min);
        this.A02.layout(i10, i11, i12, i13);
        int expectedImageWidth = (i16 / 2) + i10;
        int i19 = (i17 / 2) + i11;
        this.A03.layout(expectedImageWidth - (i18 / 2), i19 - (blurBorderViewWidth / 2), (i18 / 2) + expectedImageWidth, i19 + (blurBorderViewWidth / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            AbstractC0737Lo.A0S(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            AbstractC0737Lo.A0M(this.A02, 0);
        }
        if (bitmap != null) {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
            this.A03.setImageBitmap(Bitmap.createBitmap(bitmap));
            return;
        }
        this.A03.setImageDrawable(null);
    }
}
