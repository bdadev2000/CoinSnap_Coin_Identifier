package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbvm {
    public final boolean zza;
    public final String zzb;

    public zzbvm(boolean z8, String str) {
        this.zza = z8;
        this.zzb = str;
    }

    @Nullable
    public static zzbvm zza(JSONObject jSONObject) {
        return new zzbvm(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
