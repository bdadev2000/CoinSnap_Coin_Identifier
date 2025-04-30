package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgyc implements zzggy {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgyc(byte[] bArr, zzgze zzgzeVar) throws GeneralSecurityException {
        if (zzgoc.zza(2)) {
            zzgzc.zza(bArr.length);
            this.zza = new SecretKeySpec(bArr, "AES");
            this.zzb = zzgzeVar.zzc();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzggy zzb(zzgjq zzgjqVar) throws GeneralSecurityException {
        return new zzgyc(zzgjqVar.zzd().zzd(zzghh.zza()), zzgjqVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.zzb;
            if (bArr.length >= bArr3.length + 28) {
                if (zzgra.zzc(bArr3, bArr)) {
                    byte[] bArr4 = new byte[12];
                    System.arraycopy(bArr, this.zzb.length, bArr4, 0, 12);
                    int i9 = zzgnl.zza;
                    Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                    GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr4, 0, 12);
                    SecretKey secretKey = this.zza;
                    Cipher zza = zzgnl.zza();
                    zza.init(2, secretKey, gCMParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        zza.updateAAD(bArr2);
                    }
                    return zza.doFinal(bArr, 12 + this.zzb.length, (r2 - r8) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
