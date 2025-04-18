package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import okio.Utf8;

/* loaded from: assets/audience_network.dex */
public class WH extends AbstractC01790q {
    public static byte[] A01;
    public final /* synthetic */ W7 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, Byte.MAX_VALUE, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, Byte.MAX_VALUE, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 98, Utf8.REPLACEMENT_BYTE};
    }

    public WH(W7 w7) {
        this.A00 = w7;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0B(C1204cU c1204cU) {
        this.A00.A1V(c1204cU);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0C() {
        W6 w6;
        W6 w62;
        w6 = this.A00.A0G;
        if (w6 != null) {
            w62 = this.A00.A0G;
            w62.AB2();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0F(InterfaceC01780p interfaceC01780p) {
        C0530Fh c0530Fh;
        C0530Fh c0530Fh2;
        c0530Fh = this.A00.A0A;
        if (c0530Fh != null) {
            c0530Fh2 = this.A00.A0A;
            c0530Fh2.A0L();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0G(C0625Jg c0625Jg) {
        long j2;
        W6 w6;
        W6 w62;
        C0S A0E = this.A00.A11().A0E();
        j2 = this.A00.A00;
        A0E.A38(C0687Lu.A01(j2), c0625Jg.A03().getErrorCode(), c0625Jg.A04());
        w6 = this.A00.A0G;
        if (w6 != null) {
            w62 = this.A00.A0G;
            w62.ABs(c0625Jg);
        }
    }
}
