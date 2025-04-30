package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CircleRippleView extends View {
    private Paint Bj;
    private float COT;
    private int HWF;
    private float KS;
    private boolean QR;
    private List<Integer> YW;
    private Paint dT;
    private int jU;
    private List<Integer> ku;
    private int lMd;
    private int rV;
    private float tG;
    private float vDp;
    private int zp;

    public CircleRippleView(Context context) {
        this(context, null);
    }

    private void KS() {
        Paint paint = new Paint();
        this.dT = paint;
        paint.setAntiAlias(true);
        this.dT.setStrokeWidth(this.rV);
        this.ku.add(255);
        this.YW.add(0);
        Paint paint2 = new Paint();
        this.Bj = paint2;
        paint2.setAntiAlias(true);
        this.Bj.setColor(Color.parseColor("#0FFFFFFF"));
        this.Bj.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void lMd() {
        this.QR = false;
        this.YW.clear();
        this.ku.clear();
        this.ku.add(255);
        this.YW.add(0);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.dT.setShader(new LinearGradient(this.vDp, 0.0f, this.tG, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i9 = 0;
        while (true) {
            int i10 = 1;
            if (i9 >= this.ku.size()) {
                break;
            }
            Integer num = this.ku.get(i9);
            this.dT.setAlpha(num.intValue());
            Integer num2 = this.YW.get(i9);
            if (this.KS + num2.intValue() < this.COT) {
                canvas.drawCircle(this.vDp, this.tG, this.KS + num2.intValue(), this.dT);
            }
            if (num.intValue() > 0 && num2.intValue() < this.COT) {
                List<Integer> list = this.ku;
                if (num.intValue() - this.HWF > 0) {
                    i10 = num.intValue() - (this.HWF * 3);
                }
                list.set(i9, Integer.valueOf(i10));
                this.YW.set(i9, Integer.valueOf(num2.intValue() + this.HWF));
            }
            i9++;
        }
        List<Integer> list2 = this.YW;
        if (list2.get(list2.size() - 1).intValue() >= this.COT / this.jU) {
            this.ku.add(255);
            this.YW.add(0);
        }
        if (this.YW.size() >= 3) {
            this.YW.remove(0);
            this.ku.remove(0);
        }
        this.dT.setAlpha(255);
        this.dT.setColor(this.lMd);
        canvas.drawCircle(this.vDp, this.tG, this.KS, this.Bj);
        if (this.QR) {
            invalidate();
        }
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
        float f9 = i9 / 2.0f;
        this.vDp = f9;
        this.tG = i10 / 2.0f;
        float f10 = f9 - (this.rV / 2.0f);
        this.COT = f10;
        this.KS = f10 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            invalidate();
        }
    }

    public void setColor(int i9) {
        this.zp = i9;
    }

    public void setCoreColor(int i9) {
        this.lMd = i9;
    }

    public void setCoreRadius(int i9) {
        this.KS = i9;
    }

    public void setDiffuseSpeed(int i9) {
        this.HWF = i9;
    }

    public void setDiffuseWidth(int i9) {
        this.jU = i9;
    }

    public void setMaxWidth(int i9) {
        this.COT = i9;
    }

    public void zp() {
        this.QR = true;
        invalidate();
    }

    public CircleRippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CircleRippleView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.zp = -1;
        this.lMd = -65536;
        this.KS = 18.0f;
        this.jU = 3;
        this.COT = 50.0f;
        this.HWF = 2;
        this.QR = false;
        this.ku = new ArrayList();
        this.YW = new ArrayList();
        this.rV = 24;
        KS();
    }
}
