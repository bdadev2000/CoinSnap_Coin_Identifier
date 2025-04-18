package com.bytedance.sdk.component.utils;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public class qsH {
    private static final byte[] AlY;
    private static final int DSW;
    private static final byte[] Sg;
    private static final byte[] YFl;
    private static final byte[] tN;

    /* renamed from: vc, reason: collision with root package name */
    private static final byte[] f10444vc;
    private static final byte[] wN;

    static {
        byte[] bArr = {-1, -40, -1};
        YFl = bArr;
        byte[] bArr2 = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10};
        Sg = bArr2;
        byte[] bArr3 = {0, 0, 1, 0};
        tN = bArr3;
        byte[] YFl2 = YFl("BM");
        AlY = YFl2;
        wN = YFl("GIF87a");
        f10444vc = YFl("GIF89a");
        DSW = ((Integer) Collections.max(Arrays.asList(Integer.valueOf(bArr.length), Integer.valueOf(bArr2.length), Integer.valueOf(bArr3.length), Integer.valueOf(YFl2.length), 6))).intValue();
    }

    private static boolean AlY(byte[] bArr) {
        if ((bArr.length >= 6 && YFl(bArr, wN)) || YFl(bArr, f10444vc)) {
            return true;
        }
        return false;
    }

    private static boolean Sg(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = YFl;
        if (length >= bArr2.length && YFl(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    public static int YFl() {
        return DSW;
    }

    private static boolean tN(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = Sg;
        if (length >= bArr2.length && YFl(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    private static boolean vc(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = tN;
        if (length >= bArr2.length && YFl(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    private static boolean wN(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = AlY;
        if (length >= bArr2.length && YFl(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    public static final String YFl(byte[] bArr) {
        return Sg(bArr) ? "jpeg" : tN(bArr) ? "png" : AlY(bArr) ? "gif" : wN(bArr) ? "bmp" : vc(bArr) ? "ico" : "other";
    }

    private static boolean YFl(byte[] bArr, byte[] bArr2) {
        return YFl(bArr, bArr2, 0);
    }

    private static boolean YFl(byte[] bArr, byte[] bArr2, int i10) {
        if (bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] YFl(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }
}
