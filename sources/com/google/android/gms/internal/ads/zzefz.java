package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzefz extends SQLiteOpenHelper {
    private final Context zza;
    private final zzgge zzb;

    public zzefz(Context context, zzgge zzggeVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziv)).intValue());
        this.zza = context;
        this.zzb = zzggeVar;
    }

    public static /* synthetic */ Void zzb(com.google.android.gms.ads.internal.util.client.zzr zzrVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzrVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzr zzrVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzrVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzr zzrVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i9 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i9] = query.getString(columnIndex);
                }
                i9++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i10 = 0; i10 < count; i10++) {
                zzrVar.zza(strArr[i10]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final /* synthetic */ Void zza(zzegb zzegbVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(zzegbVar.zza));
        contentValues.put("gws_query_id", zzegbVar.zzb);
        contentValues.put("url", zzegbVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzegbVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.util.zzbt zzz = com.google.android.gms.ads.internal.util.zzt.zzz(this.zza);
        if (zzz != null) {
            try {
                zzz.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e4);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                zzefz.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzegb zzegbVar) {
        zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                zzefz.this.zza(zzegbVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzfkw zzfkwVar) {
        zzgft.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzefv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzefz.this.getWritableDatabase();
            }
        }), new zzefy(this, zzfkwVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzr zzrVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefw
            @Override // java.lang.Runnable
            public final void run() {
                zzefz.zzf(sQLiteDatabase, str, zzrVar);
            }
        });
    }

    public final void zzh(final com.google.android.gms.ads.internal.util.client.zzr zzrVar, final String str) {
        zze(new zzfkw() { // from class: com.google.android.gms.internal.ads.zzefu
            @Override // com.google.android.gms.internal.ads.zzfkw
            public final Object zza(Object obj) {
                zzefz.this.zzg((SQLiteDatabase) obj, zzrVar, str);
                return null;
            }
        });
    }
}
