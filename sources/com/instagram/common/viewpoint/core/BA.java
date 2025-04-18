package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class BA extends AbstractC0858Sj {
    public static byte[] A01;
    public final /* synthetic */ PT A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{107, 103, 101, 120, 100, 109, 124, 109, 108};
    }

    public BA(PT pt) {
        this.A00 = pt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C9R c9r) {
        PS ps;
        T7 t7;
        JSONObject A04;
        this.A00.A07();
        ps = this.A00.A0B;
        PT pt = this.A00;
        t7 = this.A00.A0D;
        A04 = pt.A04(t7.getDuration());
        ps.AE1(A00(0, 9, 87), A04);
    }
}
