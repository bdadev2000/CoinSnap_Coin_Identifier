package P3;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2414a = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String b = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f2414a, 0)) != 0) {
                Log.w(b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z8 = false;
        boolean z9 = false;
        for (int i9 : iArr) {
            if (i9 == 16842910) {
                z8 = true;
            } else if (i9 == 16842908 || i9 == 16842919 || i9 == 16843623) {
                z9 = true;
            }
        }
        if (!z8 || !z9) {
            return false;
        }
        return true;
    }
}
