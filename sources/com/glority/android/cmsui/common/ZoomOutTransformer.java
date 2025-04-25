package com.glority.android.cmsui.common;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ZoomOutTransformer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/glority/android/cmsui/common/ZoomOutTransformer;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "()V", "MIN_SCALE", "", "defaultScale", "transformPage", "", "view", "Landroid/view/View;", "position", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ZoomOutTransformer implements ViewPager2.PageTransformer {
    private final float MIN_SCALE = 0.65f;
    private final float defaultScale = 0.65f;

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float position) {
        Intrinsics.checkNotNullParameter(view, "view");
        int width = view.getWidth();
        int height = view.getHeight();
        if (position < -1) {
            view.setScaleX(this.defaultScale);
            view.setScaleY(this.defaultScale);
            return;
        }
        float f = 1;
        if (position <= f) {
            float max = Math.max(this.MIN_SCALE, f - Math.abs(position));
            float f2 = f - max;
            float f3 = 2;
            float f4 = (height * f2) / f3;
            float f5 = (width * f2) / f3;
            if (position < 0) {
                view.setTranslationX(f5 - (f4 / f3));
            } else {
                view.setTranslationX((-f5) + (f4 / f3));
            }
            view.setScaleX(max);
            view.setScaleY(max);
            return;
        }
        view.setScaleX(this.defaultScale);
        view.setScaleY(this.defaultScale);
    }
}
