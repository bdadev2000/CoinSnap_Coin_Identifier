package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgzh {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i2, zzgzg zzgzgVar) throws zzhbt {
        int zzh = zzh(bArr, i2, zzgzgVar);
        int i3 = zzgzgVar.zza;
        if (i3 < 0) {
            throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 > bArr.length - zzh) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i3 == 0) {
            zzgzgVar.zzc = zzgzs.zzb;
            return zzh;
        }
        zzgzgVar.zzc = zzgzs.zzv(bArr, zzh, i3);
        return zzh + i3;
    }

    public static int zzb(byte[] bArr, int i2) {
        int i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        int i4 = bArr[i2 + 1] & UnsignedBytes.MAX_VALUE;
        int i5 = bArr[i2 + 2] & UnsignedBytes.MAX_VALUE;
        return ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public static int zzc(zzhdk zzhdkVar, byte[] bArr, int i2, int i3, int i4, zzgzg zzgzgVar) throws IOException {
        Object zze = zzhdkVar.zze();
        int zzl = zzl(zze, zzhdkVar, bArr, i2, i3, i4, zzgzgVar);
        zzhdkVar.zzf(zze);
        zzgzgVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzhdk zzhdkVar, byte[] bArr, int i2, int i3, zzgzg zzgzgVar) throws IOException {
        Object zze = zzhdkVar.zze();
        int zzm = zzm(zze, zzhdkVar, bArr, i2, i3, zzgzgVar);
        zzhdkVar.zzf(zze);
        zzgzgVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzhdk zzhdkVar, int i2, byte[] bArr, int i3, int i4, zzhbq zzhbqVar, zzgzg zzgzgVar) throws IOException {
        int zzd = zzd(zzhdkVar, bArr, i3, i4, zzgzgVar);
        zzhbqVar.add(zzgzgVar.zzc);
        while (zzd < i4) {
            int zzh = zzh(bArr, zzd, zzgzgVar);
            if (i2 != zzgzgVar.zza) {
                break;
            }
            zzd = zzd(zzhdkVar, bArr, zzh, i4, zzgzgVar);
            zzhbqVar.add(zzgzgVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzhbq zzhbqVar, zzgzg zzgzgVar) throws IOException {
        zzhbf zzhbfVar = (zzhbf) zzhbqVar;
        int zzh = zzh(bArr, i2, zzgzgVar);
        int i3 = zzgzgVar.zza + zzh;
        while (zzh < i3) {
            zzh = zzh(bArr, zzh, zzgzgVar);
            zzhbfVar.zzi(zzgzgVar.zza);
        }
        if (zzh == i3) {
            return zzh;
        }
        throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i2, byte[] bArr, int i3, int i4, zzhdz zzhdzVar, zzgzg zzgzgVar) throws zzhbt {
        if ((i2 >>> 3) == 0) {
            throw new zzhbt("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int zzk = zzk(bArr, i3, zzgzgVar);
            zzhdzVar.zzj(i2, Long.valueOf(zzgzgVar.zzb));
            return zzk;
        }
        if (i5 == 1) {
            zzhdzVar.zzj(i2, Long.valueOf(zzn(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int zzh = zzh(bArr, i3, zzgzgVar);
            int i6 = zzgzgVar.zza;
            if (i6 < 0) {
                throw new zzhbt("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 > bArr.length - zzh) {
                throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i6 == 0) {
                zzhdzVar.zzj(i2, zzgzs.zzb);
            } else {
                zzhdzVar.zzj(i2, zzgzs.zzv(bArr, zzh, i6));
            }
            return zzh + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new zzhbt("Protocol message contained an invalid tag (zero).");
            }
            zzhdzVar.zzj(i2, Integer.valueOf(zzb(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        zzhdz zzf = zzhdz.zzf();
        int i8 = zzgzgVar.zze + 1;
        zzgzgVar.zze = i8;
        zzo(i8);
        int i9 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int zzh2 = zzh(bArr, i3, zzgzgVar);
            i9 = zzgzgVar.zza;
            if (i9 == i7) {
                i3 = zzh2;
                break;
            }
            i3 = zzg(i9, bArr, zzh2, i4, zzf, zzgzgVar);
        }
        zzgzgVar.zze--;
        if (i3 > i4 || i9 != i7) {
            throw new zzhbt("Failed to parse the message.");
        }
        zzhdzVar.zzj(i2, zzf);
        return i3;
    }

    public static int zzh(byte[] bArr, int i2, zzgzg zzgzgVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return zzi(b2, bArr, i3, zzgzgVar);
        }
        zzgzgVar.zza = b2;
        return i3;
    }

    public static int zzi(int i2, byte[] bArr, int i3, zzgzg zzgzgVar) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b2 >= 0) {
            zzgzgVar.zza = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zzgzgVar.zza = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zzgzgVar.zza = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zzgzgVar.zza = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zzgzgVar.zza = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int zzj(int i2, byte[] bArr, int i3, int i4, zzhbq zzhbqVar, zzgzg zzgzgVar) {
        zzhbf zzhbfVar = (zzhbf) zzhbqVar;
        int zzh = zzh(bArr, i3, zzgzgVar);
        zzhbfVar.zzi(zzgzgVar.zza);
        while (zzh < i4) {
            int zzh2 = zzh(bArr, zzh, zzgzgVar);
            if (i2 != zzgzgVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzgzgVar);
            zzhbfVar.zzi(zzgzgVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i2, zzgzg zzgzgVar) {
        long j2 = bArr[i2];
        int i3 = i2 + 1;
        if (j2 >= 0) {
            zzgzgVar.zzb = j2;
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
        zzgzgVar.zzb = j3;
        return i4;
    }

    public static int zzl(Object obj, zzhdk zzhdkVar, byte[] bArr, int i2, int i3, int i4, zzgzg zzgzgVar) throws IOException {
        zzhcs zzhcsVar = (zzhcs) zzhdkVar;
        int i5 = zzgzgVar.zze + 1;
        zzgzgVar.zze = i5;
        zzo(i5);
        int zzc = zzhcsVar.zzc(obj, bArr, i2, i3, i4, zzgzgVar);
        zzgzgVar.zze--;
        zzgzgVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzhdk zzhdkVar, byte[] bArr, int i2, int i3, zzgzg zzgzgVar) throws IOException {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = zzi(i5, bArr, i4, zzgzgVar);
            i5 = zzgzgVar.zza;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = zzgzgVar.zze + 1;
        zzgzgVar.zze = i7;
        zzo(i7);
        int i8 = i5 + i6;
        zzhdkVar.zzi(obj, bArr, i6, i8, zzgzgVar);
        zzgzgVar.zze--;
        zzgzgVar.zzc = obj;
        return i8;
    }

    public static long zzn(byte[] bArr, int i2) {
        return (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48) | ((bArr[i2 + 7] & 255) << 56);
    }

    private static void zzo(int i2) throws zzhbt {
        if (i2 >= zzb) {
            throw new zzhbt("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
