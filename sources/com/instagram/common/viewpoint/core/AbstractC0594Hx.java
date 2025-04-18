package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.aztec.encoder.Encoder;
import com.safedk.android.internal.d;
import java.util.ArrayList;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Hx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0594Hx {
    public static byte[] A00;
    public static String[] A01 = {"nXvlrNGYXanwKFKxckYF", "ab", "QC6qUWFS60GKUUYeA4MZapqXqsMmI3vS", "czhP8H02Ev9YOfXIuS", "lopRyFs0vjceEr78rsaj4u7Yl", "ny4Ztm5fY14Zy", "JhDFckQh0xOKzX75Bu5yFTpT52B828", "5XgzWWjFe0UjIKQc45EJfpyV7HOKhYUT"};
    public static final ArrayList<C0593Hw> A02;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-86, -49, -41, -62, -51, -54, -59, -127, -50, -54, -50, -58, -127, -43, -38, -47, -58, -101, -127, 27, 29, -25, -19, 25, 40, 40, 36, 33, 27, 25, 44, 33, 39, 38, -25, 27, 29, 25, -27, -18, -24, -16, 58, 73, 73, 69, 66, 60, 58, 77, 66, 72, 71, 8, 60, 62, 58, 6, 16, 9, 17, -37, -22, -22, -26, -29, -35, -37, -18, -29, -23, -24, -87, -34, -16, -36, -19, -17, -36, -19, 21, 36, 36, 32, 29, 23, 21, 40, 29, 35, 34, -29, 29, 24, -25, -13, 2, 2, -2, -5, -11, -13, 6, -5, 1, 0, -63, 2, -7, 5, -43, -28, -28, -32, -35, -41, -43, -24, -35, -29, -30, -93, -24, -24, -31, -32, -97, -20, -31, -32, -1, 14, 14, 10, 7, 1, -1, 18, 7, 13, 12, -51, 20, 13, 0, 17, 19, 0, 43, 58, 58, 54, 51, 45, 43, 62, 51, 57, 56, -7, 66, -9, 45, 43, 55, 47, 60, 43, -9, 55, 57, 62, 51, 57, 56, 3, 18, 18, 14, 11, 5, 3, 22, 11, 17, 16, -47, 26, -49, 7, 15, 21, 9, 18, 33, 33, 29, 26, 20, 18, 37, 26, 32, 31, -32, 41, -34, 30, 33, -27, -34, 20, 22, 18, -34, -25, -31, -23, -42, -27, -27, -31, -34, -40, -42, -23, -34, -28, -29, -92, -19, -94, -30, -27, -87, -94, -21, -23, -23, 31, 46, 46, 42, 39, 33, 31, 50, 39, 45, 44, -19, 54, -21, 47, 51, 39, 33, 41, 50, 39, 43, 35, -21, 50, 54, -15, 37, 62, 77, 77, 73, 70, 64, 62, 81, 70, 76, 75, 12, 85, 10, 79, 62, 84, 64, 64, 59, 74, 74, 70, 67, 61, 59, 78, 67, 73, 72, 9, 82, 7, 77, 61, 78, Utf8.REPLACEMENT_BYTE, 13, 15, -43, -28, -28, -32, -35, -41, -43, -24, -35, -29, -30, -93, -20, -95, -25, -23, -42, -26, -35, -28, 30, 50, 33, 38, 44, 58, 78, 61, 66, 72, 8, 58, 60, 12, 14, 34, 17, 22, 28, -36, 18, 14, 16, -32, -7, 13, -4, 1, 7, -57, -3, -7, -5, -53, -59, 2, 7, -5, -9, 11, -6, -1, 5, -59, 3, 6, -54, -9, -61, 2, -9, 10, 3, 19, 39, 22, 27, 33, -31, 31, 34, 23, 25, -45, -25, -42, -37, -31, -95, -31, -30, -25, -27, -54, -34, -51, -46, -40, -104, -35, -37, -34, -50, -106, -47, -51, -54, -34, -51, -46, -40, -104, -33, -41, -51, -105, -51, -35, -36, -34, -14, -31, -26, -20, -84, -13, -21, -31, -85, -31, -15, -16, -85, -27, -31, -9, 11, -6, -1, 5, -59, 12, 5, 8, -8, -1, 9, 38, 59, 40, -10, -31, -10, -29, -77, -25, -13, -24, -23, -25, -44, -10, -23, -22, -19, -4, 41, 38, 40, -8, -41, -40, -42, -90, 47, Utf8.REPLACEMENT_BYTE, 62, 46, 17, 33, 32, 18, -45, -29, -30, -41, 42, 58, 57, 50, 51, 49, -7, 1, 31, 29, -25, -19, -13, -16, 1, -68, 8, 22, 3, -47, 72, 68, 72, 64, 47, 84, 75, 64, -27, -24, -84, -39, 33, 36, -24, 21, -30, 12, 13, 18, 16, -11, -26, -7, -11, -35, -48, -53, -52, -42, -37, -50, -55, -54, -44, -108, -58, -37, -56, -31, -44, -49, -48, -38, -102, -45, -48, -31, -50, 78, 65, 60, 61, 71, 7, 69, 72, 12, 78, 5, 61, 75, -37, -50, -55, -54, -44, -108, -46, -43, -54, -52, 82, 69, 64, 65, 75, 11, 73, 76, 65, 67, 14, 37, 24, 19, 20, 30, -34, 38, 37, 18, -32, 51, 38, 33, 34, 44, -20, 53, -22, 51, 43, 33, -21, 44, 43, -17, -21, 51, 45, -11, 73, 60, 55, 56, 66, 2, 75, 0, 73, 65, 55, 1, 66, 65, 5, 1, 73, 67, 12, 51, 44, 47, 31, 38, 48, 27, 21, -43, -35, 24, 18, -46, -37, -31, -37, -93, 30, 24, -31};
    }

    static {
        A08();
        A02 = new ArrayList<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r6.equals(r3) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r0 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r6.equals(r3) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r5 = 0
            r4 = 5
            switch(r0) {
                case -2123537834: goto Laa;
                case -1095064472: goto L97;
                case 187078296: goto L84;
                case 1504578661: goto L72;
                case 1505942594: goto L39;
                case 1556697186: goto Le;
                default: goto L9;
            }
        L9:
            r0 = -1
        La:
            switch(r0) {
                case 0: goto Lc7;
                case 1: goto Lc5;
                case 2: goto Lc5;
                case 3: goto Lc3;
                case 4: goto Lc0;
                case 5: goto Lbd;
                default: goto Ld;
            }
        Ld:
            return r5
        Le:
            r3 = 399(0x18f, float:5.59E-43)
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.AbstractC0594Hx.A01
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lc8
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.AbstractC0594Hx.A01
            java.lang.String r1 = "XQV1rtrSOg8"
            r0 = 4
            r2[r0] = r1
            r1 = 13
            r0 = 9
            java.lang.String r0 = A04(r3, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r0 = 5
            goto La
        L39:
            r2 = 425(0x1a9, float:5.96E-43)
            r1 = 16
            r0 = 29
            java.lang.String r3 = A04(r2, r1, r0)
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.AbstractC0594Hx.A01
            r0 = 5
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L64
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.AbstractC0594Hx.A01
            java.lang.String r1 = "fm"
            r0 = 1
            r2[r0] = r1
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L9
        L62:
            r0 = 4
            goto La
        L64:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.AbstractC0594Hx.A01
            java.lang.String r1 = "oH"
            r0 = 1
            r2[r0] = r1
            boolean r0 = r6.equals(r3)
            if (r0 == 0) goto L9
            goto L62
        L72:
            r2 = 340(0x154, float:4.76E-43)
            r1 = 10
            r0 = 77
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r0 = 1
            goto La
        L84:
            r2 = 331(0x14b, float:4.64E-43)
            r1 = 9
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r0 = 0
            goto La
        L97:
            r2 = 412(0x19c, float:5.77E-43)
            r1 = 13
            r0 = 9
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r0 = 3
            goto La
        Laa:
            r2 = 350(0x15e, float:4.9E-43)
            r1 = 14
            r0 = 56
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2
            goto La
        Lbd:
            r0 = 14
            return r0
        Lc0:
            r0 = 8
            return r0
        Lc3:
            r0 = 7
            return r0
        Lc5:
            r0 = 6
            return r0
        Lc7:
            return r4
        Lc8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.AbstractC0594Hx.A00(java.lang.String):int");
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        boolean A09 = A09(str);
        if (A01[4].length() != 9) {
            String[] strArr = A01;
            strArr[6] = "RJC1gwIZ7rbFn6fsQqldXDA2erGgWv";
            strArr[0] = "27hJvu9Qq1BWxS961NvI";
            if (A09) {
                return 1;
            }
            if (A0B(str)) {
                return 2;
            }
            if (!A0A(str) && !A04(23, 19, 88).equals(str) && !A04(42, 19, Opcodes.LSHL).equals(str) && !A04(Opcodes.INSTANCEOF, 25, 81).equals(str) && !A04(306, 20, 20).equals(str)) {
                boolean equals = A04(110, 20, 20).equals(str);
                String[] strArr2 = A01;
                if (strArr2[6].length() != strArr2[0].length()) {
                    A01[1] = "yK";
                    if (!equals && !A04(239, 28, 94).equals(str) && !A04(218, 21, 21).equals(str) && !A04(267, 19, Opcodes.LUSHR).equals(str) && !A04(130, 18, 62).equals(str)) {
                        String[] strArr3 = A01;
                        if (strArr3[5].length() != strArr3[3].length()) {
                            String[] strArr4 = A01;
                            strArr4[6] = "Pi6X8Ic5BpSNrHRXVgoJ7B2wVh7XZC";
                            strArr4[0] = "bN719ZOEYj7GSd1MtUav";
                            if (A04(95, 15, 50).equals(str)) {
                                return 3;
                            }
                        } else if (A04(95, 15, 50).equals(str)) {
                            return 3;
                        }
                        if (A04(61, 19, 26).equals(str)) {
                            return 3;
                        }
                        if (A04(80, 15, 84).equals(str) || A04(Opcodes.DRETURN, 18, 66).equals(str) || A04(286, 20, 122).equals(str) || A04(Opcodes.LCMP, 27, 106).equals(str)) {
                            return 4;
                        }
                        return A02(str);
                    }
                    return 3;
                }
            } else {
                return 3;
            }
        }
        throw new RuntimeException();
    }

    public static int A02(String str) {
        int customMimeTypeCount = A02.size();
        if (0 < customMimeTypeCount) {
            A02.get(0);
            throw new NullPointerException(A04(512, 8, Opcodes.LSHR));
        }
        return -1;
    }

    public static String A03(int i2) {
        switch (i2) {
            case 32:
                return A04(561, 13, 120);
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                return A04(542, 9, 5);
            case 35:
                return A04(551, 10, 11);
            case 64:
            case 102:
            case 103:
            case 104:
                return A04(364, 15, 54);
            case 96:
            case Opcodes.LADD /* 97 */:
            case Opcodes.FADD /* 98 */:
            case Opcodes.DADD /* 99 */:
            case 100:
            case 101:
                return A04(584, 11, 124);
            case 105:
            case 107:
                return A04(379, 10, 82);
            case 106:
                return A04(574, 10, 5);
            case Opcodes.IF_ICMPGT /* 163 */:
                return A04(595, 10, 79);
            case Opcodes.IF_ACMPEQ /* 165 */:
                return A04(331, 9, Opcodes.LSHL);
            case Opcodes.IF_ACMPNE /* 166 */:
                return A04(340, 10, 77);
            case Opcodes.RET /* 169 */:
            case Opcodes.IRETURN /* 172 */:
                return A04(FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 13, 9);
            case Opcodes.TABLESWITCH /* 170 */:
            case Opcodes.LOOKUPSWITCH /* 171 */:
                return A04(425, 16, 29);
            case Opcodes.LRETURN /* 173 */:
                return A04(389, 10, 18);
            case Opcodes.RETURN /* 177 */:
                return A04(624, 19, Opcodes.DREM);
            default:
                return null;
        }
    }

    public static String A05(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith(A04(453, 4, 101)) || trim.startsWith(A04(457, 4, 32))) {
            return A04(542, 9, 5);
        }
        if (trim.startsWith(A04(504, 4, 43)) || trim.startsWith(A04(508, 4, 64))) {
            return A04(551, 10, 11);
        }
        if (trim.startsWith(A04(660, 3, 72)) || trim.startsWith(A04(653, 4, 66))) {
            return A04(624, 19, Opcodes.DREM);
        }
        if (!trim.startsWith(A04(657, 3, 11))) {
            if (A01[4].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "Vr1W6v83OFzq7";
            strArr[3] = "7W7bBe2KxQVtiDDwhw";
            if (!trim.startsWith(A04(649, 4, 69))) {
                String A04 = A04(520, 4, 24);
                if (A01[1].length() != 2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "Btjplq8kPAGjfXOAnbhpFCySBxhN39";
                strArr2[0] = "OfeWHzVxD3vaWfBesMba";
                if (trim.startsWith(A04)) {
                    String mimeType = null;
                    if (trim.startsWith(A04(524, 5, 84))) {
                        String substring = trim.substring(5);
                        if (substring.length() >= 2) {
                            try {
                                String objectTypeString = substring.substring(0, 2);
                                String objectTypeHexString = IK.A0N(objectTypeString);
                                mimeType = A03(Integer.parseInt(objectTypeHexString, 16));
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    return mimeType == null ? A04(364, 15, 54) : mimeType;
                }
                if (trim.startsWith(A04(19, 4, 90)) || trim.startsWith(A04(472, 4, 101))) {
                    return A04(331, 9, Opcodes.LSHL);
                }
                if (trim.startsWith(A04(d.f29936c, 4, 90)) || trim.startsWith(A04(476, 4, 19))) {
                    return A04(340, 10, 77);
                }
                if (trim.startsWith(A04(496, 4, 110))) {
                    return A04(350, 14, 56);
                }
                if (trim.startsWith(A04(480, 4, 107)) || trim.startsWith(A04(484, 4, 77))) {
                    return A04(FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 13, 9);
                }
                if (trim.startsWith(A04(488, 4, 15)) || trim.startsWith(A04(492, 4, 102))) {
                    return A04(425, 16, 29);
                }
                if (trim.startsWith(A04(529, 4, 61))) {
                    return A04(389, 10, 18);
                }
                if (trim.startsWith(A04(643, 6, 93))) {
                    return A04(441, 12, 54);
                }
                return A06(trim);
            }
        }
        String A042 = A04(605, 19, 93);
        if (A01[4].length() == 9) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[6] = "V922PtFQPE4Rka8o3RmIKSxjMATVQg";
        strArr3[0] = "Xf02ukbJtnOUszpkvueX";
        return A042;
    }

    public static String A06(String str) {
        int customMimeTypeCount = A02.size();
        if (0 < customMimeTypeCount) {
            A02.get(0);
            throw new NullPointerException(A04(461, 11, 36));
        }
        return null;
    }

    public static String A07(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException(A04(0, 19, 1) + str);
    }

    public static boolean A09(String str) {
        return A04(326, 5, 93).equals(A07(str));
    }

    public static boolean A0A(String str) {
        return A04(533, 4, 33).equals(A07(str));
    }

    public static boolean A0B(String str) {
        return A04(537, 5, 7).equals(A07(str));
    }
}
