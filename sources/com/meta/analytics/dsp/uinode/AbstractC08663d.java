package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08663d {
    public static byte[] A00;
    public static String[] A01 = {"gK21opX6pdVXzizTr5B569byzifByDT1", "VXUYBRMamhge5PldHXwCUhQsvqUwyGaK", "A9eN1weHgCPL1SkQ3ZXjYtrHuOy08x6Y", "MZbjV39kBt4hAqLFGwVFLXlTEV84r4gZ", "MdBS2JQ6", "f1VlKL6T46QLbXXjKJzzCBeajzTILabi", "uaXBHv2Fpyp6t9CjlnIdC1IJtF0IP5s0", "SVJaljzXeB5Am8n"};

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 57);
            String[] strArr = A01;
            if (strArr[1].charAt(18) == strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            A01[4] = "X228u0Qr";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-69, -67, -50, -61, -48, -61, -50, -45, -71, -55, -68, -60, -65, -67, -50, -71, -61, -66, -43, -41, -24, -35, -22, -35, -24, -19, -45, -22, -35, -39, -21, -45, -24, -19, -28, -39, -26, -23, -28, -15, -18, -8, -7, -22, -13, -22, -9, -28, -8, -22, -7, 4, 2, Ascii.CR, Ascii.CR, 0, 10, 8, Ascii.SI, Ascii.DLE, 19, 6, 5, -54, -49, -56, -48, -43, -52, -53, -58, -56, -53, -58, -48, -43, -53, -52, -33, -27, -22, -29, -21, -16, -25, -26, -31, -14, -29, -12, -29, -17, -11, -31, -20, -11, -15, -16, 19, 32, 32, Ascii.GS, 32, Ascii.CR, 17, Ascii.GS, Ascii.DC2, 19, Ascii.CR, Ascii.SUB, Ascii.SUB, Ascii.ETB, Ascii.SUB, 7, Ascii.NAK, Ascii.CR, Ascii.ESC, Ascii.ESC, 9, Ascii.SI, Ascii.CR, -73, -54, -75, -73, -62, -58, -69, -63, -64, -88, -95, -77, -97, -94, -87, -92, -25, -32, -14, -34, -30, -18, -19, -13, -15, -18, -21, -21, -28, -15, -51, -58, -40, -60, -47, -50, -40, -39, -54, -45, -54, -41, -69, -76, -58, -78, -54, -72, -75, -55, -68, -72, -54, -29, -37, -36, -39, -34, -29, -19, -37, -36, -26, -33, -34, -39, -36, -13, -39, -31, -27, 7, 2, -70, -60, -80, -70, -65, -57, -78, -67, -70, -75, -78, -59, -74, -75, -62, -52, -72, -59, -66, -65, -51, -72, -51, -56, -55, -72, -63, -70, -59, -65, -47, -37, -57, -40, -35, -54, -44, -47, -53, -92, -82, -102, -82, -85, -89, -92, -81, -102, -82, -98, -83, -96, -96, -87, -102, -95, -89, -100, -94, -102, -100, -97, -97, -96, -97, -1, 9, -11, 9, Ascii.VT, 6, 6, 5, 8, 10, -5, -6, -11, -1, 4, -11, -9, 6, 6, Ascii.US, 34, Ascii.DC4, Ascii.ETB, Ascii.DC2, 39, Ascii.FS, 32, Ascii.CAN, Ascii.DC2, 32, 38, -90, -87, -101, -98, -93, -88, -95, -103, -101, -98, -101, -86, -82, -97, -84, -77, -89, -76, -81, -84, -85, -71, -70, -91, -77, -67, -91, -71, -69, -74, -74, -75, -72, -70, -8, -16, -17, -12, -20, -1, -12, -6, -7, -22, -6, 1, -16, -3, -9, -20, 4, -22, -2, -16, -1, -63, -71, -57, -57, -75, -69, -71, Ascii.SUB, Ascii.FS, 17, Ascii.DC2, -33, -23, -47, -31, -27, -47, -27, -25, -30, -30, -31, -28, -26, 9, 5, -6, -4, -2, 6, -2, 7, Ascii.CR, -8, 2, -3, -65, -69, -80, -78, -76, -68, -76, -67, -61, -82, -61, -56, -65, -76, -84, -82, -85, -78, -91, -96, -95, -82, Ascii.DC2, 5, 1, 19, Ascii.SI, Ascii.SO, 35, Ascii.SYN, 34, 38, Ascii.SYN, 36, 37, Ascii.DLE, Ascii.SUB, Ascii.NAK, -28, -39, -32, -24, -48, -29, -42, -28, -26, -35, -27, -47, -55, -57, -50, -67, -48, -61, -65, -47, -51, -52, -38, -41, -58, -38, -54, -58, -44, -34, -58, -42, -38, -58, -38, -36, -41, -41, -42, -39, -37, -47, -42, -51, -62, 3, -61, -74, -78, -60, -84, -63, -58, -67, -78, Ascii.SUB, Ascii.CR, Ascii.ETB, Ascii.CR, 6, Ascii.CR, Ascii.DLE, Ascii.CR, Ascii.CAN, Ascii.GS, -38, -47, -52, -62, -55, -60, -49, -42, -56, -62, -43, -56, -60, -42, -46, -47};
    }

    static {
        A01();
    }
}
