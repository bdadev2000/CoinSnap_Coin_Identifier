package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class zzbcq {
    private final String zza = (String) zzbeh.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbcq(Context context, String str) {
        String packageName;
        Object obj;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzv.zzq();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzr());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, packageName);
        com.google.android.gms.ads.internal.zzv.zzq();
        if (true != com.google.android.gms.ads.internal.util.zzs.zzE(context)) {
            obj = "0";
        } else {
            obj = "1";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future zzb = com.google.android.gms.ads.internal.zzv.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbwb) zzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbwb) zzb.get()).zzk));
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkX)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzv.zzq();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzB(context) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziZ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcs)).booleanValue() && !zzfxf.zzd(com.google.android.gms.ads.internal.zzv.zzp().zzn())) {
                this.zzb.put("plugin", com.google.android.gms.ads.internal.zzv.zzp().zzn());
            }
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
