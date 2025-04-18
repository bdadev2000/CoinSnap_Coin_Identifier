package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1197bT extends KT {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C02410w A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 67);
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

    public C1197bT(C02410w c02410w, String str) {
        this.A00 = c02410w;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C03987f c03987f;
        C03987f c03987f2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C02400v c02400v;
        C02400v c02400v2;
        C02400v c02400v3;
        String A00 = A00(0, 17, 116);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c02400v = this.A00.A02;
                ((C1T) c02400v.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c02400v2 = this.A00.A02;
                c02400v2.A07(this.A01);
                c02400v3 = this.A00.A02;
                c02400v3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e2) {
            c03987f2 = this.A00.A03;
            c03987f2.A07().A9a(A00, C8A.A1B, new C8B(e2));
        } catch (JSONException e10) {
            this.A00.A0M();
            c03987f = this.A00.A03;
            c03987f.A07().A9a(A00, C8A.A1A, new C8B(e10));
        }
    }
}
