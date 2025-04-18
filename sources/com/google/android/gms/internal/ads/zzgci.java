package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgci {
    public static long zza(double d10) {
        zzfwq.zzf(zzb(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits + doubleToRawLongBits;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    public static boolean zzb(double d10) {
        return Math.getExponent(d10) <= 1023;
    }
}
