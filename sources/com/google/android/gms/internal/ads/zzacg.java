package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzacg implements zzaea {
    private final zzacj zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzacg(zzacj zzacjVar, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.zza = zzacjVar;
        this.zzb = j2;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6;
        this.zzf = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j2) {
        return this.zza.zza(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        zzaeb zzaebVar = new zzaeb(j2, zzaci.zzf(this.zza.zza(j2), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzady(zzaebVar, zzaebVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }
}
