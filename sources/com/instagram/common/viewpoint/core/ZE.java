package com.instagram.common.viewpoint.core;

import com.android.volley.DefaultRetryPolicy;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ZE implements InterfaceC04049w {
    public static byte[] A0A;
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final X7 A07;
    public final I8 A08;
    public final boolean A09;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 56);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{-73, -6, -8, 5, 5, 6, 11, -73, -7, -4, -73, 3, -4, 10, 10, -73, 11, -1, -8, 5, -73, -44, -28, -9, -24, -24, -25, -12, -56, -15, -12, -46, -18, -29, -5, -28, -29, -27, -19, -61, -24, -10, -25, -12, -44, -25, -28, -9, -24, -24, -25, -12, -49, -11, -82, -63, -78, -78, -79, -66, -110, -69, -66, -100, -72, -83, -59, -82, -83, -81, -73, -103, -65, -1, -13, 10, -44, 7, -8, -8, -9, 4, -33, 5, -54, -58, -53, -97, -46, -61, -61, -62, -49, -86, -48};
    }

    public ZE() {
        this(new X7(true, 65536));
    }

    @Deprecated
    public ZE(X7 x7) {
        this(x7, 15000, 50000, DefaultRetryPolicy.DEFAULT_TIMEOUT_MS, 5000, -1, true);
    }

    @Deprecated
    public ZE(X7 x7, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        this(x7, i2, i3, i4, i5, i6, z2, null);
    }

    @Deprecated
    public ZE(X7 x7, int i2, int i3, int i4, int i5, int i6, boolean z2, I8 i8) {
        String A01 = A01(54, 19, 20);
        String A012 = A01(21, 1, 108);
        A03(i4, 0, A01, A012);
        String A013 = A01(22, 32, 74);
        A03(i5, 0, A013, A012);
        String A014 = A01(84, 11, 37);
        A03(i2, i4, A014, A01);
        A03(i2, i5, A014, A013);
        A03(i3, i2, A01(73, 11, 90), A014);
        this.A07 = x7;
        this.A06 = i2 * 1000;
        this.A05 = i3 * 1000;
        this.A04 = i4 * 1000;
        this.A03 = i5 * 1000;
        this.A02 = i6;
        this.A09 = z2;
        this.A08 = i8;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A00(com.instagram.common.viewpoint.core.ZA[] r4, com.instagram.common.viewpoint.core.C0557Gm r5) {
        /*
            r3 = this;
            r2 = 0
            r1 = 0
        L2:
            int r0 = r4.length
            if (r1 >= r0) goto L19
            com.facebook.ads.redexgen.X.Gl r0 = r5.A00(r1)
            if (r0 == 0) goto L16
            r0 = r4[r1]
            int r0 = r0.A8a()
            int r0 = com.instagram.common.viewpoint.core.IK.A01(r0)
            int r2 = r2 + r0
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.ZE.A00(com.facebook.ads.redexgen.X.ZA[], com.facebook.ads.redexgen.X.Gm):int");
    }

    public static void A03(int i2, int i3, String str, String str2) {
        AbstractC0576Hf.A05(i2 >= i3, str + A01(0, 21, 95) + str2);
    }

    private void A04(boolean z2) {
        this.A00 = 0;
        if (this.A08 != null && this.A01) {
            this.A08.A03(0);
        }
        this.A01 = false;
        if (z2) {
            this.A07.A03();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final X7 A6O() {
        return this.A07;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final long A6T() {
        return 0L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final void ADK() {
        A04(true);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final void ADi() {
        A04(true);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final void ADq(ZA[] zaArr, TrackGroupArray trackGroupArray, C0557Gm c0557Gm) {
        int i2;
        if (this.A02 == -1) {
            i2 = A00(zaArr, c0557Gm);
        } else {
            i2 = this.A02;
        }
        this.A00 = i2;
        this.A07.A04(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final boolean AFs() {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final boolean AGi(long j2, float f2) {
        boolean z2 = true;
        boolean z3 = this.A07.A02() >= this.A00;
        boolean z4 = this.A01;
        long j3 = this.A06;
        if (f2 > 1.0f) {
            j3 = Math.min(IK.A0C(j3, f2), this.A05);
        }
        if (j2 < j3) {
            boolean targetBufferSizeReached = this.A09;
            if (!targetBufferSizeReached && z3) {
                z2 = false;
            }
            this.A01 = z2;
        } else if (j2 > this.A05 || z3) {
            this.A01 = false;
        }
        if (this.A08 != null) {
            boolean targetBufferSizeReached2 = this.A01;
            if (targetBufferSizeReached2 != z4) {
                boolean targetBufferSizeReached3 = this.A01;
                if (targetBufferSizeReached3) {
                    this.A08.A00(0);
                } else {
                    this.A08.A03(0);
                }
            }
        }
        boolean targetBufferSizeReached4 = this.A01;
        return targetBufferSizeReached4;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final boolean AGl(long j2, float f2, boolean z2) {
        long A0D = IK.A0D(j2, f2);
        long j3 = z2 ? this.A03 : this.A04;
        return j3 <= 0 || A0D >= j3 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04049w
    public final void onPrepared() {
        A04(false);
    }
}
