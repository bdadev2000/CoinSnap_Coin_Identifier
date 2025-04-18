package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgtg implements zzgru {
    public zzgtg(zzgrk zzgrkVar) throws GeneralSecurityException {
        if (!zzgnw.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
