package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzgrq {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgrr zzc = zzgrr.zzd;

    private zzgrq() {
    }

    public final zzgrq zza(int i2) throws GeneralSecurityException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 * 8)));
        }
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzgrq zzb(int i2) throws GeneralSecurityException {
        if (i2 < 10 || i2 > 16) {
            throw new GeneralSecurityException(d.i("Invalid tag size for AesCmacParameters: ", i2));
        }
        this.zzb = Integer.valueOf(i2);
        return this;
    }

    public final zzgrq zzc(zzgrr zzgrrVar) {
        this.zzc = zzgrrVar;
        return this;
    }

    public final zzgrt zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzgrt(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzgrq(zzgrp zzgrpVar) {
    }
}
