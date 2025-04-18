package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbtm {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbtm(boolean z10, String str, boolean z11) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = z11;
    }

    @Nullable
    public static zzbtm zza(JSONObject jSONObject) {
        return new zzbtm(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
