package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgjl extends zzggs {
    private final zzgjq zza;
    private final zzgwu zzb;
    private final Integer zzc;

    private zzgjl(zzgjq zzgjqVar, zzgwu zzgwuVar, Integer num) {
        this.zza = zzgjqVar;
        this.zzb = zzgwuVar;
        this.zzc = num;
    }

    public static zzgjl zza(zzgjq zzgjqVar, Integer num) throws GeneralSecurityException {
        zzgwu zzb;
        if (zzgjqVar.zzc() == zzgjo.zzb) {
            if (num == null) {
                zzb = zzgoa.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzgjqVar.zzc() == zzgjo.zza) {
            if (num != null) {
                zzb = zzgoa.zzb(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgjqVar.zzc())));
        }
        return new zzgjl(zzgjqVar, zzb, num);
    }

    public final zzgjq zzb() {
        return this.zza;
    }

    public final zzgwu zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
