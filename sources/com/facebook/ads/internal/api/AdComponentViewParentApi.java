package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface AdComponentViewParentApi extends AdComponentView {
    void bringChildToFront(View view);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int i9, int i10);

    void onVisibilityChanged(View view, int i9);

    void setMeasuredDimension(int i9, int i10);
}
