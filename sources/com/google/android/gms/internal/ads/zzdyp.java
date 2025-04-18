package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
final class zzdyp implements zzczj {
    private final Context zza;
    private final zzbyv zzb;

    public zzdyp(Context context, zzbyv zzbyvVar) {
        this.zza = context;
        this.zzb = zzbyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        if (!TextUtils.isEmpty(zzfffVar.zzb.zzb.zze)) {
            this.zzb.zzm(this.zza, zzfffVar.zza.zza.zzd);
            this.zzb.zzi(this.zza, zzfffVar.zzb.zzb.zze);
        }
    }
}
