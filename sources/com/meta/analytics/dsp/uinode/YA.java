package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class YA<T> implements AnonymousClass97<T> {
    public static byte[] A06;
    public C10048z A00;
    public C10048z A01;
    public List<YA<T>.RecordFileBasedFetch> A02;
    public boolean A03;
    public final C10038y A04;
    public final C9E A05;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, Ascii.SI, -63, Ascii.DLE, Ascii.SI, Ascii.CR, Ascii.SUB, -63, 5, 6, Ascii.CR, 6, Ascii.NAK, 6, -63, 4, Ascii.SYN, 19, Ascii.DC4, Ascii.DLE, 19, Ascii.DC4, -63, 17, Ascii.DLE, 10, Ascii.SI, Ascii.NAK, 10, Ascii.SI, 8, -63, 2, Ascii.NAK, -63, Ascii.NAK, 9, 6, -63, 5, 2, Ascii.NAK, 2, 3, 2, Ascii.DC4, 6, -63, Ascii.DC4, Ascii.NAK, 2, 19, Ascii.NAK, -38, Ascii.FF, 9, 10, 6, 9, -73, 7, 6, 10, 0, Ascii.VT, 0, 6, 5, -73, 0, 10, -73, -8, Ascii.VT, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, Ascii.FF, -4, 5, -6, -4, -73, 10, Ascii.VT, -8, 9, Ascii.VT, 10, -73, -8, Ascii.VT, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, Ascii.VT, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, Ascii.DLE, -73, -7, -4, -4, 5, -73, 3, 6, 10, Ascii.VT, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, Ascii.VT, 4, 3, -65, 19, Ascii.SO, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, Ascii.SO, -65, Ascii.VT, Ascii.SO, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, Ascii.DC2, Ascii.SUB, Ascii.GS, Ascii.SYN, Ascii.NAK, -47, 37, 32, -47, Ascii.ETB, Ascii.SYN, 37, Ascii.DC4, Ascii.EM, -47, Ascii.NAK, Ascii.DC2, 37, Ascii.DC2, -47, Ascii.ETB, 35, 32, Ascii.RS, -47, Ascii.GS, 32, Ascii.CAN, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, Ascii.US, 66, 69, 62, Ascii.ESC, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, Ascii.GS, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, Ascii.VT, 9, Ascii.NAK, Ascii.CAN, 10, -20, Ascii.SI, Ascii.DC2, Ascii.VT, -24, 7, Ascii.EM, Ascii.VT, 10, -8, Ascii.VT, 9, Ascii.NAK, Ascii.CAN, 10, -22, 7, Ascii.SUB, 7, 8, 7, Ascii.EM, Ascii.VT, -58, Ascii.SI, Ascii.EM, -58, 9, Ascii.DC2, Ascii.NAK, Ascii.EM, Ascii.VT, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, Ascii.VT, Ascii.GS, Ascii.SUB, Ascii.ESC, Ascii.ETB, Ascii.SUB, 5, 2, Ascii.NAK, 2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/YA<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(YB yb) {
        if (!this.A02.remove(yb)) {
            return false;
        }
        if (yb.A5g() > 0 && yb.A01().A02.A05(yb.A01().A01).equals(this.A01)) {
            this.A01 = yb.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public YA(AnonymousClass94 anonymousClass94, C9C c9c) throws IOException {
        this.A05 = new C9E(anonymousClass94.A04(A00(515, 4, 63)), c9c);
        C10038y c10038y = new C10038y(new File(anonymousClass94.A05(), A00(509, 6, 70)));
        this.A04 = c10038y;
        this.A00 = c10038y.A03();
        this.A02 = new ArrayList();
        A05(c9c);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i9, int i10) throws IOException {
        C10048z c10048z = new C10048z(i9, i10);
        this.A00 = c10048z;
        this.A04.A04(c10048z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/YA<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(YB yb) throws C9G {
        if (!this.A03) {
            if (A06(yb)) {
                if (yb.A5g() == 0) {
                    return;
                }
                if (this.A00.A04(yb.A00().A02) == 0) {
                    try {
                        Iterator<C9B> it = yb.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), yb.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e4) {
                        throw new C9G(A00(361, 30, 93), e4);
                    }
                }
                throw new C9G(A00(0, 54, 63));
            }
            throw new C9G(A00(466, 43, 49));
        }
        throw new C9G(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(com.meta.analytics.dsp.uinode.C9C r11) throws java.io.IOException {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.9E r0 = r10.A05
            int r0 = r0.A06()
            r5 = 0
            com.facebook.ads.redexgen.X.8z r3 = new com.facebook.ads.redexgen.X.8z
            r3.<init>(r0, r5)
            com.facebook.ads.redexgen.X.8z r0 = r10.A00
            int r0 = r3.A04(r0)
            r4 = 3
            r9 = 2
            r8 = 1
            if (r0 <= 0) goto L5c
            java.util.Locale r7 = java.util.Locale.US
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.facebook.ads.redexgen.X.8z r0 = r10.A00
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            com.facebook.ads.redexgen.X.8z r0 = r10.A00
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r8] = r0
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r9] = r0
            int r0 = r3.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r4] = r0
            r2 = 54
            r1 = 102(0x66, float:1.43E-43)
            r0 = 53
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r11.AFF(r0)
            r10.A00 = r3
        L5b:
            return
        L5c:
            int r1 = r3.A02()
            com.facebook.ads.redexgen.X.8z r0 = r10.A00
            int r0 = r0.A02()
            if (r1 >= r0) goto L5b
            com.facebook.ads.redexgen.X.9E r0 = r10.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.8z r3 = new com.facebook.ads.redexgen.X.8z
            com.facebook.ads.redexgen.X.9E r0 = r10.A05
            int r0 = r0.A06()
            r3.<init>(r0, r5)
            goto L5c
        L7c:
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.facebook.ads.redexgen.X.8z r0 = r10.A00
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            com.facebook.ads.redexgen.X.8z r0 = r10.A00
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r8] = r0
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r9] = r0
            r2 = 156(0x9c, float:2.19E-43)
            r1 = 101(0x65, float:1.42E-43)
            r0 = 13
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r11.AFF(r0)
            com.facebook.ads.redexgen.X.9E r0 = r10.A05
            int r2 = r0.A06()
            com.facebook.ads.redexgen.X.9E r0 = r10.A05
            int r0 = r0.A07()
            com.facebook.ads.redexgen.X.8z r1 = new com.facebook.ads.redexgen.X.8z
            r1.<init>(r2, r0)
            r10.A00 = r1
            com.facebook.ads.redexgen.X.8y r0 = r10.A04
            r0.A04(r1)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.YA.A05(com.facebook.ads.redexgen.X.9C):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YB != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized AnonymousClass96 A5f(byte[] bArr, int[] iArr) throws C9G {
        YA<T>.RecordFileBasedFetch yb;
        if (!this.A03) {
            int i9 = 0;
            int i10 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    AnonymousClass92 A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i9, iArr, i10);
                    int A00 = A0A.A01().A00();
                    int storageOffset = A0A.A01().A01();
                    int i11 = A00 - storageOffset;
                    int storageOffset2 = A0A.A01().A02();
                    i9 += storageOffset2;
                    i10 += i11;
                    if (A0A.A01().A03() == AnonymousClass90.A02) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == AnonymousClass90.A03) {
                        break;
                    }
                    if (A0A.A01().A03() == AnonymousClass90.A04) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new C10048z(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i11);
                    }
                }
                yb = new YB(this, arrayList, mayHaveMoreData);
                this.A02.add(yb);
                if (!arrayList.isEmpty()) {
                    C10048z c10048z = yb.A01().A02;
                    int storageOffset6 = yb.A01().A01;
                    this.A01 = c10048z.A05(storageOffset6);
                }
            } catch (IOException e4) {
                throw new C9G(A00(306, 29, 79), e4);
            }
        } else {
            throw new C9G(A00(391, 36, 119));
        }
        return yb;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized int A7n() throws C9G {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                int A02 = this.A00.A02();
                int count = this.A05.A06();
                if (A02 == count) {
                    int count2 = this.A00.A03();
                    A09 -= count2;
                }
            } catch (IOException e4) {
                throw new C9G(A00(335, 26, 122), e4);
            }
        } else {
            throw new C9G(A00(427, 39, 68));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized void AGb(byte[] bArr) throws C9G {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e4) {
                throw new C9G(A00(257, 25, 61), e4);
            }
        } else {
            throw new C9G(A00(427, 39, 68));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.meta.analytics.dsp.uinode.AnonymousClass97
    public final synchronized void clear() throws C9G {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e4) {
            throw new C9G(A00(282, 24, 16), e4);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.YA != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
