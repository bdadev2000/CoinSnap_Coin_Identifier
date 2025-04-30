package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgxy implements zzgyx {
    private static final ThreadLocal zza = new zzgxx();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzgxy(byte[] bArr, int i9) throws GeneralSecurityException {
        if (zzgoc.zza(2)) {
            zzgzc.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) zza.get()).getBlockSize();
            this.zzd = blockSize;
            if (i9 <= blockSize) {
                this.zzc = i9;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.zzgyx
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i9 = this.zzc;
        if (length >= i9) {
            byte[] bArr2 = new byte[i9];
            System.arraycopy(bArr, 0, bArr2, 0, i9);
            int i10 = this.zzc;
            int i11 = length - i10;
            byte[] bArr3 = new byte[i11];
            Cipher cipher = (Cipher) zza.get();
            byte[] bArr4 = new byte[this.zzd];
            System.arraycopy(bArr2, 0, bArr4, 0, this.zzc);
            cipher.init(2, this.zzb, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i10, i11, bArr3, 0) == i11) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
