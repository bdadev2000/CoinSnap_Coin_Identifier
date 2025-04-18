package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0991Vj implements InterfaceC0620Gt {
    public static byte[] A06;
    public final int A00;
    public final InterfaceC0618Gr A01;
    public final InterfaceC0620Gt A02;
    public final InterfaceC0620Gt A03;
    public final HK A04;
    public final HM A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{106, 123, 108, 104, 125, 108, 77, 104, 125, 104, 90, 96, 103, 98};
    }

    public C0991Vj(HK hk, InterfaceC0620Gt interfaceC0620Gt, InterfaceC0620Gt interfaceC0620Gt2, InterfaceC0618Gr interfaceC0618Gr, int i10, HM hm) {
        this.A04 = hk;
        this.A03 = interfaceC0620Gt;
        this.A02 = interfaceC0620Gt2;
        this.A01 = interfaceC0618Gr;
        this.A00 = i10;
        this.A05 = hm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0620Gt
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0992Vk A4X() {
        HK hk = this.A04;
        InterfaceC0621Gu A4X = this.A03.A4X();
        InterfaceC0621Gu A4X2 = this.A02.A4X();
        if (0 != 0) {
            throw new NullPointerException(A01(0, 14, 37));
        }
        return new C0992Vk(hk, A4X, A4X2, null, this.A00, null);
    }
}
