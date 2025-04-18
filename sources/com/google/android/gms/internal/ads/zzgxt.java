package com.google.android.gms.internal.ads;

import com.google.common.primitives.UnsignedBytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class zzgxt implements zzggt {
    private static final ThreadLocal zza = new zzgxr();
    private static final ThreadLocal zzb = new zzgxs();
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final SecretKeySpec zzf;
    private final int zzg;

    private zzgxt(byte[] bArr, int i2, byte[] bArr2) throws GeneralSecurityException {
        if (!zzgnw.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzg = i2;
        zzgyv.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzf = secretKeySpec;
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, secretKeySpec);
        byte[] zzd = zzd(cipher.doFinal(new byte[16]));
        this.zzc = zzd;
        this.zzd = zzd(zzd);
        this.zze = bArr2;
    }

    public static zzggt zzb(zzgiy zzgiyVar) throws GeneralSecurityException {
        if (zzgnw.zza(1)) {
            return new zzgxt(zzgiyVar.zzd().zzd(zzghc.zza()), zzgiyVar.zzb().zzb(), zzgiyVar.zzc().zzc());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
    }

    private static byte[] zzd(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            byte b2 = bArr[i2];
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((b2 + b2) ^ ((bArr[i3] & UnsignedBytes.MAX_VALUE) >>> 7)) & 255);
            i2 = i3;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & Opcodes.I2D) ^ (b3 + b3));
        return bArr2;
    }

    private final byte[] zze(Cipher cipher, int i2, byte[] bArr, int i3, int i4) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i2;
        if (i4 == 0) {
            zzc(bArr2, this.zzc);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i5 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i4 - i5 <= 16) {
                break;
            }
            for (int i6 = 0; i6 < 16; i6++) {
                bArr2[i6] = (byte) (bArr[(i3 + i5) + i6] ^ bArr2[i6]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i3, i3 + i4);
        if (copyOfRange.length == 16) {
            zzc(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            int i7 = 0;
            while (true) {
                length = copyOfRange.length;
                if (i7 >= length) {
                    break;
                }
                copyOf[i7] = (byte) (copyOf[i7] ^ copyOfRange[i7]);
                i7++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ UnsignedBytes.MAX_POWER_OF_TWO);
            copyOfRange = copyOf;
        }
        zzc(bArr2, copyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.zzggt
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.zzg) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgrg.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzf);
        byte[] zze = zze(cipher, 0, bArr, this.zze.length, this.zzg);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] zze2 = zze(cipher, 1, bArr4, 0, bArr4.length);
        byte[] zze3 = zze(cipher, 2, bArr, this.zze.length + this.zzg, length2);
        int i2 = length - 16;
        byte b2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b2 = (byte) (b2 | (((bArr[i2 + i3] ^ zze2[i3]) ^ zze[i3]) ^ zze3[i3]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) zzb.get();
        cipher2.init(1, this.zzf, new IvParameterSpec(zze));
        return cipher2.doFinal(bArr, this.zze.length + this.zzg, length2);
    }
}
