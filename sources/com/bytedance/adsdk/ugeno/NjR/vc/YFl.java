package com.bytedance.adsdk.ugeno.NjR.vc;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.YFl.vc;
import com.bytedance.adsdk.ugeno.YFl.wN;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.tN;

/* loaded from: classes.dex */
public class YFl extends TextView implements wN, IAnimation {
    private float Sg;
    private tN YFl;
    private vc tN;

    public YFl(Context context) {
        super(context);
        this.tN = new vc(this);
    }

    public void YFl(tN tNVar) {
        this.YFl = tNVar;
    }

    public float getBorderRadius() {
        return this.tN.YFl();
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.wN, com.bytedance.adsdk.ugeno.core.IAnimation
    public float getRipple() {
        return this.Sg;
    }

    @Override // com.bytedance.adsdk.ugeno.YFl.wN
    public float getShine() {
        return this.tN.getShine();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.DSW();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.qsH();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.YFl(canvas, this);
            this.YFl.YFl(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.YFl(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        tN tNVar = this.YFl;
        if (tNVar != null) {
            int[] YFl = tNVar.YFl(i10, i11);
            super.onMeasure(YFl[0], YFl[1]);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        tN tNVar = this.YFl;
        if (tNVar != null) {
            tNVar.Sg(i10, i11, i12, i12);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.tN.YFl(i10);
    }

    public void setBorderRadius(float f10) {
        vc vcVar = this.tN;
        if (vcVar != null) {
            vcVar.YFl(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f10) {
        this.Sg = f10;
        vc vcVar = this.tN;
        if (vcVar != null) {
            vcVar.Sg(f10);
        }
        postInvalidate();
    }

    public void setShine(float f10) {
        vc vcVar = this.tN;
        if (vcVar != null) {
            vcVar.tN(f10);
        }
    }
}
