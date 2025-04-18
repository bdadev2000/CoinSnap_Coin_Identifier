package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame;
import com.mbridge.msdk.system.NoProGuard;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes4.dex */
public class SameMD5 implements NoProGuard {
    public static final String TAG = "MD5";

    public static String ByteArrayToHexString(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        int length = bArr.length * 2;
        byte[] bArr2 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = 48;
        }
        byte[] bArr3 = new byte[bArr.length + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        byte[] bytes = new BigInteger(bArr3).toString(16).getBytes();
        System.arraycopy(bytes, 0, bArr2, length - bytes.length, bytes.length);
        return new String(bArr2);
    }

    private static String UpHexEncode(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b3 : bArr) {
            sb2.append(Integer.toHexString((b3 & 240) >>> 4));
            sb2.append(Integer.toHexString(b3 & Ascii.SI));
        }
        return sb2.toString().toUpperCase(Locale.US);
    }

    public static String getMD5(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            ad.a(TAG, str);
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return hexEncode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getQftJSMD5(String str) {
        try {
            byte[] qftJSMD5Bytes = getQftJSMD5Bytes(str);
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.update(qftJSMD5Bytes);
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i10 = 0;
            for (byte b3 : digest) {
                int i11 = i10 + 1;
                cArr2[i10] = cArr[(b3 >>> 4) & 15];
                i10 = i11 + 1;
                cArr2[i11] = cArr[b3 & Ascii.SI];
            }
            return new String(cArr2);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static byte[] getQftJSMD5Bytes(String str) throws UnsupportedEncodingException {
        int length = str.length();
        byte[] bytes = str.getBytes("UTF-16LE");
        ad.c(InternalFrame.ID, "b = " + ByteArrayToHexString(bytes));
        byte[] bArr = new byte[length];
        int i10 = 0;
        for (int i11 = 0; i11 < bytes.length; i11 += 2) {
            byte b3 = bytes[i11];
            if (b3 != -1 && b3 != -2) {
                bArr[i10] = b3;
                i10++;
                if (i10 == length) {
                    break;
                }
            }
        }
        ad.c(InternalFrame.ID, "source = " + ByteArrayToHexString(bArr));
        return bArr;
    }

    public static String getUPMD5(String str) {
        try {
            ad.a(TAG, str);
            MessageDigest messageDigest = MessageDigest.getInstance(TAG);
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            return UpHexEncode(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String hexEncode(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b3 : bArr) {
            sb2.append(Integer.toHexString((b3 & 240) >>> 4));
            sb2.append(Integer.toHexString(b3 & Ascii.SI));
        }
        return sb2.toString().toLowerCase(Locale.US);
    }
}
