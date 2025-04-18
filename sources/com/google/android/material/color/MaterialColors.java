package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;

/* loaded from: classes.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    private static final int CHROMA_NEUTRAL = 6;
    private static final int TONE_ACCENT_CONTAINER_DARK = 30;
    private static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    private static final int TONE_ACCENT_DARK = 80;
    private static final int TONE_ACCENT_LIGHT = 40;
    private static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    private static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    private static final int TONE_ON_ACCENT_DARK = 20;
    private static final int TONE_ON_ACCENT_LIGHT = 100;
    private static final int TONE_SURFACE_CONTAINER_DARK = 12;
    private static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    private static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    private static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    private MaterialColors() {
    }

    @ColorInt
    public static int compositeARGBWithAlpha(@ColorInt int i2, @IntRange int i3) {
        return ColorUtils.g(i2, (Color.alpha(i2) * i3) / 255);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i2) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i2));
    }

    @Nullable
    @ColorInt
    public static Integer getColorOrNull(@NonNull Context context, @AttrRes int i2) {
        TypedValue resolve = MaterialAttributes.resolve(context, i2);
        if (resolve != null) {
            return Integer.valueOf(resolveColor(context, resolve));
        }
        return null;
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i2, @IntRange int i3) {
        Hct fromInt = Hct.fromInt(i2);
        fromInt.setTone(i3);
        return fromInt.toInt();
    }

    @NonNull
    public static ColorRoles getColorRoles(@NonNull Context context, @ColorInt int i2) {
        return getColorRoles(i2, isLightTheme(context));
    }

    @NonNull
    public static ColorStateList getColorStateList(@NonNull Context context, @AttrRes int i2, @NonNull ColorStateList colorStateList) {
        TypedValue resolve = MaterialAttributes.resolve(context, i2);
        ColorStateList resolveColorStateList = resolve != null ? resolveColorStateList(context, resolve) : null;
        return resolveColorStateList == null ? colorStateList : resolveColorStateList;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@NonNull Context context, @AttrRes int i2) {
        TypedValue resolve = MaterialAttributes.resolve(context, i2);
        if (resolve == null) {
            return null;
        }
        int i3 = resolve.resourceId;
        if (i3 != 0) {
            return ContextCompat.getColorStateList(context, i3);
        }
        int i4 = resolve.data;
        if (i4 != 0) {
            return ColorStateList.valueOf(i4);
        }
        return null;
    }

    @ColorInt
    @RestrictTo
    public static int getSurfaceContainerFromSeed(@NonNull Context context, @ColorInt int i2) {
        return getColorRole(i2, isLightTheme(context) ? 94 : 12, 6);
    }

    @ColorInt
    @RestrictTo
    public static int getSurfaceContainerHighFromSeed(@NonNull Context context, @ColorInt int i2) {
        return getColorRole(i2, isLightTheme(context) ? 92 : 17, 6);
    }

    @ColorInt
    public static int harmonize(@ColorInt int i2, @ColorInt int i3) {
        return Blend.harmonize(i2, i3);
    }

    @ColorInt
    public static int harmonizeWithPrimary(@NonNull Context context, @ColorInt int i2) {
        return harmonize(i2, getColor(context, R.attr.colorPrimary, MaterialColors.class.getCanonicalName()));
    }

    public static boolean isColorLight(@ColorInt int i2) {
        boolean z2;
        if (i2 != 0) {
            ThreadLocal threadLocal = ColorUtils.f18532a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d = red / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = green / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = blue / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d4 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static boolean isLightTheme(@NonNull Context context) {
        return MaterialAttributes.resolveBoolean(context, R.attr.isLightTheme, true);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i2, @AttrRes int i3) {
        return layer(view, i2, i3, 1.0f);
    }

    private static int resolveColor(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? ContextCompat.getColor(context, i2) : typedValue.data;
    }

    private static ColorStateList resolveColorStateList(@NonNull Context context, @NonNull TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? ContextCompat.getColorStateList(context, i2) : ColorStateList.valueOf(typedValue.data);
    }

    @NonNull
    public static ColorRoles getColorRoles(@ColorInt int i2, boolean z2) {
        if (z2) {
            return new ColorRoles(getColorRole(i2, TONE_ACCENT_LIGHT), getColorRole(i2, 100), getColorRole(i2, 90), getColorRole(i2, 10));
        }
        return new ColorRoles(getColorRole(i2, 80), getColorRole(i2, 20), getColorRole(i2, TONE_ACCENT_CONTAINER_DARK), getColorRole(i2, 90));
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i2, @AttrRes int i3, @FloatRange float f2) {
        return layer(getColor(view, i2), getColor(view, i3), f2);
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i2, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i2, str));
    }

    @ColorInt
    private static int getColorRole(@ColorInt int i2, @IntRange int i3, int i4) {
        Hct fromInt = Hct.fromInt(getColorRole(i2, i3));
        fromInt.setChroma(i4);
        return fromInt.toInt();
    }

    @ColorInt
    public static int layer(@ColorInt int i2, @ColorInt int i3, @FloatRange float f2) {
        return layer(i2, ColorUtils.g(i3, Math.round(Color.alpha(i3) * f2)));
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i2, @ColorInt int i3) {
        return getColor(view.getContext(), i2, i3);
    }

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i2, @ColorInt int i3) {
        Integer colorOrNull = getColorOrNull(context, i2);
        return colorOrNull != null ? colorOrNull.intValue() : i3;
    }

    @ColorInt
    public static int layer(@ColorInt int i2, @ColorInt int i3) {
        return ColorUtils.d(i3, i2);
    }
}
