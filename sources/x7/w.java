package x7;

import android.media.MediaDrm;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class w {
    public static boolean a(@Nullable Throwable th2) {
        return th2 instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th2) {
        return n9.h0.o(n9.h0.p(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
    }
}
