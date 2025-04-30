package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class zzbes {
    private final String zza = (String) zzbge.zzb.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbes(Context context, String str) {
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
        com.google.android.gms.ads.internal.zzu.zzp();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzt.zzr());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, packageName);
        com.google.android.gms.ads.internal.zzu.zzp();
        if (true == com.google.android.gms.ads.internal.util.zzt.zzE(context)) {
            obj = "1";
        } else {
            obj = "0";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future zzb = com.google.android.gms.ads.internal.zzu.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbxz) zzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbxz) zzb.get()).zzl));
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlp)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzu.zzp();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzt.zzB(context) ? "0" : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzju)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzck)).booleanValue() && !zzfyv.zzd(com.google.android.gms.ads.internal.zzu.zzo().zzn())) {
                this.zzb.put("plugin", com.google.android.gms.ads.internal.zzu.zzo().zzn());
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
