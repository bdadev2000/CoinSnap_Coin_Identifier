package com.glority.android.guide.view.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.glority.android.guide.view.cardview.YcRoundRectDrawableWithShadow;

/* loaded from: classes3.dex */
class YcCardViewEclairMr1 implements YcCardViewImpl {
    final RectF sCornerRect = new RectF();

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void onCompatPaddingChanged(YcCardViewDelegate ycCardViewDelegate) {
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void initStatic() {
        YcRoundRectDrawableWithShadow.sRoundRectHelper = new YcRoundRectDrawableWithShadow.RoundRectHelper() { // from class: com.glority.android.guide.view.cardview.YcCardViewEclairMr1.1
            @Override // com.glority.android.guide.view.cardview.YcRoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    YcCardViewEclairMr1.this.sCornerRect.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(YcCardViewEclairMr1.this.sCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(YcCardViewEclairMr1.this.sCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(YcCardViewEclairMr1.this.sCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(YcCardViewEclairMr1.this.sCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint);
                    canvas.drawRect((rectF.left + f3) - 1.0f, (rectF.bottom - f3) + 1.0f, (rectF.right - f3) + 1.0f, rectF.bottom, paint);
                }
                canvas.drawRect(rectF.left, Math.max(0.0f, f - 1.0f) + rectF.top, rectF.right, (rectF.bottom - f) + 1.0f, paint);
            }
        };
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void initialize(YcCardViewDelegate ycCardViewDelegate, Context context, int i, float f, float f2, float f3, int i2, int i3) {
        YcRoundRectDrawableWithShadow createBackground = createBackground(context, i, f, f2, f3, i2, i3);
        createBackground.setAddPaddingForCorners(ycCardViewDelegate.getPreventCornerOverlap());
        ycCardViewDelegate.setCardBackground(createBackground);
        updatePadding(ycCardViewDelegate);
    }

    private YcRoundRectDrawableWithShadow createBackground(Context context, int i, float f, float f2, float f3, int i2, int i3) {
        return new YcRoundRectDrawableWithShadow(context.getResources(), i, f, f2, f3, i2, i3);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void updatePadding(YcCardViewDelegate ycCardViewDelegate) {
        Rect rect = new Rect();
        getShadowBackground(ycCardViewDelegate).getMaxShadowAndCornerPadding(rect);
        ycCardViewDelegate.setMinWidthHeightInternal((int) Math.ceil(getMinWidth(ycCardViewDelegate)), (int) Math.ceil(getMinHeight(ycCardViewDelegate)));
        ycCardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void onPreventCornerOverlapChanged(YcCardViewDelegate ycCardViewDelegate) {
        getShadowBackground(ycCardViewDelegate).setAddPaddingForCorners(ycCardViewDelegate.getPreventCornerOverlap());
        updatePadding(ycCardViewDelegate);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void setBackgroundColor(YcCardViewDelegate ycCardViewDelegate, int i) {
        getShadowBackground(ycCardViewDelegate).setColor(i);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void setRadius(YcCardViewDelegate ycCardViewDelegate, float f) {
        getShadowBackground(ycCardViewDelegate).setCornerRadius(f);
        updatePadding(ycCardViewDelegate);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getRadius(YcCardViewDelegate ycCardViewDelegate) {
        return getShadowBackground(ycCardViewDelegate).getCornerRadius();
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void setElevation(YcCardViewDelegate ycCardViewDelegate, float f) {
        getShadowBackground(ycCardViewDelegate).setShadowSize(f);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getElevation(YcCardViewDelegate ycCardViewDelegate) {
        return getShadowBackground(ycCardViewDelegate).getShadowSize();
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void setMaxElevation(YcCardViewDelegate ycCardViewDelegate, float f) {
        getShadowBackground(ycCardViewDelegate).setMaxShadowSize(f);
        updatePadding(ycCardViewDelegate);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getMaxElevation(YcCardViewDelegate ycCardViewDelegate) {
        return getShadowBackground(ycCardViewDelegate).getMaxShadowSize();
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getMinWidth(YcCardViewDelegate ycCardViewDelegate) {
        return getShadowBackground(ycCardViewDelegate).getMinWidth();
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getMinHeight(YcCardViewDelegate ycCardViewDelegate) {
        return getShadowBackground(ycCardViewDelegate).getMinHeight();
    }

    private YcRoundRectDrawableWithShadow getShadowBackground(YcCardViewDelegate ycCardViewDelegate) {
        return (YcRoundRectDrawableWithShadow) ycCardViewDelegate.getCardBackground();
    }
}
