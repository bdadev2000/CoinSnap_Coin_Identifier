package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzezp implements zzexv {
    private final JSONObject zza;

    public zzezp(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzexv
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject zzg = com.google.android.gms.ads.internal.util.zzbw.zzg((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.zza;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzg.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting app indexing json.");
        }
    }
}
