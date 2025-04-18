package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgjv {
    private zzgkg zza = null;
    private zzgyy zzb = null;
    private Integer zzc = null;

    private zzgjv() {
    }

    public final zzgjv zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgjv zzb(zzgyy zzgyyVar) {
        this.zzb = zzgyyVar;
        return this;
    }

    public final zzgjv zzc(zzgkg zzgkgVar) {
        this.zza = zzgkgVar;
        return this;
    }

    public final zzgjx zzd() throws GeneralSecurityException {
        zzgyy zzgyyVar;
        zzgyx zzb;
        zzgkg zzgkgVar = this.zza;
        if (zzgkgVar == null || (zzgyyVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgkgVar.zzb() != zzgyyVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgkgVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgke.zzc) {
            zzb = zzgpr.zza;
        } else if (this.zza.zzd() == zzgke.zzb) {
            zzb = zzgpr.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzgke.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
            }
            zzb = zzgpr.zzb(this.zzc.intValue());
        }
        return new zzgjx(this.zza, this.zzb, zzb, this.zzc, null);
    }

    public /* synthetic */ zzgjv(zzgju zzgjuVar) {
    }
}
