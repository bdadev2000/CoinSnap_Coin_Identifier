package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgvx implements zzgwa {
    private final zzgwk zza;

    public /* synthetic */ zzgvx(zzgwk zzgwkVar, zzgwb zzgwbVar) {
        this.zza = zzgwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwa
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgwc.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
