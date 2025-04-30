package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbke implements zzblp {
    private final zzbkf zza;

    public zzbke(zzbkf zzbkfVar) {
        this.zza = zzbkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
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
                bundle = com.google.android.gms.ads.internal.util.zzbw.zza(new JSONObject((String) map.get("info")));
            } catch (JSONException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to convert ad metadata to JSON.", e4);
            }
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to convert ad metadata to Bundle.");
        } else {
            this.zza.zza(str, bundle);
        }
    }
}
