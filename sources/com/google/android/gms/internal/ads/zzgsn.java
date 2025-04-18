package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgsn {
    static {
        int i2 = zzgxi.zza;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgst.zzd();
        zzgrx.zzd();
        zzgsg.zza(true);
        if (zzgnx.zzb()) {
            return;
        }
        zzgro.zzd(true);
    }
}
