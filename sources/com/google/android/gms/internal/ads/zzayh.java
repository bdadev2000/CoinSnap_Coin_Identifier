package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;
import com.applovin.exoplayer2.common.base.Ascii;

/* loaded from: classes2.dex */
public final class zzayh {
    public static final /* synthetic */ int zza = 0;
    private static final char[] zzb = "0123456789abcdef".toCharArray();

    public static long zza(double d2, int i9, DisplayMetrics displayMetrics) {
        return Math.round(d2 / displayMetrics.density);
    }

    public static String zzb(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b = bArr[i9];
            char[] cArr2 = zzb;
            int i10 = i9 + i9;
            cArr[i10] = cArr2[(b & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public static boolean zzc() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean zzd(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean zze(DisplayMetrics displayMetrics) {
        if (displayMetrics != null && displayMetrics.density != 0.0f) {
            return true;
        }
        return false;
    }

    public static byte[] zzf(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i9 = 0; i9 < length; i9 += 2) {
                bArr[i9 / 2] = (byte) (Character.digit(str.charAt(i9 + 1), 16) + (Character.digit(str.charAt(i9), 16) << 4));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }
}
