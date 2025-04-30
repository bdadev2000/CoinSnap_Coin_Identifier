package com.google.android.gms.internal.measurement;

import Q7.n0;
import com.applovin.exoplayer2.common.base.Ascii;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmk {
    private static final zzmm zza;

    static {
        if (zzmg.zzc()) {
            zzmg.zzd();
        }
        zza = new zzml();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i9, int i10) {
        byte b = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i11 == 1) {
            byte b8 = bArr[i9];
            if (b > -12 || b8 > -65) {
                return -1;
            }
            return (b8 << 8) ^ b;
        }
        if (i11 == 2) {
            byte b9 = bArr[i9];
            byte b10 = bArr[i9 + 1];
            if (b > -12 || b9 > -65 || b10 > -65) {
                return -1;
            }
            return (b10 << Ascii.DLE) ^ ((b9 << 8) ^ b);
        }
        throw new AssertionError();
    }

    public static String zzb(byte[] bArr, int i9, int i10) throws zzjs {
        return zza.zza(bArr, i9, i10);
    }

    public static boolean zzc(byte[] bArr, int i9, int i10) {
        if (zza.zza(0, bArr, i9, i10) != 0) {
            return false;
        }
        return true;
    }

    public static int zza(String str, byte[] bArr, int i9, int i10) {
        return zza.zza(str, bArr, i9, i10);
    }

    public static int zza(String str) {
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
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new zzmo(i10, length2);
                            }
                            i10++;
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
        throw new IllegalArgumentException(n0.g(i11 + 4294967296L, "UTF-8 length does not fit in int: "));
    }
}
