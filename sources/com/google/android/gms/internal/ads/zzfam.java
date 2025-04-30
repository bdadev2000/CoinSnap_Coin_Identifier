package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfam implements zzexv {
    private final String zza;
    private final String zzb;

    public zzfam(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbw.zzg((JSONObject) obj, "pii");
            zzg.put("doritos", this.zza);
            zzg.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting doritos string.");
        }
    }
}
