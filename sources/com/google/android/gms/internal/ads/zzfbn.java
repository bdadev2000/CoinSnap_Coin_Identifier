package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfbn implements zzexv {
    private final String zza;

    public zzfbn(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (!TextUtils.isEmpty(this.zza)) {
                com.google.android.gms.ads.internal.util.zzbw.zzg(jSONObject, "pii").put("adsid", this.zza);
            }
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed putting trustless token.", e4);
        }
    }
}
