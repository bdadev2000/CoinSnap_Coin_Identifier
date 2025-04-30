package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhw {
    public static double zza(byte[] bArr, int i9) {
        return Double.longBitsToDouble(zzd(bArr, i9));
    }

    public static float zzb(byte[] bArr, int i9) {
        return Float.intBitsToFloat(zzc(bArr, i9));
    }

    public static int zzc(byte[] bArr, int i9) {
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i9, zzhv zzhvVar) {
        int i10 = i9 + 1;
        long j7 = bArr[i9];
        if (j7 >= 0) {
            zzhvVar.zzb = j7;
            return i10;
        }
        int i11 = i9 + 2;
        byte b = bArr[i10];
        long j9 = (j7 & 127) | ((b & Ascii.DEL) << 7);
        int i12 = 7;
        while (b < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j9 |= (r10 & Ascii.DEL) << i12;
            b = bArr[i11];
            i11 = i13;
        }
        zzhvVar.zzb = j9;
        return i11;
    }

    public static int zza(byte[] bArr, int i9, zzhv zzhvVar) throws zzjs {
        int zzc = zzc(bArr, i9, zzhvVar);
        int i10 = zzhvVar.zza;
        if (i10 >= 0) {
            if (i10 > bArr.length - zzc) {
                throw zzjs.zzh();
            }
            if (i10 == 0) {
                zzhvVar.zzc = zzia.zza;
                return zzc;
            }
            zzhvVar.zzc = zzia.zza(bArr, zzc, i10);
            return zzc + i10;
        }
        throw zzjs.zzf();
    }

    public static int zzb(byte[] bArr, int i9, zzhv zzhvVar) throws zzjs {
        int zzc = zzc(bArr, i9, zzhvVar);
        int i10 = zzhvVar.zza;
        if (i10 < 0) {
            throw zzjs.zzf();
        }
        if (i10 == 0) {
            zzhvVar.zzc = "";
            return zzc;
        }
        zzhvVar.zzc = zzmk.zzb(bArr, zzc, i10);
        return zzc + i10;
    }

    public static int zzc(byte[] bArr, int i9, zzhv zzhvVar) {
        int i10 = i9 + 1;
        byte b = bArr[i9];
        if (b >= 0) {
            zzhvVar.zza = b;
            return i10;
        }
        return zza(b, bArr, i10, zzhvVar);
    }

    public static long zzd(byte[] bArr, int i9) {
        return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public static int zza(zzll zzllVar, byte[] bArr, int i9, int i10, int i11, zzhv zzhvVar) throws IOException {
        Object zza = zzllVar.zza();
        int zza2 = zza(zza, zzllVar, bArr, i9, i10, i11, zzhvVar);
        zzllVar.zzc(zza);
        zzhvVar.zzc = zza;
        return zza2;
    }

    public static int zza(zzll zzllVar, byte[] bArr, int i9, int i10, zzhv zzhvVar) throws IOException {
        Object zza = zzllVar.zza();
        int zza2 = zza(zza, zzllVar, bArr, i9, i10, zzhvVar);
        zzllVar.zzc(zza);
        zzhvVar.zzc = zza;
        return zza2;
    }

    public static int zza(zzll<?> zzllVar, int i9, byte[] bArr, int i10, int i11, zzjt<?> zzjtVar, zzhv zzhvVar) throws IOException {
        int zza = zza(zzllVar, bArr, i10, i11, zzhvVar);
        zzjtVar.add(zzhvVar.zzc);
        while (zza < i11) {
            int zzc = zzc(bArr, zza, zzhvVar);
            if (i9 != zzhvVar.zza) {
                break;
            }
            zza = zza(zzllVar, bArr, zzc, i11, zzhvVar);
            zzjtVar.add(zzhvVar.zzc);
        }
        return zza;
    }

    public static int zza(byte[] bArr, int i9, zzjt<?> zzjtVar, zzhv zzhvVar) throws IOException {
        zzjn zzjnVar = (zzjn) zzjtVar;
        int zzc = zzc(bArr, i9, zzhvVar);
        int i10 = zzhvVar.zza + zzc;
        while (zzc < i10) {
            zzc = zzc(bArr, zzc, zzhvVar);
            zzjnVar.zzd(zzhvVar.zza);
        }
        if (zzc == i10) {
            return zzc;
        }
        throw zzjs.zzh();
    }

    public static int zza(int i9, byte[] bArr, int i10, int i11, zzme zzmeVar, zzhv zzhvVar) throws zzjs {
        if ((i9 >>> 3) == 0) {
            throw zzjs.zzc();
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            int zzd = zzd(bArr, i10, zzhvVar);
            zzmeVar.zza(i9, Long.valueOf(zzhvVar.zzb));
            return zzd;
        }
        if (i12 == 1) {
            zzmeVar.zza(i9, Long.valueOf(zzd(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int zzc = zzc(bArr, i10, zzhvVar);
            int i13 = zzhvVar.zza;
            if (i13 >= 0) {
                if (i13 > bArr.length - zzc) {
                    throw zzjs.zzh();
                }
                if (i13 == 0) {
                    zzmeVar.zza(i9, zzia.zza);
                } else {
                    zzmeVar.zza(i9, zzia.zza(bArr, zzc, i13));
                }
                return zzc + i13;
            }
            throw zzjs.zzf();
        }
        if (i12 != 3) {
            if (i12 == 5) {
                zzmeVar.zza(i9, Integer.valueOf(zzc(bArr, i10)));
                return i10 + 4;
            }
            throw zzjs.zzc();
        }
        zzme zzd2 = zzme.zzd();
        int i14 = (i9 & (-8)) | 4;
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int zzc2 = zzc(bArr, i10, zzhvVar);
            int i16 = zzhvVar.zza;
            i15 = i16;
            if (i16 == i14) {
                i10 = zzc2;
                break;
            }
            int zza = zza(i15, bArr, zzc2, i11, zzd2, zzhvVar);
            i15 = i16;
            i10 = zza;
        }
        if (i10 <= i11 && i15 == i14) {
            zzmeVar.zza(i9, zzd2);
            return i10;
        }
        throw zzjs.zzg();
    }

    public static int zza(int i9, byte[] bArr, int i10, zzhv zzhvVar) {
        int i11 = i9 & 127;
        int i12 = i10 + 1;
        byte b = bArr[i10];
        if (b >= 0) {
            zzhvVar.zza = i11 | (b << 7);
            return i12;
        }
        int i13 = i11 | ((b & Ascii.DEL) << 7);
        int i14 = i10 + 2;
        byte b8 = bArr[i12];
        if (b8 >= 0) {
            zzhvVar.zza = i13 | (b8 << Ascii.SO);
            return i14;
        }
        int i15 = i13 | ((b8 & Ascii.DEL) << 14);
        int i16 = i10 + 3;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            zzhvVar.zza = i15 | (b9 << Ascii.NAK);
            return i16;
        }
        int i17 = i15 | ((b9 & Ascii.DEL) << 21);
        int i18 = i10 + 4;
        byte b10 = bArr[i16];
        if (b10 >= 0) {
            zzhvVar.zza = i17 | (b10 << Ascii.FS);
            return i18;
        }
        int i19 = i17 | ((b10 & Ascii.DEL) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzhvVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zza(int i9, byte[] bArr, int i10, int i11, zzjt<?> zzjtVar, zzhv zzhvVar) {
        zzjn zzjnVar = (zzjn) zzjtVar;
        int zzc = zzc(bArr, i10, zzhvVar);
        zzjnVar.zzd(zzhvVar.zza);
        while (zzc < i11) {
            int zzc2 = zzc(bArr, zzc, zzhvVar);
            if (i9 != zzhvVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzhvVar);
            zzjnVar.zzd(zzhvVar.zza);
        }
        return zzc;
    }

    public static int zza(Object obj, zzll zzllVar, byte[] bArr, int i9, int i10, int i11, zzhv zzhvVar) throws IOException {
        int zza = ((zzkx) zzllVar).zza((zzkx) obj, bArr, i9, i10, i11, zzhvVar);
        zzhvVar.zzc = obj;
        return zza;
    }

    public static int zza(Object obj, zzll zzllVar, byte[] bArr, int i9, int i10, zzhv zzhvVar) throws IOException {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = zza(i12, bArr, i11, zzhvVar);
            i12 = zzhvVar.zza;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = i12 + i13;
            zzllVar.zza(obj, bArr, i13, i14, zzhvVar);
            zzhvVar.zzc = obj;
            return i14;
        }
        throw zzjs.zzh();
    }

    public static int zza(int i9, byte[] bArr, int i10, int i11, zzhv zzhvVar) throws zzjs {
        if ((i9 >>> 3) == 0) {
            throw zzjs.zzc();
        }
        int i12 = i9 & 7;
        if (i12 == 0) {
            return zzd(bArr, i10, zzhvVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzc(bArr, i10, zzhvVar) + zzhvVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw zzjs.zzc();
        }
        int i13 = (i9 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzc(bArr, i10, zzhvVar);
            i14 = zzhvVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zza(i14, bArr, i10, i11, zzhvVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw zzjs.zzg();
        }
        return i10;
    }
}
