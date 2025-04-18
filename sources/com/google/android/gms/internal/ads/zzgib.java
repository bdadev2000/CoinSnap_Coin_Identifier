package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzgib {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgic zzd = zzgic.zzc;

    private zzgib() {
    }

    public final zzgib zza(int i10) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgib zzb(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgib zzc(int i10) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgib zzd(zzgic zzgicVar) {
        this.zzd = zzgicVar;
        return this;
    }

    public final zzgie zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzgie(intValue, 12, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzgib(zzgid zzgidVar) {
    }
}
