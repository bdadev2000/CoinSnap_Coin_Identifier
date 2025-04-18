package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public final class YK implements InterfaceC0455Bx {
    public static byte[] A03;
    public static String[] A04 = {"U7C58G8YSmV9vlVhCcgTL8gvWtK2nUh7", "rchD6g8gaCdJrKaT6cY", "XSKvYVg8u7cslMcARjuzdYWWNQWy1OI3", "RniILupZEOVdpheiJaCIVa", "W6VJBDMDl8t52bAYcLBFhi9ZJeZzY86g", "3lPq75HsPjCWcJf7cN2seevogiCFywP7", "CoUyLte", "KsfhoqpqLoVK0Wmt0M"};
    public static final C0 A05;
    public InterfaceC0457Bz A00;
    public AbstractC0477Ct A01;
    public boolean A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{11, 44, 36, 33, 40, 41, 109, 57, 34, 109, 41, 40, 57, 40, Utf8.REPLACEMENT_BYTE, 32, 36, 35, 40, 109, 47, 36, 57, 62, 57, Utf8.REPLACEMENT_BYTE, 40, 44, 32, 109, 57, 52, 61, 40};
    }

    static {
        A02();
        A05 = new YL();
    }

    public static I4 A00(I4 i4) {
        i4.A0Y(0);
        return i4;
    }

    private boolean A03(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        C0473Cp c0473Cp = new C0473Cp();
        if (!c0473Cp.A03(interfaceC0456By, true) || (c0473Cp.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(c0473Cp.A00, 8);
        I4 i4 = new I4(length);
        interfaceC0456By.AEO(i4.A00, 0, length);
        if (YM.A04(A00(i4))) {
            this.A01 = new YM();
        } else if (YH.A06(A00(i4))) {
            this.A01 = new YH();
        } else {
            if (!YJ.A04(A00(i4))) {
                return false;
            }
            this.A01 = new YJ();
        }
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void A9D(InterfaceC0457Bz interfaceC0457Bz) {
        this.A00 = interfaceC0457Bz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final int AEk(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        if (this.A01 == null) {
            boolean A032 = A03(interfaceC0456By);
            if (A04[3].length() == 2) {
                throw new RuntimeException();
            }
            A04[7] = "Jcv8zuJPcQsh";
            if (A032) {
                interfaceC0456By.AFq();
            } else {
                throw new A0(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            C9 AHA = this.A00.AHA(0, 1);
            this.A00.A5u();
            this.A01.A06(this.A00, AHA);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC0456By, c4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void AG7(long j2, long j3) {
        if (this.A01 != null) {
            AbstractC0477Ct abstractC0477Ct = this.A01;
            if (A04[6].length() == 29) {
                throw new RuntimeException();
            }
            A04[3] = "HMcRS9JjfDSABRlFypQFz8UIf";
            abstractC0477Ct.A05(j2, j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final boolean AGs(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        try {
            return A03(interfaceC0456By);
        } catch (A0 unused) {
            if (A04[6].length() == 29) {
                throw new RuntimeException();
            }
            A04[7] = "Et";
            return false;
        }
    }
}
