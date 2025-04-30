package com.bytedance.sdk.component.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public class YW {
    private static final byte[] COT;
    private static final byte[] HWF;
    private static final byte[] KS;
    private static final int QR;
    private static final byte[] jU;
    private static final byte[] lMd;
    private static final byte[] zp;

    static {
        byte[] bArr = {-1, -40, -1};
        zp = bArr;
        byte[] bArr2 = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};
        lMd = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        KS = bArr3;
        byte[] zp2 = zp("BM");
        jU = zp2;
        COT = zp("GIF87a");
        HWF = zp("GIF89a");
        QR = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(bArr.length), Integer.valueOf(bArr2.length), Integer.valueOf(bArr3.length), Integer.valueOf(zp2.length), 6))).intValue();
    }

    private static boolean COT(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = jU;
        if (length >= bArr2.length && zp(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    private static boolean HWF(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = KS;
        if (length >= bArr2.length && zp(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    private static boolean KS(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = lMd;
        if (length >= bArr2.length && zp(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    private static boolean jU(byte[] bArr) {
        if ((bArr.length >= 6 && zp(bArr, COT)) || zp(bArr, HWF)) {
            return true;
        }
        return false;
    }

    private static boolean lMd(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = zp;
        if (length >= bArr2.length && zp(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    public static int zp() {
        return QR;
    }

    public static final String zp(byte[] bArr) {
        if (lMd(bArr)) {
            return "jpeg";
        }
        if (KS(bArr)) {
            return "png";
        }
        if (jU(bArr)) {
            return "gif";
        }
        if (COT(bArr)) {
            return "bmp";
        }
        if (HWF(bArr)) {
            return "ico";
        }
        return "other";
    }

    private static boolean zp(byte[] bArr, byte[] bArr2) {
        return zp(bArr, bArr2, 0);
    }

    private static boolean zp(byte[] bArr, byte[] bArr2, int i9) {
        if (bArr2.length + i9 > bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i9 + i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] zp(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException("ASCII not found!", e4);
        }
    }
}
