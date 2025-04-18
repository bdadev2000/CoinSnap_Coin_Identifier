package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0983Vb implements InterfaceC0890Rl {
    public static byte[] A02;
    public final /* synthetic */ C1069Ym A00;
    public final /* synthetic */ InterfaceC0888Rj A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C0983Vb(InterfaceC0888Rj interfaceC0888Rj, C1069Ym c1069Ym) {
        this.A01 = interfaceC0888Rj;
        this.A00 = c1069Ym;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0890Rl
    public final void A45() {
        try {
            C0659Ih.A0R(this.A00).A2Y(this.A01.A6h().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e2) {
            this.A00.A07().A3c(e2);
        }
    }
}
