package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Jj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC0627Jj implements Serializable {
    A05(320, 50),
    A08(0, 0),
    A06(-1, 50),
    A07(-1, 90),
    A09(-1, 250);

    public static byte[] A02 = null;
    public static String[] A03 = {"Tf0gzpE1z0DOygMknAScYVGYgxUCN6If", "OJWxv0TW5miQ3Kn", "GlLNElMoCA8", "Xgk0OdYHTIXe2Q1HA3YZKPRbdeS7oU4D", "PHyDcqcelsxe2C8hrB0OPMJ92C1p28xb", "tjympuwDZEvmjp4dt80fu9pzZi", "KXSmHfhq6DtFyO2I4KCsZ7pXn2h8CepA", "nIUh7sEtDWkIx81Fpy5uA9wFEXEhOC2B"};
    public static final long serialVersionUID = 42;
    public final int A00;
    public final int A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[4].charAt(1) == 'S') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "VIfYmPrZv6LGyPijtMThbF852HrrLBlI";
            strArr[6] = "4hX5Bu6XJriXyO1ylOVNaDjvP68bIemq";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 68);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{15, 12, 3, 3, 8, 31, 18, 126, Byte.MAX_VALUE, 125, 18, 120, 125, 49, 50, 61, 61, 54, 33, 44, 59, 54, 58, 52, 59, 39, 44, 70, 67, 61, 62, 49, 49, 58, 45, 32, 55, 58, 54, 56, 55, 43, 32, 70, 79, 97, 102, 124, 109, 122, 123, 124, 97, 124, 97, 105, 100, 36, 51, 53, 34, 55, 56, 49, 58, 51, 41, 62, 51, Utf8.REPLACEMENT_BYTE, 49, 62, 34, 41, 68, 67, 70};
    }

    static {
        A01();
    }

    EnumC0627Jj(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    public final int A03() {
        return this.A00;
    }

    public final int A04() {
        return this.A01;
    }
}
