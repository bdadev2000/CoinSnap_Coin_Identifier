package com.mbridge.msdk.video.dynview.i.b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes3.dex */
public final class a {
    public static void a(View view, float f9, float f10, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null && strArr != null) {
            int[] iArr = new int[strArr.length];
            for (int i9 = 0; i9 < strArr.length; i9++) {
                iArr[i9] = Color.parseColor(strArr[i9]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius(ai.a(view.getContext(), f10));
            gradientDrawable.setStroke(ai.a(view.getContext(), f9), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }
}
