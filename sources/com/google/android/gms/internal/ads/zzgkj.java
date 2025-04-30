package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzgkj {
    private Integer zza = null;
    private zzgkk zzb = zzgkk.zzc;

    private zzgkj() {
    }

    public final zzgkj zza(int i9) throws GeneralSecurityException {
        if (i9 != 16 && i9 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i9)));
        }
        this.zza = Integer.valueOf(i9);
        return this;
    }

    public final zzgkj zzb(zzgkk zzgkkVar) {
        this.zzb = zzgkkVar;
        return this;
    }

    public final zzgkm zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzgkm(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzgkj(zzgki zzgkiVar) {
    }
}
