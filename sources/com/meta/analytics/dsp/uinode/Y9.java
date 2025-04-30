package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y9 implements InterfaceC10219r {
    public static byte[] A0A;
    public static String[] A0B = {"QBw2naITCC87BBmeZEHB", "QG9qcoN67OZ9HCiBeCwQ37yZ8k9VzRIx", "huClURZcVSvs210svchTpygB", "SPjUxwmyMxCkovVHB3ukUPObWP0MyL9L", "Qo3gDbJmZiOUOvD4YrLGADsp8gVNY68y", "aCbITSFANaeoynFt6tlPTZT3Ud0BkJzi", "LC42BZreN0Trrj0tndAjNl8pur2kDdxK", "yIqlj0SUGgDzqSotNJk32MbE6gj6YGfF"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final W2 A07;
    public final I3 A08;
    public final boolean A09;

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{-97, -30, -32, -19, -19, -18, -13, -97, -31, -28, -97, -21, -28, -14, -14, -97, -13, -25, -32, -19, -97, -55, -27, -8, -23, -23, -24, -11, -55, -14, -11, -45, -17, -28, -4, -27, -28, -26, -18, -60, -23, -9, -24, -11, -43, -24, -27, -8, -23, -23, -24, -11, -48, -10, 3, Ascii.SYN, 7, 7, 6, 19, -25, Ascii.DLE, 19, -15, Ascii.CR, 2, Ascii.SUB, 3, 2, 4, Ascii.FF, -18, Ascii.DC4, Ascii.EM, Ascii.CR, 36, -18, 33, Ascii.DC2, Ascii.DC2, 17, Ascii.RS, -7, Ascii.US, -64, -68, -63, -107, -56, -71, -71, -72, -59, -96, -58};
    }

    static {
        A02();
    }

    public Y9() {
        this(new W2(true, 65536));
    }

    @Deprecated
    public Y9(W2 w2) {
        this(w2, DefaultLoadControl.DEFAULT_MIN_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, true);
    }

    @Deprecated
    public Y9(W2 w2, int i9, int i10, int i11, int i12, int i13, boolean z8) {
        this(w2, i9, i10, i11, i12, i13, z8, null);
    }

    @Deprecated
    public Y9(W2 w2, int i9, int i10, int i11, int i12, int i13, boolean z8, I3 i32) {
        String A01 = A01(54, 19, 78);
        String A012 = A01(21, 1, 70);
        A03(i11, 0, A01, A012);
        String A013 = A01(22, 32, 48);
        A03(i12, 0, A013, A012);
        String A014 = A01(84, 11, 0);
        A03(i9, i11, A014, A01);
        A03(i9, i12, A014, A013);
        A03(i10, i9, A01(73, 11, 89), A014);
        this.A07 = w2;
        this.A06 = i9 * 1000;
        this.A05 = i10 * 1000;
        this.A04 = i11 * 1000;
        this.A03 = i12 * 1000;
        this.A02 = i13;
        this.A09 = z8;
        this.A08 = i32;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A00(com.meta.analytics.dsp.uinode.Y5[] r4, com.meta.analytics.dsp.uinode.C1174Gh r5) {
        /*
            r3 = this;
            r2 = 0
            r1 = 0
        L2:
            int r0 = r4.length
            if (r1 >= r0) goto L19
            com.facebook.ads.redexgen.X.Gg r0 = r5.A00(r1)
            if (r0 == 0) goto L16
            r0 = r4[r1]
            int r0 = r0.A8C()
            int r0 = com.meta.analytics.dsp.uinode.IF.A01(r0)
            int r2 = r2 + r0
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.Y9.A00(com.facebook.ads.redexgen.X.Y5[], com.facebook.ads.redexgen.X.Gh):int");
    }

    public static void A03(int i9, int i10, String str, String str2) {
        AbstractC1192Ha.A05(i9 >= i10, str + A01(0, 21, 44) + str2);
    }

    private void A04(boolean z8) {
        this.A00 = 0;
        I3 i32 = this.A08;
        if (i32 != null && this.A01) {
            i32.A03(0);
        }
        this.A01 = false;
        if (z8) {
            this.A07.A03();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final W2 A60() {
        return this.A07;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final long A65() {
        return 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final void ACr() {
        A04(true);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final void ADF() {
        A04(true);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final void ADN(Y5[] y5Arr, TrackGroupArray trackGroupArray, C1174Gh c1174Gh) {
        int i9 = this.A02;
        if (i9 == -1) {
            i9 = A00(y5Arr, c1174Gh);
        }
        this.A00 = i9;
        this.A07.A04(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final boolean AFO() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final boolean AGI(long j7, float f9) {
        boolean targetBufferSizeReached;
        boolean z8 = true;
        boolean z9 = this.A07.A02() >= this.A00;
        boolean z10 = this.A01;
        long j9 = this.A06;
        if (f9 > 1.0f) {
            j9 = Math.min(IF.A0C(j9, f9), this.A05);
        }
        if (j7 < j9) {
            if (!this.A09 && z9) {
                z8 = false;
            }
            this.A01 = z8;
        } else if (j7 > this.A05 || z9) {
            this.A01 = false;
        }
        I3 i32 = this.A08;
        if (A0B[0].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "QKQzs8A5eNnCMvZO6Czn4VC5jQwn3nPR";
        strArr[4] = "QpEe5JzrMZm1KKJ9dYBmwnmG628Fesko";
        if (i32 != null && (targetBufferSizeReached = this.A01) != z10) {
            if (targetBufferSizeReached) {
                i32.A00(0);
            } else {
                i32.A03(0);
            }
        }
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final boolean AGL(long j7, float f9, boolean z8) {
        long A0D = IF.A0D(j7, f9);
        long j9 = z8 ? this.A03 : this.A04;
        return j9 <= 0 || A0D >= j9 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC10219r
    public final void onPrepared() {
        A04(false);
    }
}
