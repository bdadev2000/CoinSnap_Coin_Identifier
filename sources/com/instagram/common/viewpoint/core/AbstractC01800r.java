package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0r, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC01800r {
    public static byte[] A04;
    public boolean A00;
    public final AbstractC01810s A01;
    public final C1045Zs A02;
    public final C0833Rk A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, 26, 40, 40, 30, 36, 35, -43, 33, 36, 28, 28, 26, 25};
    }

    public abstract void A06(Map<String, String> map);

    public AbstractC01800r(C1045Zs c1045Zs, AbstractC01810s abstractC01810s, C0833Rk c0833Rk) {
        this.A02 = c1045Zs;
        this.A01 = abstractC01810s;
        this.A03 = c0833Rk;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new O8().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        LC.A04(this.A02, A00(0, 17, 60));
        AbstractC01810s abstractC01810s = this.A01;
    }
}
