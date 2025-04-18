package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbkk implements zzbkl {
    final /* synthetic */ zzcas zza;

    public zzbkk(zzbkm zzbkmVar, zzcas zzcasVar) {
        this.zza = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zza(@Nullable String str) {
        this.zza.zzd(new zzboc(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
