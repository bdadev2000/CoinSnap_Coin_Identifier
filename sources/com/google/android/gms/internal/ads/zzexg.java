package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzexg implements zzevy {
    private final String zza;

    public zzexg(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}
