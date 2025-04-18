package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzads implements zzaea {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzads(long[] jArr, long[] jArr2, long j2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdi.zzd(length == length2);
        boolean z2 = length2 > 0;
        this.zzd = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i2 = length2 + 1;
            long[] jArr3 = new long[i2];
            this.zza = jArr3;
            long[] jArr4 = new long[i2];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        if (!this.zzd) {
            zzaeb zzaebVar = zzaeb.zza;
            return new zzady(zzaebVar, zzaebVar);
        }
        int zzc = zzeu.zzc(this.zzb, j2, true, true);
        zzaeb zzaebVar2 = new zzaeb(this.zzb[zzc], this.zza[zzc]);
        if (zzaebVar2.zzb != j2) {
            long[] jArr = this.zzb;
            if (zzc != jArr.length - 1) {
                int i2 = zzc + 1;
                return new zzady(zzaebVar2, new zzaeb(jArr[i2], this.zza[i2]));
            }
        }
        return new zzady(zzaebVar2, zzaebVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return this.zzd;
    }
}
