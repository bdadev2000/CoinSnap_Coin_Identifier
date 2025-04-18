package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1076Yt extends KT {
    public static byte[] A02;
    public final /* synthetic */ C1075Ys A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, Ascii.SYN, 80, 87, 95, 90, Ascii.CAN, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C1076Yt(C1075Ys c1075Ys, AtomicBoolean atomicBoolean) {
        this.A00 = c1075Ys;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C03987f c03987f;
        long j3;
        C03987f c03987f2;
        long j10;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(J9.A0H);
                c03987f2 = this.A00.A02.A04;
                C6V c6v = this.A00.A01;
                int i10 = C03786f.A00;
                String A00 = A00(11, 14, 17);
                j10 = this.A00.A02.A00;
                C03786f.A02(c03987f2, c6v, i10, A00, j10);
                this.A00.A02.A0T();
                this.A00.A00.ABB();
                return;
            }
            this.A00.A02.A0I(J9.A0G);
            c03987f = this.A00.A02.A04;
            C6V c6v2 = this.A00.A01;
            int i11 = C03786f.A04;
            String A002 = A00(0, 11, 41);
            j3 = this.A00.A02.A00;
            C03786f.A02(c03987f, c6v2, i11, A002, j3);
            this.A00.A02.A0U();
            this.A00.A00.AB2();
        }
    }
}
