package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class TN implements P2 {
    public static byte[] A01;
    public final /* synthetic */ B3 A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public TN(B3 b32) {
        this.A00 = b32;
    }

    @Override // com.meta.analytics.dsp.uinode.P2
    public final void ADY(String str, JSONObject jSONObject) {
        PB pb;
        C1636Yn c1636Yn;
        C1636Yn c1636Yn2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AGY();
            c1636Yn = this.A00.A07;
            if (C1225Ih.A1W(c1636Yn)) {
                c1636Yn2 = this.A00.A07;
                c1636Yn2.A0A().ABG();
            }
        }
        pb = this.A00.A0F;
        pb.A0h(str, jSONObject);
    }
}
