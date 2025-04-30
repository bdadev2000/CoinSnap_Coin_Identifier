package q;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* renamed from: q.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2585H {
    public static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, @Nullable Resources.Theme theme) {
        if (!Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }
}
