package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzexx implements zzevy {

    @Nullable
    final String zza;
    final int zzb;

    public zzexx(@Nullable String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            try {
                JSONObject zzg = com.google.android.gms.ads.internal.util.zzbr.zzg(jSONObject, "pii");
                zzg.put("pvid", this.zza);
                zzg.put("pvid_s", this.zzb);
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e2);
            }
        }
    }
}
