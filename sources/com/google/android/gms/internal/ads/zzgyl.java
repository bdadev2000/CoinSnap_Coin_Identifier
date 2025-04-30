package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgyl implements zzgym {
    private final zzgyv zza;

    public /* synthetic */ zzgyl(zzgyv zzgyvVar, zzgyk zzgykVar) {
        this.zza = zzgyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgym
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgyn.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e4) {
                if (exc == null) {
                    exc = e4;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
