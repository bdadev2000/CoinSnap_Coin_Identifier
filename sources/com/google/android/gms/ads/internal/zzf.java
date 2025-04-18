package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzboc;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzcam;
import com.google.android.gms.internal.ads.zzdsl;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzfjz;
import com.google.android.gms.internal.ads.zzfka;
import com.google.android.gms.internal.ads.zzfko;
import com.google.android.gms.internal.ads.zzgdp;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzges;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import org.json.JSONObject;
import ua.b;

/* loaded from: classes3.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final /* synthetic */ b zzd(Long l10, zzdsm zzdsmVar, zzfko zzfkoVar, zzfka zzfkaVar, JSONObject jSONObject) throws Exception {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzv.zzp().zzi().zzs(jSONObject.getString("appSettingsJson"));
            if (l10 != null) {
                zzf(zzdsmVar, "cld_s", zzv.zzC().elapsedRealtime() - l10.longValue());
            }
        }
        zzfkaVar.zzg(optBoolean);
        zzfkoVar.zzb(zzfkaVar.zzm());
        return zzgei.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdsm zzdsmVar, String str, long j3) {
        if (zzdsmVar != null) {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzmp)).booleanValue()) {
                zzdsl zza = zzdsmVar.zza();
                zza.zzb("action", "lat_init");
                zza.zzb(str, Long.toString(j3));
                zza.zzf();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, zzfko zzfkoVar, @Nullable zzdsm zzdsmVar, @Nullable Long l10) {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, zzfkoVar, zzdsmVar, l10);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z10, @Nullable zzbzt zzbztVar, String str, @Nullable String str2, @Nullable Runnable runnable, final zzfko zzfkoVar, @Nullable final zzdsm zzdsmVar, @Nullable final Long l10) {
        PackageInfo packageInfo;
        if (zzv.zzC().elapsedRealtime() - this.zzb < DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzv.zzC().elapsedRealtime();
        if (zzbztVar != null && !TextUtils.isEmpty(zzbztVar.zzc())) {
            if (zzv.zzC().currentTimeMillis() - zzbztVar.zza() <= ((Long) zzbe.zzc().zza(zzbcn.zzei)).longValue() && zzbztVar.zzi()) {
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
        final zzfka zza = zzfjz.zza(context, 4);
        zza.zzi();
        zzboi zza2 = zzv.zzg().zza(this.zza, versionInfoParcel, zzfkoVar);
        zzboc zzbocVar = zzbof.zza;
        zzbny zza3 = zza2.zza("google.afma.config.fetchAppSettings", zzbocVar, zzbocVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(MBridgeConstans.APP_ID, str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z10);
            jSONObject.put("pn", context.getPackageName());
            zzbce zzbceVar = zzbcn.zza;
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
            b zzb = zza3.zzb(jSONObject);
            zzgdp zzgdpVar = new zzgdp(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final b zza(Object obj) {
                    return zzf.zzd(l10, zzdsmVar, zzfkoVar, zza, (JSONObject) obj);
                }
            };
            zzges zzgesVar = zzcaj.zzf;
            b zzn = zzgei.zzn(zzb, zzgdpVar, zzgesVar);
            if (runnable != null) {
                zzb.addListener(runnable, zzgesVar);
            }
            if (l10 != null) {
                zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzf.zzf(zzdsmVar, "cld_r", zzv.zzC().elapsedRealtime() - l10.longValue());
                    }
                }, zzgesVar);
            }
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzhr)).booleanValue()) {
                zzcam.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzcam.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error requesting application settings", e2);
            zza.zzh(e2);
            zza.zzg(false);
            zzfkoVar.zzb(zza.zzm());
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, zzbzt zzbztVar, zzfko zzfkoVar) {
        zzb(context, versionInfoParcel, false, zzbztVar, zzbztVar != null ? zzbztVar.zzb() : null, str, null, zzfkoVar, null, null);
    }
}
