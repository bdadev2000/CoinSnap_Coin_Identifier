package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgtb implements zzgro {
    private final zzgrv zza;

    public zzgtb(zzgrv zzgrvVar) throws GeneralSecurityException {
        if (zzgoc.zza(2)) {
            this.zza = zzgrvVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
