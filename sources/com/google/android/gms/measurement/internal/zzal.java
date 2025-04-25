package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.webkit.ProxyConfig;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.time.DurationKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes12.dex */
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

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    public final long zza(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        try {
            return e_().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(DurationKt.NANOS_IN_MILLIS, zze().zzb(str, zzbh.zzp))))});
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error deleting over the limit events. appId", zzgo.zza(str), e);
            return 0L;
        }
    }

    public final long b_() {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return -1L;
                }
                long j = cursor.getLong(0);
                if (cursor != null) {
                    cursor.close();
                }
                return j;
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
        contentValues.put(TtmlNode.TAG_METADATA, zzca);
        try {
            e_().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return zza2;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing raw event metadata. appId", zzgo.zza(zzkVar.zzz()), e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzb(String str, String str2) {
        long zza2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzal();
        SQLiteDatabase e_ = e_();
        e_.beginTransaction();
        long j = 0;
        try {
            try {
                zza2 = zza("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
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
            } catch (SQLiteException e) {
                e = e;
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
            } catch (SQLiteException e2) {
                long j2 = zza2;
                e = e2;
                j = j2;
                zzj().zzg().zza("Error inserting column. appId", zzgo.zza(str), str2, e);
                e_.endTransaction();
                return j;
            }
        } finally {
            e_.endTransaction();
        }
    }

    public final long zzb(String str) {
        Preconditions.checkNotEmpty(str);
        zzt();
        zzal();
        return zza("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long c_() {
        return zza("select max(bundle_end_timestamp) from queue", (String[]) null, 0L);
    }

    public final long d_() {
        return zza("select max(timestamp) from raw_events", (String[]) null, 0L);
    }

    public final long zzc(String str) {
        Preconditions.checkNotEmpty(str);
        return zza("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    private final long zzb(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return j;
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

    private final long zza(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getLong(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return j;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SQLiteDatabase e_() {
        zzt();
        try {
            return this.zzl.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().zzu().zza("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0088: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:33:0x0088 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
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
            android.database.sqlite.SQLiteDatabase r1 = r5.e_()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L72
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            if (r2 != 0) goto L2e
            com.google.android.gms.measurement.internal.zzgo r6 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            java.lang.String r2 = "Default event parameters not found"
            r6.zza(r2)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            if (r1 == 0) goto L2d
            r1.close()
        L2d:
            return r0
        L2e:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r3 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r3, r2)     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.io.IOException -> L56 android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            r5.g_()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            java.util.List r6 = r2.zzh()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            android.os.Bundle r6 = com.google.android.gms.measurement.internal.zzoo.zza(r6)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            if (r1 == 0) goto L55
            r1.close()
        L55:
            return r6
        L56:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzgo.zza(r6)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            r3.zza(r4, r6, r2)     // Catch: android.database.sqlite.SQLiteException -> L6e java.lang.Throwable -> L87
            if (r1 == 0) goto L6d
            r1.close()
        L6d:
            return r0
        L6e:
            r6 = move-exception
            goto L74
        L70:
            r6 = move-exception
            goto L89
        L72:
            r6 = move-exception
            r1 = r0
        L74:
            com.google.android.gms.measurement.internal.zzgo r2 = r5.zzj()     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.measurement.internal.zzgq r2 = r2.zzg()     // Catch: java.lang.Throwable -> L87
            java.lang.String r3 = "Error selecting default event parameters"
            r2.zza(r3, r6)     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r0
        L87:
            r6 = move-exception
            r0 = r1
        L89:
            if (r0 == 0) goto L8e
            r0.close()
        L8e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzd(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0091: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:32:0x0091 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
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
            android.database.sqlite.SQLiteDatabase r1 = r7.e_()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r2 != 0) goto L37
            com.google.android.gms.measurement.internal.zzgo r8 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzgq r8 = r8.zzp()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.String r9 = "Main event not found"
            r8.zza(r9)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L36
            r1.close()
        L36:
            return r0
        L37:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r4 = com.google.android.gms.internal.measurement.zzfy.zzf.zze()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzlb r2 = com.google.android.gms.measurement.internal.zzoo.zza(r4, r2)     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfy$zzf$zza r2 = (com.google.android.gms.internal.measurement.zzfy.zzf.zza) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzlc r2 = r2.zzai()     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzjt r2 = (com.google.android.gms.internal.measurement.zzjt) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.internal.measurement.zzfy$zzf r2 = (com.google.android.gms.internal.measurement.zzfy.zzf) r2     // Catch: java.io.IOException -> L5f android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L5e
            r1.close()
        L5e:
            return r8
        L5f:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzgo r3 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzgo.zza(r8)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            r3.zza(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L90
            if (r1 == 0) goto L76
            r1.close()
        L76:
            return r0
        L77:
            r8 = move-exception
            goto L7d
        L79:
            r8 = move-exception
            goto L92
        L7b:
            r8 = move-exception
            r1 = r0
        L7d:
            com.google.android.gms.measurement.internal.zzgo r9 = r7.zzj()     // Catch: java.lang.Throwable -> L90
            com.google.android.gms.measurement.internal.zzgq r9 = r9.zzg()     // Catch: java.lang.Throwable -> L90
            java.lang.String r2 = "Error selecting main event"
            r9.zza(r2, r8)     // Catch: java.lang.Throwable -> L90
            if (r1 == 0) goto L8f
            r1.close()
        L8f:
            return r0
        L90:
            r8 = move-exception
            r0 = r1
        L92:
            if (r0 == 0) goto L97
            r0.close()
        L97:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0437: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:122:0x0436 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x039b A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0370 A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0285 A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0230 A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0294 A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ac A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02d5 A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ea A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0334 A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x035a A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b4 A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e0 A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fe A[Catch: SQLiteException -> 0x0415, all -> 0x0435, TRY_LEAVE, TryCatch #0 {all -> 0x0435, blocks: (B:5:0x0134, B:11:0x0140, B:13:0x0151, B:15:0x015d, B:17:0x0172, B:19:0x017f, B:21:0x018b, B:23:0x01a0, B:25:0x01e1, B:29:0x01eb, B:32:0x0235, B:34:0x0264, B:38:0x026e, B:41:0x0289, B:43:0x0294, B:44:0x02a6, B:46:0x02ac, B:48:0x02b8, B:50:0x02cf, B:52:0x02d5, B:54:0x02e1, B:56:0x02ea, B:58:0x02f2, B:61:0x02fb, B:63:0x0313, B:65:0x031c, B:67:0x0334, B:69:0x0340, B:70:0x0352, B:72:0x035a, B:75:0x0363, B:78:0x037b, B:81:0x03a5, B:83:0x03b4, B:85:0x03bc, B:86:0x03c7, B:88:0x03cf, B:89:0x03da, B:91:0x03e0, B:93:0x03ec, B:94:0x03f5, B:96:0x03fe, B:101:0x039b, B:102:0x0370, B:105:0x0377, B:107:0x02c6, B:108:0x0285, B:110:0x0230, B:112:0x0199, B:113:0x016b, B:116:0x041e), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0411  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzg zze(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String):com.google.android.gms.measurement.internal.zzg");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzae zzc(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzae");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
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
            android.database.sqlite.SQLiteDatabase r1 = r12.e_()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "apps"
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "remote_config"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "config_last_modified_time"
            r10 = 1
            r3[r10] = r4     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "e_tag"
            r11 = 2
            r3[r11] = r4     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            if (r2 != 0) goto L3b
            if (r1 == 0) goto L3a
            r1.close()
        L3a:
            return r0
        L3b:
            byte[] r2 = r1.getBlob(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            java.lang.String r3 = r1.getString(r10)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            java.lang.String r4 = r1.getString(r11)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            boolean r5 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            if (r5 == 0) goto L5e
            com.google.android.gms.measurement.internal.zzgo r5 = r12.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzgo.zza(r13)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            r5.zza(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
        L5e:
            if (r2 != 0) goto L66
            if (r1 == 0) goto L65
            r1.close()
        L65:
            return r0
        L66:
            com.google.android.gms.measurement.internal.zzan r5 = new com.google.android.gms.measurement.internal.zzan     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            r5.<init>(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8e
            if (r1 == 0) goto L70
            r1.close()
        L70:
            return r5
        L71:
            r2 = move-exception
            goto L77
        L73:
            r13 = move-exception
            goto L90
        L75:
            r2 = move-exception
            r1 = r0
        L77:
            com.google.android.gms.measurement.internal.zzgo r3 = r12.zzj()     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzgo.zza(r13)     // Catch: java.lang.Throwable -> L8e
            r3.zza(r4, r13, r2)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8d
            r1.close()
        L8d:
            return r0
        L8e:
            r13 = move-exception
            r0 = r1
        L90:
            if (r0 == 0) goto L95
            r0.close()
        L95:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzf(java.lang.String):com.google.android.gms.measurement.internal.zzan");
    }

    public final zzaq zza(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return zza(j, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzaq zza(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.measurement.internal.zzaq");
    }

    public final zzax zzg(String str) {
        Preconditions.checkNotNull(str);
        zzt();
        zzal();
        return zzax.zza(zza("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final zzbb zzd(String str, String str2) {
        return zzc("events", str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.android.gms.measurement.internal.zzbb zzc(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzc(java.lang.String, java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzbb");
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a0  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzoj zzj(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzj(java.lang.String):com.google.android.gms.measurement.internal.zzoj");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
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
            android.database.sqlite.SQLiteDatabase r2 = r13.e_()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteException -> L7b
            boolean r0 = r2.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            if (r0 != 0) goto L3e
            if (r2 == 0) goto L3d
            r2.close()
        L3d:
            return r1
        L3e:
            long r7 = r2.getLong(r10)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            java.lang.Object r9 = r13.zza(r2, r11)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            if (r9 != 0) goto L4e
            if (r2 == 0) goto L4d
            r2.close()
        L4d:
            return r1
        L4e:
            java.lang.String r5 = r2.getString(r12)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzop r0 = new com.google.android.gms.measurement.internal.zzop     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            boolean r3 = r2.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            if (r3 == 0) goto L71
            com.google.android.gms.measurement.internal.zzgo r3 = r13.zzj()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r14)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L77 java.lang.Throwable -> L9c
        L71:
            if (r2 == 0) goto L76
            r2.close()
        L76:
            return r0
        L77:
            r0 = move-exception
            goto L7d
        L79:
            r0 = move-exception
            goto L9e
        L7b:
            r0 = move-exception
            r2 = r1
        L7d:
            com.google.android.gms.measurement.internal.zzgo r3 = r13.zzj()     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r14)     // Catch: java.lang.Throwable -> L9c
            com.google.android.gms.measurement.internal.zzgh r6 = r13.zzi()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = r6.zzc(r15)     // Catch: java.lang.Throwable -> L9c
            r3.zza(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L9c
            if (r2 == 0) goto L9b
            r2.close()
        L9b:
            return r1
        L9c:
            r0 = move-exception
            r1 = r2
        L9e:
            if (r1 == 0) goto La3
            r1.close()
        La3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zze(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzop");
    }

    private final Object zza(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().zzg().zza("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type == 4) {
            zzj().zzg().zza("Loaded invalid blob type value, ignoring it");
            return null;
        }
        zzj().zzg().zza("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
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
            android.database.sqlite.SQLiteDatabase r1 = r2.e_()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
            boolean r4 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            if (r4 != 0) goto L22
            com.google.android.gms.measurement.internal.zzgo r4 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            com.google.android.gms.measurement.internal.zzgq r4 = r4.zzp()     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            java.lang.String r5 = "No data found"
            r4.zza(r5)     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            if (r3 == 0) goto L21
            r3.close()
        L21:
            return r0
        L22:
            java.lang.Object r4 = r5.zza(r3)     // Catch: android.database.sqlite.SQLiteException -> L2c java.lang.Throwable -> L45
            if (r3 == 0) goto L2b
            r3.close()
        L2b:
            return r4
        L2c:
            r4 = move-exception
            goto L32
        L2e:
            r4 = move-exception
            goto L47
        L30:
            r4 = move-exception
            r3 = r0
        L32:
            com.google.android.gms.measurement.internal.zzgo r5 = r2.zzj()     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.measurement.internal.zzgq r5 = r5.zzg()     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Error querying database."
            r5.zza(r1, r4)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L44
            r3.close()
        L44:
            return r0
        L45:
            r4 = move-exception
            r0 = r3
        L47:
            if (r0 == 0) goto L4c
            r0.close()
        L4c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[], com.google.android.gms.measurement.internal.zzau):java.lang.Object");
    }

    private final String zzao() {
        long currentTimeMillis = zzb().currentTimeMillis();
        return "(" + ("(upload_type = " + zznt.GOOGLE_SIGNAL.zza() + " AND (ABS(creation_timestamp - " + currentTimeMillis + ") > CAST(" + zzbh.zzaf.zza(null).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + zznt.GOOGLE_SIGNAL.zza() + " AND (ABS(creation_timestamp - " + currentTimeMillis + ") > CAST(" + zzag.zzm() + " AS INTEGER)))") + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
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
            android.database.sqlite.SQLiteDatabase r1 = r4.e_()     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L40 android.database.sqlite.SQLiteException -> L42
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r1 != 0) goto L34
            com.google.android.gms.measurement.internal.zzgo r6 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzgq r6 = r6.zzp()     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.zza(r1)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L33
            r5.close()
        L33:
            return r0
        L34:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3e java.lang.Throwable -> L57
            if (r5 == 0) goto L3d
            r5.close()
        L3d:
            return r6
        L3e:
            r6 = move-exception
            goto L44
        L40:
            r6 = move-exception
            goto L59
        L42:
            r6 = move-exception
            r5 = r0
        L44:
            com.google.android.gms.measurement.internal.zzgo r1 = r4.zzj()     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.measurement.internal.zzgq r1 = r1.zzg()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "Error selecting expired configs"
            r1.zza(r2, r6)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L56
            r5.close()
        L56:
            return r0
        L57:
            r6 = move-exception
            r0 = r5
        L59:
            if (r0 == 0) goto L5e
            r0.close()
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(long):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
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
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L24 android.database.sqlite.SQLiteException -> L29
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r2 == 0) goto L1c
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L22 java.lang.Throwable -> L3e
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            return r1
        L1c:
            if (r0 == 0) goto L21
            r0.close()
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3f
        L29:
            r2 = move-exception
            r0 = r1
        L2b:
            com.google.android.gms.measurement.internal.zzgo r3 = r6.zzj()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.zza(r4, r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L3d
            r0.close()
        L3d:
            return r1
        L3e:
            r1 = move-exception
        L3f:
            if (r0 == 0) goto L44
            r0.close()
        L44:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.f_():java.lang.String");
    }

    private final String zza(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    return cursor.getString(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
                return str2;
            } catch (SQLiteException e) {
                zzj().zzg().zza("Database error", str, e);
                throw e;
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0173, code lost:
    
        r4.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfy.zzk, java.lang.Long>> zza(java.lang.String r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 411
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
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + ProxyConfig.MATCH_ALL_SCHEMES);
            sb.append(" and name glob ?");
        }
        return zza(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        zzj().zzg().zza("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzae> zza(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(java.lang.String, java.lang.String[]):java.util.List");
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
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzno(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
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
            android.database.sqlite.SQLiteDatabase r2 = r15.e_()     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            if (r2 != 0) goto L48
            if (r1 == 0) goto L47
            r1.close()
        L47:
            return r0
        L48:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            if (r2 != 0) goto L54
            java.lang.String r2 = ""
        L54:
            r5 = r2
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L8b android.database.sqlite.SQLiteException -> L8e
            r2 = r15
            java.lang.Object r9 = r15.zza(r1, r14)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            if (r9 != 0) goto L72
            com.google.android.gms.measurement.internal.zzgo r3 = r15.zzj()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r16)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            r3.zza(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            goto L7d
        L72:
            com.google.android.gms.measurement.internal.zzop r10 = new com.google.android.gms.measurement.internal.zzop     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            r0.add(r10)     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
        L7d:
            boolean r3 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L89 java.lang.Throwable -> Lab
            if (r3 != 0) goto L48
            if (r1 == 0) goto L88
            r1.close()
        L88:
            return r0
        L89:
            r0 = move-exception
            goto L90
        L8b:
            r0 = move-exception
            r2 = r15
            goto Lac
        L8e:
            r0 = move-exception
            r2 = r15
        L90:
            com.google.android.gms.measurement.internal.zzgo r3 = r15.zzj()     // Catch: java.lang.Throwable -> Lab
            com.google.android.gms.measurement.internal.zzgq r3 = r3.zzg()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzgo.zza(r16)     // Catch: java.lang.Throwable -> Lab
            r3.zza(r4, r5, r0)     // Catch: java.lang.Throwable -> Lab
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto Laa
            r1.close()
        Laa:
            return r0
        Lab:
            r0 = move-exception
        Lac:
            if (r1 == 0) goto Lb1
            r1.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzl(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a5, code lost:
    
        zzj().zzg().zza("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.measurement.internal.zzop> zzb(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzb(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                ArrayMap arrayMap = new ArrayMap();
                do {
                    int i = query.getInt(0);
                    try {
                        arrayMap.put(Integer.valueOf(i), (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) ((zzfy.zzm.zza) zzoo.zza(zzfy.zzm.zze(), query.getBlob(1))).zzai()));
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter results. appId, audienceId, error", zzgo.zza(str), Integer.valueOf(i), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<zzfo.zzb>> zzn(String str) {
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), query.getBlob(1))).zzai());
                        if (zzbVar.zzk()) {
                            int i = query.getInt(0);
                            List list = (List) arrayMap.get(Integer.valueOf(i));
                            if (list == null) {
                                list = new ArrayList();
                                arrayMap.put(Integer.valueOf(i), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<zzfo.zzb>> zzf(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zzb zzbVar = (zzfo.zzb) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zzb.zza) zzoo.zza(zzfo.zzb.zzc(), query.getBlob(1))).zzai());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter. appId", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<zzfo.zze>> zzg(String str, String str2) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor query = e_().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzfo.zze>> emptyMap = Collections.emptyMap();
                    if (query != null) {
                        query.close();
                    }
                    return emptyMap;
                }
                do {
                    try {
                        zzfo.zze zzeVar = (zzfo.zze) ((com.google.android.gms.internal.measurement.zzjt) ((zzfo.zze.zza) zzoo.zza(zzfo.zze.zzc(), query.getBlob(1))).zzai());
                        int i = query.getInt(0);
                        List list = (List) arrayMap.get(Integer.valueOf(i));
                        if (list == null) {
                            list = new ArrayList();
                            arrayMap.put(Integer.valueOf(i), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e) {
                        zzj().zzg().zza("Failed to merge filter", zzgo.zza(str), e);
                    }
                } while (query.moveToNext());
                if (query != null) {
                    query.close();
                }
                return arrayMap;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<Integer, List<Integer>> zzo(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        ArrayMap arrayMap = new ArrayMap();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = e_().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return emptyMap;
                }
                do {
                    int i = rawQuery.getInt(0);
                    List list = (List) arrayMap.get(Integer.valueOf(i));
                    if (list == null) {
                        list = new ArrayList();
                        arrayMap.put(Integer.valueOf(i), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                if (rawQuery != null) {
                    rawQuery.close();
                }
                return arrayMap;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(zznv zznvVar) {
        super(zznvVar);
        this.zzm = new zznl(zzb());
        this.zzl = new zzat(this, zza(), "google_app_measurement.db");
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

    public final void zzp() {
        zzal();
        e_().beginTransaction();
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

    public final void zzq(String str) {
        zzbb zzd2;
        zzi("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = e_().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                do {
                    String string = cursor.getString(0);
                    if (string != null && (zzd2 = zzd(str, string)) != null) {
                        zza("events_snapshot", zzd2);
                    }
                } while (cursor.moveToNext());
                if (cursor != null) {
                    cursor.close();
                }
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

    public final void zzu() {
        zzal();
        e_().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(List<Long> list) {
        zzt();
        zzal();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzaa()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (zzb("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Long l) {
        zzt();
        zzal();
        Preconditions.checkNotNull(l);
        if ((!zzpu.zza() || zze().zza(zzbh.zzcb)) && zzaa()) {
            if (zzb("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l + " AND retry_count =  2147483647 LIMIT 1", (String[]) null) > 0) {
                zzj().zzu().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                e_().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                zzj().zzg().zza("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009a, code lost:
    
        if ("_v".equals(r0) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzr(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzr(java.lang.String):void");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str, List<zzfo.zza> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            zzfo.zza.C0139zza zzcd = list.get(i).zzcd();
            if (zzcd.zza() != 0) {
                for (int i2 = 0; i2 < zzcd.zza(); i2++) {
                    zzfo.zzb.zza zzcd2 = zzcd.zza(i2).zzcd();
                    zzfo.zzb.zza zzaVar = (zzfo.zzb.zza) ((zzjt.zzb) zzcd2.clone());
                    String zzb2 = zzji.zzb(zzcd2.zzb());
                    if (zzb2 != null) {
                        zzaVar.zza(zzb2);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < zzcd2.zza(); i3++) {
                        zzfo.zzc zza2 = zzcd2.zza(i3);
                        String zza3 = zzjk.zza(zza2.zze());
                        if (zza3 != null) {
                            zzaVar.zza(i3, (zzfo.zzc) ((com.google.android.gms.internal.measurement.zzjt) zza2.zzcd().zza(zza3).zzai()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        zzcd = zzcd.zza(i2, zzaVar);
                        list.set(i, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
                    }
                }
            }
            if (zzcd.zzb() != 0) {
                for (int i4 = 0; i4 < zzcd.zzb(); i4++) {
                    zzfo.zze zzb3 = zzcd.zzb(i4);
                    String zza4 = zzjj.zza(zzb3.zze());
                    if (zza4 != null) {
                        zzcd = zzcd.zza(i4, zzb3.zzcd().zza(zza4));
                        list.set(i, (zzfo.zza) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
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
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<zzfo.zze> it4 = zzaVar2.zzf().iterator();
                                        while (it4.hasNext()) {
                                            if (!zza(str, zza5, it4.next())) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
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

    public final void zzw() {
        zzal();
        e_().setTransactionSuccessful();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0043, code lost:
    
        if (r7.zzg.zzb(r0).zza(com.google.android.gms.measurement.internal.zzje.zza.ANALYTICS_STORAGE) != false) goto L10;
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
            Method dump skipped, instructions count: 843
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zza(com.google.android.gms.measurement.internal.zzg, boolean, boolean):void");
    }

    public final void zza(String str, zzax zzaxVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaxVar);
        zzt();
        zzal();
        if (zze().zza(zzbh.zzcr) && zzi(str) == zzje.zza) {
            zzb(str, zzje.zza);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzaxVar.zzf());
        zza("consent_settings", "app_id", contentValues);
    }

    public final void zza(zzbb zzbbVar) {
        zza("events", zzbbVar);
    }

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
        contentValues.put("last_exempt_from_sampling", (zzbbVar.zzk == null || !zzbbVar.zzk.booleanValue()) ? null : 1L);
        try {
            if (e_().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().zzg().zza("Failed to insert/update event aggregates (got -1). appId", zzgo.zza(zzbbVar.zza));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error storing event aggregates. appId", zzgo.zza(zzbbVar.zza), e);
        }
    }

    private final void zza(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase e_ = e_();
            if (contentValues.getAsString(str2) == null) {
                zzj().zzm().zza("Value of the primary key is not set.", zzgo.zza(str2));
            } else if (e_.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && e_.insertWithOnConflict(str, null, contentValues, 5) == -1) {
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
            int max = Math.max(0, Math.min(2000, zze().zzb(str, zzbh.zzah)));
            if (zzb2 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            return e_.delete("audience_filter_values", new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ").append(new StringBuilder("(").append(TextUtils.join(",", arrayList)).append(")").toString()).append(" order by rowid desc limit -1 offset ?)").toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            zzj().zzg().zza("Database error querying filters. appId", zzgo.zza(str), e);
            return false;
        }
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

    public final boolean zzs(String str) {
        if (!zzpu.zza() || zze().zza(zzbh.zzcb)) {
            return zzb(new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ").append(zzao()).toString(), new String[]{str}) != 0;
        }
        return false;
    }

    public final boolean zza(zzfy.zzk zzkVar, boolean z) {
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
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
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

    private final boolean zza(String str, int i, zzfo.zzb zzbVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().zzu().zza("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzca = zzbVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
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

    private final boolean zza(String str, int i, zzfo.zze zzeVar) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().zzu().zza("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgo.zza(str), Integer.valueOf(i), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzca = zzeVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i));
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

    public final boolean zza(zzbc zzbcVar, long j, boolean z) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzbcVar);
        Preconditions.checkNotEmpty(zzbcVar.zza);
        byte[] zzca = g_().zza(zzbcVar).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzbcVar.zza);
        contentValues.put("name", zzbcVar.zzb);
        contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", zzca);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
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

    public final boolean zza(String str, zzno zznoVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long currentTimeMillis = zzb().currentTimeMillis();
        if (zznoVar.zzb < currentTimeMillis - zzbh.zzbh.zza(null).longValue() || zznoVar.zzb > zzbh.zzbh.zza(null).longValue() + currentTimeMillis) {
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
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", zzca);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i = 1;
            while (i < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i);
                i++;
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzaa() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zza(String str, Long l, long j, zzfy.zzf zzfVar) {
        zzt();
        zzal();
        Preconditions.checkNotNull(zzfVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] zzca = zzfVar.zzca();
        zzj().zzp().zza("Saving complex main event, appId, data size", zzi().zza(str), Integer.valueOf(zzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzt(String str) {
        boolean z;
        boolean z2;
        Cursor cursor = null;
        try {
            try {
                cursor = e_().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (SQLiteException e) {
            e = e;
            z = false;
        }
        if (!cursor.moveToFirst()) {
            return false;
        }
        z = zzb().currentTimeMillis() < cursor.getLong(0) + 15000;
        try {
            z2 = zza("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0;
            if (cursor != null) {
                cursor.close();
            }
        } catch (SQLiteException e2) {
            e = e2;
            zzj().zzg().zza("Error checking backfill conditions", e);
            if (cursor != null) {
                cursor.close();
            }
            z2 = false;
            if (z) {
            }
        }
        return (z || z2) ? false : true;
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

    /* JADX INFO: Access modifiers changed from: package-private */
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

    private final boolean zza(long j, zzbc zzbcVar, long j2, boolean z) {
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
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            long update = e_().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
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
