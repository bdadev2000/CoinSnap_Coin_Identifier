package com.glority.android.guide.view.cardview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.glority.android.guide.view.cardview.YcRoundRectDrawableWithShadow;

/* loaded from: classes3.dex */
class YcCardViewJellybeanMr1 extends YcCardViewEclairMr1 {
    @Override // com.glority.android.guide.view.cardview.YcCardViewEclairMr1, com.glority.android.guide.view.cardview.YcCardViewImpl
    public void initStatic() {
        YcRoundRectDrawableWithShadow.sRoundRectHelper = new YcRoundRectDrawableWithShadow.RoundRectHelper() { // from class: com.glority.android.guide.view.cardview.YcCardViewJellybeanMr1.1
            @Override // com.glority.android.guide.view.cardview.YcRoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
