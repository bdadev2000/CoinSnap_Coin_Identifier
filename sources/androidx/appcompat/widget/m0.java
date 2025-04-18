package androidx.appcompat.widget;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class m0 {
    public static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
        if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
