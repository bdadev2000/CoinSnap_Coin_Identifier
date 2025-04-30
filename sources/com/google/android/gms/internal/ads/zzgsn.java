package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgsn implements zzghy {
    private static final zzgsn zza = new zzgsn();
    private static final zzgpy zzb = zzgpy.zzb(new zzgpw() { // from class: com.google.android.gms.internal.ads.zzgsk
        @Override // com.google.android.gms.internal.ads.zzgpw
        public final Object zza(zzghi zzghiVar) {
            return zzgth.zza((zzgou) zzghiVar);
        }
    }, zzgou.class, zzghw.class);

    public static void zzd() throws GeneralSecurityException {
        zzgpi.zza().zzf(zza);
        zzgpi.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final Class zza() {
        return zzghw.class;
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final Class zzb() {
        return zzghw.class;
    }

    @Override // com.google.android.gms.internal.ads.zzghy
    public final /* synthetic */ Object zzc(zzgqk zzgqkVar) throws GeneralSecurityException {
        return new zzgsm(zzgqkVar, null);
    }
}
