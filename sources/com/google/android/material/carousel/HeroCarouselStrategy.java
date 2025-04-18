package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private int keylineCount = 0;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    @NonNull
    public KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view) {
        int i2;
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (carousel.isHorizontal()) {
            f2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float smallItemSizeMin = getSmallItemSizeMin() + f2;
        float max = Math.max(getSmallItemSizeMax() + f2, smallItemSizeMin);
        float f3 = containerHeight;
        float min = Math.min(measuredWidth + f2, f3);
        float a2 = MathUtils.a((measuredWidth / 3.0f) + f2, smallItemSizeMin + f2, max + f2);
        float f4 = (min + a2) / 2.0f;
        int[] iArr = f3 < 2.0f * smallItemSizeMin ? new int[]{0} : SMALL_COUNTS;
        int max2 = (int) Math.max(1.0d, Math.floor((f3 - (CarouselStrategyHelper.maxValue(r4) * max)) / min));
        int ceil = (((int) Math.ceil(f3 / min)) - max2) + 1;
        int[] iArr2 = new int[ceil];
        for (int i3 = 0; i3 < ceil; i3++) {
            iArr2[i3] = max2 + i3;
        }
        int i4 = carousel.getCarouselAlignment() == 1 ? 1 : 0;
        Arrangement findLowestCostArrangement = Arrangement.findLowestCostArrangement(f3, a2, smallItemSizeMin, max, i4 != 0 ? CarouselStrategy.doubleCounts(iArr) : iArr, f4, i4 != 0 ? CarouselStrategy.doubleCounts(MEDIUM_COUNTS) : MEDIUM_COUNTS, min, iArr2);
        this.keylineCount = findLowestCostArrangement.getItemCount();
        if (findLowestCostArrangement.getItemCount() > carousel.getItemCount()) {
            findLowestCostArrangement = Arrangement.findLowestCostArrangement(f3, a2, smallItemSizeMin, max, iArr, f4, MEDIUM_COUNTS, min, iArr2);
            i2 = 0;
        } else {
            i2 = i4;
        }
        return CarouselStrategyHelper.createKeylineState(view.getContext(), f2, f3, findLowestCostArrangement, i2);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    public boolean shouldRefreshKeylineState(@NonNull Carousel carousel, int i2) {
        if (carousel.getCarouselAlignment() == 1) {
            if (i2 < this.keylineCount && carousel.getItemCount() >= this.keylineCount) {
                return true;
            }
            if (i2 >= this.keylineCount && carousel.getItemCount() < this.keylineCount) {
                return true;
            }
        }
        return false;
    }
}
