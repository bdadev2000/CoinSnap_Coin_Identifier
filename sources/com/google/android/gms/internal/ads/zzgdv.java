package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgdv {
    public static long zza(String str, long j7) {
        if (j7 >= 0) {
            return j7;
        }
        throw new IllegalArgumentException(str + " (" + j7 + ") must be >= 0");
    }

    public static void zzb(boolean z8) {
        if (z8) {
        } else {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
