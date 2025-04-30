package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgs {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzgs(byte[] bArr, int i9, int i10) {
        this.zza = bArr;
        this.zzc = i9;
        this.zzb = i10;
        zzh();
    }

    private final int zzg() {
        int i9 = 0;
        int i10 = 0;
        while (!zzf()) {
            i10++;
        }
        int i11 = 1 << i10;
        if (i10 > 0) {
            i9 = zza(i10);
        }
        return (i11 - 1) + i9;
    }

    private final void zzh() {
        int i9;
        int i10 = this.zzc;
        boolean z8 = false;
        if (i10 >= 0 && (i10 < (i9 = this.zzb) || (i10 == i9 && this.zzd == 0))) {
            z8 = true;
        }
        zzeq.zzf(z8);
    }

    private final boolean zzi(int i9) {
        if (i9 >= 2 && i9 < this.zzb) {
            byte[] bArr = this.zza;
            if (bArr[i9] == 3 && bArr[i9 - 2] == 0 && bArr[i9 - 1] == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int zza(int i9) {
        int i10;
        int i11;
        this.zzd += i9;
        int i12 = 0;
        while (true) {
            i10 = this.zzd;
            i11 = 2;
            if (i10 <= 8) {
                break;
            }
            int i13 = i10 - 8;
            this.zzd = i13;
            byte[] bArr = this.zza;
            int i14 = this.zzc;
            i12 |= (bArr[i14] & 255) << i13;
            if (true != zzi(i14 + 1)) {
                i11 = 1;
            }
            this.zzc = i14 + i11;
        }
        byte[] bArr2 = this.zza;
        int i15 = this.zzc;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i10));
        int i17 = 32 - i9;
        if (i10 == 8) {
            this.zzd = 0;
            if (true != zzi(i15 + 1)) {
                i11 = 1;
            }
            this.zzc = i15 + i11;
        }
        int i18 = ((-1) >>> i17) & i16;
        zzh();
        return i18;
    }

    public final int zzb() {
        int zzg = zzg();
        int i9 = zzg % 2;
        int i10 = 1;
        int i11 = zzg + 1;
        if (i9 == 0) {
            i10 = -1;
        }
        return (i11 / 2) * i10;
    }

    public final int zzc() {
        return zzg();
    }

    public final void zzd() {
        int i9 = 1;
        int i10 = this.zzd + 1;
        this.zzd = i10;
        if (i10 == 8) {
            this.zzd = 0;
            int i11 = this.zzc;
            if (true == zzi(i11 + 1)) {
                i9 = 2;
            }
            this.zzc = i11 + i9;
        }
        zzh();
    }

    public final void zze(int i9) {
        int i10 = this.zzc;
        int i11 = i9 / 8;
        int i12 = i10 + i11;
        this.zzc = i12;
        int i13 = (i9 - (i11 * 8)) + this.zzd;
        this.zzd = i13;
        if (i13 > 7) {
            this.zzc = i12 + 1;
            this.zzd = i13 - 8;
        }
        while (true) {
            i10++;
            if (i10 <= this.zzc) {
                if (zzi(i10)) {
                    this.zzc++;
                    i10 += 2;
                }
            } else {
                zzh();
                return;
            }
        }
    }

    public final boolean zzf() {
        int i9 = this.zza[this.zzc] & (128 >> this.zzd);
        zzd();
        if (i9 != 0) {
            return true;
        }
        return false;
    }
}
