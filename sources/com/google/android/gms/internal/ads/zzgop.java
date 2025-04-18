package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgop extends zzghd {
    private final zzgqr zza;

    public zzgop(zzgqr zzgqrVar, zzghw zzghwVar) throws GeneralSecurityException {
        zzc(zzgqrVar, zzghwVar);
        this.zza = zzgqrVar;
    }

    private static void zzc(zzgqr zzgqrVar, zzghw zzghwVar) throws GeneralSecurityException {
        int i2 = zzgoo.zzb[zzgqrVar.zzb().ordinal()];
    }

    public final zzgqr zza(zzghw zzghwVar) throws GeneralSecurityException {
        zzc(this.zza, zzghwVar);
        return this.zza;
    }

    public final Integer zzb() {
        return this.zza.zzf();
    }
}
