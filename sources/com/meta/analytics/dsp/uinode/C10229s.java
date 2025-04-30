package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10229s {
    public static byte[] A0F;
    public long A00;
    public C10229s A01;
    public C10239t A02;
    public TrackGroupArray A03;
    public C1177Gk A04;
    public boolean A05;
    public boolean A06;
    public C1177Gk A07;
    public final WP A08;
    public final Object A09;
    public final FB[] A0A;
    public final boolean[] A0B;
    public final InterfaceC1134Eq A0C;
    public final AbstractC1176Gj A0D;
    public final AA[] A0E;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102, 74, 109, 110, 102, 103, 112, 81, 100, 115, 104, 110, 101, 33, 115, 100, 109, 100, 96, 114, 100, 33, 103, 96, 104, 109, 100, 101, 47};
    }

    public C10229s(AA[] aaArr, long j7, AbstractC1176Gj abstractC1176Gj, InterfaceC1179Gm interfaceC1179Gm, InterfaceC1134Eq interfaceC1134Eq, Object obj, C10239t c10239t) {
        this.A0E = aaArr;
        this.A00 = j7 - c10239t.A03;
        this.A0D = abstractC1176Gj;
        this.A0C = interfaceC1134Eq;
        this.A09 = AbstractC1192Ha.A01(obj);
        this.A02 = c10239t;
        this.A0A = new FB[aaArr.length];
        this.A0B = new boolean[aaArr.length];
        WP A4k = interfaceC1134Eq.A4k(c10239t.A04, interfaceC1179Gm);
        this.A08 = c10239t.A02 != Long.MIN_VALUE ? new CI(A4k, true, 0L, c10239t.A02) : A4k;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(com.meta.analytics.dsp.uinode.C1177Gk r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            int r0 = r4.A00
            if (r2 >= r0) goto L19
            boolean r1 = r4.A00(r2)
            com.facebook.ads.redexgen.X.Gh r0 = r4.A01
            com.facebook.ads.redexgen.X.Gg r0 = r0.A00(r2)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            r0.A5U()
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C10229s.A02(com.facebook.ads.redexgen.X.Gk):void");
    }

    private void A03(C1177Gk c1177Gk) {
        C1177Gk c1177Gk2 = this.A07;
        this.A07 = c1177Gk;
        if (c1177Gk != null) {
            A02(c1177Gk);
        }
    }

    private void A04(FB[] fbArr) {
        int i9 = 0;
        while (true) {
            AA[] aaArr = this.A0E;
            int i10 = aaArr.length;
            if (i9 < i10) {
                if (aaArr[i9].A8C() == 5 && this.A04.A00(i9)) {
                    fbArr[i9] = new WU();
                }
                i9++;
            } else {
                return;
            }
        }
    }

    private void A05(FB[] fbArr) {
        int i9 = 0;
        while (true) {
            AA[] aaArr = this.A0E;
            int i10 = aaArr.length;
            if (i9 < i10) {
                if (aaArr[i9].A8C() == 5) {
                    fbArr[i9] = null;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A7U();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j7) {
        return j7 - A07();
    }

    public final long A09(long j7) {
        return A07() + j7;
    }

    public final long A0A(long j7, boolean z8) {
        return A0B(j7, z8, new boolean[this.A0E.length]);
    }

    public final long A0B(long j7, boolean z8, boolean[] zArr) {
        int i9 = 0;
        while (true) {
            int i10 = this.A04.A00;
            boolean z9 = false;
            if (i9 >= i10) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z8 && this.A04.A02(this.A07, i9)) {
                z9 = true;
            }
            zArr2[i9] = z9;
            i9++;
        }
        A05(this.A0A);
        A03(this.A04);
        C1174Gh c1174Gh = this.A04.A01;
        long AFm = this.A08.AFm(c1174Gh.A01(), this.A0B, this.A0A, zArr, j7);
        A04(this.A0A);
        this.A05 = false;
        int i11 = 0;
        while (true) {
            FB[] fbArr = this.A0A;
            if (i11 < fbArr.length) {
                if (fbArr[i11] != null) {
                    AbstractC1192Ha.A04(this.A04.A00(i11));
                    int i12 = this.A0E[i11].A8C();
                    if (i12 != 5) {
                        this.A05 = true;
                    }
                } else {
                    AbstractC1192Ha.A04(c1174Gh.A00(i11) == null);
                }
                i11++;
            } else {
                return AFm;
            }
        }
    }

    public final long A0C(boolean z8) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long A6D = this.A08.A6D();
        if (A6D == Long.MIN_VALUE && z8) {
            return this.A02.A01;
        }
        return A6D;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.AEa(((CI) this.A08).A05);
            } else {
                this.A0C.AEa(this.A08);
            }
        } catch (RuntimeException e4) {
            Log.e(A00(0, 17, 28), A00(17, 22, 31), e4);
        }
    }

    public final void A0E(float f9) throws C10079c {
        this.A06 = true;
        this.A03 = this.A08.A8B();
        A0I(f9);
        long A0A = A0A(this.A02.A03, false);
        long j7 = this.A00;
        long newStartPositionUs = this.A02.A03;
        this.A00 = j7 + (newStartPositionUs - A0A);
        this.A02 = this.A02.A01(A0A);
    }

    public final void A0F(long j7) {
        this.A08.A4T(A08(j7));
    }

    public final void A0G(long j7) {
        if (this.A06) {
            this.A08.AER(A08(j7));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A6D() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f9) throws C10079c {
        C1177Gk A0T = this.A0D.A0T(this.A0E, this.A03);
        C1177Gk selectorResult = this.A07;
        if (A0T.A01(selectorResult)) {
            return false;
        }
        this.A04 = A0T;
        for (InterfaceC1173Gg interfaceC1173Gg : A0T.A01.A01()) {
            if (interfaceC1173Gg != null) {
                interfaceC1173Gg.ACc(f9);
            }
        }
        return true;
    }
}
