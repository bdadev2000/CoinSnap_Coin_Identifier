package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public abstract class GS {
    public static byte[] A00;
    public static String[] A01 = {"mrSAwXtvA48pKDbYm7Wldl5aXQuRkGdI", "fbJ004pbEzPzRxWccwuVKG55hrVCh", "rUGvTWjAKrexOA4wkcPi8vLiUWrJjNTX", "GXri66PfJCwBQDboa2OTJvm", "EWHNad80frv4tcDt6njDAOtFLZM1nox1", "w8DKXrbkod7LTDg6ra7kwJaOsoQJy0WV", "9chw5e5", "pdwJMmZou7a5Bc5N0u9b6z7FU4fjoJm4"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].charAt(7) == 'a') {
                throw new RuntimeException();
            }
            A01[4] = "NgHJChfDsWA9aQDgFnI07vXtmTssrLt0";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
            i13++;
        }
    }

    public static void A03() {
        A00 = new byte[]{7, -39, -35, Ascii.DLE, 8, -3, -5, Ascii.FF, -3, -4, -72, -17, -35, -38, -18, -20, -20, -58, -72, -33, 7, Ascii.FF, -72, -12, 9, Ascii.SYN, 7, 9, Ascii.DC2, Ascii.CAN, 5, Ascii.VT, 9, Ascii.ETB, -60, 17, Ascii.EM, Ascii.ETB, Ascii.CAN, -60, 9, Ascii.DC2, 8, -60, Ascii.ESC, Ascii.CR, Ascii.CAN, Ascii.FF, -60, -55, -45, -91, 55, 39, 40, 45, Ascii.RS, 1, 1, -7, 85, -30, 2, 7, 3, 2, Ascii.CAN, -3, -27, 118, 66, 70, -58, -34, -52, -55, -35, -37, -37, -81, -81, -89, 3, -112, -80, -75, -79, -80, -58, -85};
    }

    static {
        A03();
        A02 = Pattern.compile(A02(52, 16, 114));
        A03 = Pattern.compile(A02(68, 22, 32));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 123))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 61));
    }

    public static long A01(String str) throws NumberFormatException {
        long j3 = 0;
        String[] A0m = IF.A0m(str, A02(50, 2, 16));
        for (String str2 : IF.A0l(A0m[0], A02(1, 1, 56))) {
            long value = Long.parseLong(str2);
            j3 = (60 * j3) + value;
        }
        long j10 = j3 * 1000;
        if (A0m.length == 2) {
            long value2 = Long.parseLong(A0m[1]);
            j10 += value2;
        }
        return 1000 * j10;
    }

    public static void A04(C0651Hz c0651Hz) throws C0591Fp {
        String A0P = c0651Hz.A0P();
        if (A0P != null && A03.matcher(A0P).matches()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        String line = A02(2, 21, 49);
        throw new C0591Fp(sb2.append(line).append(A0P).toString());
    }
}
