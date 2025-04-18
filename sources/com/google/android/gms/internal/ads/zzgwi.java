package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes3.dex */
public final class zzgwi implements zzgwk {
    @Override // com.google.android.gms.internal.ads.zzgwk
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
