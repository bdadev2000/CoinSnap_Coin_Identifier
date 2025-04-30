package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class AX extends AbstractC1413Pu {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.DC4, 32, Ascii.RS, 33, Ascii.GS, Ascii.SYN, 37, Ascii.SYN, Ascii.NAK};
    }

    public AX(P3 p32) {
        this.A00 = p32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        P2 p2;
        SA sa;
        JSONObject A04;
        this.A00.A07();
        p2 = this.A00.A0B;
        P3 p32 = this.A00;
        sa = p32.A0D;
        A04 = p32.A04(sa.getDuration());
        p2.ADY(A00(0, 9, 100), A04);
    }
}
