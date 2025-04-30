package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FV extends AbstractC1739b5 {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-123, -124, -111, -111, -120, -107};
    }

    public FV(List<C1G> list) {
        super(list);
    }

    public static FV A02(JSONObject jSONObject, C1636Yn c1636Yn) {
        FV fv = new FV(AbstractC1739b5.A08(jSONObject, c1636Yn, new C1738b4()));
        fv.A16(jSONObject);
        fv.A0b(A03(0, 6, 27));
        return fv;
    }

    @Override // com.meta.analytics.dsp.uinode.C1F
    public final int A0F() {
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.C1F
    public final int A0G() {
        return 0;
    }
}
