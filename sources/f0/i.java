package f0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class i {
    public static Drawable a(Resources resources, int i10, Resources.Theme theme) {
        return resources.getDrawable(i10, theme);
    }

    public static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
        return resources.getDrawableForDensity(i10, i11, theme);
    }
}
