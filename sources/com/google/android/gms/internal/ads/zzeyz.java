package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeyz implements zzexv {
    private final String zza;

    public zzeyz(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.zza);
        } catch (JSONException e4) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e4);
        }
    }
}
