package com.bytedance.sdk.component.utils;

import androidx.fragment.app.FragmentTransaction;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class COT {
    private static final char[] zp = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String zp(byte[] bArr) {
        if (bArr != null) {
            return zp(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String zp(byte[] bArr, int i9, int i10) {
        if (bArr != null) {
            if (i9 >= 0 && i9 + i10 <= bArr.length) {
                int i11 = i10 * 2;
                char[] cArr = new char[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    byte b = bArr[i13 + i9];
                    int i14 = i12 + 1;
                    char[] cArr2 = zp;
                    cArr[i12] = cArr2[(b & 255) >> 4];
                    i12 += 2;
                    cArr[i14] = cArr2[b & Ascii.SI];
                }
                return new String(cArr, 0, i11);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }

    public static String zp(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[FragmentTransaction.TRANSIT_EXIT_MASK];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, FragmentTransaction.TRANSIT_EXIT_MASK);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                String zp2 = zp(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return zp2;
            } catch (Throwable unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            fileInputStream = null;
        }
    }

    public static String zp(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes("UTF-8"));
                    return zp(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
