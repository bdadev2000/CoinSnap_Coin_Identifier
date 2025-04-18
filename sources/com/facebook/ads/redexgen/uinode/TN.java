package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class TN implements P2 {
    public static byte[] A01;
    public final /* synthetic */ B3 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public TN(B3 b3) {
        this.A00 = b3;
    }

    @Override // com.facebook.ads.redexgen.uinode.P2
    public final void ADY(String str, JSONObject jSONObject) {
        PB pb2;
        C1070Yn c1070Yn;
        C1070Yn c1070Yn2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AGY();
            c1070Yn = this.A00.A07;
            if (C0659Ih.A1W(c1070Yn)) {
                c1070Yn2 = this.A00.A07;
                c1070Yn2.A0A().ABG();
            }
        }
        pb2 = this.A00.A0F;
        pb2.A0h(str, jSONObject);
    }
}
