package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1194cK extends AbstractC01800r {
    public static byte[] A02;
    public final C1192cI A00;
    public final J7 A01;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 69, 74, 74, 65, 86};
    }

    public C1194cK(C1045Zs c1045Zs, AbstractC01810s abstractC01810s, C0833Rk c0833Rk, J7 j7, C1192cI c1192cI) {
        super(c1045Zs, abstractC01810s, c0833Rk);
        this.A01 = j7;
        this.A00 = c1192cI;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01800r
    public final void A06(Map<String, String> map) {
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A6r())) {
            this.A02.A0E().A36();
            C2M.A02(this.A00.A0X(), AbstractC0671Le.A00(A01(0, 6, 62)));
            this.A01.AA6(this.A00.A6r(), map);
            if (C0608Im.A14(this.A02)) {
                String adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                C0651Kh A00 = C0651Kh.A00(this.A02);
                String placementType = this.A00.A6r();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }
}
