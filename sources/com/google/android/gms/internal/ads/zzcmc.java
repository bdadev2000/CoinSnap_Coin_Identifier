package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcmc implements zzcls {
    private final zzdvk zza;

    public zzcmc(zzdvk zzdvkVar) {
        this.zza = zzdvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcls
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziP)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
