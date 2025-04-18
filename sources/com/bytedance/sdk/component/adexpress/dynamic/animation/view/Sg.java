package com.bytedance.sdk.component.adexpress.dynamic.animation.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW;

/* loaded from: classes.dex */
public class Sg extends ImageView implements IAnimation {
    private float AlY;
    private float Sg;
    tN YFl;
    private float tN;

    /* renamed from: vc, reason: collision with root package name */
    private DSW f10385vc;
    private float wN;

    public Sg(Context context) {
        super(context);
        this.YFl = new tN();
    }

    public DSW getBrickNativeValue() {
        return this.f10385vc;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.AlY;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.Sg;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.wN;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        DSW dsw;
        super.onDraw(canvas);
        this.YFl.YFl(canvas, this, this);
        if (getRippleValue() != 0.0f && (dsw = this.f10385vc) != null && dsw.Sg() > 0) {
            ((ViewGroup) getParent()).setClipChildren(false);
            ((ViewGroup) getParent().getParent()).setClipChildren(false);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.YFl.YFl(this, i10, i11);
    }

    public void setBrickNativeValue(DSW dsw) {
        this.f10385vc = dsw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.AlY = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.Sg = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.tN = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.wN = f10;
        this.YFl.YFl(this, f10);
    }
}
