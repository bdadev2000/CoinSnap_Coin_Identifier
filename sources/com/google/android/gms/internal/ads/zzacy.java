package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzacy implements zzaet {
    private final zzadb zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzacy(zzadb zzadbVar, long j7, long j9, long j10, long j11, long j12, long j13) {
        this.zza = zzadbVar;
        this.zzb = j7;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j7) {
        return this.zza.zza(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        zzaeu zzaeuVar = new zzaeu(j7, zzada.zzf(this.zza.zza(j7), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
