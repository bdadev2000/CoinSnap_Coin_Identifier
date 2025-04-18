package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzedp extends zzfsf {
    private final Context zza;
    private final zzges zzb;

    public zzedp(Context context, zzges zzgesVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhZ)).intValue(), zzfsh.zza);
        this.zza = context;
        this.zzb = zzgesVar;
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
        String uri;
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{CampaignEx.JSON_KEY_TIMESTAMP, "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(CampaignEx.JSON_KEY_TIMESTAMP);
                int columnIndex2 = query.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j3 = query.getLong(columnIndex);
                    String string = query.getString(columnIndex2);
                    if (string == null) {
                        uri = "";
                    } else {
                        uri = Uri.parse(string).buildUpon().appendQueryParameter("bd", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j3)).build().toString();
                    }
                    strArr[i10] = uri;
                }
                i10++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                zzrVar.zza(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final /* synthetic */ Void zza(zzedr zzedrVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(zzedrVar.zza));
        contentValues.put("gws_query_id", zzedrVar.zzb);
        contentValues.put("url", zzedrVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzedrVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzbq zzz = com.google.android.gms.ads.internal.util.zzs.zzz(this.zza);
        if (zzz != null) {
            try {
                zzz.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfiv(this) { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                zzedp.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzedr zzedrVar) {
        zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzedj
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                zzedp.this.zza(zzedrVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzfiv zzfivVar) {
        zzgei.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedp.this.getWritableDatabase();
            }
        }), new zzedo(this, zzfivVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzr zzrVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // java.lang.Runnable
            public final void run() {
                zzedp.zzf(sQLiteDatabase, str, zzrVar);
            }
        });
    }

    public final void zzh(final com.google.android.gms.ads.internal.util.client.zzr zzrVar, final String str) {
        zze(new zzfiv() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzfiv
            public final Object zza(Object obj) {
                zzedp.this.zzg((SQLiteDatabase) obj, zzrVar, str);
                return null;
            }
        });
    }
}
