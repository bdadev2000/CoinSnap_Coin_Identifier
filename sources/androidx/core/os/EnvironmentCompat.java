package androidx.core.os;

import android.os.Environment;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.File;

/* loaded from: classes2.dex */
public final class EnvironmentCompat {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {
        @DoNotInline
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }
}
