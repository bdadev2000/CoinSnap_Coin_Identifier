package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0527Fe extends AbstractC1168bu {
    public static byte[] A00;
    public static String[] A01 = {"vV6RQP0QGAizSnvHrhrEiTJKYqnkk7vR", "gVueu7WJkm8gI", "", "raAPQvYZN3qaAVuN8G4E0NVfm2Y0LRUe", "w5hc", "", "RHGb3VvP2c2qxldOqnFEpaAIYmVmOJg8", "ZdfM9COnhESAyQW1NqvAdN1Ku5n51qre"};

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-43, -45, -32, -110, -31, -32, -34, -21, -110, -27, -41, -26, -110, -31, -32, -110, -28, -41, -23, -45, -28, -42, -41, -42, -110, -24, -37, -42, -41, -31, -110, -45, -42, -27, -80, -79, 98, -93, -90, -93, -78, -74, -89, -76, 98, -76, -89, -93, -90, -69, 98, -74, -79, 98, -75, -89, -74, 98, -76, -89, -71, -93, -76, -90, 98, -79, -80};
    }

    static {
        A02();
    }

    public C0527Fe(C1045Zs c1045Zs, C02081t c02081t) {
        super(c1045Zs, c02081t);
    }

    private C1160bm A00(Runnable runnable) {
        return new C1160bm(this, runnable);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final void A0O() {
        AbstractC1191cH abstractC1191cH = (AbstractC1191cH) this.A01;
        abstractC1191cH.A00(this.A08.A00);
        abstractC1191cH.A01(this.A08.A01);
        abstractC1191cH.A0I();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1168bu
    public final void A0Q(InterfaceC01780p interfaceC01780p, C8W c8w, C8U c8u, C02091u c02091u) {
        C0538Fq c0538Fq = (C0538Fq) interfaceC01780p;
        C1161bn c1161bn = new C1161bn(this, c02091u, c0538Fq);
        if (C0608Im.A2S(this.A0B)) {
            Handler A0G = A0G();
            C8X A05 = c8w.A05();
            String[] strArr = A01;
            if (strArr[3].charAt(31) != strArr[7].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "";
            strArr2[2] = "";
            A0G.postDelayed(c1161bn, A05.A05());
        }
        c0538Fq.A0J(this.A0B, A00(c1161bn), c02091u, this.A08.A06, this.A08.A04, this.A08.A05);
    }

    public final void A0Z(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A82() == AdPlacementType.REWARDED_VIDEO) {
                AbstractC1191cH rewardedVideoAdapter = (AbstractC1191cH) this.A01;
                rewardedVideoAdapter.A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 82));
        }
        throw new IllegalStateException(A01(34, 33, 34));
    }
}
