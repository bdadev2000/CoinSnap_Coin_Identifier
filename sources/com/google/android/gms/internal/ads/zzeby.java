package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeby {
    private final zzbvr zza;

    public zzeby(zzbvr zzbvrVar) {
        this.zza = zzbvrVar;
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
        ua.b zza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhr)).booleanValue()) {
            zzcam.zzb(zza, "persistFlags");
        } else {
            zzcam.zza(zza, "persistFlags");
        }
    }
}
