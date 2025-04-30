package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes2.dex */
public final class zzgiw {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private Integer zzd = null;
    private zzgix zze = null;
    private zzgiy zzf = zzgiy.zzc;

    private zzgiw() {
    }

    public final zzgiw zza(int i9) throws GeneralSecurityException {
        if (i9 != 16 && i9 != 24 && i9 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i9)));
        }
        this.zza = Integer.valueOf(i9);
        return this;
    }

    public final zzgiw zzb(zzgix zzgixVar) {
        this.zze = zzgixVar;
        return this;
    }

    public final zzgiw zzc(int i9) throws GeneralSecurityException {
        if (i9 >= 16) {
            this.zzb = Integer.valueOf(i9);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i9)));
    }

    public final zzgiw zzd(int i9) throws GeneralSecurityException {
        if (i9 >= 12 && i9 <= 16) {
            this.zzc = Integer.valueOf(i9);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i9)));
    }

    public final zzgiw zze(int i9) throws GeneralSecurityException {
        if (i9 >= 10) {
            this.zzd = Integer.valueOf(i9);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i9)));
    }

    public final zzgiw zzf(zzgiy zzgiyVar) {
        this.zzf = zzgiyVar;
        return this;
    }

    public final zzgja zzg() throws GeneralSecurityException {
        if (this.zza != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    Integer num = this.zzd;
                    if (num != null) {
                        if (this.zze != null) {
                            if (this.zzf != null) {
                                int intValue = num.intValue();
                                zzgix zzgixVar = this.zze;
                                if (zzgixVar == zzgix.zza) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
                                    }
                                } else if (zzgixVar == zzgix.zzb) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
                                    }
                                } else if (zzgixVar == zzgix.zzc) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
                                    }
                                } else if (zzgixVar == zzgix.zzd) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
                                    }
                                } else if (zzgixVar == zzgix.zze) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                }
                                return new zzgja(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, null);
                            }
                            throw new GeneralSecurityException("variant is not set");
                        }
                        throw new GeneralSecurityException("hash type is not set");
                    }
                    throw new GeneralSecurityException("tag size is not set");
                }
                throw new GeneralSecurityException("iv size is not set");
            }
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        throw new GeneralSecurityException("AES key size is not set");
    }

    public /* synthetic */ zzgiw(zzgiv zzgivVar) {
    }
}
