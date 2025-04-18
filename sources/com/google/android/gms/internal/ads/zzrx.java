package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzrx {
    public static final boolean zza;

    static {
        boolean z2 = false;
        if ("Amazon".equals(zzeu.zzc)) {
            String str = zzeu.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z2 = true;
            }
        }
        zza = z2;
    }
}
