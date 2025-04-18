package com.mbridge.msdk.e;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes4.dex */
public final class d {
    public static boolean a(SQLiteDatabase sQLiteDatabase) {
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
}
