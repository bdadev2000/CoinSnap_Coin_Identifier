package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class AlY {
    public static Drawable Sg() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl(), 44.0f));
        gradientDrawable.setStroke(GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }

    public static Drawable YFl() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(GS.tN(com.bytedance.sdk.openadsdk.core.lG.YFl(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }
}
