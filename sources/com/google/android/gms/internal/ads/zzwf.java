package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzwf implements zzyu {
    public long zza;
    public long zzb;

    @Nullable
    public zzyt zzc;

    @Nullable
    public zzwf zzd;

    public zzwf(long j2, int i2) {
        zze(j2, 65536);
    }

    public final int zza(long j2) {
        long j3 = j2 - this.zza;
        int i2 = this.zzc.zzb;
        return (int) j3;
    }

    public final zzwf zzb() {
        this.zzc = null;
        zzwf zzwfVar = this.zzd;
        this.zzd = null;
        return zzwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzyt zzc() {
        zzyt zzytVar = this.zzc;
        zzytVar.getClass();
        return zzytVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    @Nullable
    public final zzyu zzd() {
        zzwf zzwfVar = this.zzd;
        if (zzwfVar == null || zzwfVar.zzc == null) {
            return null;
        }
        return zzwfVar;
    }

    public final void zze(long j2, int i2) {
        zzdi.zzf(this.zzc == null);
        this.zza = j2;
        this.zzb = j2 + 65536;
    }
}
