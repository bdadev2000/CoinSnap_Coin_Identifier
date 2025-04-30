package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzau {
    private static Set<String> zza(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static void zza(zzfw zzfwVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        if (zzfwVar != null) {
            if (!zza(zzfwVar, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> zza = zza(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!zza.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i9 = 0; i9 < strArr.length; i9 += 2) {
                        if (!zza.remove(strArr[i9])) {
                            sQLiteDatabase.execSQL(strArr[i9 + 1]);
                        }
                    }
                }
                if (zza.isEmpty()) {
                    return;
                }
                zzfwVar.zzu().zza("Table has extra columns. table, columns", str, TextUtils.join(", ", zza));
                return;
            } catch (SQLiteException e4) {
                zzfwVar.zzg().zza("Failed to verify columns on table that was just created", str);
                throw e4;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static void zza(zzfw zzfwVar, SQLiteDatabase sQLiteDatabase) {
        if (zzfwVar != null) {
            File file = new File(com.google.android.gms.internal.measurement.zzcf.zza().zza(sQLiteDatabase.getPath()));
            if (!file.setReadable(false, false)) {
                zzfwVar.zzu().zza("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzfwVar.zzu().zza("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzfwVar.zzu().zza("Failed to turn on database read permission for owner");
            }
            if (file.setWritable(true, true)) {
                return;
            }
            zzfwVar.zzu().zza("Failed to turn on database write permission for owner");
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    private static boolean zza(zzfw zzfwVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzfwVar != null) {
            Cursor cursor = null;
            try {
                try {
                    cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                    return moveToFirst;
                } catch (SQLiteException e4) {
                    zzfwVar.zzu().zza("Error querying for table", str, e4);
                    if (cursor == null) {
                        return false;
                    }
                    cursor.close();
                    return false;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
