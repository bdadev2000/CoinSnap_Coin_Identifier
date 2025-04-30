package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1099Cv {
    public static byte[] A00;
    public static String[] A01 = {"7VlHbmI4sHauhoCWaFlUZM9mZRV70mzp", "LqGkn09UNvdqUAgssIpSCyoRJ1iI6QKK", "ZmFU8Mfu7g0bs6JKYNiQ5l9NQyV6", "IM1BduvbFOrOx4pkelis2wS2axXVXfJJ", "7P5Q", "68Q2Pgf", "FTYWHoYlDOl1N68V4e618z2hAoSaWMYg", "QxGNaBvq4MkZwy6AnQRq9NbnhINTK41p"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C1098Cu A04(C1217Hz c1217Hz) throws C10259v {
        A0A(1, c1217Hz, false);
        long A0K = c1217Hz.A0K();
        int A0E = c1217Hz.A0E();
        long A0K2 = c1217Hz.A0K();
        int A0A = c1217Hz.A0A();
        int A0A2 = c1217Hz.A0A();
        int A0A3 = c1217Hz.A0A();
        int A0E2 = c1217Hz.A0E();
        return new C1098Cu(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (c1217Hz.A0E() & 1) > 0, Arrays.copyOf(c1217Hz.A00, c1217Hz.A07()));
    }

    public static String A05(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{116, 77, 80, 64, 75, 81, 119, 86, 75, 78, Ascii.FS, 1, 9, Ascii.FS, Ascii.SUB, Ascii.CR, Ascii.FS, Ascii.GS, 89, Ascii.SUB, 17, Ascii.CAN, Ascii.VT, Ascii.CAN, Ascii.SUB, Ascii.CR, Ascii.FS, Ascii.VT, 10, 89, 94, Ascii.SI, Ascii.SYN, Ascii.VT, Ascii.ESC, Ascii.DLE, 10, 94, 87, 74, 66, 87, 81, 70, 87, 86, Ascii.DC2, 81, 93, 86, 87, Ascii.DC2, 80, 93, 93, 89, Ascii.DC2, 70, 93, Ascii.DC2, 65, 70, 83, 64, 70, Ascii.DC2, 69, 91, 70, 90, Ascii.DC2, 105, 2, 74, 7, 4, Ascii.RS, Ascii.DC2, 2, 74, 6, 1, Ascii.RS, Ascii.DC2, 2, 74, 6, 0, 111, Ascii.DC2, 83, 70, Ascii.DC2, 78, 83, 91, 78, 72, 95, 78, 79, Ascii.VT, 67, 78, 74, 79, 78, 89, Ascii.VT, 95, 82, 91, 78, Ascii.VT, 70, 76, 79, 79, 82, 0, 84, 89, 80, 69, 0, 71, 82, 69, 65, 84, 69, 82, 0, 84, 72, 65, 78, 0, 17, 0, 78, 79, 84, 0, 68, 69, 67, 79, 68, 65, 66, 76, 69, Ascii.SUB, 0, 49, 37, 54, 58, 62, 57, 48, 119, 53, 62, 35, 119, 54, 49, 35, 50, 37, 119, 58, 56, 51, 50, 36, 119, 57, 56, 35, 119, 36, 50, 35, 119, 54, 36, 119, 50, 47, 39, 50, 52, 35, 50, 51, 48, 36, 55, 59, 63, 56, 49, 118, 52, 63, 34, 118, 51, 46, 38, 51, 53, 34, 51, 50, 118, 34, 57, 118, 52, 51, 118, 37, 51, 34, Ascii.DLE, 19, 19, Ascii.ETB, 9, Ascii.FF, 92, 8, 5, Ascii.FF, Ascii.EM, 92, Ascii.ESC, Ascii.SO, Ascii.EM, Ascii.GS, 8, Ascii.EM, Ascii.SO, 92, 8, Ascii.DC4, Ascii.GS, Ascii.DC2, 92, 78, 92, Ascii.DC2, 19, 8, 92, Ascii.CAN, Ascii.EM, Ascii.US, 19, Ascii.CAN, Ascii.GS, Ascii.RS, Ascii.DLE, Ascii.EM, 70, 92, 104, 100, 117, 117, 108, 107, 98, 37, 113, 124, 117, 96, 37, 106, 113, 109, 96, 119, 37, 113, 109, 100, 107, 37, 53, 37, 107, 106, 113, 37, 118, 112, 117, 117, 106, 119, 113, 96, 97, 63, 37, 93, 65, 76, 78, 72, 69, 66, 65, 73, 72, 95, Ascii.CR, 66, 75, Ascii.CR, 89, 68, 64, 72, Ascii.CR, 73, 66, 64, 76, 68, 67, Ascii.CR, 89, 95, 76, 67, 94, 75, 66, 95, 64, 94, Ascii.CR, 67, 66, 89, Ascii.CR, 87, 72, 95, 66, 72, 73, Ascii.CR, 66, 88, 89, 114, 101, 115, 105, 100, 117, 101, 84, 121, 112, 101, 32, 103, 114, 101, 97, 116, 101, 114, 32, 116, 104, 97, 110, 32, 50, 32, 105, 115, 32, 110, 111, 116, 32, 100, 101, 99, 111, 100, 97, 98, 108, 101, 107, 112, 63, 109, 122, 108, 122, 109, 105, 122, 123, 63, 125, 118, 107, 108, 63, 114, 106, 108, 107, 63, 125, 122, 63, 101, 122, 109, 112, 63, 126, 121, 107, 122, 109, 63, 114, 126, 111, 111, 118, 113, 120, 63, 124, 112, 106, 111, 115, 118, 113, 120, 63, 108, 107, 122, 111, 108, 82, 73, 73, 6, 85, 78, 73, 84, 82, 6, 78, 67, 71, 66, 67, 84, Ascii.FS, 6};
        if (A01[2].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "mgdhOJqoKNbrHZTmAlzuBC741swozh2A";
        strArr[0] = "We2DdWBOrlseFOiGq0myNglhwb5nF2sN";
    }

    static {
        A06();
    }

    public static int A00(int i9) {
        int val = 0;
        while (i9 > 0) {
            val++;
            i9 >>>= 1;
        }
        return val;
    }

    public static long A01(long j7, long j9) {
        return (long) Math.floor(Math.pow(j7, 1.0d / j9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (r12 <= 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r12 == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if (r12 != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ea, code lost:
    
        return new com.meta.analytics.dsp.uinode.C1096Cr(r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        r14.A03(32);
        r14.A03(32);
        r4 = r14.A02(4) + 1;
        r14.A03(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (r12 != 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        if (r9 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        r0 = A01(r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        r0 = (int) (r4 * r0);
        r14.A03(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        r0 = r10 * r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0116, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A05(228, 42, 126) + r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f3, code lost:
    
        if (r12 <= 2) goto L36;
     */
    /* JADX WARN: Incorrect condition in loop: B:48:0x0083 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.meta.analytics.dsp.uinode.C1096Cr A02(com.meta.analytics.dsp.uinode.C1094Cp r14) throws com.meta.analytics.dsp.uinode.C10259v {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC1099Cv.A02(com.facebook.ads.redexgen.X.Cp):com.facebook.ads.redexgen.X.Cr");
    }

    public static C1097Cs A03(C1217Hz c1217Hz) throws C10259v {
        A0A(3, c1217Hz, false);
        int length = (int) c1217Hz.A0K();
        String A0S = c1217Hz.A0S(length);
        int length2 = A0S.length();
        int i9 = 7 + 4 + length2;
        long A0K = c1217Hz.A0K();
        int length3 = (int) A0K;
        String[] strArr = new String[length3];
        int i10 = i9 + 4;
        int i11 = 0;
        while (true) {
            long j7 = i11;
            String vendor = A01[3];
            if (vendor.charAt(18) != 'i') {
                throw new RuntimeException();
            }
            A01[5] = "ziwCMa4";
            if (j7 < A0K) {
                int len = (int) c1217Hz.A0K();
                strArr[i11] = c1217Hz.A0S(len);
                int length4 = strArr[i11].length();
                i10 = i10 + 4 + length4;
                i11++;
            } else {
                int length5 = c1217Hz.A0E();
                if ((length5 & 1) != 0) {
                    return new C1097Cs(A0S, strArr, i10 + 1);
                }
                String vendor2 = A05(198, 30, 84);
                throw new C10259v(vendor2);
            }
        }
    }

    public static void A07(int i9, C1094Cp c1094Cp) throws C10259v {
        int j7;
        int A02 = c1094Cp.A02(6) + 1;
        for (int i10 = 0; i10 < A02; i10++) {
            int A022 = c1094Cp.A02(16);
            switch (A022) {
                case 0:
                    if (c1094Cp.A04()) {
                        j7 = c1094Cp.A02(4) + 1;
                    } else {
                        j7 = 1;
                    }
                    if (c1094Cp.A04()) {
                        int i11 = c1094Cp.A02(8);
                        int i12 = i11 + 1;
                        for (int i13 = 0; i13 < i12; i13++) {
                            int mappingsCount = i9 - 1;
                            c1094Cp.A03(A00(mappingsCount));
                            int mappingsCount2 = i9 - 1;
                            c1094Cp.A03(A00(mappingsCount2));
                        }
                    }
                    int mappingsCount3 = c1094Cp.A02(2);
                    if (mappingsCount3 == 0) {
                        if (j7 > 1) {
                            for (int i14 = 0; i14 < i9; i14++) {
                                c1094Cp.A03(4);
                                String[] strArr = A01;
                                String str = strArr[6];
                                String str2 = strArr[0];
                                int charAt = str.charAt(31);
                                int mappingsCount4 = str2.charAt(31);
                                if (charAt == mappingsCount4) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A01;
                                strArr2[6] = "Wlyx46da0LhUJCMQF7d9pJYsMbXYpIdM";
                                strArr2[0] = "HglI0wxUFDuveiNJ2qiTiY5BYhneBiG1";
                            }
                        }
                        for (int mappingsCount5 = 0; mappingsCount5 < j7; mappingsCount5++) {
                            c1094Cp.A03(8);
                            c1094Cp.A03(8);
                            c1094Cp.A03(8);
                        }
                        break;
                    } else {
                        throw new C10259v(A05(406, 58, 29));
                    }
                default:
                    Log.e(A05(0, 10, 32), A05(270, 41, 7) + A022);
                    break;
            }
        }
    }

    public static void A08(C1094Cp c1094Cp) throws C10259v {
        int A02 = c1094Cp.A02(6) + 1;
        for (int j7 = 0; j7 < A02; j7++) {
            int A022 = c1094Cp.A02(16);
            switch (A022) {
                case 0:
                    c1094Cp.A03(8);
                    c1094Cp.A03(16);
                    c1094Cp.A03(16);
                    c1094Cp.A03(6);
                    c1094Cp.A03(8);
                    int floorCount = c1094Cp.A02(4);
                    int floorCount2 = floorCount + 1;
                    for (int i9 = 0; i9 < floorCount2; i9++) {
                        c1094Cp.A03(8);
                    }
                    break;
                case 1:
                    int j9 = c1094Cp.A02(5);
                    int i10 = -1;
                    int[] partitionClassList = new int[j9];
                    for (int floorCount3 = 0; floorCount3 < j9; floorCount3++) {
                        partitionClassList[floorCount3] = c1094Cp.A02(4);
                        if (partitionClassList[floorCount3] > i10) {
                            i10 = partitionClassList[floorCount3];
                        }
                    }
                    int[] iArr = new int[i10 + 1];
                    for (int partitions = 0; partitions < iArr.length; partitions++) {
                        iArr[partitions] = c1094Cp.A02(3) + 1;
                        int A023 = c1094Cp.A02(2);
                        if (A023 > 0) {
                            c1094Cp.A03(8);
                        }
                        for (int floorCount4 = 0; floorCount4 < (1 << A023); floorCount4++) {
                            c1094Cp.A03(8);
                        }
                    }
                    c1094Cp.A03(2);
                    int partitions2 = c1094Cp.A02(4);
                    int i11 = 0;
                    int floorCount5 = 0;
                    for (int i12 = 0; i12 < j9; i12++) {
                        i11 += iArr[partitionClassList[i12]];
                        while (floorCount5 < i11) {
                            c1094Cp.A03(partitions2);
                            floorCount5++;
                        }
                    }
                    break;
                default:
                    throw new C10259v(A05(114, 41, 34) + A022);
            }
        }
    }

    public static void A09(C1094Cp c1094Cp) throws C10259v {
        int A02 = c1094Cp.A02(6) + 1;
        for (int i9 = 0; i9 < A02; i9++) {
            int residueCount = c1094Cp.A02(16);
            if (residueCount <= 2) {
                c1094Cp.A03(24);
                c1094Cp.A03(24);
                c1094Cp.A03(24);
                int A022 = c1094Cp.A02(6) + 1;
                c1094Cp.A03(8);
                int[] iArr = new int[A022];
                for (int i10 = 0; i10 < A022; i10++) {
                    int i11 = 0;
                    int residueCount2 = c1094Cp.A02(3);
                    if (c1094Cp.A04()) {
                        i11 = c1094Cp.A02(5);
                    }
                    iArr[i10] = (i11 * 8) + residueCount2;
                }
                for (int i12 = 0; i12 < A022; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        int residueCount3 = iArr[i12];
                        if ((residueCount3 & (1 << i13)) != 0) {
                            c1094Cp.A03(8);
                        }
                    }
                }
            } else {
                throw new C10259v(A05(363, 43, 2));
            }
        }
    }

    public static boolean A0A(int i9, C1217Hz c1217Hz, boolean z8) throws C10259v {
        if (c1217Hz.A04() < 7) {
            if (z8) {
                return false;
            }
            throw new C10259v(A05(464, 18, 36) + c1217Hz.A04());
        }
        if (c1217Hz.A0E() != i9) {
            if (z8) {
                return false;
            }
            throw new C10259v(A05(93, 21, 41) + Integer.toHexString(i9));
        }
        if (c1217Hz.A0E() != 118 || c1217Hz.A0E() != 111 || c1217Hz.A0E() != 114 || c1217Hz.A0E() != 98 || c1217Hz.A0E() != 105 || c1217Hz.A0E() != 115) {
            if (z8) {
                return false;
            }
            throw new C10259v(A05(10, 28, 123));
        }
        return true;
    }

    public static Ct[] A0B(C1094Cp c1094Cp) {
        int A02 = c1094Cp.A02(6) + 1;
        Ct[] ctArr = new Ct[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = c1094Cp.A04();
            int A022 = c1094Cp.A02(16);
            int i9 = c1094Cp.A02(16);
            ctArr[windowType] = new Ct(A04, A022, i9, c1094Cp.A02(8));
        }
        return ctArr;
    }

    public static Ct[] A0C(C1217Hz c1217Hz, int i9) throws C10259v {
        A0A(5, c1217Hz, false);
        int A0E = c1217Hz.A0E() + 1;
        C1094Cp c1094Cp = new C1094Cp(c1217Hz.A00);
        int numberOfBooks = c1217Hz.A06();
        c1094Cp.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0E; numberOfBooks2++) {
            A02(c1094Cp);
        }
        int numberOfBooks3 = c1094Cp.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i10 = 0; i10 < timeCount; i10++) {
            int numberOfBooks4 = c1094Cp.A02(16);
            if (numberOfBooks4 != 0) {
                throw new C10259v(A05(311, 52, 47));
            }
        }
        A08(c1094Cp);
        A09(c1094Cp);
        A07(i9, c1094Cp);
        Ct[] A0B = A0B(c1094Cp);
        if (c1094Cp.A04()) {
            return A0B;
        }
        throw new C10259v(A05(155, 43, 85));
    }
}
