package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgvz implements zzgwa {
    private final zzgwk zza;

    public /* synthetic */ zzgvz(zzgwk zzgwkVar, zzgwb zzgwbVar) {
        this.zza = zzgwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwa
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgwc.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
