package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzghu {
    private zzgie zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzghu() {
    }

    public final zzghu zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghu zzb(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzghu zzc(zzgie zzgieVar) {
        this.zza = zzgieVar;
        return this;
    }

    public final zzghw zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zzb;
        zzgie zzgieVar = this.zza;
        if (zzgieVar != null && (zzgwvVar = this.zzb) != null) {
            if (zzgieVar.zzb() == zzgwvVar.zza()) {
                if (zzgieVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzgic.zzc) {
                    zzb = zzgoa.zza;
                } else if (this.zza.zzd() == zzgic.zzb) {
                    zzb = zzgoa.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzgic.zza) {
                    zzb = zzgoa.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzghw(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzghu(zzghv zzghvVar) {
    }
}
