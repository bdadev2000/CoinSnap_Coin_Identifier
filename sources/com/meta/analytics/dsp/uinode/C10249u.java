package com.meta.analytics.dsp.uinode;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.9u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10249u {
    public static String[] A0C = {"Lb1", "HAO", "yCHPPE9w0w81YCKuxFE6L9DmrxkJ2tU0", "DWgdxvM8Y7BV8jWWEqdgbbwmU3UKZQmt", "Bgm", "OOw1FrSehBTCipzYy8xUBx5", "Tcr4i3yvYCwS9F", "vvoyvovICPFY35FJOKkJE7b"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C10229s A04;
    public C10229s A05;
    public C10229s A06;
    public AH A07;
    public Object A08;
    public boolean A09;
    public final AF A0A = new AF();
    public final AG A0B = new AG();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C10239t A02(int i9, long j7, long j9) {
        C1132Eo c1132Eo = new C1132Eo(i9, j9);
        this.A07.A09(c1132Eo.A02, this.A0A);
        int A04 = this.A0A.A04(j7);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(c1132Eo, A09);
        return new C10239t(c1132Eo, j7, A09, C.TIME_UNSET, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(c1132Eo, A0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C10239t A03(C10229s c10229s, long j7) {
        long j9;
        C10239t c10239t = c10229s.A02;
        if (c10239t.A06) {
            int A03 = this.A07.A03(c10239t.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i9 = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j10 = c10239t.A04.A03;
            if (this.A07.A0B(i9, this.A0B).A00 == A03) {
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i9, C.TIME_UNSET, Math.max(0L, (c10229s.A07() + c10239t.A01) - j7));
                if (A08 == null) {
                    return null;
                }
                A03 = ((Integer) A08.first).intValue();
                j9 = ((Long) A08.second).longValue();
                if (c10229s.A01 == null || !c10229s.A01.A09.equals(obj)) {
                    j10 = this.A02;
                    this.A02 = j10 + 1;
                } else {
                    j10 = c10229s.A01.A02.A04.A03;
                    String[] strArr = A0C;
                    if (strArr[5].length() == strArr[7].length()) {
                        String[] strArr2 = A0C;
                        strArr2[4] = "1Mi";
                        strArr2[1] = "4wM";
                    }
                }
            } else {
                j9 = 0;
            }
            return A06(A07(A03, j9, j10), j9, j9);
        }
        C1132Eo c1132Eo = c10239t.A04;
        this.A07.A09(c1132Eo.A02, this.A0A);
        if (c1132Eo.A01()) {
            int i10 = c1132Eo.A00;
            int A01 = this.A0A.A01(i10);
            if (A01 == -1) {
                return null;
            }
            int A032 = this.A0A.A03(i10, c1132Eo.A01);
            if (A032 >= A01) {
                return A02(c1132Eo.A02, c10239t.A00, c1132Eo.A03);
            }
            if (this.A0A.A0E(i10, A032)) {
                return A01(c1132Eo.A02, i10, A032, c10239t.A00, c1132Eo.A03);
            }
            return null;
        }
        long j11 = c10239t.A02;
        String[] strArr3 = A0C;
        if (strArr3[6].length() == strArr3[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0C;
        strArr4[4] = "Mkh";
        strArr4[1] = "LRN";
        if (j11 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c10239t.A02);
            if (A05 == -1) {
                return A02(c1132Eo.A02, c10239t.A02, c1132Eo.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (this.A0A.A0E(A05, A02)) {
                return A01(c1132Eo.A02, A05, A02, c10239t.A02, c1132Eo.A03);
            }
            return null;
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i11 = A00 - 1;
        if (this.A0A.A09(i11) == Long.MIN_VALUE) {
            AF af = this.A0A;
            if (A0C[3].charAt(17) == 'q') {
                String[] strArr5 = A0C;
                strArr5[6] = "v4RqMCCMyohjhj";
                strArr5[0] = "VaJ";
                if (!af.A0D(i11)) {
                    int A022 = this.A0A.A02(i11);
                    if (!this.A0A.A0E(i11, A022)) {
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() == strArr6[0].length()) {
                            return null;
                        }
                        A0C[2] = "nHRVyYi6CwR1mKhXGjDN4SEBRB6Sc1lP";
                        return null;
                    }
                    long A07 = this.A0A.A07();
                    int i12 = c1132Eo.A02;
                    String[] strArr7 = A0C;
                    if (strArr7[5].length() != strArr7[7].length()) {
                        throw new RuntimeException();
                    }
                    A0C[2] = "rKR9SUNE0wWlvttO7fw3rD4zdQIUaCm2";
                    return A01(i12, i11, A022, A07, c1132Eo.A03);
                }
            }
        }
        if (A0C[2].charAt(9) != 'w') {
            return null;
        }
        String[] strArr8 = A0C;
        strArr8[6] = "OaXxy4ZAPPYV9k";
        strArr8[0] = "tU4";
        return null;
        throw new RuntimeException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C10239t A04(C10239t c10239t, C1132Eo c1132Eo) {
        long j7 = c10239t.A03;
        long j9 = c10239t.A02;
        boolean A0A = A0A(c1132Eo, j9);
        boolean A0B = A0B(c1132Eo, A0A);
        this.A07.A09(c1132Eo.A02, this.A0A);
        return new C10239t(c1132Eo, j7, j9, c10239t.A00, c1132Eo.A01() ? this.A0A.A0A(c1132Eo.A00, c1132Eo.A01) : j9 == Long.MIN_VALUE ? this.A0A.A07() : j9, A0A, A0B);
    }

    private long A00(int i9) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i9, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
            return this.A03;
        }
        for (C10229s A0E = A0E(); A0E != null; A0E = A0E.A01) {
            Object periodUid = A0E.A09;
            if (periodUid.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C10229s A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            AH ah = this.A07;
            Object periodUid2 = A0E2.A09;
            int A04 = ah.A04(periodUid2);
            if (A04 != -1 && this.A07.A09(A04, this.A0A).A00 == holderWindowIndex) {
                return A0E2.A02.A04.A03;
            }
        }
        long j7 = this.A02;
        this.A02 = 1 + j7;
        return j7;
    }

    private C10239t A01(int i9, int i10, int i11, long j7, long j9) {
        long j10;
        C1132Eo c1132Eo = new C1132Eo(i9, i10, i11, j9);
        boolean A0A = A0A(c1132Eo, Long.MIN_VALUE);
        boolean A0B = A0B(c1132Eo, A0A);
        long A0A2 = this.A07.A09(c1132Eo.A02, this.A0A).A0A(c1132Eo.A00, c1132Eo.A01);
        if (i11 == this.A0A.A02(i10)) {
            j10 = this.A0A.A06();
        } else {
            j10 = 0;
        }
        return new C10239t(c1132Eo, j10, Long.MIN_VALUE, j7, A0A2, A0A, A0B);
    }

    private C10239t A05(C10269w c10269w) {
        return A06(c10269w.A04, c10269w.A01, c10269w.A02);
    }

    private C10239t A06(C1132Eo c1132Eo, long j7, long j9) {
        this.A07.A09(c1132Eo.A02, this.A0A);
        if (c1132Eo.A01()) {
            if (!this.A0A.A0E(c1132Eo.A00, c1132Eo.A01)) {
                return null;
            }
            return A01(c1132Eo.A02, c1132Eo.A00, c1132Eo.A01, j7, c1132Eo.A03);
        }
        return A02(c1132Eo.A02, j9, c1132Eo.A03);
    }

    private C1132Eo A07(int i9, long j7, long j9) {
        this.A07.A09(i9, this.A0A);
        int A05 = this.A0A.A05(j7);
        if (A05 == -1) {
            return new C1132Eo(i9, j9);
        }
        return new C1132Eo(i9, A05, this.A0A.A02(A05), j9);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A08() {
        /*
            r13 = this;
            com.facebook.ads.redexgen.X.9s r3 = r13.A0E()
            r6 = 1
            if (r3 != 0) goto L8
            return r6
        L8:
            com.facebook.ads.redexgen.X.AH r7 = r13.A07
            com.facebook.ads.redexgen.X.9t r0 = r3.A02
            com.facebook.ads.redexgen.X.Eo r0 = r0.A04
            int r8 = r0.A02
            com.facebook.ads.redexgen.X.AF r9 = r13.A0A
            com.facebook.ads.redexgen.X.AG r10 = r13.A0B
            int r11 = r13.A01
            boolean r12 = r13.A09
            int r5 = r7.A03(r8, r9, r10, r11, r12)
        L1c:
            com.facebook.ads.redexgen.X.9s r0 = r3.A01
            if (r0 == 0) goto L29
            com.facebook.ads.redexgen.X.9t r0 = r3.A02
            boolean r0 = r0.A06
            if (r0 != 0) goto L29
            com.facebook.ads.redexgen.X.9s r3 = r3.A01
            goto L1c
        L29:
            r0 = -1
            if (r5 == r0) goto L5b
            com.facebook.ads.redexgen.X.9s r0 = r3.A01
            if (r0 == 0) goto L5b
            com.facebook.ads.redexgen.X.9s r0 = r3.A01
            com.facebook.ads.redexgen.X.9t r0 = r0.A02
            com.facebook.ads.redexgen.X.Eo r0 = r0.A04
            int r4 = r0.A02
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.C10249u.A0C
            r0 = 3
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L4d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4d:
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C10249u.A0C
            java.lang.String r1 = "04e"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fTm"
            r0 = 1
            r2[r0] = r1
            if (r4 == r5) goto L76
        L5b:
            boolean r2 = r13.A0S(r3)
            com.facebook.ads.redexgen.X.9t r1 = r3.A02
            com.facebook.ads.redexgen.X.9t r0 = r3.A02
            com.facebook.ads.redexgen.X.Eo r0 = r0.A04
            com.facebook.ads.redexgen.X.9t r0 = r13.A04(r1, r0)
            r3.A02 = r0
            if (r2 == 0) goto L73
            boolean r0 = r13.A0P()
            if (r0 != 0) goto L74
        L73:
            return r6
        L74:
            r6 = 0
            goto L73
        L76:
            com.facebook.ads.redexgen.X.9s r3 = r3.A01
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C10249u.A08():boolean");
    }

    private boolean A09(C10229s c10229s, C10239t c10239t) {
        C10239t c10239t2 = c10229s.A02;
        return c10239t2.A03 == c10239t.A03 && c10239t2.A02 == c10239t.A02 && c10239t2.A04.equals(c10239t.A04);
    }

    private boolean A0A(C1132Eo c1132Eo, long j7) {
        int adGroupCount = this.A07.A09(c1132Eo.A02, this.A0A).A00();
        if (adGroupCount == 0) {
            return true;
        }
        int i9 = adGroupCount - 1;
        boolean A01 = c1132Eo.A01();
        if (this.A0A.A09(i9) != Long.MIN_VALUE) {
            return !A01 && j7 == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i9);
        if (A0C[3].charAt(17) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "dZB";
        strArr[1] = "bbK";
        if (postrollAdCount == -1) {
            return false;
        }
        if (((A01 && c1132Eo.A00 == i9 && c1132Eo.A01 == postrollAdCount + (-1)) ? 1 : 0) == 0) {
            return !A01 && this.A0A.A02(i9) == postrollAdCount;
        }
        return true;
    }

    private boolean A0B(C1132Eo c1132Eo, boolean z8) {
        return !this.A07.A0B(this.A07.A09(c1132Eo.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(c1132Eo.A02, this.A0A, this.A0B, this.A01, this.A09) && z8;
    }

    public final C10229s A0C() {
        C10229s c10229s = this.A05;
        if (c10229s != null) {
            if (c10229s == this.A06) {
                this.A06 = c10229s.A01;
            }
            this.A05.A0D();
            int i9 = this.A00 - 1;
            this.A00 = i9;
            if (i9 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            C10229s c10229s2 = this.A05.A01;
            if (A0C[3].charAt(17) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[5] = "umGBE5C5CuHWhY73AVgogVf";
            strArr[7] = "vM8t2ZsrAby17UFg4572Zd2";
            this.A05 = c10229s2;
        } else {
            C10229s c10229s3 = this.A04;
            this.A05 = c10229s3;
            this.A06 = c10229s3;
        }
        return this.A05;
    }

    public final C10229s A0D() {
        C10229s c10229s = this.A06;
        AbstractC1192Ha.A04((c10229s == null || c10229s.A01 == null) ? false : true);
        C10229s c10229s2 = this.A06.A01;
        this.A06 = c10229s2;
        return c10229s2;
    }

    public final C10229s A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C10229s A0F() {
        return this.A04;
    }

    public final C10229s A0G() {
        return this.A05;
    }

    public final C10229s A0H() {
        return this.A06;
    }

    public final C10239t A0I(long j7, C10269w c10269w) {
        C10229s c10229s = this.A04;
        if (c10229s == null) {
            return A05(c10269w);
        }
        return A03(c10229s, j7);
    }

    public final C10239t A0J(C10239t c10239t, int i9) {
        return A04(c10239t, c10239t.A04.A00(i9));
    }

    public final WP A0K(AA[] aaArr, AbstractC1176Gj abstractC1176Gj, InterfaceC1179Gm interfaceC1179Gm, InterfaceC1134Eq interfaceC1134Eq, Object obj, C10239t c10239t) {
        long A07;
        C10229s c10229s = this.A04;
        if (c10229s != null) {
            A07 = c10229s.A07() + this.A04.A02.A01;
            String[] strArr = A0C;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[5] = "XFCrwzIN7SxWEMf0fznSlHt";
            strArr2[7] = "zDOSpelqL3O1zvPqWZMR4dG";
        } else {
            A07 = c10239t.A03;
        }
        C10229s c10229s2 = new C10229s(aaArr, A07, abstractC1176Gj, interfaceC1179Gm, interfaceC1134Eq, obj, c10239t);
        if (this.A04 != null) {
            AbstractC1192Ha.A04(A0P());
            this.A04.A01 = c10229s2;
        }
        this.A08 = null;
        this.A04 = c10229s2;
        this.A00++;
        return c10229s2.A08;
    }

    public final C1132Eo A0L(int i9, long j7) {
        return A07(i9, j7, A00(i9));
    }

    public final void A0M(long j7) {
        C10229s c10229s = this.A04;
        if (c10229s != null) {
            c10229s.A0G(j7);
        }
    }

    public final void A0N(AH ah) {
        this.A07 = ah;
    }

    public final void A0O(boolean z8) {
        C10229s A0E = A0E();
        if (A0E != null) {
            this.A08 = z8 ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z8) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C10229s c10229s = this.A04;
        return c10229s == null || (!c10229s.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != C.TIME_UNSET && this.A00 < 100);
    }

    public final boolean A0R(int i9) {
        this.A01 = i9;
        return A08();
    }

    public final boolean A0S(C10229s c10229s) {
        AbstractC1192Ha.A04(c10229s != null);
        boolean z8 = false;
        String[] strArr = A0C;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "VEc";
        strArr2[1] = "0t0";
        this.A04 = c10229s;
        while (c10229s.A01 != null) {
            c10229s = c10229s.A01;
            if (c10229s == this.A06) {
                this.A06 = this.A05;
                z8 = true;
            }
            c10229s.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z8;
    }

    public final boolean A0T(WP wp) {
        C10229s c10229s = this.A04;
        return c10229s != null && c10229s.A08 == wp;
    }

    public final boolean A0U(C1132Eo c1132Eo, long j7) {
        int i9 = c1132Eo.A02;
        C10229s periodHolder = null;
        for (C10229s A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (periodHolder == null) {
                C10239t periodInfo = A0E.A02;
                if (A0C[3].charAt(17) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "pn8srZEQfSJzxw";
                strArr[0] = "zNd";
                A0E.A02 = A0J(periodInfo, i9);
            } else {
                if (i9 == -1 || !A0E.A09.equals(this.A07.A0A(i9, this.A0A, true).A03)) {
                    return true ^ A0S(periodHolder);
                }
                C10239t A03 = A03(periodHolder, j7);
                if (A03 == null) {
                    return true ^ A0S(periodHolder);
                }
                A0E.A02 = A0J(A0E.A02, i9);
                if (!A09(A0E, A03)) {
                    boolean A0S = A0S(periodHolder);
                    String[] strArr2 = A0C;
                    String str = strArr2[4];
                    String str2 = strArr2[1];
                    int length = str.length();
                    int periodIndex = str2.length();
                    if (length != periodIndex) {
                        return true ^ A0S;
                    }
                    String[] strArr3 = A0C;
                    strArr3[5] = "009NTdXku0rfOoGLKxDbxOM";
                    strArr3[7] = "1WlPwvG5U3NzzyaZC20RJwC";
                    return true ^ A0S;
                }
            }
            if (A0E.A02.A06) {
                i9 = this.A07.A03(i9, this.A0A, this.A0B, this.A01, this.A09);
            }
            periodHolder = A0E;
        }
        return true;
    }

    public final boolean A0V(boolean z8) {
        this.A09 = z8;
        return A08();
    }
}
