package com.bytedance.adsdk.ugeno.component.text;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.IAnimation;

/* loaded from: classes.dex */
public class UGTextView extends TextView implements IAnimation {
    private float lMd;
    private com.bytedance.adsdk.ugeno.lMd zp;

    public UGTextView(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.lMd;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.lMd lmd = this.zp;
        if (lmd != null) {
            lmd.HWF();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.lMd lmd = this.zp;
        if (lmd != null) {
            lmd.QR();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        com.bytedance.adsdk.ugeno.lMd lmd = this.zp;
        if (lmd != null) {
            lmd.zp(canvas, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        com.bytedance.adsdk.ugeno.lMd lmd = this.zp;
        if (lmd != null) {
            lmd.zp(i9, i10, i11, i12);
        }
        super.onLayout(z8, i9, i10, i11, i12);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        com.bytedance.adsdk.ugeno.lMd lmd = this.zp;
        if (lmd != null) {
            int[] zp = lmd.zp(i9, i10);
            super.onMeasure(zp[0], zp[1]);
        } else {
            super.onMeasure(i9, i10);
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        com.bytedance.adsdk.ugeno.lMd lmd = this.zp;
        if (lmd != null) {
            lmd.lMd(i9, i10, i11, i11);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f9) {
        this.lMd = f9;
        postInvalidate();
    }

    public void zp(com.bytedance.adsdk.ugeno.lMd lmd) {
        this.zp = lmd;
    }
}
