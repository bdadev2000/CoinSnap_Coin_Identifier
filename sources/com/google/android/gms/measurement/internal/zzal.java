package com.google.android.gms.measurement.internal;

import a4.j;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.time.DurationKt;
import r.b;
import vd.e;

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
        return j.h("(", "(upload_type = " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + currentTimeMillis + ") > CAST(" + zzbh.zzaf.zza(null).longValue() + " AS INTEGER)))", " OR ", "(upload_type != " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + currentTimeMillis + ") > CAST(" + zzag.zzm() + " AS INTEGER)))", ")");
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
                long j3 = cursor.getLong(0);
                cursor.close();
                return j3;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error querying raw events", e2);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e2) {
            zzj().zzu().zza("Error opening database", e2);
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
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
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3b
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            com.google.android.gms.measurement.internal.zzgo r3 = r6.zzj()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.f_():java.lang.String");
    }

    public final boolean zzaa() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long zzb(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j3 = 0;
        try {
            try {
                long zza2 = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (zza2 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(MBridgeConstans.APP_ID, str);
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
                    contentValues2.put(MBridgeConstans.APP_ID, str);
                    contentValues2.put(str2, Long.valueOf(1 + zza2));
                    if (e_.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().zzg().zza("Failed to update column (got 0). appId", zzgo.zza(str), str2);
                        return -1L;
                    }
                    e_.setTransactionSuccessful();
                    return zza2;
                } catch (SQLiteException e2) {
                    e = e2;
                    j3 = zza2;
                    zzj().zzg().zza("Error inserting column. appId", zzgo.zza(str), str2, e);
                    e_.endTransaction();
                    return j3;
                }
            } finally {
                e_.endTransaction();
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0083: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
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
            android.database.sqlite.SQLiteDatabase r1 = r5.e_()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            if (r2 != 0) goto L2e
            com.google.android.gms.measurement.internal.zzgo r6 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.lang.String r2 = "Default event parameters not found"
            r6.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r1.close()
            return r0
        L2e:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r3 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r3, r2)     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r5.g_()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.util.List r6 = r2.zzh()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zzoo.zza(r6)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r1.close()
            return r6
        L53:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgo.zza(r6)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r3.zza(r4, r6, r2)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r1.close()
            return r0
        L69:
            r6 = move-exception
            goto L6f
        L6b:
            r6 = move-exception
            goto L84
        L6d:
            r6 = move-exception
            r1 = r0
        L6f:
            com.google.android.gms.measurement.internal.zzgo r2 = r5.zzj()     // Catch: java.lang.Throwable -> L82
            com.google.android.gms.measurement.internal.zzgq r2 = r2.zzg()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zza(r3, r6)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L81
            r1.close()
        L81:
            return r0
        L82:
            r6 = move-exception
            r0 = r1
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzd(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02bb A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d0 A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017b A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01df A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f7 A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0220 A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0235 A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027f A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a5 A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0300 A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032c A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x034a A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e7 A[Catch: SQLiteException -> 0x035f, all -> 0x037c, TryCatch #2 {SQLiteException -> 0x035f, blocks: (B:5:0x007f, B:10:0x0089, B:12:0x009a, B:14:0x00a6, B:16:0x00bb, B:18:0x00c8, B:20:0x00d4, B:22:0x00ea, B:24:0x012c, B:28:0x0136, B:31:0x0180, B:33:0x01af, B:37:0x01b9, B:40:0x01d4, B:42:0x01df, B:43:0x01f1, B:45:0x01f7, B:47:0x0203, B:49:0x021a, B:51:0x0220, B:53:0x022c, B:55:0x0235, B:57:0x023d, B:60:0x0246, B:62:0x025e, B:64:0x0267, B:66:0x027f, B:68:0x028b, B:69:0x029d, B:71:0x02a5, B:74:0x02ae, B:77:0x02c7, B:80:0x02f1, B:82:0x0300, B:84:0x0308, B:85:0x0313, B:87:0x031b, B:88:0x0326, B:90:0x032c, B:92:0x0338, B:93:0x0341, B:95:0x034a, B:99:0x02e7, B:100:0x02bb, B:103:0x02c3, B:106:0x0211, B:107:0x01d0, B:109:0x017b, B:111:0x00e2, B:112:0x00b4), top: B:4:0x007f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zze(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0084: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0084 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzan zzf(java.lang.String r12) {
        /*
            r11 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r12)
            r11.zzt()
            r11.zzal()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.e_()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "app_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            r10 = 0
            r5[r10] = r12     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            if (r2 != 0) goto L33
            r1.close()
            return r0
        L33:
            byte[] r2 = r1.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            java.lang.String r3 = r1.getString(r9)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            boolean r5 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            if (r5 == 0) goto L57
            com.google.android.gms.measurement.internal.zzgo r5 = r11.zzj()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgo.zza(r12)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r5.zza(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
        L57:
            if (r2 != 0) goto L5d
            r1.close()
            return r0
        L5d:
            com.google.android.gms.measurement.internal.zzan r5 = new com.google.android.gms.measurement.internal.zzan     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r5.<init>(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r1.close()
            return r5
        L66:
            r2 = move-exception
            goto L6c
        L68:
            r12 = move-exception
            goto L85
        L6a:
            r2 = move-exception
            r1 = r0
        L6c:
            com.google.android.gms.measurement.internal.zzgo r3 = r11.zzj()     // Catch: java.lang.Throwable -> L83
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzgo.zza(r12)     // Catch: java.lang.Throwable -> L83
            r3.zza(r4, r12, r2)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L82
            r1.close()
        L82:
            return r0
        L83:
            r12 = move-exception
            r0 = r1
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r12
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

    public final zzoj zzj(String str) {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        Cursor cursor2 = null;
        if (zzpu.zza() && !zze().zza(zzbh.zzcb)) {
            return null;
        }
        try {
            cursor = e_().query("upload_queue", new String[]{"rowId", MBridgeConstans.APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + zzao(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return null;
                }
                String string = cursor.getString(3);
                if (TextUtils.isEmpty(string)) {
                    zzj().zzc().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                    cursor.close();
                    return null;
                }
                try {
                    zzfy.zzj.zza zzaVar = (zzfy.zzj.zza) zzoo.zza(zzfy.zzj.zzb(), cursor.getBlob(2));
                    zznt zzntVar = zznt.values()[cursor.getInt(5)];
                    if ((zzntVar == zznt.SGTM || zzntVar == zznt.GOOGLE_ANALYTICS) && cursor.getInt(6) > 0) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<zzfy.zzk> it = zzaVar.zzd().iterator();
                        while (it.hasNext()) {
                            zzfy.zzk.zza zzcd = it.next().zzcd();
                            zzcd.zzi(cursor.getInt(6));
                            arrayList.add((zzfy.zzk) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
                        }
                        zzaVar.zzb();
                        zzaVar.zza(arrayList);
                    }
                    HashMap hashMap = new HashMap();
                    String string2 = cursor.getString(4);
                    if (string2 != null) {
                        String[] split = string2.split("\r\n");
                        int length = split.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            String str2 = split[i10];
                            if (str2.isEmpty()) {
                                break;
                            }
                            String[] split2 = str2.split("=", 2);
                            if (split2.length != 2) {
                                zzj().zzg().zza("Invalid upload header: ", str2);
                                break;
                            }
                            hashMap.put(split2[0], split2[1]);
                            i10++;
                        }
                    }
                    zzoj zza2 = new zzom().zza(cursor.getLong(0)).zza((zzfy.zzj) ((com.google.android.gms.internal.measurement.zzjt) zzaVar.zzai())).zza(string).zza(hashMap).zza(zzntVar).zza();
                    cursor.close();
                    return zza2;
                } catch (IOException e10) {
                    zzj().zzg().zza("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
                    cursor.close();
                    return null;
                }
            } catch (SQLiteException e11) {
                e = e11;
                zzj().zzg().zza("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
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
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error querying trigger uris. appId", zzgo.zza(str), e2);
                List<zzno> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final List<zzop> zzl(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("user_attributes", new String[]{"name", "origin", "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j3 = cursor.getLong(2);
                    Object zza2 = zza(cursor, 3);
                    if (zza2 == null) {
                        zzj().zzg().zza("Read invalid user property value, ignoring it. appId", zzgo.zza(str));
                    } else {
                        arrayList.add(new zzop(str, str2, string, j3, zza2));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error querying user properties. appId", zzgo.zza(str), e2);
                List<zzop> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

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
                b bVar = new b();
                do {
                    int i10 = query.getInt(0);
                    try {
                        bVar.put(Integer.valueOf(i10), (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzm.zza) zzoo.zza(zzfy.zzm.zze(), query.getBlob(1))).zzai()));
                    } catch (IOException e2) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzgo.zza(str), Integer.valueOf(i10), e2);
                    }
                } while (query.moveToNext());
                query.close();
                return bVar;
            } catch (SQLiteException e10) {
                zzj().zzg().zza("Database error querying filter results. appId", zzgo.zza(str), e10);
                Map<Integer, zzfy.zzm> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final Map<Integer, List<zzfo.zzb>> zzn(String str) {
        Preconditions.checkNotEmpty(str);
        b bVar = new b();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
                        query.close();
                        return emptyMap;
                    }
                    do {
                        try {
                            zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), query.getBlob(1))).zzai());
                            if (zzbVar.zzk()) {
                                int i10 = query.getInt(0);
                                List list = (List) bVar.getOrDefault(Integer.valueOf(i10), null);
                                if (list == null) {
                                    list = new ArrayList();
                                    bVar.put(Integer.valueOf(i10), list);
                                }
                                list.add(zzbVar);
                            }
                        } catch (IOException e2) {
                            zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e2);
                        }
                    } while (query.moveToNext());
                    query.close();
                    return bVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor = query;
                    zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e);
                    Map<Integer, List<zzfo.zzb>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Map<Integer, List<Integer>> zzo(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        b bVar = new b();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                try {
                    if (!rawQuery.moveToFirst()) {
                        Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                        rawQuery.close();
                        return emptyMap;
                    }
                    do {
                        int i10 = rawQuery.getInt(0);
                        List list = (List) bVar.getOrDefault(Integer.valueOf(i10), null);
                        if (list == null) {
                            list = new ArrayList();
                            bVar.put(Integer.valueOf(i10), list);
                        }
                        list.add(Integer.valueOf(rawQuery.getInt(1)));
                    } while (rawQuery.moveToNext());
                    rawQuery.close();
                    return bVar;
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor = rawQuery;
                    zzj().zzg().zza("Database error querying scoped filters. appId", zzgo.zza(str), e);
                    Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = rawQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
    }

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
                cursor = e_().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
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
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error creating snapshot. appId", zzgo.zza(str), e2);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
    
        if ("_v".equals(r13) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzr(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzr(java.lang.String):void");
    }

    public final boolean zzs(String str) {
        if ((zzpu.zza() && !zze().zza(zzbh.zzcb)) || zzb(e.e("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", zzao()), new String[]{str}) == 0) {
            return false;
        }
        return true;
    }

    public final boolean zzt(String str) {
        boolean z10;
        boolean z11;
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
            } catch (SQLiteException e2) {
                e = e2;
                z10 = false;
            }
            if (!cursor.moveToFirst()) {
                cursor.close();
                return false;
            }
            if (zzb().currentTimeMillis() < cursor.getLong(0) + 15000) {
                z10 = true;
            } else {
                z10 = false;
            }
            try {
                if (zza("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                cursor.close();
            } catch (SQLiteException e10) {
                e = e10;
                zzj().zzg().zza("Error checking backfill conditions", e);
                z11 = false;
                if (!z10) {
                }
                return false;
            }
            if (!z10 && !z11) {
                return true;
            }
            return false;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final void zzu() {
        zzal();
        e_().endTransaction();
    }

    public final void zzv() {
        int delete;
        zzt();
        zzal();
        if (!zzaa()) {
            return;
        }
        long zza2 = zzn().zza.zza();
        long elapsedRealtime = zzb().elapsedRealtime();
        if (Math.abs(elapsedRealtime - zza2) > zzag.zzn()) {
            zzn().zza.zza(elapsedRealtime);
            zzt();
            zzal();
            if (zzaa() && (delete = e_().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(zzag.zzm())})) > 0) {
                zzj().zzp().zza("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void zzw() {
        zzal();
        e_().setTransactionSuccessful();
    }

    public final boolean zzx() {
        if (zzb("select count(1) > 0 from raw_events", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzy() {
        if (zzb("select count(1) > 0 from queue where has_realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzz() {
        if (zzb("select count(1) > 0 from raw_events where realtime = 1", (String[]) null) != 0) {
            return true;
        }
        return false;
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            return e_().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error deleting conditional property", zzgo.zza(str), zzi().zzc(str2), e2);
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
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error clearing default event params", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    public final Map<Integer, List<zzfo.zze>> zzg(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        b bVar = new b();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("property_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        Map<Integer, List<zzfo.zze>> emptyMap = Collections.emptyMap();
                        query.close();
                        return emptyMap;
                    }
                    do {
                        try {
                            zzfo.zze zzeVar = (zzfo.zze) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zze.zza) zzoo.zza(zzfo.zze.zzc(), query.getBlob(1))).zzai());
                            int i10 = query.getInt(0);
                            List list = (List) bVar.getOrDefault(Integer.valueOf(i10), null);
                            if (list == null) {
                                list = new ArrayList();
                                bVar.put(Integer.valueOf(i10), list);
                            }
                            list.add(zzeVar);
                        } catch (IOException e2) {
                            zzj().zzg().zza("Failed to merge filter", zzgo.zza(str), e2);
                        }
                    } while (query.moveToNext());
                    query.close();
                    return bVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor = query;
                    zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e);
                    Map<Integer, List<zzfo.zze>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    public final void zzh(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error deleting user property. appId", zzgo.zza(str), zzi().zzc(str2), e2);
        }
    }

    private final void zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        try {
            e_().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error deleting snapshot. appId", zzgo.zza(str2), e2);
        }
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            return e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zze().zzb(str, zzbh.zzp))))});
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzgo.zza(str), e2);
            return 0L;
        }
    }

    public final zzbb zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    public final long zza(zzfy.zzk zzkVar) throws IOException {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotEmpty(zzkVar.zzz());
        byte[] zzca = zzkVar.zzca();
        long zza2 = g_().zza(zzca);
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, zzkVar.zzz());
        contentValues.put("metadata_fingerprint", Long.valueOf(zza2));
        contentValues.put(TtmlNode.TAG_METADATA, zzca);
        try {
            e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzgo.zza(zzkVar.zzz()), e2);
            throw e2;
        }
    }

    public final Map<Integer, List<zzfo.zzb>> zzf(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        b bVar = new b();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", DataSchemeDataSource.SCHEME_DATA}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!query.moveToFirst()) {
                        Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
                        query.close();
                        return emptyMap;
                    }
                    do {
                        try {
                            zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), query.getBlob(1))).zzai());
                            int i10 = query.getInt(0);
                            List list = (List) bVar.getOrDefault(Integer.valueOf(i10), null);
                            if (list == null) {
                                list = new ArrayList();
                                bVar.put(Integer.valueOf(i10), list);
                            }
                            list.add(zzbVar);
                        } catch (IOException e2) {
                            zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e2);
                        }
                    } while (query.moveToNext());
                    query.close();
                    return bVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor = query;
                    zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e);
                    Map<Integer, List<zzfo.zzb>> emptyMap2 = Collections.emptyMap();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return emptyMap2;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j3 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j3;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0147: MOVE (r18 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:69:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.zzbb zzc(java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbb");
    }

    private final long zza(String str, String[] strArr, long j3) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j10 = cursor.getLong(0);
                    cursor.close();
                    return j10;
                }
                cursor.close();
                return j3;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzop> zzb(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
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
            android.database.sqlite.SQLiteDatabase r1 = r7.e_()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            if (r2 != 0) goto L35
            com.google.android.gms.measurement.internal.zzgo r8 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzgq r8 = r8.zzp()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r9 = "Main event not found"
            r8.zza(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r4 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r4, r2)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r8
        L5b:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgo.zza(r8)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r3.zza(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L71:
            r8 = move-exception
            goto L77
        L73:
            r8 = move-exception
            goto L8c
        L75:
            r8 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.zzgo r9 = r7.zzj()     // Catch: java.lang.Throwable -> L8a
            com.google.android.gms.measurement.internal.zzgq r9 = r9.zzg()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            r8 = move-exception
            r0 = r1
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final zzaq zza(long j3, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return zza(j3, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    public final zzaq zza(long j3, String str, long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        String[] strArr = {str};
        zzaq zzaqVar = new zzaq();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase e_ = e_();
                Cursor query = e_.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    zzj().zzu().zza("Not updating daily counts, app is not known. appId", zzgo.zza(str));
                    query.close();
                    return zzaqVar;
                }
                if (query.getLong(0) == j3) {
                    zzaqVar.zzb = query.getLong(1);
                    zzaqVar.zza = query.getLong(2);
                    zzaqVar.zzc = query.getLong(3);
                    zzaqVar.zzd = query.getLong(4);
                    zzaqVar.zze = query.getLong(5);
                    zzaqVar.zzf = query.getLong(6);
                    zzaqVar.zzg = query.getLong(7);
                }
                if (z10) {
                    zzaqVar.zzb += j10;
                }
                if (z11) {
                    zzaqVar.zza += j10;
                }
                if (z12) {
                    zzaqVar.zzc += j10;
                }
                if (z13) {
                    zzaqVar.zzd += j10;
                }
                if (z14) {
                    zzaqVar.zze += j10;
                }
                if (z15) {
                    zzaqVar.zzf += j10;
                }
                if (z16) {
                    zzaqVar.zzg += j10;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j3));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaqVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaqVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaqVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaqVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaqVar.zze));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzaqVar.zzf));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(zzaqVar.zzg));
                e_.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return zzaqVar;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error updating daily counts. appId", zzgo.zza(str), e2);
                if (0 != 0) {
                    cursor.close();
                }
                return zzaqVar;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzop zze(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r19)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r20)
            r18.zzt()
            r18.zzal()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.e_()     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7c
            if (r3 != 0) goto L3d
            r10.close()
            return r9
        L3d:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7c
            r11 = r18
            java.lang.Object r7 = r11.zza(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            if (r7 != 0) goto L4d
            r10.close()
            return r9
        L4d:
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.zzop r0 = new com.google.android.gms.measurement.internal.zzop     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            if (r1 == 0) goto L72
            com.google.android.gms.measurement.internal.zzgo r1 = r18.zzj()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgo.zza(r19)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            r1.zza(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
        L72:
            r10.close()
            return r0
        L76:
            r0 = move-exception
            goto L88
        L78:
            r0 = move-exception
            r11 = r18
            goto La8
        L7c:
            r0 = move-exception
            r11 = r18
            goto L88
        L80:
            r0 = move-exception
            r11 = r18
            goto La9
        L84:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L88:
            com.google.android.gms.measurement.internal.zzgo r1 = r18.zzj()     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzgo.zza(r19)     // Catch: java.lang.Throwable -> La7
            com.google.android.gms.measurement.internal.zzgh r4 = r18.zzi()     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r4.zzc(r8)     // Catch: java.lang.Throwable -> La7
            r1.zza(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La7
            if (r10 == 0) goto La6
            r10.close()
        La6:
            return r9
        La7:
            r0 = move-exception
        La8:
            r9 = r10
        La9:
            if (r9 == 0) goto Lae
            r9.close()
        Lae:
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
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("consent_state", zzjeVar.zzf());
        contentValues.put("consent_source", Integer.valueOf(zzjeVar.zza()));
        zza("consent_settings", MBridgeConstans.APP_ID, contentValues);
    }

    private final boolean zzb(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        zzal();
        zzt();
        SQLiteDatabase e_ = e_();
        try {
            long zzb2 = zzb("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, zze().zzb(str, zzbh.zzah)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            return e_.delete("audience_filter_values", com.applovin.impl.mediation.ads.e.f("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", com.applovin.impl.mediation.ads.e.f("(", TextUtils.join(",", arrayList), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    private final Object zza(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> T zza(java.lang.String r3, java.lang.String[] r4, com.google.android.gms.measurement.internal.zzau<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.e_()     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            boolean r4 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            if (r4 != 0) goto L20
            com.google.android.gms.measurement.internal.zzgo r4 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.zzgq r4 = r4.zzp()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            java.lang.String r5 = "No data found"
            r4.zza(r5)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r0
        L20:
            java.lang.Object r4 = r5.zza(r3)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r4
        L28:
            r4 = move-exception
            goto L2e
        L2a:
            r4 = move-exception
            goto L43
        L2c:
            r4 = move-exception
            r3 = r0
        L2e:
            com.google.android.gms.measurement.internal.zzgo r5 = r2.zzj()     // Catch: java.lang.Throwable -> L41
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Error querying database."
            r5.zza(r1, r4)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L40
            r3.close()
        L40:
            return r0
        L41:
            r4 = move-exception
            r0 = r3
        L43:
            if (r0 == 0) goto L48
            r0.close()
        L48:
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
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("parameters", zzca);
        try {
            if (e_().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert default event parameters (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing default event parameters. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
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
            android.database.sqlite.SQLiteDatabase r1 = r4.e_()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            com.google.android.gms.measurement.internal.zzgo r6 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zza(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r6
        L3a:
            r6 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L55
        L3e:
            r6 = move-exception
            r5 = r0
        L40:
            com.google.android.gms.measurement.internal.zzgo r1 = r4.zzj()     // Catch: java.lang.Throwable -> L53
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long):java.lang.String");
    }

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
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x016f A[EDGE_INSN: B:59:0x016f->B:25:0x016f BREAK  A[LOOP:0: B:16:0x0054->B:72:0x016c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfy.zzk, java.lang.Long>> zza(java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, int, int):java.util.List");
    }

    public final List<zzae> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return zza(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> zza(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 290
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

    public final void zza(List<Long> list) {
        zzt();
        zzal();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzaa()) {
            String f10 = com.applovin.impl.mediation.ads.e.f("(", TextUtils.join(",", list), ")");
            if (zzb(com.applovin.impl.mediation.ads.e.f("SELECT COUNT(1) FROM queue WHERE rowid IN ", f10, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + f10 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error incrementing retry count. error", e2);
            }
        }
    }

    public final void zza(Long l10) {
        zzt();
        zzal();
        Preconditions.checkNotNull(l10);
        if ((!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzaa()) {
            if (zzb("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l10 + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l10 + " AND retry_count < 2147483647");
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error incrementing retry count. error", e2);
            }
        }
    }

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

    public final void zza(String str, List<zzfo.zza> list) {
        boolean z10;
        boolean z11;
        Preconditions.checkNotNull(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzfo.zza.C0147zza zzcd = list.get(i10).zzcd();
            if (zzcd.zza() != 0) {
                for (int i11 = 0; i11 < zzcd.zza(); i11++) {
                    zzfo.zzb.zza zzcd2 = zzcd.zza(i11).zzcd();
                    zzfo.zzb.zza zzaVar = (zzfo.zzb.zza) ((zzjt.zzb) zzcd2.clone());
                    String zzb2 = zzji.zzb(zzcd2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    for (int i12 = 0; i12 < zzcd2.zza(); i12++) {
                        zzfo.zzc zza2 = zzcd2.zza(i12);
                        String zza3 = zzjk.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i12, (zzfo.zzc) ((com.google.android.gms.internal.measurement.zzjt) zza2.zzcd().zza(zza3).zzai()));
                            z11 = true;
                        }
                    }
                    if (z11) {
                        zzcd = zzcd.zza(i11, zzaVar);
                        list.set(i10, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
                    }
                }
            }
            if (zzcd.zzb() != 0) {
                for (int i13 = 0; i13 < zzcd.zzb(); i13++) {
                    zzfo.zze zzb3 = zzcd.zzb(i13);
                    String zza4 = zzjj.zza(zzb3.zze());
                    if (zza4 != null) {
                        zzcd = zzcd.zza(i13, zzb3.zzcd().zza(zza4));
                        list.set(i10, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
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
                    int zza5 = zzaVar2.zza();
                    Iterator<zzfo.zzb> it = zzaVar2.zze().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().zzl()) {
                                zzj().zzu().zza("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(zza5));
                                break;
                            }
                        } else {
                            Iterator<zzfo.zze> it2 = zzaVar2.zzf().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!it2.next().zzi()) {
                                        zzj().zzu().zza("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgo.zza(str), Integer.valueOf(zza5));
                                        break;
                                    }
                                } else {
                                    Iterator<zzfo.zzb> it3 = zzaVar2.zze().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!zza(str, zza5, it3.next())) {
                                                z10 = false;
                                                break;
                                            }
                                        } else {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                    if (z10) {
                                        Iterator<zzfo.zze> it4 = zzaVar2.zzf().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!zza(str, zza5, it4.next())) {
                                                    z10 = false;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z10) {
                                        zzal();
                                        zzt();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase e_3 = e_();
                                        e_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
                                        e_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(zza5)});
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
        } finally {
            e_.endTransaction();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0043, code lost:
    
        if (r7.zzg.zzb(r0).zza(com.google.android.gms.measurement.internal.zzje.zza.zzb) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d9  */
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
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("dma_consent_settings", zzaxVar.zzf());
        zza("consent_settings", MBridgeConstans.APP_ID, contentValues);
    }

    public final void zza(zzbb zzbbVar) {
        zza("events", zzbbVar);
    }

    private final void zza(String str, zzbb zzbbVar) {
        Preconditions.checkNotNull(zzbbVar);
        zzt();
        zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, zzbbVar.zza);
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
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzgo.zza(zzbbVar.zza), e2);
        }
    }

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
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing into table. key", zzgo.zza(str), zzgo.zza(str2), e2);
        }
    }

    public final void zza(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        zzt();
        zzal();
        zzb(str, zzi(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("storage_consent_at_bundling", zzjeVar.zzf());
        zza("consent_settings", MBridgeConstans.APP_ID, contentValues);
    }

    public final boolean zza(zzfy.zzk zzkVar, boolean z10) {
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
            contentValues.put(MBridgeConstans.APP_ID, zzkVar.zzz());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzm()));
            contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzb2);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (zzkVar.zzbq()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (e_().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().zzg().zza("Failed to insert bundle (got -1). appId", zzgo.zza(zzkVar.zzz()));
                return false;
            } catch (SQLiteException e2) {
                zzj().zzg().zza("Error storing bundle. appId", zzgo.zza(zzkVar.zzz()), e2);
                return false;
            }
        } catch (IOException e10) {
            zzj().zzg().zza("Data loss. Failed to serialize bundle. appId", zzgo.zza(zzkVar.zzz()), e10);
            return false;
        }
    }

    private final boolean zza(String str, int i10, zzfo.zzb zzbVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i10), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzca = zzbVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzca);
        try {
            if (e_().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert event filter (got -1). appId", zzgo.zza(str));
            return true;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing event filter. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    private final boolean zza(String str, int i10, zzfo.zze zzeVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i10), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzca = zzeVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzca);
        try {
            if (e_().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert property filter (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing property filter. appId", zzgo.zza(str), e2);
            return false;
        }
    }

    public final boolean zza(zzbc zzbcVar, long j3, boolean z10) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] zzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j3));
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzca);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (e_().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert raw event (got -1). appId", zzgo.zza(zzbcVar.zza));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing raw event. appId", zzgo.zza(zzbcVar.zza), e2);
            return false;
        }
    }

    public final boolean zza(String str, zzno zznoVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        long j3 = zznoVar.zzb;
        zzfz<Long> zzfzVar = zzbh.zzbh;
        if (j3 < currentTimeMillis - zzfzVar.zza(null).longValue() || zznoVar.zzb > zzfzVar.zza(null).longValue() + currentTimeMillis) {
            zzj().zzu().zza("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgo.zza(str), Long.valueOf(currentTimeMillis), Long.valueOf(zznoVar.zzb));
        }
        zzj().zzp().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("trigger_uri", zznoVar.zza);
        contentValues.put("source", Integer.valueOf(zznoVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zznoVar.zzb));
        try {
            if (e_().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert trigger URI (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing trigger URI. appId", zzgo.zza(str), e2);
            return false;
        }
    }

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
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        byte[] zzca = zzjVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("measurement_batch", zzca);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb2.append((CharSequence) arrayList.get(0));
            int i10 = 1;
            while (i10 < size) {
                sb2.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i10);
                i10++;
                sb2.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(zzntVar.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (e_().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return false;
        }
    }

    public final boolean zza(String str, Long l10, long j3, zzfy.zzf zzfVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l10);
        byte[] zzca = zzfVar.zzca();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j3));
        contentValues.put("main_event", zzca);
        try {
            if (e_().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().zzg().zza("Failed to insert complex main event (got -1). appId", zzgo.zza(str));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing complex main event. appId", zzgo.zza(str), e2);
            return false;
        }
    }

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
        contentValues.put(MBridgeConstans.APP_ID, str);
        contentValues.put("origin", zzaeVar.zzb);
        contentValues.put("name", zzaeVar.zzc.zza);
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, Preconditions.checkNotNull(zzaeVar.zzc.zza()));
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
            if (e_().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update conditional user property (got -1)", zzgo.zza(str));
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing conditional user property", zzgo.zza(str), e2);
        }
        return true;
    }

    private final boolean zza(long j3, zzbc zzbcVar, long j10, boolean z10) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] zzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.APP_ID, zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put(CampaignEx.JSON_KEY_TIMESTAMP, Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put(DataSchemeDataSource.SCHEME_DATA, zzca);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            long update = e_().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j3)});
            if (update == 1) {
                return true;
            }
            zzj().zzg().zza("Failed to update raw event. appId, updatedRows", zzgo.zza(zzbcVar.zza), Long.valueOf(update));
            return false;
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error updating raw event. appId", zzgo.zza(zzbcVar.zza), e2);
            return false;
        }
    }

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
        contentValues.put(MBridgeConstans.APP_ID, zzopVar.zza);
        contentValues.put("origin", zzopVar.zzb);
        contentValues.put("name", zzopVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzopVar.zzd));
        zza(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzopVar.zze);
        try {
            if (e_().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update user property (got -1). appId", zzgo.zza(zzopVar.zza));
            }
        } catch (SQLiteException e2) {
            zzj().zzg().zza("Error storing user property. appId", zzgo.zza(zzopVar.zza), e2);
        }
        return true;
    }
}
