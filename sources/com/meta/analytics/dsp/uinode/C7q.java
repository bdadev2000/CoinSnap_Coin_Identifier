package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public enum C7q {
    A09(9000, A00(0, 30, 116)),
    A07(3001, A00(160, 29, 56)),
    A06(3002, A00(125, 35, 6)),
    A08(3003, A00(PsExtractor.PRIVATE_STREAM_1, 33, 36)),
    A05(3004, A00(90, 35, 71));

    public static byte[] A02;
    public static String[] A03 = {"dUypCp5ZH75", "x5Qm8f9lc", "sq2W39eKqgwqqOWlIAV", "igK", "bv2fGbu4PZe4QDTt94R09bPmX6", "Gs0WF5WWQbMJ1GPXWCa", "E1e7Uw5ci0LxHvCHKGZ7MMTImO0krz0e", "59L0PM8TZSDfga3AwgwmMzwLrxdyp45T"};
    public final int A00;
    public final String A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[4].length() != 26) {
                throw new RuntimeException();
            }
            A03[5] = "61vyGPsquycEeLbb0w4";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            byte b = copyOfRange[i12];
            if (A03[6].charAt(17) != '3') {
                A03[3] = "XBx";
                copyOfRange[i12] = (byte) ((b ^ i11) ^ 105);
                i12++;
            } else {
                A03[3] = "7Eu";
                copyOfRange[i12] = (byte) ((b ^ i11) ^ 105);
                i12 += 0;
            }
        }
    }

    public static void A01() {
        A02 = new byte[]{92, 115, 61, 104, 115, 118, 115, 114, 106, 115, 61, 120, 111, 111, 114, 111, 61, 117, 124, 110, 61, 114, 126, 126, 104, 111, 111, 120, 121, 51, 116, 113, 100, 113, 114, 113, 99, 117, 111, 116, 117, 124, 117, 100, 117, 56, 61, 40, 61, 62, 61, 47, 57, 35, 53, 50, 47, 57, 46, 40, 39, 34, 55, 34, 33, 34, 48, 38, 60, 48, 38, 47, 38, 32, 55, 92, 89, 76, 89, 90, 89, 75, 93, 71, 77, 72, 92, 89, 76, 93, 104, 79, 71, 66, 75, 74, Ascii.SO, 90, 65, Ascii.SO, 74, 75, 66, 75, 90, 75, Ascii.SO, 92, 65, 89, Ascii.SO, 72, 92, 65, 67, Ascii.SO, 74, 79, 90, 79, 76, 79, 93, 75, 0, 41, Ascii.SO, 6, 3, 10, Ascii.VT, 79, Ascii.ESC, 0, 79, 6, 1, Ascii.FS, 10, Ascii.GS, Ascii.ESC, 79, Ascii.GS, 0, Ascii.CAN, 79, 6, 1, Ascii.ESC, 0, 79, Ascii.VT, Ascii.SO, Ascii.ESC, Ascii.SO, Ascii.CR, Ascii.SO, Ascii.FS, 10, 65, Ascii.ETB, 48, 56, 61, 52, 53, 113, 37, 62, 113, 35, 52, 48, 53, 113, 55, 35, 62, 60, 113, 53, 48, 37, 48, 51, 48, 34, 52, Ascii.DEL, Ascii.VT, 44, 36, 33, 40, 41, 109, 57, 34, 109, 56, 61, 41, 44, 57, 40, 109, 63, 34, 58, 109, 36, 35, 109, 41, 44, 57, 44, 47, 44, 62, 40, 99, 98, 121, 124, 121, 120, 96, 121};
    }

    static {
        A01();
    }

    C7q(int i9, String str) {
        this.A00 = i9;
        this.A01 = str;
    }

    public final int A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A01;
    }
}
