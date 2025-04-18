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
import com.google.android.gms.internal.ads.zzazl;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbef;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzges;
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
import ua.b;

/* loaded from: classes3.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private b zzd;

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
    private zzazl zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = "-1";
    private int zzm = -1;
    private zzbzt zzn = new zzbzt("", 0);
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

    private final void zzR() {
        b bVar = this.zzd;
        if (bVar != null && !bVar.isDone()) {
            try {
                this.zzd.get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted while waiting for preferences loaded.", e2);
            } catch (CancellationException e10) {
                e = e10;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
            } catch (ExecutionException e11) {
                e = e11;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
            } catch (TimeoutException e12) {
                e = e12;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to initialize AdSharedPreferenceManager.", e);
            }
        }
    }

    private final void zzS() {
        zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(int i10) {
        zzR();
        synchronized (this.zza) {
            this.zzm = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i10 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i10);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziz)).booleanValue()) {
            return;
        }
        zzR();
        synchronized (this.zza) {
            if (this.zzx.equals(str)) {
                return;
            }
            this.zzx = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("inspector_info", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjb)).booleanValue()) {
            return;
        }
        zzR();
        synchronized (this.zza) {
            if (this.zzA.equals(str)) {
                return;
            }
            this.zzA = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("inspector_ui_storage", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (z10 == this.zzk) {
                return;
            }
            this.zzk = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(boolean z10) {
        zzR();
        synchronized (this.zza) {
            long currentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzke)).longValue();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                this.zzg.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2, boolean z10) {
        zzR();
        synchronized (this.zza) {
            JSONArray optJSONArray = this.zzt.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z10 && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i10;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzt.put(str, optJSONArray);
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not update native advanced settings", e2);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzt.toString());
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzq == i10) {
                return;
            }
            this.zzq = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzC == i10) {
                return;
            }
            this.zzC = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(long j3) {
        zzR();
        synchronized (this.zza) {
            if (this.zzD == j3) {
                return;
            }
            this.zzD = j3;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j3);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(@NonNull String str) {
        zzR();
        synchronized (this.zza) {
            this.zzl = str;
            if (this.zzg != null) {
                if (str.equals("-1")) {
                    this.zzg.remove("IABTCF_TCString");
                } else {
                    this.zzg.putString("IABTCF_TCString", str);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzK() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzu;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzL() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzv;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z10;
        zzR();
        synchronized (this.zza) {
            z10 = this.zzy;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z10;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaE)).booleanValue()) {
            return false;
        }
        zzR();
        synchronized (this.zza) {
            z10 = this.zzk;
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        zzR();
        synchronized (this.zza) {
            SharedPreferences sharedPreferences = this.zzf;
            boolean z10 = false;
            if (sharedPreferences == null) {
                return false;
            }
            if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                return false;
            }
            if (this.zzf.getBoolean("is_topics_ad_personalization_allowed", false) && !this.zzk) {
                z10 = true;
            }
            return z10;
        }
    }

    @Nullable
    public final zzazl zzP() {
        if (!this.zzb) {
            return null;
        }
        if ((zzK() && zzL()) || !((Boolean) zzbee.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new zzazl();
            }
            this.zze.zzd();
            com.google.android.gms.ads.internal.util.client.zzm.zzi("start fetching content...");
            return this.zze;
        }
    }

    public final /* synthetic */ void zzQ(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (this.zza) {
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
                if (((Boolean) zzbef.zzg.zze()).booleanValue() && com.google.android.gms.ads.internal.client.zzbe.zzc().zze()) {
                    this.zzn = new zzbzt("", 0L);
                } else {
                    this.zzn = new zzbzt(this.zzf.getString("app_settings_json", this.zzn.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzn.zza()));
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
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not convert native advanced settings to json object", e2);
                }
                zzS();
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzr;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        zzR();
        return this.zzm;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i10;
        zzR();
        synchronized (this.zza) {
            i10 = this.zzq;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j3;
        zzR();
        synchronized (this.zza) {
            j3 = this.zzo;
        }
        return j3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j3;
        zzR();
        synchronized (this.zza) {
            j3 = this.zzp;
        }
        return j3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j3;
        zzR();
        synchronized (this.zza) {
            j3 = this.zzD;
        }
        return j3;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbzt zzg() {
        zzbzt zzbztVar;
        zzR();
        synchronized (this.zza) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlq)).booleanValue() && this.zzn.zzj()) {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
            zzbztVar = this.zzn;
        }
        return zzbztVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbzt zzh() {
        zzbzt zzbztVar;
        synchronized (this.zza) {
            zzbztVar = this.zzn;
        }
        return zzbztVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzi() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzw;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzA;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    @Nullable
    public final String zzm() {
        zzR();
        return this.zzl;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzn() {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzt;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzo(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzp(final Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            zzges zzgesVar = zzcaj.zza;
            final String str = AppLovinMediationProvider.ADMOB;
            this.zzd = zzgesVar.zza(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = AppLovinMediationProvider.ADMOB;

                @Override // java.lang.Runnable
                public final void run() {
                    zzj.this.zzQ(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq() {
        zzR();
        synchronized (this.zza) {
            this.zzt = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(long j3) {
        zzR();
        synchronized (this.zza) {
            if (this.zzo == j3) {
                return;
            }
            this.zzo = j3;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j3);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs(String str) {
        zzR();
        synchronized (this.zza) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (str != null && !str.equals(this.zzn.zzc())) {
                this.zzn = new zzbzt(str, currentTimeMillis);
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzg.apply();
                }
                zzS();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                return;
            }
            this.zzn.zzg(currentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(int i10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzr == i10) {
                return;
            }
            this.zzr = i10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzu == z10) {
                return;
            }
            this.zzu = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(boolean z10) {
        zzR();
        synchronized (this.zza) {
            if (this.zzv == z10) {
                return;
            }
            this.zzv = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue()) {
            return;
        }
        zzR();
        synchronized (this.zza) {
            if (this.zzz.equals(str)) {
                return;
            }
            this.zzz = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("linked_ad_unit", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue()) {
            return;
        }
        zzR();
        synchronized (this.zza) {
            if (this.zzy == z10) {
                return;
            }
            this.zzy = z10;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("linked_device", z10);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        zzR();
        synchronized (this.zza) {
            if (TextUtils.equals(this.zzw, str)) {
                return;
            }
            this.zzw = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(long j3) {
        zzR();
        synchronized (this.zza) {
            if (this.zzp == j3) {
                return;
            }
            this.zzp = j3;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j3);
                this.zzg.apply();
            }
            zzS();
        }
    }
}
