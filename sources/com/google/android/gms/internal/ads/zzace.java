package com.google.android.gms.internal.ads;

import java.util.Arrays;
import vd.e;

/* loaded from: classes3.dex */
public final class zzace implements zzadq {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzace(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length > 0) {
            int i10 = length - 1;
            this.zzf = jArr2[i10] + jArr3[i10];
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
        StringBuilder sb2 = new StringBuilder("ChunkIndex(length=");
        sb2.append(this.zza);
        sb2.append(", sizes=");
        sb2.append(arrays);
        sb2.append(", offsets=");
        sb2.append(arrays2);
        sb2.append(", timeUs=");
        sb2.append(arrays3);
        sb2.append(", durationsUs=");
        return e.h(sb2, arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j3) {
        long[] jArr = this.zze;
        int zzd = zzen.zzd(jArr, j3, true, true);
        zzadr zzadrVar = new zzadr(jArr[zzd], this.zzc[zzd]);
        if (zzadrVar.zzb < j3 && zzd != this.zza - 1) {
            int i10 = zzd + 1;
            return new zzado(zzadrVar, new zzadr(this.zze[i10], this.zzc[i10]));
        }
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}
