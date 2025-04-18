package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzghk {
    private zzght zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzghk() {
    }

    public final zzghk zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghk zzb(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzghk zzc(zzght zzghtVar) {
        this.zza = zzghtVar;
        return this;
    }

    public final zzghm zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zzb;
        zzght zzghtVar = this.zza;
        if (zzghtVar != null && (zzgwvVar = this.zzb) != null) {
            if (zzghtVar.zzc() == zzgwvVar.zza()) {
                if (zzghtVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zze() == zzghr.zzc) {
                    zzb = zzgoa.zza;
                } else if (this.zza.zze() == zzghr.zzb) {
                    zzb = zzgoa.zza(this.zzc.intValue());
                } else if (this.zza.zze() == zzghr.zza) {
                    zzb = zzgoa.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                }
                return new zzghm(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzghk(zzghl zzghlVar) {
    }
}
