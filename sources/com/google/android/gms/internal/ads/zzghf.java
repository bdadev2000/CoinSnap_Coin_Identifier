package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes3.dex */
public final class zzghf {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private Integer zzd = null;
    private zzghg zze = null;
    private zzghh zzf = zzghh.zzc;

    private zzghf() {
    }

    public final zzghf zza(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzghf zzb(zzghg zzghgVar) {
        this.zze = zzghgVar;
        return this;
    }

    public final zzghf zzc(int i10) throws GeneralSecurityException {
        if (i10 >= 16) {
            this.zzb = Integer.valueOf(i10);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
    }

    public final zzghf zzd(int i10) throws GeneralSecurityException {
        if (i10 >= 12 && i10 <= 16) {
            this.zzc = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
    }

    public final zzghf zze(int i10) throws GeneralSecurityException {
        if (i10 >= 10) {
            this.zzd = Integer.valueOf(i10);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
    }

    public final zzghf zzf(zzghh zzghhVar) {
        this.zzf = zzghhVar;
        return this;
    }

    public final zzghj zzg() throws GeneralSecurityException {
        if (this.zza != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    Integer num = this.zzd;
                    if (num != null) {
                        if (this.zze != null) {
                            if (this.zzf != null) {
                                int intValue = num.intValue();
                                zzghg zzghgVar = this.zze;
                                if (zzghgVar == zzghg.zza) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                    }
                                } else if (zzghgVar == zzghg.zzb) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                    }
                                } else if (zzghgVar == zzghg.zzc) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                    }
                                } else if (zzghgVar == zzghg.zzd) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                    }
                                } else if (zzghgVar == zzghg.zze) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                }
                                return new zzghj(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, null);
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

    public /* synthetic */ zzghf(zzghi zzghiVar) {
    }
}
