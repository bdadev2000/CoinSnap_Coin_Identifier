package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgzo {
    public static int zza(byte[] bArr, int i9, zzgzn zzgznVar) throws zzhcd {
        int zzh = zzh(bArr, i9, zzgznVar);
        int i10 = zzgznVar.zza;
        if (i10 >= 0) {
            if (i10 <= bArr.length - zzh) {
                if (i10 == 0) {
                    zzgznVar.zzc = zzhac.zzb;
                    return zzh;
                }
                zzgznVar.zzc = zzhac.zzv(bArr, zzh, i10);
                return zzh + i10;
            }
            throw zzhcd.zzj();
        }
        throw zzhcd.zzf();
    }

    public static int zzb(byte[] bArr, int i9) {
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzhdz zzhdzVar, byte[] bArr, int i9, int i10, int i11, zzgzn zzgznVar) throws IOException {
        Object zze = zzhdzVar.zze();
        int zzl = zzl(zze, zzhdzVar, bArr, i9, i10, i11, zzgznVar);
        zzhdzVar.zzf(zze);
        zzgznVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzhdz zzhdzVar, byte[] bArr, int i9, int i10, zzgzn zzgznVar) throws IOException {
        Object zze = zzhdzVar.zze();
        int zzm = zzm(zze, zzhdzVar, bArr, i9, i10, zzgznVar);
        zzhdzVar.zzf(zze);
        zzgznVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzhdz zzhdzVar, int i9, byte[] bArr, int i10, int i11, zzhca zzhcaVar, zzgzn zzgznVar) throws IOException {
        int zzd = zzd(zzhdzVar, bArr, i10, i11, zzgznVar);
        zzhcaVar.add(zzgznVar.zzc);
        while (zzd < i11) {
            int zzh = zzh(bArr, zzd, zzgznVar);
            if (i9 != zzgznVar.zza) {
                break;
            }
            zzd = zzd(zzhdzVar, bArr, zzh, i11, zzgznVar);
            zzhcaVar.add(zzgznVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i9, zzhca zzhcaVar, zzgzn zzgznVar) throws IOException {
        zzhbp zzhbpVar = (zzhbp) zzhcaVar;
        int zzh = zzh(bArr, i9, zzgznVar);
        int i10 = zzgznVar.zza + zzh;
        while (zzh < i10) {
            zzh = zzh(bArr, zzh, zzgznVar);
            zzhbpVar.zzi(zzgznVar.zza);
        }
        if (zzh == i10) {
            return zzh;
        }
        throw zzhcd.zzj();
    }

    public static int zzg(int i9, byte[] bArr, int i10, int i11, zzher zzherVar, zzgzn zzgznVar) throws zzhcd {
        if ((i9 >>> 3) != 0) {
            int i12 = i9 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                zzherVar.zzj(i9, Integer.valueOf(zzb(bArr, i10)));
                                return i10 + 4;
                            }
                            throw zzhcd.zzc();
                        }
                        int i13 = (i9 & (-8)) | 4;
                        zzher zzf = zzher.zzf();
                        int i14 = 0;
                        while (true) {
                            if (i10 >= i11) {
                                break;
                            }
                            int zzh = zzh(bArr, i10, zzgznVar);
                            int i15 = zzgznVar.zza;
                            i14 = i15;
                            if (i15 != i13) {
                                int zzg = zzg(i14, bArr, zzh, i11, zzf, zzgznVar);
                                i14 = i15;
                                i10 = zzg;
                            } else {
                                i10 = zzh;
                                break;
                            }
                        }
                        if (i10 <= i11 && i14 == i13) {
                            zzherVar.zzj(i9, zzf);
                            return i10;
                        }
                        throw zzhcd.zzg();
                    }
                    int zzh2 = zzh(bArr, i10, zzgznVar);
                    int i16 = zzgznVar.zza;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - zzh2) {
                            if (i16 == 0) {
                                zzherVar.zzj(i9, zzhac.zzb);
                            } else {
                                zzherVar.zzj(i9, zzhac.zzv(bArr, zzh2, i16));
                            }
                            return zzh2 + i16;
                        }
                        throw zzhcd.zzj();
                    }
                    throw zzhcd.zzf();
                }
                zzherVar.zzj(i9, Long.valueOf(zzn(bArr, i10)));
                return i10 + 8;
            }
            int zzk = zzk(bArr, i10, zzgznVar);
            zzherVar.zzj(i9, Long.valueOf(zzgznVar.zzb));
            return zzk;
        }
        throw zzhcd.zzc();
    }

    public static int zzh(byte[] bArr, int i9, zzgzn zzgznVar) {
        int i10 = i9 + 1;
        byte b = bArr[i9];
        if (b >= 0) {
            zzgznVar.zza = b;
            return i10;
        }
        return zzi(b, bArr, i10, zzgznVar);
    }

    public static int zzi(int i9, byte[] bArr, int i10, zzgzn zzgznVar) {
        byte b = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i9 & 127;
        if (b >= 0) {
            zzgznVar.zza = i12 | (b << 7);
            return i11;
        }
        int i13 = i12 | ((b & Ascii.DEL) << 7);
        int i14 = i10 + 2;
        byte b8 = bArr[i11];
        if (b8 >= 0) {
            zzgznVar.zza = i13 | (b8 << Ascii.SO);
            return i14;
        }
        int i15 = i13 | ((b8 & Ascii.DEL) << 14);
        int i16 = i10 + 3;
        byte b9 = bArr[i14];
        if (b9 >= 0) {
            zzgznVar.zza = i15 | (b9 << Ascii.NAK);
            return i16;
        }
        int i17 = i15 | ((b9 & Ascii.DEL) << 21);
        int i18 = i10 + 4;
        byte b10 = bArr[i16];
        if (b10 >= 0) {
            zzgznVar.zza = i17 | (b10 << Ascii.FS);
            return i18;
        }
        int i19 = i17 | ((b10 & Ascii.DEL) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                zzgznVar.zza = i19;
                return i20;
            }
        }
    }

    public static int zzj(int i9, byte[] bArr, int i10, int i11, zzhca zzhcaVar, zzgzn zzgznVar) {
        zzhbp zzhbpVar = (zzhbp) zzhcaVar;
        int zzh = zzh(bArr, i10, zzgznVar);
        zzhbpVar.zzi(zzgznVar.zza);
        while (zzh < i11) {
            int zzh2 = zzh(bArr, zzh, zzgznVar);
            if (i9 != zzgznVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzgznVar);
            zzhbpVar.zzi(zzgznVar.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i9, zzgzn zzgznVar) {
        long j7 = bArr[i9];
        int i10 = i9 + 1;
        if (j7 >= 0) {
            zzgznVar.zzb = j7;
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
        zzgznVar.zzb = j9;
        return i11;
    }

    public static int zzl(Object obj, zzhdz zzhdzVar, byte[] bArr, int i9, int i10, int i11, zzgzn zzgznVar) throws IOException {
        int zzc = ((zzhdh) zzhdzVar).zzc(obj, bArr, i9, i10, i11, zzgznVar);
        zzgznVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzhdz zzhdzVar, byte[] bArr, int i9, int i10, zzgzn zzgznVar) throws IOException {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = zzi(i12, bArr, i11, zzgznVar);
            i12 = zzgznVar.zza;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = i12 + i13;
            zzhdzVar.zzi(obj, bArr, i13, i14, zzgznVar);
            zzgznVar.zzc = obj;
            return i14;
        }
        throw zzhcd.zzj();
    }

    public static long zzn(byte[] bArr, int i9) {
        return (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48) | ((bArr[i9 + 7] & 255) << 56);
    }
}
