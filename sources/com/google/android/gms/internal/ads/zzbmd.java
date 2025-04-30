package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbmd implements zzbme {
    final /* synthetic */ zzccn zza;

    public zzbmd(zzbmf zzbmfVar, zzccn zzccnVar) {
        this.zza = zzccnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zza(@Nullable String str) {
        this.zza.zzd(new zzbpw(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
