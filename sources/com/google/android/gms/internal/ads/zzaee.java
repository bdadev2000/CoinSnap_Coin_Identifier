package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaee implements zzaet {
    private final zzaeg zza;
    private final long zzb;

    public zzaee(zzaeg zzaegVar, long j7) {
        this.zza = zzaegVar;
        this.zzb = j7;
    }

    private final zzaeu zzb(long j7, long j9) {
        return new zzaeu((j7 * 1000000) / this.zza.zze, this.zzb + j9);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        long j9;
        zzeq.zzb(this.zza.zzk);
        zzaeg zzaegVar = this.zza;
        zzaef zzaefVar = zzaegVar.zzk;
        long[] jArr = zzaefVar.zza;
        long[] jArr2 = zzaefVar.zzb;
        int zzc = zzgd.zzc(jArr, zzaegVar.zzb(j7), true, false);
        long j10 = 0;
        if (zzc == -1) {
            j9 = 0;
        } else {
            j9 = jArr[zzc];
        }
        if (zzc != -1) {
            j10 = jArr2[zzc];
        }
        zzaeu zzb = zzb(j9, j10);
        if (zzb.zzb != j7 && zzc != jArr.length - 1) {
            int i9 = zzc + 1;
            return new zzaer(zzb, zzb(jArr[i9], jArr2[i9]));
        }
        return new zzaer(zzb, zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
