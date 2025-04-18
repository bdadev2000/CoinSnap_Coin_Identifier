package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class zzavk {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    public zzavk(SecureRandom secureRandom) {
    }

    private static final Cipher zzc() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzc) {
            if (zza == null) {
                zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zza;
        }
        return cipher;
    }

    public final String zza(byte[] bArr, byte[] bArr2) throws zzavj {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = zzc().doFinal(bArr2);
                iv = zzc().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return zzatt.zza(bArr3, false);
        } catch (InvalidKeyException e2) {
            throw new zzavj(this, e2);
        } catch (NoSuchAlgorithmException e10) {
            throw new zzavj(this, e10);
        } catch (BadPaddingException e11) {
            throw new zzavj(this, e11);
        } catch (IllegalBlockSizeException e12) {
            throw new zzavj(this, e12);
        } catch (NoSuchPaddingException e13) {
            throw new zzavj(this, e13);
        }
    }

    public final byte[] zzb(byte[] bArr, String str) throws zzavj {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zzb2 = zzatt.zzb(str, false);
            int length2 = zzb2.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(zzb2);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (zzb) {
                    zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = zzc().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new zzavj(this);
        } catch (IllegalArgumentException e2) {
            throw new zzavj(this, e2);
        } catch (InvalidAlgorithmParameterException e10) {
            throw new zzavj(this, e10);
        } catch (InvalidKeyException e11) {
            throw new zzavj(this, e11);
        } catch (NoSuchAlgorithmException e12) {
            throw new zzavj(this, e12);
        } catch (BadPaddingException e13) {
            throw new zzavj(this, e13);
        } catch (IllegalBlockSizeException e14) {
            throw new zzavj(this, e14);
        } catch (NoSuchPaddingException e15) {
            throw new zzavj(this, e15);
        }
    }
}
