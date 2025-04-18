package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1199bV extends KT {
    public static byte[] A02;
    public final /* synthetic */ C02410w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, Ascii.DLE, Ascii.DC4, 4, Ascii.SI, 2, Ascii.CAN, 62, 2, 0, 17, 17, 8, Ascii.SI, 6};
    }

    public C1199bV(C02410w c02410w, JSONObject jSONObject) {
        this.A00 = c02410w;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C03987f c03987f;
        C03987f c03987f2;
        CountDownLatch countDownLatch;
        C02400v c02400v;
        C02400v c02400v2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c02400v = this.A00.A02;
            synchronized (c02400v) {
                c02400v2 = this.A00.A02;
                c02400v2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e2) {
            c03987f2 = this.A00.A03;
            c03987f2.A07().A9a(A00(0, 17, 116), C8A.A1B, new C8B(e2));
        } catch (JSONException e10) {
            this.A00.A0M();
            c03987f = this.A00.A03;
            c03987f.A07().A9a(A00(0, 17, 116), C8A.A1A, new C8B(e10));
        }
    }
}
