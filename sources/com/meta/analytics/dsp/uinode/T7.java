package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T7 extends KT {
    public static byte[] A01;
    public static String[] A02 = {"WjVP47fRQbzFkvh8jITH65ubc4v5SvCG", "KHLch0xvttS1s7pDGgDEm0ErGuqh2Feh", "", "N5tYdahQHQ8ekE9zsl4KMP3kvK277KXb", "RTyub6Z4XGd49fcp4oLDuBYuJ7e8bv6c", "EESkLRk7pQiV173Cki8Pyh", "g0C3qbvxb6pNRGtaTLmHtkzFJg0jsK6T", "9AN"};
    public final /* synthetic */ T4 A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[1].charAt(5) != '0') {
                throw new RuntimeException();
            }
            A02[4] = "dM73aw5ks7hDwKSnbdFWLVfeJ3xGYIch";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            int i13 = (copyOfRange[i12] - i11) - 81;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[5].length()) {
                A02[0] = "hwwcl2mktrJEeqefr8kwHu1pjzQ1LhvY";
                copyOfRange[i12] = (byte) i13;
                i12++;
            } else {
                A02[7] = "CzI";
                copyOfRange[i12] = (byte) i13;
                i12 += 0;
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

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z8;
        InterfaceC1396Pd interfaceC1396Pd;
        z8 = this.A00.A07;
        if (!z8) {
            interfaceC1396Pd = this.A00.A0F;
            interfaceC1396Pd.ADX(A00(0, 24, 116));
        }
    }
}
