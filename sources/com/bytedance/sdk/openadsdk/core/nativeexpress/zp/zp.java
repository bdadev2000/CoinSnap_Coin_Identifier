package com.bytedance.sdk.openadsdk.core.nativeexpress.zp;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class zp {
    public static float lMd(Context context) {
        return WNy.KS(context, WNy.dT(context));
    }

    @NonNull
    public static Pair<Float, Float> zp(Window window, int i9) {
        View decorView = window.getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = WNy.KS(window.getContext(), fArr[0]);
        float KS = WNy.KS(window.getContext(), fArr[1]);
        fArr[1] = KS;
        if (fArr[0] < 10.0f || KS < 10.0f) {
            fArr = zp(window.getContext(), WNy.KS(window.getContext(), WNy.zp()), i9);
        }
        float max = Math.max(fArr[0], fArr[1]);
        float min = Math.min(fArr[0], fArr[1]);
        if (i9 == 1) {
            fArr[0] = min;
            fArr[1] = max;
        } else {
            fArr[0] = max;
            fArr[1] = min;
        }
        return new Pair<>(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
    }

    private static float[] zp(Context context, int i9, int i10) {
        float zp = zp(context);
        float lMd = lMd(context);
        if ((i10 == 1) != (zp > lMd)) {
            float f9 = zp + lMd;
            lMd = f9 - lMd;
            zp = f9 - lMd;
        }
        if (i10 == 1) {
            zp -= i9;
        } else {
            lMd -= i9;
        }
        return new float[]{lMd, zp};
    }

    public static float zp(Context context) {
        return WNy.KS(context, WNy.YW(context));
    }
}
