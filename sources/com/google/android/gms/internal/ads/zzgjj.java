package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzgjj {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzgjk zzd = zzgjk.zzc;

    private zzgjj() {
    }

    public final zzgjj zza(int i9) throws GeneralSecurityException {
        if (i9 != 12 && i9 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i9)));
        }
        this.zzb = Integer.valueOf(i9);
        return this;
    }

    public final zzgjj zzb(int i9) throws GeneralSecurityException {
        if (i9 != 16 && i9 != 24 && i9 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i9)));
        }
        this.zza = Integer.valueOf(i9);
        return this;
    }

    public final zzgjj zzc(int i9) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgjj zzd(zzgjk zzgjkVar) {
        this.zzd = zzgjkVar;
        return this;
    }

    public final zzgjm zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzd != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        int intValue2 = this.zzb.intValue();
                        this.zzc.getClass();
                        return new zzgjm(intValue, intValue2, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("IV size is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    public /* synthetic */ zzgjj(zzgji zzgjiVar) {
    }
}
