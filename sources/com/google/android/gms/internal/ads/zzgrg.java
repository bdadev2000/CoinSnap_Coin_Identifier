package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgrg implements zzgpv {
    public zzgrg(zzgqb zzgqbVar) throws GeneralSecurityException {
        if (zzgmh.zza(2)) {
        } else {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
