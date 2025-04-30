package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ws, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1589Ws implements D6 {
    public static byte[] A03;
    public C4 A00;
    public IB A01;
    public boolean A02;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{90, 75, 75, 87, 82, 88, 90, 79, 82, 84, 85, Ascii.DC4, 67, Ascii.SYN, 72, 88, 79, 94, 8, Ascii.SO};
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A4R(C1217Hz c1217Hz) {
        if (!this.A02) {
            if (this.A01.A05() == C.TIME_UNSET) {
                return;
            }
            this.A00.A5n(Format.A02(null, A00(0, 20, 99), this.A01.A05()));
            this.A02 = true;
        }
        int A04 = c1217Hz.A04();
        this.A00.AFR(c1217Hz, A04);
        this.A00.AFS(this.A01.A04(), 1, A04, 0, null);
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A8q(IB ib, InterfaceC1076Bu interfaceC1076Bu, DC dc) {
        this.A01 = ib;
        dc.A05();
        C4 AGi = interfaceC1076Bu.AGi(dc.A03(), 4);
        this.A00 = AGi;
        AGi.A5n(Format.A0B(dc.A04(), A00(0, 20, 99), null, -1, null));
    }
}
