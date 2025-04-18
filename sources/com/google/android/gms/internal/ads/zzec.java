package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzec {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzec(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzd = i10;
    }

    private final void zzq() {
        int i10;
        int i11 = this.zzb;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.zzd) || (i11 == i10 && this.zzc == 0))) {
            z10 = true;
        }
        zzdb.zzf(z10);
    }

    public final int zza() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzb() {
        zzdb.zzf(this.zzc == 0);
        return this.zzb;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzd(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.zzc += i10;
        int i12 = 0;
        while (true) {
            i11 = this.zzc;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.zzc = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzb;
            this.zzb = i14 + 1;
            i12 |= (bArr[i14] & UByte.MAX_VALUE) << i13;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzb;
        int i16 = i12 | ((bArr2[i15] & UByte.MAX_VALUE) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.zzc = 0;
            this.zzb = i15 + 1;
        }
        int i18 = ((-1) >>> i17) & i16;
        zzq();
        return i18;
    }

    public final long zze(int i10) {
        if (i10 <= 32) {
            int zzd = zzd(i10);
            int i11 = zzen.zza;
            return 4294967295L & zzd;
        }
        int zzd2 = zzd(i10 - 32);
        int zzd3 = zzd(32);
        int i12 = zzen.zza;
        return (4294967295L & zzd3) | ((zzd2 & 4294967295L) << 32);
    }

    public final void zzf() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzg(int i10, int i11) {
        int min = Math.min(8 - this.zzc, 14);
        int i12 = this.zzc;
        int i13 = (8 - i12) - min;
        int i14 = MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i12;
        byte[] bArr = this.zza;
        int i15 = this.zzb;
        byte b3 = (byte) ((i14 | ((1 << i13) - 1)) & bArr[i15]);
        bArr[i15] = b3;
        int i16 = 14 - min;
        int i17 = i10 & 16383;
        bArr[i15] = (byte) (b3 | ((i17 >>> i16) << i13));
        int i18 = i15 + 1;
        while (i16 > 8) {
            i16 -= 8;
            this.zza[i18] = (byte) (i17 >>> i16);
            i18++;
        }
        byte[] bArr2 = this.zza;
        byte b10 = (byte) (bArr2[i18] & ((1 << r0) - 1));
        bArr2[i18] = b10;
        bArr2[i18] = (byte) (((i17 & ((1 << i16) - 1)) << (8 - i16)) | b10);
        zzn(14);
        zzq();
    }

    public final void zzh(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (true) {
            i12 = i11 >> 3;
            if (i13 >= i12) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i14 = this.zzb;
            int i15 = i14 + 1;
            this.zzb = i15;
            byte b3 = bArr2[i14];
            int i16 = this.zzc;
            byte b10 = (byte) (b3 << i16);
            bArr[i13] = b10;
            bArr[i13] = (byte) (((bArr2[i15] & UByte.MAX_VALUE) >> (8 - i16)) | b10);
            i13++;
        }
        int i17 = i11 & 7;
        if (i17 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i12] & (255 >> i17));
        bArr[i12] = b11;
        int i18 = this.zzc;
        if (i18 + i17 > 8) {
            byte[] bArr3 = this.zza;
            int i19 = this.zzb;
            this.zzb = i19 + 1;
            b11 = (byte) (b11 | ((bArr3[i19] & UByte.MAX_VALUE) << i18));
            bArr[i12] = b11;
            i18 -= 8;
        }
        int i20 = i18 + i17;
        this.zzc = i20;
        byte[] bArr4 = this.zza;
        int i21 = this.zzb;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i17))) | b11);
        if (i20 == 8) {
            this.zzc = 0;
            this.zzb = i21 + 1;
        }
        zzq();
    }

    public final void zzi(byte[] bArr, int i10, int i11) {
        boolean z10;
        if (this.zzc == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i11);
        this.zzb += i11;
        zzq();
    }

    public final void zzj(zzed zzedVar) {
        zzk(zzedVar.zzN(), zzedVar.zze());
        zzl(zzedVar.zzd() * 8);
    }

    public final void zzk(byte[] bArr, int i10) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i10;
    }

    public final void zzl(int i10) {
        int i11 = i10 / 8;
        this.zzb = i11;
        this.zzc = i10 - (i11 * 8);
        zzq();
    }

    public final void zzm() {
        int i10 = this.zzc + 1;
        this.zzc = i10;
        if (i10 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzn(int i10) {
        int i11 = i10 / 8;
        int i12 = this.zzb + i11;
        this.zzb = i12;
        int i13 = (i10 - (i11 * 8)) + this.zzc;
        this.zzc = i13;
        if (i13 > 7) {
            this.zzb = i12 + 1;
            this.zzc = i13 - 8;
        }
        zzq();
    }

    public final void zzo(int i10) {
        boolean z10;
        if (this.zzc == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        this.zzb += i10;
        zzq();
    }

    public final boolean zzp() {
        int i10 = this.zza[this.zzb] & (128 >> this.zzc);
        zzm();
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    public zzec() {
        this.zza = zzen.zzf;
    }
}
