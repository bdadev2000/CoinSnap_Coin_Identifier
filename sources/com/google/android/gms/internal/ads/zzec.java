package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class zzec {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzec() {
        throw null;
    }

    public final long zza() {
        if (this.zzb != 0) {
            return this.zzc[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i2 = this.zzb;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzc;
        int i3 = this.zza;
        long j2 = jArr[i3];
        this.zza = this.zzd & (i3 + 1);
        this.zzb = i2 - 1;
        return j2;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzd() {
        return this.zzb == 0;
    }

    public zzec(int i2) {
        int i3 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i3 = highestOneBit + highestOneBit;
        }
        this.zza = 0;
        this.zzb = 0;
        this.zzc = new long[i3];
        this.zzd = r3.length - 1;
    }
}
