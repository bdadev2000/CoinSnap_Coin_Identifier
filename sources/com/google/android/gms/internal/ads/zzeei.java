package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeei {
    private final zzbxo zza;

    public zzeei(zzbxo zzbxoVar) {
        this.zza = zzbxoVar;
    }

    public static void zza(Map map, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("pii");
            if (optJSONObject != null) {
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                    return;
                }
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
        }
    }

    public final void zzb() {
        f4.c zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhP)).booleanValue()) {
            zzccl.zzb(zza, "persistFlags");
        } else {
            zzccl.zza(zza, "persistFlags");
        }
    }
}
