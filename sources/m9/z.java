package m9;

import android.system.ErrnoException;
import android.system.OsConstants;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class z {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(@Nullable Throwable th2) {
        return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
    }
}
