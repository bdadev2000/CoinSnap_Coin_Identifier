package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzig {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i2) {
        return Double.longBitsToDouble(zzd(bArr, i2));
    }

    public static float zzb(byte[] bArr, int i2) {
        return Float.intBitsToFloat(zzc(bArr, i2));
    }

    public static int zzc(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i2] & UnsignedBytes.MAX_VALUE) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static int zzd(byte[] bArr, int i2, zzij zzijVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zzijVar.zzb = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        zzijVar.zzb = j3;
        return i4;
    }

    public static int zza(byte[] bArr, int i2, zzij zzijVar) throws zzkb {
        int zzc = zzc(bArr, i2, zzijVar);
        int i3 = zzijVar.zza;
        if (i3 >= 0) {
            if (i3 > bArr.length - zzc) {
                throw zzkb.zzi();
            }
            if (i3 == 0) {
                zzijVar.zzc = zzik.zza;
                return zzc;
            }
            zzijVar.zzc = zzik.zza(bArr, zzc, i3);
            return zzc + i3;
        }
        throw zzkb.zzf();
    }

    public static int zzb(zzlu<?> zzluVar, int i2, byte[] bArr, int i3, int i4, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int zza2 = zza(zzluVar, bArr, i3, i4, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (zza2 < i4) {
            int zzc = zzc(bArr, zza2, zzijVar);
            if (i2 != zzijVar.zza) {
                break;
            }
            zza2 = zza(zzluVar, bArr, zzc, i4, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return zza2;
    }

    public static int zzc(byte[] bArr, int i2, zzij zzijVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            zzijVar.zza = b2;
            return i3;
        }
        return zza(b2, bArr, i3, zzijVar);
    }

    public static long zzd(byte[] bArr, int i2) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i2, zzij zzijVar) throws zzkb {
        int zzc = zzc(bArr, i2, zzijVar);
        int i3 = zzijVar.zza;
        if (i3 < 0) {
            throw zzkb.zzf();
        }
        if (i3 == 0) {
            zzijVar.zzc = "";
            return zzc;
        }
        zzijVar.zzc = zzmp.zzb(bArr, zzc, i3);
        return zzc + i3;
    }

    public static int zza(int i2, byte[] bArr, int i3, int i4, Object obj, zzlc zzlcVar, zzmk<zzmj, zzmj> zzmkVar, zzij zzijVar) throws IOException {
        if (zzijVar.zzd.zza(zzlcVar, i2 >>> 3) == null) {
            return zza(i2, bArr, i3, i4, zzlg.zzc(obj), zzijVar);
        }
        zzjt.zzd zzdVar = (zzjt.zzd) obj;
        zzdVar.zza();
        zzjm<zzjt.zzc> zzjmVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    private static int zza(zzlu zzluVar, byte[] bArr, int i2, int i3, int i4, zzij zzijVar) throws IOException {
        Object zza2 = zzluVar.zza();
        int zza3 = zza(zza2, zzluVar, bArr, i2, i3, i4, zzijVar);
        zzluVar.zzd(zza2);
        zzijVar.zzc = zza2;
        return zza3;
    }

    public static int zza(zzlu zzluVar, int i2, byte[] bArr, int i3, int i4, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        int i5 = (i2 & (-8)) | 4;
        int zza2 = zza(zzluVar, bArr, i3, i4, i5, zzijVar);
        zzkcVar.add(zzijVar.zzc);
        while (zza2 < i4) {
            int zzc = zzc(bArr, zza2, zzijVar);
            if (i2 != zzijVar.zza) {
                break;
            }
            zza2 = zza(zzluVar, bArr, zzc, i4, i5, zzijVar);
            zzkcVar.add(zzijVar.zzc);
        }
        return zza2;
    }

    public static int zza(zzlu zzluVar, byte[] bArr, int i2, int i3, zzij zzijVar) throws IOException {
        Object zza2 = zzluVar.zza();
        int zza3 = zza(zza2, zzluVar, bArr, i2, i3, zzijVar);
        zzluVar.zzd(zza2);
        zzijVar.zzc = zza2;
        return zza3;
    }

    public static int zza(byte[] bArr, int i2, zzkc<?> zzkcVar, zzij zzijVar) throws IOException {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int zzc = zzc(bArr, i2, zzijVar);
        int i3 = zzijVar.zza + zzc;
        while (zzc < i3) {
            zzc = zzc(bArr, zzc, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        if (zzc == i3) {
            return zzc;
        }
        throw zzkb.zzi();
    }

    public static int zza(int i2, byte[] bArr, int i3, int i4, zzmj zzmjVar, zzij zzijVar) throws zzkb {
        if ((i2 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int zzd = zzd(bArr, i3, zzijVar);
            zzmjVar.zza(i2, Long.valueOf(zzijVar.zzb));
            return zzd;
        }
        if (i5 == 1) {
            zzmjVar.zza(i2, Long.valueOf(zzd(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int zzc = zzc(bArr, i3, zzijVar);
            int i6 = zzijVar.zza;
            if (i6 >= 0) {
                if (i6 > bArr.length - zzc) {
                    throw zzkb.zzi();
                }
                if (i6 == 0) {
                    zzmjVar.zza(i2, zzik.zza);
                } else {
                    zzmjVar.zza(i2, zzik.zza(bArr, zzc, i6));
                }
                return zzc + i6;
            }
            throw zzkb.zzf();
        }
        if (i5 != 3) {
            if (i5 == 5) {
                zzmjVar.zza(i2, Integer.valueOf(zzc(bArr, i3)));
                return i3 + 4;
            }
            throw zzkb.zzc();
        }
        zzmj zzd2 = zzmj.zzd();
        int i7 = (i2 & (-8)) | 4;
        int i8 = zzijVar.zze + 1;
        zzijVar.zze = i8;
        zza(i8);
        int i9 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int zzc2 = zzc(bArr, i3, zzijVar);
            int i10 = zzijVar.zza;
            i9 = i10;
            if (i10 == i7) {
                i3 = zzc2;
                break;
            }
            int zza2 = zza(i9, bArr, zzc2, i4, zzd2, zzijVar);
            i9 = i10;
            i3 = zza2;
        }
        zzijVar.zze--;
        if (i3 <= i4 && i9 == i7) {
            zzmjVar.zza(i2, zzd2);
            return i3;
        }
        throw zzkb.zzg();
    }

    public static int zza(int i2, byte[] bArr, int i3, zzij zzijVar) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzijVar.zza = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zzijVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzijVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzijVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzijVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zza(int i2, byte[] bArr, int i3, int i4, zzkc<?> zzkcVar, zzij zzijVar) {
        zzjw zzjwVar = (zzjw) zzkcVar;
        int zzc = zzc(bArr, i3, zzijVar);
        zzjwVar.zzd(zzijVar.zza);
        while (zzc < i4) {
            int zzc2 = zzc(bArr, zzc, zzijVar);
            if (i2 != zzijVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzijVar);
            zzjwVar.zzd(zzijVar.zza);
        }
        return zzc;
    }

    public static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i2, int i3, int i4, zzij zzijVar) throws IOException {
        zzlg zzlgVar = (zzlg) zzluVar;
        int i5 = zzijVar.zze + 1;
        zzijVar.zze = i5;
        zza(i5);
        int zza2 = zzlgVar.zza((zzlg) obj, bArr, i2, i3, i4, zzijVar);
        zzijVar.zze--;
        zzijVar.zzc = obj;
        return zza2;
    }

    public static int zza(Object obj, zzlu zzluVar, byte[] bArr, int i2, int i3, zzij zzijVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zza(i5, bArr, i4, zzijVar);
            i5 = zzijVar.zza;
        }
        int i6 = i4;
        if (i5 >= 0 && i5 <= i3 - i6) {
            int i7 = zzijVar.zze + 1;
            zzijVar.zze = i7;
            zza(i7);
            int i8 = i5 + i6;
            zzluVar.zza(obj, bArr, i6, i8, zzijVar);
            zzijVar.zze--;
            zzijVar.zzc = obj;
            return i8;
        }
        throw zzkb.zzi();
    }

    public static int zza(int i2, byte[] bArr, int i3, int i4, zzij zzijVar) throws zzkb {
        if ((i2 >>> 3) == 0) {
            throw zzkb.zzc();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return zzd(bArr, i3, zzijVar);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return zzc(bArr, i3, zzijVar) + zzijVar.zza;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw zzkb.zzc();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = zzc(bArr, i3, zzijVar);
            i7 = zzijVar.zza;
            if (i7 == i6) {
                break;
            }
            i3 = zza(i7, bArr, i3, i4, zzijVar);
        }
        if (i3 > i4 || i7 != i6) {
            throw zzkb.zzg();
        }
        return i3;
    }

    private static void zza(int i2) throws zzkb {
        if (i2 >= zza) {
            throw zzkb.zzh();
        }
    }
}
