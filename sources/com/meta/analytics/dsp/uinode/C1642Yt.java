package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1642Yt extends KT {
    public static byte[] A02;
    public final /* synthetic */ C1641Ys A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A02();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 31);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{117, 87, 85, 94, 83, Ascii.SYN, 80, 87, 95, 90, Ascii.CAN, 77, 111, 109, 102, 107, 46, 125, 123, 109, 109, 107, 125, 125, 32};
    }

    public C1642Yt(C1641Ys c1641Ys, AtomicBoolean atomicBoolean) {
        this.A00 = c1641Ys;
        this.A01 = atomicBoolean;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        C09647f c09647f;
        long j7;
        C09647f c09647f2;
        long j9;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(J9.A0H);
                c09647f2 = this.A00.A02.A04;
                C6V c6v = this.A00.A01;
                int i9 = C09446f.A00;
                String A00 = A00(11, 14, 17);
                j9 = this.A00.A02.A00;
                C09446f.A02(c09647f2, c6v, i9, A00, j9);
                this.A00.A02.A0T();
                this.A00.A00.ABB();
                return;
            }
            this.A00.A02.A0I(J9.A0G);
            c09647f = this.A00.A02.A04;
            C6V c6v2 = this.A00.A01;
            int i10 = C09446f.A04;
            String A002 = A00(0, 11, 41);
            j7 = this.A00.A02.A00;
            C09446f.A02(c09647f, c6v2, i10, A002, j7);
            this.A00.A02.A0U();
            this.A00.A00.AB2();
        }
    }
}
