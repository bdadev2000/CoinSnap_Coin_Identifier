package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgyr implements zzgto {
    private static final ThreadLocal zza = new zzgyq();
    private final SecretKey zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public zzgyr(byte[] bArr) throws GeneralSecurityException {
        zzgyv.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza2 = zzgtf.zza(zzb.doFinal(new byte[16]));
        this.zzc = zza2;
        this.zzd = zzgtf.zza(zza2);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgnw.zza(1)) {
            return (Cipher) zza.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) {
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3 + i2]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgto
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        byte[] zzc;
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zzb;
        Cipher zzb = zzb();
        zzb.init(1, secretKey);
        int length = bArr.length;
        int i3 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i4 = i3 - 1;
        int i5 = i4 * 16;
        if (i3 * 16 == length) {
            zzc = zzgxv.zzc(bArr, i5, this.zzc, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i5, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = UnsignedBytes.MAX_POWER_OF_TWO;
            byte[] bArr2 = this.zzd;
            if (copyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            zzc = zzgxv.zzc(copyOf, 0, bArr2, 0, 16);
        }
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        for (int i6 = 0; i6 < i4; i6++) {
            zzc(bArr3, bArr, i6 * 16, bArr4);
            if (zzb.doFinal(bArr4, 0, 16, bArr3) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zzc(bArr3, zzc, 0, bArr4);
        if (zzb.doFinal(bArr4, 0, 16, bArr3) == 16) {
            return i2 == 16 ? bArr3 : Arrays.copyOf(bArr3, i2);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
