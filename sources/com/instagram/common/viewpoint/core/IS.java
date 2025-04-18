package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class IS {
    public static byte[] A02;
    public final int A00;
    public final List<byte[]> A01;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{44, 89, 89, 86, 89, 7, 87, 72, 89, 90, 80, 85, 78, 7, 47, 44, 61, 42, 7, 74, 86, 85, 77, 80, 78};
    }

    public IS(List<byte[]> initializationData, int i2) {
        this.A01 = initializationData;
        this.A00 = i2;
    }

    public static IS A00(I4 i4) throws A0 {
        try {
            i4.A0Z(21);
            int A0E = i4.A0E() & 3;
            int A0E2 = i4.A0E();
            int i2 = 0;
            int A06 = i4.A06();
            for (int i3 = 0; i3 < A0E2; i3++) {
                i4.A0Z(1);
                int csdStartPosition = i4.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = i4.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    i2 += lengthSizeMinusOne;
                    i4.A0Z(numberOfArrays);
                }
            }
            i4.A0Y(A06);
            byte[] bArr = new byte[i2];
            int bufferPosition = 0;
            for (int i5 = 0; i5 < A0E2; i5++) {
                i4.A0Z(1);
                int A0I = i4.A0I();
                for (int csdStartPosition2 = 0; csdStartPosition2 < A0I; csdStartPosition2++) {
                    int csdLength2 = i4.A0I();
                    byte[] bArr2 = I0.A03;
                    int numberOfArrays2 = I0.A03.length;
                    System.arraycopy(bArr2, 0, bArr, bufferPosition, numberOfArrays2);
                    int lengthSizeMinusOne2 = I0.A03.length;
                    int bufferPosition2 = bufferPosition + lengthSizeMinusOne2;
                    byte[] bArr3 = i4.A00;
                    int lengthSizeMinusOne3 = i4.A06();
                    System.arraycopy(bArr3, lengthSizeMinusOne3, bArr, bufferPosition2, csdLength2);
                    bufferPosition = bufferPosition2 + csdLength2;
                    i4.A0Z(csdLength2);
                }
            }
            int numberOfArrays3 = A0E + 1;
            return new IS(i2 == 0 ? null : Collections.singletonList(bArr), numberOfArrays3);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new A0(A01(0, 25, Opcodes.DNEG), e);
        }
    }
}
