package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzajr {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzaf zzf;
    public final int zzg;

    @Nullable
    public final long[] zzh;

    @Nullable
    public final long[] zzi;
    public final int zzj;

    @Nullable
    private final zzajs[] zzk;

    public zzajr(int i2, int i3, long j2, long j3, long j4, zzaf zzafVar, int i4, @Nullable zzajs[] zzajsVarArr, int i5, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = zzafVar;
        this.zzg = i4;
        this.zzk = zzajsVarArr;
        this.zzj = i5;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    @Nullable
    public final zzajs zza(int i2) {
        return this.zzk[i2];
    }
}
