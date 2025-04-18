package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.TypeReference;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1107at extends AbstractC02804o implements AnonymousClass50 {
    public static byte[] A0F;
    public static String[] A0G = {"ZTDwmEtle1avZIcEXO6Ngzge8j05pfT9", "s1YfUPq4amp3sGXTr0KOnMWCCCkrB2x5", "RLSriKm", "hA4l3MFFurEjuKvfb479JjwTp2cnC09n", "5GFF521rSn4TdhEStccPhauxYrt7NMVp", "XQN2s9DMc1xKucEpv2CitIAcNHBR8E7y", "8ubGCSX", "EFysGv6XChRnXfWxG2n7d2ksHTdYT6om"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public C4Y A04;
    public boolean A05;
    public int A06;
    public C4T A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C4R A0D;
    public final C4S A0E;

    public static String A0T(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{31, 24, 0, 23, 26, 31, 18, 86, 25, 4, 31, 19, 24, 2, 23, 2, 31, 25, 24, 76};
    }

    static {
        A0V();
    }

    public C1107at(Context context) {
        this(context, 1, false);
    }

    public C1107at(Context context, int i2, boolean z2) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C4R(this);
        this.A0E = new C4S();
        this.A06 = 2;
        A2A(i2);
        A0h(z2);
        A1R(true);
    }

    private final int A04(int i2, C02874w c02874w, AnonymousClass53 anonymousClass53) {
        if (A0W() == 0 || i2 == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A29();
        int absDy = i2 > 0 ? 1 : -1;
        int consumed = Math.abs(i2);
        A0Y(absDy, consumed, true, anonymousClass53);
        int i3 = this.A07.A07;
        int layoutDirection = A08(c02874w, this.A07, anonymousClass53, false);
        int i4 = i3 + layoutDirection;
        if (i4 < 0) {
            return 0;
        }
        int absDy2 = consumed > i4 ? absDy * i4 : i2;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i2, C02874w c02874w, AnonymousClass53 anonymousClass53, boolean z2) {
        int fixOffset;
        int gap = this.A04.A07() - i2;
        if (gap > 0) {
            int i3 = -A04(-gap, c02874w, anonymousClass53);
            int i4 = i2 + i3;
            if (z2 && (fixOffset = this.A04.A07() - i4) > 0) {
                this.A04.A0J(fixOffset);
                return fixOffset + i3;
            }
            return i3;
        }
        return 0;
    }

    private int A06(int i2, C02874w c02874w, AnonymousClass53 anonymousClass53, boolean z2) {
        int A0A;
        int gap = i2 - this.A04.A0A();
        if (gap > 0) {
            int i3 = -A04(gap, c02874w, anonymousClass53);
            int i4 = i2 + i3;
            if (z2 && (A0A = i4 - this.A04.A0A()) > 0) {
                this.A04.A0J(-A0A);
                return i3 - A0A;
            }
            return i3;
        }
        return 0;
    }

    private final int A08(C02874w c02874w, C4T c4t, AnonymousClass53 anonymousClass53, boolean z2) {
        int i2 = c4t.A00;
        int start = c4t.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c4t.A00;
            if (start2 < 0) {
                int i3 = c4t.A07;
                int start3 = c4t.A00;
                c4t.A07 = i3 + start3;
            }
            A0e(c02874w, c4t);
        }
        int i4 = c4t.A00;
        int start4 = c4t.A02;
        int i5 = i4 + start4;
        C4S c4s = this.A0E;
        while (true) {
            if ((!c4t.A09 && i5 <= 0) || !c4t.A05(anonymousClass53)) {
                break;
            }
            c4s.A00();
            A2D(c02874w, anonymousClass53, c4t, c4s);
            if (!c4s.A01) {
                int i6 = c4t.A06;
                int remainingSpace = c4s.A00;
                int start5 = c4t.A05;
                c4t.A06 = i6 + (remainingSpace * start5);
                if (!c4s.A03 || this.A07.A08 != null || !anonymousClass53.A07()) {
                    int remainingSpace2 = c4t.A00;
                    int start6 = c4s.A00;
                    c4t.A00 = remainingSpace2 - start6;
                    int start7 = c4s.A00;
                    i5 -= start7;
                }
                int start8 = c4t.A07;
                if (start8 != Integer.MIN_VALUE) {
                    int remainingSpace3 = c4t.A07;
                    int start9 = c4s.A00;
                    c4t.A07 = remainingSpace3 + start9;
                    int start10 = c4t.A00;
                    if (start10 < 0) {
                        int remainingSpace4 = c4t.A07;
                        int start11 = c4t.A00;
                        c4t.A07 = remainingSpace4 + start11;
                    }
                    A0e(c02874w, c4t);
                }
                if (z2 && c4s.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        int start12 = c4t.A00;
        return i2 - start12;
    }

    private int A09(AnonymousClass53 anonymousClass53) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return AnonymousClass57.A00(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(AnonymousClass53 anonymousClass53) {
        if (A0W() != 0) {
            A29();
            return AnonymousClass57.A02(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
        }
        if (A0G[3].charAt(25) != '2') {
            throw new RuntimeException();
        }
        A0G[1] = "J9JFedtgHh7lzsKv2wGVe5URJzbGPRgH";
        return 0;
    }

    private int A0B(AnonymousClass53 anonymousClass53) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return AnonymousClass57.A01(anonymousClass53, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(AnonymousClass53 anonymousClass53) {
        if (anonymousClass53.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int i2, int i3) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A29();
        if (i3 > i2) {
            next = 1;
        } else {
            next = i3 < i2 ? -1 : 0;
        }
        if (next == 0) {
            return A0t(i2);
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i2));
        int next2 = this.A04.A0A();
        if (preferredBoundsFlag2 < next2) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = 4097;
        }
        int next3 = this.A00;
        if (next3 == 0) {
            return super.A04.A00(i2, i3, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i2, i3, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0J(int i2, int i3, boolean z2, boolean z3) {
        int i4;
        A29();
        int i5 = 0;
        if (z2) {
            i4 = 24579;
        } else {
            i4 = 320;
        }
        if (z3) {
            i5 = 320;
        }
        int i6 = this.A00;
        int acceptableBoundsFlag = A0G[5].charAt(29);
        if (acceptableBoundsFlag != 69) {
            throw new RuntimeException();
        }
        A0G[5] = "CO2lCdhiUyNnJNyVLVKK7uQ85cne8EHP";
        if (i6 == 0) {
            return super.A04.A00(i2, i3, i4, i5);
        }
        return super.A05.A00(i2, i3, i4, i5);
    }

    private View A0K(C02874w c02874w, AnonymousClass53 anonymousClass53) {
        return A28(c02874w, anonymousClass53, 0, A0W(), anonymousClass53.A03());
    }

    private View A0L(C02874w c02874w, AnonymousClass53 anonymousClass53) {
        return A28(c02874w, anonymousClass53, A0W() - 1, -1, anonymousClass53.A03());
    }

    private View A0M(C02874w c02874w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C02874w c02874w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C02874w c02874w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0K(c02874w, anonymousClass53) : A0L(c02874w, anonymousClass53);
    }

    private View A0P(C02874w c02874w, AnonymousClass53 anonymousClass53) {
        return this.A05 ? A0L(c02874w, anonymousClass53) : A0K(c02874w, anonymousClass53);
    }

    private View A0Q(boolean z2, boolean z3) {
        if (this.A05) {
            return A0J(0, A0W(), z2, z3);
        }
        return A0J(A0W() - 1, -1, z2, z3);
    }

    private View A0R(boolean z2, boolean z3) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z2, z3);
        }
        return A0J(0, A0W(), z2, z3);
    }

    private final C4T A0S() {
        return new C4T();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2F()) {
            this.A05 = this.A0A;
        } else {
            this.A05 = !this.A0A;
        }
    }

    private void A0W(int i2, int i3) {
        this.A07.A00 = this.A04.A07() - i3;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i2;
        this.A07.A05 = 1;
        this.A07.A06 = i3;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i2, int i3) {
        this.A07.A00 = i3 - this.A04.A0A();
        this.A07.A01 = i2;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i3;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i2, int i3, boolean z2, AnonymousClass53 anonymousClass53) {
        int A0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(anonymousClass53);
        this.A07.A05 = i2;
        if (i2 == 1) {
            this.A07.A02 += this.A04.A08();
            View A0F2 = A0F();
            C4T c4t = this.A07;
            if (!this.A05) {
                r4 = 1;
            }
            c4t.A03 = r4;
            this.A07.A01 = A0p(A0F2) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(A0F2);
            A0A = this.A04.A0C(A0F2) - this.A04.A07();
        } else {
            View A0G2 = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(A0G2) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(A0G2);
            A0A = (-this.A04.A0F(A0G2)) + this.A04.A0A();
        }
        this.A07.A00 = i3;
        if (z2) {
            C4T c4t2 = this.A07;
            int scrollingOffset = c4t2.A00;
            c4t2.A00 = scrollingOffset - A0A;
        }
        this.A07.A07 = A0A;
    }

    private void A0Z(C4R c4r) {
        A0W(c4r.A01, c4r.A00);
    }

    private void A0a(C4R c4r) {
        A0X(c4r.A01, c4r.A00);
    }

    private void A0b(C02874w c02874w, int i2) {
        int A0W = A0W();
        if (i2 < 0) {
            return;
        }
        int A06 = this.A04.A06() - i2;
        boolean z2 = this.A05;
        int limit = A0G[3].charAt(25);
        if (limit != 50) {
            throw new RuntimeException();
        }
        A0G[1] = "5eQap7viEGWOuRbzagNYDGjkAWEMIhVp";
        if (z2) {
            for (int i3 = 0; i3 < A0W; i3++) {
                View A0t = A0t(i3);
                int childCount = this.A04.A0F(A0t);
                if (childCount >= A06) {
                    int childCount2 = this.A04.A0H(A0t);
                    if (childCount2 >= A06) {
                    }
                }
                int limit2 = A0G[4].length();
                if (limit2 != 13) {
                    String[] strArr = A0G;
                    strArr[6] = "EiwXPaP";
                    strArr[2] = "4OvxlWI";
                    A0d(c02874w, 0, i3);
                    return;
                }
                A0d(c02874w, 0, i3);
                return;
            }
            return;
        }
        for (int i4 = A0W - 1; i4 >= 0; i4--) {
            View A0t2 = A0t(i4);
            int childCount3 = this.A04.A0F(A0t2);
            if (childCount3 >= A06) {
                int childCount4 = this.A04.A0H(A0t2);
                if (childCount4 >= A06) {
                }
            }
            int childCount5 = A0W - 1;
            A0d(c02874w, childCount5, i4);
            return;
        }
    }

    private void A0c(C02874w c02874w, int i2) {
        if (i2 < 0) {
            return;
        }
        int A0W = A0W();
        if (this.A05) {
            for (int i3 = A0W - 1; i3 >= 0; i3--) {
                View A0t = A0t(i3);
                C4Y c4y = this.A04;
                int childCount = A0G[5].charAt(29);
                if (childCount != 69) {
                    throw new RuntimeException();
                }
                A0G[3] = "CCkneFsBnjHsOQTiipl2DNgji2H70UcR";
                int limit = c4y.A0C(A0t);
                if (limit <= i2) {
                    int limit2 = this.A04.A0G(A0t);
                    if (limit2 <= i2) {
                    }
                }
                int limit3 = A0W - 1;
                A0d(c02874w, limit3, i3);
                return;
            }
            return;
        }
        for (int i4 = 0; i4 < A0W; i4++) {
            View A0t2 = A0t(i4);
            int limit4 = this.A04.A0C(A0t2);
            if (limit4 <= i2) {
                int limit5 = this.A04.A0G(A0t2);
                if (limit5 <= i2) {
                }
            }
            A0d(c02874w, 0, i4);
            return;
        }
    }

    private void A0d(C02874w c02874w, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 > i2) {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                A14(i4, c02874w);
            }
            return;
        }
        while (i2 > i3) {
            A14(i2, c02874w);
            i2--;
        }
    }

    private void A0e(C02874w c02874w, C4T c4t) {
        if (!c4t.A0B || c4t.A09) {
            return;
        }
        if (c4t.A05 == -1) {
            A0b(c02874w, c4t.A07);
        } else {
            A0c(c02874w, c4t.A07);
        }
    }

    private void A0f(C02874w c02874w, AnonymousClass53 anonymousClass53, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!anonymousClass53.A08() || A0W() == 0 || anonymousClass53.A07() || !A22()) {
            return;
        }
        int i2 = 0;
        int scrapExtraStart = 0;
        List<AnonymousClass56> A0J = c02874w.A0J();
        int i3 = A0J.size();
        int A0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i3; scrapSize++) {
            AnonymousClass56 anonymousClass56 = A0J.get(scrapSize);
            if (!anonymousClass56.A0a()) {
                int direction = 1;
                if ((anonymousClass56.A0I() < A0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    i2 += this.A04.A0D(anonymousClass56.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(anonymousClass56.A0H);
                }
            }
        }
        this.A07.A08 = A0J;
        if (i2 > 0) {
            A0X(A0p(A0G()), scrapExtraEnd);
            this.A07.A02 = i2;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c02874w, this.A07, anonymousClass53, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0p(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c02874w, this.A07, anonymousClass53, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C02874w c02874w, AnonymousClass53 anonymousClass53, C4R c4r) {
        if (A0k(anonymousClass53, c4r) || A0j(c02874w, anonymousClass53, c4r)) {
            return;
        }
        c4r.A02();
        c4r.A01 = this.A0C ? anonymousClass53.A03() - 1 : 0;
    }

    private final void A0h(boolean z2) {
        A1y(null);
        if (z2 == this.A0A) {
            return;
        }
        this.A0A = z2;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C02874w c02874w, AnonymousClass53 anonymousClass53, C4R c4r) {
        View A0P;
        int A0A;
        if (A0W() == 0) {
            return false;
        }
        View A0s = A0s();
        if (A0s != null && c4r.A06(A0s, anonymousClass53)) {
            c4r.A05(A0s);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (c4r.A02) {
            A0P = A0O(c02874w, anonymousClass53);
        } else {
            A0P = A0P(c02874w, anonymousClass53);
        }
        if (A0P == null) {
            return false;
        }
        c4r.A04(A0P);
        if (!anonymousClass53.A07() && A22()) {
            if (this.A04.A0F(A0P) >= this.A04.A07() || this.A04.A0C(A0P) < this.A04.A0A()) {
                if (c4r.A02) {
                    A0A = this.A04.A07();
                } else {
                    A0A = this.A04.A0A();
                }
                c4r.A00 = A0A;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        r10.A00 = r8.A04.A0A();
        r10.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        r1 = r8.A04.A07() - r8.A04.A0C(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        if (r1 >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
    
        r10.A00 = r8.A04.A07();
        r10.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r10.A02 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        r1 = r8.A04.A0C(r5);
        r1 = r1 + r8.A04.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        r10.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        r1 = r8.A04.A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0k(com.instagram.common.viewpoint.core.AnonymousClass53 r9, com.instagram.common.viewpoint.core.C4R r10) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1107at.A0k(com.facebook.ads.redexgen.X.53, com.facebook.ads.redexgen.X.4R):boolean");
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public int A1d(int i2, C02874w c02874w, AnonymousClass53 anonymousClass53) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i2, c02874w, anonymousClass53);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public int A1e(int i2, C02874w c02874w, AnonymousClass53 anonymousClass53) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i2, c02874w, anonymousClass53);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final int A1f(AnonymousClass53 anonymousClass53) {
        return A09(anonymousClass53);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final int A1g(AnonymousClass53 anonymousClass53) {
        return A0A(anonymousClass53);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final int A1h(AnonymousClass53 anonymousClass53) {
        return A0B(anonymousClass53);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final int A1i(AnonymousClass53 anonymousClass53) {
        return A09(anonymousClass53);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final int A1j(AnonymousClass53 anonymousClass53) {
        return A0A(anonymousClass53);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final int A1k(AnonymousClass53 anonymousClass53) {
        return A0B(anonymousClass53);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final Parcelable A1l() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A29();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0p(refChild);
            } else {
                View A0G2 = A0G();
                linearLayoutManager$SavedState.A01 = A0p(A0G2);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(A0G2) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final View A1m(int i2) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i2 - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            View A0t = A0t(childCount);
            if (A0p(A0t) == i2) {
                return A0t;
            }
        }
        return super.A1m(i2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public View A1n(View view, int i2, C02874w c02874w, AnonymousClass53 anonymousClass53) {
        int maxScroll;
        View nextFocus;
        View A0F2;
        A0U();
        if (A0W() == 0 || (maxScroll = A27(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        A29();
        A29();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, anonymousClass53);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A08(c02874w, this.A07, anonymousClass53, true);
        if (maxScroll == -1) {
            nextFocus = A0N(c02874w, anonymousClass53);
        } else {
            nextFocus = A0M(c02874w, anonymousClass53);
        }
        if (maxScroll == -1) {
            A0F2 = A0G();
        } else {
            A0F2 = A0F();
        }
        if (A0F2.hasFocusable()) {
            if (nextFocus == null) {
                return null;
            }
            return A0F2;
        }
        return nextFocus;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public C02814p A1o() {
        return new C02814p(-2, -2);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public void A1p(int i2) {
        this.A01 = i2;
        this.A02 = Integer.MIN_VALUE;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final void A1q(int i2, int i3, AnonymousClass53 anonymousClass53, InterfaceC02784m interfaceC02784m) {
        if (this.A00 != 0) {
            i2 = i3;
        }
        int delta = A0W();
        if (delta == 0 || i2 == 0) {
            return;
        }
        A29();
        int i4 = i2 > 0 ? 1 : -1;
        int delta2 = Math.abs(i2);
        A0Y(i4, delta2, true, anonymousClass53);
        A2E(anonymousClass53, this.A07, interfaceC02784m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final void A1r(int i2, InterfaceC02784m interfaceC02784m) {
        boolean z2;
        int direction;
        if (this.A03 != null && this.A03.A01()) {
            z2 = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z2 = this.A05;
            if (this.A01 == -1) {
                direction = z2 ? i2 - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int anchorPos = z2 ? -1 : 1;
        for (int i3 = 0; i3 < this.A06 && direction >= 0 && direction < i2; i3++) {
            interfaceC02784m.A3o(direction, 0);
            direction += anchorPos;
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final void A1s(Parcelable parcelable) {
        ClassLoader classLoader;
        if (!(parcelable instanceof WrappedParcelable) || (classLoader = getClass().getClassLoader()) == null) {
            return;
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (state instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) state;
            A0y();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final void A1t(AccessibilityEvent accessibilityEvent) {
        super.A1t(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A24());
            if (A0G[1].charAt(13) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "JM0e54P";
            strArr[2] = "62qYDCA";
            accessibilityEvent.setToIndex(A25());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0240, code lost:
    
        if (r8 < r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024e, code lost:
    
        if (r9.A04.A0C(r5) > r9.A04.A0A()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0250, code lost:
    
        r9.A0D.A05(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0257, code lost:
    
        if (r8 < r7) goto L86;
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1u(com.instagram.common.viewpoint.core.C02874w r10, com.instagram.common.viewpoint.core.AnonymousClass53 r11) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1107at.A1u(com.facebook.ads.redexgen.X.4w, com.facebook.ads.redexgen.X.53):void");
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public void A1v(AnonymousClass53 anonymousClass53) {
        super.A1v(anonymousClass53);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final void A1w(FL fl, C02874w c02874w) {
        super.A1w(fl, c02874w);
        if (this.A09) {
            A1I(c02874w);
            c02874w.A0P();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public void A1x(FL fl, AnonymousClass53 anonymousClass53, int i2) {
        C1106as linearSmoothScroller = new C1106as(fl.getContext());
        linearSmoothScroller.A0A(i2);
        A1L(linearSmoothScroller);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final void A1y(String str) {
        if (this.A03 == null) {
            super.A1y(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final boolean A1z() {
        return (A0Y() == 1073741824 || A0i() == 1073741824 || !A1S()) ? false : true;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final boolean A20() {
        return this.A00 == 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public final boolean A21() {
        return this.A00 == 1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC02804o
    public boolean A22() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A23() {
        View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A24() {
        View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A25() {
        View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A26() {
        return this.A00;
    }

    public final int A27(int i2) {
        switch (i2) {
            case 1:
                if (this.A00 == 1) {
                    return -1;
                }
                boolean A2F = A2F();
                if (A0G[4].length() != 13) {
                    A0G[7] = "JFBGAdvw0W46p1IiHd184rfjlhxsbjRk";
                    return A2F ? 1 : -1;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2F()) ? -1 : 1;
            case 17:
                if (this.A00 == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                if (this.A00 == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                int i3 = this.A00;
                String[] strArr = A0G;
                if (strArr[6].length() == strArr[2].length()) {
                    A0G[0] = "A4gNOGqmCbgTlyYHXDAs3UqrHjABAhAn";
                    return i3 == 0 ? 1 : Integer.MIN_VALUE;
                }
                break;
            case 130:
                return this.A00 == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
        throw new RuntimeException();
    }

    public View A28(C02874w c02874w, AnonymousClass53 anonymousClass53, int i2, int i3, int i4) {
        A29();
        View view = null;
        View view2 = null;
        int A0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View outOfBoundsMatch = A0t(i2);
            int A0p = A0p(outOfBoundsMatch);
            if (A0p >= 0 && A0p < i4) {
                if (((C02814p) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < A0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i2 += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A29() {
        if (this.A07 == null) {
            C4T A0S = A0S();
            if (A0G[3].charAt(25) != '2') {
                throw new RuntimeException();
            }
            A0G[7] = "6FRvOBuqOIFmnj4QgnBJgNDOjl7oudHL";
            this.A07 = A0S;
        }
        if (this.A04 == null) {
            this.A04 = C4Y.A02(this, this.A00);
        }
    }

    public final void A2A(int i2) {
        if (i2 == 0 || i2 == 1) {
            A1y(null);
            if (i2 == this.A00) {
                return;
            }
            this.A00 = i2;
            this.A04 = null;
            A0y();
            return;
        }
        throw new IllegalArgumentException(A0T(0, 20, 45) + i2);
    }

    public final void A2B(int i2, int i3) {
        this.A01 = i2;
        this.A02 = i3;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    public void A2C(C02874w c02874w, AnonymousClass53 anonymousClass53, C4R c4r, int i2) {
    }

    public void A2D(C02874w c02874w, AnonymousClass53 anonymousClass53, C4T c4t, C4S c4s) {
        int A0g;
        int right;
        int i2;
        int i3;
        View A03 = c4t.A03(c02874w);
        if (A03 == null) {
            c4s.A01 = true;
            return;
        }
        C02814p c02814p = (C02814p) A03.getLayoutParams();
        if (c4t.A08 == null) {
            if (this.A05 == (c4t.A05 == -1)) {
                A17(A03);
            } else {
                A19(A03, 0);
            }
        } else {
            boolean z2 = this.A05;
            int bottom = c4t.A05;
            if (z2 == (bottom == -1)) {
                A16(A03);
            } else {
                A18(A03, 0);
            }
        }
        A1A(A03, 0, 0);
        c4s.A00 = this.A04.A0D(A03);
        if (this.A00 == 1) {
            if (A2F()) {
                i3 = A0h() - A0f();
                i2 = i3 - this.A04.A0E(A03);
            } else {
                i2 = A0e();
                i3 = this.A04.A0E(A03) + i2;
            }
            if (c4t.A05 == -1) {
                right = c4t.A06;
                A0g = c4t.A06 - c4s.A00;
            } else {
                A0g = c4t.A06;
                right = c4t.A06 + c4s.A00;
            }
        } else {
            A0g = A0g();
            right = this.A04.A0E(A03) + A0g;
            int bottom2 = c4t.A05;
            if (bottom2 == -1) {
                i3 = c4t.A06;
                int i4 = c4t.A06;
                int bottom3 = c4s.A00;
                i2 = i4 - bottom3;
            } else {
                i2 = c4t.A06;
                int i5 = c4t.A06;
                int bottom4 = c4s.A00;
                i3 = i5 + bottom4;
            }
        }
        A1B(A03, i2, A0g, i3, right);
        if (c02814p.A02() || c02814p.A01()) {
            c4s.A03 = true;
        }
        c4s.A02 = A03.hasFocusable();
    }

    public void A2E(AnonymousClass53 anonymousClass53, C4T c4t, InterfaceC02784m interfaceC02784m) {
        int i2 = c4t.A01;
        if (i2 >= 0) {
            int pos = anonymousClass53.A03();
            if (i2 < pos) {
                int pos2 = c4t.A07;
                interfaceC02784m.A3o(i2, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2F() {
        return A0a() == 1;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass50
    public final PointF A4k(int i2) {
        if (A0W() == 0) {
            return null;
        }
        boolean z2 = i2 < A0p(A0t(0));
        boolean z3 = this.A05;
        int firstChildPos = A0G[4].length();
        if (firstChildPos == 13) {
            throw new RuntimeException();
        }
        A0G[7] = "FFnbbIQmxzlcCB5QJgqtb02Njm6aLfkX";
        int i3 = z2 != z3 ? -1 : 1;
        int direction = this.A00;
        if (direction == 0) {
            return new PointF(i3, 0.0f);
        }
        return new PointF(0.0f, i3);
    }
}
