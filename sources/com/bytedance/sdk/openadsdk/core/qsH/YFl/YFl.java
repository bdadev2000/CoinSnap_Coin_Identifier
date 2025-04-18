package com.bytedance.sdk.openadsdk.core.qsH.YFl;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class YFl {
    public static float Sg(Context context) {
        return GS.AlY(context, GS.nc(context));
    }

    @NonNull
    public static Pair<Float, Float> YFl(Window window, int i10) {
        View decorView = window.getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = GS.AlY(window.getContext(), fArr[0]);
        float AlY = GS.AlY(window.getContext(), fArr[1]);
        fArr[1] = AlY;
        if (fArr[0] < 10.0f || AlY < 10.0f) {
            fArr = YFl(window.getContext(), GS.AlY(window.getContext(), GS.YFl()), i10);
        }
        float max = Math.max(fArr[0], fArr[1]);
        float min = Math.min(fArr[0], fArr[1]);
        if (i10 == 1) {
            fArr[0] = min;
            fArr[1] = max;
        } else {
            fArr[0] = max;
            fArr[1] = min;
        }
        return new Pair<>(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
    }

    private static float[] YFl(Context context, int i10, int i11) {
        float YFl = YFl(context);
        float Sg = Sg(context);
        if ((i11 == 1) != (YFl > Sg)) {
            float f10 = YFl + Sg;
            Sg = f10 - Sg;
            YFl = f10 - Sg;
        }
        if (i11 == 1) {
            YFl -= i10;
        } else {
            Sg -= i10;
        }
        return new float[]{Sg, YFl};
    }

    public static float YFl(Context context) {
        return GS.AlY(context, GS.NjR(context));
    }
}
