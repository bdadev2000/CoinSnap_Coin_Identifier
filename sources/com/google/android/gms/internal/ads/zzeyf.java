package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeyf implements zzevz {
    private final JSONObject zza;

    public zzeyf(Context context) {
        this.zza = zzbvt.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlF)).booleanValue()) {
            return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeyd
                @Override // com.google.android.gms.internal.ads.zzevy
                public final void zzj(Object obj) {
                }
            });
        }
        return zzgei.zzh(new zzevy() { // from class: com.google.android.gms.internal.ads.zzeye
            @Override // com.google.android.gms.internal.ads.zzevy
            public final void zzj(Object obj) {
                zzeyf.this.zzc((JSONObject) obj);
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
