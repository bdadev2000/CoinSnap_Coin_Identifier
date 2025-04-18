package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaco implements zzaea {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaco(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i2 = length - 1;
            this.zzf = jArr2[i2] + jArr3[i2];
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
        androidx.compose.foundation.text.input.a.y(sb, this.zza, ", sizes=", arrays, ", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        return d.r(sb, arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final zzady zzg(long j2) {
        long[] jArr = this.zze;
        int zzc = zzeu.zzc(jArr, j2, true, true);
        zzaeb zzaebVar = new zzaeb(jArr[zzc], this.zzc[zzc]);
        if (zzaebVar.zzb >= j2 || zzc == this.zza - 1) {
            return new zzady(zzaebVar, zzaebVar);
        }
        int i2 = zzc + 1;
        return new zzady(zzaebVar, new zzaeb(this.zze[i2], this.zzc[i2]));
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
        return true;
    }
}
