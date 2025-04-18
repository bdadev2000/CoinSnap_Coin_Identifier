package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzajm implements zzajr {
    private final zzadc zza;
    private final zzadb zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajm(zzadc zzadcVar, zzadb zzadbVar) {
        this.zza = zzadcVar;
        this.zzb = zzadbVar;
    }

    public final void zza(long j3) {
        this.zzc = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzd(zzacs zzacsVar) {
        long j3 = this.zzd;
        if (j3 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j3 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final zzadq zze() {
        zzdb.zzf(this.zzc != -1);
        return new zzada(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final void zzg(long j3) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzen.zzd(jArr, j3, true, true)];
    }
}
