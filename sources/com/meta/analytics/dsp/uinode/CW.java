package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class CW {
    public static byte[] A00;
    public static String[] A01 = {"EhkLIrimZn91jsZcFpUmC2em5xW8fygq", "2muUTIaleN4WCFoYMpHC6q6VhoZW7gkI", "J0NNw", "2CzwTP6LTBanpyFCXvhOIX0fZugLI5jl", "0apP5", "lsU8WbdbtAGyoZkM2wLzBQOBiAlwrCYY", "UBoaF0NE0j", "le0Whqwk6XHtUHT8tTexIPFnsukLnkb9"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final String[] A0V;

    public static String A09(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        String[] strArr = A01;
        if (strArr[0].charAt(26) == strArr[5].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "xleJdT1MxCtz65Wgf6iqYH4Hd8f9hpAb";
        strArr2[3] = "1GjfW8HnlNldIpfsALSj4nEGGcVe2cv6";
        A00 = new byte[]{-8, -8, -8, -8, -75, Ascii.CAN, -9, 58, 56, 71, 60, 67, 67, 56, 43, 60, 62, -12, Ascii.SYN, Ascii.FS, Ascii.ETB, -16, Ascii.DC2, Ascii.CAN, 19, -49, -7, Ascii.DLE, 41, 41, 38, 72, 78, 73, 5, 53, 90, 83, 80, 2, 36, 48, 54, 52, 53, 42, 36, -7, 36, 44, Ascii.GS, 42, 38, 10, 39, Ascii.ESC, 35, 44, 87, 95, 80, 93, 89, 76, 95, 84, 97, 80, -58, -14, -25, -18, -22, -13, -7, -48, -3, -8, -4, -12, Ascii.GS, 82, 61, 74, 80, 67, 61, 78, 64, 65, 37, 68, 79, 79, 68, 71, 37, 68, 86, 86, Ascii.NAK, 56, 52, 71, -63, -28, -31, -18, -31, -29, 10, 8, -63, -29, 2, Ascii.SI, 5, -64, -22, -33, -31, -23, -98, -53, -29, -14, -33, -22, Ascii.US, 73, 82, 66, 68, 79, 62, 80, 80, 47, 89, 98, 82, 96, -6, 39, 39, 44, 49, -40, -6, Ascii.EM, 43, 43, -7, 41, 32, 43, 7, 38, 39, -30, 0, 1, 0, 17, 4, 19, 8, 42, 49, 57, 46, 40, Ascii.RS, 67, 60, 72, 61, 64, 77, -5, 40, 80, 78, 68, 62, Ascii.DLE, 53, 46, 59, 64, 60, 59, -19, Ascii.DC2, Ascii.EM, Ascii.FS, Ascii.US, Ascii.GS, -59, -22, -12, -21, -11, -10, -21, -29, -16, -94, -55, -29, -16, -23, -11, -10, -29, -94, -44, -29, -14, 0, 37, 47, 38, 48, 49, 38, Ascii.RS, 43, -35, Ascii.SI, Ascii.RS, 45, -41, -4, 6, -3, 7, 8, -3, -11, 2, -76, -26, 3, -9, -1, -35, 6, -5, Ascii.CR, Ascii.CR, 3, -3, -70, -20, 9, -3, 5, -47, -6, -17, 1, 1, -9, -15, -17, -6, 3, 44, 53, 34, -21, Ascii.DC4, Ascii.GS, 10, -43, -16, Ascii.ETB, Ascii.GS, Ascii.ESC, Ascii.CR, 40, 84, 82, 74, 73, 94, -32, Ascii.FF, Ascii.VT, 17, 2, 10, Ascii.CR, Ascii.FF, Ascii.SI, -2, Ascii.SI, Ascii.SYN, -67, -32, 5, Ascii.SI, 6, Ascii.DLE, 17, 6, -2, Ascii.VT, -42, 2, 8, 1, 7, 5, Ascii.FF, -53, -6, -9, -5, -5, -9, -2, -19, -6, 40, 90, 81, 89, -54, -25, -12, -23, -21, -2, Ascii.ESC, 40, Ascii.GS, Ascii.US, -38, 2, Ascii.ESC, 38, 38, Ascii.CAN, 53, 70, 63, 75, 53, 74, 57, 38, 71, 67, 86, 74, 2, 47, 71, 86, 67, 78, 8, 45, 55, 39, 51, 1, 47, 34, Ascii.RS, 42, -52, -6, -3, -11, -88, -82, -88, -54, -23, -5, -5, Ascii.NAK, 67, 70, 62, -15, 36, 64, 61, 64, Ascii.GS, 78, 62, 77, -28, 0, Ascii.DC2, Ascii.CAN, -65, -21, 8, Ascii.DC2, 19, 4, Ascii.CR, 8, Ascii.CR, 6, -59, -20, -27, -29, -12, -14, -17, -18, -23, -29, -40, 7, -5, 1, -4, -10, 62, 110, 107, 104, 38, 65, 104, 110, 108, 94, 54, 102, 99, 96, Ascii.RS, 69, 86, 84, 89, 95, 96, -4, 44, 41, 38, Ascii.ESC, Ascii.CAN, 37, Ascii.SUB, Ascii.FS, -12, Ascii.SI, Ascii.ETB, Ascii.SUB, 19, Ascii.DC2, -50, 34, Ascii.GS, -50, Ascii.RS, Ascii.SI, 32, 33, 19, -50, 17, Ascii.GS, Ascii.ESC, Ascii.ESC, 19, Ascii.FS, 34, -50, Ascii.SI, 34, 34, 32, Ascii.ETB, Ascii.DLE, 35, 34, 19, -24, -50, -52, -25, -17, -14, -21, -22, -90, -6, -11, -90, -10, -25, -8, -7, -21, -90, -23, -11, -4, -21, -8, -90, -25, -8, -6, -90, -25, -6, -6, -8, -17, -24, -5, -6, -21, -21, 6, Ascii.SO, 17, 10, 9, -59, Ascii.EM, Ascii.DC4, -59, Ascii.NAK, 6, Ascii.ETB, Ascii.CAN, 10, -59, Ascii.SO, 19, 9, 10, Ascii.GS, -44, 8, Ascii.DC4, Ascii.SUB, 19, Ascii.EM, -59, 6, Ascii.EM, Ascii.EM, Ascii.ETB, Ascii.SO, 7, Ascii.SUB, Ascii.EM, 10, -33, -59, -3, Ascii.CAN, 32, 35, Ascii.FS, Ascii.ESC, -41, 43, 38, -41, 39, Ascii.CAN, 41, 42, Ascii.FS, -41, 42, 43, Ascii.CAN, 37, Ascii.ESC, Ascii.CAN, 41, Ascii.ESC, -41, Ascii.RS, Ascii.FS, 37, 41, Ascii.FS, -41, Ascii.SUB, 38, Ascii.ESC, Ascii.FS, -41, -14, -6, -3, -10, -11, -79, 5, 0, -79, 1, -14, 3, 4, -10, -79, 5, -10, 9, 5, -79, -14, 5, 5, 3, -6, -13, 6, 5, -10, -53, -79, Ascii.VT, 38, 46, 49, 42, 41, -27, 57, 52, -27, 53, 38, 55, 56, 42, -27, 58, 46, 51, 57, -3, -27, 38, 57, 57, 55, 46, 39, 58, 57, 42, -27, 59, 38, 49, 58, 42, 37, 64, 72, 75, 68, 67, -1, 83, 78, -1, 79, 64, 81, 82, 68, -1, 84, 72, 77, 83, Ascii.ETB, -1, 64, 83, 83, 81, 72, 65, 84, 83, 68, Ascii.EM, -1, 42, 69, 87, 88, 4, 42, 89, 87, 77, 83, 82, 61, 102, 99, 98, 53, 94, 91, 90, Ascii.FS, 65, 94, 82, 90, -38, 3, 0, -1, 0, 3, 6, -7, 6, 50, 37, 37, 51, 52, 57, 44, 37, 54, 101, 94, 91, Ascii.EM, 72, 70, 60, 66, 65, -13, Ascii.CR, Ascii.EM, 17, -25, 1, Ascii.SO, 7, 19, Ascii.DC4, 1, 6, 46, 32, -63, -23, -19, -22, -33, -26, Ascii.ETB, 63, 68, 56, 57, 51, 10, 50, 55, 43, 44, 38, -29, Ascii.NAK, 50, 38, 46, 53, 96, 99, 92, 85, 83, Ascii.SUB, 51, 68, 54, -14, 36, 65, 53, 61, -18, 7, Ascii.CAN, 10, 9, Ascii.NAK, Ascii.CAN, Ascii.VT, -24, 5, 1, Ascii.SYN, Ascii.EM, -64, -19, 5, Ascii.DC4, 1, Ascii.FF, -51, -18, -11, -78, -51, -12, -11, Ascii.US, 70, 76, 74, 60, 35, 80, 72, 74, 80, 77, 44, 55, 56, 49, 40, 54, 36, 39, 57, 44, 54, 50, 53, 60, -30, -19, -18, -25, -34, -20, -32, -38, -23, -27, -34, -20, -20, 37, 74, 64, 69, 65, Ascii.SYN, 59, 49, 66, 64, 65, 63, 54, 46, 57, -60, -23, -18, -17, -19, -16, -24, -32, -23, -17, -36, -25, 7, 44, 49, 50, 48, 51, 43, 35, 44, 50, Ascii.US, 42, -34, Ascii.SO, 45, 46, Ascii.FS, 65, 70, 71, 69, 72, 64, 56, 65, 71, 52, 63, -13, 37, 66, 54, 62, 48, 71, 96, 96, 60, 83, 108, 108, Ascii.GS, 56, 103, 96, 93, 36, 74, 73, 74, -46, -3, -10, -17, -12, -19, 10, Ascii.US, 50, 39, 44, -22, Ascii.CR, -53, -28, 7, 57, 81, 80, 85, 96, 77, 96, 85, 98, 81, 5, Ascii.GS, 42, Ascii.GS, 38, Ascii.US, 45, Ascii.GS, -21, 3, Ascii.DC2, -1, 2, -1, Ascii.DC2, -1, -13, Ascii.DC2, 7, 10, 3, Ascii.ESC, 42, Ascii.ETB, 34, -39, 1, 
        -1, -11, -17, -19, -8, 58, 77, 96, 85, 91, 90, 77, 88, Ascii.FF, 50, 91, 88, 87, -11, 8, Ascii.ESC, Ascii.DLE, Ascii.GS, Ascii.FF, -57, -24, Ascii.DC4, Ascii.FF, Ascii.EM, Ascii.DLE, 10, 8, Ascii.NAK, Ascii.ESC, 50, 52, 50, 63, 61, 66, 59, 56, 67, 90, 108, Ascii.NAK, 54, 92, 90, -19, 4, Ascii.SYN, -65, -10, 0, Ascii.NAK, 4, -4, Ascii.GS, Ascii.ETB, 33, 19, -23, 6, -2, 3, -1, Ascii.CR, 46, 79, 68, 81, 64, 57, 94, 82, 79, 92, 63, 94, 91, 90, 80, 41, 72, 69, 76, 68, -7, 41, 78, 71, 68, -10, Ascii.NAK, Ascii.SYN, 48, 79, 80, Ascii.CR, 38, 79, 76, 75, 42, 73, 74, 9, 32, 79, 72, 69, Ascii.ETB, 54, 57, 53, -25, Ascii.SO, 57, 54, 54, 61, 44, -35, -4, 4, -14, -1, -83, -49, -18, -7, -7, -18, -15, 6, 40, Ascii.ETB, 36, 33, 41, -15, 19, 10, Ascii.SO, Ascii.SYN, Ascii.DC4, -53, -19, -22, -30, -19, -32, -18, -18, -28, -15, -32, -101, -51, -22, -34, -26, -6, Ascii.GS, 35, Ascii.CR, Ascii.DC2, Ascii.VT, Ascii.SO, Ascii.SI, Ascii.SYN, 19, Ascii.CR, -5, Ascii.RS, 36, Ascii.SO, 19, Ascii.DLE, Ascii.SI, Ascii.DLE, Ascii.ETB, Ascii.DC4, Ascii.SO, -53, -3, Ascii.SUB, Ascii.SO, Ascii.SYN, 67, 104, 97, 94, -53, -16, -23, -26, -101, -51, -22, -34, -26, Ascii.ETB, -21, 7, 54, 69, 84, 1, Ascii.DLE, 37, Ascii.DC4, -41, -22, -20, -20, -26, -22, -23, -4, Ascii.VT, 9, 6, 36, 55, 72, 59, 72, 51, 62, 44, 66, 83, 78, 66, 71, 67, 61, -6, 45, 73, 79, 70, -8, Ascii.NAK, 9, 17, -15, Ascii.SO, 2, 10, -65, -59, -65, -15, Ascii.SO, Ascii.VT, Ascii.VT, 59, 73, 84, 91, 73, 40, 54, 66, 55, 54, 48, 62, 81, 70, 79, 66, Ascii.SYN, 43, 50, 58, 55, 56, 49, 40, 54, 52, 76, 66, -33, -9, -11, -4, -4, -15, -16, -84, 1, -6, -9, -6, -5, 3, -6, -84, -7, -15, 0, -19, -16, -19, 0, -19, -84, -15, -6, 0, -2, 5, -58, -84, -47, -22, -19, -11, -98, -56, -33, -21, 42, 67, 70, 78, -9, 41, 70, 58, 66, 62, 90, 89, 76, 95, 76, Ascii.ETB, 51, 57, 48, Ascii.FS, 56, 62, 55, 45, -23, Ascii.FF, 53, 50, 57, -19, 9, Ascii.SI, 8, -2, Ascii.SO, Ascii.FF, -5, -3, 5, 55, 83, 89, 88, 76, 73, 86, 82, 4, 54, 83, 71, 79, Ascii.VT, 40, Ascii.EM, Ascii.ESC, Ascii.GS, 48, 77, 66, 66, 64, 69, -26, 10, -4, 1, -6, -46, -8, -20, -17, -25, -18, -19, -24, -30, -97, -47, -18, -30, -22, 33, 71, 59, 62, 54, 61, 60, 71, 49, 87, 76, 82, 70, 78, 77, 78, -39, -58, -47, -57, 72, 54, 68, 65, -14, -31, -21, -18, -34, -51, -39, -41, 36, 19, Ascii.US, Ascii.RS, 74, 58, 72, 57, 38, Ascii.ESC, 38, 3, 58, 47, 58, Ascii.CAN, 48, 44, 33, Ascii.CR, 62, 58, 47, Ascii.FS, Ascii.FF, 8, 7, Ascii.VT, -32, -34, -49, -41, Ascii.DC2, 17, Ascii.CR, -16, Ascii.FS, Ascii.ESC, Ascii.ETB, 9, Ascii.RS, Ascii.GS, Ascii.EM, Ascii.CR, Ascii.ESC, Ascii.SUB, Ascii.SYN, Ascii.ETB, 64, 63, 59, 64, -28, -29, -29, -43, -17, -15, -18, -29, -22, -14, 75, 77, 74, 63, 70, 78, 74, 70, 73, 75, 55, 68, 81, 74, 82, Ascii.SYN, 39, 37, 42, 48, 49, 45, 62, 60, 65, 71, 72, 6, 34, 71, 61, 78, 76, 77, 75, 66, 58, 69, -3, Ascii.SO, Ascii.ESC, Ascii.ESC, Ascii.CAN, Ascii.ESC, -45, -25, -15, -32, -14, -25, -97, -52, -28, -13, -32, -21, 70, 97, 98, Ascii.DC2, 38, 34, -6, Ascii.CAN, 7, Ascii.SI, Ascii.DC2, Ascii.VT, Ascii.CAN, 77, 107, 90, 103, 92, 94, -27, 3, -6, -13, -14, -3, 5, 35, Ascii.SUB, 33, -34, -7, 32, 33, 0, -2, -9, -1, -25, 0, 4, -9, -11, 1, -7, 0, -5, Ascii.FF, -9, -10, -78, -11, 1, 8, -9, 4, -78, -13, 4, 6, -78, -8, -2, -13, -7, 5, -52, -78, 44, 69, 57, 55, 66, -17, -49, -32, -30, 71, 82, 72, 84, 94, 101, 75, 87, 85, -10, 2, 9, 5, 36, 49, 42, 45, 36, 33, 57, 35, 40, 50, 42, 68, 66, 75, Ascii.US, 38, 42, Ascii.GS, -9, 2, 0, 75, 79, 67, 73, 71, 17, 76, 82, 71, 73, 45, 49, 37, 43, 41, -13, 52, 50, 43, 6, 19, Ascii.FF, -23, -36, -24, Ascii.EM, Ascii.DLE, 10, Ascii.EM, 10, Ascii.FF, 6, -1, -18, -22, -36, -36, 75, 71, 57, 68, 69, 65, 51, 68, 38, 34, Ascii.SYN, 34, -4, -8, -9, -10, 67, 63, 67, 62, 105, 98, 101, 100, -2, -7, -7, 62, 60, 53, 104, 102, 95, 98, 98, 100, 97, 86, 37, Ascii.RS, Ascii.DC4, 60, 55, 57};
    }

    static {
        A0A();
        A0A = IF.A08(A09(1691, 3, 1));
        A0B = IF.A08(A09(1733, 3, 80));
        A04 = IF.A08(A09(1638, 3, 119));
        A0C = IF.A08(A09(1652, 3, 70));
        A03 = IF.A08(A09(14, 3, 112));
        A07 = IF.A08(A09(1730, 3, 16));
        A02 = IF.A08(A09(1635, 3, 108));
        A05 = IF.A08(A09(1641, 3, 110));
        A06 = IF.A08(A09(1747, 3, 75));
        A09 = IF.A08(A09(1688, 3, 32));
        A08 = IF.A08(A09(1659, 3, 99));
        A0F = IF.A08(A09(1644, 4, 25));
        A0I = IF.A08(A09(1662, 4, 62));
        A0J = IF.A08(A09(1666, 3, 22));
        A0G = IF.A08(A09(1655, 4, 69));
        A0S = IF.A08(A09(1736, 4, 122));
        A0R = IF.A08(A09(1726, 4, 123));
        A0E = IF.A08(A09(1648, 4, 71));
        A0D = IF.A08(A09(1631, 4, 20));
        A0Q = IF.A08(A09(1718, 4, 15));
        A0M = IF.A08(A09(1706, 4, 94));
        A0O = IF.A08(A09(1710, 4, 88));
        A0N = IF.A08(A09(1702, 4, 1));
        A0P = IF.A08(A09(1714, 4, 57));
        A0L = IF.A08(A09(1698, 4, 30));
        A0H = IF.A08(A09(1694, 4, 47));
        A0U = IF.A08(A09(1722, 4, 86));
        A0T = IF.A08(A09(1740, 4, 116));
        A0K = IF.A08(A09(0, 4, 81));
        A0V = new String[]{A09(137, 5, 115), A09(246, 12, 32), A09(309, 7, 25), A09(329, 5, 12), A09(363, 5, 74), A09(744, 4, 118), A09(791, 6, 116), A09(825, 7, 11), A09(930, 4, 108), A09(993, 5, 60), A09(1042, 7, 123), A09(1062, 6, 32), A09(1073, 5, 112), A09(1093, 3, 44), A09(1203, 3, 75), A09(1206, 3, 106), A09(1213, 6, 11), A09(1244, 4, 44), A09(1518, 6, 72), A09(875, 10, 83), A09(57, 11, 113), A09(1284, 3, 103), A09(352, 11, 104), A09(1135, 6, 60), A09(1356, 10, 32), A09(437, 11, 119), A09(68, 7, 11), A09(1584, 8, 55), A09(1626, 5, 92), A09(934, 9, 120), A09(748, 6, 89), A09(1572, 6, 127), A09(258, 9, 20), A09(885, 12, 1), A09(17, 4, 57), A09(832, 5, 93), A09(754, 4, 50), A09(1346, 10, 79), A09(768, 6, 0), A09(1057, 5, 52), A09(47, 10, 62), A09(96, 4, 105), A09(1342, 4, 74), A09(1190, 4, 121), A09(1379, 5, 62), A09(963, 10, 114), A09(897, 16, 68), A09(913, 17, 89), A09(421, 6, 25), A09(774, 6, 86), A09(344, 8, 90), A09(1524, 17, 95), A09(TTAdConstant.IMAGE_CODE, 10, 6), A09(1096, 8, 102), A09(448, 9, 61), A09(368, 5, 67), A09(1366, 13, 106), A09(281, 6, 107), A09(325, 4, 107), A09(758, 7, 38), A09(1559, 6, 120), A09(219, 13, 67), A09(1104, 8, 96), A09(947, 6, 14), A09(1018, 15, 45), A09(159, 7, 37), A09(1049, 8, 37), A09(1163, 11, 48), A09(1209, 4, 53), A09(1275, 9, 73), A09(1565, 7, 44), A09(958, 5, 36), A09(1578, 6, 23), A09(30, 9, 107), A09(21, 9, 53), A09(1078, 5, 117), A09(1219, 5, 29), A09(998, 7, 18), A09(1248, 11, 37), A09(797, 9, 88), A09(714, 4, 125), A09(718, 9, 117), A09(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 13, 114), A09(1390, 5, 25), A09(703, 11, 106), A09(104, 5, 5), A09(953, 5, 68), A09(1224, 7, 88), A09(166, 6, 75), A09(128, 9, 99), A09(80, 10, 98), A09(780, 11, 73), A09(1147, 16, 1), A09(1174, 16, 49), A09(1395, 14, 5), A09(1327, 9, 93), A09(109, 8, 39), A09(PsExtractor.AUDIO_STREAM, 6, 48), A09(397, 14, 37), A09(39, 8, 71), A09(837, 6, 97), A09(1384, 6, 99), A09(185, 7, 83), A09(1068, 5, 101), A09(172, 13, 97), A09(1336, 6, 113), A09(1409, 8, 84), A09(142, 10, 62), A09(1141, 6, 39), A09(1112, 11, 77), A09(1269, 6, 99), A09(1319, 8, 4), A09(267, 4, 70), A09(1513, 5, 105), A09(1264, 5, 91), A09(727, 8, 26), A09(90, 6, 105), A09(1123, 12, 19), A09(1231, 13, 96), A09(735, 9, 70), A09(393, 4, 95), A09(1194, 9, 1), A09(384, 9, 87), A09(5, 9, 93), A09(427, 10, 127), A09(334, 10, 64), A09(765, 3, 69), A09(373, 11, 14), A09(271, 10, 46), A09(806, 8, 44), A09(1541, 6, 47), A09(870, 5, 98), A09(152, 7, 61), A09(1033, 9, 83), A09(1083, 10, 95), A09(100, 4, 89), A09(198, 21, 8), A09(814, 11, 38), A09(117, 11, 4), A09(316, 9, 14), A09(287, 22, 35), A09(232, 14, 26), A09(973, 8, 62), A09(1259, 5, 110), A09(1547, 12, 5), A09(75, 5, 21), A09(943, 4, 96), A09(1417, 8, 100)};
    }

    public static int A00(C1217Hz c1217Hz) {
        c1217Hz.A0Z(4);
        int A082 = c1217Hz.A08();
        int atomType = CJ.A0G;
        if (A082 == atomType) {
            c1217Hz.A0Z(8);
            int A0E2 = c1217Hz.A0E();
            String[] strArr = A01;
            String str = strArr[1];
            String str2 = strArr[3];
            int charAt = str.charAt(14);
            int atomType2 = str2.charAt(14);
            if (charAt == atomType2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "GjVXpovJSyy6mQWDRr4cQgwB00EJH49E";
            strArr2[5] = "xcPAZNa3uOjbgwQtoRI2m5rOjGrE9lkV";
            return A0E2;
        }
        Log.w(A09(981, 12, 36), A09(633, 37, 75));
        return -1;
    }

    public static ApicFrame A01(C1217Hz c1217Hz) {
        String A092;
        int A082 = c1217Hz.A08();
        int A083 = c1217Hz.A08();
        int i9 = CJ.A0G;
        String A093 = A09(981, 12, 36);
        if (A083 == i9) {
            int atomSize = c1217Hz.A08();
            int A002 = CJ.A00(atomSize);
            if (A002 == 13) {
                A092 = A09(1669, 10, 104);
            } else {
                A092 = A002 == 14 ? A09(1679, 9, 74) : null;
            }
            if (A092 == null) {
                Log.w(A093, A09(1596, 30, 24) + A002);
                return null;
            }
            c1217Hz.A0Z(4);
            int atomSize2 = A082 - 16;
            byte[] bArr = new byte[atomSize2];
            int atomSize3 = bArr.length;
            c1217Hz.A0c(bArr, 0, atomSize3);
            return new ApicFrame(A092, null, 3, bArr);
        }
        Log.w(A093, A09(492, 35, 12));
        return null;
    }

    public static CommentFrame A02(int i9, C1217Hz c1217Hz) {
        int A082 = c1217Hz.A08();
        int atomType = c1217Hz.A08();
        int atomSize = CJ.A0G;
        if (atomType == atomSize) {
            c1217Hz.A0Z(8);
            int atomSize2 = A082 - 16;
            String A0R2 = c1217Hz.A0R(atomSize2);
            return new CommentFrame(A09(1744, 3, 54), A0R2, A0R2);
        }
        Log.w(A09(981, 12, 36), A09(457, 35, 52) + CJ.A02(i9));
        return null;
    }

    public static Id3Frame A03(int i9, String str, C1217Hz c1217Hz, boolean z8, boolean z9) {
        int A002 = A00(c1217Hz);
        if (z9) {
            A002 = Math.min(1, A002);
        }
        if (A002 >= 0) {
            if (z8) {
                return new TextInformationFrame(str, null, Integer.toString(A002));
            }
            return new CommentFrame(A09(1744, 3, 54), str, Integer.toString(A002));
        }
        Log.w(A09(981, 12, 36), A09(670, 33, 101) + CJ.A02(i9));
        return null;
    }

    public static Id3Frame A04(C1217Hz c1217Hz) {
        int position = c1217Hz.A06();
        int shortType = c1217Hz.A08() + position;
        int typeTopByte = c1217Hz.A08();
        int position2 = typeTopByte >> 24;
        int endPosition = position2 & 255;
        try {
            if (endPosition == 169 || endPosition == 65533) {
                String[] strArr = A01;
                String str = strArr[1];
                String str2 = strArr[3];
                int endPosition2 = str.charAt(14);
                int position3 = str2.charAt(14);
                if (endPosition2 != position3) {
                    String[] strArr2 = A01;
                    strArr2[1] = "0Jyi9tVMYRUB8DC8X4wv3fSfrFwccLMg";
                    strArr2[3] = "7RyBhF3RQA4yCgdCg64je2YOBeUHio43";
                    int i9 = 16777215 & typeTopByte;
                    int position4 = A04;
                    if (i9 == position4) {
                        return A02(typeTopByte, c1217Hz);
                    }
                    int position5 = A0A;
                    if (i9 != position5) {
                        int position6 = A0B;
                        if (i9 != position6) {
                            int position7 = A05;
                            if (i9 != position7) {
                                int position8 = A06;
                                if (i9 != position8) {
                                    int position9 = A0C;
                                    if (i9 == position9) {
                                        return A07(typeTopByte, A09(1445, 4, 124), c1217Hz);
                                    }
                                    int position10 = A03;
                                    if (i9 == position10) {
                                        return A07(typeTopByte, A09(1457, 4, 98), c1217Hz);
                                    }
                                    int position11 = A07;
                                    if (i9 == position11) {
                                        return A07(typeTopByte, A09(1493, 4, 22), c1217Hz);
                                    }
                                    int position12 = A02;
                                    if (i9 == position12) {
                                        return A07(typeTopByte, A09(1425, 4, 11), c1217Hz);
                                    }
                                    int position13 = A09;
                                    if (i9 == position13) {
                                        return A07(typeTopByte, A09(1592, 4, 49), c1217Hz);
                                    }
                                    int position14 = A08;
                                    if (i9 == position14) {
                                        return A07(typeTopByte, A09(1441, 4, 86), c1217Hz);
                                    }
                                    int position15 = A0J;
                                    if (i9 == position15) {
                                        return A07(typeTopByte, A09(1449, 4, 88), c1217Hz);
                                    }
                                    String str3 = A09(1287, 32, 18) + CJ.A02(typeTopByte);
                                    c1217Hz.A0Y(shortType);
                                    return null;
                                }
                            }
                            return A07(typeTopByte, A09(1437, 4, 16), c1217Hz);
                        }
                    }
                    return A07(typeTopByte, A09(1453, 4, 108), c1217Hz);
                }
                throw new RuntimeException();
            }
            int position16 = A0I;
            if (typeTopByte == position16) {
                return A08(c1217Hz);
            }
            int position17 = A0G;
            if (typeTopByte == position17) {
                return A06(typeTopByte, A09(1465, 4, 62), c1217Hz);
            }
            int position18 = A0S;
            if (typeTopByte == position18) {
                return A06(typeTopByte, A09(1469, 4, 18), c1217Hz);
            }
            int position19 = A0R;
            if (typeTopByte == position19) {
                return A03(typeTopByte, A09(1429, 4, 122), c1217Hz, true, false);
            }
            int position20 = A0E;
            if (typeTopByte == position20) {
                return A03(typeTopByte, A09(1433, 4, 36), c1217Hz, true, true);
            }
            int position21 = A0F;
            if (typeTopByte == position21) {
                return A01(c1217Hz);
            }
            int position22 = A0D;
            if (typeTopByte == position22) {
                TextInformationFrame A072 = A07(typeTopByte, A09(1461, 4, 112), c1217Hz);
                c1217Hz.A0Y(shortType);
                String[] strArr3 = A01;
                String str4 = strArr3[0];
                String str5 = strArr3[5];
                int endPosition3 = str4.charAt(26);
                int position23 = str5.charAt(26);
                if (endPosition3 == position23) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A01;
                strArr4[1] = "OVK1B3dlF910aHYiPpOkgB5DTZtMQISo";
                strArr4[3] = "nkBDkDxEM9IsSIr4gzMrbu1TfR8i86sW";
                return A072;
            }
            int position24 = A0Q;
            if (typeTopByte == position24) {
                return A07(typeTopByte, A09(1489, 4, 114), c1217Hz);
            }
            int position25 = A0M;
            if (typeTopByte == position25) {
                return A07(typeTopByte, A09(1473, 4, 68), c1217Hz);
            }
            int position26 = A0O;
            if (typeTopByte == position26) {
                TextInformationFrame A073 = A07(typeTopByte, A09(1477, 4, 78), c1217Hz);
                c1217Hz.A0Y(shortType);
                String[] strArr5 = A01;
                String str6 = strArr5[2];
                String str7 = strArr5[4];
                int endPosition4 = str6.length();
                int position27 = str7.length();
                if (endPosition4 != position27) {
                    throw new RuntimeException();
                }
                A01[6] = "UqY7mn2iLR";
                return A073;
            }
            int position28 = A0N;
            if (typeTopByte == position28) {
                return A07(typeTopByte, A09(1485, 4, 77), c1217Hz);
            }
            int position29 = A0P;
            if (typeTopByte == position29) {
                return A07(typeTopByte, A09(1481, 4, 80), c1217Hz);
            }
            int position30 = A0L;
            if (typeTopByte == position30) {
                Id3Frame A032 = A03(typeTopByte, A09(843, 14, 105), c1217Hz, false, false);
                c1217Hz.A0Y(shortType);
                String[] strArr6 = A01;
                String str8 = strArr6[2];
                String str9 = strArr6[4];
                int endPosition5 = str8.length();
                int position31 = str9.length();
                if (endPosition5 == position31) {
                    String[] strArr7 = A01;
                    strArr7[2] = "y76DD";
                    strArr7[4] = "Unrxk";
                    return A032;
                }
            } else {
                int position32 = A0H;
                if (typeTopByte == position32) {
                    return A03(typeTopByte, A09(857, 13, 31), c1217Hz, false, true);
                }
                int position33 = A0U;
                if (typeTopByte == position33) {
                    return A07(typeTopByte, A09(1503, 10, 125), c1217Hz);
                }
                int position34 = A0T;
                if (typeTopByte == position34) {
                    return A07(typeTopByte, A09(1497, 6, 33), c1217Hz);
                }
                int position35 = A0K;
                if (typeTopByte == position35) {
                    InternalFrame A052 = A05(c1217Hz, shortType);
                    c1217Hz.A0Y(shortType);
                    String[] strArr8 = A01;
                    String str10 = strArr8[1];
                    String str11 = strArr8[3];
                    int endPosition6 = str10.charAt(14);
                    int position36 = str11.charAt(14);
                    if (endPosition6 != position36) {
                        String[] strArr9 = A01;
                        strArr9[0] = "1HtNaPgohC56jURMUub0F5pcvMYgvFOy";
                        strArr9[5] = "G5OZMgjEFg8Vdhm6tKGChVRGSCXk8iwu";
                        return A052;
                    }
                }
                String str32 = A09(1287, 32, 18) + CJ.A02(typeTopByte);
                c1217Hz.A0Y(shortType);
                return null;
            }
            throw new RuntimeException();
        } finally {
            c1217Hz.A0Y(shortType);
        }
    }

    public static InternalFrame A05(C1217Hz c1217Hz, int i9) {
        String value = null;
        String str = null;
        int atomSize = -1;
        int i10 = -1;
        while (c1217Hz.A06() < i9) {
            int dataAtomPosition = c1217Hz.A06();
            int atomType = c1217Hz.A08();
            int A082 = c1217Hz.A08();
            c1217Hz.A0Z(4);
            if (A082 == CJ.A0f) {
                value = c1217Hz.A0R(atomType - 12);
            } else if (A082 == CJ.A0p) {
                str = c1217Hz.A0R(atomType - 12);
            } else {
                if (A082 == CJ.A0G) {
                    atomSize = dataAtomPosition;
                    String[] strArr = A01;
                    String name = strArr[2];
                    String domain = strArr[4];
                    if (name.length() != domain.length()) {
                        throw new RuntimeException();
                    }
                    A01[6] = "d4iKlZM21A";
                    i10 = atomType;
                }
                c1217Hz.A0Z(atomType - 12);
            }
        }
        if (value == null || str == null || atomSize == -1) {
            return null;
        }
        c1217Hz.A0Y(atomSize);
        c1217Hz.A0Z(16);
        String name2 = c1217Hz.A0R(i10 - 16);
        return new InternalFrame(value, str, name2);
    }

    public static TextInformationFrame A06(int i9, String str, C1217Hz c1217Hz) {
        int A082 = c1217Hz.A08();
        int atomType = c1217Hz.A08();
        int atomSize = CJ.A0G;
        if (atomType == atomSize && A082 >= 22) {
            c1217Hz.A0Z(10);
            int A0I2 = c1217Hz.A0I();
            if (A0I2 > 0) {
                String str2 = A09(0, 0, 7) + A0I2;
                int count = c1217Hz.A0I();
                if (count > 0) {
                    str2 = str2 + A09(4, 1, 12) + count;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        Log.w(A09(981, 12, 36), A09(527, 39, 43) + CJ.A02(i9));
        return null;
    }

    public static TextInformationFrame A07(int i9, String str, C1217Hz c1217Hz) {
        int A082 = c1217Hz.A08();
        int atomType = c1217Hz.A08();
        int atomSize = CJ.A0G;
        if (atomType == atomSize) {
            c1217Hz.A0Z(8);
            int atomSize2 = A082 - 16;
            return new TextInformationFrame(str, null, c1217Hz.A0R(atomSize2));
        }
        Log.w(A09(981, 12, 36), A09(601, 32, 23) + CJ.A02(i9));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame A08(com.meta.analytics.dsp.uinode.C1217Hz r5) {
        /*
            int r5 = A00(r5)
            r3 = 0
            if (r5 <= 0) goto L3c
            java.lang.String[] r4 = com.meta.analytics.dsp.uinode.CW.A0V
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.CW.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.CW.A01
            java.lang.String r1 = "THrXwLKnbb"
            r0 = 6
            r2[r0] = r1
            int r0 = r4.length
            if (r5 > r0) goto L3c
            int r0 = r5 + (-1)
            r4 = r4[r0]
        L2b:
            if (r4 == 0) goto L3e
            r2 = 1441(0x5a1, float:2.019E-42)
            r1 = 4
            r0 = 86
            java.lang.String r1 = A09(r2, r1, r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame r0 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame
            r0.<init>(r1, r3, r4)
            return r0
        L3c:
            r4 = r3
            goto L2b
        L3e:
            r2 = 981(0x3d5, float:1.375E-42)
            r1 = 12
            r0 = 36
            java.lang.String r4 = A09(r2, r1, r0)
            r2 = 566(0x236, float:7.93E-43)
            r1 = 35
            r0 = 61
            java.lang.String r0 = A09(r2, r1, r0)
            android.util.Log.w(r4, r0)
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.CW.A01
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L6d
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6d:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.CW.A01
            java.lang.String r1 = "0SqeA"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "mLxDv"
            r0 = 4
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.CW.A08(com.facebook.ads.redexgen.X.Hz):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame");
    }
}
