package com.bytedance.sdk.component.adexpress.vc;

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
public class AlY extends View {
    private int AlY;
    private boolean DSW;
    private float GA;
    private List<Integer> NjR;
    private int Sg;
    private int YFl;
    private float YoT;
    private Paint eT;

    /* renamed from: nc, reason: collision with root package name */
    private Paint f10404nc;
    private int pDU;
    private List<Integer> qsH;
    private float tN;

    /* renamed from: vc, reason: collision with root package name */
    private int f10405vc;
    private float wN;

    public AlY(Context context) {
        this(context, null);
    }

    private void tN() {
        Paint paint = new Paint();
        this.f10404nc = paint;
        paint.setAntiAlias(true);
        this.f10404nc.setStrokeWidth(this.pDU);
        this.qsH.add(255);
        this.NjR.add(0);
        Paint paint2 = new Paint();
        this.eT = paint2;
        paint2.setAntiAlias(true);
        this.eT.setColor(Color.parseColor("#0FFFFFFF"));
        this.eT.setStyle(Paint.Style.FILL);
    }

    public void Sg() {
        this.DSW = false;
        this.NjR.clear();
        this.qsH.clear();
        this.qsH.add(255);
        this.NjR.add(0);
        invalidate();
    }

    public void YFl() {
        this.DSW = true;
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f10404nc.setShader(new LinearGradient(this.YoT, 0.0f, this.GA, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i10 = 0;
        while (true) {
            int i11 = 1;
            if (i10 >= this.qsH.size()) {
                break;
            }
            Integer num = this.qsH.get(i10);
            this.f10404nc.setAlpha(num.intValue());
            Integer num2 = this.NjR.get(i10);
            if (this.tN + num2.intValue() < this.wN) {
                canvas.drawCircle(this.YoT, this.GA, this.tN + num2.intValue(), this.f10404nc);
            }
            if (num.intValue() > 0 && num2.intValue() < this.wN) {
                List<Integer> list = this.qsH;
                if (num.intValue() - this.f10405vc > 0) {
                    i11 = num.intValue() - (this.f10405vc * 3);
                }
                list.set(i10, Integer.valueOf(i11));
                this.NjR.set(i10, Integer.valueOf(num2.intValue() + this.f10405vc));
            }
            i10++;
        }
        List<Integer> list2 = this.NjR;
        if (list2.get(list2.size() - 1).intValue() >= this.wN / this.AlY) {
            this.qsH.add(255);
            this.NjR.add(0);
        }
        if (this.NjR.size() >= 3) {
            this.NjR.remove(0);
            this.qsH.remove(0);
        }
        this.f10404nc.setAlpha(255);
        this.f10404nc.setColor(this.Sg);
        canvas.drawCircle(this.YoT, this.GA, this.tN, this.eT);
        if (this.DSW) {
            invalidate();
        }
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
        float f10 = i10 / 2.0f;
        this.YoT = f10;
        this.GA = i11 / 2.0f;
        float f11 = f10 - (this.pDU / 2.0f);
        this.wN = f11;
        this.tN = f11 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            invalidate();
        }
    }

    public void setColor(int i10) {
        this.YFl = i10;
    }

    public void setCoreColor(int i10) {
        this.Sg = i10;
    }

    public void setCoreRadius(int i10) {
        this.tN = i10;
    }

    public void setDiffuseSpeed(int i10) {
        this.f10405vc = i10;
    }

    public void setDiffuseWidth(int i10) {
        this.AlY = i10;
    }

    public void setMaxWidth(int i10) {
        this.wN = i10;
    }

    public AlY(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public AlY(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.YFl = -1;
        this.Sg = -65536;
        this.tN = 18.0f;
        this.AlY = 3;
        this.wN = 50.0f;
        this.f10405vc = 2;
        this.DSW = false;
        this.qsH = new ArrayList();
        this.NjR = new ArrayList();
        this.pDU = 24;
        tN();
    }
}
