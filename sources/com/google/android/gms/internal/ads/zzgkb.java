package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgkb {
    private zzgkm zza = null;
    private zzgzf zzb = null;
    private Integer zzc = null;

    private zzgkb() {
    }

    public final zzgkb zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgkb zzb(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgkb zzc(zzgkm zzgkmVar) {
        this.zza = zzgkmVar;
        return this;
    }

    public final zzgkd zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zzb;
        zzgkm zzgkmVar = this.zza;
        if (zzgkmVar != null && (zzgzfVar = this.zzb) != null) {
            if (zzgkmVar.zzb() == zzgzfVar.zza()) {
                if (zzgkmVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzgkk.zzc) {
                    zzb = zzgpm.zza;
                } else if (this.zza.zzd() == zzgkk.zzb) {
                    zzb = zzgpm.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzgkk.zza) {
                    zzb = zzgpm.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzgkd(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgkb(zzgka zzgkaVar) {
    }
}
