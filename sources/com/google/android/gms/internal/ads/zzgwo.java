package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
public final class zzgwo implements zzgrn {
    private static final ThreadLocal zza = new zzgwn();
    private final SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public zzgwo(byte[] bArr) throws GeneralSecurityException {
        zzgws.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza2 = zzgre.zza(zzb.doFinal(new byte[16]));
        this.zzc = zza2;
        this.zzd = zzgre.zza(zza2);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            return (Cipher) zza.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgrn
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] zzc;
        if (i10 <= 16) {
            SecretKey secretKey = this.zzb;
            Cipher zzb = zzb();
            int i11 = 1;
            zzb.init(1, secretKey);
            int length = bArr.length;
            if (length != 0) {
                i11 = 1 + ((length - 1) >> 4);
            }
            int i12 = i11 - 1;
            int i13 = i12 * 16;
            if (i11 * 16 == length) {
                zzc = zzgvu.zzc(bArr, i13, this.zzc, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i13, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = ByteCompanionObject.MIN_VALUE;
                    byte[] bArr2 = this.zzd;
                    if (copyOf.length == 16) {
                        zzc = zzgvu.zzc(copyOf, 0, bArr2, 0, 16);
                    } else {
                        throw new IllegalArgumentException("The lengths of x and y should match.");
                    }
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            byte[] bArr4 = new byte[16];
            for (int i14 = 0; i14 < i12; i14++) {
                zzc(bArr3, bArr, i14 * 16, bArr4);
                if (zzb.doFinal(bArr4, 0, 16, bArr3) != 16) {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            zzc(bArr3, zzc, 0, bArr4);
            if (zzb.doFinal(bArr4, 0, 16, bArr3) == 16) {
                if (i10 == 16) {
                    return bArr3;
                }
                return Arrays.copyOf(bArr3, i10);
            }
            throw new IllegalStateException("Cipher didn't write full block");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
