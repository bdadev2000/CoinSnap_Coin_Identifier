package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.At, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1049At extends NX {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.DLE, Ascii.DC2, 5, Ascii.DLE, 1, Ascii.DC2, 5, 4};
    }

    public C1049At(P3 p32) {
        this.A00 = p32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C1354Nn c1354Nn) {
        P2 p2;
        JSONObject A03;
        this.A00.A03 = true;
        p2 = this.A00.A0B;
        A03 = this.A00.A03();
        p2.ADY(A00(0, 8, 101), A03);
    }
}
