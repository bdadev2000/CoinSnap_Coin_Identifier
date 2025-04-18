package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeyt implements zzevy {
    private final Bundle zza;

    public zzeyt(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbr.zzg(com.google.android.gms.ads.internal.util.zzbr.zzg(jSONObject, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(this.zza));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
