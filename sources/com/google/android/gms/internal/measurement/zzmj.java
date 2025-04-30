package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes2.dex */
final class zzmj {
    private static boolean zza(byte b) {
        return b > -65;
    }

    public static /* synthetic */ void zza(byte b, byte b8, byte b9, byte b10, char[] cArr, int i9) {
        if (!zza(b8)) {
            if ((((b8 + 112) + (b << Ascii.FS)) >> 30) == 0 && !zza(b9) && !zza(b10)) {
                int i10 = ((b & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i9] = (char) ((i10 >>> 10) + 55232);
                cArr[i9 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw zzjs.zzd();
    }

    public static /* synthetic */ void zza(byte b, char[] cArr, int i9) {
        cArr[i9] = (char) b;
    }

    public static /* synthetic */ void zza(byte b, byte b8, byte b9, char[] cArr, int i9) {
        if (!zza(b8) && ((b != -32 || b8 >= -96) && ((b != -19 || b8 < -96) && !zza(b9)))) {
            cArr[i9] = (char) (((b & Ascii.SI) << 12) | ((b8 & 63) << 6) | (b9 & 63));
            return;
        }
        throw zzjs.zzd();
    }

    public static /* synthetic */ void zza(byte b, byte b8, char[] cArr, int i9) {
        if (b >= -62 && !zza(b8)) {
            cArr[i9] = (char) (((b & Ascii.US) << 6) | (b8 & 63));
            return;
        }
        throw zzjs.zzd();
    }
}
