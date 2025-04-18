package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzbts {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbts(boolean z2, String str, boolean z3) {
        this.zza = z2;
        this.zzb = str;
        this.zzc = z3;
    }

    @Nullable
    public static zzbts zza(JSONObject jSONObject) {
        return new zzbts(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
