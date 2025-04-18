package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.KeylineState;

/* loaded from: classes4.dex */
public final class UncontainedCarouselStrategy extends CarouselStrategy {
    private static final float MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD = 0.85f;

    @RestrictTo
    public UncontainedCarouselStrategy() {
    }

    private float calculateMediumChildSize(float f2, float f3, float f4) {
        float max = Math.max(1.5f * f4, f2);
        float f5 = MEDIUM_LARGE_ITEM_PERCENTAGE_THRESHOLD * f3;
        if (max > f5) {
            max = Math.max(f5, f4 * 1.2f);
        }
        return Math.min(f3, max);
    }

    private KeylineState createCenterAlignedKeylineState(float f2, float f3, float f4, int i2, float f5, float f6, float f7) {
        float min = Math.min(f6, f4);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(min, f4, f3);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(f5, f4, f3);
        float f8 = f5 / 2.0f;
        float f9 = (f7 + 0.0f) - f8;
        float f10 = f9 + f8;
        float f11 = min / 2.0f;
        float f12 = (i2 * f4) + f10;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f4, f2).addAnchorKeyline((f9 - f8) - f11, childMaskPercentage, min).addKeyline(f9, childMaskPercentage2, f5, false).addKeylineRange((f4 / 2.0f) + f10, 0.0f, f4, i2, true);
        addKeylineRange.addKeyline(f8 + f12, childMaskPercentage2, f5, false);
        addKeylineRange.addAnchorKeyline(f12 + f5 + f11, childMaskPercentage, min);
        return addKeylineRange.build();
    }

    private KeylineState createLeftAlignedKeylineState(Context context, float f2, float f3, float f4, int i2, float f5, int i3, float f6) {
        float min = Math.min(f6, f4);
        float max = Math.max(min, 0.5f * f5);
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(max, f4, f2);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(min, f4, f2);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(f5, f4, f2);
        float f7 = (i2 * f4) + 0.0f;
        KeylineState.Builder addKeylineRange = new KeylineState.Builder(f4, f3).addAnchorKeyline(0.0f - (max / 2.0f), childMaskPercentage, max).addKeylineRange(f4 / 2.0f, 0.0f, f4, i2, true);
        if (i3 > 0) {
            float f8 = (f5 / 2.0f) + f7;
            f7 += f5;
            addKeylineRange.addKeyline(f8, childMaskPercentage3, f5, false);
        }
        addKeylineRange.addAnchorKeyline((CarouselStrategyHelper.getExtraSmallSize(context) / 2.0f) + f7, childMaskPercentage2, min);
        return addKeylineRange.build();
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean isContained() {
        return false;
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        float f2;
        float containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (carousel.isHorizontal()) {
            float f4 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
            f2 = f4;
        } else {
            f2 = f3;
        }
        float f5 = measuredHeight + f2;
        float extraSmallSize = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f2;
        float extraSmallSize2 = CarouselStrategyHelper.getExtraSmallSize(view.getContext()) + f2;
        int max = Math.max(1, (int) Math.floor(containerWidth / f5));
        float f6 = containerWidth - (max * f5);
        if (carousel.getCarouselAlignment() == 1) {
            float f7 = f6 / 2.0f;
            return createCenterAlignedKeylineState(containerWidth, f2, f5, max, Math.max(Math.min(3.0f * f7, f5), getSmallItemSizeMin() + f2), extraSmallSize2, f7);
        }
        return createLeftAlignedKeylineState(view.getContext(), f2, containerWidth, f5, max, calculateMediumChildSize(extraSmallSize, f5, f6), f6 > 0.0f ? 1 : 0, extraSmallSize2);
    }
}
