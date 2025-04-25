package com.glority.android.guide.view.cardview;

import android.content.Context;
import android.util.Log;
import android.view.View;

/* loaded from: classes3.dex */
class YcCardViewApi21 implements YcCardViewImpl {
    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void initStatic() {
    }

    YcCardViewApi21() {
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void initialize(YcCardViewDelegate ycCardViewDelegate, Context context, int i, float f, float f2, float f3, int i2, int i3) {
        Log.e("AAA", "CardViewApi21");
        ycCardViewDelegate.setCardBackground(new YcRoundRectDrawable(i, f));
        View cardView = ycCardViewDelegate.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        setMaxElevation(ycCardViewDelegate, f3);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void setRadius(YcCardViewDelegate ycCardViewDelegate, float f) {
        getCardBackground(ycCardViewDelegate).setRadius(f);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void setMaxElevation(YcCardViewDelegate ycCardViewDelegate, float f) {
        getCardBackground(ycCardViewDelegate).setPadding(f, ycCardViewDelegate.getUseCompatPadding(), ycCardViewDelegate.getPreventCornerOverlap());
        updatePadding(ycCardViewDelegate);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getMaxElevation(YcCardViewDelegate ycCardViewDelegate) {
        return getCardBackground(ycCardViewDelegate).getPadding();
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getMinWidth(YcCardViewDelegate ycCardViewDelegate) {
        return getRadius(ycCardViewDelegate) * 2.0f;
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getMinHeight(YcCardViewDelegate ycCardViewDelegate) {
        return getRadius(ycCardViewDelegate) * 2.0f;
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getRadius(YcCardViewDelegate ycCardViewDelegate) {
        return getCardBackground(ycCardViewDelegate).getRadius();
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void setElevation(YcCardViewDelegate ycCardViewDelegate, float f) {
        ycCardViewDelegate.getCardView().setElevation(f);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public float getElevation(YcCardViewDelegate ycCardViewDelegate) {
        return ycCardViewDelegate.getCardView().getElevation();
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void updatePadding(YcCardViewDelegate ycCardViewDelegate) {
        if (!ycCardViewDelegate.getUseCompatPadding()) {
            ycCardViewDelegate.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float maxElevation = getMaxElevation(ycCardViewDelegate);
        float radius = getRadius(ycCardViewDelegate);
        int ceil = (int) Math.ceil(YcRoundRectDrawableWithShadow.calculateHorizontalPadding(maxElevation, radius, ycCardViewDelegate.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(YcRoundRectDrawableWithShadow.calculateVerticalPadding(maxElevation, radius, ycCardViewDelegate.getPreventCornerOverlap()));
        ycCardViewDelegate.setShadowPadding(ceil, ceil2, ceil, ceil2);
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void onCompatPaddingChanged(YcCardViewDelegate ycCardViewDelegate) {
        setMaxElevation(ycCardViewDelegate, getMaxElevation(ycCardViewDelegate));
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void onPreventCornerOverlapChanged(YcCardViewDelegate ycCardViewDelegate) {
        setMaxElevation(ycCardViewDelegate, getMaxElevation(ycCardViewDelegate));
    }

    @Override // com.glority.android.guide.view.cardview.YcCardViewImpl
    public void setBackgroundColor(YcCardViewDelegate ycCardViewDelegate, int i) {
        getCardBackground(ycCardViewDelegate).setColor(i);
    }

    private YcRoundRectDrawable getCardBackground(YcCardViewDelegate ycCardViewDelegate) {
        return (YcRoundRectDrawable) ycCardViewDelegate.getCardBackground();
    }
}
