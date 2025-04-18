package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* loaded from: classes3.dex */
public final class zzgwj implements zzgwk {
    @Override // com.google.android.gms.internal.ads.zzgwk
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
