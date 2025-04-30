package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class UV implements NI {
    public static byte[] A01;
    public final /* synthetic */ UT A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-62, -64, -78, -65, -84, -81, -62, -77, -77, -78, -65, -78, -79, -84, -80, -71, -74, -80, -72, -84, -74, -82, -81, -84, -78, -59, -63, -78, -65, -69, -82, -71, -84, -69, -82, -61, -74, -76, -82, -63, -74, -68, -69};
    }

    public UV(UT ut) {
        this.A00 = ut;
    }

    @Override // com.meta.analytics.dsp.uinode.NI
    public final void AB6() {
        this.A00.A0G();
    }

    @Override // com.meta.analytics.dsp.uinode.NI
    public final void ACR() {
        this.A00.A0H(A00(0, 43, 50));
    }
}
