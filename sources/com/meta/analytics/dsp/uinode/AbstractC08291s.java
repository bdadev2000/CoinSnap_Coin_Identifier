package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC08291s {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            byte b = (byte) ((copyOfRange[i12] - i11) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            copyOfRange[i12] = b;
            i12++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C1636Yn c1636Yn, AbstractC1739b5 abstractC1739b5, boolean z8, InterfaceC08271q interfaceC08271q) {
        if (!C1225Ih.A1k(c1636Yn)) {
            C09416c c09416c = new C09416c(c1636Yn);
            C08131c A06 = abstractC1739b5.A0x().A0D().A06();
            c09416c.A0d(new JA(abstractC1739b5.A12(), c1636Yn.A09()));
            if (A06 == null) {
                interfaceC08271q.ACZ(AdError.CACHE_ERROR);
                return;
            }
            if (A06.A0J()) {
                interfaceC08271q.ACa();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C6Y c6y = new C6Y(A06.A0E(), abstractC1739b5.A0S(), abstractC1739b5.A0P());
            c6y.A04 = true;
            if (C1225Ih.A1Z(c1636Yn)) {
                c6y.A03 = A00(0, 5, 22);
            }
            switch (C08261p.A00[A06.A09().ordinal()]) {
                case 1:
                case 2:
                    c09416c.A0X(c6y);
                    break;
            }
            c09416c.A0b(new C09396a(abstractC1739b5.A10().A01(), -1, -1, abstractC1739b5.A0S(), abstractC1739b5.A0P()));
            c09416c.A0b(new C09396a(A06.A0D(), -1, -1, abstractC1739b5.A0S(), abstractC1739b5.A0P()));
            c09416c.A0W(new C1726as(c1636Yn, interfaceC08271q, c09416c, A06, z8), new C6V(abstractC1739b5.A0S(), abstractC1739b5.A0P()));
            return;
        }
        interfaceC08271q.ACa();
    }
}
