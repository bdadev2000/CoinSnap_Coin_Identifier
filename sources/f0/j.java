package f0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class j {
    public static int a(Resources resources, int i10, Resources.Theme theme) {
        return resources.getColor(i10, theme);
    }

    @NonNull
    public static ColorStateList b(@NonNull Resources resources, int i10, @Nullable Resources.Theme theme) {
        return resources.getColorStateList(i10, theme);
    }
}
