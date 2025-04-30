package com.bytedance.applog.encryptor;

/* loaded from: classes.dex */
public class EncryptorUtil {
    static {
        try {
            System.loadLibrary("EncryptorP");
        } catch (UnsatisfiedLinkError e4) {
            e4.printStackTrace();
        }
    }

    public static byte[] encrypt(byte[] bArr, int i9) {
        if (bArr != null && i9 > 0) {
            try {
                if (bArr.length == i9) {
                    return ttEncrypt(bArr, i9);
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static native byte[] ttEncrypt(byte[] bArr, int i9);
}
