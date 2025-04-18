package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzada implements zzadq {
    private final zzadc zza;
    private final long zzb;

    public zzada(zzadc zzadcVar, long j3) {
        this.zza = zzadcVar;
        this.zzb = j3;
    }

    private final zzadr zzb(long j3, long j10) {
        return new zzadr((j3 * 1000000) / this.zza.zze, this.zzb + j10);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        long j10;
        zzdb.zzb(this.zza.zzk);
        zzadc zzadcVar = this.zza;
        zzadb zzadbVar = zzadcVar.zzk;
        long[] jArr = zzadbVar.zza;
        long[] jArr2 = zzadbVar.zzb;
        int zzd = zzen.zzd(jArr, zzadcVar.zzb(j3), true, false);
        long j11 = 0;
        if (zzd == -1) {
            j10 = 0;
        } else {
            j10 = jArr[zzd];
        }
        if (zzd != -1) {
            j11 = jArr2[zzd];
        }
        zzadr zzb = zzb(j10, j11);
        if (zzb.zzb != j3 && zzd != jArr.length - 1) {
            int i10 = zzd + 1;
            return new zzado(zzb, zzb(jArr[i10], jArr2[i10]));
        }
        return new zzado(zzb, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
