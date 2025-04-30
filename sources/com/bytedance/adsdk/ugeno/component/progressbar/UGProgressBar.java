package com.bytedance.adsdk.ugeno.component.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.lMd;

/* loaded from: classes.dex */
public class UGProgressBar extends FrameLayout {
    private int COT;
    private View KS;
    private TextView jU;
    private View lMd;
    private lMd zp;

    public UGProgressBar(Context context) {
        super(context);
        zp(context);
    }

    private void zp(Context context) {
        this.lMd = new View(context);
        this.KS = new View(context);
        addView(this.lMd);
        addView(this.KS);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.lMd.getLayoutParams();
        layoutParams.width = 0;
        layoutParams.height = -1;
        layoutParams.gravity = 3;
        this.lMd.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.KS.getLayoutParams();
        layoutParams2.width = this.COT;
        layoutParams2.gravity = 5;
        this.KS.setLayoutParams(layoutParams2);
        TextView textView = new TextView(context);
        this.jU = textView;
        textView.setTextColor(-1);
        this.jU.setTextSize(16.0f);
        this.jU.setGravity(17);
        addView(this.jU);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lMd lmd = this.zp;
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
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.zp(i9, i10, i11, i12);
        }
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        lMd lmd = this.zp;
        if (lmd != null) {
            lmd.zp(i9, i10);
        }
        super.onMeasure(i9, i10);
        this.COT = zp(0, i9);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.COT = i9;
    }

    public void setProgress(float f9) {
        int width = getWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.lMd.getLayoutParams();
        float f10 = width;
        float f11 = (f9 / 100.0f) * f10;
        layoutParams.width = (int) f11;
        this.lMd.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.KS.getLayoutParams();
        layoutParams2.width = (int) (f10 - f11);
        this.KS.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.jU.getLayoutParams();
        layoutParams3.width = width;
        layoutParams3.gravity = 17;
        requestLayout();
    }

    public void setProgressBgColor(int i9) {
        this.KS.setBackgroundColor(i9);
    }

    public void setProgressColor(int i9) {
        this.lMd.setBackgroundColor(i9);
    }

    public void setText(String str) {
        this.jU.setText(str);
    }

    public void setTextColor(int i9) {
        this.jU.setTextColor(i9);
    }

    private int zp(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode == 1073741824 ? size : mode == Integer.MIN_VALUE ? Math.min(i9, size) : i9;
    }

    public void zp(lMd lmd) {
        this.zp = lmd;
    }
}
