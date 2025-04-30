package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1765bV extends KT {
    public static byte[] A02;
    public final /* synthetic */ C08070w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, Ascii.DLE, Ascii.DC4, 4, Ascii.SI, 2, Ascii.CAN, 62, 2, 0, 17, 17, 8, Ascii.SI, 6};
    }

    public C1765bV(C08070w c08070w, JSONObject jSONObject) {
        this.A00 = c08070w;
        this.A01 = jSONObject;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C09647f c09647f;
        C09647f c09647f2;
        CountDownLatch countDownLatch;
        C08060v c08060v;
        C08060v c08060v2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c08060v = this.A00.A02;
            synchronized (c08060v) {
                c08060v2 = this.A00.A02;
                c08060v2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e4) {
            c09647f2 = this.A00.A03;
            c09647f2.A07().A9a(A00(0, 17, 116), C8A.A1B, new C8B(e4));
        } catch (JSONException e9) {
            this.A00.A0M();
            c09647f = this.A00.A03;
            c09647f.A07().A9a(A00(0, 17, 116), C8A.A1A, new C8B(e9));
        }
    }
}
