package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* loaded from: classes3.dex */
public final class zzfq {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    public zzfq(byte[] bArr, int i10, int i11) {
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = i11;
        zzj();
    }

    private final int zzi() {
        int i10 = 0;
        int i11 = 0;
        while (!zzh()) {
            i11++;
        }
        int i12 = 1 << i11;
        if (i11 > 0) {
            i10 = zza(i11);
        }
        return (i12 - 1) + i10;
    }

    private final void zzj() {
        int i10;
        int i11 = this.zzc;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.zzb) || (i11 == i10 && this.zzd == 0))) {
            z10 = true;
        }
        zzdb.zzf(z10);
    }

    private final boolean zzk(int i10) {
        if (i10 < 2 || i10 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final int zza(int i10) {
        int i11;
        int i12;
        this.zzd += i10;
        int i13 = 0;
        while (true) {
            i11 = this.zzd;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.zzd = i14;
            byte[] bArr = this.zza;
            int i15 = this.zzc;
            i13 |= (bArr[i15] & UByte.MAX_VALUE) << i14;
            if (true != zzk(i15 + 1)) {
                i12 = 1;
            }
            this.zzc = i15 + i12;
        }
        byte[] bArr2 = this.zza;
        int i16 = this.zzc;
        int i17 = i13 | ((bArr2[i16] & UByte.MAX_VALUE) >> (8 - i11));
        int i18 = 32 - i10;
        if (i11 == 8) {
            this.zzd = 0;
            if (true != zzk(i16 + 1)) {
                i12 = 1;
            }
            this.zzc = i16 + i12;
        }
        int i19 = ((-1) >>> i18) & i17;
        zzj();
        return i19;
    }

    public final int zzb() {
        int zzi = zzi();
        int i10 = zzi % 2;
        return ((zzi + 1) / 2) * (i10 == 0 ? -1 : 1);
    }

    public final int zzc() {
        return zzi();
    }

    public final void zzd() {
        int i10 = this.zzd;
        if (i10 > 0) {
            zzf(8 - i10);
        }
    }

    public final void zze() {
        int i10 = 1;
        int i11 = this.zzd + 1;
        this.zzd = i11;
        if (i11 == 8) {
            this.zzd = 0;
            int i12 = this.zzc;
            if (true == zzk(i12 + 1)) {
                i10 = 2;
            }
            this.zzc = i12 + i10;
        }
        zzj();
    }

    public final void zzf(int i10) {
        int i11 = this.zzc;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.zzc = i13;
        int i14 = (i10 - (i12 * 8)) + this.zzd;
        this.zzd = i14;
        if (i14 > 7) {
            this.zzc = i13 + 1;
            this.zzd = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 <= this.zzc) {
                if (zzk(i11)) {
                    this.zzc++;
                    i11 += 2;
                }
            } else {
                zzj();
                return;
            }
        }
    }

    public final boolean zzg(int i10) {
        int i11 = this.zzc;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.zzd + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.zzb) {
                break;
            }
            if (zzk(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.zzb;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean zzh() {
        int i10 = this.zza[this.zzc] & (128 >> this.zzd);
        zze();
        if (i10 != 0) {
            return true;
        }
        return false;
    }
}
