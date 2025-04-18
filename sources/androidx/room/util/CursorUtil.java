package androidx.room.util;

import android.database.Cursor;
import android.util.Log;
import androidx.annotation.RestrictTo;
import e0.q;
import p0.a;

@RestrictTo
/* loaded from: classes.dex */
public final class CursorUtil {
    public static final int a(Cursor cursor, String str) {
        a.s(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int b(Cursor cursor, String str) {
        String str2;
        a.s(cursor, "c");
        int a2 = a(cursor, str);
        if (a2 >= 0) {
            return a2;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            a.r(columnNames, "c.columnNames");
            str2 = q.e0(columnNames, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException(androidx.compose.foundation.text.input.a.l("column '", str, "' does not exist. Available columns: ", str2));
    }
}
