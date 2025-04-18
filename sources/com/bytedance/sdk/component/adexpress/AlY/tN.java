package com.bytedance.sdk.component.adexpress.AlY;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class tN {
    public static Drawable YFl(Context context, com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw) {
        if (context == null || dsw == null) {
            return null;
        }
        return YFl(context, (int) qsH.YFl(context, dsw.lG()), dsw.rkt(), dsw.dXO());
    }

    public static Drawable YFl(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}
