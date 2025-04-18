package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzggy {
    private zzghj zza = null;
    private zzgwv zzb = null;
    private zzgwv zzc = null;
    private Integer zzd = null;

    private zzggy() {
    }

    public final zzggy zza(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzggy zzb(zzgwv zzgwvVar) {
        this.zzc = zzgwvVar;
        return this;
    }

    public final zzggy zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzggy zzd(zzghj zzghjVar) {
        this.zza = zzghjVar;
        return this;
    }

    public final zzgha zze() throws GeneralSecurityException {
        zzgwu zzb;
        zzghj zzghjVar = this.zza;
        if (zzghjVar != null) {
            zzgwv zzgwvVar = this.zzb;
            if (zzgwvVar != null && this.zzc != null) {
                if (zzghjVar.zzb() == zzgwvVar.zza()) {
                    if (zzghjVar.zzc() == this.zzc.zza()) {
                        if (this.zza.zza() && this.zzd == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.zza.zza() && this.zzd != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.zza.zzh() == zzghh.zzc) {
                            zzb = zzgoa.zza;
                        } else if (this.zza.zzh() == zzghh.zzb) {
                            zzb = zzgoa.zza(this.zzd.intValue());
                        } else if (this.zza.zzh() == zzghh.zza) {
                            zzb = zzgoa.zzb(this.zzd.intValue());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzh())));
                        }
                        return new zzgha(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    public /* synthetic */ zzggy(zzggz zzggzVar) {
    }
}
