package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzafc {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public zzafc(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    public final int zza() {
        return (this.zzc * 8) + this.zzd;
    }

    public final int zzb(int i9) {
        int i10 = this.zzc;
        int i11 = 8 - this.zzd;
        int i12 = i10 + 1;
        byte[] bArr = this.zza;
        int min = Math.min(i9, i11);
        int i13 = ((bArr[i10] & 255) >> this.zzd) & (255 >> (8 - min));
        while (min < i9) {
            i13 |= (this.zza[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i9));
        zzc(i9);
        return i14;
    }

    public final void zzc(int i9) {
        int i10;
        int i11 = i9 / 8;
        int i12 = this.zzc + i11;
        this.zzc = i12;
        int i13 = (i9 - (i11 * 8)) + this.zzd;
        this.zzd = i13;
        if (i13 > 7) {
            i12++;
            this.zzc = i12;
            i13 -= 8;
            this.zzd = i13;
        }
        boolean z8 = false;
        if (i12 >= 0 && (i12 < (i10 = this.zzb) || (i12 == i10 && i13 == 0))) {
            z8 = true;
        }
        zzeq.zzf(z8);
    }

    public final boolean zzd() {
        int i9 = (this.zza[this.zzc] & 255) >> this.zzd;
        zzc(1);
        if (1 == (i9 & 1)) {
            return true;
        }
        return false;
    }
}
