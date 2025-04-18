package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0510Ec implements Handler.Callback, XV, InterfaceC0558Gn, Eu, InterfaceC03879e, AB {
    public static byte[] A0V;
    public static String[] A0W = {"P6YxoLhkz5ibpkstopVZVyommDCQ", "ATQddAIWQ0owYjgYaCgc", "Qvf", "B0i3rKbSIcl8mqFdJDuay5LNvvemcw4", "y6g4Ls3CGE757uBbH2iTCdPLcyck5fnI", "NEX", "Ls5ai4PwJPSlX5bzXjpt", "Xwhc7JDkSZbpBXzUBO5xvnc0Yvh1Hw2q"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C03999q A04;
    public A1 A05;
    public Ev A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ZA[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final ZD A0G;
    public final ZB A0H;
    public final InterfaceC04049w A0J;
    public final AK A0L;
    public final AL A0M;
    public final AbstractC0559Go A0N;
    public final C0560Gp A0O;
    public final InterfaceC0579Hi A0P;
    public final InterfaceC0589Hs A0Q;
    public final ArrayList<C03979o> A0R;
    public final boolean A0S;
    public final ZA[] A0T;
    public final AF[] A0U;
    public final C04079z A0K = new C04079z();
    public AI A06 = AI.A04;
    public final C03989p A0I = new C03989p();

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 90);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ec, code lost:
    
        if (r8 == 3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f1, code lost:
    
        if (r14.A0C.length != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f3, code lost:
    
        r8 = A0q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        if (com.instagram.common.viewpoint.core.C0510Ec.A0W[1].length() == 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0103, code lost:
    
        com.instagram.common.viewpoint.core.C0510Ec.A0W[7] = "Pg4wdYPbV6RAArZs6bIYTAeWks45Tt58";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010a, code lost:
    
        if (r8 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0123, code lost:
    
        r14.A09 = r14.A08;
        A0N(2);
        A0H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0117, code lost:
    
        com.instagram.common.viewpoint.core.C0510Ec.A0W[3] = "J56eYHViHFeMgD9oGoA5EmJCsj5r0jg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011e, code lost:
    
        if (r8 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0121, code lost:
    
        if (r11 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0114, code lost:
    
        if (r8 == 3) goto L51;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07() throws com.instagram.common.viewpoint.core.C03909h, java.io.IOException {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0510Ec.A07():void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0E() throws C03909h {
        if (this.A0K.A0P()) {
            float f2 = this.A0G.A85().A01;
            C04059x A0H = this.A0K.A0H();
            boolean z2 = true;
            for (C04059x A0G = this.A0K.A0G(); A0G != null && A0G.A06; A0G = A0G.A01) {
                if (A0G.A0I(f2)) {
                    String[] strArr = A0W;
                    if (strArr[5].length() != strArr[2].length()) {
                        throw new RuntimeException();
                    }
                    A0W[6] = "6mKidZrYKow0BOAnF1OB";
                    if (z2) {
                        C04059x A0G2 = this.A0K.A0G();
                        boolean A0S = this.A0K.A0S(A0G2);
                        boolean[] zArr = new boolean[this.A0T.length];
                        long A0B = A0G2.A0B(this.A05.A0A, A0S, zArr);
                        A0i(A0G2.A03, A0G2.A04);
                        if (this.A05.A00 != 4 && A0B != this.A05.A0A) {
                            this.A05 = this.A05.A04(this.A05.A04, A0B, this.A05.A01);
                            this.A0I.A04(4);
                            A0P(A0B);
                        }
                        int i2 = 0;
                        boolean[] zArr2 = new boolean[this.A0T.length];
                        for (int i3 = 0; i3 < this.A0T.length; i3++) {
                            ZA za = this.A0T[i3];
                            zArr2[i3] = za.A8P() != 0;
                            FG fg = A0G2.A0A[i3];
                            if (fg != null) {
                                i2++;
                            }
                            if (zArr2[i3]) {
                                if (fg != za.A8S()) {
                                    A0b(za);
                                } else if (zArr[i3]) {
                                    za.AFr(this.A03);
                                }
                            }
                        }
                        this.A05 = this.A05.A05(A0G2.A03, A0G2.A04);
                        A0p(zArr2, i2);
                    } else {
                        this.A0K.A0S(A0G);
                        if (A0G.A06) {
                            A0G.A0A(Math.max(A0G.A02.A03, A0G.A08(this.A03)), false);
                            A0i(A0G.A03, A0G.A04);
                        }
                    }
                    if (this.A05.A00 != 4) {
                        A09();
                        A0J();
                        this.A0Q.AGD(2);
                        return;
                    }
                    return;
                }
                if (A0G == A0H) {
                    z2 = false;
                }
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0I() throws C03909h, IOException {
        C0510Ec c0510Ec = this;
        if (c0510Ec.A07 == null) {
            return;
        }
        int i2 = c0510Ec.A01;
        if (A0W[0].length() == 28) {
            A0W[6] = "8D1ARm0ZBQnnZCNoomKo";
            if (i2 > 0) {
                c0510Ec.A07.AAo();
                return;
            }
            A0C();
            C04059x A0F = c0510Ec.A0K.A0F();
            if (A0F == null || A0F.A0H()) {
                c0510Ec.A0k(false);
            } else if (!c0510Ec.A05.A08) {
                A09();
            }
            if (!c0510Ec.A0K.A0P()) {
                return;
            }
            C04059x A0G = c0510Ec.A0K.A0G();
            C04079z c04079z = c0510Ec.A0K;
            if (A0W[3].length() != 1) {
                A0W[1] = "ouJLsfuj4L5l2nuVgaPcx";
                C04059x A0H = c04079z.A0H();
                boolean z2 = false;
                while (c0510Ec.A08 && A0G != A0H && c0510Ec.A03 >= A0G.A01.A00) {
                    if (z2) {
                        A0A();
                    }
                    C04069y c04069y = A0G.A02;
                    if (A0W[1].length() == 3) {
                        throw new RuntimeException();
                    }
                    A0W[7] = "0M30bmT4hYz4ZuhjE8LXlv6wVKZ562xO";
                    int i3 = c04069y.A06 ? 0 : 3;
                    C04059x c04059x = A0G;
                    A0G = c0510Ec.A0K.A0C();
                    c0510Ec.A0V(c04059x);
                    c0510Ec.A05 = c0510Ec.A05.A04(A0G.A02.A04, A0G.A02.A03, A0G.A02.A00);
                    c0510Ec.A0I.A04(i3);
                    A0J();
                    z2 = true;
                }
                if (A0H.A02.A05) {
                    for (int i4 = 0; i4 < c0510Ec.A0T.length; i4++) {
                        ZA za = c0510Ec.A0T[i4];
                        FG fg = A0H.A0A[i4];
                        if (fg != null && za.A8S() == fg) {
                            boolean A8z = za.A8z();
                            if (A0W[7].charAt(28) == 'w') {
                                throw new RuntimeException();
                            }
                            A0W[6] = "vXr9IuCvwlwtM4B4RQ4o";
                            if (A8z) {
                                za.AGO();
                            }
                        }
                    }
                    return;
                }
                if (A0H.A01 == null) {
                    return;
                }
                C04059x c04059x2 = A0H.A01;
                if (A0W[7].charAt(28) != 'w') {
                    A0W[3] = "jJFxzY6mdlXoyZQ0oDOcGo2";
                    if (!c04059x2.A06) {
                        return;
                    }
                } else {
                    A0W[1] = "I";
                    if (!c04059x2.A06) {
                        return;
                    }
                }
                int i5 = 0;
                while (true) {
                    int length = c0510Ec.A0T.length;
                    String[] strArr = A0W;
                    if (strArr[5].length() != strArr[2].length()) {
                        break;
                    }
                    String[] strArr2 = A0W;
                    strArr2[5] = "x3P";
                    strArr2[2] = "8Ip";
                    if (i5 >= length) {
                        C0560Gp c0560Gp = A0H.A04;
                        C04059x A0D = c0510Ec.A0K.A0D();
                        C0560Gp c0560Gp2 = A0D.A04;
                        boolean z3 = A0D.A08.AEo() != -9223372036854775807L;
                        int i6 = 0;
                        while (i6 < c0510Ec.A0T.length) {
                            ZA za2 = c0510Ec.A0T[i6];
                            if (c0560Gp.A00(i6)) {
                                if (z3) {
                                    za2.AGO();
                                } else if (za2.A9N()) {
                                    continue;
                                } else {
                                    InterfaceC0556Gl A00 = c0560Gp2.A01.A00(i6);
                                    boolean A002 = c0560Gp2.A00(i6);
                                    boolean z4 = c0510Ec.A0U[i6].A8a() == 5;
                                    AG ag = c0560Gp.A03[i6];
                                    AG ag2 = c0560Gp2.A03[i6];
                                    if (A002) {
                                        boolean equals = ag2.equals(ag);
                                        if (A0W[0].length() != 28) {
                                            throw new RuntimeException();
                                        }
                                        A0W[1] = "RcCRQWS";
                                        if (equals && !z4) {
                                            za2.AFh(A0v(A00), A0D.A0A[i6], A0D.A07());
                                        }
                                    }
                                    za2.AGO();
                                }
                            }
                            i6++;
                            c0510Ec = this;
                        }
                        return;
                    }
                    ZA za3 = c0510Ec.A0T[i5];
                    FG fg2 = A0H.A0A[i5];
                    if (za3.A8S() != fg2) {
                        return;
                    }
                    if (fg2 != null && !za3.A8z()) {
                        return;
                    } else {
                        i5++;
                    }
                }
            }
        }
        throw new RuntimeException();
    }

    public static void A0K() {
        A0V = new byte[]{-59, -8, -17, -48, -20, -31, -7, -27, -14, -55, -19, -16, -20, -55, -18, -12, -27, -14, -18, -31, -20, -74, -23, -32, -63, -35, -46, -22, -42, -29, -70, -34, -31, -35, -70, -33, -27, -42, -29, -33, -46, -35, -85, -71, -46, -33, -43, -35, -42, -29, -85, -55, -48, -47, -44, -53, -48, -55, -126, -49, -57, -43, -43, -61, -55, -57, -43, -126, -43, -57, -48, -42, -126, -61, -56, -42, -57, -44, -126, -44, -57, -50, -57, -61, -43, -57, -112, 5, 42, 48, 33, 46, 42, 29, 40, -36, 46, 49, 42, 48, 37, 41, 33, -36, 33, 46, 46, 43, 46, -22, 23, 51, 40, 64, 41, 40, 42, 50, -25, 44, 57, 57, 54, 57, -11, -17, 11, 17, 14, -1, 1, -68, 1, 14, 14, 11, 14, -54, -61, -28, -33, -32, -112, -42, -47, -39, -36, -43, -44, -98, -50, -39, -67, -39, -41, -49, -63, -39, -36, -43};
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e3, code lost:
    
        if (r6 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e9, code lost:
    
        if (r9.A01() == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01eb, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ed, code lost:
    
        r14.A05 = r14.A05.A04(r9, A02(r9, r1), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fa, code lost:
    
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0203, code lost:
    
        if (r6 == false) goto L77;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0S(com.instagram.common.viewpoint.core.C03969n r15) throws com.instagram.common.viewpoint.core.C03909h {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0510Ec.A0S(com.facebook.ads.redexgen.X.9n):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(com.instagram.common.viewpoint.core.C03999q r17) throws com.instagram.common.viewpoint.core.C03909h {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0510Ec.A0T(com.facebook.ads.redexgen.X.9q):void");
    }

    static {
        A0K();
    }

    public C0510Ec(ZA[] zaArr, AbstractC0559Go abstractC0559Go, C0560Gp c0560Gp, InterfaceC04049w interfaceC04049w, boolean z2, int i2, boolean z3, Handler handler, ZB zb, InterfaceC0579Hi interfaceC0579Hi) {
        this.A0T = zaArr;
        this.A0N = abstractC0559Go;
        this.A0O = c0560Gp;
        this.A0J = interfaceC04049w;
        this.A08 = z2;
        this.A02 = i2;
        this.A0B = z3;
        this.A0E = handler;
        this.A0H = zb;
        this.A0P = interfaceC0579Hi;
        this.A0D = interfaceC04049w.A6T();
        this.A0S = interfaceC04049w.AFs();
        this.A05 = new A1(AM.A01, -9223372036854775807L, TrackGroupArray.A04, c0560Gp);
        this.A0U = new AF[zaArr.length];
        for (int i3 = 0; i3 < zaArr.length; i3++) {
            zaArr[i3].AGS(i3);
            this.A0U[i3] = zaArr[i3].A6g();
        }
        this.A0G = new ZD(this, interfaceC0579Hi);
        this.A0R = new ArrayList<>();
        this.A0C = new ZA[0];
        this.A0M = new AL();
        this.A0L = new AK();
        abstractC0559Go.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 23), -16);
        this.A0F.start();
        this.A0Q = interfaceC0579Hi.A4y(this.A0F.getLooper(), this);
    }

    private int A00() {
        AM am = this.A05.A03;
        if (am.A0E()) {
            return 0;
        }
        AL A0B = am.A0B(am.A05(this.A0B), this.A0M);
        if (A0W[3].length() == 1) {
            throw new RuntimeException();
        }
        A0W[7] = "PHJg0XpOhfW99vW7Kex5sTOYyXlu8lIY";
        return A0B.A00;
    }

    private int A01(int i2, AM am, AM am2) {
        int i3 = i2;
        int maxIterations = -1;
        int A00 = am.A00();
        for (int i4 = 0; i4 < A00 && maxIterations == -1; i4++) {
            i3 = am.A03(i3, this.A0L, this.A0M, this.A02, this.A0B);
            if (i3 == -1) {
                break;
            }
            maxIterations = am2.A04(am.A0A(i3, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(Et et, long j2) throws C03909h {
        return A03(et, j2, this.A0K.A0G() != this.A0K.A0H());
    }

    private long A03(Et et, long j2, boolean z2) throws C03909h {
        A0H();
        this.A09 = false;
        A0N(2);
        C04059x A0G = this.A0K.A0G();
        C04059x c04059x = A0G;
        while (true) {
            if (c04059x == null) {
                break;
            }
            if (A0t(et, j2, c04059x)) {
                this.A0K.A0S(c04059x);
                break;
            }
            c04059x = this.A0K.A0C();
        }
        if (A0G != c04059x || z2) {
            for (ZA za : this.A0C) {
                A0b(za);
            }
            this.A0C = new ZA[0];
            A0G = null;
        }
        if (c04059x != null) {
            A0V(A0G);
            if (c04059x.A05) {
                j2 = c04059x.A08.AGB(j2);
                c04059x.A08.A5W(j2 - this.A0D, this.A0S);
            }
            A0P(j2);
            if (A0W[3].length() == 1) {
                throw new RuntimeException();
            }
            A0W[0] = "LTHjNlNPyjt4lBWFjaooWNRC6TUk";
            A09();
        } else {
            this.A0K.A0O(true);
            A0P(j2);
        }
        this.A0Q.AGD(2);
        return j2;
    }

    private Pair<Integer, Long> A04(C03999q c03999q, boolean z2) {
        int A01;
        AM am = this.A05.A03;
        AM am2 = c03999q.A02;
        if (am.A0E()) {
            return null;
        }
        if (am2.A0E()) {
            am2 = am;
        }
        try {
            Pair<Integer, Long> A07 = am2.A07(this.A0M, this.A0L, c03999q.A00, c03999q.A01);
            if (am == am2) {
                return A07;
            }
            int A04 = am.A04(am2.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                return Pair.create(Integer.valueOf(A04), (Long) A07.second);
            }
            if (!z2 || (A01 = A01(((Integer) A07.first).intValue(), am2, am)) == -1) {
                return null;
            }
            return A05(am, am.A09(A01, this.A0L).A00, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C04039v(am, c03999q.A00, c03999q.A01);
        }
    }

    private Pair<Integer, Long> A05(AM am, int i2, long j2) {
        return am.A07(this.A0M, this.A0L, i2, j2);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C04059x A0F = this.A0K.A0F();
        long nextLoadPositionUs = A0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean AGi = this.A0J.AGi(nextLoadPositionUs - A0F.A08(this.A03), this.A0G.A85().A01);
        A0k(AGi);
        if (AGi) {
            A0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i2;
        boolean z2;
        int i3;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            i2 = this.A0I.A01;
            z2 = this.A0I.A03;
            if (z2) {
                C03989p c03989p = this.A0I;
                if (A0W[1].length() == 3) {
                    throw new RuntimeException();
                }
                A0W[1] = "RB7sIkNoTcpey07ODT8uORIhWJm";
                i3 = c03989p.A00;
            } else {
                i3 = -1;
            }
            handler.obtainMessage(0, i2, i3, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C04059x A0F = this.A0K.A0F();
        C04059x A0H = this.A0K.A0H();
        if (A0F != null) {
            boolean z2 = A0F.A06;
            if (A0W[4].charAt(4) == 'c') {
                throw new RuntimeException();
            }
            A0W[7] = "N5Rg0nMtUPutdorU0pcWvntmMyKPkn9g";
            if (!z2) {
                if (A0H != null) {
                    C04059x loadingPeriodHolder = A0H.A01;
                    if (loadingPeriodHolder != A0F) {
                        return;
                    }
                }
                for (ZA za : this.A0C) {
                    if (!za.A8z()) {
                        return;
                    }
                }
                A0F.A08.AAn();
            }
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C04069y A0I = this.A0K.A0I(this.A03, this.A05);
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0W[3] = "fu6rtQYuGz66gCmV8yC70qEpQFTVY";
            if (A0I == null) {
                this.A07.AAo();
                return;
            }
            XU mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A6O(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I);
            mediaPeriod.AEX(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ADK();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C03909h {
        this.A09 = false;
        this.A0G.A05();
        for (ZA za : this.A0C) {
            za.start();
        }
    }

    private void A0H() throws C03909h {
        this.A0G.A06();
        for (ZA za : this.A0C) {
            A0c(za);
        }
    }

    private void A0J() throws C03909h {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C04059x A0G = this.A0K.A0G();
        long AEo = A0G.A08.AEo();
        if (AEo != -9223372036854775807L) {
            A0P(AEo);
            if (AEo != this.A05.A0A) {
                this.A05 = this.A05.A04(this.A05.A04, AEo, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long A08 = A0G.A08(this.A03);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        A1 a12 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        a12.A09 = A0C;
    }

    private void A0L(float f2) {
        for (C04059x A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            C0560Gp c0560Gp = A0E.A04;
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[5] = "3Do";
            strArr2[2] = "at3";
            if (c0560Gp != null) {
                for (InterfaceC0556Gl interfaceC0556Gl : A0E.A04.A01.A01()) {
                    if (interfaceC0556Gl != null) {
                        interfaceC0556Gl.AD5(f2);
                    }
                }
            }
        }
    }

    private void A0M(int i2) throws C03909h {
        this.A02 = i2;
        if (!this.A0K.A0R(i2)) {
            A0j(true);
        }
    }

    private void A0N(int i2) {
        if (this.A05.A00 != i2) {
            this.A05 = this.A05.A02(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (r18 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        if (r18 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0O(int r17, boolean r18, int r19) throws com.instagram.common.viewpoint.core.C03909h {
        /*
            r16 = this;
            r3 = r16
            com.facebook.ads.redexgen.X.9z r0 = r3.A0K
            com.facebook.ads.redexgen.X.9x r4 = r0.A0G()
            com.facebook.ads.redexgen.X.ZA[] r0 = r3.A0T
            r5 = r17
            r7 = r0[r5]
            com.facebook.ads.redexgen.X.ZA[] r0 = r3.A0C
            r0[r19] = r7
            int r0 = r7.A8P()
            if (r0 != 0) goto L79
            com.facebook.ads.redexgen.X.Gp r0 = r4.A04
            com.facebook.ads.redexgen.X.AG[] r0 = r0.A03
            r8 = r0[r5]
            com.facebook.ads.redexgen.X.Gp r0 = r4.A04
            com.facebook.ads.redexgen.X.Gm r0 = r0.A01
            com.facebook.ads.redexgen.X.Gl r0 = r0.A00(r5)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r9 = A0v(r0)
            boolean r0 = r3.A08
            if (r0 == 0) goto L8b
            com.facebook.ads.redexgen.X.A1 r0 = r3.A05
            int r6 = r0.A00
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C0510Ec.A0W
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0510Ec.A0W
            java.lang.String r1 = "QRz84tIq3wllCeb1capmh87EbVgo0fYM"
            r0 = 4
            r2[r0] = r1
            r0 = 3
            if (r6 != r0) goto L8b
            r6 = 1
        L49:
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C0510Ec.A0W
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 28
            if (r1 == r0) goto L7a
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0510Ec.A0W
            java.lang.String r1 = "nWHC8GobiUTV1BRDhLkuPrvX5"
            r0 = 1
            r2[r0] = r1
            if (r18 != 0) goto L89
        L5f:
            if (r6 == 0) goto L89
            r13 = 1
        L62:
            com.facebook.ads.redexgen.X.FG[] r0 = r4.A0A
            r10 = r0[r5]
            long r11 = r3.A03
            long r14 = r4.A07()
            r7.A5r(r8, r9, r10, r11, r13, r14)
            com.facebook.ads.redexgen.X.ZD r0 = r3.A0G
            r0.A09(r7)
            if (r6 == 0) goto L79
            r7.start()
        L79:
            return
        L7a:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0510Ec.A0W
            java.lang.String r1 = "o7g"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "UGX"
            r0 = 2
            r2[r0] = r1
            if (r18 != 0) goto L89
            goto L5f
        L89:
            r13 = 0
            goto L62
        L8b:
            r6 = 0
            goto L49
        L8d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0510Ec.A0O(int, boolean, int):void");
    }

    private void A0P(long j2) throws C03909h {
        if (this.A0K.A0P()) {
            j2 = this.A0K.A0G().A09(j2);
        }
        this.A03 = j2;
        this.A0G.A07(this.A03);
        for (ZA za : this.A0C) {
            za.AFr(this.A03);
            if (A0W[7].charAt(28) == 'w') {
                throw new RuntimeException();
            }
            A0W[6] = "Dkk1xe1nETG6SQ7gXcWE";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        if (r5 >= r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        r0 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c0, code lost:
    
        if (r0 != r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r3.A01 > r8) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c8, code lost:
    
        r0 = r7.A00;
        r7.A00 = r0 + 1;
        r1 = r7.A00;
        r0 = r7.A0R.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d6, code lost:
    
        if (r1 >= r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e3, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d8, code lost:
    
        r1 = r7.A0R;
        r0 = r7.A00;
        r3 = r1.get(r0);
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e5, code lost:
    
        if (r5 >= r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0Q(long r8, long r10) throws com.instagram.common.viewpoint.core.C03909h {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0510Ec.A0Q(long, long):void");
    }

    private void A0R(long j2, long j3) {
        this.A0Q.AFb(2);
        this.A0Q.AGE(2, j2 + j3);
    }

    private void A0V(C04059x c04059x) throws C03909h {
        C04059x A0G = this.A0K.A0G();
        if (A0G == null || c04059x == A0G) {
            return;
        }
        int i2 = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        for (int i3 = 0; i3 < this.A0T.length; i3++) {
            ZA za = this.A0T[i3];
            zArr[i3] = za.A8P() != 0;
            if (A0G.A04.A00(i3)) {
                i2++;
            }
            if (zArr[i3] && (!A0G.A04.A00(i3) || (za.A9N() && za.A8S() == c04059x.A0A[i3]))) {
                A0b(za);
            }
        }
        this.A05 = this.A05.A05(A0G.A03, A0G.A04);
        A0p(zArr, i2);
    }

    private void A0W(A2 a2) {
        this.A0G.AGa(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(AD ad) throws C03909h {
        if (ad.A0D()) {
            return;
        }
        try {
            ad.A04().A8t(ad.A00(), ad.A09());
        } finally {
            ad.A0A(true);
        }
    }

    private void A0Y(AD ad) throws C03909h {
        if (ad.A02() == -9223372036854775807L) {
            A0Z(ad);
            return;
        }
        if (this.A07 != null) {
            int i2 = this.A01;
            if (A0W[0].length() != 28) {
                throw new RuntimeException();
            }
            A0W[1] = "o1ZfKzJk47hV";
            if (i2 <= 0) {
                C03979o c03979o = new C03979o(ad);
                if (!A0r(c03979o)) {
                    if (A0W[7].charAt(28) != 'w') {
                        A0W[3] = "aTDMkEWwCUERProrJoKbugoPR0RLmehL";
                        ad.A0A(false);
                        return;
                    } else {
                        A0W[7] = "nEAZXjO4i2eVoKfOQOzMBl4A0pmuVndx";
                        ad.A0A(false);
                        return;
                    }
                }
                ArrayList<C03979o> arrayList = this.A0R;
                if (A0W[7].charAt(28) == 'w') {
                    A0W[7] = "fj1HQu0C9Tc3paKg3KNI1jKNCUFeknU2";
                    arrayList.add(c03979o);
                    Collections.sort(this.A0R);
                    return;
                } else {
                    A0W[6] = "0jg7HAqbvnSBdqVDarqZ";
                    arrayList.add(c03979o);
                    Collections.sort(this.A0R);
                    return;
                }
            }
        }
        this.A0R.add(new C03979o(ad));
    }

    private void A0Z(AD ad) throws C03909h {
        if (ad.A03().getLooper() == this.A0Q.A7j()) {
            A0X(ad);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AGD(2);
                return;
            }
            return;
        }
        this.A0Q.AB1(15, ad).sendToTarget();
    }

    private void A0a(final AD ad) {
        ad.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9m
            public static byte[] A02;
            public static String[] A03 = {"vvB9T8WK7bT4nFgbnm6TlGuNwpdmRtb5", "Hfw1oyg0BzWOVhb4zu8ELKkOELcM4f2B", "gmAcFU6mn3n0PFSsnO8fNJkU01ktZa8U", "xgpG2bMc1aVEQfTVOGXM8sfGOtJMcFPH", "2GhavpyJFuEpD", "Q3SxFnadra2JweXV0TQ7pCIkPNwW6CrH", "wegMd5NqqvgJ45W9ANASZrnEtp1A2mXR", "ALPTKzTzzHlEJ12cQtwgMkt"};

            public static String A00(int i2, int i3, int i4) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    int i6 = (copyOfRange[i5] ^ i4) ^ 5;
                    String[] strArr = A03;
                    if (strArr[3].charAt(9) != strArr[5].charAt(9)) {
                        throw new RuntimeException();
                    }
                    A03[4] = "6EUX3tXbFxVZ50ys6tGf1eJDZb";
                    copyOfRange[i5] = (byte) i6;
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{103, 90, 77, 114, 78, 67, 91, 71, 80, 107, 79, 82, 78, 107, 76, 86, 71, 80, 76, 67, 78, 70, 125, 118, 107, 99, 118, 112, 103, 118, 119, 51, 118, 97, 97, 124, 97, 51, 119, 118, Byte.MAX_VALUE, 122, 101, 118, 97, 122, 125, 116, 51, 126, 118, 96, 96, 114, 116, 118, 51, 124, 125, 51, 118, 107, 103, 118, 97, 125, 114, Byte.MAX_VALUE, 51, 103, 123, 97, 118, 114, 119, 61};
            }

            static {
                A01();
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (KQ.A02(this)) {
                    return;
                }
                try {
                    try {
                        C0510Ec.this.A0X(ad);
                    } catch (C03909h e) {
                        Log.e(A00(0, 21, 39), A00(21, 55, 22), e);
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    KQ.A00(th, this);
                }
            }
        });
    }

    private void A0b(ZA za) throws C03909h {
        this.A0G.A08(za);
        A0c(za);
        za.A5U();
    }

    private void A0c(ZA za) throws C03909h {
        if (za.A8P() == 2) {
            za.stop();
        }
    }

    private void A0d(AI ai) {
        this.A06 = ai;
    }

    private void A0e(XU xu) {
        if (!this.A0K.A0T(xu)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(XU xu) throws C03909h {
        if (!this.A0K.A0T(xu)) {
            return;
        }
        C04059x A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A85().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            C04059x loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.FH
    /* renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void ABd(XU xu) {
        this.A0Q.AB1(10, xu).sendToTarget();
    }

    private void A0h(Ev ev, boolean z2, boolean z3) {
        this.A01++;
        A0o(true, z2, z3);
        this.A0J.onPrepared();
        this.A07 = ev;
        A0N(2);
        ev.AEa(this.A0H, true, this);
        this.A0Q.AGD(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, C0560Gp c0560Gp) {
        this.A0J.ADq(this.A0T, trackGroupArray, c0560Gp.A01);
    }

    private void A0j(boolean z2) throws C03909h {
        Et et = this.A0K.A0G().A02.A04;
        long A03 = A03(et, this.A05.A0A, true);
        if (A03 != this.A05.A0A) {
            this.A05 = this.A05.A04(et, A03, this.A05.A01);
            if (z2) {
                C03989p c03989p = this.A0I;
                if (A0W[7].charAt(28) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "WBZ5bLJSEJN5yb0YmqU0";
                c03989p.A04(4);
            }
        }
    }

    private void A0k(boolean z2) {
        if (this.A05.A08 != z2) {
            this.A05 = this.A05.A06(z2);
        }
    }

    private void A0l(boolean z2) throws C03909h {
        this.A09 = false;
        this.A08 = z2;
        if (!z2) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AGD(2);
        } else {
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AGD(2);
        }
    }

    private void A0m(boolean z2) throws C03909h {
        this.A0B = z2;
        if (!this.A0K.A0V(z2)) {
            A0j(true);
        }
    }

    private void A0n(boolean z2, boolean z3) {
        A0o(true, z2, z2);
        this.A0I.A03(this.A01 + (z3 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ADi();
        A0N(1);
    }

    private void A0o(boolean z2, boolean z3, boolean z4) {
        Object obj;
        long j2;
        C0560Gp c0560Gp;
        this.A0Q.AFb(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (ZA za : this.A0C) {
            try {
                A0b(za);
            } catch (C03909h | RuntimeException e) {
                Log.e(A06(0, 21, 38), A06(Opcodes.L2D, 12, 22), e);
            }
        }
        this.A0C = new ZA[0];
        this.A0K.A0O(!z3);
        A0k(false);
        if (z3) {
            this.A04 = null;
        }
        if (z4) {
            this.A0K.A0N(AM.A01);
            Iterator<C03979o> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AM am = z4 ? AM.A01 : this.A05.A03;
        if (z4) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        Et et = z3 ? new Et(A00()) : this.A05.A04;
        long j3 = -9223372036854775807L;
        if (z3) {
            j2 = -9223372036854775807L;
        } else {
            j2 = this.A05.A0A;
        }
        if (!z3) {
            j3 = this.A05.A01;
        }
        int i2 = this.A05.A00;
        TrackGroupArray trackGroupArray = z4 ? TrackGroupArray.A04 : this.A05.A05;
        if (z4) {
            c0560Gp = this.A0O;
        } else {
            c0560Gp = this.A05.A06;
        }
        this.A05 = new A1(am, obj, et, j2, j3, i2, false, trackGroupArray, c0560Gp);
        if (z2) {
            Ev ev = this.A07;
            if (A0W[7].charAt(28) == 'w') {
                throw new RuntimeException();
            }
            A0W[0] = "lRj2b7Ec0CIz5iiX5eE2KmWgCFvN";
            if (ev != null) {
                this.A07.AF4(this);
                this.A07 = null;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0p(boolean[] r9, int r10) throws com.instagram.common.viewpoint.core.C03909h {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.ZA[] r0 = new com.instagram.common.viewpoint.core.ZA[r10]
            r8.A0C = r0
            r7 = 0
            com.facebook.ads.redexgen.X.9z r0 = r8.A0K
            com.facebook.ads.redexgen.X.9x r6 = r0.A0G()
            r5 = 0
        Lc:
            com.facebook.ads.redexgen.X.ZA[] r0 = r8.A0T
            int r0 = r0.length
            if (r5 >= r0) goto L3f
            com.facebook.ads.redexgen.X.Gp r0 = r6.A04
            boolean r0 = r0.A00(r5)
            if (r0 == 0) goto L36
            boolean r4 = r9[r5]
            int r3 = r7 + 1
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C0510Ec.A0W
            r0 = 4
            r1 = r1[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            r0 = 99
            if (r1 == r0) goto L39
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0510Ec.A0W
            java.lang.String r1 = "b6AxkSDoOdacq7WM3wR6"
            r0 = 6
            r2[r0] = r1
            r8.A0O(r5, r4, r7)
            r7 = r3
        L36:
            int r5 = r5 + 1
            goto Lc
        L39:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0510Ec.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C04059x A0G = this.A0K.A0G();
        long j2 = A0G.A02.A01;
        if (j2 != -9223372036854775807L) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j2) {
                C04059x playingPeriodHolder = A0G.A01;
                if (playingPeriodHolder != null) {
                    C04059x playingPeriodHolder2 = A0G.A01;
                    if (!playingPeriodHolder2.A06) {
                        C04059x playingPeriodHolder3 = A0G.A01;
                        if (playingPeriodHolder3.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C03979o c03979o) {
        if (c03979o.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C03999q(c03979o.A03.A08(), c03979o.A03.A01(), AbstractC03849b.A00(c03979o.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            c03979o.A01(((Integer) A04.first).intValue(), ((Long) A04.second).longValue(), this.A05.A03.A0A(((Integer) A04.first).intValue(), this.A0L, true).A03);
        } else {
            int A042 = this.A05.A03.A04(c03979o.A02);
            if (A042 == -1) {
                return false;
            }
            c03979o.A00 = A042;
        }
        return true;
    }

    private boolean A0s(ZA za) {
        C04059x A0H = this.A0K.A0H();
        C04059x readingPeriodHolder = A0H.A01;
        if (readingPeriodHolder != null) {
            C04059x readingPeriodHolder2 = A0H.A01;
            if (readingPeriodHolder2.A06 && za.A8z()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(Et et, long j2, C04059x c04059x) {
        if (et.equals(c04059x.A02.A04) && c04059x.A06) {
            this.A05.A03.A09(c04059x.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j2);
            if (A04 == -1 || this.A0L.A09(A04) == c04059x.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0u(boolean z2) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z2) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        C04059x A0F = this.A0K.A0F();
        long A0C = A0F.A0C(!A0F.A02.A05);
        if (A0C != Long.MIN_VALUE) {
            InterfaceC04049w interfaceC04049w = this.A0J;
            long A08 = A0C - A0F.A08(this.A03);
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0W[6] = "2cwTC9SumZz3To3yr3ji";
            if (!interfaceC04049w.AGl(A08, this.A0G.A85().A01, this.A09)) {
                return false;
            }
        }
        return true;
    }

    public static Format[] A0v(InterfaceC0556Gl interfaceC0556Gl) {
        int length = interfaceC0556Gl != null ? interfaceC0556Gl.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            Format A7U = interfaceC0556Gl.A7U(i2);
            if (A0W[3].length() == 1) {
                throw new RuntimeException();
            }
            A0W[6] = "MMfeLMq0kgXNQLSglZMb";
            formatArr[i2] = A7U;
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x0010 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A0x() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L7
            monitor-exit(r2)
            return
        L7:
            com.facebook.ads.redexgen.X.Hs r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AGD(r0)     // Catch: java.lang.Throwable -> L23
            r1 = 0
        Le:
            boolean r0 = r2.A0A     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L18
            r2.wait()     // Catch: java.lang.InterruptedException -> L16 java.lang.Throwable -> L23
            goto Le
        L16:
            r1 = 1
            goto Le
        L18:
            if (r1 == 0) goto L21
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L23
            r0.interrupt()     // Catch: java.lang.Throwable -> L23
        L21:
            monitor-exit(r2)
            return
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0510Ec.A0x():void");
    }

    public final void A0y(AM am, int i2, long j2) {
        this.A0Q.AB1(3, new C03999q(am, i2, j2)).sendToTarget();
    }

    public final void A0z(Ev ev, boolean z2, boolean z3) {
        this.A0Q.AB0(0, z2 ? 1 : 0, z3 ? 1 : 0, ev).sendToTarget();
    }

    public final void A10(boolean z2) {
        this.A0Q.AAz(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z2) {
        this.A0Q.AAz(6, z2 ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03879e
    public final void AD4(A2 a2) {
        this.A0E.obtainMessage(1, a2).sendToTarget();
        A0L(a2.A01);
    }

    @Override // com.instagram.common.viewpoint.core.XV
    public final void ADC(XU xu) {
        this.A0Q.AB1(9, xu).sendToTarget();
    }

    @Override // com.instagram.common.viewpoint.core.Eu
    public final void ADd(Ev ev, AM am, Object obj) {
        this.A0Q.AB1(8, new C03969n(ev, am, obj)).sendToTarget();
    }

    @Override // com.instagram.common.viewpoint.core.AB
    public final synchronized void AGF(AD ad) {
        if (this.A0A) {
            Log.w(A06(0, 21, 38), A06(50, 37, 8));
            ad.A0A(false);
        } else {
            this.A0Q.AB1(14, ad).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 38);
        try {
            switch (message.what) {
                case 0:
                    A0h((Ev) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C03999q) message.obj);
                    break;
                case 4:
                    A0W((A2) message.obj);
                    break;
                case 5:
                    A0d((AI) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C03969n) message.obj);
                    break;
                case 9:
                    A0f((XU) message.obj);
                    break;
                case 10:
                    A0e((XU) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((AD) message.obj);
                    break;
                case 15:
                    A0a((AD) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C03909h e) {
            Log.e(A06, A06(110, 15, 109), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(A06, A06(Opcodes.LUSHR, 13, 66), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, C03909h.A00(e2)).sendToTarget();
            A0A();
        } catch (RuntimeException e3) {
            Log.e(A06, A06(87, 23, 98), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, C03909h.A02(e3)).sendToTarget();
            String[] strArr = A0W;
            if (strArr[5].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0W[4] = "bcAD6CyDV16TZBS92I3KgCtMo20e3K69";
            A0A();
        }
        return true;
    }
}
