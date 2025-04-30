package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzada {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzada(long j7, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.zza = j7;
        this.zzb = j9;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = j13;
        this.zzc = j14;
        this.zzh = zzf(j9, 0L, j11, j12, j13, j14);
    }

    public static long zzf(long j7, long j9, long j10, long j11, long j12, long j13) {
        if (j11 + 1 < j12 && 1 + j9 < j10) {
            long j14 = (((float) (j12 - j11)) / ((float) (j10 - j9))) * ((float) (j7 - j9));
            return Math.max(j11, Math.min(((j11 + j14) - j13) - (j14 / 20), j12 - 1));
        }
        return j11;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzada zzadaVar, long j7, long j9) {
        zzadaVar.zze = j7;
        zzadaVar.zzg = j9;
        zzadaVar.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzada zzadaVar, long j7, long j9) {
        zzadaVar.zzd = j7;
        zzadaVar.zzf = j9;
        zzadaVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
