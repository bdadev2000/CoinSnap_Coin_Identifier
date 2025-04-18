package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzabw implements zzadq {
    private final zzabz zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzabw(zzabz zzabzVar, long j3, long j10, long j11, long j12, long j13, long j14) {
        this.zza = zzabzVar;
        this.zzb = j3;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = j14;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j3) {
        return this.zza.zza(j3);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        zzadr zzadrVar = new zzadr(j3, zzaby.zzf(this.zza.zza(j3), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
