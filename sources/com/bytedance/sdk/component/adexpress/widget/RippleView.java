package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class RippleView extends View {
    private Paint COT;
    private long HWF;
    private ValueAnimator KS;
    private float QR;
    private Animator.AnimatorListener YW;
    private int dT;
    private ValueAnimator jU;
    private float ku;
    private float lMd;
    private float zp;

    public RippleView(Context context, int i9) {
        super(context);
        this.HWF = 300L;
        this.QR = 0.0f;
        this.dT = i9;
        zp();
    }

    public void KS() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.ku, 0.0f);
        this.jU = ofFloat;
        ofFloat.setDuration(this.HWF);
        this.jU.setInterpolator(new LinearInterpolator());
        this.jU.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.QR = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.YW;
        if (animatorListener != null) {
            this.jU.addListener(animatorListener);
        }
        this.jU.start();
    }

    public void lMd() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.ku);
        this.KS = ofFloat;
        ofFloat.setDuration(this.HWF);
        this.KS.setInterpolator(new LinearInterpolator());
        this.KS.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RippleView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RippleView.this.QR = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RippleView.this.invalidate();
            }
        });
        this.KS.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.zp, this.lMd, this.QR, this.COT);
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.zp = i9 / 2.0f;
        this.lMd = i10 / 2.0f;
        this.ku = (float) (Math.hypot(i9, i10) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.YW = animatorListener;
    }

    public void zp() {
        Paint paint = new Paint(1);
        this.COT = paint;
        paint.setStyle(Paint.Style.FILL);
        this.COT.setColor(this.dT);
    }
}
