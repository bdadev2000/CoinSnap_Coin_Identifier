package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1496Sz extends KT {
    public static byte[] A02;
    public final /* synthetic */ C1494Sx A00;
    public final /* synthetic */ AnonymousClass93 A01;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{Ascii.DEL, -78, -93, -93, -94, -81, -90, -85, -92, 93, -90, -85, -95, -94, -93, -90, -85, -90, -79, -94, -87, -74};
    }

    public C1496Sz(C1494Sx c1494Sx, AnonymousClass93 anonymousClass93) {
        this.A00 = c1494Sx;
        this.A01 = anonymousClass93;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        SA sa;
        SA sa2;
        InterfaceC1396Pd interfaceC1396Pd;
        sa = this.A00.A0Z;
        if (sa.getState() == RB.A02) {
            sa2 = this.A00.A0Z;
            if (sa2.getCurrentPositionInMillis() == A00()) {
                interfaceC1396Pd = this.A00.A0X;
                interfaceC1396Pd.ADX(A00(0, 22, 43));
            }
        }
    }
}
