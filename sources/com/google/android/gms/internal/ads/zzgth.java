package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgth implements zzgru {
    public zzgth(zzgsb zzgsbVar) throws GeneralSecurityException {
        if (!zzgnw.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
