package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeix implements zzegm {
    private final zzdru zza;

    public zzeix(zzdru zzdruVar) {
        this.zza = zzdruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegm
    @Nullable
    public final zzegn zza(String str, JSONObject jSONObject) throws zzfhj {
        return new zzegn(this.zza.zzc(str, jSONObject), new zzeig(), str);
    }
}
