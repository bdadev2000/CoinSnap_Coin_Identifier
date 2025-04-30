package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzfbf implements zzexw {
    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* synthetic */ int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzfbg
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
