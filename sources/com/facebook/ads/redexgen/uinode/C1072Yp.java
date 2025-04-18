package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Yp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1072Yp implements InterfaceC0878Qz {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C6X A02;
    public final /* synthetic */ C6Y A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{Ascii.CAN, 3, 6, 3, 2, Ascii.SUB, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C1072Yp(C6X c6x, C6Y c6y, long j3, long j10) {
        this.A02 = c6x;
        this.A03 = c6y;
        this.A00 = j3;
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0878Qz
    public final void ABL(boolean z10) {
        C03987f c03987f;
        BlockingQueue blockingQueue;
        C03987f c03987f2;
        Map map;
        C03987f c03987f3;
        c03987f = this.A02.A01.A04;
        if (C03786f.A06(c03987f)) {
            C03776e c03776e = new C03776e(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            c03987f2 = this.A02.A01.A04;
            C03786f.A04(c03987f2, c03776e, z10);
            if (!z10) {
                c03987f3 = this.A02.A01.A04;
                C03786f.A05(c03987f3, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            map = C03756c.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c03776e.A04, c03776e);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0878Qz
    public final void ABT(Throwable th2) {
        C03987f c03987f;
        BlockingQueue blockingQueue;
        C03987f c03987f2;
        c03987f = this.A02.A01.A04;
        if (C03786f.A06(c03987f)) {
            c03987f2 = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String A00 = A00(7, 5, 22);
            String str4 = this.A03.A02;
            String th3 = th2 != null ? th2.toString() : A00(0, 7, 51);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C03786f.A05(c03987f2, str, str2, str3, A00, str4, 2119, th3, null, valueOf, null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
