package com.google.android.material.carousel;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
interface Maskable {
    @NonNull
    RectF getMaskRectF();

    @FloatRange
    @Deprecated
    float getMaskXPercentage();

    void setMaskRectF(@NonNull RectF rectF);

    @Deprecated
    void setMaskXPercentage(@FloatRange float f2);

    void setOnMaskChangedListener(@Nullable OnMaskChangedListener onMaskChangedListener);
}
