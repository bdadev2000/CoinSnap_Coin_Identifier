package com.glority.android.networkconfig.util;

import com.google.common.base.Ascii;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class Md5Utils {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String md5(String str) {
        return md5(str.getBytes());
    }

    public static String md5(byte[] bArr) {
        try {
            return String.valueOf(encodeHex(MessageDigest.getInstance("MD5").digest(bArr)));
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static char[] encodeHex(byte[] bArr) {
        char[] cArr = new char[32];
        for (int i = 0; i < 32; i += 2) {
            byte b = bArr[i / 2];
            char[] cArr2 = HEX_CHARS;
            cArr[i] = cArr2[(b >>> 4) & 15];
            cArr[i + 1] = cArr2[b & Ascii.SI];
        }
        return cArr;
    }
}
