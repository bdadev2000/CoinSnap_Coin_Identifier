package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmp {
    private static final zzmr zza;

    static {
        if (zzml.zzc()) {
            zzml.zzd();
        }
        zza = new zzmq();
    }

    public static /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        byte b3 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b3 > -12) {
                return -1;
            }
            return b3;
        }
        if (i12 == 1) {
            byte b10 = bArr[i10];
            if (b3 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b3;
        }
        if (i12 == 2) {
            byte b11 = bArr[i10];
            byte b12 = bArr[i10 + 1];
            if (b3 > -12 || b11 > -65 || b12 > -65) {
                return -1;
            }
            return (b12 << Ascii.DLE) ^ ((b11 << 8) ^ b3);
        }
        throw new AssertionError();
    }

    public static String zzb(byte[] bArr, int i10, int i11) throws zzkb {
        return zza.zza(bArr, i10, i11);
    }

    public static boolean zzc(byte[] bArr, int i10, int i11) {
        if (zza.zza(0, bArr, i10, i11) != 0) {
            return false;
        }
        return true;
    }

    public static int zza(String str, byte[] bArr, int i10, int i11) {
        return zza.zza(str, bArr, i10, i11);
    }

    public static int zza(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new zzmt(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException(a.k("UTF-8 length does not fit in int: ", i12 + 4294967296L));
    }
}
