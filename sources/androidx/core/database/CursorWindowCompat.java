package androidx.core.database;

import android.database.CursorWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class CursorWindowCompat {

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        @DoNotInline
        public static CursorWindow a(String str, long j2) {
            return new CursorWindow(str, j2);
        }
    }
}
