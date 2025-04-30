package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzema implements zzehn {
    private final Map zza = new HashMap();
    private final zzdst zzb;

    public zzema(zzdst zzdstVar) {
        this.zzb = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehn
    @Nullable
    public final zzeho zza(String str, JSONObject jSONObject) throws zzfhv {
        zzeho zzehoVar;
        synchronized (this) {
            try {
                zzehoVar = (zzeho) this.zza.get(str);
                if (zzehoVar == null) {
                    zzehoVar = new zzeho(this.zzb.zzc(str, jSONObject), new zzeji(), str);
                    this.zza.put(str, zzehoVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzehoVar;
    }
}
