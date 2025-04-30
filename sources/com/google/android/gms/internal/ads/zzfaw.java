package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfaw implements zzexv {
    private final Bundle zza;

    public zzfaw(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbw.zzg(com.google.android.gms.ads.internal.util.zzbw.zzg(jSONObject, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(this.zza));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
