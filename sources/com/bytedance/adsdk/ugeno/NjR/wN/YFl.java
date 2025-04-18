package com.bytedance.adsdk.ugeno.NjR.wN;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.DSW.AlY;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import com.bytedance.adsdk.ugeno.tN;

/* loaded from: classes.dex */
public class YFl extends FrameLayout {
    private float AlY;
    private Context DSW;
    private float Sg;
    private float YFl;
    private tN qsH;
    private double tN;

    /* renamed from: vc, reason: collision with root package name */
    private LinearLayout f10245vc;
    private LinearLayout wN;

    public YFl(Context context) {
        super(context);
        this.DSW = context;
        this.wN = new LinearLayout(context);
        this.f10245vc = new LinearLayout(context);
        this.wN.setOrientation(0);
        this.wN.setGravity(8388611);
        this.f10245vc.setOrientation(0);
        this.f10245vc.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.YFl, (int) this.Sg);
        float f10 = this.AlY;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void YFl(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.wN.removeAllViews();
        this.f10245vc.removeAllViews();
        this.YFl = (int) qsH.YFl(this.DSW, f10);
        this.Sg = (int) qsH.YFl(this.DSW, f10);
        this.tN = d10;
        this.AlY = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(AlY.YFl(this.DSW, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.f10245vc.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(AlY.YFl(this.DSW, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
            this.wN.addView(starImageView2);
        }
        addView(this.wN);
        addView(this.f10245vc);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.DSW();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.qsH();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.YFl(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.YFl(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.wN.measure(i10, i11);
        double floor = Math.floor(this.tN);
        float f10 = this.AlY;
        this.f10245vc.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.tN - floor) * this.YFl) + ((f10 + f10 + r2) * floor) + f10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.wN.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        tN tNVar = this.qsH;
        if (tNVar != null) {
            tNVar.Sg(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void YFl(tN tNVar) {
        this.qsH = tNVar;
    }
}
