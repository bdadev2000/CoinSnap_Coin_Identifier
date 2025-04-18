package com.applovin.impl;

import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public abstract class ep {
    public static int a(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static boolean a(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = -4; i6 <= 4; i6++) {
            int i7 = (i6 * Opcodes.NEWARRAY) + i4;
            if (i7 < i2 || i7 >= i3 || bArr[i7] != 71) {
                i5 = 0;
            } else {
                i5++;
                if (i5 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long a(bh bhVar, int i2, int i3) {
        bhVar.f(i2);
        if (bhVar.a() < 5) {
            return -9223372036854775807L;
        }
        int j2 = bhVar.j();
        if ((8388608 & j2) != 0 || ((2096896 & j2) >> 8) != i3 || (j2 & 32) == 0 || bhVar.w() < 7 || bhVar.a() < 7 || (bhVar.w() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        bhVar.a(bArr, 0, 6);
        return a(bArr);
    }

    private static long a(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
