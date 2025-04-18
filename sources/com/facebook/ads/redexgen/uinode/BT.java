package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class BT extends AbstractC0814On {
    public static byte[] A01;
    public final /* synthetic */ UA A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{72, 87, 90, 91, 81, 119, 80, 74, 91, 76, 77, 74, 87, 74, 95, 82, 123, 72, 91, 80, 74};
    }

    public BT(UA ua2) {
        this.A00 = ua2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(AnonymousClass98 anonymousClass98) {
        MC mc2;
        mc2 = this.A00.A06;
        mc2.A44(A00(0, 21, 1), anonymousClass98);
    }
}
