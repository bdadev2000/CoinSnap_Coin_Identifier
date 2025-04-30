package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XU implements InterfaceC1074Bs {
    public static byte[] A0E;
    public static String[] A0F = {"FKupPKXcsIkycQ3l5ptAH5wluEqc6YoI", "RW", "ogqWAOna8QODFLIqijT7vOYnhApvYyU7", "UAOUtvFDqNmRNLgZ1GU6DrNnbPesxUgh", "z4WGtVpeHmr0jWMfeyoB2cmDzFByDj9w", "gdGWUcFUabEj8aTRXEAi5amp", "tmhvTid", "WDNv6R6VbALBmvSk6DCmHF7NFi0i9puO"};
    public static final InterfaceC1077Bv A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC1076Bu A04;
    public C4 A05;
    public XV A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C1078Bw A0A;
    public final Bx A0B;
    public final By A0C;
    public final C1217Hz A0D;

    public static String A04(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-94, -57, -65, -56, -110, -92, -96, -79, -94, -89, -92, -93, 95, -77, -82, -82, 95, -84, -96, -83, -72, 95, -95, -72, -77, -92, -78, 109, -115, 121, -119, Byte.MIN_VALUE, -100, -83, -78, -85};
    }

    static {
        A05();
        A0G = new XW();
        A0J = IF.A08(A04(32, 4, 37));
        A0H = IF.A08(A04(0, 4, 58));
        A0I = IF.A08(A04(28, 4, 24));
    }

    public XU() {
        this(0);
    }

    public XU(int i9) {
        this(i9, C.TIME_UNSET);
    }

    public XU(int i9, long j7) {
        this.A08 = i9;
        this.A09 = j7;
        this.A0D = new C1217Hz(10);
        this.A0C = new By();
        this.A0A = new C1078Bw();
        this.A02 = C.TIME_UNSET;
        this.A0B = new Bx();
    }

    private int A00(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            interfaceC1075Bt.AFM();
            if (!interfaceC1075Bt.ADw(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int A08 = this.A0D.A08();
            int sampleHeaderData = this.A01;
            if (A06(A08, sampleHeaderData)) {
                int sampleHeaderData2 = By.A00(A08);
                if (sampleHeaderData2 != -1) {
                    By.A04(A08, this.A0C);
                    if (this.A02 == C.TIME_UNSET) {
                        XV xv = this.A06;
                        long A7i = interfaceC1075Bt.A7i();
                        if (A0F[0].charAt(7) == '2') {
                            throw new RuntimeException();
                        }
                        A0F[5] = "uwsYCHPiCgNXlhDD9rc7dT19";
                        this.A02 = xv.A88(A7i);
                        if (this.A09 != C.TIME_UNSET) {
                            this.A02 += this.A09 - this.A06.A88(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0C.A02;
                    this.A00 = sampleHeaderData3;
                }
            }
            interfaceC1075Bt.AGP(1);
            this.A01 = 0;
            return 0;
        }
        int AFQ = this.A05.AFQ(interfaceC1075Bt, this.A00, true);
        if (AFQ == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - AFQ;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A05.AFS(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r3 == r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.meta.analytics.dsp.uinode.C1217Hz r4, int r5) {
        /*
            int r1 = r4.A07()
            int r0 = r5 + 4
            if (r1 < r0) goto L3e
            r4.A0Y(r5)
            int r3 = r4.A08()
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XU.A0F
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L38
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XU.A0F
            java.lang.String r1 = "RZ9mFeyNnV0sPgPCsPCuasZg37Uzdp17"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fK9CAyTZYj28knSP6u8xHPIK1qnXYcxa"
            r0 = 3
            r2[r0] = r1
            int r0 = com.meta.analytics.dsp.uinode.XU.A0J
            if (r3 == r0) goto L37
            int r0 = com.meta.analytics.dsp.uinode.XU.A0H
            if (r3 != r0) goto L3e
        L37:
            return r3
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            int r1 = r4.A07()
            r0 = 40
            if (r1 < r0) goto L54
            r0 = 36
            r4.A0Y(r0)
            int r1 = r4.A08()
            int r0 = com.meta.analytics.dsp.uinode.XU.A0I
            if (r1 != r0) goto L54
            return r0
        L54:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XU.A01(com.facebook.ads.redexgen.X.Hz, int):int");
    }

    private EE A02(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        interfaceC1075Bt.ADv(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        By.A04(this.A0D.A08(), this.A0C);
        return new EE(interfaceC1075Bt.A7I(), interfaceC1075Bt.A7i(), this.A0C);
    }

    private XV A03(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        C1217Hz c1217Hz = new C1217Hz(this.A0C.A02);
        interfaceC1075Bt.ADv(c1217Hz.A00, 0, this.A0C.A02);
        int i9 = 21;
        if ((this.A0C.A05 & 1) != 0) {
            int i10 = this.A0C.A01;
            if (A0F[5].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "1a7oiXE";
            strArr[1] = "rh";
            if (i10 != 1) {
                i9 = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i9 = 13;
        }
        int xingBase = A01(c1217Hz, i9);
        if (xingBase == A0J || xingBase == A0H) {
            E4 A01 = E4.A01(interfaceC1075Bt.A7I(), interfaceC1075Bt.A7i(), this.A0C, c1217Hz);
            if (A01 != null && !this.A0A.A03()) {
                interfaceC1075Bt.AFM();
                interfaceC1075Bt.A3W(i9 + 141);
                C1217Hz frame = this.A0D;
                interfaceC1075Bt.ADv(frame.A00, 0, 3);
                C1217Hz frame2 = this.A0D;
                frame2.A0Y(0);
                C1078Bw c1078Bw = this.A0A;
                C1217Hz frame3 = this.A0D;
                c1078Bw.A04(frame3.A0G());
            }
            interfaceC1075Bt.AGP(this.A0C.A02);
            if (A01 != null && !A01.A9I() && xingBase == A0H) {
                return A02(interfaceC1075Bt);
            }
            return A01;
        }
        if (xingBase == A0I) {
            EC A00 = EC.A00(interfaceC1075Bt.A7I(), interfaceC1075Bt.A7i(), this.A0C, c1217Hz);
            interfaceC1075Bt.AGP(this.A0C.A02);
            return A00;
        }
        interfaceC1075Bt.AFM();
        return null;
    }

    public static boolean A06(int i9, long j7) {
        return ((long) ((-128000) & i9)) == ((-128000) & j7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x009d, code lost:
    
        if (r15 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:
    
        r14.AGP(r6 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a3, code lost:
    
        r13.A01 = r7;
        r2 = com.meta.analytics.dsp.uinode.XU.A0F;
        r1 = r2[2];
        r2 = r2[7];
        r1 = r1.charAt(28);
        r0 = r2.charAt(28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b7, code lost:
    
        if (r1 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:
    
        com.meta.analytics.dsp.uinode.XU.A0F[0] = "JRrUIGwZBJczcB1fqhgNVGoVSbza2n0c";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c1, code lost:
    
        r14.AFM();
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07(com.meta.analytics.dsp.uinode.InterfaceC1075Bt r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XU.A07(com.facebook.ads.redexgen.X.Bt, boolean):boolean");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A04 = interfaceC1076Bu;
        this.A05 = interfaceC1076Bu.AGi(0, 1);
        this.A04.A5Y();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final int AEH(InterfaceC1075Bt interfaceC1075Bt, C1079Bz c1079Bz) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC1075Bt, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            XV A03 = A03(interfaceC1075Bt);
            this.A06 = A03;
            if (A03 == null || (!A03.A9I() && (this.A08 & 1) != 0)) {
                this.A06 = A02(interfaceC1075Bt);
            }
            this.A04.AFi(this.A06);
            this.A05.A5n(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC1075Bt);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void AFh(long j7, long j9) {
        this.A01 = 0;
        this.A02 = C.TIME_UNSET;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final boolean AGR(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        return A07(interfaceC1075Bt, true);
    }
}
