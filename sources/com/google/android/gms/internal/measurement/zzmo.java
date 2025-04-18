package com.google.android.gms.internal.measurement;

import okio.Utf8;

/* loaded from: classes4.dex */
final class zzmo {
    private static boolean zza(byte b2) {
        return b2 > -65;
    }

    public static /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (!zza(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !zza(b4) && !zza(b5)) {
                int i3 = ((b2 & 7) << 18) | ((b3 & Utf8.REPLACEMENT_BYTE) << 12) | ((b4 & Utf8.REPLACEMENT_BYTE) << 6) | (b5 & Utf8.REPLACEMENT_BYTE);
                cArr[i2] = (char) ((i3 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i2 + 1] = (char) ((i3 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw zzkb.zzd();
    }

    public static /* synthetic */ void zza(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    public static /* synthetic */ void zza(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (!zza(b3) && ((b2 != -32 || b3 >= -96) && ((b2 != -19 || b3 < -96) && !zza(b4)))) {
            cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzkb.zzd();
    }

    public static /* synthetic */ void zza(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 >= -62 && !zza(b3)) {
            cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
            return;
        }
        throw zzkb.zzd();
    }
}
