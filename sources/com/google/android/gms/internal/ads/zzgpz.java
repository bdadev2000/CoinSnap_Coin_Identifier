package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzgpz {
    private zzgql zza = null;
    private zzgwv zzb = null;
    private Integer zzc = null;

    private zzgpz() {
    }

    public final zzgpz zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgpz zzb(zzgwv zzgwvVar) {
        this.zzb = zzgwvVar;
        return this;
    }

    public final zzgpz zzc(zzgql zzgqlVar) {
        this.zza = zzgqlVar;
        return this;
    }

    public final zzgqb zzd() throws GeneralSecurityException {
        zzgwv zzgwvVar;
        zzgwu zza;
        zzgql zzgqlVar = this.zza;
        if (zzgqlVar != null && (zzgwvVar = this.zzb) != null) {
            if (zzgqlVar.zzc() == zzgwvVar.zza()) {
                if (zzgqlVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzg() == zzgqj.zzd) {
                    zza = zzgoa.zza;
                } else if (this.zza.zzg() != zzgqj.zzc && this.zza.zzg() != zzgqj.zzb) {
                    if (this.zza.zzg() == zzgqj.zza) {
                        zza = zzgoa.zzb(this.zzc.intValue());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzg())));
                    }
                } else {
                    zza = zzgoa.zza(this.zzc.intValue());
                }
                return new zzgqb(this.zza, this.zzb, zza, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgpz(zzgqa zzgqaVar) {
    }
}
