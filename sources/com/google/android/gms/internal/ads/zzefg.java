package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes2.dex */
public final class zzefg {
    public static int zza(SQLiteDatabase sQLiteDatabase, int i9) {
        int i10 = 0;
        if (i9 == 2) {
            return 0;
        }
        Cursor zzg = zzg(sQLiteDatabase, i9);
        if (zzg.getCount() > 0) {
            zzg.moveToNext();
            i10 = zzg.getInt(zzg.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        }
        zzg.close();
        return i10;
    }

    public static long zzb(SQLiteDatabase sQLiteDatabase, int i9) {
        long j7;
        Cursor zzg = zzg(sQLiteDatabase, 2);
        if (zzg.getCount() > 0) {
            zzg.moveToNext();
            j7 = zzg.getLong(zzg.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        } else {
            j7 = 0;
        }
        zzg.close();
        return j7;
    }

    public static void zzc(SQLiteDatabase sQLiteDatabase, long j7, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(j7));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j7)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void zzd(SQLiteDatabase sQLiteDatabase) {
        zzh(sQLiteDatabase, "failed_requests", 0);
        zzh(sQLiteDatabase, "total_requests", 0);
        zzh(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void zze(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzi(sQLiteDatabase, "failed_requests", 0);
        zzi(sQLiteDatabase, "total_requests", 0);
        zzi(sQLiteDatabase, "completed_requests", 0);
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase, boolean z8, boolean z9) {
        if (!z9) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
            return;
        }
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z8) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
    }

    private static Cursor zzg(SQLiteDatabase sQLiteDatabase, int i9) {
        String[] strArr = {AppMeasurementSdk.ConditionalUserProperty.VALUE};
        String[] strArr2 = new String[1];
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    strArr2[0] = "completed_requests";
                } else {
                    strArr2[0] = "last_successful_request_time";
                }
            } else {
                strArr2[0] = "total_requests";
            }
        } else {
            strArr2[0] = "failed_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void zzh(SQLiteDatabase sQLiteDatabase, String str, int i9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    private static void zzi(SQLiteDatabase sQLiteDatabase, String str, int i9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
