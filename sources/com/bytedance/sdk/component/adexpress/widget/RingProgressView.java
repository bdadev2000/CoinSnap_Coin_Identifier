package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class RingProgressView extends View {
    private ValueAnimator COT;
    private int HWF;
    private RectF KS;
    private boolean QR;
    private float jU;
    private Paint lMd;
    private Context zp;

    public RingProgressView(Context context) {
        super(context);
        this.HWF = 1500;
        this.zp = context;
        Paint paint = new Paint();
        this.lMd = paint;
        paint.setAntiAlias(true);
        this.lMd.setStyle(Paint.Style.STROKE);
        this.lMd.setStrokeWidth(10.0f);
        this.lMd.setColor(Color.parseColor("#80FFFFFF"));
        this.KS = new RectF();
    }

    public void KS() {
        this.QR = true;
        invalidate();
    }

    public void lMd() {
        ValueAnimator valueAnimator = this.COT;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.QR) {
            return;
        }
        canvas.drawArc(this.KS, 270.0f, this.jU, false, this.lMd);
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.KS.set(5.0f, 5.0f, i9 - 5, i10 - 5);
    }

    public void setDuration(int i9) {
        this.HWF = i9;
    }

    public void zp() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.COT = ofFloat;
        ofFloat.setDuration(this.HWF);
        this.COT.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.RingProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RingProgressView.this.jU = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RingProgressView.this.requestLayout();
            }
        });
        this.COT.start();
    }
}
