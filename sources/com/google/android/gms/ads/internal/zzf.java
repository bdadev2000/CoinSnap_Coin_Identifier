package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbqb;
import com.google.android.gms.internal.ads.zzbqe;
import com.google.android.gms.internal.ads.zzbqh;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzgge;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import f4.c;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final /* synthetic */ c zzd(Long l, zzdvc zzdvcVar, zzfmq zzfmqVar, zzfmc zzfmcVar, JSONObject jSONObject) throws Exception {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzu.zzo().zzi().zzv(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdvcVar, "cld_s", zzu.zzB().elapsedRealtime() - l.longValue());
            }
        }
        zzfmcVar.zzh(optBoolean);
        zzfmqVar.zzb(zzfmcVar.zzn());
        return zzgft.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdvc zzdvcVar, String str, long j7) {
        if (zzdvcVar != null) {
            if (((Boolean) zzba.zzc().zza(zzbep.zzmD)).booleanValue()) {
                zzdvb zza = zzdvcVar.zza();
                zza.zzb("action", "lat_init");
                zza.zzb(str, Long.toString(j7));
                zza.zzf();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, zzfmq zzfmqVar, @Nullable zzdvc zzdvcVar, @Nullable Long l) {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, zzfmqVar, zzdvcVar, l);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z8, @Nullable zzcbs zzcbsVar, String str, @Nullable String str2, @Nullable Runnable runnable, final zzfmq zzfmqVar, @Nullable final zzdvc zzdvcVar, @Nullable final Long l) {
        PackageInfo packageInfo;
        if (zzu.zzB().elapsedRealtime() - this.zzb < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzu.zzB().elapsedRealtime();
        if (zzcbsVar != null && !TextUtils.isEmpty(zzcbsVar.zzc())) {
            if (zzu.zzB().currentTimeMillis() - zzcbsVar.zza() <= ((Long) zzba.zzc().zza(zzbep.zzed)).longValue() && zzcbsVar.zzi()) {
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
        final zzfmc zza = zzfmb.zza(context, zzfmu.CUI_NAME_SDKINIT_CLD);
        zza.zzj();
        zzbqh zza2 = zzu.zzf().zza(this.zza, versionInfoParcel, zzfmqVar);
        zzbqb zzbqbVar = zzbqe.zza;
        zzbpx zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzbqbVar, zzbqbVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(MBridgeConstans.APP_ID, str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z8);
            jSONObject.put("pn", context.getPackageName());
            zzbeg zzbegVar = zzbep.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zza().zza()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            c zzb = zza3.zzb(jSONObject);
            zzgfa zzgfaVar = new zzgfa() { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzgfa
                public final c zza(Object obj) {
                    return zzf.zzd(l, zzdvcVar, zzfmqVar, zza, (JSONObject) obj);
                }
            };
            zzgge zzggeVar = zzcci.zzf;
            c zzn = zzgft.zzn(zzb, zzgfaVar, zzggeVar);
            if (runnable != null) {
                zzb.addListener(runnable, zzggeVar);
            }
            if (l != null) {
                zzb.addListener(new Runnable() { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzf.zzf(zzdvcVar, "cld_r", zzu.zzB().elapsedRealtime() - l.longValue());
                    }
                }, zzggeVar);
            }
            if (((Boolean) zzba.zzc().zza(zzbep.zzhP)).booleanValue()) {
                zzccl.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzccl.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error requesting application settings", e4);
            zza.zzi(e4);
            zza.zzh(false);
            zzfmqVar.zzb(zza.zzn());
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, zzcbs zzcbsVar, zzfmq zzfmqVar) {
        String str2;
        if (zzcbsVar != null) {
            str2 = zzcbsVar.zzb();
        } else {
            str2 = null;
        }
        zzb(context, versionInfoParcel, false, zzcbsVar, str2, str, null, zzfmqVar, null, null);
    }
}
