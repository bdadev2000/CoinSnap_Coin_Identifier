package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes3.dex */
final class zzhbv {
    public static /* bridge */ /* synthetic */ void zza(byte b3, byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!zzg(b10)) {
            if ((((b10 + 112) + (b3 << Ascii.FS)) >> 30) == 0 && !zzg(b11) && !zzg(b12)) {
                int i11 = ((b3 & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw new zzgzm("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b3, byte b10, byte b11, char[] cArr, int i10) {
        if (!zzg(b10)) {
            if (b3 == -32) {
                if (b10 >= -96) {
                    b3 = -32;
                }
            }
            if (b3 == -19) {
                if (b10 < -96) {
                    b3 = -19;
                }
            }
            if (!zzg(b11)) {
                cArr[i10] = (char) (((b3 & Ascii.SI) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                return;
            }
        }
        throw new zzgzm("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b3, byte b10, char[] cArr, int i10) {
        if (b3 >= -62 && !zzg(b10)) {
            cArr[i10] = (char) (((b3 & Ascii.US) << 6) | (b10 & 63));
            return;
        }
        throw new zzgzm("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b3) {
        return b3 >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean zze(byte b3) {
        return b3 < -16;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(byte b3) {
        return b3 < -32;
    }

    private static boolean zzg(byte b3) {
        return b3 > -65;
    }
}
