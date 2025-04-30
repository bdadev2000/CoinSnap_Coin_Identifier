package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgio {
    private zzgja zza = null;
    private zzgzf zzb = null;
    private zzgzf zzc = null;
    private Integer zzd = null;

    private zzgio() {
    }

    public final zzgio zza(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgio zzb(zzgzf zzgzfVar) {
        this.zzc = zzgzfVar;
        return this;
    }

    public final zzgio zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgio zzd(zzgja zzgjaVar) {
        this.zza = zzgjaVar;
        return this;
    }

    public final zzgiq zze() throws GeneralSecurityException {
        zzgze zzb;
        zzgja zzgjaVar = this.zza;
        if (zzgjaVar != null) {
            zzgzf zzgzfVar = this.zzb;
            if (zzgzfVar != null && this.zzc != null) {
                if (zzgjaVar.zzb() == zzgzfVar.zza()) {
                    if (zzgjaVar.zzc() == this.zzc.zza()) {
                        if (this.zza.zza() && this.zzd == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.zza.zza() && this.zzd != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.zza.zzh() == zzgiy.zzc) {
                            zzb = zzgpm.zza;
                        } else if (this.zza.zzh() == zzgiy.zzb) {
                            zzb = zzgpm.zza(this.zzd.intValue());
                        } else if (this.zza.zzh() == zzgiy.zza) {
                            zzb = zzgpm.zzb(this.zzd.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                        }
                        return new zzgiq(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    public /* synthetic */ zzgio(zzgin zzginVar) {
    }
}
