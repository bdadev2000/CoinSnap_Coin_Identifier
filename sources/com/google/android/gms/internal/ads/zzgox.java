package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgox implements zzgpb {
    private final zzgwu zza;
    private final zzgue zzb;

    private zzgox(zzgue zzgueVar, zzgwu zzgwuVar) {
        this.zzb = zzgueVar;
        this.zza = zzgwuVar;
    }

    public static zzgox zza(zzgue zzgueVar) throws GeneralSecurityException {
        return new zzgox(zzgueVar, zzgpj.zza(zzgueVar.zzi()));
    }

    public static zzgox zzb(zzgue zzgueVar) {
        return new zzgox(zzgueVar, zzgpj.zzb(zzgueVar.zzi()));
    }

    public final zzgue zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgpb
    public final zzgwu zzd() {
        return this.zza;
    }
}
