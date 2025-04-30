package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzcpn implements zzcou {
    private final zzcak zza;

    public zzcpn(zzcak zzcakVar) {
        this.zza = zzcakVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzcak] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzcou
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
