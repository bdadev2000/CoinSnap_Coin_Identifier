package K;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class i {
    public static Drawable a(Resources resources, int i9, Resources.Theme theme) {
        return resources.getDrawable(i9, theme);
    }

    public static Drawable b(Resources resources, int i9, int i10, Resources.Theme theme) {
        return resources.getDrawableForDensity(i9, i10, theme);
    }
}
