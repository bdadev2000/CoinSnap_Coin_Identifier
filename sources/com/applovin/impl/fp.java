package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public abstract class fp {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static boolean a(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long a(yg ygVar, int i10, int i11) {
        ygVar.f(i10);
        if (ygVar.a() < 5) {
            return C.TIME_UNSET;
        }
        int j3 = ygVar.j();
        if ((8388608 & j3) != 0 || ((2096896 & j3) >> 8) != i11 || (j3 & 32) == 0 || ygVar.w() < 7 || ygVar.a() < 7 || (ygVar.w() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        ygVar.a(bArr, 0, 6);
        return a(bArr);
    }

    private static long a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
