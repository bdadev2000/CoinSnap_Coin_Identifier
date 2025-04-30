package com.meta.analytics.dsp.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XF implements InterfaceC1074Bs {
    public static byte[] A03;
    public static final InterfaceC1077Bv A04;
    public InterfaceC1076Bu A00;
    public AbstractC1093Co A01;
    public boolean A02;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 37);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{108, -121, -113, -110, -117, -118, 70, -102, -107, 70, -118, -117, -102, -117, -104, -109, -113, -108, -117, 70, -120, -113, -102, -103, -102, -104, -117, -121, -109, 70, -102, -97, -106, -117};
    }

    static {
        A02();
        A04 = new XG();
    }

    public static C1217Hz A00(C1217Hz c1217Hz) {
        c1217Hz.A0Y(0);
        return c1217Hz;
    }

    private boolean A03(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        C1089Ck c1089Ck = new C1089Ck();
        if (!c1089Ck.A03(interfaceC1075Bt, true) || (c1089Ck.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c1089Ck.A00, 8);
        C1217Hz c1217Hz = new C1217Hz(length);
        interfaceC1075Bt.ADv(c1217Hz.A00, 0, length);
        if (XH.A04(A00(c1217Hz))) {
            this.A01 = new XH();
        } else if (XC.A06(A00(c1217Hz))) {
            this.A01 = new XC();
        } else {
            if (!XE.A04(A00(c1217Hz))) {
                return false;
            }
            this.A01 = new XE();
        }
        return true;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A00 = interfaceC1076Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final int AEH(InterfaceC1075Bt interfaceC1075Bt, C1079Bz c1079Bz) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC1075Bt)) {
                interfaceC1075Bt.AFM();
            } else {
                throw new C10259v(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            C4 AGi = this.A00.AGi(0, 1);
            this.A00.A5Y();
            this.A01.A06(this.A00, AGi);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC1075Bt, c1079Bz);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void AFh(long j7, long j9) {
        AbstractC1093Co abstractC1093Co = this.A01;
        if (abstractC1093Co != null) {
            abstractC1093Co.A05(j7, j9);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final boolean AGR(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        try {
            return A03(interfaceC1075Bt);
        } catch (C10259v unused) {
            return false;
        }
    }
}
