package com.bytedance.sdk.component.embedapplog;

import android.util.Log;

/* loaded from: classes.dex */
public class PangleEncryptUtils {
    static {
        try {
            System.loadLibrary("tobEmbedPagEncrypt");
        } catch (UnsatisfiedLinkError e4) {
            Log.e("pangle-encrypt", e4.getMessage());
        }
    }

    public static byte[] decrypt(byte[] bArr, int i9) {
        try {
            return ttDecrypt(bArr, i9);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "decrypt exception " + th.getMessage());
            return null;
        }
    }

    public static byte[] encrypt(byte[] bArr, int i9) {
        try {
            return ttEncrypt(bArr, i9);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            return null;
        }
    }

    private static native byte[] ttDecrypt(byte[] bArr, int i9);

    private static native byte[] ttEncrypt(byte[] bArr, int i9);
}
