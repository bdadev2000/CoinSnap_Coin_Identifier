package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzajz implements zzake {
    private final zzadm zza;
    private final zzadl zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajz(zzadm zzadmVar, zzadl zzadlVar) {
        this.zza = zzadmVar;
        this.zzb = zzadlVar;
    }

    public final void zza(long j2) {
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final long zzd(zzadc zzadcVar) {
        long j2 = this.zzd;
        if (j2 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j2 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final zzaea zze() {
        zzdi.zzf(this.zzc != -1);
        return new zzadk(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzake
    public final void zzg(long j2) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzeu.zzc(jArr, j2, true, true)];
    }
}
