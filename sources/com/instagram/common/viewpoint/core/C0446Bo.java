package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0446Bo extends AbstractC0852Sd {
    public static byte[] A01;
    public final /* synthetic */ V7 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{38, 57, 52, 53, Utf8.REPLACEMENT_BYTE, 25, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, 21, 38, 53, 62, 36};
    }

    public C0446Bo(V7 v7) {
        this.A00 = v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C9P c9p) {
        MR mr;
        mr = this.A00.A06;
        mr.A4Q(A00(0, 21, 40), c9p);
    }
}
