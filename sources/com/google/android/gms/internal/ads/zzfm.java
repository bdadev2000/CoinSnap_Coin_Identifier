package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zzfm {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzfm() {
        throw null;
    }

    public final long zza() {
        if (this.zzb != 0) {
            return this.zzc[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i9 = this.zzb;
        if (i9 != 0) {
            long[] jArr = this.zzc;
            int i10 = this.zza;
            long j7 = jArr[i10];
            this.zza = this.zzd & (i10 + 1);
            this.zzb = i9 - 1;
            return j7;
        }
        throw new NoSuchElementException();
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzd() {
        return this.zzb == 0;
    }

    public zzfm(int i9) {
        int i10 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i10 = highestOneBit + highestOneBit;
        }
        this.zza = 0;
        this.zzb = 0;
        this.zzc = new long[i10];
        this.zzd = r3.length - 1;
    }
}
