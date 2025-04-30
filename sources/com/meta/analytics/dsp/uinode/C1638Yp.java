package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1638Yp implements InterfaceC1444Qz {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6X A02;
    public final /* synthetic */ C6Y A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Ascii.CAN, 3, 6, 3, 2, Ascii.SUB, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C1638Yp(C6X c6x, C6Y c6y, long j7, long j9) {
        this.A02 = c6x;
        this.A03 = c6y;
        this.A00 = j7;
        this.A01 = j9;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1444Qz
    public final void ABL(boolean z8) {
        C09647f c09647f;
        BlockingQueue blockingQueue;
        C09647f c09647f2;
        Map map;
        C09647f c09647f3;
        c09647f = this.A02.A01.A04;
        if (C09446f.A06(c09647f)) {
            C09436e c09436e = new C09436e(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            c09647f2 = this.A02.A01.A04;
            C09446f.A04(c09647f2, c09436e, z8);
            if (!z8) {
                c09647f3 = this.A02.A01.A04;
                C09446f.A05(c09647f3, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            map = C09416c.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c09436e.A04, c09436e);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1444Qz
    public final void ABT(Throwable th) {
        C09647f c09647f;
        BlockingQueue blockingQueue;
        C09647f c09647f2;
        c09647f = this.A02.A01.A04;
        if (C09446f.A06(c09647f)) {
            c09647f2 = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String A00 = A00(7, 5, 22);
            String str4 = this.A03.A02;
            String th2 = th != null ? th.toString() : A00(0, 7, 51);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C09446f.A05(c09647f2, str, str2, str3, A00, str4, 2119, th2, null, valueOf, null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
