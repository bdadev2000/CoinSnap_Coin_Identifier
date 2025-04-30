package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes2.dex */
public final class zzgza implements zzgts {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zzgza(String str, Key key) throws GeneralSecurityException {
        char c9;
        int i9;
        zzgyz zzgyzVar = new zzgyz(this);
        this.zza = zzgyzVar;
        if (zzgoc.zza(2)) {
            this.zzb = str;
            this.zzc = key;
            if (key.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c9 = 4;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                if (c9 != 0) {
                    if (c9 != 1) {
                        if (c9 != 2) {
                            if (c9 != 3) {
                                if (c9 == 4) {
                                    i9 = 64;
                                } else {
                                    throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                                }
                            } else {
                                i9 = 48;
                            }
                        } else {
                            i9 = 32;
                        }
                    } else {
                        i9 = 28;
                    }
                } else {
                    i9 = 20;
                }
                this.zzd = i9;
                zzgyzVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final byte[] zza(byte[] bArr, int i9) throws GeneralSecurityException {
        if (i9 <= this.zzd) {
            ((Mac) this.zza.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.zza.get()).doFinal(), i9);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
