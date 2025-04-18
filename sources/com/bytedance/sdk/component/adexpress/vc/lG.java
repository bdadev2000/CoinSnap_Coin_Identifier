package com.bytedance.sdk.component.adexpress.vc;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes.dex */
public class lG extends View {
    private float AlY;
    private boolean DSW;
    private Paint Sg;
    private Context YFl;
    private RectF tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10422vc;
    private ValueAnimator wN;

    public lG(Context context) {
        super(context);
        this.f10422vc = 1500;
        this.YFl = context;
        Paint paint = new Paint();
        this.Sg = paint;
        paint.setAntiAlias(true);
        this.Sg.setStyle(Paint.Style.STROKE);
        this.Sg.setStrokeWidth(10.0f);
        this.Sg.setColor(Color.parseColor("#80FFFFFF"));
        this.tN = new RectF();
    }

    public void Sg() {
        ValueAnimator valueAnimator = this.wN;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.DSW) {
            return;
        }
        canvas.drawArc(this.tN, 270.0f, this.AlY, false, this.Sg);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.tN.set(5.0f, 5.0f, i10 - 5, i11 - 5);
    }

    public void setDuration(int i10) {
        this.f10422vc = i10;
    }

    public void tN() {
        this.DSW = true;
        invalidate();
    }

    public void YFl() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.wN = ofFloat;
        ofFloat.setDuration(this.f10422vc);
        this.wN.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.vc.lG.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                lG.this.AlY = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lG.this.requestLayout();
            }
        });
        this.wN.start();
    }
}
