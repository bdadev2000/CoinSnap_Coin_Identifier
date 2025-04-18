package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.cL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1195cL extends AbstractC01800r {
    public static byte[] A06;
    public static final String A07;
    public C1197cN A00;
    public EnumC0627Jj A01;
    public boolean A02;
    public final C1045Zs A03;
    public final J7 A04;
    public final AbstractC0743Ny A05;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C1195cL.class.getSimpleName();
    }

    public C1195cL(C1045Zs c1045Zs, J7 j7, AbstractC0743Ny abstractC0743Ny, C0833Rk c0833Rk, AbstractC01810s abstractC01810s, EnumC0627Jj enumC0627Jj) {
        super(c1045Zs, abstractC01810s, c0833Rk);
        this.A04 = j7;
        this.A05 = abstractC0743Ny;
        this.A03 = c1045Zs;
        this.A01 = enumC0627Jj;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01800r
    public final void A06(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A6r())) {
            this.A03.A0E().A36();
            C2M.A02(this.A00.A05(), AbstractC0671Le.A00(A04(0, 6, 50)));
            this.A04.AA6(this.A00.A6r(), map);
            if (C0608Im.A14(this.A03)) {
                if (this.A01 == EnumC0627Jj.A09) {
                    adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = AdPlacementType.BANNER.toString();
                }
                C0651Kh A00 = C0651Kh.A00(this.A03);
                String placementType = this.A00.A6r();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A07() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                ExecutorC0690Lx.A00(new C1196cM(this));
            }
        }
    }

    public final void A08(C1197cN c1197cN) {
        this.A00 = c1197cN;
    }
}
