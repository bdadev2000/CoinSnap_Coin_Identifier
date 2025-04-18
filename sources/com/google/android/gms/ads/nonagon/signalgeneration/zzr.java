package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdex;
import com.google.android.gms.internal.ads.zzdsh;

/* loaded from: classes3.dex */
public final class zzr implements zzdex {
    private final zzdsh zza;
    private final zzq zzb;
    private final String zzc;

    public zzr(zzdsh zzdshVar, zzq zzqVar, String str) {
        this.zza = zzdshVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zze(@Nullable zzbd zzbdVar) {
        if (zzbdVar == null) {
            return;
        }
        this.zzb.zzd(this.zzc, zzbdVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(@Nullable String str) {
    }
}
