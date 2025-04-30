package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1557Vj implements InterfaceC1186Gt {
    public static byte[] A06;
    public final int A00;
    public final InterfaceC1184Gr A01;
    public final InterfaceC1186Gt A02;
    public final InterfaceC1186Gt A03;
    public final HK A04;
    public final HM A05;

    static {
        A02();
    }

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{106, 123, 108, 104, 125, 108, 77, 104, 125, 104, 90, 96, 103, 98};
    }

    public C1557Vj(HK hk, InterfaceC1186Gt interfaceC1186Gt, InterfaceC1186Gt interfaceC1186Gt2, InterfaceC1184Gr interfaceC1184Gr, int i9, HM hm) {
        this.A04 = hk;
        this.A03 = interfaceC1186Gt;
        this.A02 = interfaceC1186Gt2;
        this.A01 = interfaceC1184Gr;
        this.A00 = i9;
        this.A05 = hm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1186Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1558Vk A4X() {
        HK hk = this.A04;
        InterfaceC1187Gu A4X = this.A03.A4X();
        InterfaceC1187Gu A4X2 = this.A02.A4X();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 37));
        }
        return new C1558Vk(hk, A4X, A4X2, null, this.A00, null);
    }
}
