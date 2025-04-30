package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgyy implements zzgts {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgyy(byte[] bArr) throws GeneralSecurityException {
        zzgzc.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher zzb = zzb();
        zzb.init(1, secretKeySpec);
        byte[] zza = zzgsz.zza(zzb.doFinal(new byte[16]));
        this.zzb = zza;
        this.zzc = zzgsz.zza(zza);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            return (Cipher) zzgyn.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzgts
    public final byte[] zza(byte[] bArr, int i9) throws GeneralSecurityException {
        byte[] zzc;
        if (i9 <= 16) {
            SecretKey secretKey = this.zza;
            Cipher zzb = zzb();
            zzb.init(1, secretKey);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            int i10 = max - 1;
            int i11 = i10 * 16;
            if (max * 16 == length) {
                zzc = zzgyd.zzd(bArr, i11, this.zzb, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i11, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    zzc = zzgyd.zzc(copyOf, this.zzc);
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr2 = new byte[16];
            for (int i12 = 0; i12 < i10; i12++) {
                bArr2 = zzb.doFinal(zzgyd.zzd(bArr2, 0, bArr, i12 * 16, 16));
            }
            return Arrays.copyOf(zzb.doFinal(zzgyd.zzc(zzc, bArr2)), i9);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
