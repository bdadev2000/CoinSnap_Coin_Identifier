package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfaa implements zzexv {
    private final String zza;

    public zzfaa(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbw.zzg((JSONObject) obj, "pii");
            if (!TextUtils.isEmpty(this.zza)) {
                zzg.put("attok", this.zza);
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting attestation token.", e4);
        }
    }
}
