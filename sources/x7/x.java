package x7;

import android.media.MediaDrmResetException;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class x {
    public static boolean a(@Nullable Throwable th2) {
        return th2 instanceof MediaDrmResetException;
    }
}
