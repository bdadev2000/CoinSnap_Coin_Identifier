package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeyb implements zzevy {
    private final JSONObject zza;

    public zzeyb(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Unable to get cache_state");
        }
    }
}
