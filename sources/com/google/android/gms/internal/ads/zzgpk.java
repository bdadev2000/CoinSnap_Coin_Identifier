package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgpk {
    private zzgpu zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzgpk() {
    }

    public final zzgpk zza(zzgwv zzgwvVar) throws GeneralSecurityException {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzgpk zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgpk zzc(zzgpu zzgpuVar) {
        this.zza = zzgpuVar;
        return this;
    }

    public final zzgpm zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zza;
        zzgpu zzgpuVar = this.zza;
        if (zzgpuVar != null && (zzgwvVar = this.zzb) != null) {
            if (zzgpuVar.zzc() == zzgwvVar.zza()) {
                if (zzgpuVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzf() == zzgps.zzd) {
                    zza = zzgoa.zza;
                } else if (this.zza.zzf() != zzgps.zzc && this.zza.zzf() != zzgps.zzb) {
                    if (this.zza.zzf() == zzgps.zza) {
                        zza = zzgoa.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                    }
                } else {
                    zza = zzgoa.zza(this.zzc.intValue());
                }
                return new zzgpm(this.zza, this.zzb, zza, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgpk(zzgpl zzgplVar) {
    }
}
