package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC02631s {
    public static byte[] A00;
    public static String[] A01 = {"kdNZsDbIr2FjUgQ6", "G4tbE8YXKkBHtbRzjHgF1iVs8BhQX3ki", "rgsd1nh14jUfY0oEDkCzVbJlkUwrdBXO", "6d8i19T6TQ9xRiUYh6SOmARBfT83lkdi", "2FsjHYpAfMpiihTdUse", "xtyrzkpFCSmXtl0pVvZtRxgukiiALNOU", "PnjWz3Ubzat8tEiN6RTB47L4MZQANY1H", "IONaBzwOxfylvpW8Ch"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(12) != strArr[5].charAt(12)) {
                break;
            }
            A01[2] = "wyIfRhN1EoOdsBbK5VRzuRP5Lc7uqmgb";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            byte b3 = (byte) ((copyOfRange[i13] - i12) - 100);
            if (A01[0].length() == 15) {
                break;
            }
            String[] strArr2 = A01;
            strArr2[3] = "fUzr4JaNgjTtoWHz8k6HkVts9HpSP1Qi";
            strArr2[1] = "zuQx1GaumRIGoFj6MrcQJkCLkICnzrhi";
            copyOfRange[i13] = b3;
            i13++;
        }
        throw new RuntimeException();
    }

    public static void A01() {
        A00 = new byte[]{-88, -30, -18, -25, -26};
    }

    static {
        A01();
    }

    public static void A02(C1070Yn c1070Yn, AbstractC1173b5 abstractC1173b5, boolean z10, InterfaceC02611q interfaceC02611q) {
        if (!C0659Ih.A1k(c1070Yn)) {
            C03756c c03756c = new C03756c(c1070Yn);
            C02471c A06 = abstractC1173b5.A0x().A0D().A06();
            c03756c.A0d(new JA(abstractC1173b5.A12(), c1070Yn.A09()));
            if (A06 == null) {
                interfaceC02611q.ACZ(AdError.CACHE_ERROR);
                return;
            }
            if (A06.A0J()) {
                interfaceC02611q.ACa();
                if (A01[2].charAt(7) != '1') {
                    throw new RuntimeException();
                }
                A01[0] = "84TqyqDRqUmJCVM8";
                return;
            }
            C6Y c6y = new C6Y(A06.A0E(), abstractC1173b5.A0S(), abstractC1173b5.A0P());
            c6y.A04 = true;
            if (C0659Ih.A1Z(c1070Yn)) {
                c6y.A03 = A00(0, 5, 22);
            }
            switch (C02601p.A00[A06.A09().ordinal()]) {
                case 1:
                case 2:
                    c03756c.A0X(c6y);
                    break;
            }
            c03756c.A0b(new C03736a(abstractC1173b5.A10().A01(), -1, -1, abstractC1173b5.A0S(), abstractC1173b5.A0P()));
            c03756c.A0b(new C03736a(A06.A0D(), -1, -1, abstractC1173b5.A0S(), abstractC1173b5.A0P()));
            c03756c.A0W(new C1160as(c1070Yn, interfaceC02611q, c03756c, A06, z10), new C6V(abstractC1173b5.A0S(), abstractC1173b5.A0P()));
            return;
        }
        interfaceC02611q.ACa();
    }
}
