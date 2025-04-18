package com.google.android.gms.internal.ads;

import com.google.android.gms.common.GooglePlayServicesUtilLight;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzezf implements zzhfx {
    public static zzevz zza() {
        return new zzevz() { // from class: com.google.android.gms.internal.ads.zzezc
            @Override // com.google.android.gms.internal.ads.zzevz
            public final /* synthetic */ int zza() {
                return 0;
            }

            @Override // com.google.android.gms.internal.ads.zzevz
            public final ua.b zzb() {
                return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzezd
                    @Override // com.google.android.gms.internal.ads.zzevy
                    public final void zzj(Object obj) {
                        try {
                            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
