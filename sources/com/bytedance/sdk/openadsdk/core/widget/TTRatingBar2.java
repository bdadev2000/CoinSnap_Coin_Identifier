package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class TTRatingBar2 extends PAGFrameLayout {
    private static int HWF = -1;
    private static int QR;
    private static int YW;
    private static int ku;
    private LinearLayout Bj;
    private double COT;
    private Drawable KS;
    private LinearLayout dT;
    private Drawable jU;
    private float lMd;
    private float zp;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zp();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.zp, (int) this.lMd));
        imageView.setPadding(HWF, QR, ku, YW);
        return imageView;
    }

    private void zp() {
        Context context = getContext();
        this.dT = new LinearLayout(context);
        this.Bj = new LinearLayout(context);
        this.dT.setOrientation(0);
        this.dT.setGravity(8388611);
        this.Bj.setOrientation(0);
        this.Bj.setGravity(8388611);
        if (HWF < 0) {
            int zp = (int) WNy.zp(context, 1.0f, false);
            HWF = zp;
            ku = zp;
            YW = (int) WNy.zp(context, 3.0f, false);
        }
        this.KS = cz.KS(context, "tt_star_thick");
        this.jU = cz.KS(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.KS;
    }

    public Drawable getStarFillDrawable() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.dT.measure(i9, i10);
        double d2 = this.COT;
        float f9 = this.zp;
        int i11 = HWF;
        this.Bj.measure(View.MeasureSpec.makeMeasureSpec((int) (((d2 - ((int) d2)) * (f9 - (i11 + ku))) + (((int) d2) * f9) + i11), 1073741824), View.MeasureSpec.makeMeasureSpec(this.dT.getMeasuredHeight(), 1073741824));
    }

    public TTRatingBar2(Context context) {
        super(context);
        zp();
    }

    public void zp(double d2, int i9, int i10) {
        float f9 = i10;
        this.zp = (int) WNy.zp(getContext(), f9, false);
        this.lMd = (int) WNy.zp(getContext(), f9, false);
        this.COT = d2;
        this.dT.removeAllViews();
        this.Bj.removeAllViews();
        removeAllViews();
        for (int i11 = 0; i11 < 5; i11++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i9);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.Bj.addView(starImageView);
        }
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.dT.addView(starImageView2);
        }
        addView(this.dT);
        addView(this.Bj);
        requestLayout();
    }
}
