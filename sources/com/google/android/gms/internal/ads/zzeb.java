package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzeb {
    private int zza;
    private long[] zzb;

    public zzeb() {
        throw null;
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i2) {
        if (i2 < 0 || i2 >= this.zza) {
            throw new IndexOutOfBoundsException(d.k("Invalid index ", i2, ", size is ", this.zza));
        }
        return this.zzb[i2];
    }

    public final void zzc(long j2) {
        int i2 = this.zza;
        long[] jArr = this.zzb;
        if (i2 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i2 + i2);
        }
        long[] jArr2 = this.zzb;
        int i3 = this.zza;
        this.zza = i3 + 1;
        jArr2[i3] = j2;
    }

    public zzeb(int i2) {
        this.zzb = new long[32];
    }
}
