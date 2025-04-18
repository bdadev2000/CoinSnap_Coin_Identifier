package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzaje {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzad zzf;
    public final int zzg;

    @Nullable
    public final long[] zzh;

    @Nullable
    public final long[] zzi;
    public final int zzj;

    @Nullable
    private final zzajf[] zzk;

    public zzaje(int i10, int i11, long j3, long j10, long j11, zzad zzadVar, int i12, @Nullable zzajf[] zzajfVarArr, int i13, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = j3;
        this.zzd = j10;
        this.zze = j11;
        this.zzf = zzadVar;
        this.zzg = i12;
        this.zzk = zzajfVarArr;
        this.zzj = i13;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    @Nullable
    public final zzajf zza(int i10) {
        return this.zzk[i10];
    }
}
