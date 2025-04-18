package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzffr {
    private final JSONObject zza;

    public zzffr(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Nullable
    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        return this.zza.optBoolean((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzfg), true);
    }

    public final int zzc() {
        int optInt = this.zza.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
