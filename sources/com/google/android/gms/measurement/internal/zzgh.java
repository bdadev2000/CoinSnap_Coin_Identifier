package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzin;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgh extends zzii {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private long zzaa;
    public zzgl zzb;
    public final zzgm zzc;
    public final zzgm zzd;
    public final zzgn zze;
    public final zzgm zzf;
    public final zzgk zzg;
    public final zzgn zzh;
    public final zzgj zzi;
    public final zzgk zzj;
    public final zzgm zzk;
    public final zzgm zzl;
    public boolean zzm;
    public zzgk zzn;
    public zzgk zzo;
    public zzgm zzp;
    public final zzgn zzq;
    public final zzgn zzr;
    public final zzgm zzs;
    public final zzgj zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    public zzgh(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzw = new Object();
        this.zzf = new zzgm(this, "session_timeout", 1800000L);
        this.zzg = new zzgk(this, "start_new_session", true);
        this.zzk = new zzgm(this, "last_pause_time", 0L);
        this.zzl = new zzgm(this, "session_id", 0L);
        this.zzh = new zzgn(this, "non_personalized_ads", null);
        this.zzi = new zzgj(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgk(this, "allow_remote_dynamite", false);
        this.zzc = new zzgm(this, "first_open_time", 0L);
        this.zzd = new zzgm(this, "app_install_time", 0L);
        this.zze = new zzgn(this, "app_instance_id", null);
        this.zzn = new zzgk(this, "app_backgrounded", false);
        this.zzo = new zzgk(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzgm(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzgn(this, "firebase_feature_rollouts", null);
        this.zzr = new zzgn(this, "deferred_attribution_cache", null);
        this.zzs = new zzgm(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzgj(this, "default_event_parameters", null);
    }

    public final Pair<String, Boolean> zza(String str) {
        zzt();
        if (!zzn().zza(zzin.zza.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (this.zzy != null && elapsedRealtime < this.zzaa) {
            return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
        }
        this.zzaa = zze().zzd(str) + elapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.zzy = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.zzy = id;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e4) {
            zzj().zzc().zza("Unable to get advertising id", e4);
            this.zzy = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    public final void zzaa() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z8 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z8;
        if (!z8) {
            SharedPreferences.Editor edit = this.zzv.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzb = new zzgl(this, "health_monitor", Math.max(0L, zzbf.zzc.zza(null).longValue()));
    }

    public final boolean zzab() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final void zzb(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    public final SharedPreferences zzc() {
        zzt();
        zzac();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                try {
                    if (this.zzx == null) {
                        String str = zza().getPackageName() + "_preferences";
                        zzj().zzp().zza("Default prefs file", str);
                        this.zzx = zza().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.zzx;
    }

    public final SharedPreferences zzg() {
        zzt();
        zzac();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    public final SparseArray<Long> zzh() {
        Bundle zza2 = this.zzi.zza();
        if (zza2 == null) {
            return new SparseArray<>();
        }
        int[] intArray = zza2.getIntArray("uriSources");
        long[] longArray = zza2.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray<>();
            }
            SparseArray<Long> sparseArray = new SparseArray<>();
            for (int i9 = 0; i9 < intArray.length; i9++) {
                sparseArray.put(intArray[i9], Long.valueOf(longArray[i9]));
            }
            return sparseArray;
        }
        return new SparseArray<>();
    }

    public final zzav zzm() {
        zzt();
        return zzav.zza(zzg().getString("dma_consent_settings", null));
    }

    public final zzin zzn() {
        zzt();
        return zzin.zza(zzg().getString("consent_settings", "G1"), zzg().getInt("consent_source", 100));
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    public final boolean zzo() {
        return true;
    }

    public final Boolean zzp() {
        zzt();
        if (!zzg().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(zzg().getBoolean("use_service", false));
    }

    public final Boolean zzu() {
        zzt();
        if (zzg().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    public final Boolean zzv() {
        zzt();
        if (zzg().contains("measurement_enabled")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String zzw() {
        zzt();
        String string = zzg().getString("previous_os_version", null);
        zzf().zzac();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzg().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final String zzx() {
        zzt();
        return zzg().getString("admob_app_id", null);
    }

    public final String zzy() {
        zzt();
        return zzg().getString("gmp_app_id", null);
    }

    public final void zzz() {
        zzt();
        Boolean zzv = zzv();
        SharedPreferences.Editor edit = zzg().edit();
        edit.clear();
        edit.apply();
        if (zzv != null) {
            zza(zzv);
        }
    }

    public final void zzb(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    public final void zzb(boolean z8) {
        zzt();
        zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z8));
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("deferred_analytics_collection", z8);
        edit.apply();
    }

    public final void zzc(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final void zza(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void zza(boolean z8) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("use_service", z8);
        edit.apply();
    }

    public final void zza(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.zzi.zza(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            iArr[i9] = sparseArray.keyAt(i9);
            jArr[i9] = sparseArray.valueAt(i9).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.zzi.zza(bundle);
    }

    public final boolean zza(long j7) {
        return j7 - this.zzf.zza() > this.zzk.zza();
    }

    public final boolean zza(zzav zzavVar) {
        zzt();
        if (!zzin.zza(zzavVar.zza(), zzm().zza())) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("dma_consent_settings", zzavVar.zzf());
        edit.apply();
        return true;
    }

    public final boolean zza(zzin zzinVar) {
        zzt();
        int zza2 = zzinVar.zza();
        if (!zza(zza2)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("consent_settings", zzinVar.zzh());
        edit.putInt("consent_source", zza2);
        edit.apply();
        return true;
    }

    public final boolean zza(int i9) {
        return zzin.zza(i9, zzg().getInt("consent_source", 100));
    }

    public final boolean zza(zzms zzmsVar) {
        zzt();
        String string = zzg().getString("stored_tcf_param", "");
        String zzc = zzmsVar.zzc();
        if (zzc.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("stored_tcf_param", zzc);
        edit.apply();
        return true;
    }
}
