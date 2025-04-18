package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgiw {
    private zzgjg zza = null;
    private zzgyy zzb = null;
    private Integer zzc = null;

    private zzgiw() {
    }

    public final zzgiw zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgiw zzb(zzgyy zzgyyVar) {
        this.zzb = zzgyyVar;
        return this;
    }

    public final zzgiw zzc(zzgjg zzgjgVar) {
        this.zza = zzgjgVar;
        return this;
    }

    public final zzgiy zzd() throws GeneralSecurityException {
        zzgyy zzgyyVar;
        zzgyx zzb;
        zzgjg zzgjgVar = this.zza;
        if (zzgjgVar == null || (zzgyyVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgjgVar.zzc() != zzgyyVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgjgVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzgje.zzc) {
            zzb = zzgpr.zza;
        } else if (this.zza.zze() == zzgje.zzb) {
            zzb = zzgpr.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzgje.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
            }
            zzb = zzgpr.zzb(this.zzc.intValue());
        }
        return new zzgiy(this.zza, this.zzb, zzb, this.zzc, null);
    }

    public /* synthetic */ zzgiw(zzgiv zzgivVar) {
    }
}
