package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y8 implements InterfaceC1208Hq {
    public static byte[] A04;
    public static String[] A05 = {"Xobc5aSRFsnlTfq950Hm2L3uP2yqTx5R", "l", "qpzLH3olNTSgnmEJfqgMoILAygrv9Gvu", "rA2kHVtwjUdxF3LXQtoL786BdYvsVYLD", "0rBDFyThd5IBv1Jp4I3rS", "drj1vvUtkoX3RGiyI02l8il3i3aSfPCy", "cZlTLMFk7RrLemAAhuy1ARzIYrj9DMLk", "NSM"};
    public Y5 A00;
    public InterfaceC1208Hq A01;
    public final C9Z A02;
    public final C1552Ve A03;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-84, -44, -53, -45, -56, -49, -53, -60, Ascii.DEL, -47, -60, -51, -61, -60, -47, -60, -47, Ascii.DEL, -52, -60, -61, -56, -64, Ascii.DEL, -62, -53, -50, -62, -54, -46, Ascii.DEL, -60, -51, -64, -63, -53, -60, -61, -115};
    }

    static {
        A02();
    }

    public Y8(C9Z c9z, InterfaceC1195Hd interfaceC1195Hd) {
        this.A02 = c9z;
        this.A03 = new C1552Ve(interfaceC1195Hd);
    }

    private void A01() {
        this.A03.A02(this.A01.A7k());
        C10279x A7h = this.A01.A7h();
        if (!A7h.equals(this.A03.A7h())) {
            this.A03.AGA(A7h);
            this.A02.ACb(A7h);
        }
    }

    private boolean A03() {
        Y5 y52 = this.A00;
        if (y52 != null && !y52.A91()) {
            boolean A9C = this.A00.A9C();
            if (A05[1].length() == 23) {
                throw new RuntimeException();
            }
            A05[1] = "Da4vHoBMew1xMnwVwhw0NxQudcM";
            if (A9C || !this.A00.A8a()) {
                return true;
            }
        }
        return false;
    }

    public final long A04() {
        if (A03()) {
            A01();
            long A7k = this.A01.A7k();
            if (A05[7].length() == 18) {
                throw new RuntimeException();
            }
            A05[7] = "L098bBK7xK";
            return A7k;
        }
        return this.A03.A7k();
    }

    public final void A05() {
        this.A03.A00();
    }

    public final void A06() {
        this.A03.A01();
    }

    public final void A07(long j7) {
        this.A03.A02(j7);
    }

    public final void A08(Y5 y52) {
        if (y52 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(Y5 y52) throws C10079c {
        InterfaceC1208Hq A7N = y52.A7N();
        if (A7N != null) {
            InterfaceC1208Hq interfaceC1208Hq = this.A01;
            if (A05[0].charAt(12) != 'T') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "G6KpX7Ur5Z0x6RCw4xSrHpY3l6NonZ5O";
            strArr[3] = "DkiI2Rz4cuYvxyrSRslfvXTI6PdAzLXl";
            if (A7N != interfaceC1208Hq) {
                if (interfaceC1208Hq == null) {
                    this.A01 = A7N;
                    this.A00 = y52;
                    InterfaceC1208Hq rendererMediaClock = this.A03;
                    A7N.AGA(rendererMediaClock.A7h());
                    A01();
                    return;
                }
                throw C10079c.A02(new IllegalStateException(A00(0, 39, 31)));
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1208Hq
    public final C10279x A7h() {
        InterfaceC1208Hq interfaceC1208Hq = this.A01;
        if (interfaceC1208Hq != null) {
            return interfaceC1208Hq.A7h();
        }
        return this.A03.A7h();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1208Hq
    public final long A7k() {
        if (A03()) {
            return this.A01.A7k();
        }
        return this.A03.A7k();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1208Hq
    public final C10279x AGA(C10279x c10279x) {
        InterfaceC1208Hq interfaceC1208Hq = this.A01;
        if (interfaceC1208Hq != null) {
            c10279x = interfaceC1208Hq.AGA(c10279x);
        }
        this.A03.AGA(c10279x);
        this.A02.ACb(c10279x);
        return c10279x;
    }
}
