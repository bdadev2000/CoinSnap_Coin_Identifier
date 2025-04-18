package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzclp {
    private final Map zza;
    private final Map zzb;

    public zzclp(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfff zzfffVar) throws Exception {
        for (zzffd zzffdVar : zzfffVar.zzb.zzc) {
            if (this.zza.containsKey(zzffdVar.zza)) {
                ((zzcls) this.zza.get(zzffdVar.zza)).zza(zzffdVar.zzb);
            } else if (this.zzb.containsKey(zzffdVar.zza)) {
                zzclr zzclrVar = (zzclr) this.zzb.get(zzffdVar.zza);
                JSONObject jSONObject = zzffdVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzclrVar.zza(hashMap);
            }
        }
    }
}
