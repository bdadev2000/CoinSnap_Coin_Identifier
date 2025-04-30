package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgnu implements zzggy {
    private final byte[] zza;
    private final byte[] zzb;

    private zzgnu(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            if (zzc()) {
                if (bArr.length == 32) {
                    this.zza = bArr;
                    this.zzb = bArr2;
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static zzggy zzb(zzgmb zzgmbVar) throws GeneralSecurityException {
        return new zzgnu(zzgmbVar.zzd().zzd(zzghh.zza()), zzgmbVar.zzc().zzc());
    }

    public static boolean zzc() {
        if (zzgnd.zzc() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.zzb;
            if (bArr.length >= bArr3.length + 40) {
                if (zzgra.zzc(bArr3, bArr)) {
                    byte[] bArr4 = new byte[24];
                    System.arraycopy(bArr, this.zzb.length, bArr4, 0, 24);
                    int[] zzd = zzgnj.zzd(zzgnj.zze(this.zza), zzgnj.zze(bArr4));
                    ByteBuffer order = ByteBuffer.allocate(zzd.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                    order.asIntBuffer().put(zzd);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
                    byte[] bArr5 = new byte[12];
                    System.arraycopy(bArr4, 16, bArr5, 4, 8);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
                    Cipher zzc = zzgnd.zzc();
                    zzc.init(2, secretKeySpec, ivParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        zzc.updateAAD(bArr2);
                    }
                    return zzc.doFinal(bArr, this.zzb.length + 24, (r1 - r10) - 24);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
