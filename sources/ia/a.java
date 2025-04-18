package ia;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class a {
    public static final int[] a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final String f19507b = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(a, 0)) != 0) {
                Log.w(f19507b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
