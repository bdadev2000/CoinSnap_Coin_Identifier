package com.glority.base.utils;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lcom/glority/base/utils/ColorUtils;", "", "<init>", "()V", "fadeColor", "", "color", "rate", "", "tintDrawable", "Landroid/graphics/drawable/Drawable;", "drawable", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ColorUtils {
    public static final int $stable = 0;
    public static final ColorUtils INSTANCE = new ColorUtils();

    public final int fadeColor(int color, float rate) {
        return (color & 16777215) | ((255 - ((int) (255 * rate))) << 24);
    }

    private ColorUtils() {
    }

    public final Drawable tintDrawable(Drawable drawable, int color) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(...)");
        DrawableCompat.setTintList(wrap, ColorStateList.valueOf(color));
        return wrap;
    }
}
