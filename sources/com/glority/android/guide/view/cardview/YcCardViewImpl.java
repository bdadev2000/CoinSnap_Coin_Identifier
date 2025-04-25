package com.glority.android.guide.view.cardview;

import android.content.Context;

/* loaded from: classes3.dex */
interface YcCardViewImpl {
    float getElevation(YcCardViewDelegate ycCardViewDelegate);

    float getMaxElevation(YcCardViewDelegate ycCardViewDelegate);

    float getMinHeight(YcCardViewDelegate ycCardViewDelegate);

    float getMinWidth(YcCardViewDelegate ycCardViewDelegate);

    float getRadius(YcCardViewDelegate ycCardViewDelegate);

    void initStatic();

    void initialize(YcCardViewDelegate ycCardViewDelegate, Context context, int i, float f, float f2, float f3, int i2, int i3);

    void onCompatPaddingChanged(YcCardViewDelegate ycCardViewDelegate);

    void onPreventCornerOverlapChanged(YcCardViewDelegate ycCardViewDelegate);

    void setBackgroundColor(YcCardViewDelegate ycCardViewDelegate, int i);

    void setElevation(YcCardViewDelegate ycCardViewDelegate, float f);

    void setMaxElevation(YcCardViewDelegate ycCardViewDelegate, float f);

    void setRadius(YcCardViewDelegate ycCardViewDelegate, float f);

    void updatePadding(YcCardViewDelegate ycCardViewDelegate);
}
