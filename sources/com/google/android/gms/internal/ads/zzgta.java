package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgta implements zzgro {
    private final zzgre zza;

    public zzgta(zzgre zzgreVar) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            this.zza = zzgreVar;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
