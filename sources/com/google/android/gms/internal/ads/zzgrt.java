package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgrt {
    private zzgsg zza = null;
    private zzgzf zzb = null;
    private Integer zzc = null;

    private zzgrt() {
    }

    public final zzgrt zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgrt zzb(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgrt zzc(zzgsg zzgsgVar) {
        this.zza = zzgsgVar;
        return this;
    }

    public final zzgrv zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zza;
        zzgsg zzgsgVar = this.zza;
        if (zzgsgVar != null && (zzgzfVar = this.zzb) != null) {
            if (zzgsgVar.zzc() == zzgzfVar.zza()) {
                if (zzgsgVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzg() == zzgse.zzd) {
                    zza = zzgpm.zza;
                } else if (this.zza.zzg() != zzgse.zzc && this.zza.zzg() != zzgse.zzb) {
                    if (this.zza.zzg() == zzgse.zza) {
                        zza = zzgpm.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
                    }
                } else {
                    zza = zzgpm.zza(this.zzc.intValue());
                }
                return new zzgrv(this.zza, this.zzb, zza, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgrt(zzgrs zzgrsVar) {
    }
}
