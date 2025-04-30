package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgou extends zzghi {
    private final zzgql zza;

    public zzgou(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        zzc(zzgqlVar, zzgicVar);
        this.zza = zzgqlVar;
    }

    private static void zzc(zzgql zzgqlVar, zzgic zzgicVar) throws GeneralSecurityException {
        int i9 = zzgot.zzb[zzgqlVar.zzb().ordinal()];
    }

    public final zzgql zza(zzgic zzgicVar) throws GeneralSecurityException {
        zzc(this.zza, zzgicVar);
        return this.zza;
    }

    public final Integer zzb() {
        return this.zza.zzf();
    }
}
