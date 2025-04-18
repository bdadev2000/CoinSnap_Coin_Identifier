package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzaci {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd = 0;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzaci(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.zza = j2;
        this.zzb = j3;
        this.zze = j5;
        this.zzf = j6;
        this.zzg = j7;
        this.zzc = j8;
        this.zzh = zzf(j3, 0L, j5, j6, j7, j8);
    }

    public static long zzf(long j2, long j3, long j4, long j5, long j6, long j7) {
        if (j5 + 1 >= j6 || 1 + j3 >= j4) {
            return j5;
        }
        long j8 = (((float) (j6 - j5)) / ((float) (j4 - j3))) * ((float) (j2 - j3));
        return Math.max(j5, Math.min(((j5 + j8) - j7) - (j8 / 20), j6 - 1));
    }

    public static /* bridge */ /* synthetic */ void zzg(zzaci zzaciVar, long j2, long j3) {
        zzaciVar.zze = j2;
        zzaciVar.zzg = j3;
        zzaciVar.zzi();
    }

    public static /* bridge */ /* synthetic */ void zzh(zzaci zzaciVar, long j2, long j3) {
        zzaciVar.zzd = j2;
        zzaciVar.zzf = j3;
        zzaciVar.zzi();
    }

    private final void zzi() {
        this.zzh = zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}
