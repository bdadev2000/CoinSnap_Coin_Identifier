package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzgjw {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgjx zzd = zzgjx.zzc;

    private zzgjw() {
    }

    public final zzgjw zza(int i9) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgjw zzb(int i9) throws GeneralSecurityException {
        if (i9 != 16 && i9 != 24 && i9 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i9)));
        }
        this.zza = Integer.valueOf(i9);
        return this;
    }

    public final zzgjw zzc(int i9) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgjw zzd(zzgjx zzgjxVar) {
        this.zzd = zzgjxVar;
        return this;
    }

    public final zzgjz zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        this.zzb.getClass();
                        this.zzc.getClass();
                        return new zzgjz(intValue, 12, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzgjw(zzgjv zzgjvVar) {
    }
}
