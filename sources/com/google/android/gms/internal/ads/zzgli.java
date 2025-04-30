package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgli extends zzgih {
    private final zzglo zza;
    private final zzgze zzb;
    private final Integer zzc;

    private zzgli(zzglo zzgloVar, zzgze zzgzeVar, Integer num) {
        this.zza = zzgloVar;
        this.zzb = zzgzeVar;
        this.zzc = num;
    }

    public static zzgli zza(zzglo zzgloVar, Integer num) throws GeneralSecurityException {
        zzgze zzb;
        if (zzgloVar.zzc() == zzglm.zzb) {
            if (num == null) {
                zzb = zzgpm.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzgloVar.zzc() == zzglm.zza) {
            if (num != null) {
                zzb = zzgpm.zzb(num.intValue());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zzgloVar.zzc())));
        }
        return new zzgli(zzgloVar, zzb, num);
    }

    public final zzglo zzb() {
        return this.zza;
    }

    public final zzgze zzc() {
        return this.zzb;
    }

    public final Integer zzd() {
        return this.zzc;
    }
}
