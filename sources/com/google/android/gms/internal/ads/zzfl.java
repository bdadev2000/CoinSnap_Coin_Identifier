package com.google.android.gms.internal.ads;

import Q7.n0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfl {
    private int zza;
    private long[] zzb;

    public zzfl() {
        throw null;
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i9) {
        if (i9 >= 0 && i9 < this.zza) {
            return this.zzb[i9];
        }
        throw new IndexOutOfBoundsException(n0.e(i9, this.zza, "Invalid index ", ", size is "));
    }

    public final void zzc(long j7) {
        int i9 = this.zza;
        long[] jArr = this.zzb;
        if (i9 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i9 + i9);
        }
        long[] jArr2 = this.zzb;
        int i10 = this.zza;
        this.zza = i10 + 1;
        jArr2[i10] = j7;
    }

    public zzfl(int i9) {
        this.zzb = new long[32];
    }
}
