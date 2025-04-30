package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.QR;

/* loaded from: classes.dex */
public class AnimationImageView extends ImageView implements IAnimation {
    private float COT;
    private QR HWF;
    private float KS;
    private float jU;
    private float lMd;
    zp zp;

    public AnimationImageView(Context context) {
        super(context);
        this.zp = new zp();
    }

    public QR getBrickNativeValue() {
        return this.HWF;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.COT;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        QR qr;
        super.onDraw(canvas);
        this.zp.zp(canvas, this, this);
        if (getRippleValue() != 0.0f && (qr = this.HWF) != null && qr.lMd() > 0) {
            ((ViewGroup) getParent()).setClipChildren(false);
            ((ViewGroup) getParent().getParent()).setClipChildren(false);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.zp.zp(this, i9, i10);
    }

    public void setBrickNativeValue(QR qr) {
        this.HWF = qr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f9) {
        this.jU = f9;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f9) {
        this.lMd = f9;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f9) {
        this.KS = f9;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f9) {
        this.COT = f9;
        this.zp.zp(this, f9);
    }
}
