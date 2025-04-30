package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzggl {
    public static void zza(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
