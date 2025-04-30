package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzgsc {
    private Integer zza = null;
    private Integer zzb = null;
    private zzgsd zzc = null;
    private zzgse zzd = zzgse.zzd;

    private zzgsc() {
    }

    public final zzgsc zza(zzgsd zzgsdVar) {
        this.zzc = zzgsdVar;
        return this;
    }

    public final zzgsc zzb(int i9) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i9);
        return this;
    }

    public final zzgsc zzc(int i9) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i9);
        return this;
    }

    public final zzgsc zzd(zzgse zzgseVar) {
        this.zzd = zzgseVar;
        return this;
    }

    public final zzgsg zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    if (this.zzd != null) {
                        if (num.intValue() >= 16) {
                            Integer num2 = this.zzb;
                            int intValue = num2.intValue();
                            zzgsd zzgsdVar = this.zzc;
                            if (intValue >= 10) {
                                if (zzgsdVar == zzgsd.zza) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                                    }
                                } else if (zzgsdVar == zzgsd.zzb) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                                    }
                                } else if (zzgsdVar == zzgsd.zzc) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                                    }
                                } else if (zzgsdVar == zzgsd.zzd) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                                    }
                                } else if (zzgsdVar == zzgsd.zze) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new zzgsg(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    public /* synthetic */ zzgsc(zzgsb zzgsbVar) {
    }
}
