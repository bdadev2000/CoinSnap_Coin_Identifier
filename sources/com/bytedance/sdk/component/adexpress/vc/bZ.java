package com.bytedance.sdk.component.adexpress.vc;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class bZ extends FrameLayout {
    private static final int NjR = (com.bytedance.sdk.component.adexpress.dynamic.wN.eT.Sg("", 0.0f, true)[1] / 2) + 1;

    /* renamed from: nc, reason: collision with root package name */
    private static final int f10420nc = (com.bytedance.sdk.component.adexpress.dynamic.wN.eT.Sg("", 0.0f, true)[1] / 2) + 3;
    private float AlY;
    private double DSW;
    LinearLayout Sg;
    LinearLayout YFl;
    private float qsH;
    private float tN;

    /* renamed from: vc, reason: collision with root package name */
    private Drawable f10421vc;
    private Drawable wN;

    public bZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.YFl = new LinearLayout(getContext());
        this.Sg = new LinearLayout(getContext());
        this.YFl.setOrientation(0);
        this.YFl.setGravity(8388611);
        this.Sg.setOrientation(0);
        this.Sg.setGravity(8388611);
        this.wN = com.bytedance.sdk.component.utils.qO.tN(context, "tt_star_thick");
        this.f10421vc = com.bytedance.sdk.component.utils.qO.tN(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.tN, (int) this.AlY));
        imageView.setPadding(1, NjR, 1, f10420nc);
        return imageView;
    }

    public void YFl(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.tN = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.tN(getContext(), f10);
        this.AlY = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.tN(getContext(), f10);
        this.DSW = d10;
        this.qsH = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.Sg.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.YFl.addView(starImageView2);
        }
        addView(this.YFl);
        addView(this.Sg);
        requestLayout();
    }

    public Drawable getStarEmptyDrawable() {
        return this.wN;
    }

    public Drawable getStarFillDrawable() {
        return this.f10421vc;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.YFl.measure(i10, i11);
        double d10 = this.DSW;
        float f10 = this.tN;
        this.Sg.measure(View.MeasureSpec.makeMeasureSpec((int) (((d10 - ((int) d10)) * (f10 - 2.0f)) + (((int) d10) * f10) + 1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.YFl.getMeasuredHeight(), 1073741824));
        if (this.qsH > 0.0f) {
            this.YFl.setPadding(0, ((int) (r7.getMeasuredHeight() - this.qsH)) / 2, 0, 0);
            this.Sg.setPadding(0, ((int) (this.YFl.getMeasuredHeight() - this.qsH)) / 2, 0, 0);
        }
    }
}
