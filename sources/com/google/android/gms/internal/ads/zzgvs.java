package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes3.dex */
public final class zzgvs implements zzgfm {
    private static final ThreadLocal zza = new zzgvq();
    private static final ThreadLocal zzb = new zzgvr();
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final SecretKeySpec zzf;
    private final int zzg;

    private zzgvs(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            if (i10 != 12 && i10 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.zzg = i10;
            zzgws.zza(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.zzf = secretKeySpec;
            Cipher cipher = (Cipher) zza.get();
            cipher.init(1, secretKeySpec);
            byte[] zzd = zzd(cipher.doFinal(new byte[16]));
            this.zzc = zzd;
            this.zzd = zzd(zzd);
            this.zze = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static zzgfm zzb(zzghm zzghmVar) throws GeneralSecurityException {
        if (zzgmh.zza(1)) {
            return new zzgvs(zzghmVar.zzd().zzd(zzgfv.zza()), zzghmVar.zzb().zzb(), zzghmVar.zzc().zzc());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    private static byte[] zzd(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b3 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b3 + b3) ^ ((bArr[i11] & UByte.MAX_VALUE) >>> 7)) & 255);
            i10 = i11;
        }
        byte b10 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b10 + b10));
        return bArr2;
    }

    private final byte[] zze(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            zzc(bArr2, this.zzc);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i13 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i12 - i13 <= 16) {
                break;
            }
            for (int i14 = 0; i14 < 16; i14++) {
                bArr2[i14] = (byte) (bArr[(i11 + i13) + i14] ^ bArr2[i14]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i13 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i13 + i11, i11 + i12);
        if (copyOfRange.length == 16) {
            zzc(copyOfRange, this.zzc);
        } else {
            byte[] copyOf = Arrays.copyOf(this.zzd, 16);
            int i15 = 0;
            while (true) {
                length = copyOfRange.length;
                if (i15 >= length) {
                    break;
                }
                copyOf[i15] = (byte) (copyOf[i15] ^ copyOfRange[i15]);
                i15++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ ByteCompanionObject.MIN_VALUE);
            copyOfRange = copyOf;
        }
        zzc(bArr2, copyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        int length = bArr.length;
        int length2 = ((length - bArr3.length) - this.zzg) - 16;
        if (length2 >= 0) {
            if (zzgpj.zzc(bArr3, bArr)) {
                Cipher cipher = (Cipher) zza.get();
                cipher.init(1, this.zzf);
                byte[] zze = zze(cipher, 0, bArr, this.zze.length, this.zzg);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = bArr2;
                byte[] zze2 = zze(cipher, 1, bArr4, 0, bArr4.length);
                byte[] zze3 = zze(cipher, 2, bArr, this.zze.length + this.zzg, length2);
                int i10 = length - 16;
                byte b3 = 0;
                for (int i11 = 0; i11 < 16; i11++) {
                    b3 = (byte) (b3 | (((bArr[i10 + i11] ^ zze2[i11]) ^ zze[i11]) ^ zze3[i11]));
                }
                if (b3 == 0) {
                    Cipher cipher2 = (Cipher) zzb.get();
                    cipher2.init(1, this.zzf, new IvParameterSpec(zze));
                    return cipher2.doFinal(bArr, this.zze.length + this.zzg, length2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
