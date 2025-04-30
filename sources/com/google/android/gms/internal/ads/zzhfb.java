package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes2.dex */
final class zzhfb {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b8, byte b9, byte b10, char[] cArr, int i9) {
        if (!zzg(b8)) {
            if ((((b8 + 112) + (b << Ascii.FS)) >> 30) == 0 && !zzg(b9) && !zzg(b10)) {
                int i10 = ((b & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i9] = (char) ((i10 >>> 10) + 55232);
                cArr[i9 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw zzhcd.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b8, byte b9, char[] cArr, int i9) {
        if (!zzg(b8)) {
            if (b == -32) {
                if (b8 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b8 < -96) {
                    b = -19;
                }
            }
            if (!zzg(b9)) {
                cArr[i9] = (char) (((b & Ascii.SI) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                return;
            }
        }
        throw zzhcd.zzd();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b8, char[] cArr, int i9) {
        if (b >= -62 && !zzg(b8)) {
            cArr[i9] = (char) (((b & Ascii.US) << 6) | (b8 & 63));
            return;
        }
        throw zzhcd.zzd();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean zze(byte b) {
        return b < -16;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(byte b) {
        return b < -32;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }
}
