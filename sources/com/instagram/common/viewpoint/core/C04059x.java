package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04059x {
    public static byte[] A0F;
    public static String[] A0G = {"RyLzjdLQFjwZTdMvpkfsGkyXtigedAZm", "a8YW2dbTuaP7uxeT", "o5bkY8KFpJEQCNeM0dZmTeV4kkPAZKmk", "Q9RCD7qWGcJuxCqJvF4GpBBcr652bG1U", "tH7JEQklX9QCJW", "WW", "I6Pdghhth7MCm7mFqOOdQdykNBKXXKMd", "Itt3Lc9JEUc7FKwrTTHvB6h8wU"};
    public long A00;
    public C04059x A01;
    public C04069y A02;
    public TrackGroupArray A03;
    public C0560Gp A04;
    public boolean A05;
    public boolean A06;
    public C0560Gp A07;
    public final XU A08;
    public final Object A09;
    public final FG[] A0A;
    public final boolean[] A0B;
    public final Ev A0C;
    public final AbstractC0559Go A0D;
    public final AF[] A0E;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 112);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{6, 46, 47, 34, 42, 27, 46, 57, 34, 36, 47, 3, 36, 39, 47, 46, 57, 58, 15, 24, 3, 5, 14, 74, 24, 15, 6, 15, 11, 25, 15, 74, 12, 11, 3, 6, 15, 14, 68};
        if (A0G[2].charAt(0) != 'o') {
            throw new RuntimeException();
        }
        A0G[0] = "kxSsjrUkGIE6MbLKOa3REuzZfRos40mi";
    }

    static {
        A01();
    }

    public C04059x(AF[] afArr, long j2, AbstractC0559Go abstractC0559Go, InterfaceC0562Gr interfaceC0562Gr, Ev ev, Object obj, C04069y c04069y) {
        this.A0E = afArr;
        this.A00 = j2 - c04069y.A03;
        this.A0D = abstractC0559Go;
        this.A0C = ev;
        this.A09 = AbstractC0576Hf.A01(obj);
        this.A02 = c04069y;
        this.A0A = new FG[afArr.length];
        this.A0B = new boolean[afArr.length];
        XU A56 = ev.A56(c04069y.A04, interfaceC0562Gr);
        this.A08 = c04069y.A02 != Long.MIN_VALUE ? new E5(A56, true, 0L, c04069y.A02) : A56;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(com.instagram.common.viewpoint.core.C0560Gp r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            int r0 = r4.A00
            if (r2 >= r0) goto L19
            boolean r1 = r4.A00(r2)
            com.facebook.ads.redexgen.X.Gm r0 = r4.A01
            com.facebook.ads.redexgen.X.Gl r0 = r0.A00(r2)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            r0.A5q()
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C04059x.A02(com.facebook.ads.redexgen.X.Gp):void");
    }

    private void A03(C0560Gp c0560Gp) {
        C0560Gp c0560Gp2 = this.A07;
        this.A07 = c0560Gp;
        if (this.A07 != null) {
            A02(this.A07);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04(com.instagram.common.viewpoint.core.FG[] r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.AF[] r0 = r3.A0E
            int r0 = r0.length
            if (r2 >= r0) goto L23
            com.facebook.ads.redexgen.X.AF[] r0 = r3.A0E
            r0 = r0[r2]
            int r1 = r0.A8a()
            r0 = 5
            if (r1 != r0) goto L20
            com.facebook.ads.redexgen.X.Gp r0 = r3.A04
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L20
            com.facebook.ads.redexgen.X.XZ r0 = new com.facebook.ads.redexgen.X.XZ
            r0.<init>()
            r4[r2] = r0
        L20:
            int r2 = r2 + 1
            goto L1
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C04059x.A04(com.facebook.ads.redexgen.X.FG[]):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(com.instagram.common.viewpoint.core.FG[] r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            com.facebook.ads.redexgen.X.AF[] r0 = r3.A0E
            int r0 = r0.length
            if (r2 >= r0) goto L17
            com.facebook.ads.redexgen.X.AF[] r0 = r3.A0E
            r0 = r0[r2]
            int r1 = r0.A8a()
            r0 = 5
            if (r1 != r0) goto L14
            r0 = 0
            r4[r2] = r0
        L14:
            int r2 = r2 + 1
            goto L1
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C04059x.A05(com.facebook.ads.redexgen.X.FG[]):void");
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A7s();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j2) {
        return j2 - A07();
    }

    public final long A09(long j2) {
        return A07() + j2;
    }

    public final long A0A(long j2, boolean z2) {
        return A0B(j2, z2, new boolean[this.A0E.length]);
    }

    public final long A0B(long j2, boolean z2, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            int i3 = this.A04.A00;
            boolean z3 = false;
            if (i2 >= i3) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z2 && this.A04.A02(this.A07, i2)) {
                z3 = true;
            }
            zArr2[i2] = z3;
            i2++;
        }
        A05(this.A0A);
        A03(this.A04);
        C0557Gm c0557Gm = this.A04.A01;
        long AGC = this.A08.AGC(c0557Gm.A01(), this.A0B, this.A0A, zArr, j2);
        A04(this.A0A);
        this.A05 = false;
        for (int i4 = 0; i4 < this.A0A.length; i4++) {
            if (this.A0A[i4] != null) {
                AbstractC0576Hf.A04(this.A04.A00(i4));
                int i5 = this.A0E[i4].A8a();
                if (i5 != 5) {
                    this.A05 = true;
                }
            } else {
                AbstractC0576Hf.A04(c0557Gm.A00(i4) == null);
            }
        }
        return AGC;
    }

    public final long A0C(boolean z2) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long A6b = this.A08.A6b();
        if (A0G[4].length() != 14) {
            throw new RuntimeException();
        }
        A0G[1] = "fHwS3MIsR68PKOkuOsC9LjREFNCLxqD";
        if (A6b == Long.MIN_VALUE && z2) {
            return this.A02.A01;
        }
        return A6b;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.AF3(((E5) this.A08).A05);
            } else {
                this.A0C.AF3(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e(A00(0, 17, 59), A00(17, 22, 26), e);
        }
    }

    public final void A0E(float f2) throws C03909h {
        this.A06 = true;
        this.A03 = this.A08.A8Z();
        A0I(f2);
        long A0A = A0A(this.A02.A03, false);
        long j2 = this.A00;
        long newStartPositionUs = this.A02.A03;
        this.A00 = j2 + (newStartPositionUs - A0A);
        this.A02 = this.A02.A01(A0A);
    }

    public final void A0F(long j2) {
        this.A08.A4p(A08(j2));
    }

    public final void A0G(long j2) {
        if (this.A06) {
            this.A08.AEu(A08(j2));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A6b() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f2) throws C03909h {
        C0560Gp A0T = this.A0D.A0T(this.A0E, this.A03);
        C0560Gp selectorResult = this.A07;
        if (A0T.A01(selectorResult)) {
            return false;
        }
        this.A04 = A0T;
        C0560Gp selectorResult2 = this.A04;
        for (InterfaceC0556Gl interfaceC0556Gl : selectorResult2.A01.A01()) {
            if (interfaceC0556Gl != null) {
                interfaceC0556Gl.AD5(f2);
            }
        }
        return true;
    }
}
