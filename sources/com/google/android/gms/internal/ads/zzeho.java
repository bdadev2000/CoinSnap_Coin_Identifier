package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeho implements zzefd {
    private final zzdqd zza;

    public zzeho(zzdqd zzdqdVar) {
        this.zza = zzdqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    @Nullable
    public final zzefe zza(String str, JSONObject jSONObject) throws zzffv {
        return new zzefe(this.zza.zzc(str, jSONObject), new zzegx(), str);
    }
}
