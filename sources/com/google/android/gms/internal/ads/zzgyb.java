package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgyb implements zzggy {
    private static final ThreadLocal zza = new zzgxz();
    private static final ThreadLocal zzb = new zzgya();
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final SecretKeySpec zzf;
    private final int zzg;

    private zzgyb(byte[] bArr, int i9, byte[] bArr2) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            if (i9 != 12 && i9 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.zzg = i9;
            zzgzc.zza(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.zzf = secretKeySpec;
            Cipher cipher = (Cipher) zza.get();
            cipher.init(1, secretKeySpec);
            byte[] zzc = zzc(cipher.doFinal(new byte[16]));
            this.zzc = zzc;
            this.zzd = zzc(zzc);
            this.zze = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static zzggy zzb(zzgje zzgjeVar) throws GeneralSecurityException {
        if (zzgoc.zza(1)) {
            return new zzgyb(zzgjeVar.zzd().zzd(zzghh.zza()), zzgjeVar.zzb().zzb(), zzgjeVar.zzc().zzc());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static byte[] zzc(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i9 = 0;
        while (i9 < 15) {
            byte b = bArr[i9];
            int i10 = i9 + 1;
            bArr2[i9] = (byte) (((b + b) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i9 = i10;
        }
        byte b8 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b8 + b8));
        return bArr2;
    }

    private final byte[] zzd(Cipher cipher, int i9, byte[] bArr, int i10, int i11) throws IllegalBlockSizeException, BadPaddingException {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i9;
        if (i11 == 0) {
            return cipher.doFinal(zzf(bArr3, this.zzc));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i12 = 0;
        int i13 = 0;
        while (i11 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                doFinal[i14] = (byte) (bArr[(i10 + i13) + i14] ^ doFinal[i14]);
            }
            doFinal = cipher.doFinal(doFinal);
            i13 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13 + i10, i10 + i11);
        if (copyOfRange.length == 16) {
            bArr2 = zzf(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            while (true) {
                length = copyOfRange.length;
                if (i12 >= length) {
                    break;
                }
                copyOf[i12] = (byte) (copyOf[i12] ^ copyOfRange[i12]);
                i12++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(zzf(doFinal, bArr2));
    }

    private final byte[] zze(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i9 = (length - this.zzg) - 16;
        if (i9 >= 0) {
            Cipher cipher = (Cipher) zza.get();
            cipher.init(1, this.zzf);
            byte[] zzd = zzd(cipher, 0, bArr, 0, this.zzg);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] zzd2 = zzd(cipher, 1, bArr3, 0, bArr3.length);
            byte[] zzd3 = zzd(cipher, 2, bArr, this.zzg, i9);
            int i10 = length - 16;
            byte b = 0;
            for (int i11 = 0; i11 < 16; i11++) {
                b = (byte) (b | (((bArr[i10 + i11] ^ zzd2[i11]) ^ zzd[i11]) ^ zzd3[i11]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) zzb.get();
                cipher2.init(1, this.zzf, new IvParameterSpec(zzd));
                return cipher2.doFinal(bArr, this.zzg, i9);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    private static byte[] zzf(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            bArr3[i9] = (byte) (bArr[i9] ^ bArr2[i9]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.zzggy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (bArr3.length == 0) {
            return zze(bArr, bArr2);
        }
        if (zzgra.zzc(bArr3, bArr)) {
            byte[] bArr4 = this.zze;
            return zze(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
