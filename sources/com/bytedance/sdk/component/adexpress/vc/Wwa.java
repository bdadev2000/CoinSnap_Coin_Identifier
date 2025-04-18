package com.bytedance.sdk.component.adexpress.vc;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class Wwa extends View {
    private ValueAnimator AlY;
    private float DSW;
    private Animator.AnimatorListener NjR;
    private float Sg;
    private float YFl;

    /* renamed from: nc, reason: collision with root package name */
    private int f10413nc;
    private float qsH;
    private ValueAnimator tN;

    /* renamed from: vc, reason: collision with root package name */
    private long f10414vc;
    private Paint wN;

    public Wwa(Context context, int i10) {
        super(context);
        this.f10414vc = 300L;
        this.DSW = 0.0f;
        this.f10413nc = i10;
        YFl();
    }

    public void Sg() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.qsH);
        this.tN = ofFloat;
        ofFloat.setDuration(this.f10414vc);
        this.tN.setInterpolator(new LinearInterpolator());
        this.tN.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.vc.Wwa.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Wwa.this.DSW = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Wwa.this.invalidate();
            }
        });
        this.tN.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.YFl, this.Sg, this.DSW, this.wN);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.YFl = i10 / 2.0f;
        this.Sg = i11 / 2.0f;
        this.qsH = (float) (Math.hypot(i10, i11) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.NjR = animatorListener;
    }

    public void tN() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.qsH, 0.0f);
        this.AlY = ofFloat;
        ofFloat.setDuration(this.f10414vc);
        this.AlY.setInterpolator(new LinearInterpolator());
        this.AlY.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.vc.Wwa.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Wwa.this.DSW = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Wwa.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.NjR;
        if (animatorListener != null) {
            this.AlY.addListener(animatorListener);
        }
        this.AlY.start();
    }

    public void YFl() {
        Paint paint = new Paint(1);
        this.wN = paint;
        paint.setStyle(Paint.Style.FILL);
        this.wN.setColor(this.f10413nc);
    }
}
