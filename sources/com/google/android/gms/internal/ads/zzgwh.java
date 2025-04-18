package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes3.dex */
public final class zzgwh implements zzgwk {
    @Override // com.google.android.gms.internal.ads.zzgwk
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
