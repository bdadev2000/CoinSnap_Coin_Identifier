package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XF implements InterfaceC0508Bs {
    public static byte[] A03;
    public static final InterfaceC0511Bv A04;
    public InterfaceC0510Bu A00;
    public AbstractC0527Co A01;
    public boolean A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 37);
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

    public static C0651Hz A00(C0651Hz c0651Hz) {
        c0651Hz.A0Y(0);
        return c0651Hz;
    }

    private boolean A03(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        C0523Ck c0523Ck = new C0523Ck();
        if (!c0523Ck.A03(interfaceC0509Bt, true) || (c0523Ck.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c0523Ck.A00, 8);
        C0651Hz c0651Hz = new C0651Hz(length);
        interfaceC0509Bt.ADv(c0651Hz.A00, 0, length);
        if (XH.A04(A00(c0651Hz))) {
            this.A01 = new XH();
        } else if (XC.A06(A00(c0651Hz))) {
            this.A01 = new XC();
        } else {
            if (!XE.A04(A00(c0651Hz))) {
                return false;
            }
            this.A01 = new XE();
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final void A8o(InterfaceC0510Bu interfaceC0510Bu) {
        this.A00 = interfaceC0510Bu;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final int AEH(InterfaceC0509Bt interfaceC0509Bt, C0513Bz c0513Bz) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC0509Bt)) {
                interfaceC0509Bt.AFM();
            } else {
                throw new C04599v(A01(0, 34, 1));
            }
        }
        if (!this.A02) {
            C4 AGi = this.A00.AGi(0, 1);
            this.A00.A5Y();
            this.A01.A06(this.A00, AGi);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0509Bt, c0513Bz);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final void AFh(long j3, long j10) {
        AbstractC0527Co abstractC0527Co = this.A01;
        if (abstractC0527Co != null) {
            abstractC0527Co.A05(j3, j10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final boolean AGR(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        try {
            return A03(interfaceC0509Bt);
        } catch (C04599v unused) {
            return false;
        }
    }
}
