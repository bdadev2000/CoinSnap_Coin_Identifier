package com.meta.analytics.dsp.uinode;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.Nf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1346Nf extends FrameLayout {
    public int A00;
    public int A01;
    public final ImageView A02;
    public final ImageView A03;

    public C1346Nf(C1636Yn c1636Yn) {
        super(c1636Yn);
        this.A03 = new ImageView(c1636Yn);
        this.A02 = new ImageView(c1636Yn);
        A00();
    }

    public C1346Nf(C1636Yn c1636Yn, AttributeSet attributeSet) {
        super(c1636Yn, attributeSet);
        this.A03 = new ImageView(c1636Yn, attributeSet);
        this.A02 = new ImageView(c1636Yn, attributeSet);
        A00();
    }

    public C1346Nf(C1636Yn c1636Yn, AttributeSet attributeSet, int i9) {
        super(c1636Yn, attributeSet, i9);
        this.A03 = new ImageView(c1636Yn, attributeSet, i9);
        this.A02 = new ImageView(c1636Yn, attributeSet, i9);
        A00();
    }

    public C1346Nf(C1636Yn c1636Yn, AttributeSet attributeSet, int i9, int i10) {
        super(c1636Yn, attributeSet, i9, i10);
        this.A03 = new ImageView(c1636Yn, attributeSet, i9, i10);
        this.A02 = new ImageView(c1636Yn, attributeSet, i9, i10);
        A00();
    }

    private void A00() {
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
        addView(this.A03, new FrameLayout.LayoutParams(-2, -2));
        LI.A04(this.A03, LI.A0A);
        setId(AbstractC1303Lo.A00());
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
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int i13;
        int i14 = this.A01;
        if (i14 <= 0 || (i13 = this.A00) <= 0) {
            super.onLayout(z8, i9, i10, i11, i12);
            return;
        }
        int i15 = i11 - i9;
        int i16 = i12 - i10;
        float min = Math.min(i15 / i14, i16 / i13);
        int i17 = (int) (this.A01 * min);
        int blurBorderViewWidth = (int) (this.A00 * min);
        this.A02.layout(i9, i10, i11, i12);
        int expectedImageWidth = (i15 / 2) + i9;
        int i18 = (i16 / 2) + i10;
        this.A03.layout(expectedImageWidth - (i17 / 2), i18 - (blurBorderViewWidth / 2), (i17 / 2) + expectedImageWidth, i18 + (blurBorderViewWidth / 2));
        this.A02.setVisibility(0);
    }

    public void setImage(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap2 != null) {
            AbstractC1303Lo.A0S(this.A02, new BitmapDrawable(getContext().getResources(), bitmap2));
        } else {
            AbstractC1303Lo.A0M(this.A02, 0);
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
