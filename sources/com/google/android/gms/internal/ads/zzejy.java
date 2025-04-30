package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzejy implements zzehn {
    private final zzdst zza;

    public zzejy(zzdst zzdstVar) {
        this.zza = zzdstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehn
    @Nullable
    public final zzeho zza(String str, JSONObject jSONObject) throws zzfhv {
        return new zzeho(this.zza.zzc(str, jSONObject), new zzejh(), str);
    }
}
