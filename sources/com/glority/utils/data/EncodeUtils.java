package com.glority.utils.data;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* loaded from: classes9.dex */
public final class EncodeUtils {
    public static String urlEncode(String str) {
        return urlEncode(str, "UTF-8");
    }

    public static String urlEncode(String str, String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static String urlDecode(String str) {
        return urlDecode(str, "UTF-8");
    }

    public static String urlDecode(String str, String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] base64Encode(String str) {
        return base64Encode(str.getBytes());
    }

    public static byte[] base64Encode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        return Base64.encode(bArr, 2);
    }

    public static String base64Encode2String(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        return Base64.encodeToString(bArr, 2);
    }

    public static byte[] base64Decode(String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        return Base64.decode(str, 2);
    }

    public static byte[] base64Decode(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        return Base64.decode(bArr, 2);
    }

    private EncodeUtils() {
        throw new UnsupportedOperationException("u can't initialize me!");
    }
}
