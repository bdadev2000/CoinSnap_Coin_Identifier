package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgjc {
    private zzgjm zza = null;
    private zzgzf zzb = null;
    private Integer zzc = null;

    private zzgjc() {
    }

    public final zzgjc zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgjc zzb(zzgzf zzgzfVar) {
        this.zzb = zzgzfVar;
        return this;
    }

    public final zzgjc zzc(zzgjm zzgjmVar) {
        this.zza = zzgjmVar;
        return this;
    }

    public final zzgje zzd() throws GeneralSecurityException {
        zzgzf zzgzfVar;
        zzgze zzb;
        zzgjm zzgjmVar = this.zza;
        if (zzgjmVar != null && (zzgzfVar = this.zzb) != null) {
            if (zzgjmVar.zzc() == zzgzfVar.zza()) {
                if (zzgjmVar.zza() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zza() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zze() == zzgjk.zzc) {
                    zzb = zzgpm.zza;
                } else if (this.zza.zze() == zzgjk.zzb) {
                    zzb = zzgpm.zza(this.zzc.intValue());
                } else if (this.zza.zze() == zzgjk.zza) {
                    zzb = zzgpm.zzb(this.zzc.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zze())));
                }
                return new zzgje(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public /* synthetic */ zzgjc(zzgjb zzgjbVar) {
    }
}
