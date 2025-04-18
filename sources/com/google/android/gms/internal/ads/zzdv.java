package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class zzdv {
    private int zza;
    private int zzb;
    private long[] zzc;
    private int zzd;

    public zzdv() {
        throw null;
    }

    public final long zza() {
        if (this.zzb != 0) {
            return this.zzc[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final long zzb() {
        int i10 = this.zzb;
        if (i10 != 0) {
            long[] jArr = this.zzc;
            int i11 = this.zza;
            long j3 = jArr[i11];
            this.zza = this.zzd & (i11 + 1);
            this.zzb = i10 - 1;
            return j3;
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

    public zzdv(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i11 = highestOneBit + highestOneBit;
        }
        this.zza = 0;
        this.zzb = 0;
        this.zzc = new long[i11];
        this.zzd = r3.length - 1;
    }
}
