package com.glority.encrypt;

/* loaded from: classes6.dex */
public class Encrypt {
    public static native byte[] nativeCheck(Object obj);

    public static byte[] getPrivateKey(Object obj) {
        return nativeCheck(obj);
    }

    static {
        System.loadLibrary("encrypt");
    }
}
