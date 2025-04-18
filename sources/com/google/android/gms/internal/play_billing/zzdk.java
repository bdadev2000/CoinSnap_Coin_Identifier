package com.google.android.gms.internal.play_billing;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdk {
    public static int zza(byte[] bArr, int i2, zzdj zzdjVar) throws zzff {
        int zzh = zzh(bArr, i2, zzdjVar);
        int i3 = zzdjVar.zza;
        if (i3 < 0) {
            throw zzff.zzd();
        }
        if (i3 > bArr.length - zzh) {
            throw zzff.zzg();
        }
        if (i3 == 0) {
            zzdjVar.zzc = zzdw.zzb;
            return zzh;
        }
        zzdjVar.zzc = zzdw.zzl(bArr, zzh, i3);
        return zzh + i3;
    }

    public static int zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i2 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public static int zzc(zzgm zzgmVar, byte[] bArr, int i2, int i3, int i4, zzdj zzdjVar) throws IOException {
        Object zze = zzgmVar.zze();
        int zzl = zzl(zze, zzgmVar, bArr, i2, i3, i4, zzdjVar);
        zzgmVar.zzf(zze);
        zzdjVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzgm zzgmVar, byte[] bArr, int i2, int i3, zzdj zzdjVar) throws IOException {
        Object zze = zzgmVar.zze();
        int zzm = zzm(zze, zzgmVar, bArr, i2, i3, zzdjVar);
        zzgmVar.zzf(zze);
        zzdjVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzgm zzgmVar, int i2, byte[] bArr, int i3, int i4, zzfc zzfcVar, zzdj zzdjVar) throws IOException {
        int zzd = zzd(zzgmVar, bArr, i3, i4, zzdjVar);
        zzfcVar.add(zzdjVar.zzc);
        while (zzd < i4) {
            int zzh = zzh(bArr, zzd, zzdjVar);
            if (i2 != zzdjVar.zza) {
                break;
            }
            zzd = zzd(zzgmVar, bArr, zzh, i4, zzdjVar);
            zzfcVar.add(zzdjVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzfc zzfcVar, zzdj zzdjVar) throws IOException {
        zzey zzeyVar = (zzey) zzfcVar;
        int zzh = zzh(bArr, i2, zzdjVar);
        int i3 = zzdjVar.zza + zzh;
        while (zzh < i3) {
            zzh = zzh(bArr, zzh, zzdjVar);
            zzeyVar.zzf(zzdjVar.zza);
        }
        if (zzh == i3) {
            return zzh;
        }
        throw zzff.zzg();
    }

    public static int zzg(int i2, byte[] bArr, int i3, int i4, zzhe zzheVar, zzdj zzdjVar) throws zzff {
        if ((i2 >>> 3) == 0) {
            throw zzff.zzb();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int zzk = zzk(bArr, i3, zzdjVar);
            zzheVar.zzj(i2, Long.valueOf(zzdjVar.zzb));
            return zzk;
        }
        if (i5 == 1) {
            zzheVar.zzj(i2, Long.valueOf(zzn(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int zzh = zzh(bArr, i3, zzdjVar);
            int i6 = zzdjVar.zza;
            if (i6 < 0) {
                throw zzff.zzd();
            }
            if (i6 > bArr.length - zzh) {
                throw zzff.zzg();
            }
            if (i6 == 0) {
                zzheVar.zzj(i2, zzdw.zzb);
            } else {
                zzheVar.zzj(i2, zzdw.zzl(bArr, zzh, i6));
            }
            return zzh + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw zzff.zzb();
            }
            zzheVar.zzj(i2, Integer.valueOf(zzb(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzhe zzf = zzhe.zzf();
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int zzh2 = zzh(bArr, i3, zzdjVar);
            int i9 = zzdjVar.zza;
            i8 = i9;
            if (i9 == i7) {
                i3 = zzh2;
                break;
            }
            int zzg = zzg(i8, bArr, zzh2, i4, zzf, zzdjVar);
            i8 = i9;
            i3 = zzg;
        }
        if (i3 > i4 || i8 != i7) {
            throw zzff.zze();
        }
        zzheVar.zzj(i2, zzf);
        return i3;
    }

    public static int zzh(byte[] bArr, int i2, zzdj zzdjVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzi(b2, bArr, i3, zzdjVar);
        }
        zzdjVar.zza = b2;
        return i3;
    }

    public static int zzi(int i2, byte[] bArr, int i3, zzdj zzdjVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b2 >= 0) {
            zzdjVar.zza = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zzdjVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzdjVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzdjVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzdjVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzj(int i2, byte[] bArr, int i3, int i4, zzfc zzfcVar, zzdj zzdjVar) {
        zzey zzeyVar = (zzey) zzfcVar;
        int zzh = zzh(bArr, i3, zzdjVar);
        zzeyVar.zzf(zzdjVar.zza);
        while (zzh < i4) {
            int zzh2 = zzh(bArr, zzh, zzdjVar);
            if (i2 != zzdjVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzdjVar);
            zzeyVar.zzf(zzdjVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i2, zzdj zzdjVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzdjVar.zzb = j2;
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
        zzdjVar.zzb = j3;
        return i4;
    }

    public static int zzl(Object obj, zzgm zzgmVar, byte[] bArr, int i2, int i3, int i4, zzdj zzdjVar) throws IOException {
        int zzc = ((zzgf) zzgmVar).zzc(obj, bArr, i2, i3, i4, zzdjVar);
        zzdjVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzgm zzgmVar, byte[] bArr, int i2, int i3, zzdj zzdjVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zzi(i5, bArr, i4, zzdjVar);
            i5 = zzdjVar.zza;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw zzff.zzg();
        }
        int i7 = i5 + i6;
        zzgmVar.zzh(obj, bArr, i6, i7, zzdjVar);
        zzdjVar.zzc = obj;
        return i7;
    }

    public static long zzn(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }
}
