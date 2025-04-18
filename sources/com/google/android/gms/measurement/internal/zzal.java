package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.SimpleArrayMap;
import androidx.compose.foundation.text.input.a;
import androidx.compose.ui.platform.j;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.events.CrashEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzal extends zznr {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzf = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzj = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzk = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    private final zzat zzl;
    private final zznl zzm;

    public zzal(zznv zznvVar) {
        super(zznvVar);
        this.zzm = new zznl(zzb());
        this.zzl = new zzat(this, zza(), "google_app_measurement.db");
    }

    private final String zzao() {
        long currentTimeMillis = zzb().currentTimeMillis();
        zznt zzntVar = zznt.GOOGLE_SIGNAL;
        return a.m("(", "(upload_type = " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + currentTimeMillis + ") > CAST(" + zzbh.zzaf.zza(null).longValue() + " AS INTEGER)))", " OR ", "(upload_type != " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + currentTimeMillis + ") > CAST(" + zzag.zzm() + " AS INTEGER)))", ")");
    }

    public final long b_() {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    @WorkerThread
    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().zzu().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f_() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.e_()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            com.google.android.gms.measurement.internal.zzgo r3 = r6.zzj()     // Catch: java.lang.Throwable -> L1a
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.f_():java.lang.String");
    }

    @VisibleForTesting
    public final boolean zzaa() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    @VisibleForTesting
    @WorkerThread
    public final long zzb(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j2 = 0;
        try {
            try {
                long zza2 = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (zza2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (e_.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().zzg().zza("Failed to insert column (got -1). appId", zzgo.zza(str), str2);
                        return -1L;
                    }
                    zza2 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + zza2));
                    if (e_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().zzg().zza("Failed to update column (got 0). appId", zzgo.zza(str), str2);
                        return -1L;
                    }
                    e_.setTransactionSuccessful();
                    return zza2;
                } catch (SQLiteException e) {
                    long j3 = zza2;
                    e = e;
                    j2 = j3;
                    zzj().zzg().zza("Error inserting column. appId", zzgo.zza(str), str2, e);
                    e_.endTransaction();
                    return j2;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            e_.endTransaction();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:30:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle zzd(java.lang.String r6) {
        /*
            r5 = this;
            r5.zzt()
            r5.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.e_()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            if (r2 != 0) goto L31
            com.google.android.gms.measurement.internal.zzgo r6 = r5.zzj()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r2 = "Default event parameters not found"
            r6.zza(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L2c:
            r6 = move-exception
            r0 = r1
            goto L84
        L2f:
            r6 = move-exception
            goto L71
        L31:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r3 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f java.io.IOException -> L57
            r5.g_()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.util.List r6 = r2.zzh()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zzoo.zza(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r6
        L57:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r5.zzj()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgo.zza(r6)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r3.zza(r4, r6, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L2f
            r1.close()
            return r0
        L6d:
            r6 = move-exception
            goto L84
        L6f:
            r6 = move-exception
            r1 = r0
        L71:
            com.google.android.gms.measurement.internal.zzgo r2 = r5.zzj()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.measurement.internal.zzgq r2 = r2.zzg()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zza(r3, r6)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L83
            r1.close()
        L83:
            return r0
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzd(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03a6 A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x037b A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0290 A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023b A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0187 A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ec A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026f A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029f A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b7 A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e0 A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f5 A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033f A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0365 A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03bf A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03eb A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0409 A[Catch: all -> 0x016a, SQLiteException -> 0x016f, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x016f, blocks: (B:5:0x0134, B:10:0x013e, B:12:0x014f, B:14:0x015b, B:17:0x017a, B:19:0x0187, B:21:0x0193, B:25:0x01ac, B:27:0x01ec, B:31:0x01f6, B:34:0x0240, B:36:0x026f, B:40:0x0279, B:43:0x0294, B:45:0x029f, B:46:0x02b1, B:48:0x02b7, B:50:0x02c3, B:52:0x02da, B:54:0x02e0, B:56:0x02ec, B:58:0x02f5, B:60:0x02fd, B:63:0x0306, B:65:0x031e, B:67:0x0327, B:69:0x033f, B:71:0x034b, B:72:0x035d, B:74:0x0365, B:77:0x036e, B:80:0x0386, B:83:0x03b0, B:85:0x03bf, B:87:0x03c7, B:88:0x03d2, B:90:0x03da, B:91:0x03e5, B:93:0x03eb, B:95:0x03f7, B:96:0x0400, B:98:0x0409, B:102:0x03a6, B:103:0x037b, B:106:0x0382, B:108:0x02d1, B:109:0x0290, B:111:0x023b, B:113:0x01a4, B:114:0x0173), top: B:4:0x0134 }] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zze(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzan zzf(java.lang.String r13) {
        /*
            r12 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r12.zzt()
            r12.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.e_()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r2 = "apps"
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "remote_config"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "config_last_modified_time"
            r10 = 1
            r3[r10] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "e_tag"
            r11 = 2
            r3[r11] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            if (r2 != 0) goto L39
            r1.close()
            return r0
        L39:
            byte[] r2 = r1.getBlob(r9)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r3 = r1.getString(r10)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r4 = r1.getString(r11)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            if (r5 == 0) goto L62
            com.google.android.gms.measurement.internal.zzgo r5 = r12.zzj()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgo.zza(r13)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r5.zza(r6, r7)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            goto L62
        L5d:
            r13 = move-exception
            r0 = r1
            goto L8c
        L60:
            r2 = move-exception
            goto L75
        L62:
            if (r2 != 0) goto L68
            r1.close()
            return r0
        L68:
            com.google.android.gms.measurement.internal.zzan r5 = new com.google.android.gms.measurement.internal.zzan     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r1.close()
            return r5
        L71:
            r13 = move-exception
            goto L8c
        L73:
            r2 = move-exception
            r1 = r0
        L75:
            com.google.android.gms.measurement.internal.zzgo r3 = r12.zzj()     // Catch: java.lang.Throwable -> L5d
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzgo.zza(r13)     // Catch: java.lang.Throwable -> L5d
            r3.zza(r4, r13, r2)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L8b
            r1.close()
        L8b:
            return r0
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzf(java.lang.String):com.google.android.gms.measurement.internal.zzan");
    }

    public final zzax zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzax.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzje zzh(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzje.zzb(zza("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzje zzi(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        zzje zzjeVar = (zzje) zza("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new zzau() { // from class: com.google.android.gms.measurement.internal.zzao
            @Override // com.google.android.gms.measurement.internal.zzau
            public final Object zza(Cursor cursor) {
                zzje zza2;
                zza2 = zzje.zza(cursor.getString(0), cursor.getInt(1));
                return zza2;
            }
        });
        return zzjeVar == null ? zzje.zza : zzjeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010c A[Catch: all -> 0x0098, SQLiteException -> 0x009c, IOException -> 0x00c0, TryCatch #1 {all -> 0x0098, blocks: (B:10:0x0073, B:14:0x007d, B:16:0x0087, B:20:0x009f, B:22:0x00bb, B:25:0x0101, B:27:0x010c, B:29:0x0116, B:31:0x011e, B:35:0x0127, B:33:0x0135, B:38:0x0141, B:42:0x00c3, B:44:0x00c9, B:45:0x00d6, B:47:0x00dc, B:49:0x00fb, B:52:0x016f, B:61:0x0184), top: B:9:0x0073 }] */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzoj zzj(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzoj");
    }

    public final List<zzno> zzk(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzno(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzgo.zza(str), e);
                List<zzno> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzop> zzl(java.lang.String r16) {
        /*
            r15 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r16)
            r15.zzt()
            r15.zzal()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r15.e_()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L46
            r1.close()
            return r0
        L46:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L52
            java.lang.String r2 = ""
        L52:
            r5 = r2
            goto L5a
        L54:
            r0 = move-exception
            r2 = r15
            goto Lab
        L57:
            r0 = move-exception
            r2 = r15
            goto L90
        L5a:
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r2 = r15
            java.lang.Object r9 = r15.zza(r1, r14)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            if (r9 != 0) goto L7b
            com.google.android.gms.measurement.internal.zzgo r3 = r15.zzj()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r16)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r3.zza(r4, r5)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            goto L86
        L77:
            r0 = move-exception
            goto Lab
        L79:
            r0 = move-exception
            goto L90
        L7b:
            com.google.android.gms.measurement.internal.zzop r10 = new com.google.android.gms.measurement.internal.zzop     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r0.add(r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
        L86:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            if (r3 != 0) goto L46
            r1.close()
            return r0
        L90:
            com.google.android.gms.measurement.internal.zzgo r3 = r15.zzj()     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r16)     // Catch: java.lang.Throwable -> L77
            r3.zza(r4, r5, r0)     // Catch: java.lang.Throwable -> L77
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto Laa
            r1.close()
        Laa:
            return r0
        Lab:
            if (r1 == 0) goto Lb0
            r1.close()
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzl(java.lang.String):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzfy$zzm>, androidx.collection.SimpleArrayMap] */
    public final Map<Integer, zzfy.zzm> zzm(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfy.zzm> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                ?? simpleArrayMap = new SimpleArrayMap(0);
                do {
                    int i2 = query.getInt(0);
                    try {
                        simpleArrayMap.put(Integer.valueOf(i2), (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzm.zza) zzoo.zza(zzfy.zzm.zze(), query.getBlob(1))).zzai()));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzgo.zza(str), Integer.valueOf(i2), e);
                    }
                } while (query.moveToNext());
                query.close();
                return simpleArrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filter results. appId", zzgo.zza(str), e2);
                Map<Integer, zzfy.zzm> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzfo$zzb>>, androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public final Map<Integer, List<zzfo.zzb>> zzn(String str) {
        Preconditions.checkNotEmpty(str);
        ?? simpleArrayMap = new SimpleArrayMap(0);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), query.getBlob(1))).zzai());
                        if (zzbVar.zzk()) {
                            int i2 = query.getInt(0);
                            List list = (List) simpleArrayMap.get(Integer.valueOf(i2));
                            if (list == null) {
                                list = new ArrayList();
                                simpleArrayMap.put(Integer.valueOf(i2), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return simpleArrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<zzfo.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>>, androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public final Map<Integer, List<Integer>> zzo(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        ?? simpleArrayMap = new SimpleArrayMap(0);
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i2 = rawQuery.getInt(0);
                    List list = (List) simpleArrayMap.get(Integer.valueOf(i2));
                    if (list == null) {
                        list = new ArrayList();
                        simpleArrayMap.put(Integer.valueOf(i2), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return simpleArrayMap;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error querying scoped filters. appId", zzgo.zza(str), e);
                Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zzp() {
        zzal();
        e_().beginTransaction();
    }

    public final void zzq(String str) {
        zzbb zzd2;
        zzi("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query(CrashEvent.f29806f, (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (zzd2 = zzd(str, string)) != null) {
                        zza("events_snapshot", zzd2);
                    }
                } while (cursor.moveToNext());
                cursor.close();
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error creating snapshot. appId", zzgo.zza(str), e);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        if ("_v".equals(r0) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzr(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzr(java.lang.String):void");
    }

    @WorkerThread
    public final boolean zzs(String str) {
        return (!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzb(j.b("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", zzao()), new String[]{str}) != 0;
    }

    public final boolean zzt(String str) {
        boolean z2;
        boolean z3;
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
            } catch (SQLiteException e) {
                e = e;
                z2 = false;
            }
            if (!cursor.moveToFirst()) {
                cursor.close();
                return false;
            }
            z2 = zzb().currentTimeMillis() < cursor.getLong(0) + 15000;
            try {
                z3 = zza("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0;
                cursor.close();
            } catch (SQLiteException e2) {
                e = e2;
                zzj().zzg().zza("Error checking backfill conditions", e);
                z3 = false;
                if (z2) {
                }
            }
            return (z2 || z3) ? false : true;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @WorkerThread
    public final void zzu() {
        zzal();
        e_().endTransaction();
    }

    @WorkerThread
    public final void zzv() {
        int delete;
        zzt();
        zzal();
        if (zzaa()) {
            long zza2 = zzn().zza.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzag.zzn()) {
                zzn().zza.zza(elapsedRealtime);
                zzt();
                zzal();
                if (!zzaa() || (delete = e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzag.zzm())})) <= 0) {
                    return;
                }
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    @WorkerThread
    public final void zzw() {
        zzal();
        e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        return zzb("select count(1) > 0 from raw_events", (String[]) null) != 0;
    }

    public final boolean zzy() {
        return zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0;
    }

    public final boolean zzz() {
        return zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0;
    }

    @WorkerThread
    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            return e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting conditional property", zzgo.zza(str), zzi().zzc(str2), e);
            return 0;
        }
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void zzp(String str) {
        zzt();
        zzal();
        try {
            e_().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error clearing default event params", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzfo$zze>>, androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public final Map<Integer, List<zzfo.zze>> zzg(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ?? simpleArrayMap = new SimpleArrayMap(0);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zze>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zze zzeVar = (zzfo.zze) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zze.zza) zzoo.zza(zzfo.zze.zzc(), query.getBlob(1))).zzai());
                        int i2 = query.getInt(0);
                        List list = (List) simpleArrayMap.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            simpleArrayMap.put(Integer.valueOf(i2), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return simpleArrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<zzfo.zze>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting user property. appId", zzgo.zza(str), zzi().zzc(str2), e);
        }
    }

    private final void zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzgo.zza(str2), e);
        }
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            return e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, zze().zzb(str, zzbh.zzp))))});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzgo.zza(str), e);
            return 0L;
        }
    }

    @WorkerThread
    public final zzbb zzd(String str, String str2) {
        return zzc(CrashEvent.f29806f, str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzfo$zzb>>, androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public final Map<Integer, List<zzfo.zzb>> zzf(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ?? simpleArrayMap = new SimpleArrayMap(0);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), query.getBlob(1))).zzai());
                        int i2 = query.getInt(0);
                        List list = (List) simpleArrayMap.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            simpleArrayMap.put(Integer.valueOf(i2), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return simpleArrayMap;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
                Map<Integer, List<zzfo.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long zza(zzfy.zzk zzkVar) throws IOException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        byte[] zzca = zzkVar.zzca();
        long zza2 = g_().zza(zzca);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkVar.zzz());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza2));
        contentValues.put("metadata", zzca);
        try {
            e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzgo.zza(zzkVar.zzz()), e);
            throw e;
        }
    }

    @WorkerThread
    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    @WorkerThread
    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j2 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j2;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.zzbb zzc(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbb");
    }

    @WorkerThread
    private final long zza(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j3 = cursor.getLong(0);
                    cursor.close();
                    return j3;
                }
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ab, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzop> zzb(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0036: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x0036 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfy.zzf, java.lang.Long> zza(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.zzt()
            r7.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.e_()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            if (r2 != 0) goto L3a
            com.google.android.gms.measurement.internal.zzgo r8 = r7.zzj()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            com.google.android.gms.measurement.internal.zzgq r8 = r8.zzp()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.String r9 = "Main event not found"
            r8.zza(r9)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r0
        L35:
            r8 = move-exception
            r0 = r1
            goto L8d
        L38:
            r8 = move-exception
            goto L7a
        L3a:
            byte[] r2 = r1.getBlob(r4)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            long r3 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r4 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r4, r2)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r8
        L60:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r7.zzj()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgo.zza(r8)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r3.zza(r4, r8, r9, r2)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r0
        L76:
            r8 = move-exception
            goto L8d
        L78:
            r8 = move-exception
            r1 = r0
        L7a:
            com.google.android.gms.measurement.internal.zzgo r9 = r7.zzj()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.measurement.internal.zzgq r9 = r9.zzg()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L8c
            r1.close()
        L8c:
            return r0
        L8d:
            if (r0 == 0) goto L92
            r0.close()
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    @WorkerThread
    public final zzaq zza(long j2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        return zza(j2, str, 1L, false, false, z4, false, z6, z7, z8);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x016e  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzaq zza(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzaq");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzop zze(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r14)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)
            r13.zzt()
            r13.zzal()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.e_()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L3c
            r2.close()
            return r1
        L3c:
            long r7 = r2.getLong(r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.Object r9 = r13.zza(r2, r11)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r9 != 0) goto L4a
            r2.close()
            return r1
        L4a:
            java.lang.String r5 = r2.getString(r12)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            com.google.android.gms.measurement.internal.zzop r0 = new com.google.android.gms.measurement.internal.zzop     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r3 == 0) goto L73
            com.google.android.gms.measurement.internal.zzgo r3 = r13.zzj()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r14)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r3.zza(r4, r5)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            goto L73
        L6e:
            r0 = move-exception
            r1 = r2
            goto L9a
        L71:
            r0 = move-exception
            goto L7b
        L73:
            r2.close()
            return r0
        L77:
            r0 = move-exception
            goto L9a
        L79:
            r0 = move-exception
            r2 = r1
        L7b:
            com.google.android.gms.measurement.internal.zzgo r3 = r13.zzj()     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r14)     // Catch: java.lang.Throwable -> L6e
            com.google.android.gms.measurement.internal.zzgh r6 = r13.zzi()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r6.zzc(r15)     // Catch: java.lang.Throwable -> L6e
            r3.zza(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L99
            r2.close()
        L99:
            return r1
        L9a:
            if (r1 == 0) goto L9f
            r1.close()
        L9f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzop");
    }

    public final void zzb(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjeVar.zzf());
        contentValues.put("consent_source", Integer.valueOf(zzjeVar.zza()));
        zza("consent_settings", "app_id", contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzal();
        zzt();
        SQLiteDatabase e_ = e_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, zze().zzb(str, zzbh.zzah)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            return e_.delete("audience_filter_values", a.A("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", a.A("(", TextUtils.join(",", arrayList), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e);
            return false;
        }
    }

    @VisibleForTesting
    @WorkerThread
    private final Object zza(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T zza(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.zzau<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.e_()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            com.google.android.gms.measurement.internal.zzgo r4 = r2.zzj()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            com.google.android.gms.measurement.internal.zzgq r4 = r4.zzp()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.zza(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.zza(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            com.google.android.gms.measurement.internal.zzgo r5 = r2.zzj()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.zza(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzau):java.lang.Object");
    }

    public final boolean zzb(String str, Bundle bundle) {
        zzt();
        zzal();
        byte[] zzca = g_().zza(new zzbc(this.zzu, "", str, "dep", 0L, 0L, bundle)).zzca();
        zzj().zzp().zza("Saving default event parameters, appId, data size", zzi().zza(str), Integer.valueOf(zzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzca);
        try {
            if (e_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzgo.zza(str), e);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zza(long r5) {
        /*
            r4 = this;
            r4.zzt()
            r4.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.e_()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            if (r1 != 0) goto L37
            com.google.android.gms.measurement.internal.zzgo r6 = r4.zzj()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zza(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            r5.close()
            return r0
        L32:
            r6 = move-exception
            r0 = r5
            goto L56
        L35:
            r6 = move-exception
            goto L43
        L37:
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            r5.close()
            return r6
        L3f:
            r6 = move-exception
            goto L56
        L41:
            r6 = move-exception
            r5 = r0
        L43:
            com.google.android.gms.measurement.internal.zzgo r1 = r4.zzj()     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L55
            r5.close()
        L55:
            return r0
        L56:
            if (r0 == 0) goto L5b
            r0.close()
        L5b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long):java.lang.String");
    }

    @WorkerThread
    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return str2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final List<Pair<zzfy.zzk, Long>> zza(String str, int i2, int i3) {
        byte[] zzc2;
        long j2;
        long j3;
        zzt();
        zzal();
        int i4 = 1;
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkArgument(i3 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!query.moveToFirst()) {
                    List<Pair<zzfy.zzk, Long>> emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (true) {
                    long j4 = query.getLong(0);
                    try {
                        zzc2 = g_().zzc(query.getBlob(i4));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to unzip queued bundle. appId", zzgo.zza(str), e);
                    }
                    if (!arrayList.isEmpty() && zzc2.length + i5 > i3) {
                        break;
                    }
                    try {
                        zzfy.zzk.zza zzaVar = (zzfy.zzk.zza) zzoo.zza(zzfy.zzk.zzw(), zzc2);
                        if (!arrayList.isEmpty()) {
                            zzfy.zzk zzkVar = (zzfy.zzk) ((Pair) arrayList.get(0)).first;
                            zzfy.zzk zzkVar2 = (zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai());
                            if (!zzkVar.zzae().equals(zzkVar2.zzae()) || !zzkVar.zzad().equals(zzkVar2.zzad()) || zzkVar.zzau() != zzkVar2.zzau() || !zzkVar.zzaf().equals(zzkVar2.zzaf())) {
                                break;
                            }
                            Iterator<zzfy.zzo> it = zzkVar.zzas().iterator();
                            while (true) {
                                j2 = -1;
                                if (!it.hasNext()) {
                                    j3 = -1;
                                    break;
                                }
                                zzfy.zzo next = it.next();
                                if ("_npa".equals(next.zzg())) {
                                    j3 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzfy.zzo> it2 = zzkVar2.zzas().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfy.zzo next2 = it2.next();
                                if ("_npa".equals(next2.zzg())) {
                                    j2 = next2.zzc();
                                    break;
                                }
                            }
                            if (j3 != j2) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            zzaVar.zzi(query.getInt(2));
                        }
                        i5 += zzc2.length;
                        arrayList.add(Pair.create((zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai()), Long.valueOf(j4)));
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge queued bundle. appId", zzgo.zza(str), e2);
                    }
                    if (!query.moveToNext() || i5 > i3) {
                        break;
                    }
                    i4 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e3) {
                zzj().zzg().zza("Error querying bundles. appId", zzgo.zza(str), e3);
                List<Pair<zzfy.zzk, Long>> emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final List<zzae> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> zza(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void zza(String str, Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        zzt();
        zzal();
        zzar zzarVar = new zzar(this, str);
        for (List<zzap> zza2 = zzarVar.zza(); !zza2.isEmpty(); zza2 = zzarVar.zza()) {
            for (zzap zzapVar : zza2) {
                zzoo g_ = g_();
                zzfy.zzf zzfVar = zzapVar.zzd;
                Bundle bundle2 = new Bundle();
                for (zzfy.zzh zzhVar : zzfVar.zzh()) {
                    if (zzhVar.zzj()) {
                        bundle2.putDouble(zzhVar.zzg(), zzhVar.zza());
                    } else if (zzhVar.zzk()) {
                        bundle2.putFloat(zzhVar.zzg(), zzhVar.zzb());
                    } else if (zzhVar.zzl()) {
                        bundle2.putLong(zzhVar.zzg(), zzhVar.zzd());
                    } else if (zzhVar.zzn()) {
                        bundle2.putString(zzhVar.zzg(), zzhVar.zzh());
                    } else if (!zzhVar.zzi().isEmpty()) {
                        bundle2.putParcelableArray(zzhVar.zzg(), zzoo.zzb(zzhVar.zzi()));
                    } else {
                        g_.zzj().zzg().zza("Unexpected parameter type for parameter", zzhVar);
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String zzg = zzfVar.zzg();
                if (string == null) {
                    string = "";
                }
                zzgs zzgsVar = new zzgs(zzg, string, bundle2, zzfVar.zzd());
                zzq().zza(zzgsVar.zzc, bundle);
                zza(zzapVar.zza, new zzbc(this.zzu, zzgsVar.zzb, str, zzapVar.zzd.zzg(), zzapVar.zzd.zzd(), zzapVar.zzd.zzc(), zzgsVar.zzc), zzapVar.zzb, zzapVar.zzc);
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zza(List<Long> list) {
        zzt();
        zzal();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzaa()) {
            String A = a.A("(", TextUtils.join(",", list), ")");
            if (zzb(a.A("SELECT COUNT(1) FROM queue WHERE rowid IN ", A, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + A + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    public final void zza(Long l2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(l2);
        if ((!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzaa()) {
            if (zzb("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l2 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l2 + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    private static void zza(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    @WorkerThread
    public final void zza(String str, List<zzfo.zza> list) {
        boolean z2;
        boolean z3;
        Preconditions.checkNotNull(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfo.zza.C0128zza zzcd = list.get(i2).zzcd();
            if (zzcd.zza() != 0) {
                for (int i3 = 0; i3 < zzcd.zza(); i3++) {
                    zzfo.zzb.zza zzcd2 = zzcd.zza(i3).zzcd();
                    zzfo.zzb.zza zzaVar = (zzfo.zzb.zza) ((zzjt.zzb) zzcd2.clone());
                    String zzb2 = zzji.zzb(zzcd2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    for (int i4 = 0; i4 < zzcd2.zza(); i4++) {
                        zzfo.zzc zza2 = zzcd2.zza(i4);
                        String zza3 = zzjk.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i4, (zzfo.zzc) ((com.google.android.gms.internal.measurement.zzjt) zza2.zzcd().zza(zza3).zzai()));
                            z3 = true;
                        }
                    }
                    if (z3) {
                        zzfo.zza.C0128zza zza4 = zzcd.zza(i3, zzaVar);
                        list.set(i2, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) zza4.zzai()));
                        zzcd = zza4;
                    }
                }
            }
            if (zzcd.zzb() != 0) {
                for (int i5 = 0; i5 < zzcd.zzb(); i5++) {
                    zzfo.zze zzb3 = zzcd.zzb(i5);
                    String zza5 = zzjj.zza(zzb3.zze());
                    if (zza5 != null) {
                        zzcd = zzcd.zza(i5, zzb3.zzcd().zza(zza5));
                        list.set(i2, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
                    }
                }
            }
        }
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        try {
            zzal();
            zzt();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase e_2 = e_();
            e_2.delete("property_filters", "app_id=?", new String[]{str});
            e_2.delete("event_filters", "app_id=?", new String[]{str});
            for (zzfo.zza zzaVar2 : list) {
                zzal();
                zzt();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzaVar2);
                if (!zzaVar2.zzg()) {
                    zzj().zzu().zza("Audience with no ID. appId", zzgo.zza(str));
                } else {
                    int zza6 = zzaVar2.zza();
                    Iterator<zzfo.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(zza6));
                                break;
                            }
                        } else {
                            Iterator<zzfo.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(zza6));
                                        break;
                                    }
                                } else {
                                    Iterator<zzfo.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zza6, it3.next())) {
                                                z2 = false;
                                                break;
                                            }
                                        } else {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        Iterator<zzfo.zze> it4 = zzaVar2.zzf().iterator();
                                        while (it4.hasNext()) {
                                            if (!zza(str, zza6, it4.next())) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        zzal();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase e_3 = e_();
                                        e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza6)});
                                        e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza6)});
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (zzfo.zza zzaVar3 : list) {
                arrayList.add(zzaVar3.zzg() ? Integer.valueOf(zzaVar3.zza()) : null);
            }
            zzb(str, arrayList);
            e_.setTransactionSuccessful();
            e_.endTransaction();
        } catch (Throwable th) {
            e_.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0043, code lost:
    
        if (r7.zzg.zzb(r0).zza(com.google.android.gms.measurement.internal.zzje.zza.ANALYTICS_STORAGE) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d9  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.measurement.internal.zzg r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(com.google.android.gms.measurement.internal.zzg, boolean, boolean):void");
    }

    public final void zza(String str, zzax zzaxVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaxVar);
        zzt();
        zzal();
        if (zze().zza(zzbh.zzcr)) {
            zzje zzi2 = zzi(str);
            zzje zzjeVar = zzje.zza;
            if (zzi2 == zzjeVar) {
                zzb(str, zzjeVar);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzaxVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    @WorkerThread
    public final void zza(zzbb zzbbVar) {
        zza(CrashEvent.f29806f, zzbbVar);
    }

    @WorkerThread
    private final void zza(String str, zzbb zzbbVar) {
        Preconditions.checkNotNull(zzbbVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbbVar.zza);
        contentValues.put("name", zzbbVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbbVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbbVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbbVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbbVar.zzg));
        contentValues.put("last_bundled_day", zzbbVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbbVar.zzi);
        contentValues.put("last_sampling_rate", zzbbVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbbVar.zze));
        Boolean bool = zzbbVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzgo.zza(zzbbVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzgo.zza(zzbbVar.zza), e);
        }
    }

    @WorkerThread
    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase e_ = e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzm().zza("Value of the primary key is not set.", zzgo.zza(str2));
                return;
            }
            if (e_.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update table (got -1). key", zzgo.zza(str), zzgo.zza(str2));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing into table. key", zzgo.zza(str), zzgo.zza(str2), e);
        }
    }

    public final void zza(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjeVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    @WorkerThread
    public final boolean zza(zzfy.zzk zzkVar, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        Preconditions.checkState(zzkVar.zzbj());
        zzv();
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zzkVar.zzm() < currentTimeMillis - zzag.zzm() || zzkVar.zzm() > zzag.zzm() + currentTimeMillis) {
            zzj().zzu().zza("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgo.zza(zzkVar.zzz()), Long.valueOf(currentTimeMillis), Long.valueOf(zzkVar.zzm()));
        }
        try {
            byte[] zzb2 = g_().zzb(zzkVar.zzca());
            zzj().zzp().zza("Saving bundle, size", Integer.valueOf(zzb2.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkVar.zzz());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzm()));
            contentValues.put("data", zzb2);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (zzkVar.zzbq()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (e_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzgo.zza(zzkVar.zzz()));
                return false;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error storing bundle. appId", zzgo.zza(zzkVar.zzz()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzgo.zza(zzkVar.zzz()), e2);
            return false;
        }
    }

    @WorkerThread
    private final boolean zza(String str, int i2, zzfo.zzb zzbVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i2), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzca = zzbVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", zzca);
        try {
            if (e_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzgo.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event filter. appId", zzgo.zza(str), e);
            return false;
        }
    }

    @WorkerThread
    private final boolean zza(String str, int i2, zzfo.zze zzeVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i2), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzca = zzeVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", zzca);
        try {
            if (e_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing property filter. appId", zzgo.zza(str), e);
            return false;
        }
    }

    public final boolean zza(zzbc zzbcVar, long j2, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] zzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", zzca);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            if (e_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzgo.zza(zzbcVar.zza));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event. appId", zzgo.zza(zzbcVar.zza), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(String str, zzno zznoVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        long j2 = zznoVar.zzb;
        zzfz<Long> zzfzVar = zzbh.zzbh;
        if (j2 < currentTimeMillis - zzfzVar.zza(null).longValue() || zznoVar.zzb > zzfzVar.zza(null).longValue() + currentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgo.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zznoVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zznoVar.zza);
        contentValues.put("source", Integer.valueOf(zznoVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zznoVar.zzb));
        try {
            if (e_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzgo.zza(str), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(String str, zzfy.zzj zzjVar, String str2, Map<String, String> map, zznt zzntVar) {
        int delete;
        zzt();
        zzal();
        Preconditions.checkNotNull(zzjVar);
        Preconditions.checkNotEmpty(str);
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return false;
        }
        zzt();
        zzal();
        if (zzaa()) {
            long zza2 = zzn().zzb.zza();
            long elapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(elapsedRealtime - zza2) > zzag.zzn()) {
                zzn().zzb.zza(elapsedRealtime);
                zzt();
                zzal();
                if (zzaa() && (delete = e_().delete("upload_queue", zzao(), new String[0])) > 0) {
                    zzj().zzp().zza("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + ImpressionLog.R + entry.getValue());
        }
        byte[] zzca = zzjVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", zzca);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i2 = 1;
            while (i2 < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i2);
                i2++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(zzntVar.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (e_().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing MeasurementBatch to upload_queue. appId", str, e);
            return false;
        }
    }

    public final boolean zza(String str, Long l2, long j2, zzfy.zzf zzfVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        byte[] zzca = zzfVar.zzca();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", zzca);
        try {
            if (e_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing complex main event. appId", zzgo.zza(str), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        zzt();
        zzal();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (zze(str, zzaeVar.zzc.zza) == null && zzb("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaeVar.zzb);
        contentValues.put("name", zzaeVar.zzc.zza);
        zza(contentValues, "value", Preconditions.checkNotNull(zzaeVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzaeVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzaeVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzaeVar.zzh));
        zzq();
        contentValues.put("timed_out_event", zzos.zza((Parcelable) zzaeVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzaeVar.zzd));
        zzq();
        contentValues.put("triggered_event", zzos.zza((Parcelable) zzaeVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzaeVar.zzc.zzb));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzaeVar.zzj));
        zzq();
        contentValues.put("expired_event", zzos.zza((Parcelable) zzaeVar.zzk));
        try {
            if (e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzgo.zza(str));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing conditional user property", zzgo.zza(str), e);
            return true;
        }
    }

    private final boolean zza(long j2, zzbc zzbcVar, long j3, boolean z2) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] zzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j3));
        contentValues.put("data", zzca);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            long update = e_().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
            if (update == 1) {
                return true;
            }
            zzj().zzg().zza("Failed to update raw event. appId, updatedRows", zzgo.zza(zzbcVar.zza), Long.valueOf(update));
            return false;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error updating raw event. appId", zzgo.zza(zzbcVar.zza), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean zza(zzop zzopVar) {
        Preconditions.checkNotNull(zzopVar);
        zzt();
        zzal();
        if (zze(zzopVar.zza, zzopVar.zzc) == null) {
            if (zzos.zzh(zzopVar.zzc)) {
                if (zzb("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzopVar.zza}) >= zze().zza(zzopVar.zza, zzbh.zzai, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzopVar.zzc) && zzb("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzopVar.zza, zzopVar.zzb}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzopVar.zza);
        contentValues.put("origin", zzopVar.zzb);
        contentValues.put("name", zzopVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzopVar.zzd));
        zza(contentValues, "value", zzopVar.zze);
        try {
            if (e_().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzgo.zza(zzopVar.zza));
            return true;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing user property. appId", zzgo.zza(zzopVar.zza), e);
            return true;
        }
    }
}
