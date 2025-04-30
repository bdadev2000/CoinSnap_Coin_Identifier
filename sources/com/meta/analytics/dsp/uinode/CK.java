package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CK {
    public static byte[] A09;
    public static String[] A0A = {"WDcyaL9oeoAbLzImXLrrdZNjVRrzcxRy", "ME9PFK50DMSVlKN2bxn", "gAphC5qX8pzOC3bbBnmZFpQJv5fhqgvp", "JPEMy1g84hpaqLtC7n4l8lpeHeJzlyM", "bln1Uon0G", "FjG6mf5q9yXvdNgXZQEHKWlpLPgsZNOr", "dYpTLYsEmL6RycpaLs1UjMTFbai8", "KiONmpfliC6BX3IrEZz"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C1217Hz A06;
    public final C1217Hz A07;
    public final boolean A08;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {109, 98, 121, 120, Ascii.DEL, 84, 104, 99, 126, 101, 96, 43, 102, 126, 120, Ascii.DEL, 43, 105, 110, 43, 58};
        String[] strArr = A0A;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "zNoXMjNr5peo3NkCnCQ1IuM2DM0yQ7k";
        strArr2[6] = "1lOT5Wh9g7SFemsLLNpHXLUAtLi5";
        A09 = bArr;
    }

    static {
        A01();
    }

    public CK(C1217Hz c1217Hz, C1217Hz c1217Hz2, boolean z8) {
        this.A07 = c1217Hz;
        this.A06 = c1217Hz2;
        this.A08 = z8;
        c1217Hz2.A0Y(12);
        this.A05 = c1217Hz2.A0H();
        c1217Hz.A0Y(12);
        this.A04 = c1217Hz.A0H();
        AbstractC1192Ha.A06(c1217Hz.A08() == 1, A00(0, 21, 32));
        this.A00 = -1;
    }

    public final boolean A02() {
        long A0M;
        int i9;
        int i10 = this.A00 + 1;
        this.A00 = i10;
        if (i10 == this.A05) {
            return false;
        }
        if (this.A08) {
            A0M = this.A06.A0N();
        } else {
            A0M = this.A06.A0M();
        }
        this.A02 = A0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i11 = this.A04 - 1;
            this.A04 = i11;
            if (i11 > 0) {
                int A0H = this.A07.A0H();
                if (A0A[5].charAt(17) != 'Q') {
                    throw new RuntimeException();
                }
                A0A[4] = "w3cW";
                i9 = A0H - 1;
            } else {
                i9 = -1;
            }
            this.A03 = i9;
        }
        return true;
    }
}
