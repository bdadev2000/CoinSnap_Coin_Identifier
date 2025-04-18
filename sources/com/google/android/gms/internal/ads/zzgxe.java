package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgxe {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zzgxd zzgxdVar) throws zzgzm {
        int zzh = zzh(bArr, i10, zzgxdVar);
        int i11 = zzgxdVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzh) {
                if (i11 == 0) {
                    zzgxdVar.zzc = zzgxp.zzb;
                    return zzh;
                }
                zzgxdVar.zzc = zzgxp.zzv(bArr, zzh, i11);
                return zzh + i11;
            }
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & UByte.MAX_VALUE;
        int i12 = bArr[i10 + 1] & UByte.MAX_VALUE;
        int i13 = bArr[i10 + 2] & UByte.MAX_VALUE;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzhbb zzhbbVar, byte[] bArr, int i10, int i11, int i12, zzgxd zzgxdVar) throws IOException {
        Object zze = zzhbbVar.zze();
        int zzl = zzl(zze, zzhbbVar, bArr, i10, i11, i12, zzgxdVar);
        zzhbbVar.zzf(zze);
        zzgxdVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzhbb zzhbbVar, byte[] bArr, int i10, int i11, zzgxd zzgxdVar) throws IOException {
        Object zze = zzhbbVar.zze();
        int zzm = zzm(zze, zzhbbVar, bArr, i10, i11, zzgxdVar);
        zzhbbVar.zzf(zze);
        zzgxdVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzhbb zzhbbVar, int i10, byte[] bArr, int i11, int i12, zzgzj zzgzjVar, zzgxd zzgxdVar) throws IOException {
        int zzd = zzd(zzhbbVar, bArr, i11, i12, zzgxdVar);
        zzgzjVar.add(zzgxdVar.zzc);
        while (zzd < i12) {
            int zzh = zzh(bArr, zzd, zzgxdVar);
            if (i10 != zzgxdVar.zza) {
                break;
            }
            zzd = zzd(zzhbbVar, bArr, zzh, i12, zzgxdVar);
            zzgzjVar.add(zzgxdVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zzgzj zzgzjVar, zzgxd zzgxdVar) throws IOException {
        zzgyy zzgyyVar = (zzgyy) zzgzjVar;
        int zzh = zzh(bArr, i10, zzgxdVar);
        int i11 = zzgxdVar.zza + zzh;
        while (zzh < i11) {
            zzh = zzh(bArr, zzh, zzgxdVar);
            zzgyyVar.zzi(zzgxdVar.zza);
        }
        if (zzh == i11) {
            return zzh;
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i10, byte[] bArr, int i11, int i12, zzhbo zzhboVar, zzgxd zzgxdVar) throws zzgzm {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zzhboVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw new zzgzm("Protocol message contained an invalid tag (zero).");
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zzhbo zzf = zzhbo.zzf();
                        int i15 = zzgxdVar.zze + 1;
                        zzgxdVar.zze = i15;
                        zzo(i15);
                        int i16 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzh = zzh(bArr, i11, zzgxdVar);
                            i16 = zzgxdVar.zza;
                            if (i16 == i14) {
                                i11 = zzh;
                                break;
                            }
                            i11 = zzg(i16, bArr, zzh, i12, zzf, zzgxdVar);
                        }
                        zzgxdVar.zze--;
                        if (i11 <= i12 && i16 == i14) {
                            zzhboVar.zzj(i10, zzf);
                            return i11;
                        }
                        throw new zzgzm("Failed to parse the message.");
                    }
                    int zzh2 = zzh(bArr, i11, zzgxdVar);
                    int i17 = zzgxdVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzh2) {
                            if (i17 == 0) {
                                zzhboVar.zzj(i10, zzgxp.zzb);
                            } else {
                                zzhboVar.zzj(i10, zzgxp.zzv(bArr, zzh2, i17));
                            }
                            return zzh2 + i17;
                        }
                        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                zzhboVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
                return i11 + 8;
            }
            int zzk = zzk(bArr, i11, zzgxdVar);
            zzhboVar.zzj(i10, Long.valueOf(zzgxdVar.zzb));
            return zzk;
        }
        throw new zzgzm("Protocol message contained an invalid tag (zero).");
    }

    public static int zzh(byte[] bArr, int i10, zzgxd zzgxdVar) {
        int i11 = i10 + 1;
        byte b3 = bArr[i10];
        if (b3 >= 0) {
            zzgxdVar.zza = b3;
            return i11;
        }
        return zzi(b3, bArr, i11, zzgxdVar);
    }

    public static int zzi(int i10, byte[] bArr, int i11, zzgxd zzgxdVar) {
        byte b3 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b3 >= 0) {
            zzgxdVar.zza = i13 | (b3 << 7);
            return i12;
        }
        int i14 = i13 | ((b3 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            zzgxdVar.zza = i14 | (b10 << Ascii.SO);
            return i15;
        }
        int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            zzgxdVar.zza = i16 | (b11 << Ascii.NAK);
            return i17;
        }
        int i18 = i16 | ((b11 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            zzgxdVar.zza = i18 | (b12 << Ascii.FS);
            return i19;
        }
        int i20 = i18 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzgxdVar.zza = i20;
                return i21;
            }
        }
    }

    public static int zzj(int i10, byte[] bArr, int i11, int i12, zzgzj zzgzjVar, zzgxd zzgxdVar) {
        zzgyy zzgyyVar = (zzgyy) zzgzjVar;
        int zzh = zzh(bArr, i11, zzgxdVar);
        zzgyyVar.zzi(zzgxdVar.zza);
        while (zzh < i12) {
            int zzh2 = zzh(bArr, zzh, zzgxdVar);
            if (i10 != zzgxdVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzgxdVar);
            zzgyyVar.zzi(zzgxdVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i10, zzgxd zzgxdVar) {
        long j3 = bArr[i10];
        int i11 = i10 + 1;
        if (j3 >= 0) {
            zzgxdVar.zzb = j3;
            return i11;
        }
        int i12 = i11 + 1;
        byte b3 = bArr[i11];
        long j10 = (j3 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b3 < 0) {
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            i13 += 7;
            j10 |= (b10 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b3 = b10;
        }
        zzgxdVar.zzb = j10;
        return i12;
    }

    public static int zzl(Object obj, zzhbb zzhbbVar, byte[] bArr, int i10, int i11, int i12, zzgxd zzgxdVar) throws IOException {
        zzhal zzhalVar = (zzhal) zzhbbVar;
        int i13 = zzgxdVar.zze + 1;
        zzgxdVar.zze = i13;
        zzo(i13);
        int zzc = zzhalVar.zzc(obj, bArr, i10, i11, i12, zzgxdVar);
        zzgxdVar.zze--;
        zzgxdVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzhbb zzhbbVar, byte[] bArr, int i10, int i11, zzgxd zzgxdVar) throws IOException {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzi(i13, bArr, i12, zzgxdVar);
            i13 = zzgxdVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = zzgxdVar.zze + 1;
            zzgxdVar.zze = i15;
            zzo(i15);
            int i16 = i13 + i14;
            zzhbbVar.zzi(obj, bArr, i14, i16, zzgxdVar);
            zzgxdVar.zze--;
            zzgxdVar.zzc = obj;
            return i16;
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static long zzn(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    private static void zzo(int i10) throws zzgzm {
        if (i10 < zzb) {
        } else {
            throw new zzgzm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
