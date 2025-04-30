package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XJ implements InterfaceC1090Cl {
    public static byte[] A0C;
    public static String[] A0D = {"qlUqm53dx2wRFYI19yFYkvkmPQFopPfK", "kfzPj4jiKhQrTstJ9wOtTomcMDMJFI2R", "tio4jxSpdKgrcMNksdh3F2ai0PxCizyi", "S5qskWqDqPkhPpuUuuvRcKySD9vc4n0H", "X67UodKHNvmZa3DnASt4fZlpL2cJMcNV", "01LnOYH7rGQp5f5o2UGBiyg7bnJQxBa8", "qDTiiMVukWANjWrPbJo4riKeblMOo1tu", "5dAWhKcmsHilqUXjq3PFXu2GkNxyPnDG"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C1089Ck A0A = new C1089Ck();
    public final AbstractC1093Co A0B;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final long A01(long j7, InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        if (this.A04 == this.A01) {
            return -(this.A05 + 2);
        }
        long A7i = interfaceC1075Bt.A7i();
        if (!A0D(interfaceC1075Bt, this.A01)) {
            long j9 = this.A04;
            if (j9 != A7i) {
                return j9;
            }
            throw new IOException(A09(0, 25, 22));
        }
        this.A0A.A03(interfaceC1075Bt, false);
        interfaceC1075Bt.AFM();
        long j10 = j7 - this.A0A.A05;
        int i9 = this.A0A.A01 + this.A0A.A00;
        if (j10 >= 0 && j10 <= 72000) {
            interfaceC1075Bt.AGP(i9);
            return -(this.A0A.A05 + 2);
        }
        if (j10 < 0) {
            this.A01 = A7i;
            this.A02 = this.A0A.A05;
        } else {
            this.A04 = interfaceC1075Bt.A7i() + i9;
            this.A05 = this.A0A.A05;
            if ((this.A01 - this.A04) + i9 < 100000) {
                interfaceC1075Bt.AGP(i9);
                return -(this.A05 + 2);
            }
        }
        long j11 = this.A01;
        long j12 = this.A04;
        String[] strArr = A0D;
        if (strArr[4].charAt(12) == strArr[0].charAt(12)) {
            throw new RuntimeException();
        }
        A0D[3] = "zvKF8WQUI0SajHpo4Xv9v8DHT9e2MTPL";
        if (j11 - j12 < 100000) {
            this.A01 = j12;
            return j12;
        }
        long j13 = i9;
        long j14 = j10 > 0 ? 1L : 2L;
        long A7i2 = interfaceC1075Bt.A7i();
        long j15 = this.A01;
        long j16 = this.A04;
        return Math.min(Math.max((A7i2 - (j13 * j14)) + (((j15 - j16) * j10) / (this.A02 - this.A05)), j16), this.A01 - 1);
    }

    public static String A09(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0C = new byte[]{Ascii.SYN, 55, 120, 55, 63, 63, 120, 40, 57, 63, 61, 120, 59, 57, 54, 120, 58, 61, 120, 62, 55, 45, 54, 60, 118};
    }

    static {
        A0A();
    }

    public XJ(long j7, long j9, AbstractC1093Co abstractC1093Co, int i9, long j10) {
        AbstractC1192Ha.A03(j7 >= 0 && j9 > j7);
        this.A0B = abstractC1093Co;
        this.A09 = j7;
        this.A08 = j9;
        if (i9 == j9 - j7) {
            this.A07 = j10;
            this.A00 = 3;
        } else {
            this.A00 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00(long j7, long j9, long j10) {
        long j11 = this.A08;
        long j12 = this.A09;
        long j13 = j7 + ((((j11 - j12) * j9) / this.A07) - j10);
        if (j13 < j12) {
            j13 = this.A09;
        }
        if (j13 >= j11) {
            return j11 - 1;
        }
        return j13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        return r5.A0A.A05;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long A02(com.meta.analytics.dsp.uinode.InterfaceC1075Bt r6) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r5 = this;
            r5.A0C(r6)
            com.facebook.ads.redexgen.X.Ck r0 = r5.A0A
            r0.A02()
        L8:
            com.facebook.ads.redexgen.X.Ck r0 = r5.A0A
            int r3 = r0.A04
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XJ.A0D
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 12
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L52
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XJ.A0D
            java.lang.String r1 = "8L7HD1AI4we5ropKbStlQEIIPOmJrEUL"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "xLnKc6RM4Edpr9DSdPLSxPAMnW98GKHb"
            r0 = 2
            r2[r0] = r1
            r0 = 4
            r3 = r3 & r0
            if (r3 == r0) goto L4d
            long r3 = r6.A7i()
            long r1 = r5.A08
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4d
            com.facebook.ads.redexgen.X.Ck r1 = r5.A0A
            r0 = 0
            r1.A03(r6, r0)
            com.facebook.ads.redexgen.X.Ck r0 = r5.A0A
            int r1 = r0.A01
            com.facebook.ads.redexgen.X.Ck r0 = r5.A0A
            int r0 = r0.A00
            int r1 = r1 + r0
            r6.AGP(r1)
            goto L8
        L4d:
            com.facebook.ads.redexgen.X.Ck r0 = r5.A0A
            long r0 = r0.A05
            return r0
        L52:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XJ.A02(com.facebook.ads.redexgen.X.Bt):long");
    }

    private final long A03(InterfaceC1075Bt interfaceC1075Bt, long j7, long j9) throws IOException, InterruptedException {
        this.A0A.A03(interfaceC1075Bt, false);
        while (this.A0A.A05 < j7) {
            interfaceC1075Bt.AGP(this.A0A.A01 + this.A0A.A00);
            j9 = this.A0A.A05;
            this.A0A.A03(interfaceC1075Bt, false);
        }
        interfaceC1075Bt.AFM();
        return j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1090Cl
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final XK A4m() {
        C1087Ci c1087Ci = null;
        if (this.A07 != 0) {
            return new XK(this);
        }
        return null;
    }

    private final void A0B() {
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }

    private final void A0C(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        if (A0D(interfaceC1075Bt, this.A08)) {
        } else {
            throw new EOFException();
        }
    }

    private final boolean A0D(InterfaceC1075Bt interfaceC1075Bt, long j7) throws IOException, InterruptedException {
        long min = Math.min(3 + j7, this.A08);
        byte[] bArr = new byte[2048];
        int i9 = bArr.length;
        while (true) {
            if (interfaceC1075Bt.A7i() + i9 > min && (i9 = (int) (min - interfaceC1075Bt.A7i())) < 4) {
                return false;
            }
            interfaceC1075Bt.ADw(bArr, 0, i9, false);
            for (int i10 = 0; i10 < i9 - 3; i10++) {
                int peekLength = bArr[i10];
                if (peekLength == 79 && bArr[i10 + 1] == 103 && bArr[i10 + 2] == 103) {
                    int peekLength2 = bArr[i10 + 3];
                    if (peekLength2 == 83) {
                        interfaceC1075Bt.AGP(i10);
                        return true;
                    }
                }
            }
            interfaceC1075Bt.AGP(i9 - 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r1 > r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r1 > r3) goto L25;
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1090Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AEI(com.meta.analytics.dsp.uinode.InterfaceC1075Bt r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            int r0 = r13.A00
            r5 = 3
            r8 = r14
            switch(r0) {
                case 0: goto L50;
                case 1: goto L94;
                case 2: goto L10;
                case 3: goto Ld;
                default: goto L7;
            }
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        Ld:
            r0 = -1
            return r0
        L10:
            long r2 = r13.A06
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.XJ.A0D
            r0 = 3
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L27
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L27:
            java.lang.String[] r4 = com.meta.analytics.dsp.uinode.XJ.A0D
            java.lang.String r1 = "5HAo5Th3dlJMt4bYi9vd99sok2AKRnDx"
            r0 = 3
            r4[r0] = r1
            r0 = 2
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L3d
            r2 = 0
        L38:
            r13.A00 = r5
            long r0 = r0 + r2
            long r2 = -r0
            return r2
        L3d:
            long r2 = r13.A01(r2, r8)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L46
            return r2
        L46:
            long r9 = r13.A06
            long r2 = r2 + r0
            long r11 = -r2
            r7 = r13
            long r2 = r7.A03(r8, r9, r11)
            goto L38
        L50:
            long r3 = r8.A7i()
            r13.A03 = r3
            r0 = 1
            r13.A00 = r0
            long r1 = r13.A08
            java.lang.String[] r6 = com.meta.analytics.dsp.uinode.XJ.A0D
            r0 = 5
            r6 = r6[r0]
            r0 = 14
            char r6 = r6.charAt(r0)
            r0 = 69
            if (r6 == r0) goto L7f
            java.lang.String[] r7 = com.meta.analytics.dsp.uinode.XJ.A0D
            java.lang.String r6 = "y7O6pPdi4ZltSjD6KADDWtfh1EQ3ypYE"
            r0 = 1
            r7[r0] = r6
            java.lang.String r6 = "PCOWfrd56ab6qHMTUxzEVaAjhpd6ZxlM"
            r0 = 2
            r7[r0] = r6
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L94
        L7e:
            return r1
        L7f:
            java.lang.String[] r7 = com.meta.analytics.dsp.uinode.XJ.A0D
            java.lang.String r6 = "CYddPgWATLyxqxIaeTkpx7ccDiEA63Cn"
            r0 = 4
            r7[r0] = r6
            java.lang.String r6 = "yHXSkk2QTXaOjUGCO1LifWaF4YjGjaVe"
            r0 = 0
            r7[r0] = r6
            r6 = 65307(0xff1b, double:3.2266E-319)
            long r1 = r1 - r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L94
            goto L7e
        L94:
            long r0 = r13.A02(r8)
            r13.A07 = r0
            r13.A00 = r5
            long r0 = r13.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XJ.AEI(com.facebook.ads.redexgen.X.Bt):long");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1090Cl
    public final long AGX(long j7) {
        int i9 = this.A00;
        AbstractC1192Ha.A03(i9 == 3 || i9 == 2);
        long j9 = 0;
        if (j7 != 0) {
            j9 = this.A0B.A04(j7);
        }
        this.A06 = j9;
        this.A00 = 2;
        A0B();
        return this.A06;
    }
}
