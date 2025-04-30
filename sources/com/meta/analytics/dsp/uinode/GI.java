package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class GI {
    public static byte[] A02;
    public static String[] A03 = {"o6dtQbEX6DUU2ZPrt5fMpvPTiwhNIFVw", "", "MFXGqw4wC6wJal5", "uC7LPUo8IknDiYQWYNCx", "R0uPVJBemfZgswV0fGveV9P1kI7oDQdd", "Ua883bT78DPlxnLPMdUDySsZEoLcqfDA", "dE9C57ZljM4PWQ1xUFFc", "KkKO0GZU5SD8UwtXdKEVEJnvfx0O6Fgr"};
    public static final Pattern A04;
    public final C1217Hz A00 = new C1217Hz();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{119, -114, -93, -114, -114, -73, -55, -71, 85, -81, -127, -36, -37, -10, -17, -23, -29, -27, -67, -94, -88, -37, -34, -94, -35, -86, -87, -94, -36, -35, Byte.MIN_VALUE, Ascii.DEL, -127, -119, -123, -112, -115, -109, -116, -126, 75, -127, -115, -118, -115, -112, -72, -59, -62, -70, -97, -85, -88, -85, -82, 123, -124, -125, -119, 66, 123, 118, -126, 126, -127, -114, -90, -81, -82, -76, 109, -77, -76, -71, -84, -91, -74, -65, -66, -60, 125, -57, -75, -71, -73, -72, -60, -36, -25, -44, -33, -36, -42, -33, -48, -29, -33, -104, -49, -48, -50, -38, -35, -52, -33, -44, -38, -39, -80, -87, -97, -96, -83, -89, -92, -87, -96, -103, -124};
    }

    static {
        A07();
        A04 = Pattern.compile(A01(11, 19, 122));
    }

    public static char A00(C1217Hz c1217Hz, int i9) {
        return (char) c1217Hz.A00[i9];
    }

    public static String A02(C1217Hz c1217Hz) {
        int limit = c1217Hz.A06();
        int A07 = c1217Hz.A07();
        char c9 = 0;
        while (limit < A07 && c9 == 0) {
            int i9 = limit + 1;
            int position = c1217Hz.A00[limit];
            int limit2 = (char) position;
            c9 = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i9;
        }
        int position2 = c1217Hz.A06();
        return c1217Hz.A0S((limit - 1) - position2).trim();
    }

    public static String A03(C1217Hz c1217Hz, StringBuilder sb) {
        sb.setLength(0);
        int A06 = c1217Hz.A06();
        int A07 = c1217Hz.A07();
        boolean z8 = false;
        while (A06 < A07 && !z8) {
            int position = c1217Hz.A00[A06];
            char c9 = (char) position;
            if ((c9 >= 'A' && c9 <= 'Z') || ((c9 >= 'a' && c9 <= 'z') || ((c9 >= '0' && c9 <= '9') || c9 == '#' || c9 == '-' || c9 == '.' || c9 == '_'))) {
                A06++;
                sb.append(c9);
            } else {
                z8 = true;
            }
        }
        int position2 = c1217Hz.A06();
        c1217Hz.A0Z(A06 - position2);
        return sb.toString();
    }

    public static String A04(C1217Hz c1217Hz, StringBuilder sb) {
        A0A(c1217Hz);
        if (c1217Hz.A04() == 0) {
            return null;
        }
        String A032 = A03(c1217Hz, sb);
        String A01 = A01(0, 0, 115);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) c1217Hz.A0E());
        return identifier;
    }

    public static String A05(C1217Hz c1217Hz, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z8 = false;
        while (!z8) {
            int A06 = c1217Hz.A06();
            String token = A04(c1217Hz, sb);
            if (token == null) {
                return null;
            }
            if (A01(118, 1, 1).equals(token) || A01(8, 1, 20).equals(token)) {
                c1217Hz.A0Y(A06);
                z8 = true;
            } else {
                sb2.append(token);
            }
        }
        return sb2.toString();
    }

    public static String A06(C1217Hz c1217Hz, StringBuilder sb) {
        A0A(c1217Hz);
        if (c1217Hz.A04() < 5) {
            return null;
        }
        String A0S = c1217Hz.A0S(5);
        String cueSelector = A01(3, 5, 78);
        if (!cueSelector.equals(A0S)) {
            return null;
        }
        int A06 = c1217Hz.A06();
        String token = A04(c1217Hz, sb);
        if (token == null) {
            return null;
        }
        String cueSelector2 = A01(117, 1, 24);
        if (cueSelector2.equals(token)) {
            c1217Hz.A0Y(A06);
            String cueSelector3 = A01(0, 0, 115);
            return cueSelector3;
        }
        String target = null;
        String cueSelector4 = A01(0, 1, 73);
        if (cueSelector4.equals(token)) {
            target = A02(c1217Hz);
        }
        String token2 = A04(c1217Hz, sb);
        String cueSelector5 = A01(1, 1, 95);
        if (!cueSelector5.equals(token2) || token2 == null) {
            return null;
        }
        return target;
    }

    private void A08(GM gm, String str) {
        if (A01(0, 0, 115).equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        String[] strArr = A03;
        String str2 = strArr[6];
        String str3 = strArr[3];
        int length = str2.length();
        int voiceStartIndex = str3.length();
        if (length != voiceStartIndex) {
            throw new RuntimeException();
        }
        A03[2] = "CW487BEDmC1UFYo";
        if (indexOf != -1) {
            Matcher matcher = A04.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                gm.A0K(matcher.group(1));
            }
            str = str.substring(0, indexOf);
        }
        String[] classDivision = IF.A0l(str, A01(9, 2, 77));
        String str4 = classDivision[0];
        int indexOf2 = str4.indexOf(35);
        if (indexOf2 != -1) {
            gm.A0J(str4.substring(0, indexOf2));
            gm.A0I(str4.substring(indexOf2 + 1));
        } else {
            gm.A0J(str4);
        }
        if (classDivision.length > 1) {
            gm.A0L((String[]) Arrays.copyOfRange(classDivision, 1, classDivision.length));
        }
    }

    public static void A09(C1217Hz c1217Hz) {
        String line;
        do {
            line = c1217Hz.A0P();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A0A(C1217Hz c1217Hz) {
        boolean skipping = true;
        while (c1217Hz.A04() > 0 && skipping) {
            boolean skipping2 = A0D(c1217Hz);
            if (!skipping2) {
                boolean skipping3 = A0C(c1217Hz);
                if (!skipping3) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0B(C1217Hz c1217Hz, GM gm, StringBuilder sb) {
        A0A(c1217Hz);
        String A032 = A03(c1217Hz, sb);
        String A01 = A01(0, 0, 115);
        if (A01.equals(A032)) {
            return;
        }
        String A012 = A01(2, 1, 99);
        String property = A04(c1217Hz, sb);
        if (!A012.equals(property)) {
            return;
        }
        A0A(c1217Hz);
        String token = A05(c1217Hz, sb);
        if (token == null || A01.equals(token)) {
            return;
        }
        int A06 = c1217Hz.A06();
        String A042 = A04(c1217Hz, sb);
        String[] strArr = A03;
        String str = strArr[4];
        String str2 = strArr[7];
        int position = str.charAt(25);
        if (position != str2.charAt(25)) {
            A03[2] = "4K4C1V7x7MHXc7r";
            String property2 = A01(8, 1, 20);
            if (!property2.equals(A042)) {
                String property3 = A03[2];
                int position2 = property3.length();
                if (position2 != 15) {
                    String property4 = A01(118, 1, 1);
                    if (!property4.equals(A042)) {
                        return;
                    }
                } else {
                    A03[2] = "7FFtYIqbw4CKtyv";
                    String property5 = A01(118, 1, 1);
                    if (!property5.equals(A042)) {
                        return;
                    }
                }
                c1217Hz.A0Y(A06);
            }
            String property6 = A01(50, 5, 54);
            if (property6.equals(A032)) {
                gm.A0C(AbstractC1197Hf.A02(token));
                return;
            }
            String property7 = A01(30, 16, 24);
            if (property7.equals(A032)) {
                gm.A0B(AbstractC1197Hf.A02(token));
                return;
            }
            String property8 = A01(93, 15, 101);
            if (!property8.equals(A032)) {
                String property9 = A01(55, 11, 15);
                if (property9.equals(A032)) {
                    gm.A0D(token);
                    return;
                }
                String property10 = A01(76, 11, 74);
                if (property10.equals(A032)) {
                    String property11 = A01(46, 4, 80);
                    if (!property11.equals(token)) {
                        return;
                    }
                    gm.A0E(true);
                    return;
                }
                String property12 = A01(66, 10, 58);
                if (!property12.equals(A032)) {
                    return;
                }
                String property13 = A01(87, 6, 109);
                if (!property13.equals(token)) {
                    return;
                }
                gm.A0F(true);
                return;
            }
            String[] strArr2 = A03;
            String str3 = strArr2[6];
            String property14 = strArr2[3];
            int position3 = str3.length();
            if (position3 == property14.length()) {
                String[] strArr3 = A03;
                strArr3[6] = "4EBATBo3G3iJZ8CvpiMB";
                strArr3[3] = "oi6BgvCdqkOJFnhZ1QlM";
                String property15 = A01(108, 9, 53);
                if (!property15.equals(token)) {
                    return;
                }
                gm.A0G(true);
                return;
            }
        }
        throw new RuntimeException();
    }

    public static boolean A0C(C1217Hz c1217Hz) {
        int position = c1217Hz.A06();
        int limit = c1217Hz.A07();
        byte[] bArr = c1217Hz.A00;
        if (position + 2 > limit) {
            return false;
        }
        int i9 = position + 1;
        if (bArr[position] != 47) {
            return false;
        }
        int i10 = i9 + 1;
        if (bArr[i9] == 42) {
            while (i10 + 1 < limit) {
                int i11 = i10 + 1;
                char skippedChar = (char) bArr[i10];
                if (skippedChar == '*') {
                    char skippedChar2 = (char) bArr[i11];
                    if (skippedChar2 == '/') {
                        limit = i11 + 1;
                        i10 = limit;
                    }
                }
                i10 = i11;
            }
            c1217Hz.A0Z(limit - c1217Hz.A06());
            return true;
        }
        return false;
    }

    public static boolean A0D(C1217Hz c1217Hz) {
        switch (A00(c1217Hz, c1217Hz.A06())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c1217Hz.A0Z(1);
                return true;
            default:
                return false;
        }
    }

    public final GM A0E(C1217Hz c1217Hz) {
        this.A01.setLength(0);
        int A06 = c1217Hz.A06();
        A09(c1217Hz);
        C1217Hz c1217Hz2 = this.A00;
        byte[] bArr = c1217Hz.A00;
        int initialInputPosition = c1217Hz.A06();
        c1217Hz2.A0b(bArr, initialInputPosition);
        this.A00.A0Y(A06);
        String A062 = A06(this.A00, this.A01);
        if (A062 != null) {
            if (A01(117, 1, 24).equals(A04(this.A00, this.A01))) {
                GM style = new GM();
                A08(style, A062);
                String str = null;
                boolean z8 = false;
                while (A03[2].length() == 15) {
                    String[] strArr = A03;
                    strArr[0] = "u1M5SbGaD18kT3mlqswMZWeIcd6Kf1Bl";
                    strArr[5] = "tCvfJbvExhfaq7uM8GkpPqKnHxthSgb1";
                    String A01 = A01(118, 1, 1);
                    if (!z8) {
                        int A063 = this.A00.A06();
                        str = A04(this.A00, this.A01);
                        z8 = str == null || A01.equals(str);
                        if (!z8) {
                            this.A00.A0Y(A063);
                            A0B(this.A00, style, this.A01);
                        }
                    } else {
                        if (A01.equals(str)) {
                            return style;
                        }
                        return null;
                    }
                }
                throw new RuntimeException();
            }
        }
        return null;
    }
}
