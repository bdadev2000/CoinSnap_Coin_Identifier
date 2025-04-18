package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T7 extends KT {
    public static byte[] A01;
    public static String[] A02 = {"WjVP47fRQbzFkvh8jITH65ubc4v5SvCG", "KHLch0xvttS1s7pDGgDEm0ErGuqh2Feh", "", "N5tYdahQHQ8ekE9zsl4KMP3kvK277KXb", "RTyub6Z4XGd49fcp4oLDuBYuJ7e8bv6c", "EESkLRk7pQiV173Cki8Pyh", "g0C3qbvxb6pNRGtaTLmHtkzFJg0jsK6T", "9AN"};
    public final /* synthetic */ T4 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[1].charAt(5) != '0') {
                throw new RuntimeException();
            }
            A02[4] = "dM73aw5ks7hDwKSnbdFWLVfeJ3xGYIch";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            int i14 = (copyOfRange[i13] - i12) - 81;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[5].length()) {
                A02[0] = "hwwcl2mktrJEeqefr8kwHu1pjzQ1LhvY";
                copyOfRange[i13] = (byte) i14;
                i13++;
            } else {
                A02[7] = "CzI";
                copyOfRange[i13] = (byte) i14;
                i13 += 0;
            }
        }
    }

    public static void A02() {
        A01 = new byte[]{Ascii.ESC, 46, 41, 42, 52, -27, 60, 38, 56, -27, 51, 42, 59, 42, 55, -27, 53, 55, 42, 53, 38, 55, 42, 41};
    }

    static {
        A02();
    }

    public T7(T4 t42) {
        this.A00 = t42;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        InterfaceC0830Pd interfaceC0830Pd;
        z10 = this.A00.A07;
        if (!z10) {
            interfaceC0830Pd = this.A00.A0F;
            interfaceC0830Pd.ADX(A00(0, 24, 116));
        }
    }
}
