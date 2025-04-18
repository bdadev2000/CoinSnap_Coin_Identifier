package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaby {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzaby(long j3, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.zza = j3;
        this.zzb = j10;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzc = j15;
        this.zzh = zzf(j10, 0L, j12, j13, j14, j15);
    }

    public static long zzf(long j3, long j10, long j11, long j12, long j13, long j14) {
        if (j12 + 1 >= j13 || 1 + j10 >= j11) {
            return j12;
        }
        long j15 = (((float) (j13 - j12)) / ((float) (j11 - j10))) * ((float) (j3 - j10));
        return Math.max(j12, Math.min(((j12 + j15) - j14) - (j15 / 20), j13 - 1));
    }

    public static /* bridge */ /* synthetic */ void zzg(zzaby zzabyVar, long j3, long j10) {
        zzabyVar.zze = j3;
        zzabyVar.zzg = j10;
        zzabyVar.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzaby zzabyVar, long j3, long j10) {
        zzabyVar.zzd = j3;
        zzabyVar.zzf = j10;
        zzabyVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
