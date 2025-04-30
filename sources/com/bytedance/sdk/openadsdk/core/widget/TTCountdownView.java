package com.bytedance.sdk.openadsdk.core.widget;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.KVG;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class TTCountdownView extends View {
    public static final String zp = cz.zp(KVG.zp(), "tt_count_down_view");
    private Paint Bj;
    private float COT;
    private float HWF;
    private float KS;
    private AnimatorSet KVG;
    private final String QR;
    private Paint YW;
    private zp dQp;
    private Paint dT;
    private int jU;
    private Paint ku;
    private float lMd;
    private ValueAnimator pvr;
    private RectF rV;
    private float tG;
    private float vDp;
    private ValueAnimator vwr;
    private ValueAnimator woN;

    /* loaded from: classes.dex */
    public interface zp {
    }

    private ValueAnimator getArcAnim() {
        ValueAnimator valueAnimator = this.vwr;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.vwr = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.vDp, 0.0f);
        this.vwr = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.vwr.setDuration(zp(this.vDp, this.COT) * 1000.0f);
        this.vwr.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.vDp = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.vwr;
    }

    private ValueAnimator getNumAnim() {
        ValueAnimator valueAnimator = this.woN;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.woN = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.tG, 0.0f);
        this.woN = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.woN.setDuration(zp(this.tG, this.HWF) * 1000.0f);
        this.woN.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.TTCountdownView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TTCountdownView.this.tG = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                TTCountdownView.this.postInvalidate();
            }
        });
        return this.woN;
    }

    public zp getCountdownListener() {
        return this.dQp;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        zp();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        lMd(canvas);
        zp(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int size = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode != 1073741824) {
            size = lMd();
        }
        if (mode2 != 1073741824) {
            size2 = lMd();
        }
        setMeasuredDimension(size, size2);
    }

    public void setCountDownTime(int i9) {
        float f9 = i9;
        this.HWF = f9;
        this.COT = f9;
        zp();
    }

    public void setCountdownListener(zp zpVar) {
        this.dQp = zpVar;
    }

    public float zp(float f9, float f10) {
        return f9 * f10;
    }

    private int lMd() {
        return (int) ((((this.lMd / 2.0f) + this.KS) * 2.0f) + WNy.lMd(getContext(), 4.0f));
    }

    public float zp(float f9, int i9) {
        return i9 * f9;
    }

    private void lMd(Canvas canvas) {
        canvas.save();
        float zp2 = zp(this.vDp, 360);
        float f9 = this.jU;
        canvas.drawCircle(0.0f, 0.0f, this.KS, this.YW);
        canvas.drawCircle(0.0f, 0.0f, this.KS, this.dT);
        canvas.drawArc(this.rV, f9, zp2, false, this.ku);
        canvas.restore();
    }

    private void zp(Canvas canvas) {
        canvas.save();
        Paint.FontMetrics fontMetrics = this.Bj.getFontMetrics();
        String str = this.QR;
        if (TextUtils.isEmpty(str)) {
            str = zp;
        }
        canvas.drawText(str, 0.0f, 0.0f - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f), this.Bj);
        canvas.restore();
    }

    public void zp() {
        AnimatorSet animatorSet = this.KVG;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.KVG = null;
        }
        ValueAnimator valueAnimator = this.pvr;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.pvr = null;
        }
        ValueAnimator valueAnimator2 = this.woN;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.woN = null;
        }
        ValueAnimator valueAnimator3 = this.vwr;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.vwr = null;
        }
        this.vDp = 1.0f;
        this.tG = 1.0f;
        invalidate();
    }
}
