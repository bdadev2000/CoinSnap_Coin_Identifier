package com.bytedance.sdk.openadsdk.tN;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class YFl extends com.bytedance.sdk.openadsdk.core.wN.qsH {
    private int AlY;
    private float Sg;
    private Paint YFl;
    private boolean tN;

    public YFl(Context context) {
        super(context);
        YFl();
    }

    private void YFl() {
        this.Sg = GS.YFl(getContext(), 8.0f);
        this.YFl = new Paint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        YFl(getText().toString(), getWidth());
    }

    @Override // com.bytedance.sdk.openadsdk.core.wN.qsH, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.AlY = getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, this.AlY);
        } else {
            layoutParams.height = this.AlY;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wN.qsH, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        int i10 = this.AlY;
        if (i10 != 0 && layoutParams != null) {
            layoutParams.height = i10;
        }
    }

    public void setMinTextSize(float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        this.Sg = f10;
    }

    private void YFl(String str, int i10) {
        if (!this.tN && i10 > 0) {
            float textSize = getTextSize();
            this.YFl.set(getPaint());
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            float YFl = YFl(textSize, str);
            while (YFl > paddingLeft) {
                textSize -= 1.0f;
                this.YFl.setTextSize(textSize);
                if (textSize <= this.Sg) {
                    break;
                } else {
                    YFl = YFl(textSize, str);
                }
            }
            setTextSize(0, textSize);
            this.tN = true;
        }
    }

    private float YFl(float f10, String str) {
        this.YFl.setTextSize(f10);
        return this.YFl.measureText(str);
    }
}
