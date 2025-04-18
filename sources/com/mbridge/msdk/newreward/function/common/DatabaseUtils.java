package com.mbridge.msdk.newreward.function.common;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public final class DatabaseUtils {
    private DatabaseUtils() {
    }

    public static void beginTransaction(SQLiteDatabase sQLiteDatabase) {
        if (!isDatabaseAvailable(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("DatabaseUtils", "beginTransaction", e2);
            }
        }
    }

    public static void closeCursor(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("DatabaseUtils", "closeCursor", e2);
            }
        }
    }

    public static void endTransaction(SQLiteDatabase sQLiteDatabase) {
        if (isDatabaseAvailable(sQLiteDatabase) && sQLiteDatabase.inTransaction()) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("DatabaseUtils", "endTransaction", e2);
                }
            }
        }
    }

    public static boolean isDatabaseAvailable(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            if (sQLiteDatabase.isOpen()) {
                return !sQLiteDatabase.isReadOnly();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setTransactionSuccessful(SQLiteDatabase sQLiteDatabase) {
        if (!isDatabaseAvailable(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("DatabaseUtils", "setTransactionSuccessful", e2);
            }
        }
    }
}
