package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzgjq {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgjr zzd = zzgjr.zzc;

    private zzgjq() {
    }

    public final zzgjq zza(int i2) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgjq zzb(int i2) throws GeneralSecurityException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzgjq zzc(int i2) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgjq zzd(zzgjr zzgjrVar) {
        this.zzd = zzgjrVar;
        return this;
    }

    public final zzgjt zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = num.intValue();
        this.zzb.intValue();
        this.zzc.intValue();
        return new zzgjt(intValue, 12, 16, this.zzd, null);
    }

    public /* synthetic */ zzgjq(zzgjp zzgjpVar) {
    }
}
