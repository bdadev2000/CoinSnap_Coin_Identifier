package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class zzeb {
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

    public zzeb(int i9, int i10, float f9, float f10, int i11) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = f9;
        this.zzd = f10;
        this.zze = i9 / i11;
        this.zzf = i9 / 400;
        int i12 = i9 / 65;
        this.zzg = i12;
        int i13 = i12 + i12;
        this.zzh = i13;
        this.zzi = new short[i13];
        int i14 = i13 * i10;
        this.zzj = new short[i14];
        this.zzl = new short[i14];
        this.zzn = new short[i14];
    }

    private final int zzg(short[] sArr, int i9, int i10, int i11) {
        int i12 = 1;
        int i13 = 255;
        int i14 = 0;
        int i15 = 0;
        while (i10 <= i11) {
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = this.zzb * i9;
                i16 += Math.abs(sArr[i18 + i17] - sArr[(i18 + i10) + i17]);
            }
            int i19 = i16 * i14;
            int i20 = i12 * i10;
            if (i19 < i20) {
                i12 = i16;
            }
            if (i19 < i20) {
                i14 = i10;
            }
            int i21 = i16 * i13;
            int i22 = i15 * i10;
            if (i21 > i22) {
                i15 = i16;
            }
            if (i21 > i22) {
                i13 = i10;
            }
            i10++;
        }
        this.zzu = i12 / i14;
        this.zzv = i15 / i13;
        return i14;
    }

    private final void zzh(short[] sArr, int i9, int i10) {
        short[] zzl = zzl(this.zzl, this.zzm, i10);
        this.zzl = zzl;
        int i11 = this.zzm;
        int i12 = this.zzb;
        System.arraycopy(sArr, i9 * i12, zzl, i11 * i12, i10 * i12);
        this.zzm += i10;
    }

    private final void zzi(short[] sArr, int i9, int i10) {
        int i11;
        for (int i12 = 0; i12 < this.zzh / i10; i12++) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int i15 = this.zzb;
                i11 = i15 * i10;
                if (i13 < i11) {
                    i14 += sArr[(i11 * i12) + (i15 * i9) + i13];
                    i13++;
                }
            }
            this.zzi[i12] = (short) (i14 / i11);
        }
    }

    private static void zzj(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i12 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i11 * i10) + i14;
            for (int i18 = 0; i18 < i9; i18++) {
                sArr[i17] = (short) (((sArr3[i16] * i18) + ((i9 - i18) * sArr2[i15])) / i9);
                i17 += i10;
                i15 += i10;
                i16 += i10;
            }
        }
    }

    private final void zzk() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z8;
        float f9 = this.zzc / this.zzd;
        double d2 = f9;
        int i19 = this.zzm;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        } else {
            int i20 = this.zzk;
            if (i20 >= this.zzh) {
                int i21 = 0;
                do {
                    int i22 = this.zzr;
                    if (i22 > 0) {
                        int min = Math.min(this.zzh, i22);
                        zzh(this.zzj, i21, min);
                        this.zzr -= min;
                        i21 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i23 = this.zza;
                        if (i23 > 4000) {
                            i9 = i23 / 4000;
                        } else {
                            i9 = 1;
                        }
                        if (this.zzb == 1 && i9 == 1) {
                            i10 = zzg(sArr, i21, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i21, i9);
                            int zzg = zzg(this.zzi, 0, this.zzf / i9, this.zzg / i9);
                            if (i9 != 1) {
                                int i24 = zzg * i9;
                                int i25 = i9 * 4;
                                int i26 = this.zzf;
                                int i27 = i24 - i25;
                                if (i27 >= i26) {
                                    i26 = i27;
                                }
                                int i28 = i24 + i25;
                                int i29 = this.zzg;
                                if (i28 > i29) {
                                    i28 = i29;
                                }
                                if (this.zzb == 1) {
                                    i10 = zzg(sArr, i21, i26, i28);
                                } else {
                                    zzi(sArr, i21, 1);
                                    i10 = zzg(this.zzi, 0, i26, i28);
                                }
                            } else {
                                i10 = zzg;
                            }
                        }
                        int i30 = this.zzu;
                        int i31 = this.zzv;
                        if (i30 != 0 && (i14 = this.zzs) != 0 && i31 <= i30 * 3 && i30 + i30 > this.zzt * 3) {
                            i11 = i14;
                        } else {
                            i11 = i10;
                        }
                        int i32 = i21 + i11;
                        this.zzt = i30;
                        this.zzs = i10;
                        float f10 = i11;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            float f11 = (-1.0f) + f9;
                            if (f9 >= 2.0f) {
                                i13 = (int) (f10 / f11);
                            } else {
                                this.zzr = (int) (((2.0f - f9) * f10) / f11);
                                i13 = i11;
                            }
                            short[] zzl = zzl(this.zzl, this.zzm, i13);
                            this.zzl = zzl;
                            int i33 = i13;
                            zzj(i13, this.zzb, zzl, this.zzm, sArr2, i21, sArr2, i32);
                            this.zzm += i33;
                            i21 = i11 + i33 + i21;
                        } else {
                            int i34 = i11;
                            short[] sArr3 = this.zzj;
                            float f12 = 1.0f - f9;
                            if (f9 < 0.5f) {
                                i12 = (int) ((f10 * f9) / f12);
                            } else {
                                this.zzr = (int) ((((f9 + f9) - 1.0f) * f10) / f12);
                                i12 = i34;
                            }
                            int i35 = i34 + i12;
                            short[] zzl2 = zzl(this.zzl, this.zzm, i35);
                            this.zzl = zzl2;
                            int i36 = this.zzb;
                            System.arraycopy(sArr3, i21 * i36, zzl2, this.zzm * i36, i36 * i34);
                            zzj(i12, this.zzb, this.zzl, this.zzm + i34, sArr3, i32, sArr3, i21);
                            this.zzm += i35;
                            i21 += i12;
                        }
                    }
                } while (this.zzh + i21 <= i20);
                int i37 = this.zzk - i21;
                short[] sArr4 = this.zzj;
                int i38 = this.zzb;
                System.arraycopy(sArr4, i21 * i38, sArr4, 0, i38 * i37);
                this.zzk = i37;
            }
        }
        float f13 = this.zze * this.zzd;
        if (f13 != 1.0f && this.zzm != i19) {
            int i39 = this.zza;
            int i40 = (int) (i39 / f13);
            while (true) {
                if (i40 <= 16384 && i39 <= 16384) {
                    break;
                }
                i40 /= 2;
                i39 /= 2;
            }
            int i41 = this.zzm - i19;
            short[] zzl3 = zzl(this.zzn, this.zzo, i41);
            this.zzn = zzl3;
            short[] sArr5 = this.zzl;
            int i42 = this.zzb;
            System.arraycopy(sArr5, i19 * i42, zzl3, this.zzo * i42, i42 * i41);
            this.zzm = i19;
            this.zzo += i41;
            int i43 = 0;
            while (true) {
                i15 = this.zzo;
                i16 = i15 - 1;
                if (i43 >= i16) {
                    break;
                }
                while (true) {
                    i17 = this.zzp + 1;
                    int i44 = i17 * i40;
                    i18 = this.zzq;
                    if (i44 <= i18 * i39) {
                        break;
                    }
                    this.zzl = zzl(this.zzl, this.zzm, 1);
                    int i45 = 0;
                    while (true) {
                        int i46 = this.zzb;
                        if (i45 < i46) {
                            short[] sArr6 = this.zzl;
                            int i47 = this.zzm * i46;
                            short[] sArr7 = this.zzn;
                            int i48 = (i43 * i46) + i45;
                            short s5 = sArr7[i48];
                            short s9 = sArr7[i48 + i46];
                            int i49 = this.zzq * i39;
                            int i50 = this.zzp;
                            int i51 = i50 * i40;
                            int i52 = (i50 + 1) * i40;
                            int i53 = i52 - i49;
                            int i54 = i52 - i51;
                            sArr6[i47 + i45] = (short) ((((i54 - i53) * s9) + (s5 * i53)) / i54);
                            i45++;
                        }
                    }
                    this.zzq++;
                    this.zzm++;
                }
                this.zzp = i17;
                if (i17 == i39) {
                    this.zzp = 0;
                    if (i18 == i40) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zzeq.zzf(z8);
                    this.zzq = 0;
                }
                i43++;
            }
            if (i16 != 0) {
                short[] sArr8 = this.zzn;
                int i55 = this.zzb;
                System.arraycopy(sArr8, i16 * i55, sArr8, 0, (i15 - i16) * i55);
                this.zzo -= i16;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.zzb;
        int i12 = length / i11;
        if (i9 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int zza() {
        int i9 = this.zzm * this.zzb;
        return i9 + i9;
    }

    public final int zzb() {
        int i9 = this.zzk * this.zzb;
        return i9 + i9;
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
        int i9 = this.zzm - min;
        this.zzm = i9;
        int i10 = this.zzb;
        short[] sArr = this.zzl;
        System.arraycopy(sArr, min * i10, sArr, 0, i9 * i10);
    }

    public final void zze() {
        int i9;
        int i10 = this.zzk;
        int i11 = this.zzm;
        float f9 = this.zzo;
        float f10 = this.zzc;
        float f11 = this.zze;
        float f12 = this.zzd;
        int i12 = i11 + ((int) ((((i10 / (f10 / f12)) + f9) / (f11 * f12)) + 0.5f));
        int i13 = this.zzh;
        this.zzj = zzl(this.zzj, i10, i13 + i13 + i10);
        int i14 = 0;
        while (true) {
            int i15 = this.zzh;
            int i16 = this.zzb;
            i9 = i15 + i15;
            if (i14 >= i9 * i16) {
                break;
            }
            this.zzj[(i16 * i10) + i14] = 0;
            i14++;
        }
        this.zzk += i9;
        zzk();
        if (this.zzm > i12) {
            this.zzm = i12;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i9 = this.zzb;
        int i10 = remaining / i9;
        int i11 = i9 * i10;
        short[] zzl = zzl(this.zzj, this.zzk, i10);
        this.zzj = zzl;
        shortBuffer.get(zzl, this.zzk * this.zzb, (i11 + i11) / 2);
        this.zzk += i10;
        zzk();
    }
}
