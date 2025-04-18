package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgez {
    public static void zza(Throwable th2) {
        if (th2 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
