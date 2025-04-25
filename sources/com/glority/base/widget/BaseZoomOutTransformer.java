package com.glority.base.widget;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes6.dex */
public class BaseZoomOutTransformer implements ViewPager.PageTransformer {
    private static final float DEFAULT_SCALE = 0.85f;
    private static final float MIN_SCALE = 0.85f;

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < -1.0f) {
            view.setScaleX(0.85f);
            view.setScaleY(0.85f);
            return;
        }
        if (f <= 1.0f) {
            float max = Math.max(0.85f, 1.0f - Math.abs(f));
            float f2 = 1.0f - max;
            float f3 = (height * f2) / 2.0f;
            float f4 = (width * f2) / 2.0f;
            if (f < 0.0f) {
                view.setTranslationX(f4 - (f3 / 2.0f));
            } else {
                view.setTranslationX((-f4) + (f3 / 2.0f));
            }
            view.setScaleX(max);
            view.setScaleY(max);
            return;
        }
        view.setScaleX(0.85f);
        view.setScaleY(0.85f);
    }
}
