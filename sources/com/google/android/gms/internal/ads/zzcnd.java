package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcnd {
    private final Map zza;
    private final Map zzb;

    public zzcnd(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfgt zzfgtVar) throws Exception {
        for (zzfgr zzfgrVar : zzfgtVar.zzb.zzc) {
            if (this.zza.containsKey(zzfgrVar.zza)) {
                ((zzcng) this.zza.get(zzfgrVar.zza)).zza(zzfgrVar.zzb);
            } else if (this.zzb.containsKey(zzfgrVar.zza)) {
                zzcnf zzcnfVar = (zzcnf) this.zzb.get(zzfgrVar.zza);
                JSONObject jSONObject = zzfgrVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcnfVar.zza(hashMap);
            }
        }
    }
}
