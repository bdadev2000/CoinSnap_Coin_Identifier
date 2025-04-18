package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public final class EI implements Handler.Callback, WQ, InterfaceC0609Gi, InterfaceC0567Ep, C9Z, A6 {
    public static byte[] A0V;
    public static String[] A0W = {"TSIQGmaqgvrUxo0yYDewkVNDuuioOpPV", "LhstooR1wZsH8RVMZSyyF7FJZ5wrHutR", "WZmkRBn8iXpnqDBIN644YOqcruHieEQJ", "OBm1ApV8rqkCiyt7FxArHXpNA0", "RSLtmQKc5IgtmDXEpea3qKBmF", "cT5hSyxhu4oYAFMn61C1ja3cHbuAf9wl", "QQz6Qig88n9IGtqyO", "pBG4ezF2k8D44jdvacVEPM0q7VNUtk0G"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C04509l A04;
    public C04609w A05;
    public InterfaceC0568Eq A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public Y5[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final Y8 A0G;
    public final Y6 A0H;
    public final InterfaceC04559r A0J;
    public final AF A0L;
    public final AG A0M;
    public final AbstractC0610Gj A0N;
    public final C0611Gk A0O;
    public final InterfaceC0629Hd A0P;
    public final InterfaceC0639Hn A0Q;
    public final ArrayList<C04489j> A0R;
    public final boolean A0S;
    public final Y5[] A0T;
    public final AA[] A0U;
    public final C04589u A0K = new C04589u();
    public AD A06 = AD.A03;
    public final C04499k A0I = new C04499k();

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A07() throws C04419c, IOException {
        long AGs = this.A0P.AGs();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(AGs, 10L);
            return;
        }
        C04569s A0G = this.A0K.A0G();
        IC.A02(A06(150, 10, 20));
        A0J();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        A0G.A08.A5A(this.A05.A0A - this.A0D, this.A0S);
        boolean z10 = true;
        boolean z11 = true;
        for (Y5 y52 : this.A0C) {
            y52.AFB(this.A03, elapsedRealtime);
            boolean z12 = true;
            z10 = z10 && y52.A91();
            boolean z13 = y52.A9C() || y52.A91() || A0s(y52);
            if (!z13) {
                y52.AAP();
            }
            if (!z11 || !z13) {
                z12 = false;
            }
            z11 = z12;
        }
        if (!z11) {
            A0B();
        }
        long j3 = A0G.A02.A01;
        if (z10 && ((j3 == C.TIME_UNSET || j3 <= this.A05.A0A) && A0G.A02.A05)) {
            A0N(4);
            A0H();
        } else if (this.A05.A00 == 2 && A0u(z11)) {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        } else if (this.A05.A00 == 3) {
            int length = this.A0C.length;
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "Eggx5Ft4Lgnx6HVrotcHBkscR";
            strArr2[3] = "Urp4oA4mdP1paz0o5Y10JqXrCe";
            if (length != 0 ? !z11 : !A0q()) {
                this.A09 = this.A08;
                A0N(2);
                A0H();
            }
        }
        if (this.A05.A00 == 2) {
            for (Y5 y53 : this.A0C) {
                y53.AAP();
            }
        }
        boolean z14 = this.A08;
        if (A0W[7].charAt(9) != '8') {
            throw new RuntimeException();
        }
        A0W[5] = "rTELFOhgZqImPwKgVJI0nXuoysvpkaxO";
        if ((z14 && this.A05.A00 == 3) || this.A05.A00 == 2) {
            A0R(AGs, 10L);
        } else if (this.A0C.length == 0 || this.A05.A00 == 4) {
            this.A0Q.AF8(2);
        } else {
            A0R(AGs, 1000L);
        }
        IC.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r6 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r7 = r14.A0K.A0G();
        r2 = r14.A0K.A0S(r7);
        r6 = new boolean[r14.A0T.length];
        r10 = r7.A0B(r14.A05.A0A, r2, r6);
        A0i(r7.A03, r7.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r14.A05.A00 == 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r10 == r14.A05.A0A) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        r8 = r14.A05;
        r14.A05 = r8.A04(r8.A04, r10, r14.A05.A01);
        r14.A0I.A04(4);
        A0P(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (com.facebook.ads.redexgen.uinode.EI.A0W[2].charAt(12) == 'N') goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.EI.A0W;
        r2[1] = "v6rigB8My08mC5ZvZtTcxONYTtnHkhiY";
        r2[0] = "jJJ7EyTzSHhVUQBMBNjuu6IlWzfsi9o6";
        r8 = new boolean[r14.A0T.length];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        r1 = r14.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        if (r10 >= r1.length) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        r11 = r1[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        if (r11.A81() == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        r8[r10] = r0;
        r1 = r7.A0A[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e4, code lost:
    
        if (r8[r10] == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        if (r1 == r11.A84()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
    
        A0b(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ef, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
    
        if (r6[r10] == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f6, code lost:
    
        r4 = r14.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:
    
        if (com.facebook.ads.redexgen.uinode.EI.A0W[5].charAt(1) == 'w') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0106, code lost:
    
        com.facebook.ads.redexgen.uinode.EI.A0W[7] = "kUW5tsmcM8CZIAjkj84TOGdyZAx2gWc6";
        r11.AFN(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a3, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0111, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0133, code lost:
    
        r14.A05 = r14.A05.A05(r7.A03, r7.A04);
        A0p(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        com.facebook.ads.redexgen.uinode.EI.A0W[7] = "5RhHFxqKf8KludlSzI9zDK8m295dvAFV";
        r8 = new boolean[r14.A0T.length];
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        r14.A0K.A0S(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        if (r5.A06 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        r5.A0A(java.lang.Math.max(r5.A02.A03, r5.A08(r14.A03)), false);
        A0i(r5.A03, r5.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0128, code lost:
    
        if (r6 != false) goto L20;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0E() throws com.facebook.ads.redexgen.uinode.C04419c {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0E():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        if (r8.A8y() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:
    
        r10 = r5.A01.A00(r4);
        r9 = r5.A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a8, code lost:
    
        if (r3.A0U[r4].A8C() != 5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01aa, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ab, code lost:
    
        r1 = r7.A03[r4];
        r0 = r5.A03[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b3, code lost:
    
        if (r9 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b9, code lost:
    
        if (r0.equals(r1) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        if (r2 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bd, code lost:
    
        r8.AFD(A0v(r10), r6.A0A[r4], r6.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cf, code lost:
    
        r8.AFy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cd, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d4, code lost:
    
        if (r4 >= r8.length) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d7, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00fe, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r6 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (r6 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r4.A02.A05 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r1 = r3.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r5 >= r1.length) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r2 = r1[r5];
        r1 = r4.A0A[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        if (r1 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        if (r2.A84() != r1) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
    
        if (r2.A8a() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        r2.AFy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        if (r4.A01 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
    
        if (r4.A01.A06 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0100, code lost:
    
        r1 = r3.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
    
        if (r6 >= r1.length) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0105, code lost:
    
        r8 = r1[r6];
        r7 = r4.A0A[r6];
        r5 = r8.A84();
        r2 = com.facebook.ads.redexgen.uinode.EI.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:
    
        if (r2[1].charAt(10) == r2[0].charAt(10)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0123, code lost:
    
        com.facebook.ads.redexgen.uinode.EI.A0W[2] = "GzZd6F7lJVp08TeGQitpN19OrvCnG4PK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:
    
        if (r5 != r7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        if (r7 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
    
        if (r8.A8a() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0134, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0138, code lost:
    
        com.facebook.ads.redexgen.uinode.EI.A0W[5] = "G5Kl7lcZBM87T4fNUwO1IYVdGnNcsgpo";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013f, code lost:
    
        if (r5 != r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        r7 = r4.A04;
        r6 = r3.A0K.A0D();
        r5 = r6.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0159, code lost:
    
        if (r6.A08.AEL() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x015b, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015c, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
    
        r8 = r3.A0T;
        r2 = com.facebook.ads.redexgen.uinode.EI.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0171, code lost:
    
        if (r2[1].charAt(10) == r2[0].charAt(10)) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0173, code lost:
    
        com.facebook.ads.redexgen.uinode.EI.A0W[5] = "zgqvIFw9hHXttypZtkJx3efsgqUZ32NO";
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017b, code lost:
    
        if (r4 >= r8.length) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017d, code lost:
    
        r8 = r8[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0183, code lost:
    
        if (r7.A00(r4) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0189, code lost:
    
        if (r11 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018b, code lost:
    
        r8.AFy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0185, code lost:
    
        r4 = r4 + 1;
        r3 = r12;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0I() throws com.facebook.ads.redexgen.uinode.C04419c, java.io.IOException {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0I():void");
    }

    public static void A0K() {
        byte[] bArr = {68, 121, 110, 81, 109, 96, 120, 100, 115, 72, 108, 113, 109, 72, 111, 117, 100, 115, 111, 96, 109, 111, 82, 69, 122, 70, 75, 83, 79, 88, 99, 71, 90, 70, 99, 68, 94, 79, 88, 68, 75, 70, Ascii.DLE, 98, 75, 68, 78, 70, 79, 88, 66, 108, 101, 100, 121, 98, 101, 108, 43, 102, 110, 120, 120, 106, 108, 110, 120, 43, 120, 110, 101, Byte.MAX_VALUE, 43, 106, 109, Byte.MAX_VALUE, 110, 121, 43, 121, 110, 103, 110, 106, 120, 110, 37, 69, 98, 120, 105, 126, 98, 109, 96, 44, 126, 121, 98, 120, 101, 97, 105, 44, 105, 126, 126, 99, 126, 34, Ascii.CAN, 36, 41, 49, 42, 41, 43, 35, 104, 45, 58, 58, 39, 58, 102, 74, 118, 108, 107, 122, 124, 57, 124, 107, 107, 118, 107, 55, 72, 111, 116, 107, 59, 125, 122, 114, 119, 126, Byte.MAX_VALUE, 53, 90, 81, 109, 81, 83, 91, 105, 81, 76, 85};
        String[] strArr = A0W;
        if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
            throw new RuntimeException();
        }
        A0W[7] = "OuUcfGxYs8HKuxzYIQS3N8YCcqwYwO9D";
        A0V = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0S(C04479i c04479i) throws C04419c {
        if (c04479i.A01 != this.A07) {
            return;
        }
        AH ah2 = this.A05.A03;
        AH ah3 = c04479i.A00;
        Object obj = c04479i.A02;
        this.A0K.A0N(ah3);
        this.A05 = this.A05.A03(ah3, obj);
        A0F();
        int i10 = this.A01;
        if (i10 > 0) {
            this.A0I.A03(i10);
            this.A01 = 0;
            C04509l c04509l = this.A04;
            if (c04509l != null) {
                Pair<Integer, Long> A04 = A04(c04509l, true);
                this.A04 = null;
                if (A04 == null) {
                    A08();
                    return;
                }
                int intValue = ((Integer) A04.first).intValue();
                long longValue = ((Long) A04.second).longValue();
                C0566Eo A0L = this.A0K.A0L(intValue, longValue);
                this.A05 = this.A05.A04(A0L, A0L.A01() ? 0L : longValue, longValue);
                return;
            }
            if (this.A05.A02 == C.TIME_UNSET) {
                if (ah3.A0E()) {
                    A08();
                    return;
                }
                Pair<Integer, Long> A05 = A05(ah3, ah3.A05(this.A0B), C.TIME_UNSET);
                int intValue2 = ((Integer) A05.first).intValue();
                long longValue2 = ((Long) A05.second).longValue();
                C0566Eo A0L2 = this.A0K.A0L(intValue2, longValue2);
                this.A05 = this.A05.A04(A0L2, A0L2.A01() ? 0L : longValue2, longValue2);
                return;
            }
            return;
        }
        int i11 = this.A05.A04.A02;
        long j3 = this.A05.A01;
        if (ah2.A0E()) {
            if (ah3.A0E()) {
                return;
            }
            C0566Eo A0L3 = this.A0K.A0L(i11, j3);
            this.A05 = this.A05.A04(A0L3, A0L3.A01() ? 0L : j3, j3);
            return;
        }
        C04569s A0E = this.A0K.A0E();
        int A042 = ah3.A04(A0E == null ? ah2.A0A(i11, this.A0L, true).A03 : A0E.A09);
        if (A042 != -1) {
            if (A042 != i11) {
                this.A05 = this.A05.A01(A042);
            }
            C0566Eo c0566Eo = this.A05.A04;
            if (c0566Eo.A01()) {
                C0566Eo A0L4 = this.A0K.A0L(A042, j3);
                if (!A0L4.equals(c0566Eo)) {
                    this.A05 = this.A05.A04(A0L4, A02(A0L4, A0L4.A01() ? 0L : j3), j3);
                    return;
                }
            }
            if (this.A0K.A0U(c0566Eo, this.A03)) {
                return;
            }
            A0j(false);
            return;
        }
        int A01 = A01(i11, ah2, ah3);
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[4] = "W6zkXP9eIZkyJx4uPbHf9NTX6";
        strArr[3] = "m3yrwIeXeqUIkhQgLJp1WNCsrl";
        if (A01 == -1) {
            A08();
            return;
        }
        Pair<Integer, Long> A052 = A05(ah3, ah3.A09(A01, this.A0L).A00, C.TIME_UNSET);
        int intValue3 = ((Integer) A052.first).intValue();
        long longValue3 = ((Long) A052.second).longValue();
        C0566Eo A0L5 = this.A0K.A0L(intValue3, longValue3);
        ah3.A0A(intValue3, this.A0L, true);
        if (A0E != null) {
            Object obj2 = this.A0L.A03;
            A0E.A02 = A0E.A02.A00(-1);
            while (A0E.A01 != null) {
                A0E = A0E.A01;
                if (A0E.A09.equals(obj2)) {
                    C04589u c04589u = this.A0K;
                    C04579t c04579t = A0E.A02;
                    if (A0W[2].charAt(12) == 'N') {
                        throw new RuntimeException();
                    }
                    A0W[5] = "ODoCru5Men7rnsumvsVlRJsOWyiHNrdt";
                    A0E.A02 = c04589u.A0J(c04579t, intValue3);
                } else {
                    A0E.A02 = A0E.A02.A00(-1);
                }
            }
        }
        boolean A012 = A0L5.A01();
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "hRbRvIJE18IQkSZp4h0fxN12mLMfZDhd";
        this.A05 = this.A05.A04(A0L5, A02(A0L5, A012 ? 0L : longValue3), longValue3);
    }

    static {
        A0K();
    }

    public EI(Y5[] y5Arr, AbstractC0610Gj abstractC0610Gj, C0611Gk c0611Gk, InterfaceC04559r interfaceC04559r, boolean z10, int i10, boolean z11, Handler handler, Y6 y62, InterfaceC0629Hd interfaceC0629Hd) {
        this.A0T = y5Arr;
        this.A0N = abstractC0610Gj;
        this.A0O = c0611Gk;
        this.A0J = interfaceC04559r;
        this.A08 = z10;
        this.A02 = i10;
        this.A0B = z11;
        this.A0E = handler;
        this.A0H = y62;
        this.A0P = interfaceC0629Hd;
        this.A0D = interfaceC04559r.A65();
        this.A0S = interfaceC04559r.AFO();
        this.A05 = new C04609w(AH.A01, C.TIME_UNSET, TrackGroupArray.A04, c0611Gk);
        this.A0U = new AA[y5Arr.length];
        for (int i11 = 0; i11 < y5Arr.length; i11++) {
            y5Arr[i11].AG2(i11);
            this.A0U[i11] = y5Arr[i11].A6I();
        }
        this.A0G = new Y8(this, interfaceC0629Hd);
        this.A0R = new ArrayList<>();
        this.A0C = new Y5[0];
        this.A0M = new AG();
        this.A0L = new AF();
        abstractC0610Gj.A00(this);
        HandlerThread handlerThread = new HandlerThread(A06(21, 29, 0), -16);
        this.A0F = handlerThread;
        handlerThread.start();
        this.A0Q = interfaceC0629Hd.A4c(handlerThread.getLooper(), this);
    }

    private int A00() {
        AH ah2 = this.A05.A03;
        if (ah2.A0E()) {
            return 0;
        }
        return ah2.A0B(ah2.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i10, AH ah2, AH ah3) {
        int i11 = i10;
        int maxIterations = -1;
        int A00 = ah2.A00();
        for (int i12 = 0; i12 < A00 && maxIterations == -1; i12++) {
            i11 = ah2.A03(i11, this.A0L, this.A0M, this.A02, this.A0B);
            if (i11 == -1) {
                break;
            }
            maxIterations = ah3.A04(ah2.A0A(i11, this.A0L, true).A03);
        }
        return maxIterations;
    }

    private long A02(C0566Eo c0566Eo, long j3) throws C04419c {
        return A03(c0566Eo, j3, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r4 != r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r12 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        A0V(r4);
        r2 = com.facebook.ads.redexgen.uinode.EI.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r2[1].charAt(10) == r2[0].charAt(10)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        r2 = com.facebook.ads.redexgen.uinode.EI.A0W;
        r2[4] = "JYav744H3005gGdd3wHQ67gij";
        r2[3] = "FVGbgJ3f5rxs8oy2Mt1O3WpPvx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r3.A05 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        r10 = r3.A08.AFl(r10);
        r7 = r3.A08;
        r2 = r10 - r8.A0D;
        r6 = r8.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        if (com.facebook.ads.redexgen.uinode.EI.A0W[7].charAt(9) == '8') goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        com.facebook.ads.redexgen.uinode.EI.A0W[7] = "LvYFslBjN8wEk55S4mS5Jlrj4VNptxmz";
        r7.A5A(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
    
        A0P(r10);
        A09();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c2, code lost:
    
        r8.A0Q.AFn(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d4, code lost:
    
        if (com.facebook.ads.redexgen.uinode.EI.A0W[2].charAt(12) == 'N') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
    
        com.facebook.ads.redexgen.uinode.EI.A0W[2] = "qbdkiXSPlbFYutVyIKxCWSr3uDHCS3n2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r3.A05 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        r8.A0K.A0O(true);
        A0P(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003d, code lost:
    
        r4 = r8.A0C;
        r2 = r4.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0041, code lost:
    
        if (r1 >= r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        A0b(r4[r1]);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        r8.A0C = new com.facebook.ads.redexgen.uinode.Y5[0];
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long A03(com.facebook.ads.redexgen.uinode.C0566Eo r9, long r10, boolean r12) throws com.facebook.ads.redexgen.uinode.C04419c {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A03(com.facebook.ads.redexgen.X.Eo, long, boolean):long");
    }

    private Pair<Integer, Long> A04(C04509l c04509l, boolean z10) {
        int A01;
        AH ah2 = this.A05.A03;
        AH ah3 = c04509l.A02;
        if (ah2.A0E()) {
            return null;
        }
        if (ah3.A0E()) {
            ah3 = ah2;
        }
        try {
            Pair<Integer, Long> A07 = ah3.A07(this.A0M, this.A0L, c04509l.A00, c04509l.A01);
            if (ah2 == ah3) {
                return A07;
            }
            int A04 = ah2.A04(ah3.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                return Pair.create(Integer.valueOf(A04), (Long) A07.second);
            }
            if (!z10 || (A01 = A01(((Integer) A07.first).intValue(), ah3, ah2)) == -1) {
                return null;
            }
            Pair<Integer, Long> A05 = A05(ah2, ah2.A09(A01, this.A0L).A00, C.TIME_UNSET);
            String[] strArr = A0W;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[1] = "LZRu6qU1d7MAJxELkyp6D6bqJ9pCtQWv";
            strArr2[0] = "5OOlDtGsHYXmvjCA2lYHypc4I8JTMes9";
            return A05;
        } catch (IndexOutOfBoundsException unused) {
            throw new C04549q(ah2, c04509l.A00, c04509l.A01);
        }
    }

    private Pair<Integer, Long> A05(AH ah2, int i10, long j3) {
        return ah2.A07(this.A0M, this.A0L, i10, j3);
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C04569s A0F = this.A0K.A0F();
        long nextLoadPositionUs = A0F.A06();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        boolean AGI = this.A0J.AGI(nextLoadPositionUs - A0F.A08(this.A03), this.A0G.A7h().A01);
        A0k(AGI);
        if (AGI) {
            A0F.A0F(this.A03);
        }
    }

    private void A0A() {
        int i10;
        boolean z10;
        int i11;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            i10 = this.A0I.A01;
            z10 = this.A0I.A03;
            if (z10) {
                i11 = this.A0I.A00;
            } else {
                i11 = -1;
            }
            handler.obtainMessage(0, i10, i11, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C04569s A0F = this.A0K.A0F();
        C04569s readingPeriodHolder = this.A0K.A0H();
        if (A0F != null && !A0F.A06) {
            if (readingPeriodHolder != null) {
                C04569s loadingPeriodHolder = readingPeriodHolder.A01;
                if (loadingPeriodHolder != A0F) {
                    return;
                }
            }
            Y5[] y5Arr = this.A0C;
            if (A0W[2].charAt(12) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[4] = "M2PhxJTgTMxoek0nGdRGZ8ED7";
            strArr[3] = "JhH24KrsERDOvzAX41swXn1Uhz";
            for (Y5 y52 : y5Arr) {
                if (!y52.A8a()) {
                    return;
                }
            }
            A0F.A08.AAN();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C04579t A0I = this.A0K.A0I(this.A03, this.A05);
            if (A0I == null) {
                this.A07.AAO();
                return;
            }
            WP mediaPeriod = this.A0K.A0K(this.A0U, this.A0N, this.A0J.A60(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I);
            mediaPeriod.AE4(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.ACr();
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

    private void A0G() throws C04419c {
        this.A09 = false;
        this.A0G.A05();
        for (Y5 y52 : this.A0C) {
            y52.start();
        }
    }

    private void A0H() throws C04419c {
        this.A0G.A06();
        for (Y5 y52 : this.A0C) {
            A0c(y52);
        }
    }

    private void A0J() throws C04419c {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C04569s A0G = this.A0K.A0G();
        WP wp = A0G.A08;
        if (A0W[6].length() != 17) {
            throw new RuntimeException();
        }
        A0W[7] = "e9etinPRA8BQH2CZknXr4yAbSJ3blA39";
        long AEL = wp.AEL();
        if (AEL != C.TIME_UNSET) {
            A0P(AEL);
            if (AEL != this.A05.A0A) {
                C04609w c04609w = this.A05;
                C0566Eo c0566Eo = c04609w.A04;
                long periodPositionUs = this.A05.A01;
                this.A05 = c04609w.A04(c0566Eo, AEL, periodPositionUs);
                this.A0I.A04(4);
            }
        } else {
            long A04 = this.A0G.A04();
            this.A03 = A04;
            long A08 = A0G.A08(A04);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        C04609w c04609w2 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        c04609w2.A09 = A0C;
    }

    private void A0L(float f10) {
        for (C04569s A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            C0611Gk c0611Gk = A0E.A04;
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[5] = "TmHCYSIZuHNmxK6kBnR58JopztOBcNrn";
            if (c0611Gk != null) {
                for (InterfaceC0607Gg interfaceC0607Gg : A0E.A04.A01.A01()) {
                    if (interfaceC0607Gg != null) {
                        interfaceC0607Gg.ACc(f10);
                    }
                }
            }
        }
    }

    private void A0M(int i10) throws C04419c {
        this.A02 = i10;
        if (!this.A0K.A0R(i10)) {
            A0j(true);
        }
    }

    private void A0N(int i10) {
        if (this.A05.A00 != i10) {
            C04609w A02 = this.A05.A02(i10);
            if (A0W[7].charAt(9) != '8') {
                throw new RuntimeException();
            }
            A0W[2] = "kM2qExU4ybhQ7HWfawBquzR2zjX0F4jA";
            this.A05 = A02;
        }
    }

    private void A0O(int i10, boolean playing, int i11) throws C04419c {
        C04569s playingPeriodHolder = this.A0K.A0G();
        Y5 y52 = this.A0T[i10];
        this.A0C[i11] = y52;
        if (y52.A81() == 0) {
            AB ab2 = playingPeriodHolder.A04.A03[i10];
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            A0W[2] = "NYdCxyfB4qBB5fQElsuicf6C6huVudSr";
            Format[] A0v = A0v(playingPeriodHolder.A04.A01.A00(i10));
            boolean z10 = this.A08 && this.A05.A00 == 3;
            y52.A5V(ab2, A0v, playingPeriodHolder.A0A[i10], this.A03, !playing && z10, playingPeriodHolder.A07());
            this.A0G.A09(y52);
            if (z10) {
                y52.start();
            }
        }
    }

    private void A0P(long j3) throws C04419c {
        if (this.A0K.A0P()) {
            j3 = this.A0K.A0G().A09(j3);
        }
        this.A03 = j3;
        this.A0G.A07(j3);
        for (Y5 y52 : this.A0C) {
            y52.AFN(this.A03);
        }
    }

    private void A0Q(long j3, long j10) throws C04419c {
        C04489j c04489j;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j3) {
            j3--;
        }
        C04609w c04609w = this.A05;
        if (A0W[2].charAt(12) == 'N') {
            throw new RuntimeException();
        }
        A0W[2] = "iI9novLuZIFAEfCO4qiE3Y1J9OFTcxg5";
        int i10 = c04609w.A04.A02;
        int currentPeriodIndex = this.A00;
        C04489j c04489j2 = currentPeriodIndex > 0 ? this.A0R.get(currentPeriodIndex - 1) : null;
        while (c04489j2 != null) {
            if (c04489j2.A00 <= i10) {
                int i11 = c04489j2.A00;
                if (A0W[7].charAt(9) == '8') {
                    A0W[2] = "hDlIvL5rLgyE5VG4VUIth4YrdDyvlxxs";
                    if (i11 == i10) {
                        if (c04489j2.A01 <= j3) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            int currentPeriodIndex2 = this.A00 - 1;
            this.A00 = currentPeriodIndex2;
            c04489j2 = currentPeriodIndex2 > 0 ? this.A0R.get(currentPeriodIndex2 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            c04489j = this.A0R.get(this.A00);
        } else {
            c04489j = null;
        }
        while (c04489j != null && c04489j.A02 != null && (c04489j.A00 < i10 || (c04489j.A00 == i10 && c04489j.A01 <= j3))) {
            int i12 = this.A00 + 1;
            this.A00 = i12;
            if (i12 < this.A0R.size()) {
                c04489j = this.A0R.get(this.A00);
            } else {
                c04489j = null;
            }
        }
        while (c04489j != null && c04489j.A02 != null && c04489j.A00 == i10 && c04489j.A01 > j3 && c04489j.A01 <= j10) {
            A0Z(c04489j.A03);
            if (c04489j.A03.A0B() || c04489j.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                ArrayList<C04489j> arrayList = this.A0R;
                int i13 = this.A00;
                if (A0W[5].charAt(1) == 'w') {
                    throw new RuntimeException();
                }
                A0W[6] = "2inRqgHKNmW90mXz8";
                c04489j = arrayList.get(i13);
            } else {
                c04489j = null;
            }
        }
    }

    private void A0R(long j3, long j10) {
        this.A0Q.AF8(2);
        this.A0Q.AFo(2, j3 + j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(com.facebook.ads.redexgen.uinode.C04509l r20) throws com.facebook.ads.redexgen.uinode.C04419c {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0T(com.facebook.ads.redexgen.X.9l):void");
    }

    private void A0V(C04569s c04569s) throws C04419c {
        C04569s A0G = this.A0K.A0G();
        if (A0G == null || c04569s == A0G) {
            return;
        }
        int i10 = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i11 = 0;
        while (true) {
            Y5[] y5Arr = this.A0T;
            if (i11 < y5Arr.length) {
                Y5 y52 = y5Arr[i11];
                zArr[i11] = y52.A81() != 0;
                if (A0G.A04.A00(i11)) {
                    i10++;
                }
                if (zArr[i11] && (!A0G.A04.A00(i11) || (y52.A8y() && y52.A84() == c04569s.A0A[i11]))) {
                    A0b(y52);
                }
                i11++;
            } else {
                this.A05 = this.A05.A05(A0G.A03, A0G.A04);
                A0p(zArr, i10);
                return;
            }
        }
    }

    private void A0W(C04619x c04619x) {
        this.A0G.AGA(c04619x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(A8 a82) throws C04419c {
        if (a82.A0D()) {
            return;
        }
        try {
            a82.A04().A8V(a82.A00(), a82.A09());
            a82.A0A(true);
            String[] strArr = A0W;
            if (strArr[1].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[4] = "j7cBoz179DrNpy3qD7RptXNd9";
            strArr2[3] = "0iwSWX3dM4PAnuiRq1LulMUFPW";
        } catch (Throwable th2) {
            a82.A0A(true);
            throw th2;
        }
    }

    private void A0Y(A8 a82) throws C04419c {
        if (a82.A02() == C.TIME_UNSET) {
            A0Z(a82);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C04489j(a82));
            return;
        }
        C04489j c04489j = new C04489j(a82);
        if (A0r(c04489j)) {
            this.A0R.add(c04489j);
            Collections.sort(this.A0R);
        } else {
            a82.A0A(false);
        }
    }

    private void A0Z(A8 a82) throws C04419c {
        if (a82.A03().getLooper() == this.A0Q.A7L()) {
            A0X(a82);
            C04609w c04609w = this.A05;
            if (A0W[6].length() != 17) {
                throw new RuntimeException();
            }
            A0W[5] = "cBEQE15IFXZqMCE104UHZMDgeC8qTiqN";
            if (c04609w.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AFn(2);
                return;
            }
            return;
        }
        this.A0Q.AAb(15, a82).sendToTarget();
    }

    private void A0a(final A8 a82) {
        a82.A03().post(new Runnable() { // from class: com.facebook.ads.redexgen.X.9h
            public static byte[] A02;

            static {
                A01();
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 14);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{-60, -9, -18, -49, -21, -32, -8, -28, -15, -56, -20, -17, -21, -56, -19, -13, -28, -15, -19, -32, -21, -52, -27, -36, -17, -25, -36, -38, -21, -36, -37, -105, -36, -23, -23, -26, -23, -105, -37, -36, -29, -32, -19, -36, -23, -32, -27, -34, -105, -28, -36, -22, -22, -40, -34, -36, -105, -26, -27, -105, -36, -17, -21, -36, -23, -27, -40, -29, -105, -21, -33, -23, -36, -40, -37, -91};
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    try {
                        EI.this.A0X(a82);
                    } catch (C04419c e2) {
                        Log.e(A00(0, 21, 113), A00(21, 55, 105), e2);
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th2) {
                    KL.A00(th2, this);
                }
            }
        });
    }

    private void A0b(Y5 y52) throws C04419c {
        this.A0G.A08(y52);
        A0c(y52);
        y52.A58();
    }

    private void A0c(Y5 y52) throws C04419c {
        if (y52.A81() == 2) {
            y52.stop();
        }
    }

    private void A0d(AD ad2) {
        this.A06 = ad2;
    }

    private void A0e(WP wp) {
        if (!this.A0K.A0T(wp)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(WP wp) throws C04419c {
        if (!this.A0K.A0T(wp)) {
            return;
        }
        C04569s A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A7h().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            C04569s loadingPeriodHolder = this.A0K.A0C();
            A0P(loadingPeriodHolder.A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.FC
    /* renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void ABC(WP wp) {
        this.A0Q.AAb(10, wp).sendToTarget();
    }

    private void A0h(InterfaceC0568Eq interfaceC0568Eq, boolean z10, boolean z11) {
        this.A01++;
        A0o(true, z10, z11);
        this.A0J.onPrepared();
        this.A07 = interfaceC0568Eq;
        A0N(2);
        interfaceC0568Eq.AE7(this.A0H, true, this);
        this.A0Q.AFn(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, C0611Gk c0611Gk) {
        this.A0J.ADN(this.A0T, trackGroupArray, c0611Gk.A01);
    }

    private void A0j(boolean z10) throws C04419c {
        C0566Eo c0566Eo = this.A0K.A0G().A02.A04;
        long A03 = A03(c0566Eo, this.A05.A0A, true);
        if (A03 != this.A05.A0A) {
            C04609w c04609w = this.A05;
            this.A05 = c04609w.A04(c0566Eo, A03, c04609w.A01);
            if (z10) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z10) {
        if (this.A05.A08 != z10) {
            this.A05 = this.A05.A06(z10);
        }
    }

    private void A0l(boolean z10) throws C04419c {
        this.A09 = false;
        this.A08 = z10;
        if (!z10) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            this.A0Q.AFn(2);
        } else {
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AFn(2);
        }
    }

    private void A0m(boolean z10) throws C04419c {
        this.A0B = z10;
        if (!this.A0K.A0V(z10)) {
            A0j(true);
        }
    }

    private void A0n(boolean z10, boolean z11) {
        A0o(true, z10, z10);
        this.A0I.A03(this.A01 + (z11 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ADF();
        A0N(1);
    }

    private void A0o(boolean z10, boolean z11, boolean z12) {
        Object obj;
        long j3;
        C0611Gk c0611Gk;
        InterfaceC0568Eq interfaceC0568Eq;
        this.A0Q.AF8(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (Y5 y52 : this.A0C) {
            try {
                A0b(y52);
            } catch (C04419c | RuntimeException e2) {
                Log.e(A06(0, 21, 43), A06(138, 12, 49), e2);
            }
        }
        this.A0C = new Y5[0];
        this.A0K.A0O(!z11);
        A0k(false);
        if (z11) {
            this.A04 = null;
        }
        if (z12) {
            this.A0K.A0N(AH.A01);
            Iterator<C04489j> it = this.A0R.iterator();
            while (it.hasNext()) {
                it.next().A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AH ah2 = z12 ? AH.A01 : this.A05.A03;
        if (z12) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        C0566Eo c0566Eo = z11 ? new C0566Eo(A00()) : this.A05.A04;
        long j10 = C.TIME_UNSET;
        if (z11) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.A05.A0A;
        }
        if (!z11) {
            j10 = this.A05.A01;
        }
        int i10 = this.A05.A00;
        TrackGroupArray trackGroupArray = z12 ? TrackGroupArray.A04 : this.A05.A05;
        if (z12) {
            c0611Gk = this.A0O;
        } else {
            c0611Gk = this.A05.A06;
        }
        this.A05 = new C04609w(ah2, obj, c0566Eo, j3, j10, i10, false, trackGroupArray, c0611Gk);
        if (z10 && (interfaceC0568Eq = this.A07) != null) {
            interfaceC0568Eq.AEb(this);
            this.A07 = null;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0p(boolean[] r6, int r7) throws com.facebook.ads.redexgen.uinode.C04419c {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Y5[] r0 = new com.facebook.ads.redexgen.uinode.Y5[r7]
            r5.A0C = r0
            r4 = 0
            com.facebook.ads.redexgen.X.9u r0 = r5.A0K
            com.facebook.ads.redexgen.X.9s r3 = r0.A0G()
            r2 = 0
        Lc:
            com.facebook.ads.redexgen.X.Y5[] r0 = r5.A0T
            int r0 = r0.length
            if (r2 >= r0) goto L24
            com.facebook.ads.redexgen.X.Gk r0 = r3.A04
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L21
            boolean r1 = r6[r2]
            int r0 = r4 + 1
            r5.A0O(r2, r1, r4)
            r4 = r0
        L21:
            int r2 = r2 + 1
            goto Lc
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0p(boolean[], int):void");
    }

    private boolean A0q() {
        C04569s A0G = this.A0K.A0G();
        long j3 = A0G.A02.A01;
        if (j3 != C.TIME_UNSET) {
            long playingPeriodDurationUs = this.A05.A0A;
            if (playingPeriodDurationUs >= j3) {
                C04569s c04569s = A0G.A01;
                if (A0W[7].charAt(9) != '8') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[1] = "YaIhV2LltIG4HuclCS5WOO9hjwkCXeMt";
                strArr[0] = "X0pypN8zwLPsNLuJVHuHfetSc0yM8k9B";
                if (c04569s != null) {
                    C04569s playingPeriodHolder = A0G.A01;
                    if (!playingPeriodHolder.A06) {
                        C04569s playingPeriodHolder2 = A0G.A01;
                        if (playingPeriodHolder2.A02.A04.A01()) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A0r(C04489j c04489j) {
        if (c04489j.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C04509l(c04489j.A03.A08(), c04489j.A03.A01(), C9W.A00(c04489j.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            int intValue = ((Integer) A04.first).intValue();
            long longValue = ((Long) A04.second).longValue();
            AH ah2 = this.A05.A03;
            Integer num = (Integer) A04.first;
            String[] strArr = A0W;
            if (strArr[1].charAt(10) != strArr[0].charAt(10)) {
                A0W[6] = "Qe4SjxIsSBa3x6HAW";
                c04489j.A01(intValue, longValue, ah2.A0A(num.intValue(), this.A0L, true).A03);
            } else {
                throw new RuntimeException();
            }
        } else {
            int A042 = this.A05.A03.A04(c04489j.A02);
            if (A042 == -1) {
                return false;
            }
            c04489j.A00 = A042;
        }
        return true;
    }

    private boolean A0s(Y5 y52) {
        C04569s A0H = this.A0K.A0H();
        C04569s readingPeriodHolder = A0H.A01;
        if (readingPeriodHolder != null) {
            C04569s readingPeriodHolder2 = A0H.A01;
            if (readingPeriodHolder2.A06 && y52.A8a()) {
                return true;
            }
        }
        return false;
    }

    private boolean A0t(C0566Eo c0566Eo, long j3, C04569s c04569s) {
        if (c0566Eo.equals(c04569s.A02.A04) && c04569s.A06) {
            this.A05.A03.A09(c04569s.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j3);
            if (A04 == -1 || this.A0L.A09(A04) == c04569s.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean A0u(boolean z10) {
        if (this.A0C.length == 0) {
            return A0q();
        }
        if (!z10) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        C04569s A0F = this.A0K.A0F();
        long A0C = A0F.A0C(!A0F.A02.A05);
        return A0C == Long.MIN_VALUE || this.A0J.AGL(A0C - A0F.A08(this.A03), this.A0G.A7h().A01, this.A09);
    }

    public static Format[] A0v(InterfaceC0607Gg interfaceC0607Gg) {
        int length = interfaceC0607Gg != null ? interfaceC0607Gg.length() : 0;
        Format[] formatArr = new Format[length];
        String[] strArr = A0W;
        String str = strArr[1];
        String str2 = strArr[0];
        int charAt = str.charAt(10);
        int length2 = str2.charAt(10);
        if (charAt == length2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[4] = "X04sVE4WijYjotgv6w3bASzS6";
        strArr2[3] = "U1jCIvxI6fY8JZE6Ili1DHAvIg";
        for (int length3 = 0; length3 < length; length3++) {
            formatArr[length3] = interfaceC0607Gg.A76(length3);
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
            com.facebook.ads.redexgen.X.Hn r1 = r2.A0Q     // Catch: java.lang.Throwable -> L23
            r0 = 7
            r1.AFn(r0)     // Catch: java.lang.Throwable -> L23
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.EI.A0x():void");
    }

    public final void A0y(AH ah2, int i10, long j3) {
        this.A0Q.AAb(3, new C04509l(ah2, i10, j3)).sendToTarget();
    }

    public final void A0z(InterfaceC0568Eq interfaceC0568Eq, boolean z10, boolean z11) {
        this.A0Q.AAa(0, z10 ? 1 : 0, z11 ? 1 : 0, interfaceC0568Eq).sendToTarget();
    }

    public final void A10(boolean z10) {
        this.A0Q.AAZ(1, z10 ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z10) {
        this.A0Q.AAZ(6, z10 ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.uinode.C9Z
    public final void ACb(C04619x c04619x) {
        this.A0E.obtainMessage(1, c04619x).sendToTarget();
        A0L(c04619x.A01);
    }

    @Override // com.facebook.ads.redexgen.uinode.WQ
    public final void ACj(WP wp) {
        this.A0Q.AAb(9, wp).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0567Ep
    public final void ADA(InterfaceC0568Eq interfaceC0568Eq, AH ah2, Object obj) {
        this.A0Q.AAb(8, new C04479i(interfaceC0568Eq, ah2, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.uinode.A6
    public final synchronized void AFp(A8 a82) {
        if (this.A0A) {
            Log.w(A06(0, 21, 43), A06(50, 37, 33));
            a82.A0A(false);
        } else {
            this.A0Q.AAb(14, a82).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 43);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC0568Eq) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C04509l) message.obj);
                    break;
                case 4:
                    A0W((C04619x) message.obj);
                    break;
                case 5:
                    A0d((AD) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C04479i) message.obj);
                    break;
                case 9:
                    A0f((WP) message.obj);
                    break;
                case 10:
                    A0e((WP) message.obj);
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
                    A0Y((A8) message.obj);
                    break;
                case 15:
                    A0a((A8) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C04419c e2) {
            Log.e(A06, A06(110, 15, 98), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, e2).sendToTarget();
            A0A();
        } catch (IOException e10) {
            Log.e(A06, A06(125, 13, 51), e10);
            A0n(false, false);
            this.A0E.obtainMessage(2, C04419c.A00(e10)).sendToTarget();
            A0A();
        } catch (RuntimeException e11) {
            Log.e(A06, A06(87, 23, 38), e11);
            A0n(false, false);
            this.A0E.obtainMessage(2, C04419c.A02(e11)).sendToTarget();
            A0A();
        }
        return true;
    }
}
