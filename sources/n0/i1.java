package n0;

import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class i1 {
    public static int a(@NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i10, i11, i12);
    }

    public static int b(@NonNull ViewConfiguration viewConfiguration, int i10, int i11, int i12) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i10, i11, i12);
    }
}
