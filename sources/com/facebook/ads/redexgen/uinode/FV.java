package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FV extends AbstractC1173b5 {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public FV(List<C1G> list) {
        super(list);
    }

    public static FV A02(JSONObject jSONObject, C1070Yn c1070Yn) {
        FV fv = new FV(AbstractC1173b5.A08(jSONObject, c1070Yn, new C1172b4()));
        fv.A16(jSONObject);
        fv.A0b(A03(0, 6, 27));
        return fv;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1F
    public final int A0F() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1F
    public final int A0G() {
        return 0;
    }
}
