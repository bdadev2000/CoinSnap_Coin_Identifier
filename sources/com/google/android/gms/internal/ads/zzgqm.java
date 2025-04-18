package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgqm {
    static {
        int i10 = zzgvh.zza;
        try {
            zza();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgqs.zzd();
        zzgpy.zzd();
        zzgqg.zza(true);
        if (zzgmi.zzb()) {
            return;
        }
        zzgpq.zzd(true);
    }
}
