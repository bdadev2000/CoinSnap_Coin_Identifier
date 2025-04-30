package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1549Vb implements InterfaceC1456Rl {
    public static byte[] A02;
    public final /* synthetic */ C1635Ym A00;
    public final /* synthetic */ InterfaceC1454Rj A01;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C1549Vb(InterfaceC1454Rj interfaceC1454Rj, C1635Ym c1635Ym) {
        this.A01 = interfaceC1454Rj;
        this.A00 = c1635Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1456Rl
    public final void A45() {
        try {
            C1225Ih.A0R(this.A00).A2Y(this.A01.A6h().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e4) {
            this.A00.A07().A3c(e4);
        }
    }
}
