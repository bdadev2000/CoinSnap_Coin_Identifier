package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzduc;
import com.google.android.gms.internal.ads.zzdud;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzgev;
import com.google.android.gms.internal.ads.zzgfo;
import com.google.android.gms.internal.ads.zzgfz;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final /* synthetic */ ListenableFuture zzd(Long l2, zzdud zzdudVar, zzfmd zzfmdVar, zzflp zzflpVar, JSONObject jSONObject) throws Exception {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzu.zzo().zzi().zzv(jSONObject.getString("appSettingsJson"));
            if (l2 != null) {
                zzf(zzdudVar, "cld_s", zzu.zzB().elapsedRealtime() - l2.longValue());
            }
        }
        zzflpVar.zzg(optBoolean);
        zzfmdVar.zzb(zzflpVar.zzm());
        return zzgfo.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdud zzdudVar, String str, long j2) {
        if (zzdudVar != null) {
            if (((Boolean) zzbe.zzc().zza(zzbcv.zzmk)).booleanValue()) {
                zzduc zza = zzdudVar.zza();
                zza.zzb("action", "lat_init");
                zza.zzb(str, Long.toString(j2));
                zza.zzf();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, zzfmd zzfmdVar, @Nullable zzdud zzdudVar, @Nullable Long l2) {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, zzfmdVar, zzdudVar, l2);
    }

    @VisibleForTesting
    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z2, @Nullable zzbzx zzbzxVar, String str, @Nullable String str2, @Nullable Runnable runnable, final zzfmd zzfmdVar, @Nullable final zzdud zzdudVar, @Nullable final Long l2) {
        PackageInfo packageInfo;
        if (zzu.zzB().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzu.zzB().elapsedRealtime();
        if (zzbzxVar != null && !TextUtils.isEmpty(zzbzxVar.zzc())) {
            if (zzu.zzB().currentTimeMillis() - zzbzxVar.zza() <= ((Long) zzbe.zzc().zza(zzbcv.zzeb)).longValue() && zzbzxVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzflp zza = zzflo.zza(context, 4);
        zza.zzi();
        zzbon zza2 = zzu.zzf().zza(this.zza, versionInfoParcel, zzfmdVar);
        zzboh zzbohVar = zzbok.zza;
        zzbod zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzbohVar, zzbohVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z2);
            jSONObject.put("pn", context.getPackageName());
            zzbcm zzbcmVar = zzbcv.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbe.zza().zza()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            ListenableFuture zzb = zza3.zzb(jSONObject);
            zzgev zzgevVar = new zzgev(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzgev
                public final ListenableFuture zza(Object obj) {
                    return zzf.zzd(l2, zzdudVar, zzfmdVar, zza, (JSONObject) obj);
                }
            };
            zzgfz zzgfzVar = zzcan.zzf;
            ListenableFuture zzn = zzgfo.zzn(zzb, zzgevVar, zzgfzVar);
            if (runnable != null) {
                zzb.addListener(runnable, zzgfzVar);
            }
            if (l2 != null) {
                zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzf.zzf(zzdudVar, "cld_r", zzu.zzB().elapsedRealtime() - l2.longValue());
                    }
                }, zzgfzVar);
            }
            if (((Boolean) zzbe.zzc().zza(zzbcv.zzhp)).booleanValue()) {
                zzcaq.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcaq.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error requesting application settings", e);
            zza.zzh(e);
            zza.zzg(false);
            zzfmdVar.zzb(zza.zzm());
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, zzbzx zzbzxVar, zzfmd zzfmdVar) {
        zzb(context, versionInfoParcel, false, zzbzxVar, zzbzxVar != null ? zzbzxVar.zzb() : null, str, null, zzfmdVar, null, null);
    }
}
