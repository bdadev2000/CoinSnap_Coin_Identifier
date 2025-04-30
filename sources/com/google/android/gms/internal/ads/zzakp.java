package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzakp {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzan zzf;
    public final int zzg;

    @Nullable
    public final long[] zzh;

    @Nullable
    public final long[] zzi;
    public final int zzj;

    @Nullable
    private final zzakq[] zzk;

    public zzakp(int i9, int i10, long j7, long j9, long j10, zzan zzanVar, int i11, @Nullable zzakq[] zzakqVarArr, int i12, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = j7;
        this.zzd = j9;
        this.zze = j10;
        this.zzf = zzanVar;
        this.zzg = i11;
        this.zzk = zzakqVarArr;
        this.zzj = i12;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    @Nullable
    public final zzakq zza(int i9) {
        return this.zzk[i9];
    }
}
