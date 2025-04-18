package com.bytedance.sdk.component.adexpress.vc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class VOe extends View {
    private static int tN = 50;
    private ObjectAnimator AlY;
    private int Sg;
    private Paint YFl;

    public VOe(Context context) {
        this(context, null);
    }

    private void tN() {
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setAntiAlias(true);
        this.YFl.setColor(Color.parseColor("#FFFFFFFF"));
        this.YFl.setStyle(Paint.Style.STROKE);
        this.YFl.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.AlY = ofFloat;
        ofFloat.setDuration(200L);
    }

    public void Sg() {
        clearAnimation();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.YFl.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.Sg, this.YFl);
    }

    public VOe(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VOe(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Sg = 10;
        tN();
    }

    public void YFl() {
        int min = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        tN = min;
        ValueAnimator ofInt = ValueAnimator.ofInt(10, min);
        ofInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.vc.VOe.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                VOe.this.Sg = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                VOe.this.invalidate();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.vc.VOe.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                VOe.this.AlY.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                VOe.this.setVisibility(0);
                VOe.this.setAlpha(1.0f);
            }
        });
        ofInt.start();
    }
}
