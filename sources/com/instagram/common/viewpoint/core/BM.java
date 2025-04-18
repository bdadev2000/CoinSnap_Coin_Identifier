package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class BM extends R9 {
    public static byte[] A01;
    public final /* synthetic */ PT A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{53, 55, 42, 53, 38, 55, 42, 41};
    }

    public BM(PT pt) {
        this.A00 = pt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C0829Rg c0829Rg) {
        PS ps;
        JSONObject A03;
        this.A00.A03 = true;
        ps = this.A00.A0B;
        A03 = this.A00.A03();
        ps.AE1(A00(0, 8, 73), A03);
    }
}
