package T;

import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* renamed from: T.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0265d0 {
    public static int a(@NonNull ViewConfiguration viewConfiguration, int i9, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i9, i10, i11);
    }

    public static int b(@NonNull ViewConfiguration viewConfiguration, int i9, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i9, i10, i11);
    }
}
