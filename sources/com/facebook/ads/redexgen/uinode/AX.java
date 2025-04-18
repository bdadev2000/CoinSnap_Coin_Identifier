package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class AX extends AbstractC0847Pu {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 77);
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
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        P2 p22;
        SA sa2;
        JSONObject A04;
        this.A00.A07();
        p22 = this.A00.A0B;
        P3 p32 = this.A00;
        sa2 = p32.A0D;
        A04 = p32.A04(sa2.getDuration());
        p22.ADY(A00(0, 9, 100), A04);
    }
}
