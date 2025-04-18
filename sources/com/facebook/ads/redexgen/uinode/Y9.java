package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y9 implements InterfaceC04559r {
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

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 83);
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
        this(new W2(true, C.DEFAULT_BUFFER_SEGMENT_SIZE));
    }

    @Deprecated
    public Y9(W2 w22) {
        this(w22, DefaultLoadControl.DEFAULT_MIN_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, true);
    }

    @Deprecated
    public Y9(W2 w22, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this(w22, i10, i11, i12, i13, i14, z10, null);
    }

    @Deprecated
    public Y9(W2 w22, int i10, int i11, int i12, int i13, int i14, boolean z10, I3 i32) {
        String A01 = A01(54, 19, 78);
        String A012 = A01(21, 1, 70);
        A03(i12, 0, A01, A012);
        String A013 = A01(22, 32, 48);
        A03(i13, 0, A013, A012);
        String A014 = A01(84, 11, 0);
        A03(i10, i12, A014, A01);
        A03(i10, i13, A014, A013);
        A03(i11, i10, A01(73, 11, 89), A014);
        this.A07 = w22;
        this.A06 = i10 * 1000;
        this.A05 = i11 * 1000;
        this.A04 = i12 * 1000;
        this.A03 = i13 * 1000;
        this.A02 = i14;
        this.A09 = z10;
        this.A08 = i32;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A00(com.facebook.ads.redexgen.uinode.Y5[] r4, com.facebook.ads.redexgen.uinode.C0608Gh r5) {
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
            int r0 = com.facebook.ads.redexgen.uinode.IF.A01(r0)
            int r2 = r2 + r0
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.Y9.A00(com.facebook.ads.redexgen.X.Y5[], com.facebook.ads.redexgen.X.Gh):int");
    }

    public static void A03(int i10, int i11, String str, String str2) {
        AbstractC0626Ha.A05(i10 >= i11, str + A01(0, 21, 44) + str2);
    }

    private void A04(boolean z10) {
        this.A00 = 0;
        I3 i32 = this.A08;
        if (i32 != null && this.A01) {
            i32.A03(0);
        }
        this.A01 = false;
        if (z10) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final W2 A60() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final long A65() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final void ACr() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final void ADF() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final void ADN(Y5[] y5Arr, TrackGroupArray trackGroupArray, C0608Gh c0608Gh) {
        int i10 = this.A02;
        if (i10 == -1) {
            i10 = A00(y5Arr, c0608Gh);
        }
        this.A00 = i10;
        this.A07.A04(i10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final boolean AFO() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final boolean AGI(long j3, float f10) {
        boolean targetBufferSizeReached;
        boolean z10 = true;
        boolean z11 = this.A07.A02() >= this.A00;
        boolean z12 = this.A01;
        long j10 = this.A06;
        if (f10 > 1.0f) {
            j10 = Math.min(IF.A0C(j10, f10), this.A05);
        }
        if (j3 < j10) {
            if (!this.A09 && z11) {
                z10 = false;
            }
            this.A01 = z10;
        } else if (j3 > this.A05 || z11) {
            this.A01 = false;
        }
        I3 i32 = this.A08;
        if (A0B[0].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "QKQzs8A5eNnCMvZO6Czn4VC5jQwn3nPR";
        strArr[4] = "QpEe5JzrMZm1KKJ9dYBmwnmG628Fesko";
        if (i32 != null && (targetBufferSizeReached = this.A01) != z12) {
            if (targetBufferSizeReached) {
                i32.A00(0);
            } else {
                i32.A03(0);
            }
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final boolean AGL(long j3, float f10, boolean z10) {
        long A0D = IF.A0D(j3, f10);
        long j10 = z10 ? this.A03 : this.A04;
        return j10 <= 0 || A0D >= j10 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC04559r
    public final void onPrepared() {
        A04(false);
    }
}
