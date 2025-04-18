package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class zzdty {
    private final ConcurrentHashMap zza;
    private final zzcah zzb;
    private final zzfhc zzc;
    private final String zzd;
    private final String zze;
    private final com.google.android.gms.ads.internal.zzj zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdty(Context context, zzdui zzduiVar, zzcah zzcahVar, zzfhc zzfhcVar, String str, String str2, com.google.android.gms.ads.internal.zzj zzjVar) {
        ActivityManager.MemoryInfo zzc;
        ConcurrentHashMap zzc2 = zzduiVar.zzc();
        this.zza = zzc2;
        this.zzb = zzcahVar;
        this.zzc = zzfhcVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzjVar;
        this.zzh = context;
        zzc2.put("ad_format", str2.toUpperCase(Locale.ROOT));
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjc)).booleanValue();
        String str3 = AppEventsConstants.EVENT_PARAM_VALUE_YES;
        if (booleanValue) {
            int zzj = zzjVar.zzj();
            int i2 = zzj - 1;
            if (zzj == 0) {
                throw null;
            }
            zzc2.put("asv", i2 != 0 ? i2 != 1 ? "na" : "2" : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzu.zzo().zzb()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzck)).booleanValue() && (zzc = com.google.android.gms.ads.internal.util.client.zzf.zzc(context)) != null) {
                zzc("mem_avl", String.valueOf(zzc.availMem));
                zzc("mem_tt", String.valueOf(zzc.totalMem));
                zzc("low_m", true != zzc.lowMemory ? AppEventsConstants.EVENT_PARAM_VALUE_NO : str3);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgK)).booleanValue()) {
            int zzf = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(zzfhcVar) - 1;
            if (zzf == 0) {
                zzc2.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
                zzc2.put("scar", "false");
                return;
            }
            if (zzf == 1) {
                zzc2.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
                zzc2.put("se", "query_g");
            } else if (zzf == 2) {
                zzc2.put("se", "r_adinfo");
            } else if (zzf != 3) {
                zzc2.put("se", "r_both");
            } else {
                zzc2.put("se", "r_adstring");
            }
            zzc2.put("scar", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            zzc("ragent", zzfhcVar.zzd.zzp);
            zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzfhcVar.zzd)));
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final void zzd(zzfgt zzfgtVar) {
        if (!zzfgtVar.zzb.zza.isEmpty()) {
            zzfgh zzfghVar = (zzfgh) zzfgtVar.zzb.zza.get(0);
            zzc("ad_format", zzfgh.zza(zzfghVar.zzb));
            if (zzfghVar.zzb == 6) {
                this.zza.put("as", true != this.zzb.zzm() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
            }
        }
        zzc("gqi", zzfgtVar.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey(ImpressionLog.M)) {
            zzc("network_coarse", Integer.toString(bundle.getInt(ImpressionLog.M)));
        }
        if (bundle.containsKey("gnt")) {
            zzc("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
