package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class zzus extends zzcc {
    private final zzbc zzb;

    public zzus(zzbc zzbcVar) {
        this.zzb = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zza(Object obj) {
        return obj == zzur.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzca zzd(int i2, zzca zzcaVar, boolean z2) {
        zzcaVar.zzi(z2 ? 0 : null, z2 ? zzur.zzc : null, 0, -9223372036854775807L, 0L, zzb.zza, true);
        return zzcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final zzcb zze(int i2, zzcb zzcbVar, long j2) {
        zzcbVar.zza(zzcb.zza, this.zzb, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        zzcbVar.zzk = true;
        return zzcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final Object zzf(int i2) {
        return zzur.zzc;
    }
}
