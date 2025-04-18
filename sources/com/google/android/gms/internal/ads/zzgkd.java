package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzgkd {
    private Integer zza = null;
    private zzgke zzb = zzgke.zzc;

    private zzgkd() {
    }

    public final zzgkd zza(int i2) throws GeneralSecurityException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzgkd zzb(zzgke zzgkeVar) {
        this.zzb = zzgkeVar;
        return this;
    }

    public final zzgkg zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzgkg(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public /* synthetic */ zzgkd(zzgkc zzgkcVar) {
    }
}
