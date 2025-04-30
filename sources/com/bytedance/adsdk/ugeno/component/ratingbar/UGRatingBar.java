package com.bytedance.adsdk.ugeno.component.ratingbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.lMd;
import com.bytedance.adsdk.ugeno.lMd.jU;
import com.bytedance.adsdk.ugeno.lMd.ku;

/* loaded from: classes.dex */
public class UGRatingBar extends FrameLayout {
    private double COT;
    private float HWF;
    private Drawable KS;
    private LinearLayout QR;
    private Context YW;
    private lMd dT;
    private Drawable jU;
    private LinearLayout ku;
    private float lMd;
    private float zp;

    public UGRatingBar(Context context) {
        super(context);
        this.YW = context;
        this.QR = new LinearLayout(context);
        this.ku = new LinearLayout(context);
        this.QR.setOrientation(0);
        this.QR.setGravity(8388611);
        this.ku.setOrientation(0);
        this.ku.setGravity(8388611);
        this.KS = jU.zp(context, "tt_star_thick");
        this.jU = jU.zp(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.zp, (int) this.lMd);
        layoutParams.leftMargin = 1;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 1;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.KS;
    }

    public Drawable getStarFillDrawable() {
        return this.jU;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lMd lmd = this.dT;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lMd lmd = this.dT;
        if (lmd != null) {
            lmd.QR();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        lMd lmd = this.dT;
        if (lmd != null) {
            lmd.zp(i9, i10, i11, i12);
        }
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        lMd lmd = this.dT;
        if (lmd != null) {
            lmd.zp(i9, i10);
        }
        super.onMeasure(i9, i10);
        this.QR.measure(i9, i10);
        double floor = Math.floor(this.COT);
        this.ku.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.COT - floor) * this.zp) + ((2.0f + r0) * floor) + 1.0d), 1073741824), View.MeasureSpec.makeMeasureSpec(this.QR.getMeasuredHeight(), 1073741824));
    }

    public void zp(double d2, int i9, int i10, int i11) {
        removeAllViews();
        this.QR.removeAllViews();
        this.ku.removeAllViews();
        float f9 = i10;
        this.zp = (int) ku.zp(this.YW, f9);
        this.lMd = (int) ku.zp(this.YW, f9);
        this.COT = d2;
        this.HWF = i11;
        for (int i12 = 0; i12 < 5; i12++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.ku.addView(starImageView);
        }
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.QR.addView(starImageView2);
        }
        addView(this.QR);
        addView(this.ku);
        requestLayout();
    }

    public void zp(lMd lmd) {
        this.dT = lmd;
    }
}
