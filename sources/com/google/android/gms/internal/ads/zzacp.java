package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzacp implements zzaea {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacp(long j2, long j3, int i2, int i3, boolean z2) {
        long zzc;
        this.zza = j2;
        this.zzb = j3;
        this.zzc = i3 == -1 ? 1 : i3;
        this.zze = i2;
        if (j2 == -1) {
            this.zzd = -1L;
            zzc = -9223372036854775807L;
        } else {
            this.zzd = j2 - j3;
            zzc = zzc(j2, j3, i2);
        }
        this.zzf = zzc;
    }

    private static long zzc(long j2, long j3, int i2) {
        return (Math.max(0L, j2 - j3) * 8000000) / i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j2) {
        return zzc(j2, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        long j3 = this.zzd;
        if (j3 == -1) {
            zzaeb zzaebVar = new zzaeb(0L, this.zzb);
            return new zzady(zzaebVar, zzaebVar);
        }
        long j4 = this.zzc;
        long j5 = (((this.zze * j2) / 8000000) / j4) * j4;
        if (j3 != -1) {
            j5 = Math.min(j5, j3 - j4);
        }
        long max = this.zzb + Math.max(j5, 0L);
        long zzb = zzb(max);
        zzaeb zzaebVar2 = new zzaeb(zzb, max);
        if (this.zzd != -1 && zzb < j2) {
            long j6 = max + this.zzc;
            if (j6 < this.zza) {
                return new zzady(zzaebVar2, new zzaeb(zzb(j6), j6));
            }
        }
        return new zzady(zzaebVar2, zzaebVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
