package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaem implements zzaet {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzaem(long[] jArr, long[] jArr2, long j7) {
        boolean z8;
        boolean z9;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        if (length2 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.zzd = z9;
        if (z9 && jArr2[0] > 0) {
            int i9 = length2 + 1;
            long[] jArr3 = new long[i9];
            this.zza = jArr3;
            long[] jArr4 = new long[i9];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        } else {
            this.zza = jArr;
            this.zzb = jArr2;
        }
        this.zzc = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        if (!this.zzd) {
            zzaeu zzaeuVar = zzaeu.zza;
            return new zzaer(zzaeuVar, zzaeuVar);
        }
        int zzc = zzgd.zzc(this.zzb, j7, true, true);
        zzaeu zzaeuVar2 = new zzaeu(this.zzb[zzc], this.zza[zzc]);
        if (zzaeuVar2.zzb != j7) {
            long[] jArr = this.zzb;
            if (zzc != jArr.length - 1) {
                int i9 = zzc + 1;
                return new zzaer(zzaeuVar2, new zzaeu(jArr[i9], this.zza[i9]));
            }
        }
        return new zzaer(zzaeuVar2, zzaeuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return this.zzd;
    }
}
