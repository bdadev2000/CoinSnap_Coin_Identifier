package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzggx implements zzgov {
    private static final zzggx zza = new zzggx();
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzggu
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzglx.zzb((zzgmz) zzgfwVar);
        }
    }, zzgmz.class, zzgfm.class);

    public static void zzd() throws GeneralSecurityException {
        zzgnw.zza().zzf(zza);
        zzgnw.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final Class zza() {
        return zzgfm.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final Class zzb() {
        return zzgfm.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final /* synthetic */ Object zzc(zzgou zzgouVar) throws GeneralSecurityException {
        return new zzggv(zzgouVar, null);
    }
}
