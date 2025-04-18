package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class EH extends com.bytedance.sdk.openadsdk.core.wN.qsH {
    private RectF Sg;
    private Paint YFl;
    private int tN;

    public EH(Context context) {
        this(context, null);
    }

    private void YFl() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.YFl = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.YFl.setColor(Color.parseColor("#99333333"));
        this.YFl.setAntiAlias(true);
        this.YFl.setStrokeWidth(0.0f);
        this.Sg = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.Sg;
        float f10 = rectF.bottom;
        canvas.drawRoundRect(rectF, f10 / 2.0f, f10 / 2.0f, this.YFl);
        canvas.translate((this.Sg.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wN.qsH, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText("00");
            this.tN = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i12 = ((measuredHeight / 2) * 2) + measuredWidth;
            setMeasuredDimension(i12, measuredHeight);
            this.Sg.set(0.0f, 0.0f, i12, measuredHeight);
            return;
        }
        this.Sg.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public EH(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EH(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.tN = 0;
        YFl();
    }
}
