package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1763bT extends KT {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C08070w A00;
    public final /* synthetic */ String A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {Ascii.GS, 41, Ascii.FS, 40, 44, Ascii.FS, 37, Ascii.SUB, 48, Ascii.SYN, Ascii.SUB, Ascii.CAN, 39, 39, 32, 37, Ascii.RS};
        String[] strArr = A03;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A03[5] = "QkfkB";
        A02 = bArr;
    }

    static {
        A02();
    }

    public C1763bT(C08070w c08070w, String str) {
        this.A00 = c08070w;
        this.A01 = str;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C09647f c09647f;
        C09647f c09647f2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C08060v c08060v;
        C08060v c08060v2;
        C08060v c08060v3;
        String A00 = A00(0, 17, 116);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c08060v = this.A00.A02;
                ((C1T) c08060v.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c08060v2 = this.A00.A02;
                c08060v2.A07(this.A01);
                c08060v3 = this.A00.A02;
                c08060v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e4) {
            c09647f2 = this.A00.A03;
            c09647f2.A07().A9a(A00, C8A.A1B, new C8B(e4));
        } catch (JSONException e9) {
            this.A00.A0M();
            c09647f = this.A00.A03;
            c09647f.A07().A9a(A00, C8A.A1A, new C8B(e9));
        }
    }
}
