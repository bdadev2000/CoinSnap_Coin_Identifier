package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgcn {
    public static long zza(String str, long j3) {
        if (j3 >= 0) {
            return j3;
        }
        throw new IllegalArgumentException(str + " (" + j3 + ") must be >= 0");
    }

    public static void zzb(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
