package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzcv {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzcv(int i2, int i3, float f2, float f3, int i4) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = f2;
        this.zzd = f3;
        this.zze = i2 / i4;
        this.zzf = i2 / 400;
        int i5 = i2 / 65;
        this.zzg = i5;
        int i6 = i5 + i5;
        this.zzh = i6;
        this.zzi = new short[i6];
        int i7 = i6 * i3;
        this.zzj = new short[i7];
        this.zzl = new short[i7];
        this.zzn = new short[i7];
    }

    private final int zzg(short[] sArr, int i2, int i3, int i4) {
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i3 <= i4) {
            int i9 = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                int i11 = this.zzb * i2;
                i9 += Math.abs(sArr[i11 + i10] - sArr[(i11 + i3) + i10]);
            }
            int i12 = i9 * i7;
            int i13 = i5 * i3;
            if (i12 < i13) {
                i5 = i9;
            }
            if (i12 < i13) {
                i7 = i3;
            }
            int i14 = i9 * i6;
            int i15 = i8 * i3;
            if (i14 > i15) {
                i8 = i9;
            }
            if (i14 > i15) {
                i6 = i3;
            }
            i3++;
        }
        this.zzu = i5 / i7;
        this.zzv = i8 / i6;
        return i7;
    }

    private final void zzh(short[] sArr, int i2, int i3) {
        short[] zzl = zzl(this.zzl, this.zzm, i3);
        this.zzl = zzl;
        int i4 = this.zzm;
        int i5 = this.zzb;
        System.arraycopy(sArr, i2 * i5, zzl, i4 * i5, i3 * i5);
        this.zzm += i3;
    }

    private final void zzi(short[] sArr, int i2, int i3) {
        int i4;
        for (int i5 = 0; i5 < this.zzh / i3; i5++) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int i8 = this.zzb;
                i4 = i8 * i3;
                if (i6 < i4) {
                    i7 += sArr[androidx.compose.foundation.text.input.a.a(i5, i4, i8 * i2, i6)];
                    i6++;
                }
            }
            this.zzi[i5] = (short) (i7 / i4);
        }
    }

    private static void zzj(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr3[i9] * i11) + ((i2 - i11) * sArr2[i8])) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    private final void zzk() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2 = this.zzc / this.zzd;
        double d = f2;
        int i10 = this.zzm;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.zzk;
            if (i11 >= this.zzh) {
                int i12 = 0;
                do {
                    int i13 = this.zzr;
                    if (i13 > 0) {
                        int min = Math.min(this.zzh, i13);
                        zzh(this.zzj, i12, min);
                        this.zzr -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i14 = this.zza;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.zzb == 1 && i15 == 1) {
                            i2 = zzg(sArr, i12, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i12, i15);
                            int zzg = zzg(this.zzi, 0, this.zzf / i15, this.zzg / i15);
                            if (i15 != 1) {
                                int i16 = zzg * i15;
                                int i17 = i15 * 4;
                                int i18 = this.zzf;
                                int i19 = i16 - i17;
                                if (i19 >= i18) {
                                    i18 = i19;
                                }
                                int i20 = i16 + i17;
                                int i21 = this.zzg;
                                if (i20 > i21) {
                                    i20 = i21;
                                }
                                if (this.zzb == 1) {
                                    i2 = zzg(sArr, i12, i18, i20);
                                } else {
                                    zzi(sArr, i12, 1);
                                    i2 = zzg(this.zzi, 0, i18, i20);
                                }
                            } else {
                                i2 = zzg;
                            }
                        }
                        int i22 = this.zzu;
                        int i23 = (i22 == 0 || (i5 = this.zzs) == 0 || this.zzv > i22 * 3 || i22 + i22 <= this.zzt * 3) ? i2 : i5;
                        int i24 = i12 + i23;
                        this.zzt = i22;
                        this.zzs = i2;
                        float f3 = i23;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzj;
                            float f4 = (-1.0f) + f2;
                            if (f2 >= 2.0f) {
                                i4 = (int) (f3 / f4);
                            } else {
                                this.zzr = (int) (((2.0f - f2) * f3) / f4);
                                i4 = i23;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i4);
                            this.zzl = zzl;
                            int i25 = i4;
                            zzj(i4, this.zzb, zzl, this.zzm, sArr2, i12, sArr2, i24);
                            this.zzm += i25;
                            i12 = i23 + i25 + i12;
                        } else {
                            int i26 = i23;
                            short[] sArr3 = this.zzj;
                            float f5 = 1.0f - f2;
                            if (f2 < 0.5f) {
                                i3 = (int) ((f3 * f2) / f5);
                            } else {
                                this.zzr = (int) ((((f2 + f2) - 1.0f) * f3) / f5);
                                i3 = i26;
                            }
                            int i27 = i26 + i3;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i27);
                            this.zzl = zzl2;
                            int i28 = this.zzb;
                            System.arraycopy(sArr3, i12 * i28, zzl2, this.zzm * i28, i28 * i26);
                            zzj(i3, this.zzb, this.zzl, this.zzm + i26, sArr3, i24, sArr3, i12);
                            this.zzm += i27;
                            i12 += i3;
                        }
                    }
                } while (this.zzh + i12 <= i11);
                int i29 = this.zzk - i12;
                short[] sArr4 = this.zzj;
                int i30 = this.zzb;
                System.arraycopy(sArr4, i12 * i30, sArr4, 0, i30 * i29);
                this.zzk = i29;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        float f6 = this.zze * this.zzd;
        if (f6 == 1.0f || this.zzm == i10) {
            return;
        }
        int i31 = this.zza;
        int i32 = (int) (i31 / f6);
        while (true) {
            if (i32 <= 16384 && i31 <= 16384) {
                break;
            }
            i32 /= 2;
            i31 /= 2;
        }
        int i33 = this.zzm - i10;
        short[] zzl3 = zzl(this.zzn, this.zzo, i33);
        this.zzn = zzl3;
        short[] sArr5 = this.zzl;
        int i34 = this.zzb;
        System.arraycopy(sArr5, i10 * i34, zzl3, this.zzo * i34, i34 * i33);
        this.zzm = i10;
        this.zzo += i33;
        int i35 = 0;
        while (true) {
            i6 = this.zzo;
            i7 = i6 - 1;
            if (i35 >= i7) {
                break;
            }
            while (true) {
                i8 = this.zzp + 1;
                int i36 = i8 * i32;
                i9 = this.zzq;
                if (i36 <= i9 * i31) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i37 = 0;
                while (true) {
                    int i38 = this.zzb;
                    if (i37 < i38) {
                        short[] sArr6 = this.zzl;
                        int i39 = this.zzm * i38;
                        short[] sArr7 = this.zzn;
                        int i40 = (i35 * i38) + i37;
                        short s2 = sArr7[i40];
                        short s3 = sArr7[i40 + i38];
                        int i41 = this.zzq * i31;
                        int i42 = this.zzp;
                        int i43 = i42 * i32;
                        int i44 = (i42 + 1) * i32;
                        int i45 = i44 - i41;
                        int i46 = i44 - i43;
                        sArr6[i39 + i37] = (short) ((((i46 - i45) * s3) + (s2 * i45)) / i46);
                        i37++;
                    }
                }
                this.zzq++;
                this.zzm++;
            }
            this.zzp = i8;
            if (i8 == i31) {
                this.zzp = 0;
                zzdi.zzf(i9 == i32);
                this.zzq = 0;
            }
            i35++;
        }
        if (i7 != 0) {
            short[] sArr8 = this.zzn;
            int i47 = this.zzb;
            System.arraycopy(sArr8, i7 * i47, sArr8, 0, (i6 - i7) * i47);
            this.zzo -= i7;
        }
    }

    private final short[] zzl(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.zzb;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public final int zza() {
        int i2 = this.zzm * this.zzb;
        return i2 + i2;
    }

    public final int zzb() {
        int i2 = this.zzk * this.zzb;
        return i2 + i2;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i2 = this.zzm - min;
        this.zzm = i2;
        int i3 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
    }

    public final void zze() {
        int i2;
        int i3 = this.zzk;
        int i4 = this.zzm;
        float f2 = this.zzo;
        float f3 = this.zzc;
        float f4 = this.zze;
        float f5 = this.zzd;
        int i5 = i4 + ((int) ((((i3 / (f3 / f5)) + f2) / (f4 * f5)) + 0.5f));
        int i6 = this.zzh;
        this.zzj = zzl(this.zzj, i3, i6 + i6 + i3);
        int i7 = 0;
        while (true) {
            int i8 = this.zzh;
            int i9 = this.zzb;
            i2 = i8 + i8;
            if (i7 >= i2 * i9) {
                break;
            }
            this.zzj[(i9 * i3) + i7] = 0;
            i7++;
        }
        this.zzk += i2;
        zzk();
        if (this.zzm > i5) {
            this.zzm = i5;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.zzb;
        int i3 = remaining / i2;
        int i4 = i2 * i3;
        short[] zzl = zzl(this.zzj, this.zzk, i3);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i4 + i4) / 2);
        this.zzk += i3;
        zzk();
    }
}
