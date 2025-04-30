package com.google.android.gms.internal.ads;

import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzadg implements zzaet {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzadg(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i9 = length - 1;
            this.zzf = jArr2[i9] + jArr3[i9];
        } else {
            this.zzf = 0L;
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(jArr3);
        String arrays3 = Arrays.toString(jArr2);
        String arrays4 = Arrays.toString(jArr);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.zza);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        AbstractC2914a.j(sb, arrays2, ", timeUs=", arrays3, ", durationsUs=");
        return AbstractC2914a.h(sb, arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final zzaer zzg(long j7) {
        long[] jArr = this.zze;
        int zzc = zzgd.zzc(jArr, j7, true, true);
        zzaeu zzaeuVar = new zzaeu(jArr[zzc], this.zzc[zzc]);
        if (zzaeuVar.zzb < j7 && zzc != this.zza - 1) {
            int i9 = zzc + 1;
            return new zzaer(zzaeuVar, new zzaeu(this.zze[i9], this.zzc[i9]));
        }
        return new zzaer(zzaeuVar, zzaeuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final boolean zzh() {
        return true;
    }
}
