package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
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

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{83, 100, 100, 121, 100, 54, 102, 119, 100, 101, Ascii.DEL, 120, 113, 54, 94, 83, 64, 85, 54, 117, 121, 120, 112, Ascii.DEL, 113};
    }

    static {
        A02();
    }

    public IN(List<byte[]> initializationData, int i9) {
        this.A01 = initializationData;
        this.A00 = i9;
    }

    public static IN A00(C1217Hz c1217Hz) throws C10259v {
        try {
            c1217Hz.A0Z(21);
            int A0E = c1217Hz.A0E() & 3;
            int i9 = c1217Hz.A0E();
            int j7 = 0;
            int A06 = c1217Hz.A06();
            for (int i10 = 0; i10 < i9; i10++) {
                c1217Hz.A0Z(1);
                int csdStartPosition = c1217Hz.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = c1217Hz.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    j7 += lengthSizeMinusOne;
                    c1217Hz.A0Z(numberOfArrays);
                }
            }
            c1217Hz.A0Y(A06);
            byte[] buffer = new byte[j7];
            int csdStartPosition2 = 0;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int numberOfArrays2 = str.charAt(26);
            int lengthSizeMinusOne2 = str2.charAt(26);
            if (numberOfArrays2 != lengthSizeMinusOne2) {
                A03[7] = MBridgeConstans.API_REUQEST_CATEGORY_APP;
                for (int lengthSizeMinusOne3 = 0; lengthSizeMinusOne3 < i9; lengthSizeMinusOne3++) {
                    c1217Hz.A0Z(1);
                    int A0I = c1217Hz.A0I();
                    for (int j9 = 0; j9 < A0I; j9++) {
                        int numberOfNalUnits = c1217Hz.A0I();
                        byte[] bArr = AbstractC1213Hv.A03;
                        int csdLength2 = AbstractC1213Hv.A03.length;
                        System.arraycopy(bArr, 0, buffer, csdStartPosition2, csdLength2);
                        int numberOfArrays3 = AbstractC1213Hv.A03.length;
                        int csdStartPosition3 = csdStartPosition2 + numberOfArrays3;
                        byte[] bArr2 = c1217Hz.A00;
                        int numberOfArrays4 = c1217Hz.A06();
                        System.arraycopy(bArr2, numberOfArrays4, buffer, csdStartPosition3, numberOfNalUnits);
                        csdStartPosition2 = csdStartPosition3 + numberOfNalUnits;
                        c1217Hz.A0Z(numberOfNalUnits);
                    }
                }
                int numberOfArrays5 = A0E + 1;
                return new IN(j7 == 0 ? null : Collections.singletonList(buffer), numberOfArrays5);
            }
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw new C10259v(A01(0, 25, 65), e4);
        }
    }
}
