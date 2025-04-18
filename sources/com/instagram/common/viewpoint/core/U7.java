package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class U7 extends AbstractC0832Rj {
    public static byte[] A01;
    public final /* synthetic */ U6 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public U7(U6 u6) {
        this.A00 = u6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0832Rj
    public final void A03() {
        int i2;
        boolean z2;
        boolean z3;
        if (!this.A00.A09.A07()) {
            this.A00.A09.A05();
            if (!TextUtils.isEmpty(this.A00.A05.A1U())) {
                Map<String, String> A05 = new O8().A03(this.A00.A0C).A02(this.A00.A09).A04(this.A00.A05.A0b()).A05();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 96));
                i2 = this.A00.A01;
                A05.put(A00(0, 16, 42), append.append(i2).toString());
                this.A00.A07.AA6(this.A00.A05.A1U(), A05);
                C0651Kh.A00(this.A00.A06).A0E(this.A00.A0B.A83(), this.A00.A05.A1U());
                C1T.A07(this.A00.A05.A1Q(), this.A00.A06);
                this.A00.A06.A0E().A36();
                z2 = this.A00.A03;
                if (!z2) {
                    C2M.A02(this.A00.A05.A0a(), AbstractC0671Le.A00(this.A00.A05.A0c()));
                }
                z3 = this.A00.A04;
                if (!z3) {
                    this.A00.A0A.A4P(this.A00.A0B.A7Z());
                }
            }
        }
    }
}
