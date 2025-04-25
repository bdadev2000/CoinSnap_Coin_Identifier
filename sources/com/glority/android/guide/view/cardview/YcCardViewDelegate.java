package com.glority.android.guide.view.cardview;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
interface YcCardViewDelegate {
    Drawable getCardBackground();

    View getCardView();

    boolean getPreventCornerOverlap();

    boolean getUseCompatPadding();

    void setCardBackground(Drawable drawable);

    void setMinWidthHeightInternal(int i, int i2);

    void setShadowPadding(int i, int i2, int i3, int i4);
}
