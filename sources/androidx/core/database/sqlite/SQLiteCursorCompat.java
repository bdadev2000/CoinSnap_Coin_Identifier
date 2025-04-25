package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;

/* loaded from: classes8.dex */
public final class SQLiteCursorCompat {
    private SQLiteCursorCompat() {
    }

    public static void setFillWindowForwardOnly(SQLiteCursor sQLiteCursor, boolean z) {
        Api28Impl.setFillWindowForwardOnly(sQLiteCursor, z);
    }

    /* loaded from: classes8.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static void setFillWindowForwardOnly(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }
}
