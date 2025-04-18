package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzcml implements zzcls {
    private final zzbym zza;

    public zzcml(zzbym zzbymVar) {
        this.zza = zzbymVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzbym] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzcls
    public final void zza(JSONObject jSONObject) {
        ?? r42;
        long optLong = jSONObject.optLong(CampaignEx.JSON_KEY_TIMESTAMP);
        if (jSONObject.optBoolean("npa_reset")) {
            r42 = -1;
        } else {
            r42 = jSONObject.optBoolean("npa");
        }
        this.zza.zzb(r42, optLong);
    }
}
