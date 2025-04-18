package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcnq implements zzcng {
    private final zzdxb zza;

    public zzcnq(zzdxb zzdxbVar) {
        this.zza = zzdxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcng
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziN)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
