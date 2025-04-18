package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgyd implements zzgye {
    private final zzgyn zza;

    public /* synthetic */ zzgyd(zzgyn zzgynVar, zzgyc zzgycVar) {
        this.zza = zzgynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgye
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgyf.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
