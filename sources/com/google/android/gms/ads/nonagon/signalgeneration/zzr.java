package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdgm;
import com.google.android.gms.internal.ads.zzdty;

/* loaded from: classes4.dex */
public final class zzr implements zzdgm {
    private final zzdty zza;
    private final zzq zzb;
    private final String zzc;

    @VisibleForTesting
    public zzr(zzdty zzdtyVar, zzq zzqVar, String str) {
        this.zza = zzdtyVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final void zze(@Nullable zzbd zzbdVar) {
        if (zzbdVar == null) {
            return;
        }
        this.zzb.zzd(this.zzc, zzbdVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdgm
    public final void zzf(@Nullable String str) {
    }
}
