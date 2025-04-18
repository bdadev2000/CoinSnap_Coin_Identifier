package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzejq implements zzefd {
    private final Map zza = new HashMap();
    private final zzdqd zzb;

    public zzejq(zzdqd zzdqdVar) {
        this.zzb = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    @Nullable
    public final zzefe zza(String str, JSONObject jSONObject) throws zzffv {
        zzefe zzefeVar;
        synchronized (this) {
            zzefeVar = (zzefe) this.zza.get(str);
            if (zzefeVar == null) {
                zzefeVar = new zzefe(this.zzb.zzc(str, jSONObject), new zzegy(), str);
                this.zza.put(str, zzefeVar);
            }
        }
        return zzefeVar;
    }
}
