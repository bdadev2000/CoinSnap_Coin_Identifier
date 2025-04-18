package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgji {
    private zzgjt zza = null;
    private zzgyy zzb = null;
    private Integer zzc = null;

    private zzgji() {
    }

    public final zzgji zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgji zzb(zzgyy zzgyyVar) {
        this.zzb = zzgyyVar;
        return this;
    }

    public final zzgji zzc(zzgjt zzgjtVar) {
        this.zza = zzgjtVar;
        return this;
    }

    public final zzgjk zzd() throws GeneralSecurityException {
        zzgyy zzgyyVar;
        zzgyx zzb;
        zzgjt zzgjtVar = this.zza;
        if (zzgjtVar == null || (zzgyyVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgjtVar.zzb() != zzgyyVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgjtVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgjr.zzc) {
            zzb = zzgpr.zza;
        } else if (this.zza.zzd() == zzgjr.zzb) {
            zzb = zzgpr.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgjr.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzb = zzgpr.zzb(this.zzc.intValue());
        }
        return new zzgjk(this.zza, this.zzb, zzb, this.zzc, null);
    }

    public /* synthetic */ zzgji(zzgjh zzgjhVar) {
    }
}
