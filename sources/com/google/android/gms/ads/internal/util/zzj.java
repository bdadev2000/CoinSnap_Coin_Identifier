package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzgge;
import f4.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private c zzd;

    @Nullable
    private SharedPreferences zzf;

    @Nullable
    private SharedPreferences.Editor zzg;

    @Nullable
    private String zzi;

    @Nullable
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();

    @Nullable
    private zzbbm zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = "-1";
    private int zzm = -1;
    private zzcbs zzn = new zzcbs("", 0);
    private long zzo = 0;
    private long zzp = 0;
    private int zzq = -1;
    private int zzr = 0;
    private Set zzs = Collections.emptySet();
    private JSONObject zzt = new JSONObject();
    private boolean zzu = true;
    private boolean zzv = true;
    private String zzw = null;
    private String zzx = "";
    private boolean zzy = false;
    private String zzz = "";
    private String zzA = JsonUtils.EMPTY_JSON;
    private int zzB = -1;
    private int zzC = -1;
    private long zzD = 0;

    private final void zzV() {
        c cVar = this.zzd;
        if (cVar != null && !cVar.isDone()) {
            try {
                this.zzd.get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted while waiting for preferences loaded.", e4);
            } catch (CancellationException e9) {
                e = e9;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
            } catch (ExecutionException e10) {
                e = e10;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
            } catch (TimeoutException e11) {
                e = e11;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
            }
        }
    }

    private final void zzW() {
        zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(boolean z8) {
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzv == z8) {
                    return;
                }
                this.zzv = z8;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z8);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
            return;
        }
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(boolean z8) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
            return;
        }
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzy == z8) {
                    return;
                }
                this.zzy = z8;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z8);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(String str) {
        zzV();
        synchronized (this.zza) {
            try {
                if (TextUtils.equals(this.zzw, str)) {
                    return;
                }
                this.zzw = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(long j7) {
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzp == j7) {
                    return;
                }
                this.zzp = j7;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j7);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(int i9) {
        zzV();
        synchronized (this.zza) {
            try {
                this.zzm = i9;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    if (i9 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i9);
                    }
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zziU)).booleanValue()) {
            return;
        }
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzx.equals(str)) {
                    return;
                }
                this.zzx = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjw)).booleanValue()) {
            return;
        }
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzA.equals(str)) {
                    return;
                }
                this.zzA = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_ui_storage", str);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(boolean z8) {
        zzV();
        synchronized (this.zza) {
            try {
                if (z8 == this.zzk) {
                    return;
                }
                this.zzk = z8;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z8);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(boolean z8) {
        zzV();
        synchronized (this.zza) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkw)).longValue();
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z8);
                    this.zzg.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(String str, String str2, boolean z8) {
        zzV();
        synchronized (this.zza) {
            try {
                JSONArray optJSONArray = this.zzt.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i9);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z8 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i9;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z8);
                    jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.zzt.put(str, optJSONArray);
                } catch (JSONException e4) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not update native advanced settings", e4);
                }
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.zzt.toString());
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(int i9) {
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzq == i9) {
                    return;
                }
                this.zzq = i9;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i9);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(int i9) {
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzC == i9) {
                    return;
                }
                this.zzC = i9;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i9);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzN(long j7) {
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzD == j7) {
                    return;
                }
                this.zzD = j7;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j7);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzO(@NonNull String str) {
        zzV();
        synchronized (this.zza) {
            try {
                this.zzl = str;
                if (this.zzg != null) {
                    if (str.equals("-1")) {
                        this.zzg.remove("IABTCF_TCString");
                    } else {
                        this.zzg.putString("IABTCF_TCString", str);
                    }
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z8;
        zzV();
        synchronized (this.zza) {
            z8 = this.zzu;
        }
        return z8;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzQ() {
        boolean z8;
        zzV();
        synchronized (this.zza) {
            z8 = this.zzv;
        }
        return z8;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzR() {
        boolean z8;
        zzV();
        synchronized (this.zza) {
            z8 = this.zzy;
        }
        return z8;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzS() {
        boolean z8;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzav)).booleanValue()) {
            return false;
        }
        zzV();
        synchronized (this.zza) {
            z8 = this.zzk;
        }
        return z8;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzT() {
        zzV();
        synchronized (this.zza) {
            try {
                SharedPreferences sharedPreferences = this.zzf;
                boolean z8 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                    z8 = true;
                }
                return z8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzU(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (this.zza) {
                try {
                    this.zzf = sharedPreferences;
                    this.zzg = edit;
                    if (PlatformVersion.isAtLeastM()) {
                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    }
                    this.zzh = this.zzf.getBoolean("use_https", this.zzh);
                    this.zzu = this.zzf.getBoolean("content_url_opted_out", this.zzu);
                    this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
                    this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
                    this.zzv = this.zzf.getBoolean("content_vertical_opted_out", this.zzv);
                    this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
                    this.zzr = this.zzf.getInt("version_code", this.zzr);
                    if (((Boolean) zzbgc.zzg.zze()).booleanValue() && com.google.android.gms.ads.internal.client.zzba.zzc().zze()) {
                        this.zzn = new zzcbs("", 0L);
                    } else {
                        this.zzn = new zzcbs(this.zzf.getString("app_settings_json", this.zzn.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzn.zza()));
                    }
                    this.zzo = this.zzf.getLong("app_last_background_time_ms", this.zzo);
                    this.zzq = this.zzf.getInt("request_in_session_count", this.zzq);
                    this.zzp = this.zzf.getLong("first_ad_req_time_ms", this.zzp);
                    this.zzs = this.zzf.getStringSet("never_pool_slots", this.zzs);
                    this.zzw = this.zzf.getString("display_cutout", this.zzw);
                    this.zzB = this.zzf.getInt("app_measurement_npa", this.zzB);
                    this.zzC = this.zzf.getInt("sd_app_measure_npa", this.zzC);
                    this.zzD = this.zzf.getLong("sd_app_measure_npa_ts", this.zzD);
                    this.zzx = this.zzf.getString("inspector_info", this.zzx);
                    this.zzy = this.zzf.getBoolean("linked_device", this.zzy);
                    this.zzz = this.zzf.getString("linked_ad_unit", this.zzz);
                    this.zzA = this.zzf.getString("inspector_ui_storage", this.zzA);
                    this.zzl = this.zzf.getString("IABTCF_TCString", this.zzl);
                    this.zzm = this.zzf.getInt("gad_has_consent_for_cookies", this.zzm);
                    try {
                        this.zzt = new JSONObject(this.zzf.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
                    } catch (JSONException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not convert native advanced settings to json object", e4);
                    }
                    zzW();
                } finally {
                }
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i9;
        zzV();
        synchronized (this.zza) {
            i9 = this.zzr;
        }
        return i9;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        zzV();
        return this.zzm;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i9;
        zzV();
        synchronized (this.zza) {
            i9 = this.zzq;
        }
        return i9;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j7;
        zzV();
        synchronized (this.zza) {
            j7 = this.zzo;
        }
        return j7;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j7;
        zzV();
        synchronized (this.zza) {
            j7 = this.zzp;
        }
        return j7;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j7;
        zzV();
        synchronized (this.zza) {
            j7 = this.zzD;
        }
        return j7;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    @Nullable
    public final zzbbm zzg() {
        if (!this.zzb) {
            return null;
        }
        if ((zzP() && zzQ()) || !((Boolean) zzbgb.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.zze == null) {
                    this.zze = new zzbbm();
                }
                this.zze.zze();
                com.google.android.gms.ads.internal.util.client.zzm.zzi("start fetching content...");
                return this.zze;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcbs zzh() {
        zzcbs zzcbsVar;
        zzV();
        synchronized (this.zza) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlJ)).booleanValue() && this.zzn.zzj()) {
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                zzcbsVar = this.zzn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcbsVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcbs zzi() {
        zzcbs zzcbsVar;
        synchronized (this.zza) {
            zzcbsVar = this.zzn;
        }
        return zzcbsVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    @Nullable
    public final String zzj() {
        String str;
        zzV();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    @Nullable
    public final String zzk() {
        String str;
        zzV();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        zzV();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        zzV();
        synchronized (this.zza) {
            str = this.zzw;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn() {
        String str;
        zzV();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        zzV();
        synchronized (this.zza) {
            str = this.zzA;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    @Nullable
    public final String zzp() {
        zzV();
        return this.zzl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzq() {
        JSONObject jSONObject;
        zzV();
        synchronized (this.zza) {
            jSONObject = this.zzt;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(final Context context) {
        synchronized (this.zza) {
            try {
                if (this.zzf != null) {
                    return;
                }
                zzgge zzggeVar = zzcci.zza;
                final String str = AppLovinMediationProvider.ADMOB;
                this.zzd = zzggeVar.zza(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                    public final /* synthetic */ Context zzb;
                    public final /* synthetic */ String zzc = AppLovinMediationProvider.ADMOB;

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzj.this.zzU(this.zzb, this.zzc);
                    }
                });
                this.zzb = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt() {
        zzV();
        synchronized (this.zza) {
            try {
                this.zzt = new JSONObject();
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(long j7) {
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzo == j7) {
                    return;
                }
                this.zzo = j7;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j7);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(String str) {
        zzV();
        synchronized (this.zza) {
            try {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
                if (str != null && !str.equals(this.zzn.zzc())) {
                    this.zzn = new zzcbs(str, currentTimeMillis);
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                        this.zzg.apply();
                    }
                    zzW();
                    Iterator it = this.zzc.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.zzn.zzg(currentTimeMillis);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(int i9) {
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzr == i9) {
                    return;
                }
                this.zzr = i9;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("version_code", i9);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(@Nullable String str) {
        zzV();
        synchronized (this.zza) {
            try {
                if (str.equals(this.zzi)) {
                    return;
                }
                this.zzi = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(boolean z8) {
        zzV();
        synchronized (this.zza) {
            try {
                if (this.zzu == z8) {
                    return;
                }
                this.zzu = z8;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z8);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(@Nullable String str) {
        zzV();
        synchronized (this.zza) {
            try {
                if (str.equals(this.zzj)) {
                    return;
                }
                this.zzj = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.zzg.apply();
                }
                zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
