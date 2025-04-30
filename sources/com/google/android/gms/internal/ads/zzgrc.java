package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgrc {
    private zzgrn zza = null;
    private zzgzf zzb = null;
    private Integer zzc = null;

    private zzgrc() {
    }

    public final zzgrc zza(zzgzf zzgzfVar) throws GeneralSecurityException {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgrc zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgrc zzc(zzgrn zzgrnVar) {
        this.zza = zzgrnVar;
        return this;
    }

    public final zzgre zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zza;
        zzgrn zzgrnVar = this.zza;
        if (zzgrnVar != null && (zzgzfVar = this.zzb) != null) {
            if (zzgrnVar.zzc() == zzgzfVar.zza()) {
                if (zzgrnVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzf() == zzgrl.zzd) {
                    zza = zzgpm.zza;
                } else if (this.zza.zzf() != zzgrl.zzc && this.zza.zzf() != zzgrl.zzb) {
                    if (this.zza.zzf() == zzgrl.zza) {
                        zza = zzgpm.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                    }
                } else {
                    zza = zzgpm.zza(this.zzc.intValue());
                }
                return new zzgre(this.zza, this.zzb, zza, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgrc(zzgrb zzgrbVar) {
    }
}
