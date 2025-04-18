package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class TK implements PA {
    public static byte[] A01;
    public static String[] A02 = {"0PGepnyvQncL93SwwJBKfYdUcygiJGu5", "mA1Oa6p2jIMu30EggfbRnzpoMhUl4ssl", "uwNPSbrm", "iNgEEx1gRKfrkJTOWqECaM4K08S9ZrIg", "vqVg9oljZl3AjvyleCGqLOYkhmYrxu", "amhtUlMIP3hZuFCKepG62aSokShv2UYv", "BTFyXEOVMEP0nOw0jY0q9zOCSLZ2OeYc", "tcCWg0XVw1JTHEC59N6ZXoklrHSl9wSv"};
    public final /* synthetic */ B0 A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b3 = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
            String[] strArr = A02;
            if (strArr[0].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "WujDwNVbN3bAuExlfya79vhQsxgnNgQM";
            strArr2[5] = "dVRJVduTnq2Mgx4vxcEM2Hhpe9jWwRq5";
            copyOfRange[i13] = b3;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{91, 90, 44, 111, 126, 109, Byte.MAX_VALUE, 100, 105, 104, 87, 69, 66, Byte.MAX_VALUE, 86, 73, 69, 87};
    }

    static {
        A01();
    }

    public TK(B0 b02) {
        this.A00 = b02;
    }

    @Override // com.facebook.ads.redexgen.uinode.PA
    public final void ACl() {
        C1069Ym context = AbstractC03977e.A00();
        if (context != null) {
            context.A07().A9a(A00(10, 8, 19), C8A.A2e, new C8B(A00(0, 10, 63)));
        }
    }
}
