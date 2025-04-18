package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzezr implements zzevy {
    private final Map zza;

    public zzezr(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzbc.zzb().zzj(this.zza));
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not encode video decoder properties: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
