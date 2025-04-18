package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgmz extends zzgfw {
    private final zzgow zza;

    public zzgmz(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        zzc(zzgowVar, zzggnVar);
        this.zza = zzgowVar;
    }

    private static void zzc(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        int i10 = zzgmy.zzb[zzgowVar.zzb().ordinal()];
    }

    public final zzgow zza(zzggn zzggnVar) throws GeneralSecurityException {
        zzc(this.zza, zzggnVar);
        return this.zza;
    }

    public final Integer zzb() {
        return this.zza.zzf();
    }
}
