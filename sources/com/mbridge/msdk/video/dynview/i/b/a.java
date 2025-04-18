package com.mbridge.msdk.video.dynview.i.b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public final class a {
    public static void a(View view, float f10, float f11, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null && strArr != null) {
            int[] iArr = new int[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                iArr[i10] = Color.parseColor(strArr[i10]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius(ai.a(view.getContext(), f11));
            gradientDrawable.setStroke(ai.a(view.getContext(), f10), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }
}
