package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfai implements zzexw {
    private final JSONObject zza;

    public zzfai(Context context) {
        this.zza = zzbxq.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlT)).booleanValue()) {
            return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzfag
                @Override // com.google.android.gms.internal.ads.zzexv
                public final void zzj(Object obj) {
                }
            });
        }
        return zzgft.zzh(new zzexv() { // from class: com.google.android.gms.internal.ads.zzfah
            @Override // com.google.android.gms.internal.ads.zzexv
            public final void zzj(Object obj) {
                zzfai.this.zzc((JSONObject) obj);
            }
        });
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
