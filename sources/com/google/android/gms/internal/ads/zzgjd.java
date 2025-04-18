package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzgjd {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgje zzd = zzgje.zzc;

    private zzgjd() {
    }

    public final zzgjd zza(int i2) throws GeneralSecurityException {
        if (i2 != 12 && i2 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i2)));
        }
        this.zzb = Integer.valueOf(i2);
        return this;
    }

    public final zzgjd zzb(int i2) throws GeneralSecurityException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzgjd zzc(int i2) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgjd zzd(zzgje zzgjeVar) {
        this.zzd = zzgjeVar;
        return this;
    }

    public final zzgjg zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        int intValue2 = this.zzb.intValue();
        this.zzc.intValue();
        return new zzgjg(intValue, intValue2, 16, this.zzd, null);
    }

    public /* synthetic */ zzgjd(zzgjc zzgjcVar) {
    }
}
