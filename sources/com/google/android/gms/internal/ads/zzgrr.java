package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzgrr implements zzghy {
    private static final zzgrr zza = new zzgrr();

    private zzgrr() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzgpi.zza().zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final Class zza() {
        return zzgro.class;
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final Class zzb() {
        return zzgro.class;
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final /* bridge */ /* synthetic */ Object zzc(zzgqk zzgqkVar) throws GeneralSecurityException {
        if (zzgqkVar.zzb() != null) {
            Iterator it = zzgqkVar.zze().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                }
            }
            return new zzgrq(zzgqkVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
