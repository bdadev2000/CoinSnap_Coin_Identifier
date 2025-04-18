package com.facebook.ads.redexgen.uinode;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.9u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04589u {
    public static String[] A0C = {"Lb1", "HAO", "yCHPPE9w0w81YCKuxFE6L9DmrxkJ2tU0", "DWgdxvM8Y7BV8jWWEqdgbbwmU3UKZQmt", "Bgm", "OOw1FrSehBTCipzYy8xUBx5", "Tcr4i3yvYCwS9F", "vvoyvovICPFY35FJOKkJE7b"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C04569s A04;
    public C04569s A05;
    public C04569s A06;
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
    private C04579t A02(int i10, long j3, long j10) {
        C0566Eo c0566Eo = new C0566Eo(i10, j10);
        this.A07.A09(c0566Eo.A02, this.A0A);
        int A04 = this.A0A.A04(j3);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(c0566Eo, A09);
        return new C04579t(c0566Eo, j3, A09, C.TIME_UNSET, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(c0566Eo, A0A));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C04579t A03(C04569s c04569s, long j3) {
        long j10;
        C04579t c04579t = c04569s.A02;
        if (c04579t.A06) {
            int A03 = this.A07.A03(c04579t.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i10 = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j11 = c04579t.A04.A03;
            if (this.A07.A0B(i10, this.A0B).A00 == A03) {
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i10, C.TIME_UNSET, Math.max(0L, (c04569s.A07() + c04579t.A01) - j3));
                if (A08 == null) {
                    return null;
                }
                A03 = ((Integer) A08.first).intValue();
                j10 = ((Long) A08.second).longValue();
                if (c04569s.A01 == null || !c04569s.A01.A09.equals(obj)) {
                    j11 = this.A02;
                    this.A02 = j11 + 1;
                } else {
                    j11 = c04569s.A01.A02.A04.A03;
                    String[] strArr = A0C;
                    if (strArr[5].length() == strArr[7].length()) {
                        String[] strArr2 = A0C;
                        strArr2[4] = "1Mi";
                        strArr2[1] = "4wM";
                    }
                }
            } else {
                j10 = 0;
            }
            return A06(A07(A03, j10, j11), j10, j10);
        }
        C0566Eo c0566Eo = c04579t.A04;
        this.A07.A09(c0566Eo.A02, this.A0A);
        if (c0566Eo.A01()) {
            int i11 = c0566Eo.A00;
            int A01 = this.A0A.A01(i11);
            if (A01 == -1) {
                return null;
            }
            int A032 = this.A0A.A03(i11, c0566Eo.A01);
            if (A032 >= A01) {
                return A02(c0566Eo.A02, c04579t.A00, c0566Eo.A03);
            }
            if (this.A0A.A0E(i11, A032)) {
                return A01(c0566Eo.A02, i11, A032, c04579t.A00, c0566Eo.A03);
            }
            return null;
        }
        long j12 = c04579t.A02;
        String[] strArr3 = A0C;
        if (strArr3[6].length() == strArr3[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0C;
        strArr4[4] = "Mkh";
        strArr4[1] = "LRN";
        if (j12 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c04579t.A02);
            if (A05 == -1) {
                return A02(c0566Eo.A02, c04579t.A02, c0566Eo.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (this.A0A.A0E(A05, A02)) {
                return A01(c0566Eo.A02, A05, A02, c04579t.A02, c0566Eo.A03);
            }
            return null;
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i12 = A00 - 1;
        if (this.A0A.A09(i12) == Long.MIN_VALUE) {
            AF af2 = this.A0A;
            if (A0C[3].charAt(17) == 'q') {
                String[] strArr5 = A0C;
                strArr5[6] = "v4RqMCCMyohjhj";
                strArr5[0] = "VaJ";
                if (!af2.A0D(i12)) {
                    int A022 = this.A0A.A02(i12);
                    if (!this.A0A.A0E(i12, A022)) {
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() == strArr6[0].length()) {
                            return null;
                        }
                        A0C[2] = "nHRVyYi6CwR1mKhXGjDN4SEBRB6Sc1lP";
                        return null;
                    }
                    long A07 = this.A0A.A07();
                    int i13 = c0566Eo.A02;
                    String[] strArr7 = A0C;
                    if (strArr7[5].length() != strArr7[7].length()) {
                        throw new RuntimeException();
                    }
                    A0C[2] = "rKR9SUNE0wWlvttO7fw3rD4zdQIUaCm2";
                    return A01(i13, i12, A022, A07, c0566Eo.A03);
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
    private C04579t A04(C04579t c04579t, C0566Eo c0566Eo) {
        long j3 = c04579t.A03;
        long j10 = c04579t.A02;
        boolean A0A = A0A(c0566Eo, j10);
        boolean A0B = A0B(c0566Eo, A0A);
        this.A07.A09(c0566Eo.A02, this.A0A);
        return new C04579t(c0566Eo, j3, j10, c04579t.A00, c0566Eo.A01() ? this.A0A.A0A(c0566Eo.A00, c0566Eo.A01) : j10 == Long.MIN_VALUE ? this.A0A.A07() : j10, A0A, A0B);
    }

    private long A00(int i10) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i10, this.A0A, true).A03;
        int holderWindowIndex = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1 && this.A07.A09(oldFrontPeriodIndex, this.A0A).A00 == holderWindowIndex) {
            return this.A03;
        }
        for (C04569s A0E = A0E(); A0E != null; A0E = A0E.A01) {
            Object periodUid = A0E.A09;
            if (periodUid.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C04569s A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            AH ah2 = this.A07;
            Object periodUid2 = A0E2.A09;
            int A04 = ah2.A04(periodUid2);
            if (A04 != -1 && this.A07.A09(A04, this.A0A).A00 == holderWindowIndex) {
                return A0E2.A02.A04.A03;
            }
        }
        long j3 = this.A02;
        this.A02 = 1 + j3;
        return j3;
    }

    private C04579t A01(int i10, int i11, int i12, long j3, long j10) {
        long j11;
        C0566Eo c0566Eo = new C0566Eo(i10, i11, i12, j10);
        boolean A0A = A0A(c0566Eo, Long.MIN_VALUE);
        boolean A0B = A0B(c0566Eo, A0A);
        long A0A2 = this.A07.A09(c0566Eo.A02, this.A0A).A0A(c0566Eo.A00, c0566Eo.A01);
        if (i12 == this.A0A.A02(i11)) {
            j11 = this.A0A.A06();
        } else {
            j11 = 0;
        }
        return new C04579t(c0566Eo, j11, Long.MIN_VALUE, j3, A0A2, A0A, A0B);
    }

    private C04579t A05(C04609w c04609w) {
        return A06(c04609w.A04, c04609w.A01, c04609w.A02);
    }

    private C04579t A06(C0566Eo c0566Eo, long j3, long j10) {
        this.A07.A09(c0566Eo.A02, this.A0A);
        if (c0566Eo.A01()) {
            if (!this.A0A.A0E(c0566Eo.A00, c0566Eo.A01)) {
                return null;
            }
            return A01(c0566Eo.A02, c0566Eo.A00, c0566Eo.A01, j3, c0566Eo.A03);
        }
        return A02(c0566Eo.A02, j10, c0566Eo.A03);
    }

    private C0566Eo A07(int i10, long j3, long j10) {
        this.A07.A09(i10, this.A0A);
        int A05 = this.A0A.A05(j3);
        if (A05 == -1) {
            return new C0566Eo(i10, j10);
        }
        return new C0566Eo(i10, A05, this.A0A.A02(A05), j10);
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
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C04589u.A0C
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
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C04589u.A0C
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C04589u.A08():boolean");
    }

    private boolean A09(C04569s c04569s, C04579t c04579t) {
        C04579t c04579t2 = c04569s.A02;
        return c04579t2.A03 == c04579t.A03 && c04579t2.A02 == c04579t.A02 && c04579t2.A04.equals(c04579t.A04);
    }

    private boolean A0A(C0566Eo c0566Eo, long j3) {
        int adGroupCount = this.A07.A09(c0566Eo.A02, this.A0A).A00();
        if (adGroupCount == 0) {
            return true;
        }
        int i10 = adGroupCount - 1;
        boolean A01 = c0566Eo.A01();
        if (this.A0A.A09(i10) != Long.MIN_VALUE) {
            return !A01 && j3 == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i10);
        if (A0C[3].charAt(17) != 'q') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "dZB";
        strArr[1] = "bbK";
        if (postrollAdCount == -1) {
            return false;
        }
        if (((A01 && c0566Eo.A00 == i10 && c0566Eo.A01 == postrollAdCount + (-1)) ? 1 : 0) == 0) {
            return !A01 && this.A0A.A02(i10) == postrollAdCount;
        }
        return true;
    }

    private boolean A0B(C0566Eo c0566Eo, boolean z10) {
        return !this.A07.A0B(this.A07.A09(c0566Eo.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(c0566Eo.A02, this.A0A, this.A0B, this.A01, this.A09) && z10;
    }

    public final C04569s A0C() {
        C04569s c04569s = this.A05;
        if (c04569s != null) {
            if (c04569s == this.A06) {
                this.A06 = c04569s.A01;
            }
            this.A05.A0D();
            int i10 = this.A00 - 1;
            this.A00 = i10;
            if (i10 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            C04569s c04569s2 = this.A05.A01;
            if (A0C[3].charAt(17) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[5] = "umGBE5C5CuHWhY73AVgogVf";
            strArr[7] = "vM8t2ZsrAby17UFg4572Zd2";
            this.A05 = c04569s2;
        } else {
            C04569s c04569s3 = this.A04;
            this.A05 = c04569s3;
            this.A06 = c04569s3;
        }
        return this.A05;
    }

    public final C04569s A0D() {
        C04569s c04569s = this.A06;
        AbstractC0626Ha.A04((c04569s == null || c04569s.A01 == null) ? false : true);
        C04569s c04569s2 = this.A06.A01;
        this.A06 = c04569s2;
        return c04569s2;
    }

    public final C04569s A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C04569s A0F() {
        return this.A04;
    }

    public final C04569s A0G() {
        return this.A05;
    }

    public final C04569s A0H() {
        return this.A06;
    }

    public final C04579t A0I(long j3, C04609w c04609w) {
        C04569s c04569s = this.A04;
        if (c04569s == null) {
            return A05(c04609w);
        }
        return A03(c04569s, j3);
    }

    public final C04579t A0J(C04579t c04579t, int i10) {
        return A04(c04579t, c04579t.A04.A00(i10));
    }

    public final WP A0K(AA[] aaArr, AbstractC0610Gj abstractC0610Gj, InterfaceC0613Gm interfaceC0613Gm, InterfaceC0568Eq interfaceC0568Eq, Object obj, C04579t c04579t) {
        long A07;
        C04569s c04569s = this.A04;
        if (c04569s != null) {
            A07 = c04569s.A07() + this.A04.A02.A01;
            String[] strArr = A0C;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[5] = "XFCrwzIN7SxWEMf0fznSlHt";
            strArr2[7] = "zDOSpelqL3O1zvPqWZMR4dG";
        } else {
            A07 = c04579t.A03;
        }
        C04569s c04569s2 = new C04569s(aaArr, A07, abstractC0610Gj, interfaceC0613Gm, interfaceC0568Eq, obj, c04579t);
        if (this.A04 != null) {
            AbstractC0626Ha.A04(A0P());
            this.A04.A01 = c04569s2;
        }
        this.A08 = null;
        this.A04 = c04569s2;
        this.A00++;
        return c04569s2.A08;
    }

    public final C0566Eo A0L(int i10, long j3) {
        return A07(i10, j3, A00(i10));
    }

    public final void A0M(long j3) {
        C04569s c04569s = this.A04;
        if (c04569s != null) {
            c04569s.A0G(j3);
        }
    }

    public final void A0N(AH ah2) {
        this.A07 = ah2;
    }

    public final void A0O(boolean z10) {
        C04569s A0E = A0E();
        if (A0E != null) {
            this.A08 = z10 ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z10) {
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
        C04569s c04569s = this.A04;
        return c04569s == null || (!c04569s.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != C.TIME_UNSET && this.A00 < 100);
    }

    public final boolean A0R(int i10) {
        this.A01 = i10;
        return A08();
    }

    public final boolean A0S(C04569s c04569s) {
        AbstractC0626Ha.A04(c04569s != null);
        boolean z10 = false;
        String[] strArr = A0C;
        if (strArr[4].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[4] = "VEc";
        strArr2[1] = "0t0";
        this.A04 = c04569s;
        while (c04569s.A01 != null) {
            c04569s = c04569s.A01;
            if (c04569s == this.A06) {
                this.A06 = this.A05;
                z10 = true;
            }
            c04569s.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z10;
    }

    public final boolean A0T(WP wp) {
        C04569s c04569s = this.A04;
        return c04569s != null && c04569s.A08 == wp;
    }

    public final boolean A0U(C0566Eo c0566Eo, long j3) {
        int i10 = c0566Eo.A02;
        C04569s periodHolder = null;
        for (C04569s A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (periodHolder == null) {
                C04579t periodInfo = A0E.A02;
                if (A0C[3].charAt(17) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "pn8srZEQfSJzxw";
                strArr[0] = "zNd";
                A0E.A02 = A0J(periodInfo, i10);
            } else {
                if (i10 == -1 || !A0E.A09.equals(this.A07.A0A(i10, this.A0A, true).A03)) {
                    return true ^ A0S(periodHolder);
                }
                C04579t A03 = A03(periodHolder, j3);
                if (A03 == null) {
                    return true ^ A0S(periodHolder);
                }
                A0E.A02 = A0J(A0E.A02, i10);
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
                i10 = this.A07.A03(i10, this.A0A, this.A0B, this.A01, this.A09);
            }
            periodHolder = A0E;
        }
        return true;
    }

    public final boolean A0V(boolean z10) {
        this.A09 = z10;
        return A08();
    }
}
