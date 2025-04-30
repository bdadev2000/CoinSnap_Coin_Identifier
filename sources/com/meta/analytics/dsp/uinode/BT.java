package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class BT extends AbstractC1380On {
    public static byte[] A01;
    public final /* synthetic */ UA A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
    }

    public BT(UA ua) {
        this.A00 = ua;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass98 anonymousClass98) {
        MC mc;
        mc = this.A00.A06;
        mc.A44(A00(0, 21, 1), anonymousClass98);
    }
}
