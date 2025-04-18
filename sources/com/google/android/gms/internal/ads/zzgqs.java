package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgqs implements zzgqw {
    private final zzgyx zza;
    private final zzgwf zzb;

    private zzgqs(zzgwf zzgwfVar, zzgyx zzgyxVar) {
        this.zzb = zzgwfVar;
        this.zza = zzgyxVar;
    }

    public static zzgqs zza(zzgwf zzgwfVar) throws GeneralSecurityException {
        return new zzgqs(zzgwfVar, zzgrg.zza(zzgwfVar.zzi()));
    }

    public static zzgqs zzb(zzgwf zzgwfVar) {
        return new zzgqs(zzgwfVar, zzgrg.zzb(zzgwfVar.zzi()));
    }

    public final zzgwf zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgqw
    public final zzgyx zzd() {
        return this.zza;
    }
}
