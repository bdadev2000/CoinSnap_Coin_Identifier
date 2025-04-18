package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbig implements zzbjr {
    private final zzbih zza;

    public zzbig(zzbih zzbihVar) {
        this.zza = zzbihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjr
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = com.google.android.gms.ads.internal.util.zzbr.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to convert ad metadata to JSON.", e2);
            }
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}
