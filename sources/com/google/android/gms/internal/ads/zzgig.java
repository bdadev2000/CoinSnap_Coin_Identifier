package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgig {

    @Deprecated
    static final zzgxq zza;

    @Deprecated
    static final zzgxq zzb;

    @Deprecated
    static final zzgxq zzc;

    static {
        zzgxq zzc2 = zzgxq.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e4) {
            throw new ExceptionInInitializerError(e4);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgim.zzd();
        zzgsh.zza();
        zzgiu.zza(true);
        zzgju.zza(true);
        if (zzgod.zzb()) {
            return;
        }
        zzgjh.zza(true);
        zzgkh.zza(true);
        zzgkq.zza(true);
        zzgkv.zza(true);
        zzgkz.zza(true);
        zzgmf.zza(true);
    }
}
