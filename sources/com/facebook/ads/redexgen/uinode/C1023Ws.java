package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1023Ws implements D6 {
    public static byte[] A03;
    public C4 A00;
    public IB A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, Ascii.DC4, 67, Ascii.SYN, 72, 88, 79, 94, 8, Ascii.SO};
    }

    @Override // com.facebook.ads.redexgen.uinode.D6
    public final void A4R(C0651Hz c0651Hz) {
        if (!this.A02) {
            if (this.A01.A05() == C.TIME_UNSET) {
                return;
            }
            this.A00.A5n(Format.A02(null, A00(0, 20, 99), this.A01.A05()));
            this.A02 = true;
        }
        int A04 = c0651Hz.A04();
        this.A00.AFR(c0651Hz, A04);
        this.A00.AFS(this.A01.A04(), 1, A04, 0, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.D6
    public final void A8q(IB ib2, InterfaceC0510Bu interfaceC0510Bu, DC dc2) {
        this.A01 = ib2;
        dc2.A05();
        C4 AGi = interfaceC0510Bu.AGi(dc2.A03(), 4);
        this.A00 = AGi;
        AGi.A5n(Format.A0B(dc2.A04(), A00(0, 20, 99), null, -1, null));
    }
}
