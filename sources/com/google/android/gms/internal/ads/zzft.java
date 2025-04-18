package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes3.dex */
public final class zzft {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzft(byte[] bArr, int i2, int i3) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = i3;
        zzj();
    }

    private final int zzi() {
        int i2 = 0;
        while (!zzh()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? zza(i2) : 0);
    }

    private final void zzj() {
        int i2;
        int i3 = this.zzc;
        boolean z2 = false;
        if (i3 >= 0 && (i3 < (i2 = this.zzb) || (i3 == i2 && this.zzd == 0))) {
            z2 = true;
        }
        zzdi.zzf(z2);
    }

    private final boolean zzk(int i2) {
        if (i2 < 2 || i2 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 0;
    }

    public final int zza(int i2) {
        int i3;
        this.zzd += i2;
        int i4 = 0;
        while (true) {
            i3 = this.zzd;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.zzd = i5;
            byte[] bArr = this.zza;
            int i6 = this.zzc;
            i4 |= (bArr[i6] & UnsignedBytes.MAX_VALUE) << i5;
            if (true != zzk(i6 + 1)) {
                r3 = 1;
            }
            this.zzc = i6 + r3;
        }
        byte[] bArr2 = this.zza;
        int i7 = this.zzc;
        int i8 = i4 | ((bArr2[i7] & UnsignedBytes.MAX_VALUE) >> (8 - i3));
        int i9 = 32 - i2;
        if (i3 == 8) {
            this.zzd = 0;
            this.zzc = i7 + (true != zzk(i7 + 1) ? 1 : 2);
        }
        int i10 = ((-1) >>> i9) & i8;
        zzj();
        return i10;
    }

    public final int zzb() {
        int zzi = zzi();
        int i2 = zzi % 2;
        return ((zzi + 1) / 2) * (i2 == 0 ? -1 : 1);
    }

    public final int zzc() {
        return zzi();
    }

    public final void zzd() {
        int i2 = this.zzd;
        if (i2 > 0) {
            zzf(8 - i2);
        }
    }

    public final void zze() {
        int i2 = this.zzd + 1;
        this.zzd = i2;
        if (i2 == 8) {
            this.zzd = 0;
            int i3 = this.zzc;
            this.zzc = i3 + (true == zzk(i3 + 1) ? 2 : 1);
        }
        zzj();
    }

    public final void zzf(int i2) {
        int i3 = this.zzc;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.zzc = i5;
        int i6 = (i2 - (i4 * 8)) + this.zzd;
        this.zzd = i6;
        if (i6 > 7) {
            this.zzc = i5 + 1;
            this.zzd = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.zzc) {
                zzj();
                return;
            } else if (zzk(i3)) {
                this.zzc++;
                i3 += 2;
            }
        }
    }

    public final boolean zzg(int i2) {
        int i3 = this.zzc;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.zzd + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.zzb) {
                break;
            }
            if (zzk(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.zzb;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public final boolean zzh() {
        int i2 = this.zza[this.zzc] & (128 >> this.zzd);
        zze();
        return i2 != 0;
    }
}
