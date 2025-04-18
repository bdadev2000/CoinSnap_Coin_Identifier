package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class IN {
    public static byte[] A02;
    public static String[] A03 = {"ByJYsTLYuoR6uc8r", "JtyXwt9Aly6TcqGHtKIVJmBsk4OeLfoM", "a9HBAd1W81XiearAjjAT3V1ZsLEmO9Oi", "EXNlrjnsmLCbvnLTR5jNuRmyx9d0ZBX8", "CaQoJFxeqSTbWtIeh0kRdnuLPh9NlfCW", "NDFH7JBJhJBLaqfKHqozYt4fbxKVNhf7", "NTYlS1n6YEIgBX9wiCzSTuRNkv1W0ADe", "oBB1NAAyCwUYb6ONAQdFrjyju4xXh"};
    public final int A00;
    public final List<byte[]> A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{83, 100, 100, 121, 100, 54, 102, 119, 100, 101, Byte.MAX_VALUE, 120, 113, 54, 94, 83, 64, 85, 54, 117, 121, 120, 112, Byte.MAX_VALUE, 113};
    }

    static {
        A02();
    }

    public IN(List<byte[]> initializationData, int i10) {
        this.A01 = initializationData;
        this.A00 = i10;
    }

    public static IN A00(C0651Hz c0651Hz) throws C04599v {
        try {
            c0651Hz.A0Z(21);
            int A0E = c0651Hz.A0E() & 3;
            int i10 = c0651Hz.A0E();
            int j3 = 0;
            int A06 = c0651Hz.A06();
            for (int i11 = 0; i11 < i10; i11++) {
                c0651Hz.A0Z(1);
                int csdStartPosition = c0651Hz.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = c0651Hz.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    j3 += lengthSizeMinusOne;
                    c0651Hz.A0Z(numberOfArrays);
                }
            }
            c0651Hz.A0Y(A06);
            byte[] buffer = new byte[j3];
            int csdStartPosition2 = 0;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int numberOfArrays2 = str.charAt(26);
            int lengthSizeMinusOne2 = str2.charAt(26);
            if (numberOfArrays2 != lengthSizeMinusOne2) {
                A03[7] = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                for (int lengthSizeMinusOne3 = 0; lengthSizeMinusOne3 < i10; lengthSizeMinusOne3++) {
                    c0651Hz.A0Z(1);
                    int A0I = c0651Hz.A0I();
                    for (int j10 = 0; j10 < A0I; j10++) {
                        int numberOfNalUnits = c0651Hz.A0I();
                        byte[] bArr = AbstractC0647Hv.A03;
                        int csdLength2 = AbstractC0647Hv.A03.length;
                        System.arraycopy(bArr, 0, buffer, csdStartPosition2, csdLength2);
                        int numberOfArrays3 = AbstractC0647Hv.A03.length;
                        int csdStartPosition3 = csdStartPosition2 + numberOfArrays3;
                        byte[] bArr2 = c0651Hz.A00;
                        int numberOfArrays4 = c0651Hz.A06();
                        System.arraycopy(bArr2, numberOfArrays4, buffer, csdStartPosition3, numberOfNalUnits);
                        csdStartPosition2 = csdStartPosition3 + numberOfNalUnits;
                        c0651Hz.A0Z(numberOfNalUnits);
                    }
                }
                int numberOfArrays5 = A0E + 1;
                return new IN(j3 == 0 ? null : Collections.singletonList(buffer), numberOfArrays5);
            }
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new C04599v(A01(0, 25, 65), e2);
        }
    }
}
