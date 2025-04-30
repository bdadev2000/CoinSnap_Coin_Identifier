package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;

/* loaded from: classes2.dex */
public final class zzft {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzft(byte[] bArr, int i9) {
        this.zza = bArr;
        this.zzd = i9;
    }

    private final void zzp() {
        int i9;
        int i10 = this.zzb;
        boolean z8 = false;
        if (i10 >= 0 && (i10 < (i9 = this.zzd) || (i10 == i9 && this.zzc == 0))) {
            z8 = true;
        }
        zzeq.zzf(z8);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        boolean z8;
        if (this.zzc == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i9) {
        int i10;
        if (i9 == 0) {
            return 0;
        }
        this.zzc += i9;
        int i11 = 0;
        while (true) {
            i10 = this.zzc;
            if (i10 <= 8) {
                break;
            }
            int i12 = i10 - 8;
            this.zzc = i12;
            byte[] bArr = this.zza;
            int i13 = this.zzb;
            this.zzb = i13 + 1;
            i11 |= (bArr[i13] & 255) << i12;
        }
        byte[] bArr2 = this.zza;
        int i14 = this.zzb;
        int i15 = i11 | ((bArr2[i14] & 255) >> (8 - i10));
        int i16 = 32 - i9;
        if (i10 == 8) {
            this.zzc = 0;
            this.zzb = i14 + 1;
        }
        int i17 = ((-1) >>> i16) & i15;
        zzp();
        return i17;
    }

    public final void zze() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzp();
    }

    public final void zzf(int i9, int i10) {
        int min = Math.min(8 - this.zzc, 14);
        int i11 = this.zzc;
        int i12 = (8 - i11) - min;
        int i13 = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i11;
        byte[] bArr = this.zza;
        int i14 = this.zzb;
        byte b = (byte) ((i13 | ((1 << i12) - 1)) & bArr[i14]);
        bArr[i14] = b;
        int i15 = 14 - min;
        int i16 = i9 & 16383;
        bArr[i14] = (byte) (b | ((i16 >>> i15) << i12));
        int i17 = i14 + 1;
        while (i15 > 8) {
            i15 -= 8;
            this.zza[i17] = (byte) (i16 >>> i15);
            i17++;
        }
        byte[] bArr2 = this.zza;
        byte b8 = (byte) (bArr2[i17] & ((1 << r0) - 1));
        bArr2[i17] = b8;
        bArr2[i17] = (byte) (((i16 & ((1 << i15) - 1)) << (8 - i15)) | b8);
        zzm(14);
        zzp();
    }

    public final void zzg(byte[] bArr, int i9, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i10 >> 3;
            if (i12 >= i11) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i13 = this.zzb;
            int i14 = i13 + 1;
            this.zzb = i14;
            byte b = bArr2[i13];
            int i15 = this.zzc;
            byte b8 = (byte) (b << i15);
            bArr[i12] = b8;
            bArr[i12] = (byte) (((bArr2[i14] & 255) >> (8 - i15)) | b8);
            i12++;
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b9;
        int i17 = this.zzc;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.zza;
            int i18 = this.zzb;
            this.zzb = i18 + 1;
            b9 = (byte) (b9 | ((bArr3[i18] & 255) << i17));
            bArr[i11] = b9;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.zzc = i19;
        byte[] bArr4 = this.zza;
        int i20 = this.zzb;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b9);
        if (i19 == 8) {
            this.zzc = 0;
            this.zzb = i20 + 1;
        }
        zzp();
    }

    public final void zzh(byte[] bArr, int i9, int i10) {
        boolean z8;
        if (this.zzc == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i10);
        this.zzb += i10;
        zzp();
    }

    public final void zzi(zzfu zzfuVar) {
        zzj(zzfuVar.zzM(), zzfuVar.zze());
        zzk(zzfuVar.zzd() * 8);
    }

    public final void zzj(byte[] bArr, int i9) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i9;
    }

    public final void zzk(int i9) {
        int i10 = i9 / 8;
        this.zzb = i10;
        this.zzc = i9 - (i10 * 8);
        zzp();
    }

    public final void zzl() {
        int i9 = this.zzc + 1;
        this.zzc = i9;
        if (i9 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzp();
    }

    public final void zzm(int i9) {
        int i10 = i9 / 8;
        int i11 = this.zzb + i10;
        this.zzb = i11;
        int i12 = (i9 - (i10 * 8)) + this.zzc;
        this.zzc = i12;
        if (i12 > 7) {
            this.zzb = i11 + 1;
            this.zzc = i12 - 8;
        }
        zzp();
    }

    public final void zzn(int i9) {
        boolean z8;
        if (this.zzc == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        this.zzb += i9;
        zzp();
    }

    public final boolean zzo() {
        int i9 = this.zza[this.zzb] & (128 >> this.zzc);
        zzl();
        if (i9 != 0) {
            return true;
        }
        return false;
    }

    public zzft() {
        this.zza = zzgd.zzf;
    }
}
