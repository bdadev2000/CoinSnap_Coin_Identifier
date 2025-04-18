package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzadk implements zzaea {
    private final zzadm zza;
    private final long zzb;

    public zzadk(zzadm zzadmVar, long j2) {
        this.zza = zzadmVar;
        this.zzb = j2;
    }

    private final zzaeb zzb(long j2, long j3) {
        return new zzaeb((j2 * 1000000) / this.zza.zze, this.zzb + j3);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        zzdi.zzb(this.zza.zzk);
        zzadm zzadmVar = this.zza;
        zzadl zzadlVar = zzadmVar.zzk;
        long[] jArr = zzadlVar.zza;
        long[] jArr2 = zzadlVar.zzb;
        int zzc = zzeu.zzc(jArr, zzadmVar.zzb(j2), true, false);
        zzaeb zzb = zzb(zzc == -1 ? 0L : jArr[zzc], zzc != -1 ? jArr2[zzc] : 0L);
        if (zzb.zzb == j2 || zzc == jArr.length - 1) {
            return new zzady(zzb, zzb);
        }
        int i2 = zzc + 1;
        return new zzady(zzb, zzb(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }
}
