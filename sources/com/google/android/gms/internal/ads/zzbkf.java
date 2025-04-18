package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbkf implements zzbkg {
    final /* synthetic */ zzcao zza;

    public zzbkf(zzbkh zzbkhVar, zzcao zzcaoVar) {
        this.zza = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zza(@Nullable String str) {
        this.zza.zzd(new zzbnx(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
