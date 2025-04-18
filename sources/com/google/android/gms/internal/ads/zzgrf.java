package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgrf implements zzgpv {
    public zzgrf(zzgpm zzgpmVar) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
