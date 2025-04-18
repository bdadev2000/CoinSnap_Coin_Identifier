package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzadz {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzadz(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final int zza() {
        return (this.zzc * 8) + this.zzd;
    }

    public final int zzb(int i10) {
        int i11 = this.zzc;
        int i12 = 8 - this.zzd;
        int i13 = i11 + 1;
        byte[] bArr = this.zza;
        int min = Math.min(i10, i12);
        int i14 = ((bArr[i11] & UByte.MAX_VALUE) >> this.zzd) & (255 >> (8 - min));
        while (min < i10) {
            i14 |= (this.zza[i13] & UByte.MAX_VALUE) << min;
            min += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i10));
        zzc(i10);
        return i15;
    }

    public final void zzc(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.zzc + i12;
        this.zzc = i13;
        int i14 = (i10 - (i12 * 8)) + this.zzd;
        this.zzd = i14;
        if (i14 > 7) {
            i13++;
            this.zzc = i13;
            i14 -= 8;
            this.zzd = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.zzb) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        zzdb.zzf(z10);
    }

    public final boolean zzd() {
        int i10 = (this.zza[this.zzc] & UByte.MAX_VALUE) >> this.zzd;
        zzc(1);
        if (1 == (i10 & 1)) {
            return true;
        }
        return false;
    }
}
