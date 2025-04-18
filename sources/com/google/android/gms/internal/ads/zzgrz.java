package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgrz {
    private zzgsm zza = null;
    private zzgyy zzb = null;
    private Integer zzc = null;

    private zzgrz() {
    }

    public final zzgrz zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgrz zzb(zzgyy zzgyyVar) {
        this.zzb = zzgyyVar;
        return this;
    }

    public final zzgrz zzc(zzgsm zzgsmVar) {
        this.zza = zzgsmVar;
        return this;
    }

    public final zzgsb zzd() throws GeneralSecurityException {
        zzgyy zzgyyVar;
        zzgyx zza;
        zzgsm zzgsmVar = this.zza;
        if (zzgsmVar == null || (zzgyyVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgsmVar.zzc() != zzgyyVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgsmVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzgsk.zzd) {
            zza = zzgpr.zza;
        } else if (this.zza.zzg() == zzgsk.zzc || this.zza.zzg() == zzgsk.zzb) {
            zza = zzgpr.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzg() != zzgsk.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
            }
            zza = zzgpr.zzb(this.zzc.intValue());
        }
        return new zzgsb(this.zza, this.zzb, zza, this.zzc, null);
    }

    public /* synthetic */ zzgrz(zzgry zzgryVar) {
    }
}
