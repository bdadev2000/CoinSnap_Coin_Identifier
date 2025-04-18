package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: assets/audience_network.dex */
public final class GI {
    public static byte[] A02;
    public static String[] A03 = {"o6dtQbEX6DUU2ZPrt5fMpvPTiwhNIFVw", "", "MFXGqw4wC6wJal5", "uC7LPUo8IknDiYQWYNCx", "R0uPVJBemfZgswV0fGveV9P1kI7oDQdd", "Ua883bT78DPlxnLPMdUDySsZEoLcqfDA", "dE9C57ZljM4PWQ1xUFFc", "KkKO0GZU5SD8UwtXdKEVEJnvfx0O6Fgr"};
    public static final Pattern A04;
    public final C0651Hz A00 = new C0651Hz();
    public final StringBuilder A01 = new StringBuilder();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A02 = new byte[]{119, -114, -93, -114, -114, -73, -55, -71, 85, -81, -127, -36, -37, -10, -17, -23, -29, -27, -67, -94, -88, -37, -34, -94, -35, -86, -87, -94, -36, -35, ByteCompanionObject.MIN_VALUE, Byte.MAX_VALUE, -127, -119, -123, -112, -115, -109, -116, -126, 75, -127, -115, -118, -115, -112, -72, -59, -62, -70, -97, -85, -88, -85, -82, 123, -124, -125, -119, 66, 123, 118, -126, 126, -127, -114, -90, -81, -82, -76, 109, -77, -76, -71, -84, -91, -74, -65, -66, -60, 125, -57, -75, -71, -73, -72, -60, -36, -25, -44, -33, -36, -42, -33, -48, -29, -33, -104, -49, -48, -50, -38, -35, -52, -33, -44, -38, -39, -80, -87, -97, -96, -83, -89, -92, -87, -96, -103, -124};
    }

    static {
        A07();
        A04 = Pattern.compile(A01(11, 19, 122));
    }

    public static char A00(C0651Hz c0651Hz, int i10) {
        return (char) c0651Hz.A00[i10];
    }

    public static String A02(C0651Hz c0651Hz) {
        int limit = c0651Hz.A06();
        int A07 = c0651Hz.A07();
        char c10 = 0;
        while (limit < A07 && c10 == 0) {
            int i10 = limit + 1;
            int position = c0651Hz.A00[limit];
            int limit2 = (char) position;
            c10 = limit2 == 41 ? (char) 1 : (char) 0;
            limit = i10;
        }
        int position2 = c0651Hz.A06();
        return c0651Hz.A0S((limit - 1) - position2).trim();
    }

    public static String A03(C0651Hz c0651Hz, StringBuilder sb2) {
        sb2.setLength(0);
        int A06 = c0651Hz.A06();
        int A07 = c0651Hz.A07();
        boolean z10 = false;
        while (A06 < A07 && !z10) {
            int position = c0651Hz.A00[A06];
            char c10 = (char) position;
            if ((c10 >= 'A' && c10 <= 'Z') || ((c10 >= 'a' && c10 <= 'z') || ((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                A06++;
                sb2.append(c10);
            } else {
                z10 = true;
            }
        }
        int position2 = c0651Hz.A06();
        c0651Hz.A0Z(A06 - position2);
        return sb2.toString();
    }

    public static String A04(C0651Hz c0651Hz, StringBuilder sb2) {
        A0A(c0651Hz);
        if (c0651Hz.A04() == 0) {
            return null;
        }
        String A032 = A03(c0651Hz, sb2);
        String A01 = A01(0, 0, 115);
        if (!A01.equals(A032)) {
            return A032;
        }
        String identifier = A01 + ((char) c0651Hz.A0E());
        return identifier;
    }

    public static String A05(C0651Hz c0651Hz, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int A06 = c0651Hz.A06();
            String token = A04(c0651Hz, sb2);
            if (token == null) {
                return null;
            }
            if (A01(118, 1, 1).equals(token) || A01(8, 1, 20).equals(token)) {
                c0651Hz.A0Y(A06);
                z10 = true;
            } else {
                sb3.append(token);
            }
        }
        return sb3.toString();
    }

    public static String A06(C0651Hz c0651Hz, StringBuilder sb2) {
        A0A(c0651Hz);
        if (c0651Hz.A04() < 5) {
            return null;
        }
        String A0S = c0651Hz.A0S(5);
        String cueSelector = A01(3, 5, 78);
        if (!cueSelector.equals(A0S)) {
            return null;
        }
        int A06 = c0651Hz.A06();
        String token = A04(c0651Hz, sb2);
        if (token == null) {
            return null;
        }
        String cueSelector2 = A01(117, 1, 24);
        if (cueSelector2.equals(token)) {
            c0651Hz.A0Y(A06);
            String cueSelector3 = A01(0, 0, 115);
            return cueSelector3;
        }
        String target = null;
        String cueSelector4 = A01(0, 1, 73);
        if (cueSelector4.equals(token)) {
            target = A02(c0651Hz);
        }
        String token2 = A04(c0651Hz, sb2);
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

    public static void A09(C0651Hz c0651Hz) {
        String line;
        do {
            line = c0651Hz.A0P();
        } while (!TextUtils.isEmpty(line));
    }

    public static void A0A(C0651Hz c0651Hz) {
        boolean skipping = true;
        while (c0651Hz.A04() > 0 && skipping) {
            boolean skipping2 = A0D(c0651Hz);
            if (!skipping2) {
                boolean skipping3 = A0C(c0651Hz);
                if (!skipping3) {
                    skipping = false;
                }
            }
            skipping = true;
        }
    }

    public static void A0B(C0651Hz c0651Hz, GM gm, StringBuilder sb2) {
        A0A(c0651Hz);
        String A032 = A03(c0651Hz, sb2);
        String A01 = A01(0, 0, 115);
        if (A01.equals(A032)) {
            return;
        }
        String A012 = A01(2, 1, 99);
        String property = A04(c0651Hz, sb2);
        if (!A012.equals(property)) {
            return;
        }
        A0A(c0651Hz);
        String token = A05(c0651Hz, sb2);
        if (token == null || A01.equals(token)) {
            return;
        }
        int A06 = c0651Hz.A06();
        String A042 = A04(c0651Hz, sb2);
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
                c0651Hz.A0Y(A06);
            }
            String property6 = A01(50, 5, 54);
            if (property6.equals(A032)) {
                gm.A0C(AbstractC0631Hf.A02(token));
                return;
            }
            String property7 = A01(30, 16, 24);
            if (property7.equals(A032)) {
                gm.A0B(AbstractC0631Hf.A02(token));
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

    public static boolean A0C(C0651Hz c0651Hz) {
        int position = c0651Hz.A06();
        int limit = c0651Hz.A07();
        byte[] bArr = c0651Hz.A00;
        if (position + 2 > limit) {
            return false;
        }
        int i10 = position + 1;
        if (bArr[position] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (bArr[i10] == 42) {
            while (i11 + 1 < limit) {
                int i12 = i11 + 1;
                char skippedChar = (char) bArr[i11];
                if (skippedChar == '*') {
                    char skippedChar2 = (char) bArr[i12];
                    if (skippedChar2 == '/') {
                        limit = i12 + 1;
                        i11 = limit;
                    }
                }
                i11 = i12;
            }
            c0651Hz.A0Z(limit - c0651Hz.A06());
            return true;
        }
        return false;
    }

    public static boolean A0D(C0651Hz c0651Hz) {
        switch (A00(c0651Hz, c0651Hz.A06())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c0651Hz.A0Z(1);
                return true;
            default:
                return false;
        }
    }

    public final GM A0E(C0651Hz c0651Hz) {
        this.A01.setLength(0);
        int A06 = c0651Hz.A06();
        A09(c0651Hz);
        C0651Hz c0651Hz2 = this.A00;
        byte[] bArr = c0651Hz.A00;
        int initialInputPosition = c0651Hz.A06();
        c0651Hz2.A0b(bArr, initialInputPosition);
        this.A00.A0Y(A06);
        String A062 = A06(this.A00, this.A01);
        if (A062 != null) {
            if (A01(117, 1, 24).equals(A04(this.A00, this.A01))) {
                GM style = new GM();
                A08(style, A062);
                String str = null;
                boolean z10 = false;
                while (A03[2].length() == 15) {
                    String[] strArr = A03;
                    strArr[0] = "u1M5SbGaD18kT3mlqswMZWeIcd6Kf1Bl";
                    strArr[5] = "tCvfJbvExhfaq7uM8GkpPqKnHxthSgb1";
                    String A01 = A01(118, 1, 1);
                    if (!z10) {
                        int A063 = this.A00.A06();
                        str = A04(this.A00, this.A01);
                        z10 = str == null || A01.equals(str);
                        if (!z10) {
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
