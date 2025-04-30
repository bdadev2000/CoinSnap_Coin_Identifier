package G;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorStateListDrawable;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ ColorStateList b(ColorStateListDrawable colorStateListDrawable) {
        return colorStateListDrawable.getColorStateList();
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable d(Object obj) {
        return (ColorStateListDrawable) obj;
    }

    public static /* synthetic */ WindowInsets.Builder g() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof ColorStateListDrawable;
    }
}
