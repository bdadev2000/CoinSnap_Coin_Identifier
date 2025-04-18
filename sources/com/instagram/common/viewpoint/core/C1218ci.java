package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1218ci extends KY {
    public static byte[] A02;
    public final /* synthetic */ C01850w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 97, 118, 98, 102, 118, 125, 112, 106, 76, 112, 114, 99, 99, 122, 125, 116};
    }

    public C1218ci(C01850w c01850w, JSONObject jSONObject) {
        this.A00 = c01850w;
        this.A01 = jSONObject;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C7j c7j;
        C7j c7j2;
        CountDownLatch countDownLatch;
        C01840v c01840v;
        C01840v c01840v2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c01840v = this.A00.A02;
            synchronized (c01840v) {
                c01840v2 = this.A00.A02;
                c01840v2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e) {
            c7j2 = this.A00.A03;
            c7j2.A07().AA0(A00(0, 17, 25), C8E.A1B, new C8F(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7j = this.A00.A03;
            c7j.A07().AA0(A00(0, 17, 25), C8E.A1A, new C8F(e2));
        }
    }
}
