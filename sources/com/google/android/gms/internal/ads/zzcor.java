package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcor {
    private final Map zza;
    private final Map zzb;

    public zzcor(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfhf zzfhfVar) throws Exception {
        for (zzfhd zzfhdVar : zzfhfVar.zzb.zzc) {
            if (this.zza.containsKey(zzfhdVar.zza)) {
                ((zzcou) this.zza.get(zzfhdVar.zza)).zza(zzfhdVar.zzb);
            } else if (this.zzb.containsKey(zzfhdVar.zza)) {
                zzcot zzcotVar = (zzcot) this.zzb.get(zzfhdVar.zza);
                JSONObject jSONObject = zzfhdVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcotVar.zza(hashMap);
            }
        }
    }
}
