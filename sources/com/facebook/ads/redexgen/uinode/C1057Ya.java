package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1057Ya extends KT {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1069Ym A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{91, 108, 99, 40, 123, 125, 107, 107, 109, 123, 123, 110, 125, 100, 100, 113, 40, 97, 102, 97, 124, 97, 105, 100, 97, 114, 109, 108, 41};
    }

    public C1057Ya(C1069Ym c1069Ym, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1069Ym;
        this.A00 = initListener;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        try {
            YL.A02().A0C(this.A01);
        } catch (Throwable th2) {
            this.A01.A07().A3c(th2);
        }
        C8Y.A0C(this.A01);
        AudienceNetworkAds.InitListener initListener = this.A00;
        if (initListener != null) {
            C8Y.A04(initListener, new C8X(true, A00(0, 29, 0)));
        }
    }
}
