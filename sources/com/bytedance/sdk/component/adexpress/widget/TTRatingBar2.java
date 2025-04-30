package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.adexpress.dynamic.jU.Bj;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class TTRatingBar2 extends FrameLayout {
    private static final int YW = (Bj.lMd("", 0.0f, true)[1] / 2) + 1;
    private static final int dT = (Bj.lMd("", 0.0f, true)[1] / 2) + 3;
    private Drawable COT;
    private Drawable HWF;
    private float KS;
    private double QR;
    private float jU;
    private float ku;
    LinearLayout lMd;
    LinearLayout zp;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zp = new LinearLayout(getContext());
        this.lMd = new LinearLayout(getContext());
        this.zp.setOrientation(0);
        this.zp.setGravity(8388611);
        this.lMd.setOrientation(0);
        this.lMd.setGravity(8388611);
        this.COT = cz.KS(context, "tt_star_thick");
        this.HWF = cz.KS(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.KS, (int) this.jU));
        imageView.setPadding(1, YW, 1, dT);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.COT;
    }

    public Drawable getStarFillDrawable() {
        return this.HWF;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.zp.measure(i9, i10);
        double d2 = this.QR;
        float f9 = this.KS;
        this.lMd.measure(View.MeasureSpec.makeMeasureSpec((int) (((d2 - ((int) d2)) * (f9 - 2.0f)) + (((int) d2) * f9) + 1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.zp.getMeasuredHeight(), 1073741824));
        if (this.ku > 0.0f) {
            this.zp.setPadding(0, ((int) (r7.getMeasuredHeight() - this.ku)) / 2, 0, 0);
            this.lMd.setPadding(0, ((int) (this.zp.getMeasuredHeight() - this.ku)) / 2, 0, 0);
        }
    }

    public void zp(double d2, int i9, int i10, int i11) {
        float f9 = i10;
        this.KS = (int) QR.KS(getContext(), f9);
        this.jU = (int) QR.KS(getContext(), f9);
        this.QR = d2;
        this.ku = i11;
        removeAllViews();
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.lMd.addView(starImageView);
        }
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.zp.addView(starImageView2);
        }
        addView(this.zp);
        addView(this.lMd);
        requestLayout();
    }
}
