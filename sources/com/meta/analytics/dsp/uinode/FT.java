package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FT extends AbstractC1739b5 {
    public static byte[] A00 = null;
    public static String[] A01 = {"jMc", "F9KJU5nWCxEJfH1MtrJPQ98rlg2xhqhb", "7jNlYgKw34wypv3TsOCVRM97qni1IFkS", "W5gvHzH3tQhCbbf1Q7sr07NWbFeRHxz0", "QDsxhdyObZs2LD8uuSUlwesP8VUImdt4", "RqkZZA1TQwwc7Sj8gFRGBwQRvCLKOG1p", "3", "FXFS7BhAGvbRYPXLgdilxhgSLH2Ol13Z"};
    public static final long serialVersionUID = 5751287062553772012L;

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[0].length() == 16) {
                throw new RuntimeException();
            }
            A01[0] = "basKOcZiobbMvO07tra14WeVIAzrAzDF";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 105);
            i12++;
        }
    }

    public static void A04() {
        A00 = new byte[]{5, -8, Ascii.VT, 0, Ascii.CR, -4};
    }

    static {
        A04();
    }

    public FT(List<C1G> list) {
        super(list);
    }

    public static FT A02(JSONObject jSONObject, C1636Yn c1636Yn) {
        FT ft = new FT(AbstractC1739b5.A08(jSONObject, c1636Yn, new C1735b1()));
        ft.A16(jSONObject);
        ft.A0b(A03(0, 6, 46));
        return ft;
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
