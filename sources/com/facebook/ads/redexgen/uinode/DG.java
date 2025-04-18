package com.facebook.ads.redexgen.uinode;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class DG {
    public static byte[] A07;
    public static String[] A08 = {"l47F2JAJicAi7iJT7Ur8ZlCw", "pcnHbOoGzPExKCHxm2AK1l1xVYlhX3pn", "L7qDH0sZJIKjQPetVGF", "mKMCCcAhi76NHeIY7m5kov", "q39HFngYrns05eD5pjaqNYndLlzCP1N1", "S0mWvWCgmnvtEg9hs9CnV7qg", "HTiL2pHQ4MkdfTxzAGhBA6OvrbDKlrFs", "nbOKc9xHpWJnEmTOZOJWDKzO97xo4CwF"};
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-54, Ascii.RS, Ascii.EM, -54, Ascii.GS, 17, -39, -51, 8, 52, 102, 102, 104, 96, 88, 87, 64, 84, 107, 54, 91, 84, 97, 97, 88, 95, 52, 87, 93, 104, 102, 103, 96, 88, 97, 103, 45, 19, 56, 106, 106, 108, 100, 92, 91, 74, 108, 103, 103, 102, 105, 107, Ascii.ETB, 82, 53, 77, 76, 81, 73, 43, 87, 76, 77, 75, 49, 86, 78, 87, 4, 37, 9, 43, 38, 38, 37, 40, 42, -42, 17, 77, 58, -3, 56, 36, 39, 36, 51, 55, 44, 57, 40, -16, 51, 47, 36, 60, 37, 36, 38, 46, Ascii.FS, 39, 36, 34, 41, -23, Ascii.RS, Ascii.FS, 43, 46, -31, -20, -23, -25, -18, -82, -10, -61, -31, -16, -13, 58, 78, Base64.padSymbol, 66, 72, 8, Ascii.FF, 64, 73, 73, 6, Ascii.SUB, 9, Ascii.SO, Ascii.DC4, -44, 6, 8, -40, 59, 79, 62, 67, 73, 9, 59, 71, 76, 7, 81, 60, Ascii.DC4, 40, Ascii.ETB, Ascii.FS, 34, -30, Ascii.CAN, Ascii.DC4, Ascii.SYN, -26, 68, 88, 71, 76, 82, Ascii.DC2, 73, 79, 68, 70, Ascii.CAN, 44, Ascii.ESC, 32, 38, -26, Ascii.RS, -18, -24, -24, -28, Ascii.CAN, 35, Ascii.CAN, 46, -25, -5, -22, -17, -11, -75, -19, -67, -73, -73, -77, -13, -14, -25, -3, 36, 56, 39, 44, 50, -14, 42, 54, 48, -3, 17, 0, 5, Ascii.VT, -53, 9, Ascii.FF, -48, -3, -55, 8, -3, Ascii.DLE, 9, 7, Ascii.ESC, 10, Ascii.SI, Ascii.NAK, -43, 19, Ascii.SYN, Ascii.VT, Ascii.CR, 54, 74, 57, 62, 68, 4, 68, 69, 74, 72, 63, 83, 66, 71, 77, Ascii.CR, 80, 63, 85, 39, 59, 42, 47, 53, -11, 60, 53, 56, 40, 47, 57, Ascii.SO, 19, Ascii.FF, Ascii.EM, Ascii.EM, Ascii.DLE, Ascii.ETB, -18, Ascii.SUB, 32, Ascii.EM, Ascii.US, -39, Ascii.FF, -18, Ascii.FF, Ascii.ESC, Ascii.RS, 5, 10, 3, Ascii.DLE, Ascii.DLE, 7, Ascii.SO, -27, 17, Ascii.ETB, Ascii.DLE, Ascii.SYN, -48, 5, 3, Ascii.DC2, Ascii.NAK, 44, 49, 42, 55, 55, 46, 53, Ascii.FF, 56, 62, 55, Base64.padSymbol, -9, 60, 62, 57, 57, 56, 59, Base64.padSymbol, -11, -23, -17, -5, -16, -15, -17, -70, -7, -11, -7, -15, -84, 87, 99, 88, 89, 87, 34, 100, 102, 99, 90, 93, 96, 89, 64, 89, 106, 89, 96, 32, Ascii.DC4, Ascii.DLE, -2, 10, Ascii.CR, 9, 2, -17, -2, 17, 2, -53, -2, -32, -2, Ascii.CR, Ascii.DLE, 87, 69, 81, 84, 80, 73, 54, 69, 88, 73, Ascii.DC2, 71, 69, 84, 87, 46, Ascii.FS, 40, 43, 39, 32, Ascii.CR, Ascii.FS, 47, 32, -23, 46, 48, 43, 43, 42, 45, 47, -25, -37, Ascii.DC4, 6, 4, Ascii.SYN, 19, 6, -50, 17, Ascii.CR, 2, Ascii.SUB, 3, 2, 4, Ascii.FF, 81, 71, 88, 67, Ascii.US, 76, 66, 48, 63, 82, 67, Ascii.FF, 65, 63, 78, 81, 9, -1, Ascii.DLE, -5, -41, 4, -6, -24, -9, 10, -5, -60, 8, 5, 10, -9, 10, -5, -6, -62, -74, 80, 70, 87, 66, Ascii.RS, 75, 65, 47, 62, 81, 66, Ascii.VT, 80, 82, 77, 77, 76, 79, 81, 9, -3, 40, Ascii.RS, 47, Ascii.SUB, -10, 35, Ascii.EM, 7, Ascii.SYN, 41, Ascii.SUB, -29, 43, -8, Ascii.SYN, 37, 40, Ascii.RS, Ascii.US, Ascii.CAN, Ascii.CAN, Ascii.SI, Ascii.SYN, Ascii.SI, Ascii.SO, -41, Ascii.SUB, Ascii.SYN, Ascii.VT, 35, Ascii.FF, Ascii.VT, Ascii.CR, Ascii.NAK, 58};
    }

    static {
        A04();
    }

    public DG(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.A02 = (String) AbstractC0626Ha.A01(str);
        this.A01 = str2;
        this.A00 = codecCapabilities;
        this.A04 = z10;
        boolean z13 = true;
        this.A03 = (z11 || codecCapabilities == null || !A07(codecCapabilities)) ? false : true;
        this.A06 = codecCapabilities != null && A0B(codecCapabilities);
        if (!z12 && (codecCapabilities == null || !A09(codecCapabilities))) {
            z13 = false;
        }
        this.A05 = z13;
    }

    public static int A00(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || (IF.A02 >= 26 && i10 > 0)) {
            return i10;
        }
        if (A03(226, 10, 45).equals(str2) || A03(121, 10, 96).equals(str2) || A03(140, 12, 97).equals(str2) || A03(211, 15, 35).equals(str2) || A03(255, 12, 77).equals(str2) || A03(236, 10, 92).equals(str2) || A03(246, 9, 101).equals(str2) || A03(162, 10, 106).equals(str2) || A03(172, 15, 62).equals(str2) || A03(187, 15, 13).equals(str2) || A03(202, 9, 74).equals(str2)) {
            return i10;
        }
        if (A03(131, 9, 44).equals(str2)) {
            i11 = 6;
        } else {
            String A03 = A03(152, 10, 58);
            if (A08[4].charAt(25) == 'Z') {
                throw new RuntimeException();
            }
            A08[4] = "P3Nhh7RBH5ErFPjvJQxGDiPekJNUcZJn";
            if (A03.equals(str2)) {
                i11 = 16;
            } else {
                i11 = 30;
            }
        }
        Log.w(A03(54, 14, 111), A03(9, 29, 122) + str + A03(6, 3, 52) + i10 + A03(0, 4, 49) + i11 + A03(79, 1, 119));
        return i11;
    }

    public static DG A01(String str) {
        return new DG(str, null, null, true, false, false);
    }

    public static DG A02(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        return new DG(str, str2, codecCapabilities, false, z10, z11);
    }

    private void A05(String str) {
        StringBuilder append = new StringBuilder().append(A03(38, 16, 126)).append(str);
        String A03 = A03(80, 3, 100);
        append.append(A03).append(this.A02).append(A03(4, 2, 120)).append(this.A01).append(A03).append(IF.A04).append(A03(79, 1, 119)).toString();
    }

    private void A06(String str) {
        StringBuilder append = new StringBuilder().append(A03(68, 11, 61)).append(str);
        String A03 = A03(80, 3, 100);
        append.append(A03).append(this.A02).append(A03(4, 2, 120)).append(this.A01).append(A03).append(IF.A04).append(A03(79, 1, 119)).toString();
    }

    public static boolean A07(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return IF.A02 >= 19 && A08(codecCapabilities);
    }

    public static boolean A08(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(83, 17, 74));
    }

    public static boolean A09(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return IF.A02 >= 21 && A0A(codecCapabilities);
    }

    public static boolean A0A(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(406, 15, 40));
    }

    public static boolean A0B(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return IF.A02 >= 21 && A0C(codecCapabilities);
    }

    public static boolean A0C(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A03(496, 17, 49));
    }

    public static boolean A0D(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (d10 == -1.0d || d10 <= 0.0d) {
            return videoCapabilities.isSizeSupported(i10, i11);
        }
        return videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
    }

    public final Point A0E(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A06(A03(100, 10, 66));
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(110, 11, 7));
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int heightAlignment2 = IF.A04(i10, widthAlignment);
        return new Point(heightAlignment2 * widthAlignment, IF.A04(i11, heightAlignment) * heightAlignment);
    }

    public final boolean A0F(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A06(A03(285, 17, 41));
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(267, 18, 50));
            return false;
        }
        if (A00(this.A02, this.A01, audioCapabilities.getMaxInputChannelCount()) < i10) {
            A06(A03(302, 22, 80) + i10);
            return false;
        }
        return true;
    }

    public final boolean A0G(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            String A03 = A03(371, 15, 107);
            String[] strArr = A08;
            if (strArr[7].charAt(27) == strArr[1].charAt(27)) {
                throw new RuntimeException();
            }
            A08[4] = "1TDMmIQfG5hcmUgl4hLs4ptEQsykv9BZ";
            A06(A03);
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            A06(A03(355, 16, 36));
            return false;
        }
        if (!audioCapabilities.isSampleRateSupported(i10)) {
            A06(A03(386, 20, 66) + i10);
            return false;
        }
        return true;
    }

    public final boolean A0H(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A06(A03(421, 16, 101));
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            A06(A03(479, 17, 60));
            return false;
        }
        if (!A0D(videoCapabilities, i10, i11, d10)) {
            String A03 = A03(513, 1, 73);
            if (i10 >= i11 || !A0D(videoCapabilities, i11, i10, d10)) {
                A06(A03(458, 21, 100) + i10 + A03 + i11 + A03 + d10);
                return false;
            }
            A05(A03(437, 21, 29) + i10 + A03 + i11 + A03 + d10);
            return true;
        }
        return true;
    }

    public final boolean A0I(String str) {
        if (str == null || this.A01 == null) {
            return true;
        }
        String A05 = AbstractC0644Hs.A05(str);
        if (A08[4].charAt(25) != 'Z') {
            String[] strArr = A08;
            strArr[7] = "DCoMJKO3SQRZ9AZ8Punft1OMrNVoZ9FQ";
            strArr[1] = "kGwQMpRYxL2xz4mLYOs80Kob4iU3fTuT";
            if (A05 == null) {
                return true;
            }
            boolean equals = this.A01.equals(A05);
            String A03 = A03(4, 2, 120);
            String codecMimeType = A08[6];
            if (codecMimeType.charAt(14) != 'p') {
                A08[6] = "vbTHdtkviQLZpSNmsPVzchXkRABJSF9Q";
                if (!equals) {
                    A06(A03(324, 11, 19) + str + A03 + A05);
                    return false;
                }
                Pair<Integer, Integer> A02 = DR.A02(str);
                if (A02 == null) {
                    return true;
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : A0J()) {
                    if (codecProfileLevel.profile == ((Integer) A02.first).intValue() && codecProfileLevel.level >= ((Integer) A02.second).intValue()) {
                        return true;
                    }
                }
                A06(A03(335, 20, 123) + str + A03 + A05);
                return false;
            }
        }
        throw new RuntimeException();
    }

    public final MediaCodecInfo.CodecProfileLevel[] A0J() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null || codecCapabilities.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.A00.profileLevels;
    }
}
