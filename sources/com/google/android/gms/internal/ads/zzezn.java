package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzezn implements zzevy {
    private final String zza;

    public zzezn(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                com.google.android.gms.ads.internal.util.zzbr.zzg(jSONObject, "pii").put("adsid", this.zza);
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed putting trustless token.", e2);
        }
    }
}
