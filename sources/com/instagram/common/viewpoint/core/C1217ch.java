package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1217ch extends KY {
    public static byte[] A02;
    public final /* synthetic */ C01850w A00;
    public final /* synthetic */ String A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C1217ch(C01850w c01850w, String str) {
        this.A00 = c01850w;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C7j c7j;
        C7j c7j2;
        CountDownLatch countDownLatch;
        C01840v c01840v;
        C01840v c01840v2;
        C01840v c01840v3;
        boolean A0J;
        C01840v c01840v4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c01840v = this.A00.A02;
            synchronized (c01840v) {
                c01840v2 = this.A00.A02;
                Iterator<String> keys = c01840v2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    A0J = this.A00.A0J(this.A01);
                    if (A0J) {
                        C01850w c01850w = this.A00;
                        c01840v4 = this.A00.A02;
                        c01850w.A0E((C1S) c01840v4.A05().get(next), next, next.equals(this.A01));
                    }
                }
                c01840v3 = this.A00.A02;
                c01840v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c7j2 = this.A00.A03;
            C8D A07 = c7j2.A07();
            String encryptedId = A00(0, 17, 22);
            A07.AA0(encryptedId, C8E.A1B, new C8F(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c7j = this.A00.A03;
            C8D A072 = c7j.A07();
            String encryptedId2 = A00(0, 17, 22);
            A072.AA0(encryptedId2, C8E.A1A, new C8F(e2));
        }
    }
}
