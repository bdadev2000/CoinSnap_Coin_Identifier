package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.internal.measurement.zzjt;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzig {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int zzd(byte[] bArr, int i10, zzij zzijVar) {
        int i11 = i10 + 1;
        long j3 = bArr[i10];
        if (j3 >= 0) {
            zzijVar.zzb = j3;
            return i11;
        }
        int i12 = i11 + 1;
        byte b3 = bArr[i11];
        long j10 = (j3 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b3 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (r10 & Byte.MAX_VALUE) << i13;
            b3 = bArr[i12];
            i12 = i14;
        }
        zzijVar.zzb = j10;
        return i12;
    }

    public static int zza(byte[] bArr, int i10, zzij zzijVar) throws zzkb {
        int zzc = zzc(bArr, i10, zzijVar);
        int i11 = zzijVar.zza;
        if (i11 >= 0) {
            if (i11 > bArr.length - zzc) {
                throw zzkb.zzi();
            }
            if (i11 == 0) {
                zzijVar.zzc = zzik.zza;
                return zzc;
            }
            zzijVar.zzc = zzik.zza(bArr, zzc, i11);
            return zzc + i11;
        }
        throw zzkb.zzf();
    }

    public static int zzb(zzlu<?> zzluVar, int i10, byte[] bArr, int i11, int i12, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int zza2 = zza(zzluVar, bArr, i11, i12, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (zza2 < i12) {
            int zzc = zzc(bArr, zza2, zzijVar);
            if (i10 != zzijVar.zza) {
                break;
            }
            zza2 = zza(zzluVar, bArr, zzc, i12, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return zza2;
    }

    public static int zzc(byte[] bArr, int i10, zzij zzijVar) {
        int i11 = i10 + 1;
        byte b3 = bArr[i10];
        if (b3 >= 0) {
            zzijVar.zza = b3;
            return i11;
        }
        return zza(b3, bArr, i11, zzijVar);
    }

    public static long zzd(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i10, zzij zzijVar) throws zzkb {
        int zzc = zzc(bArr, i10, zzijVar);
        int i11 = zzijVar.zza;
        if (i11 < 0) {
            throw zzkb.zzf();
        }
        if (i11 == 0) {
            zzijVar.zzc = "";
            return zzc;
        }
        zzijVar.zzc = zzmp.zzb(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, Object obj, zzlc zzlcVar, zzmk<zzmj, zzmj> zzmkVar, zzij zzijVar) throws IOException {
        if (zzijVar.zzd.zza(zzlcVar, i10 >>> 3) == null) {
            return zza(i10, bArr, i11, i12, zzlg.zzc(obj), zzijVar);
        }
        zzjt.zzd zzdVar = (zzjt.zzd) obj;
        zzdVar.zza();
        zzjm<zzjt.zzc> zzjmVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static int zza(zzlu zzluVar, byte[] bArr, int i10, int i11, int i12, zzij zzijVar) throws IOException {
        Object zza2 = zzluVar.zza();
        int zza3 = zza(zza2, zzluVar, bArr, i10, i11, i12, zzijVar);
        zzluVar.zzd(zza2);
        zzijVar.zzc = zza2;
        return zza3;
    }

    public static int zza(zzlu zzluVar, int i10, byte[] bArr, int i11, int i12, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int zza2 = zza(zzluVar, bArr, i11, i12, i13, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (zza2 < i12) {
            int zzc = zzc(bArr, zza2, zzijVar);
            if (i10 != zzijVar.zza) {
                break;
            }
            zza2 = zza(zzluVar, bArr, zzc, i12, i13, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return zza2;
    }

    public static int zza(zzlu zzluVar, byte[] bArr, int i10, int i11, zzij zzijVar) throws IOException {
        Object zza2 = zzluVar.zza();
        int zza3 = zza(zza2, zzluVar, bArr, i10, i11, zzijVar);
        zzluVar.zzd(zza2);
        zzijVar.zzc = zza2;
        return zza3;
    }

    public static int zza(byte[] bArr, int i10, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int zzc = zzc(bArr, i10, zzijVar);
        int i11 = zzijVar.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzkb.zzi();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzmj zzmjVar, zzij zzijVar) throws zzkb {
        if ((i10 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzd = zzd(bArr, i11, zzijVar);
            zzmjVar.zza(i10, Long.valueOf(zzijVar.zzb));
            return zzd;
        }
        if (i13 == 1) {
            zzmjVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzc = zzc(bArr, i11, zzijVar);
            int i14 = zzijVar.zza;
            if (i14 >= 0) {
                if (i14 > bArr.length - zzc) {
                    throw zzkb.zzi();
                }
                if (i14 == 0) {
                    zzmjVar.zza(i10, zzik.zza);
                } else {
                    zzmjVar.zza(i10, zzik.zza(bArr, zzc, i14));
                }
                return zzc + i14;
            }
            throw zzkb.zzf();
        }
        if (i13 != 3) {
            if (i13 == 5) {
                zzmjVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
                return i11 + 4;
            }
            throw zzkb.zzc();
        }
        zzmj zzd2 = zzmj.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = zzijVar.zze + 1;
        zzijVar.zze = i16;
        zza(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, i11, zzijVar);
            int i18 = zzijVar.zza;
            i17 = i18;
            if (i18 == i15) {
                i11 = zzc2;
                break;
            }
            int zza2 = zza(i17, bArr, zzc2, i12, zzd2, zzijVar);
            i17 = i18;
            i11 = zza2;
        }
        zzijVar.zze--;
        if (i11 <= i12 && i17 == i15) {
            zzmjVar.zza(i10, zzd2);
            return i11;
        }
        throw zzkb.zzg();
    }

    public static int zza(int i10, byte[] bArr, int i11, zzij zzijVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b3 = bArr[i11];
        if (b3 >= 0) {
            zzijVar.zza = i12 | (b3 << 7);
            return i13;
        }
        int i14 = i12 | ((b3 & Byte.MAX_VALUE) << 7);
        int i15 = i13 + 1;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            zzijVar.zza = i14 | (b10 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            zzijVar.zza = i16 | (b11 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            zzijVar.zza = i18 | (b12 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                zzijVar.zza = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzkc<?> zzkcVar, zzij zzijVar) {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int zzc = zzc(bArr, i11, zzijVar);
        zzjwVar.zzd(zzijVar.zza);
        while (zzc < i12) {
            int zzc2 = zzc(bArr, zzc, zzijVar);
            if (i10 != zzijVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        return zzc;
    }

    public static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i10, int i11, int i12, zzij zzijVar) throws IOException {
        zzlg zzlgVar = (zzlg) zzluVar;
        int i13 = zzijVar.zze + 1;
        zzijVar.zze = i13;
        zza(i13);
        int zza2 = zzlgVar.zza((zzlg) obj, bArr, i10, i11, i12, zzijVar);
        zzijVar.zze--;
        zzijVar.zzc = obj;
        return zza2;
    }

    public static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i10, int i11, zzij zzijVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zza(i13, bArr, i12, zzijVar);
            i13 = zzijVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = zzijVar.zze + 1;
            zzijVar.zze = i15;
            zza(i15);
            int i16 = i13 + i14;
            zzluVar.zza(obj, bArr, i14, i16, zzijVar);
            zzijVar.zze--;
            zzijVar.zzc = obj;
            return i16;
        }
        throw zzkb.zzi();
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzij zzijVar) throws zzkb {
        if ((i10 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzijVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzijVar) + zzijVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzkb.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzijVar);
            i15 = zzijVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzijVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzkb.zzg();
        }
        return i11;
    }

    private static void zza(int i10) throws zzkb {
        if (i10 >= zza) {
            throw zzkb.zzh();
        }
    }
}
