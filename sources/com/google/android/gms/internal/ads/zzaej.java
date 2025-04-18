package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes.dex */
public final class zzaej {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzaej(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final int zza() {
        return (this.zzc * 8) + this.zzd;
    }

    public final int zzb(int i2) {
        int i3 = this.zzc;
        int i4 = 8 - this.zzd;
        int i5 = i3 + 1;
        byte[] bArr = this.zza;
        int min = Math.min(i2, i4);
        int i6 = ((bArr[i3] & UnsignedBytes.MAX_VALUE) >> this.zzd) & (255 >> (8 - min));
        while (min < i2) {
            i6 |= (this.zza[i5] & UnsignedBytes.MAX_VALUE) << min;
            min += 8;
            i5++;
        }
        int i7 = i6 & ((-1) >>> (32 - i2));
        zzc(i2);
        return i7;
    }

    public final void zzc(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.zzc + i4;
        this.zzc = i5;
        int i6 = (i2 - (i4 * 8)) + this.zzd;
        this.zzd = i6;
        if (i6 > 7) {
            i5++;
            this.zzc = i5;
            i6 -= 8;
            this.zzd = i6;
        }
        boolean z2 = false;
        if (i5 >= 0 && (i5 < (i3 = this.zzb) || (i5 == i3 && i6 == 0))) {
            z2 = true;
        }
        zzdi.zzf(z2);
    }

    public final boolean zzd() {
        int i2 = (this.zza[this.zzc] & UnsignedBytes.MAX_VALUE) >> this.zzd;
        zzc(1);
        return 1 == (i2 & 1);
    }
}
