package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1216cg extends KY {
    public static byte[] A02;
    public final /* synthetic */ C01850w A00;
    public final /* synthetic */ String A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{36, 48, 39, 51, 55, 39, 44, 33, 59, 29, 33, 35, 50, 50, 43, 44, 37};
    }

    public C1216cg(C01850w c01850w, String str) {
        this.A00 = c01850w;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C7j c7j;
        C7j c7j2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C01840v c01840v;
        C01840v c01840v2;
        C01840v c01840v3;
        String A00 = A00(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c01840v = this.A00.A02;
                ((C1S) c01840v.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c01840v2 = this.A00.A02;
                c01840v2.A07(this.A01);
                c01840v3 = this.A00.A02;
                c01840v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c7j2 = this.A00.A03;
            c7j2.A07().AA0(A00, C8E.A1B, new C8F(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7j = this.A00.A03;
            c7j.A07().AA0(A00, C8E.A1A, new C8F(e2));
        }
    }
}
