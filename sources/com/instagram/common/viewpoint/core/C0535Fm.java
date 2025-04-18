package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0535Fm extends AbstractC1187cD implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            byte b2 = (byte) ((copyOfRange[i5] ^ i4) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            copyOfRange[i5] = b2;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A04();
    }

    public C0535Fm(List<C1F> list) {
        super(list);
    }

    public static C0535Fm A02(JSONObject jSONObject, C1045Zs c1045Zs) {
        C0535Fm c0535Fm = new C0535Fm(AbstractC1187cD.A08(jSONObject, c1045Zs, new C1184cA()));
        c0535Fm.A1Y(jSONObject);
        c0535Fm.A0u(A03(0, 12, 9));
        return c0535Fm;
    }

    @Override // com.instagram.common.viewpoint.core.C1E
    public final int A0R() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.C1E
    public final int A0S() {
        return 0;
    }
}
