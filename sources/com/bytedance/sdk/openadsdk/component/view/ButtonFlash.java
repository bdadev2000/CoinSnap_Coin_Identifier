package com.bytedance.sdk.openadsdk.component.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.widget.TextView;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public class ButtonFlash extends TextView {
    private RectF COT;
    private Matrix HWF;
    private Paint KS;
    private ValueAnimator QR;
    private LinearGradient jU;
    private boolean ku;
    private int lMd;
    private int zp;

    public ButtonFlash(Context context) {
        super(context);
        this.ku = true;
        lMd();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.HWF != null) {
            canvas.drawRoundRect(this.COT, 100.0f, 100.0f, this.KS);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.zp = i9;
        this.lMd = i10;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.zp / 2.0f, this.lMd, new int[]{ViewCompat.MEASURED_SIZE_MASK, 1358954495, ViewCompat.MEASURED_SIZE_MASK}, new float[]{0.1f, 0.3f, 0.5f}, Shader.TileMode.CLAMP);
        this.jU = linearGradient;
        this.KS.setShader(linearGradient);
        this.KS.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        Matrix matrix = new Matrix();
        this.HWF = matrix;
        matrix.setTranslate(-this.zp, this.lMd);
        this.jU.setLocalMatrix(this.HWF);
        this.COT.set(0.0f, 0.0f, this.zp, this.lMd);
    }

    public void setAutoRun(boolean z8) {
        this.ku = z8;
    }

    private void KS() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.QR = ofFloat;
        ofFloat.setDuration(3000L);
        this.QR.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.view.ButtonFlash.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((ButtonFlash.this.zp * 2) * ((Float) valueAnimator.getAnimatedValue()).floatValue()) - ButtonFlash.this.zp;
                if (ButtonFlash.this.HWF != null) {
                    ButtonFlash.this.HWF.setTranslate(floatValue, ButtonFlash.this.lMd);
                }
                if (ButtonFlash.this.jU != null) {
                    ButtonFlash.this.jU.setLocalMatrix(ButtonFlash.this.HWF);
                }
                ButtonFlash.this.invalidate();
            }
        });
        if (this.ku) {
            this.QR.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.QR;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        }
    }

    private void lMd() {
        this.COT = new RectF();
        this.KS = new Paint();
        KS();
    }

    public void zp() {
        ValueAnimator valueAnimator = this.QR;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.QR.cancel();
            invalidate();
        }
    }
}
