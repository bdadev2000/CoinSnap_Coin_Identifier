package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzsv {
    public static final boolean zza;

    static {
        boolean z8 = false;
        if ("Amazon".equals(zzgd.zzc)) {
            String str = zzgd.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z8 = true;
            }
        }
        zza = z8;
    }
}
