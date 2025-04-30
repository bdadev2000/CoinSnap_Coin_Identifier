package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgjo {
    private zzgjz zza = null;
    private zzgzf zzb = null;
    private Integer zzc = null;

    private zzgjo() {
    }

    public final zzgjo zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgjo zzb(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgjo zzc(zzgjz zzgjzVar) {
        this.zza = zzgjzVar;
        return this;
    }

    public final zzgjq zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zzb;
        zzgjz zzgjzVar = this.zza;
        if (zzgjzVar != null && (zzgzfVar = this.zzb) != null) {
            if (zzgjzVar.zzb() == zzgzfVar.zza()) {
                if (zzgjzVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzgjx.zzc) {
                    zzb = zzgpm.zza;
                } else if (this.zza.zzd() == zzgjx.zzb) {
                    zzb = zzgpm.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzgjx.zza) {
                    zzb = zzgpm.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzgjq(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgjo(zzgjn zzgjnVar) {
    }
}
