package androidx.core.app;

import android.app.Dialog;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public class DialogCompat {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        @DoNotInline
        public static <T> T a(Dialog dialog, int i2) {
            return (T) dialog.requireViewById(i2);
        }
    }
}
