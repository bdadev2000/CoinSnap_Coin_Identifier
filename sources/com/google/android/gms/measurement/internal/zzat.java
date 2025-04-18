package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.zzpn;
import com.safedk.android.analytics.events.CrashEvent;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzat extends com.google.android.gms.internal.measurement.zzck {
    private final /* synthetic */ zzal zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzal zzalVar, Context context, String str) {
        super(context, str, null, 1);
        this.zza = zzalVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        zznl zznlVar;
        zznl zznlVar2;
        zznl zznlVar3;
        zznlVar = this.zza.zzm;
        if (!zznlVar.zza(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            zznlVar2 = this.zza.zzm;
            zznlVar2.zzb();
            this.zza.zzj().zzg().zza("Opening the database failed, dropping and recreating it");
            if (!this.zza.zza().getDatabasePath("google_app_measurement.db").delete()) {
                this.zza.zzj().zzg().zza("Failed to delete corrupted db file", "google_app_measurement.db");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                zznlVar3 = this.zza.zzm;
                zznlVar3.zza();
                return writableDatabase;
            } catch (SQLiteException e) {
                this.zza.zzj().zzg().zza("Failed to open freshly created database", e);
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzaw.zza(this.zza.zzj(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        zzgo zzj = this.zza.zzj();
        strArr = zzal.zza;
        zzaw.zza(zzj, sQLiteDatabase, CrashEvent.f29806f, "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        zzgo zzj2 = this.zza.zzj();
        strArr2 = zzal.zzb;
        zzaw.zza(zzj2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
        zzgo zzj3 = this.zza.zzj();
        strArr3 = zzal.zzc;
        zzaw.zza(zzj3, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
        zzgo zzj4 = this.zza.zzj();
        strArr4 = zzal.zze;
        zzaw.zza(zzj4, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        zzgo zzj5 = this.zza.zzj();
        strArr5 = zzal.zzd;
        zzaw.zza(zzj5, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
        zzgo zzj6 = this.zza.zzj();
        strArr6 = zzal.zzf;
        zzaw.zza(zzj6, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
        zzgo zzj7 = this.zza.zzj();
        strArr7 = zzal.zzh;
        zzaw.zza(zzj7, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        zzgo zzj8 = this.zza.zzj();
        strArr8 = zzal.zzi;
        zzaw.zza(zzj8, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        zzgo zzj9 = this.zza.zzj();
        strArr9 = zzal.zzj;
        zzaw.zza(zzj9, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", strArr9);
        if (zzpn.zza()) {
            zzgo zzj10 = this.zza.zzj();
            strArr10 = zzal.zzk;
            zzaw.zza(zzj10, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", strArr10);
        }
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
