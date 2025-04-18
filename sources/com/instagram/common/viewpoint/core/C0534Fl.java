package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.List;
import okio.Utf8;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0534Fl extends AbstractC1187cD {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{52, 59, 46, 51, 44, Utf8.REPLACEMENT_BYTE};
    }

    public C0534Fl(List<C1F> list) {
        super(list);
    }

    public static C0534Fl A02(JSONObject jSONObject, C1045Zs c1045Zs) {
        C0534Fl c0534Fl = new C0534Fl(AbstractC1187cD.A08(jSONObject, c1045Zs, new C1183c9()));
        c0534Fl.A1Y(jSONObject);
        c0534Fl.A0u(A03(0, 6, 107));
        return c0534Fl;
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
