package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhff {
    private static final zzhfc zza;

    static {
        if (zzhfa.zzA() && zzhfa.zzB()) {
            int i9 = zzgzm.zza;
        }
        zza = new zzhfd();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i9, int i10) {
        int i11 = i10 - i9;
        byte b = bArr[i9 - 1];
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return zzl(b, bArr[i9], bArr[i9 + 1]);
                }
                throw new AssertionError();
            }
            return zzk(b, bArr[i9]);
        }
        if (b > -12) {
            return -1;
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzd(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhff.zzd(java.lang.String, byte[], int, int):int");
    }

    public static int zze(String str) {
        int length = str.length();
        int i9 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 2048) {
                        i9 += (127 - charAt2) >>> 31;
                    } else {
                        i9 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) >= 65536) {
                                i10++;
                            } else {
                                throw new zzhfe(i10, length2);
                            }
                        }
                    }
                    i10++;
                }
                i11 += i9;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }

    public static int zzf(int i9, byte[] bArr, int i10, int i11) {
        return zza.zza(i9, bArr, i10, i11);
    }

    public static String zzg(ByteBuffer byteBuffer, int i9, int i10) throws zzhcd {
        zzhfc zzhfcVar = zza;
        if (byteBuffer.hasArray()) {
            return zzhfcVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i9, i10);
        }
        if (byteBuffer.isDirect()) {
            return zzhfc.zzd(byteBuffer, i9, i10);
        }
        return zzhfc.zzd(byteBuffer, i9, i10);
    }

    public static String zzh(byte[] bArr, int i9, int i10) throws zzhcd {
        return zza.zzb(bArr, i9, i10);
    }

    public static boolean zzi(byte[] bArr) {
        return zza.zzc(bArr, 0, bArr.length);
    }

    public static boolean zzj(byte[] bArr, int i9, int i10) {
        return zza.zzc(bArr, i9, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i9, int i10) {
        if (i9 > -12 || i10 > -65) {
            return -1;
        }
        return i9 ^ (i10 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i9, int i10, int i11) {
        if (i9 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i9 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
