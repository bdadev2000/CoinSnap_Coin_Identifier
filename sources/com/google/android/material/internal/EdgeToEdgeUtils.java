package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.google.android.material.color.MaterialColors;

@RestrictTo
/* loaded from: classes2.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z2) {
        applyEdgeToEdge(window, z2, null, null);
    }

    @TargetApi(21)
    private static int getNavigationBarColor(Context context, boolean z2) {
        if (z2 && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.g(MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z2) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    private static int getStatusBarColor(Context context, boolean z2) {
        if (z2) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i2, boolean z2) {
        return MaterialColors.isColorLight(i2) || (i2 == 0 && z2);
    }

    public static void setLightNavigationBar(@NonNull Window window, boolean z2) {
        new WindowInsetsControllerCompat(window.getDecorView(), window).e(z2);
    }

    public static void setLightStatusBar(@NonNull Window window, boolean z2) {
        new WindowInsetsControllerCompat(window.getDecorView(), window).f(z2);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z2, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        boolean z3 = num == null || num.intValue() == 0;
        boolean z4 = num2 == null || num2.intValue() == 0;
        if (z3 || z4) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, -16777216);
            if (z3) {
                num = Integer.valueOf(color);
            }
            if (z4) {
                num2 = Integer.valueOf(color);
            }
        }
        WindowCompat.a(window, !z2);
        int statusBarColor = getStatusBarColor(window.getContext(), z2);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z2);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, MaterialColors.isColorLight(num2.intValue())));
    }
}
