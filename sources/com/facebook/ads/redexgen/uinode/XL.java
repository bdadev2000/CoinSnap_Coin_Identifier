package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XL implements InterfaceC0508Bs, C1 {
    public static byte[] A0J;
    public static String[] A0K = {"NMENm2VVY4CjFU7qkzTmTxviYk7AnS7Z", "JBVFfjWytxpjUnZZ6lInsU7tzfFzOPaX", "YaevPinMBRqhVFzNm59vwI8bFO4cI8AD", "52TqclTutshaaFkrwJ4nyJTeA2xWvRpu", "JGseDZtum4mqdbq3nSxMUnsGXrSMUYmk", "xuKwDkc3QqvJvTm3i1k9vAbPWWVSjov2", "2GdyUNwnHd6eSNq3THJOdF5Wjs3u7UdX", "VVA8bJ0ju0kVaqoWpNH4VPWsYewebzZE"};
    public static final InterfaceC0511Bv A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0510Bu A09;
    public C0651Hz A0A;
    public boolean A0B;
    public CY[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0651Hz A0F;
    public final C0651Hz A0G;
    public final C0651Hz A0H;
    public final ArrayDeque<XT> A0I;

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{107, 94, 69, 71, 10, 89, 67, 80, 79, 10, 70, 79, 89, 89, 10, 94, 66, 75, 68, 10, 66, 79, 75, 78, 79, 88, 10, 70, 79, 68, 77, 94, 66, 10, 2, 95, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 3, 4, 104, 109, 57, 57};
    }

    static {
        A07();
        A0L = new XM();
        A0M = IF.A08(A04(48, 4, 57));
    }

    public XL() {
        this(0);
    }

    public XL(int i10) {
        this.A0E = i10;
        this.A0F = new C0651Hz(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0651Hz(AbstractC0647Hv.A03);
        this.A0G = new C0651Hz(4);
        this.A06 = -1;
    }

    private int A00(long j3) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i10 = 1;
        int i11 = -1;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        int i12 = 0;
        while (true) {
            CY[] cyArr = this.A0C;
            if (i12 >= cyArr.length) {
                if (j11 == Long.MAX_VALUE || trackIndex == 0) {
                    return i11;
                }
                long preferredSkipAmount = 10485760 + j11;
                if (j10 < preferredSkipAmount) {
                    return i11;
                }
                return minAccumulatedBytesTrackIndex;
            }
            CY cy = cyArr[i12];
            int i13 = cy.A00;
            if (i13 != cy.A03.A01) {
                long j12 = cy.A03.A06[i13];
                String[] strArr = A0K;
                if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                    throw new RuntimeException();
                }
                A0K[7] = "SNUxNBsUQVazn7VwiZNUPsjETt3vlrb9";
                long j13 = this.A0D[i12][i13];
                long j14 = j12 - j3;
                int i14 = (j14 < 0 || j14 >= 262144) ? 1 : 0;
                if ((i14 == 0 && i10 != 0) || (i14 == i10 && j14 < sampleAccumulatedBytes)) {
                    i10 = i14;
                    sampleAccumulatedBytes = j14;
                    i11 = i12;
                    j10 = j13;
                }
                if (j13 < j11) {
                    j11 = j13;
                    trackIndex = i14;
                    minAccumulatedBytesTrackIndex = i12;
                }
            }
            i12++;
        }
    }

    private int A01(InterfaceC0509Bt interfaceC0509Bt, C0513Bz c0513Bz) throws IOException, InterruptedException {
        int i10;
        long A7i = interfaceC0509Bt.A7i();
        if (this.A06 == -1) {
            int A00 = A00(A7i);
            this.A06 = A00;
            if (A00 == -1) {
                return -1;
            }
        }
        CY cy = this.A0C[this.A06];
        C4 trackOutput = cy.A01;
        int i11 = cy.A00;
        long j3 = cy.A03.A06[i11];
        int i12 = cy.A03.A05[i11];
        long j10 = (j3 - A7i) + this.A04;
        if (j10 < 0 || j10 >= 262144) {
            c0513Bz.A00 = j3;
            return 1;
        }
        if (cy.A02.A02 == 1) {
            j10 += 8;
            i12 -= 8;
        }
        interfaceC0509Bt.AGP((int) j10);
        int sampleSize = cy.A02.A01;
        String[] strArr = A0K;
        if (strArr[5].charAt(6) == strArr[3].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[2] = "Kr0RNkXRcq3MKFcdyeDViEL730qvS1Or";
        strArr2[4] = "dsHpYadjIesMKkl8nKWo5Xy2zI1EHMvq";
        if (sampleSize != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int nalUnitLengthFieldLength = cy.A02.A01;
            int i13 = 4 - cy.A02.A01;
            while (this.A04 < i12) {
                int i14 = this.A05;
                if (i14 == 0) {
                    interfaceC0509Bt.readFully(this.A0G.A00, i13, nalUnitLengthFieldLength);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    trackOutput.AFR(this.A0H, 4);
                    this.A04 += 4;
                    i12 += i13;
                } else {
                    int AFQ = trackOutput.AFQ(interfaceC0509Bt, i14, false);
                    this.A04 += AFQ;
                    this.A05 -= AFQ;
                }
            }
            i10 = 0;
        } else {
            while (true) {
                int i15 = this.A04;
                if (i15 >= i12) {
                    break;
                }
                int AFQ2 = trackOutput.AFQ(interfaceC0509Bt, i12 - i15, false);
                this.A04 += AFQ2;
                this.A05 -= AFQ2;
            }
            i10 = 0;
        }
        long[] jArr = cy.A03.A07;
        String[] strArr3 = A0K;
        if (strArr3[0].charAt(11) != strArr3[1].charAt(11)) {
            A0K[6] = "rOKgrdqhHdXOkXubOIefZGVtdh7cvyNY";
            trackOutput.AFS(jArr[i11], cy.A03.A04[i11], i12, 0, null);
            cy.A00 += 0;
            this.A06 = -1;
            this.A04 = i10;
            this.A05 = i10;
            return i10;
        }
        A0K[6] = "wHchi0wLq1ErSeSpKTFcZRDvkUCQV0RS";
        trackOutput.AFS(jArr[i11], cy.A03.A04[i11], i12, 0, null);
        cy.A00++;
        this.A06 = -1;
        this.A04 = i10;
        this.A05 = i10;
        return i10;
    }

    public static int A02(C0520Ch c0520Ch, long j3) {
        int A00 = c0520Ch.A00(j3);
        if (A00 == -1) {
            return c0520Ch.A01(j3);
        }
        return A00;
    }

    public static long A03(C0520Ch c0520Ch, long j3, long j10) {
        int A02 = A02(c0520Ch, j3);
        if (A02 == -1) {
            return j10;
        }
        long min = Math.min(c0520Ch.A06[A02], j10);
        if (A0K[6].charAt(20) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[5] = "p3vbyKglgBhvg6ga7RihuDYjPakbSwaT";
        strArr[3] = "aiiDKqFmbgCXZZv8uVJN0mXFbRvDRlE6";
        return min;
    }

    private ArrayList<C0520Ch> A05(XT xt, C0512Bw c0512Bw, boolean z10) throws C04599v {
        C0517Ce A0C;
        ArrayList<C0520Ch> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < xt.A01.size(); i10++) {
            XT xt2 = xt.A01.get(i10);
            int i11 = ((CJ) xt2).A00;
            if (i11 == CJ.A1M && (A0C = CO.A0C(xt2, xt.A07(CJ.A0o), C.TIME_UNSET, null, z10, this.A0B)) != null) {
                C0520Ch A0E = CO.A0E(A0C, xt2.A06(CJ.A0e).A06(CJ.A0i).A06(CJ.A17), c0512Bw);
                if (A0E.A01 != 0) {
                    arrayList.add(A0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r5.A03 == 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(long r6) throws com.facebook.ads.redexgen.uinode.C04599v {
        /*
            r5 = this;
        L0:
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.XT> r0 = r5.A0I
            boolean r4 = r0.isEmpty()
            r3 = 2
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.XL.A0K
            r0 = 7
            r1 = r1[r0]
            r0 = 14
            char r1 = r1.charAt(r0)
            r0 = 114(0x72, float:1.6E-43)
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.XL.A0K
            java.lang.String r1 = "xKK31fned0mjTVppOAxzoNj9viNrlryO"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "3HkC7zoZl6jjTlZPcBHC3lXiUTtQlSXh"
            r0 = 1
            r2[r0] = r1
            if (r4 != 0) goto L5f
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.XT> r0 = r5.A0I
            java.lang.Object r0 = r0.peek()
            com.facebook.ads.redexgen.X.XT r0 = (com.facebook.ads.redexgen.uinode.XT) r0
            long r1 = r0.A00
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L5f
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.XT> r0 = r5.A0I
            java.lang.Object r2 = r0.pop()
            com.facebook.ads.redexgen.X.XT r2 = (com.facebook.ads.redexgen.uinode.XT) r2
            int r1 = r2.A00
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A0k
            if (r1 != r0) goto L4b
            r5.A0A(r2)
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.XT> r0 = r5.A0I
            r0.clear()
            r5.A03 = r3
            goto L0
        L4b:
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.XT> r0 = r5.A0I
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L0
            java.util.ArrayDeque<com.facebook.ads.redexgen.X.XT> r0 = r5.A0I
            java.lang.Object r0 = r0.peek()
            com.facebook.ads.redexgen.X.XT r0 = (com.facebook.ads.redexgen.uinode.XT) r0
            r0.A08(r2)
            goto L0
        L5f:
            int r0 = r5.A03
            if (r0 == r3) goto L66
            r5.A06()
        L66:
            return
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.XL.A08(long):void");
    }

    private void A09(long j3) {
        for (CY cy : this.A0C) {
            C0520Ch c0520Ch = cy.A03;
            int A00 = c0520Ch.A00(j3);
            if (A00 == -1) {
                A00 = c0520Ch.A01(j3);
            }
            cy.A00 = A00;
            if (A0K[6].charAt(20) == 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[5] = "MNnvCsSYuz9FkO9KQczdYnABN7zTLwyu";
            strArr[3] = "oflUn1lXrJVPIzwz3GYNJmaWxDOTuoWv";
        }
    }

    private void A0A(XT xt) throws C04599v {
        ArrayList<C0520Ch> A05;
        int trackCount = -1;
        long j3 = C.TIME_UNSET;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C0512Bw c0512Bw = new C0512Bw();
        XS A07 = xt.A07(CJ.A1Q);
        if (A07 != null && (metadata = CO.A0F(A07, this.A0B)) != null) {
            c0512Bw.A05(metadata);
        }
        try {
            A05 = A05(xt, c0512Bw, (this.A0E & 1) != 0);
        } catch (XP unused) {
            c0512Bw = new C0512Bw();
            A05 = A05(xt, c0512Bw, true);
        }
        int size = A05.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0520Ch c0520Ch = A05.get(i10);
            C0517Ce c0517Ce = c0520Ch.A03;
            CY cy = new CY(c0517Ce, c0520Ch, this.A09.AGi(i10, c0517Ce.A03));
            Format A0F = c0517Ce.A07.A0F(c0520Ch.A00 + 30);
            if (c0517Ce.A03 == 1) {
                if (c0512Bw.A03()) {
                    A0F = A0F.A0G(c0512Bw.A00, c0512Bw.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            cy.A01.A5n(A0F);
            j3 = Math.max(j3, c0517Ce.A04 != C.TIME_UNSET ? c0517Ce.A04 : c0520Ch.A02);
            if (c0517Ce.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(cy);
        }
        this.A02 = trackCount;
        this.A08 = j3;
        CY[] cyArr = (CY[]) arrayList.toArray(new CY[arrayList.size()]);
        this.A0C = cyArr;
        this.A0D = A0G(cyArr);
        this.A09.A5Y();
        this.A09.AFi(this);
    }

    public static boolean A0B(int i10) {
        return i10 == CJ.A0k || i10 == CJ.A1M || i10 == CJ.A0e || i10 == CJ.A0i || i10 == CJ.A17 || i10 == CJ.A0O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r4 != r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r4 == com.facebook.ads.redexgen.uinode.CJ.A0P) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r4 == com.facebook.ads.redexgen.uinode.CJ.A1A) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r4 == com.facebook.ads.redexgen.uinode.CJ.A1D) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r4 == com.facebook.ads.redexgen.uinode.CJ.A1F) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r4 == com.facebook.ads.redexgen.uinode.CJ.A18) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r4 == com.facebook.ads.redexgen.uinode.CJ.A0C) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r4 == com.facebook.ads.redexgen.uinode.CJ.A1K) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r4 == com.facebook.ads.redexgen.uinode.CJ.A0V) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r4 != com.facebook.ads.redexgen.uinode.CJ.A1Q) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        if (r4 != r3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0C(int r4) {
        /*
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A0d
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A0o
            if (r4 == r0) goto L7a
            int r3 = com.facebook.ads.redexgen.uinode.CJ.A0W
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.XL.A0K
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.XL.A0K
            java.lang.String r1 = "Lbfp0NvNFR61AEm901fhAiQEZdUAojSN"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A1B
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A1E
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A1C
            if (r4 == r0) goto L7a
            int r3 = com.facebook.ads.redexgen.uinode.CJ.A0D
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.XL.A0K
            r0 = 0
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 11
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L7e
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.XL.A0K
            java.lang.String r1 = "AcWpjtb96ZMDu8ZbPmw7y3S9ldwHNTMG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "liNDCAzQcSMqwn5YpITrjlM20opaDBZf"
            r0 = 4
            r2[r0] = r1
            if (r4 == r3) goto L7a
        L56:
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A0P
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A1A
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A1D
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A1F
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A18
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A0C
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A1K
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A0V
            if (r4 == r0) goto L7a
            int r0 = com.facebook.ads.redexgen.uinode.CJ.A1Q
            if (r4 != r0) goto L7c
        L7a:
            r0 = 1
        L7b:
            return r0
        L7c:
            r0 = 0
            goto L7b
        L7e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.XL.A0K
            java.lang.String r1 = "Et4fiiNPrE1ktHaAFcacRxoSMiMckR7G"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto L7a
            goto L56
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.XL.A0C(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        if (r2 != (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012c, code lost:
    
        r11.A07 = (r2 - r12.A7i()) + r11.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
    
        if (r2 != (-1)) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0D(com.facebook.ads.redexgen.uinode.InterfaceC0509Bt r12) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.XL.A0D(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    private boolean A0E(InterfaceC0509Bt interfaceC0509Bt, C0513Bz c0513Bz) throws IOException, InterruptedException {
        long j3 = this.A07 - this.A00;
        long atomEndPosition = interfaceC0509Bt.A7i() + j3;
        boolean z10 = false;
        C0651Hz c0651Hz = this.A0A;
        if (c0651Hz != null) {
            interfaceC0509Bt.readFully(c0651Hz.A00, this.A00, (int) j3);
            if (this.A01 == CJ.A0V) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new XS(this.A01, this.A0A));
            }
        } else if (j3 < 262144) {
            interfaceC0509Bt.AGP((int) j3);
        } else {
            long atomPayloadSize = interfaceC0509Bt.A7i();
            c0513Bz.A00 = atomPayloadSize + j3;
            z10 = true;
        }
        A08(atomEndPosition);
        return z10 && this.A03 != 2;
    }

    public static boolean A0F(C0651Hz c0651Hz) {
        int A08;
        int majorBrand;
        c0651Hz.A0Y(8);
        int A082 = c0651Hz.A08();
        int majorBrand2 = A0M;
        if (A082 == majorBrand2) {
            return true;
        }
        c0651Hz.A0Z(4);
        do {
            int A04 = c0651Hz.A04();
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[1];
            int charAt = str.charAt(11);
            int majorBrand3 = str2.charAt(11);
            if (charAt != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "HZNBHqeXKlwJLRyY4R1ZazClo3jLxgS8";
            strArr2[3] = "ULnGw1bPzwMM6OF7GcjqoSbIBNnkFp5Y";
            if (A04 > 0) {
                A08 = c0651Hz.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (A08 != majorBrand);
        return true;
    }

    public static long[][] A0G(CY[] cyArr) {
        long[][] jArr = new long[cyArr.length];
        int[] iArr = new int[cyArr.length];
        long[] jArr2 = new long[cyArr.length];
        boolean[] zArr = new boolean[cyArr.length];
        for (int i10 = 0; i10 < cyArr.length; i10++) {
            jArr[i10] = new long[cyArr[i10].A03.A01];
            jArr2[i10] = cyArr[i10].A03.A07[0];
        }
        long j3 = 0;
        int i11 = 0;
        while (true) {
            int length = cyArr.length;
            String[] strArr = A0K;
            if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "yJ2jD62HfH2jQTY3DSfm8DixkPqWTM6R";
            strArr2[3] = "ERCQlGdy7dAXpXma9fK0CLCiAFSx2az3";
            if (i11 < length) {
                long j10 = Long.MAX_VALUE;
                int minTimeTrackIndex = -1;
                for (int i12 = 0; i12 < cyArr.length; i12++) {
                    if (!zArr[i12] && jArr2[i12] <= j10) {
                        minTimeTrackIndex = i12;
                        j10 = jArr2[i12];
                    }
                }
                int i13 = iArr[minTimeTrackIndex];
                jArr[minTimeTrackIndex][i13] = j3;
                j3 += cyArr[minTimeTrackIndex].A03.A05[i13];
                int i14 = i13 + 1;
                iArr[minTimeTrackIndex] = i14;
                if (i14 < jArr[minTimeTrackIndex].length) {
                    jArr2[minTimeTrackIndex] = cyArr[minTimeTrackIndex].A03.A07[i14];
                } else {
                    zArr[minTimeTrackIndex] = true;
                    i11++;
                }
            } else {
                return jArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j3) {
        long j10;
        long j11;
        int A01;
        CY[] cyArr = this.A0C;
        if (cyArr.length == 0) {
            return new C0(C2.A03);
        }
        long j12 = C.TIME_UNSET;
        long j13 = -1;
        int i10 = this.A02;
        if (i10 != -1) {
            C0520Ch c0520Ch = cyArr[i10].A03;
            int A02 = A02(c0520Ch, j3);
            if (A02 == -1) {
                return new C0(C2.A03);
            }
            j10 = c0520Ch.A07[A02];
            j11 = c0520Ch.A06[A02];
            if (j10 < j3 && A02 < c0520Ch.A01 - 1 && (A01 = c0520Ch.A01(j3)) != -1 && A01 != A02) {
                j12 = c0520Ch.A07[A01];
                j13 = c0520Ch.A06[A01];
            }
        } else {
            j10 = j3;
            j11 = Long.MAX_VALUE;
        }
        int secondSampleIndex = 0;
        while (true) {
            CY[] cyArr2 = this.A0C;
            if (secondSampleIndex >= cyArr2.length) {
                break;
            }
            if (secondSampleIndex != this.A02) {
                C0520Ch c0520Ch2 = cyArr2[secondSampleIndex].A03;
                j11 = A03(c0520Ch2, j10, j11);
                if (j12 != C.TIME_UNSET) {
                    j13 = A03(c0520Ch2, j12, j13);
                }
            }
            secondSampleIndex++;
        }
        C2 c22 = new C2(j10, j11);
        if (j12 == C.TIME_UNSET) {
            return new C0(c22);
        }
        return new C0(c22, new C2(j12, j13));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final void A8o(InterfaceC0510Bu interfaceC0510Bu) {
        this.A09 = interfaceC0510Bu;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final int AEH(InterfaceC0509Bt interfaceC0509Bt, C0513Bz c0513Bz) throws IOException, InterruptedException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (!A0D(interfaceC0509Bt)) {
                        return -1;
                    }
                    break;
                case 1:
                    if (!A0E(interfaceC0509Bt, c0513Bz)) {
                        break;
                    } else {
                        return 1;
                    }
                case 2:
                    return A01(interfaceC0509Bt, c0513Bz);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final void AFh(long j3, long j10) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j3 == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0508Bs
    public final boolean AGR(InterfaceC0509Bt interfaceC0509Bt) throws IOException, InterruptedException {
        return AbstractC0516Cc.A04(interfaceC0509Bt);
    }
}
