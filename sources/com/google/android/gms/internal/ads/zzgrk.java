package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzgrk {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgrl zzc = zzgrl.zzd;

    private zzgrk() {
    }

    public final zzgrk zza(int i9) throws GeneralSecurityException {
        if (i9 != 16 && i9 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i9 * 8)));
        }
        this.zza = Integer.valueOf(i9);
        return this;
    }

    public final zzgrk zzb(int i9) throws GeneralSecurityException {
        if (i9 >= 10 && i9 <= 16) {
            this.zzb = Integer.valueOf(i9);
            return this;
        }
        throw new GeneralSecurityException(o.h(i9, "Invalid tag size for AesCmacParameters: "));
    }

    public final zzgrk zzc(zzgrl zzgrlVar) {
        this.zzc = zzgrlVar;
        return this;
    }

    public final zzgrn zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    return new zzgrn(num.intValue(), this.zzb.intValue(), this.zzc, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public /* synthetic */ zzgrk(zzgrj zzgrjVar) {
    }
}
