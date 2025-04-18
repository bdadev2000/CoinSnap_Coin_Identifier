package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgpy implements zzgov {
    private static final zzgpy zza = new zzgpy();

    private zzgpy() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzgnw.zza().zzf(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final Class zza() {
        return zzgpv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final Class zzb() {
        return zzgpv.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final /* bridge */ /* synthetic */ Object zzc(zzgou zzgouVar) throws GeneralSecurityException {
        if (zzgouVar.zzc() != null) {
            Iterator it = zzgouVar.zze().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                }
            }
            return new zzgpw(zzgouVar, null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
