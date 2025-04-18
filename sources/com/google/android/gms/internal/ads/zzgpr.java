package com.google.android.gms.internal.ads;

import eb.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzgpr {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgps zzc = zzgps.zzd;

    private zzgpr() {
    }

    public final zzgpr zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzgpr zzb(int i10) throws GeneralSecurityException {
        if (i10 >= 10 && i10 <= 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(j.i("Invalid tag size for AesCmacParameters: ", i10));
    }

    public final zzgpr zzc(zzgps zzgpsVar) {
        this.zzc = zzgpsVar;
        return this;
    }

    public final zzgpu zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    return new zzgpu(num.intValue(), this.zzb.intValue(), this.zzc, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public /* synthetic */ zzgpr(zzgpt zzgptVar) {
    }
}
