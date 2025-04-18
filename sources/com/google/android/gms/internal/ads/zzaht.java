package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzaht extends zzacf implements zzahy {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzaht(long j3, long j10, int i10, int i11, boolean z10) {
        super(j3, j10, i10, i11, false);
        this.zza = j10;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j3 == -1 ? -1L : j3;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zze(long j3) {
        return zzb(j3);
    }

    public final zzaht zzf(long j3) {
        return new zzaht(j3, this.zza, this.zzb, this.zzc, false);
    }
}
