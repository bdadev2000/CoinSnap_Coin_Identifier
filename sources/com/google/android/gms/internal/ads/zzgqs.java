package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgqs implements zzgov {
    private static final zzgqs zza = new zzgqs();
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzgqp
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzgrm.zza((zzgmz) zzgfwVar);
        }
    }, zzgmz.class, zzggi.class);

    public static void zzd() throws GeneralSecurityException {
        zzgnw.zza().zzf(zza);
        zzgnw.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final Class zza() {
        return zzggi.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final Class zzb() {
        return zzggi.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final /* synthetic */ Object zzc(zzgou zzgouVar) throws GeneralSecurityException {
        return new zzgqq(zzgouVar, null);
    }
}
