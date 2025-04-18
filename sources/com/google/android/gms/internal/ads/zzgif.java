package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgif {
    private zzgip zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzgif() {
    }

    public final zzgif zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgif zzb(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzgif zzc(zzgip zzgipVar) {
        this.zza = zzgipVar;
        return this;
    }

    public final zzgih zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zzb;
        zzgip zzgipVar = this.zza;
        if (zzgipVar != null && (zzgwvVar = this.zzb) != null) {
            if (zzgipVar.zzb() == zzgwvVar.zza()) {
                if (zzgipVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzgin.zzc) {
                    zzb = zzgoa.zza;
                } else if (this.zza.zzd() == zzgin.zzb) {
                    zzb = zzgoa.zza(this.zzc.intValue());
                } else if (this.zza.zzd() == zzgin.zza) {
                    zzb = zzgoa.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                }
                return new zzgih(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgif(zzgig zzgigVar) {
    }
}
