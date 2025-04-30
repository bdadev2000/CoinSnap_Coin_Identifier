package com.applovin.impl;

/* loaded from: classes.dex */
public abstract class fp {
    public static int a(byte[] bArr, int i9, int i10) {
        while (i9 < i10 && bArr[i9] != 71) {
            i9++;
        }
        return i9;
    }

    public static boolean a(byte[] bArr, int i9, int i10, int i11) {
        int i12 = 0;
        for (int i13 = -4; i13 <= 4; i13++) {
            int i14 = (i13 * 188) + i11;
            if (i14 < i9 || i14 >= i10 || bArr[i14] != 71) {
                i12 = 0;
            } else {
                i12++;
                if (i12 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long a(yg ygVar, int i9, int i10) {
        ygVar.f(i9);
        if (ygVar.a() < 5) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        int j7 = ygVar.j();
        if ((8388608 & j7) != 0 || ((2096896 & j7) >> 8) != i10 || (j7 & 32) == 0 || ygVar.w() < 7 || ygVar.a() < 7 || (ygVar.w() & 16) != 16) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        ygVar.a(bArr, 0, 6);
        return a(bArr);
    }

    private static long a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
