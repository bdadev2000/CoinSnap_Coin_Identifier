package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* loaded from: classes3.dex */
public final class zzax {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static synchronized String zza() {
        String str;
        synchronized (zzax.class) {
            str = zzb;
        }
        return str;
    }

    public static synchronized void zzb(String str) {
        synchronized (zzax.class) {
            if (zza.add(str)) {
                zzb = zzb + ", " + str;
            }
        }
    }
}
