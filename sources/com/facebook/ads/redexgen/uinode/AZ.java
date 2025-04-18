package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class AZ extends AbstractC0814On {
    public static byte[] A01;
    public final /* synthetic */ P3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.FS, Ascii.CR, Ascii.EM, Ascii.US, 9};
    }

    public AZ(P3 p32) {
        this.A00 = p32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass98 anonymousClass98) {
        P2 p22;
        JSONObject A03;
        p22 = this.A00.A0B;
        A03 = this.A00.A03();
        p22.ADY(A00(0, 5, 49), A03);
    }
}
