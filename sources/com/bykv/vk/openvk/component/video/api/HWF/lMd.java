package com.bykv.vk.openvk.component.video.api.HWF;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class lMd {
    private static final MessageDigest zp = zp();
    private static final char[] lMd = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private lMd() {
    }

    private static MessageDigest zp() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String zp(String str) {
        byte[] digest;
        MessageDigest messageDigest = zp;
        if (messageDigest != null && !TextUtils.isEmpty(str)) {
            byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
            synchronized (lMd.class) {
                digest = messageDigest.digest(bytes);
            }
            return zp(digest);
        }
        return "";
    }

    public static String zp(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i9 = 0;
        for (byte b : bArr) {
            int i10 = i9 + 1;
            char[] cArr2 = lMd;
            cArr[i9] = cArr2[(b & 240) >> 4];
            i9 += 2;
            cArr[i10] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }
}
