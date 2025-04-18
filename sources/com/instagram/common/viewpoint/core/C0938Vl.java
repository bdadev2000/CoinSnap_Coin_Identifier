package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0938Vl implements InterfaceC0676Lj {
    public static byte[] A03;
    public int A00;
    public String A01;
    public final InterfaceC0676Lj A02;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public C0938Vl(InterfaceC0676Lj interfaceC0676Lj) {
        this.A02 = interfaceC0676Lj;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AEb(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void AEb(String str) {
        boolean A0A;
        String A04;
        A0A = AbstractC0678Ll.A0A(str);
        if (!A0A) {
            A04 = AbstractC0678Ll.A04(str);
            String filtered = this.A01;
            if (A04.equals(filtered)) {
                this.A00++;
                return;
            }
            A01();
            this.A01 = A04;
            this.A00 = 1;
            return;
        }
        A01();
        this.A02.AEb(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0676Lj
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
