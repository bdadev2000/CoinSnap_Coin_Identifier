package com.bytedance.sdk.component.wN.tN.tN;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import kotlin.UByte;

/* loaded from: classes.dex */
public class tN {
    private static final char[] YFl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String YFl(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes("UTF-8"));
                    return YFl(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String YFl(byte[] bArr) {
        if (bArr != null) {
            return YFl(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String YFl(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if (i10 >= 0 && i10 + i11 <= bArr.length) {
                int i12 = i11 * 2;
                char[] cArr = new char[i12];
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    int i15 = bArr[i14 + i10] & UByte.MAX_VALUE;
                    int i16 = i13 + 1;
                    char[] cArr2 = YFl;
                    cArr[i13] = cArr2[i15 >> 4];
                    i13 = i16 + 1;
                    cArr[i16] = cArr2[i15 & 15];
                }
                return new String(cArr, 0, i12);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
