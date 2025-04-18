package x7;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class v {
    public static boolean a(@Nullable Throwable th2) {
        return th2 instanceof DeniedByServerException;
    }

    public static boolean b(@Nullable Throwable th2) {
        return th2 instanceof NotProvisionedException;
    }
}
