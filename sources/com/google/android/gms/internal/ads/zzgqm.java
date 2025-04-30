package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgqm implements zzgqq {
    private final zzgze zza;
    private final zzgwm zzb;

    private zzgqm(zzgwm zzgwmVar, zzgze zzgzeVar) {
        this.zzb = zzgwmVar;
        this.zza = zzgzeVar;
    }

    public static zzgqm zza(zzgwm zzgwmVar) throws GeneralSecurityException {
        return new zzgqm(zzgwmVar, zzgra.zza(zzgwmVar.zzi()));
    }

    public static zzgqm zzb(zzgwm zzgwmVar) {
        return new zzgqm(zzgwmVar, zzgra.zzb(zzgwmVar.zzi()));
    }

    public final zzgwm zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgqq
    public final zzgze zzd() {
        return this.zza;
    }
}
