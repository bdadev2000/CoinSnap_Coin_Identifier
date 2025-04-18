package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzglc extends zzgib {
    private final zzgli zza;
    private final zzgyx zzb;
    private final Integer zzc;

    private zzglc(zzgli zzgliVar, zzgyx zzgyxVar, Integer num) {
        this.zza = zzgliVar;
        this.zzb = zzgyxVar;
        this.zzc = num;
    }

    public static zzglc zza(zzgli zzgliVar, Integer num) throws GeneralSecurityException {
        zzgyx zzb;
        if (zzgliVar.zzc() == zzglg.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = zzgpr.zza;
        } else {
            if (zzgliVar.zzc() != zzglg.zza) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgliVar.zzc())));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = zzgpr.zzb(num.intValue());
        }
        return new zzglc(zzgliVar, zzb, num);
    }

    public final zzgli zzb() {
        return this.zza;
    }

    public final zzgyx zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
