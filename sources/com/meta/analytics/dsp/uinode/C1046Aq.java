package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Aq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1046Aq extends O7 {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{65, 93, 80, 72};
    }

    public C1046Aq(P3 p32) {
        this.A00 = p32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o82) {
        P2 p2;
        JSONObject A03;
        this.A00.A04 = true;
        p2 = this.A00.A0B;
        A03 = this.A00.A03();
        p2.ADY(A00(0, 4, 62), A03);
    }
}
