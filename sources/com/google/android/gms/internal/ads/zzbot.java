package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbot implements zzbkg {
    private final zzcao zza;

    public zzbot(zzbou zzbouVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zza(@Nullable String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbnx());
            } else {
                this.zza.zzd(new zzbnx(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.zza.zzd(e2);
        }
    }
}
