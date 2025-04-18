package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgri {
    private zzgrt zza = null;
    private zzgyy zzb = null;
    private Integer zzc = null;

    private zzgri() {
    }

    public final zzgri zza(zzgyy zzgyyVar) throws GeneralSecurityException {
        this.zzb = zzgyyVar;
        return this;
    }

    public final zzgri zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgri zzc(zzgrt zzgrtVar) {
        this.zza = zzgrtVar;
        return this;
    }

    public final zzgrk zzd() throws GeneralSecurityException {
        zzgyy zzgyyVar;
        zzgyx zza;
        zzgrt zzgrtVar = this.zza;
        if (zzgrtVar == null || (zzgyyVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgrtVar.zzc() != zzgyyVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgrtVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzgrr.zzd) {
            zza = zzgpr.zza;
        } else if (this.zza.zzf() == zzgrr.zzc || this.zza.zzf() == zzgrr.zzb) {
            zza = zzgpr.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzgrr.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zza = zzgpr.zzb(this.zzc.intValue());
        }
        return new zzgrk(this.zza, this.zzb, zza, this.zzc, null);
    }

    public /* synthetic */ zzgri(zzgrh zzgrhVar) {
    }
}
