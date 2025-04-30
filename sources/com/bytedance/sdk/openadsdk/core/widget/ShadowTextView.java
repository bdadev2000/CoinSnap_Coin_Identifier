package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;

/* loaded from: classes.dex */
public class ShadowTextView extends PAGTextView {
    private int KS;
    private RectF lMd;
    private Paint zp;

    public ShadowTextView(Context context) {
        this(context, null);
    }

    private void zp() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.zp = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.zp.setColor(Color.parseColor("#99333333"));
        this.zp.setAntiAlias(true);
        this.zp.setStrokeWidth(0.0f);
        this.lMd = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.lMd;
        float f9 = rectF.bottom;
        canvas.drawRoundRect(rectF, f9 / 2.0f, f9 / 2.0f, this.zp);
        canvas.translate((this.lMd.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    @Override // com.bytedance.sdk.openadsdk.core.customview.PAGTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText("00");
            this.KS = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i11 = ((measuredHeight / 2) * 2) + measuredWidth;
            setMeasuredDimension(i11, measuredHeight);
            this.lMd.set(0.0f, 0.0f, i11, measuredHeight);
            return;
        }
        this.lMd.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public ShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.KS = 0;
        zp();
    }
}
