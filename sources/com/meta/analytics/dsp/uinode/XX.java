package com.meta.analytics.dsp.uinode;

import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class XX implements InterfaceC1074Bs {
    public static byte[] A0p;
    public static String[] A0q = {"WhKu7pkuAeXCsVE8uRhv3EZwgBp9riSc", "wrDeNyGLCWUv14ZggE2zPWUzu5gjoOIg", "xUs1VEgTJlmvEesGlKYim2mGX89Mn6Ap", "W8YnXYO8xf4ClNYvDZVYWX", "B88t6KSt5rHqx0X", "mP1RKkMa67OSAD0gBpbGTYhDs7d4UNMk", "rmkWP1gG3PZnRTV6Vu72xnpKfVt", "q3NSDD9bEbAX3BTi5XmjKvgCV917aeoR"};
    public static final InterfaceC1077Bv A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public InterfaceC1076Bu A0N;
    public CE A0O;
    public C1207Hp A0P;
    public C1207Hp A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<CE> A0c;
    public final CA A0d;
    public final CH A0e;
    public final C1217Hz A0f;
    public final C1217Hz A0g;
    public final C1217Hz A0h;
    public final C1217Hz A0i;
    public final C1217Hz A0j;
    public final C1217Hz A0k;
    public final C1217Hz A0l;
    public final C1217Hz A0m;
    public final C1217Hz A0n;
    public final boolean A0o;

    public static String A03(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 12);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0p = new byte[]{65, -113, -112, -107, 65, -108, -106, -111, -111, -112, -109, -107, -122, -123, -98, -87, -86, -35, -77, -98, -87, -85, -35, -77, -98, -87, -85, -35, -77, -98, -87, -85, -35, 56, 67, 69, 119, 77, 56, 67, 69, 119, 77, 56, 67, 69, 119, 63, 56, 67, 70, 119, -107, -103, -89, -89, -71, -56, -56, -67, -62, -69, -57, -105, -67, -60, -68, -71, -58, -95, -61, -72, -71, 116, -53, -23, -53, -53, -51, -55, -25, -55, -53, -69, -81, -51, -78, -62, -63, -117, -87, -114, -98, -99, 121, -113, -94, -102, -100, -113, -99, -99, -93, -63, -90, -74, -75, -111, -82, -79, -75, -75, -82, -89, -75, -75, -120, -90, -116, -120, -118, 122, 94, 124, 99, 105, 94, 96, -77, -47, -65, -62, -73, -71, -95, -66, -92, 85, 115, 97, 100, 89, 91, 67, 96, 71, 116, -110, Byte.MIN_VALUE, -122, 98, 116, 118, Byte.MIN_VALUE, -77, -47, -63, -62, -57, -59, -100, -70, -85, -98, -88, -118, -92, -87, -81, -118, -89, -92, -81, -117, -87, -98, -100, -97, -113, -110, -114, -92, -62, -71, -78, -75, -91, -84, -74, -109, -79, -66, 119, -60, 112, -61, -77, -79, -68, -75, 112, -60, -71, -67, -75, -77, -65, -76, -75, 112, -64, -62, -71, -65, -62, 112, -60, -65, 112, -60, -71, -67, -75, -77, -65, -76, -75, -93, -77, -79, -68, -75, 112, -78, -75, -71, -66, -73, 112, -61, -75, -60, 126, 89, -123, -125, 120, Ascii.DEL, -124, Ascii.DEL, -124, 125, 54, 123, -124, 121, -120, -113, -122, -118, Ascii.DEL, -123, -124, 54, 119, -124, 122, 54, 121, -123, -125, -122, -120, 123, -119, -119, Ascii.DEL, -123, -124, 54, Ascii.DEL, -119, 54, -124, -123, -118, 54, -119, -117, -122, -122, -123, -120, -118, 123, 122, -69, -25, -26, -20, -35, -26, -20, -69, -25, -27, -24, -71, -28, -33, -25, -104, -111, -67, -68, -62, -77, -68, -62, -109, -68, -79, -113, -70, -75, -67, 110, -89, -45, -46, -40, -55, -46, -40, -87, -46, -57, -45, -56, -51, -46, -53, -77, -42, -56, -55, -42, -124, 120, -92, -93, -87, -102, -93, -87, 122, -93, -104, -92, -103, -98, -93, -100, -120, -104, -92, -91, -102, 85, -59, -16, -28, -43, -6, -15, -26, -95, 94, -119, 125, 110, -109, -118, Ascii.DEL, 108, Ascii.DEL, 123, 126, 112, Ascii.DEL, -116, -115, -125, -119, -120, 58, -68, -71, -60, -61, -105, -29, -40, -38, -32, -27, -34, -105, -22, -40, -28, -25, -29, -36, -105, -22, -32, -15, -36, -105, -26, -20, -21, -105, -26, -35, -105, -23, -40, -27, -34, -36, -91, -79, -82, -71, -72, -66, -47, -51, -48, -62, -47, -34, -33, -43, -37, -38, -116, -60, -19, -30, -15, -8, -17, -13, -28, -29, -97, -45, -15, -32, -30, -22, -97, -27, -18, -12, -19, -29, -97, -31, -12, -13, -97, -62, -18, -19, -13, -28, -19, -13, -60, -19, -30, -54, -28, -8, -56, -61, -97, -10, -32, -14, -97, -19, -18, -13, -97, -27, -18, -12, -19, -29, 103, -102, -106, -121, -112, -107, -117, -111, -112, 66, -124, -117, -106, 66, -117, -107, 66, -107, -121, -106, 66, -117, -112, 66, -107, -117, -119, -112, -125, -114, 66, -124, -101, -106, -121, -91, -50, -47, -52, -64, -45, -103, Ascii.DEL, -78, -45, -64, -47, -45, -117, Ascii.DEL, -92, -51, -61, -117, Ascii.DEL, -79, -60, -64, -61, -82, -47, -61, -60, -47, -117, Ascii.DEL, -85, -64, -40, -60, -47, -117, Ascii.DEL, -78, -45, -40, -53, -60, -117, Ascii.DEL, -83, -64, -52, -60, -117, Ascii.DEL, -84, -64, -47, -58, -56, -51, -85, -117, Ascii.DEL, -84, -64, -47, -58, -56, -51, -79, -117, Ascii.DEL, -84, -64, -47, -58, -56, -51, -75, -117, Ascii.DEL, -92, -59, -59, -60, -62, -45, -117, Ascii.DEL, -77, -60, -41, -45, -99, -78, -76, -70, -65, -72, 113, -64, -65, -67, -54, 113, -60, -58, -63, -63, -64, -61, -59, -74, -75, 113, -70, -65, 113, -92, -70, -66, -63, -67, -74, -109, -67, -64, -76, -68, -60, Ascii.DEL, 115, -121, -108, -118, -121, -102, -107, -104, -97, 70, -117, -110, -117, -109, -117, -108, -102, 70, 121, -117, -117, -111, 111, 106, 70, -107, -104, 70, 121, -117, -117, -111, 118, -107, -103, -113, -102, -113, -107, -108, 70, -108, -107, -102, 70, -116, -107, -101, -108, -118, -54, -14, -23, -15, -26, -19, -23, -30, -99, -48, -30, -28, -22, -30, -21, -15, -99, -30, -23, -30, -22, -30, -21, -15, -16, -99, -21, -20, -15, -99, -16, -14, -19, -19, -20, -17, -15, -30, -31, -102, -69, 108, -62, -83, -72, -75, -80, 108, -64, -66, -83, -81, -73, -65, 108, -61, -79, -66, -79, 108, -78, -69, -63, -70, -80, 119, -104, 73, -97, -118, -107, -110, -115, 73, -97, -118, -101, -110, -105, -99, 73, -107, -114, -105, -112, -99, -111, 73, -106, -118, -100, -108, 73, -113, -104, -98, -105, -115, 112, 124, 97, 115, 95, 112, 114, 95, -44, -32, -55, -59, -50, -41, -80, -47, -56, -44, -104, -92, -103, -118, -99, -103, 116, -122, -104, -104, -72, -60, -71, -86, -67, -71, -108, -70, -71, -85, -99, -42, -30, -39, -46, -59, -42, -40, -59, 104, -127, 120, -117, -125, 120, 118, -121, 120, 119, 51, 124, 119, 77, 51, Ascii.DEL, -104, -113, -94, -102, -113, -115, -98, -113, -114, 74, -106, -117, -115, -109, -104, -111, 74, -96, -117, -106, -97, -113, 100, 74, -86, -77, -95, -92, -103, -101, -122, -38, -29, -47, -44, -55, -53, -72, -77, -51, -41, -45, -77, -59, -44, -72, -63, -81, -78, -89, -87, -106, -111, -85, -75, -79, -111, -93, -75, -78, 122, -125, 113, 116, 105, 107, 88, 83, 109, 119, 115, 83, 101, 122, 103, -53, -44, -62, -59, -70, -68, -87, -92, -66, -56, -60, -92, -56, -59, 116, 125, 107, 110, 99, 101, 102, 77, 103, 113, 109, 77, 102, 99, 116, 97, -47, -38, -56, -50, -86, -47, -63, -46, -86, -63, -54, -48, -51, -66, -66, -67, -58, 
        -69, -81, -84, -74, -71, -88, -100, -91, -100, -106, 126, 118, Ascii.DEL, 118, 112, 89, -13, -25, -6, -8, -11, -7, -15, -25, -63, -76, -81, -80, -70, 122, -62, -80, -83, -72, -12, -30, -33, -22};
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f3, code lost:
    
        if (A03(967, 16, 18).equals(r12.A0Y) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0275, code lost:
    
        if (r12.A0X == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x027d, code lost:
    
        if (r10.A0j.A07() != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0280, code lost:
    
        com.meta.analytics.dsp.uinode.AbstractC1192Ha.A04(r0);
        r12.A0X.A01(r11, r10.A01, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0294, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x028a, code lost:
    
        r0 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x028c, code lost:
    
        if (r0 >= r13) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x028e, code lost:
    
        A00(r11, r3, r13 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0270, code lost:
    
        if (A03(967, 16, 18).equals(r12.A0Y) != false) goto L70;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
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
    private void A08(com.meta.analytics.dsp.uinode.InterfaceC1075Bt r11, com.meta.analytics.dsp.uinode.CE r12, int r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XX.A08(com.facebook.ads.redexgen.X.Bt, com.facebook.ads.redexgen.X.CE, int):void");
    }

    static {
        A06();
        A0r = new XZ();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = IF.A0i(A03(539, 90, 83));
        A0u = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public XX() {
        this(0);
    }

    public XX(int i9) {
        this(new C1597Xa(), i9);
    }

    public XX(CA ca, int i9) {
        this.A0K = -1L;
        this.A0M = C.TIME_UNSET;
        this.A0G = C.TIME_UNSET;
        this.A0H = C.TIME_UNSET;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = C.TIME_UNSET;
        this.A0d = ca;
        ca.A8p(new XY(this, null));
        this.A0o = (i9 & 1) == 0;
        this.A0e = new CH();
        this.A0c = new SparseArray<>();
        this.A0k = new C1217Hz(4);
        this.A0n = new C1217Hz(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new C1217Hz(4);
        this.A0i = new C1217Hz(AbstractC1213Hv.A03);
        this.A0h = new C1217Hz(4);
        this.A0j = new C1217Hz();
        this.A0m = new C1217Hz();
        this.A0f = new C1217Hz(8);
        this.A0g = new C1217Hz();
    }

    private int A00(InterfaceC1075Bt interfaceC1075Bt, C4 c42, int i9) throws IOException, InterruptedException {
        int bytesRead;
        int strippedBytesLeft = this.A0j.A04();
        if (strippedBytesLeft > 0) {
            bytesRead = Math.min(i9, strippedBytesLeft);
            c42.AFR(this.A0j, bytesRead);
        } else {
            bytesRead = c42.AFQ(interfaceC1075Bt, i9, false);
        }
        this.A07 += bytesRead;
        this.A08 += bytesRead;
        return bytesRead;
    }

    private long A01(long j7) throws C10259v {
        long j9 = this.A0M;
        if (j9 != C.TIME_UNSET) {
            return IF.A0F(j7, j9, 1000L);
        }
        throw new C10259v(A03(PsExtractor.PRIVATE_STREAM_1, 54, 68));
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0064 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.meta.analytics.dsp.uinode.C1 A02() {
        /*
            r11 = this;
            long r3 = r11.A0K
            r1 = -1
            r8 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r3 = r11.A0H
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.Hp r0 = r11.A0Q
            if (r0 == 0) goto L2e
            int r0 = r0.A02()
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.Hp r0 = r11.A0P
            if (r0 == 0) goto L2e
            int r1 = r0.A02()
            com.facebook.ads.redexgen.X.Hp r0 = r11.A0Q
            int r0 = r0.A02()
            if (r1 == r0) goto L3a
        L2e:
            r11.A0Q = r8
            r11.A0P = r8
            long r1 = r11.A0H
            com.facebook.ads.redexgen.X.Xj r0 = new com.facebook.ads.redexgen.X.Xj
            r0.<init>(r1)
            return r0
        L3a:
            com.facebook.ads.redexgen.X.Hp r0 = r11.A0Q
            int r7 = r0.A02()
            int[] r9 = new int[r7]
            long[] r6 = new long[r7]
            long[] r5 = new long[r7]
            long[] r4 = new long[r7]
            r10 = 0
        L49:
            if (r10 >= r7) goto L61
            com.facebook.ads.redexgen.X.Hp r0 = r11.A0Q
            long r0 = r0.A03(r10)
            r4[r10] = r0
            long r0 = r11.A0K
            com.facebook.ads.redexgen.X.Hp r2 = r11.A0P
            long r2 = r2.A03(r10)
            long r0 = r0 + r2
            r6[r10] = r0
            int r10 = r10 + 1
            goto L49
        L61:
            r10 = 0
        L62:
            int r0 = r7 + (-1)
            if (r10 >= r0) goto L7c
            int r0 = r10 + 1
            r0 = r6[r0]
            r2 = r6[r10]
            long r0 = r0 - r2
            int r2 = (int) r0
            r9[r10] = r2
            int r0 = r10 + 1
            r2 = r4[r0]
            r0 = r4[r10]
            long r2 = r2 - r0
            r5[r10] = r2
            int r10 = r10 + 1
            goto L62
        L7c:
            int r10 = r7 + (-1)
            long r2 = r11.A0K
            long r0 = r11.A0L
            long r2 = r2 + r0
            int r0 = r7 + (-1)
            r0 = r6[r0]
            long r2 = r2 - r0
            int r0 = (int) r2
            r9[r10] = r0
            int r10 = r7 + (-1)
            long r0 = r11.A0H
            int r2 = r7 + (-1)
            r2 = r4[r2]
            long r0 = r0 - r2
            r5[r10] = r0
            r11.A0Q = r8
            r11.A0P = r8
            com.facebook.ads.redexgen.X.Xo r0 = new com.facebook.ads.redexgen.X.Xo
            r0.<init>(r9, r6, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XX.A02():com.facebook.ads.redexgen.X.C1");
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0V();
    }

    private void A07(InterfaceC1075Bt interfaceC1075Bt, int i9) throws IOException, InterruptedException {
        if (this.A0k.A07() >= i9) {
            return;
        }
        if (this.A0k.A05() < i9) {
            C1217Hz c1217Hz = this.A0k;
            c1217Hz.A0b(Arrays.copyOf(c1217Hz.A00, Math.max(this.A0k.A00.length * 2, i9)), this.A0k.A07());
        }
        byte[] bArr = this.A0k.A00;
        int A07 = this.A0k.A07();
        if (A0q[6].length() != 27) {
            throw new RuntimeException();
        }
        String[] strArr = A0q;
        strArr[0] = "ZmQc4cegfKT6TM2j1HdEhTMrEsYvVAK8";
        strArr[2] = "PLs1alOmXmQPSsdSdZUe4T02xUG6CaQT";
        interfaceC1075Bt.readFully(bArr, A07, i9 - this.A0k.A07());
        this.A0k.A0X(i9);
    }

    private void A09(InterfaceC1075Bt interfaceC1075Bt, byte[] bArr, int i9) throws IOException, InterruptedException {
        int length = bArr.length + i9;
        int sizeWithPrefix = this.A0m.A05();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i9;
            this.A0m.A00 = Arrays.copyOf(bArr, sizeWithPrefix2);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        byte[] bArr2 = this.A0m.A00;
        int sizeWithPrefix3 = bArr.length;
        interfaceC1075Bt.readFully(bArr2, sizeWithPrefix3, i9);
        this.A0m.A0W(length);
    }

    private void A0A(InterfaceC1075Bt interfaceC1075Bt, byte[] bArr, int i9, int i10) throws IOException, InterruptedException {
        int min = Math.min(i10, this.A0j.A04());
        int pendingStrippedBytes = i10 - min;
        interfaceC1075Bt.readFully(bArr, i9 + min, pendingStrippedBytes);
        if (min > 0) {
            this.A0j.A0c(bArr, i9, min);
        }
        int pendingStrippedBytes2 = this.A07;
        this.A07 = pendingStrippedBytes2 + i10;
    }

    private void A0B(CE ce, long j7) {
        if (ce.A0X != null) {
            CF cf = ce.A0X;
            if (A0q[6].length() != 27) {
                throw new RuntimeException();
            }
            A0q[6] = "nKrIVrdQs7NkqXN01cL0onp1lFd";
            cf.A03(ce, j7);
        } else {
            if (A03(843, 11, 89).equals(ce.A0Y)) {
                A0C(ce, A03(33, 19, 7), 19, 1000L, A0x);
            } else if (A03(833, 10, 57).equals(ce.A0Y)) {
                A0C(ce, A03(14, 19, 109), 21, 10000L, A0v);
            }
            ce.A0W.AFS(j7, this.A01, this.A08, 0, ce.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0C(CE ce, String str, int i9, long j7, byte[] bArr) {
        A0D(this.A0m.A00, this.A0C, str, i9, j7, bArr);
        C4 c42 = ce.A0W;
        C1217Hz c1217Hz = this.A0m;
        c42.AFR(c1217Hz, c1217Hz.A07());
        this.A08 += this.A0m.A07();
    }

    public static void A0D(byte[] bArr, long j7, String str, int i9, long j9, byte[] bArr2) {
        byte[] timeCodeData;
        if (j7 == C.TIME_UNSET) {
            timeCodeData = bArr2;
        } else {
            int i10 = (int) (j7 / 3600000000L);
            long j10 = j7 - ((i10 * 3600) * 1000000);
            int i11 = (int) (j10 / 60000000);
            int minutes = i11 * 60;
            long j11 = j10 - (minutes * 1000000);
            int lastValue = (int) (j11 / 1000000);
            int seconds = (int) ((j11 - (lastValue * 1000000)) / j9);
            timeCodeData = IF.A0i(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(lastValue), Integer.valueOf(seconds)));
        }
        System.arraycopy(timeCodeData, 0, bArr, i9, bArr2.length);
    }

    private boolean A0E(C1079Bz c1079Bz, long j7) {
        if (this.A0Y) {
            this.A0J = j7;
            c1079Bz.A00 = this.A0F;
            this.A0Y = false;
            return true;
        }
        boolean z8 = this.A0a;
        String[] strArr = A0q;
        if (strArr[0].charAt(31) == strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0q;
        strArr2[1] = "bgcuSmmv9nMD5qNgR1ZnJGCWOsXR4zDF";
        strArr2[5] = "rXrXJdml0w7r8hjghYXvJH5LLiJomjK3";
        if (z8) {
            long j9 = this.A0J;
            if (j9 != -1) {
                c1079Bz.A00 = j9;
                this.A0J = -1L;
                return true;
            }
        }
        return false;
    }

    public static boolean A0F(String str) {
        if (!A03(1006, 5, 58).equals(str) && !A03(1011, 5, 20).equals(str) && !A03(902, 7, 72).equals(str)) {
            String A03 = A03(953, 14, 105);
            String[] strArr = A0q;
            if (strArr[1].charAt(15) == strArr[5].charAt(15)) {
                A0q[7] = "rYhgwmDh4TKBcj4Uwcvshsmah3Wf4ae0";
                if (!A03.equals(str) && !A03(923, 15, 86).equals(str) && !A03(909, 14, 120).equals(str) && !A03(938, 15, 24).equals(str) && !A03(967, 16, 18).equals(str) && !A03(983, 15, 111).equals(str)) {
                    String[] strArr2 = A0q;
                    if (strArr2[1].charAt(15) != strArr2[5].charAt(15)) {
                        throw new RuntimeException();
                    }
                    A0q[6] = "rlxG2GXYid9bCHwXApke8Gz33sW";
                    if (!A03(998, 8, 91).equals(str) && !A03(154, 6, 102).equals(str) && !A03(181, 8, 87).equals(str) && !A03(74, 5, 126).equals(str) && !A03(128, 9, 102).equals(str) && !A03(137, 9, 8).equals(str) && !A03(79, 5, 124).equals(str) && !A03(116, 6, 59).equals(str) && !A03(173, 8, 62).equals(str) && !A03(84, 5, 98).equals(str) && !A03(89, 13, 62).equals(str) && !A03(102, 14, 86).equals(str) && !A03(122, 6, 17).equals(str) && !A03(146, 8, 39).equals(str) && !A03(160, 13, 79).equals(str)) {
                        boolean equals = A03(843, 11, 89).equals(str);
                        String[] strArr3 = A0q;
                        if (strArr3[0].charAt(31) != strArr3[2].charAt(31)) {
                            String[] strArr4 = A0q;
                            strArr4[1] = "DfP1dlVZEdoO22ggDOih4DhJX4h9DttB";
                            strArr4[5] = "iPMsbxRLvFu5COzgJWPWeI2fmUuAHT3S";
                            if (!equals && !A03(833, 10, 57).equals(str) && !A03(854, 8, 119).equals(str) && !A03(823, 10, 117).equals(str) && !A03(815, 8, 17).equals(str)) {
                                return false;
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static int[] A0H(int[] iArr, int i9) {
        if (iArr == null) {
            return new int[i9];
        }
        if (iArr.length >= i9) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i9)];
    }

    public final void A0I(int i9) throws C10259v {
        switch (i9) {
            case 160:
                if (this.A04 != 2) {
                    return;
                }
                if (!this.A0W) {
                    this.A01 = 1 | this.A01;
                }
                A0B(this.A0c.get(this.A05), this.A0D);
                this.A04 = 0;
                return;
            case 174:
                if (A0F(this.A0O.A0Y)) {
                    CE ce = this.A0O;
                    ce.A09(this.A0N, ce.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            case 19899:
                int i10 = this.A0B;
                if (i10 != -1) {
                    long j7 = this.A0I;
                    if (j7 != -1) {
                        if (i10 != 475249515) {
                            return;
                        }
                        this.A0F = j7;
                        return;
                    }
                }
                throw new C10259v(A03(667, 50, 26));
            case 25152:
                if (!this.A0O.A0c) {
                    return;
                }
                if (this.A0O.A0V != null) {
                    this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(C9W.A04, A03(1024, 10, 63), this.A0O.A0V.A03));
                    return;
                }
                throw new C10259v(A03(449, 55, 115));
            case 28032:
                if (!this.A0O.A0c || this.A0O.A0f == null) {
                    return;
                } else {
                    throw new C10259v(A03(243, 53, 10));
                }
            case 357149030:
                if (this.A0M == C.TIME_UNSET) {
                    this.A0M = 1000000L;
                }
                long j9 = this.A0G;
                if (j9 == C.TIME_UNSET) {
                    return;
                }
                this.A0H = A01(j9);
                return;
            case 374648427:
                if (this.A0c.size() != 0) {
                    this.A0N.A5Y();
                    return;
                }
                throw new C10259v(A03(756, 26, 64));
            case 475249515:
                if (this.A0a) {
                    return;
                }
                this.A0N.AFi(A02());
                this.A0a = true;
                return;
            default:
                return;
        }
    }

    public final void A0J(int i9, double d2) {
        switch (i9) {
            case 181:
                this.A0O.A0O = (int) d2;
                return;
            case 17545:
                this.A0G = (long) d2;
                return;
            case 21969:
                this.A0O.A06 = (float) d2;
                return;
            case 21970:
                this.A0O.A07 = (float) d2;
                return;
            case 21971:
                this.A0O.A04 = (float) d2;
                return;
            case 21972:
                this.A0O.A05 = (float) d2;
                return;
            case 21973:
                this.A0O.A02 = (float) d2;
                return;
            case 21974:
                this.A0O.A03 = (float) d2;
                return;
            case 21975:
                this.A0O.A08 = (float) d2;
                return;
            case 21976:
                this.A0O.A09 = (float) d2;
                return;
            case 21977:
                this.A0O.A00 = (float) d2;
                return;
            case 21978:
                this.A0O.A01 = (float) d2;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x030f, code lost:
    
        if (r2 < (-2147483648L)) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0322, code lost:
    
        if (com.meta.analytics.dsp.uinode.XX.A0q[7].charAt(2) == 'J') goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0324, code lost:
    
        r10 = com.meta.analytics.dsp.uinode.XX.A0q;
        r10[3] = "iXrhrupjbccuPW1gfooQkR";
        r10[4] = "StwCIbMJGGxOC39";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0330, code lost:
    
        if (r2 > 2147483647L) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0332, code lost:
    
        r10 = (int) r2;
        r1 = r19.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0335, code lost:
    
        if (r11 != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0340, code lost:
    
        r10 = r10 + r1[r11 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0337, code lost:
    
        r1[r11] = r10;
        r15 = r15 + r10;
        r11 = r11 + 1;
        r2 = 0;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0372, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A03(396, 37, 107));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0346, code lost:
    
        if (r2 > 2147483647L) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0382, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A03(782, 33, 29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0290, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0349, code lost:
    
        r19.A0b[r3 - 1] = ((r21 - r19.A06) - r12) - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03a3, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A03(877, 25, 30) + r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x021e, code lost:
    
        if (r11 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f6, code lost:
    
        if (r11 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f8, code lost:
    
        r9 = (r21 - r19.A06) - 4;
        r11 = r19.A02;
        r10 = com.meta.analytics.dsp.uinode.XX.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0210, code lost:
    
        if (r10[1].charAt(15) == r10[5].charAt(15)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0221, code lost:
    
        r10 = com.meta.analytics.dsp.uinode.XX.A0q;
        r10[1] = "RQftDwpqwbIXAF1g5dDgy2XjM3R9Fufd";
        r10[5] = "50lzYqnE8by0N6RgVVPD3M33x9kk99sn";
        java.util.Arrays.fill(r3, 0, r11, r9 / r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0233, code lost:
    
        if (r11 != 1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0235, code lost:
    
        r13 = 0;
        r11 = 4;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0238, code lost:
    
        r3 = r19.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023c, code lost:
    
        if (r12 >= (r3 - 1)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023e, code lost:
    
        r19.A0b[r12] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0242, code lost:
    
        r11 = r11 + 1;
        A07(r22, r11);
        r3 = r19.A0k.A00[r11 - 1] & 255;
        r1 = r19.A0b;
        r0 = r1[r12] + r3;
        r1[r12] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0256, code lost:
    
        if (r3 == 255) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0258, code lost:
    
        r13 = r13 + r0;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x025c, code lost:
    
        r19.A0b[r3 - 1] = ((r21 - r19.A06) - r11) - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0268, code lost:
    
        if (r11 != 3) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x026a, code lost:
    
        r15 = 0;
        r12 = 4;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026d, code lost:
    
        r3 = r19.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0271, code lost:
    
        if (r11 >= (r3 - 1)) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0273, code lost:
    
        r19.A0b[r11] = r2;
        r2 = com.meta.analytics.dsp.uinode.XX.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0289, code lost:
    
        if (r2[1].charAt(15) == r2[5].charAt(15)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0291, code lost:
    
        com.meta.analytics.dsp.uinode.XX.A0q[6] = "AJCSp0dPwFu9XZoKvCoy3nlmL9O";
        r12 = r12 + 1;
        A07(r22, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02a5, code lost:
    
        if (r19.A0k.A00[r12 - 1] == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a7, code lost:
    
        r2 = 0;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02aa, code lost:
    
        if (r13 >= 8) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02ac, code lost:
    
        r10 = r10 << (7 - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02b8, code lost:
    
        if ((r19.A0k.A00[r12 - 1] & r10) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02dd, code lost:
    
        r13 = r13 + 1;
        r10 = com.meta.analytics.dsp.uinode.XX.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02f1, code lost:
    
        if (r10[0].charAt(31) == r10[2].charAt(31)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02fc, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f3, code lost:
    
        com.meta.analytics.dsp.uinode.XX.A0q[7] = "JvemuAcSz5vc2l4QyutSma8u3cOiXxC4";
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ba, code lost:
    
        r2 = r12 - 1;
        r12 = r12 + r13;
        A07(r22, r12);
        r1 = r2 + 1;
        r2 = (r19.A0k.A00[r2] & 255) & (r10 ^ (-1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02cd, code lost:
    
        if (r1 >= r12) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02cf, code lost:
    
        r2 = (r2 << 8) | (r19.A0k.A00[r1] & 255);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02fe, code lost:
    
        if (r11 <= 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0300, code lost:
    
        r2 = r2 - ((1 << ((r13 * 7) + 6)) - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(int r20, int r21, com.meta.analytics.dsp.uinode.InterfaceC1075Bt r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XX.A0K(int, int, com.facebook.ads.redexgen.X.Bt):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01e3, code lost:
    
        if (r12 == 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01e5, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01e6, code lost:
    
        r4.A0Z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01f8, code lost:
    
        if (r12 == 1) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0L(int r11, long r12) throws com.meta.analytics.dsp.uinode.C10259v {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XX.A0L(int, long):void");
    }

    public final void A0M(int i9, long j7, long j9) throws C10259v {
        switch (i9) {
            case 160:
                this.A0W = false;
                return;
            case 174:
                this.A0O = new CE(null);
                return;
            case 187:
                this.A0Z = false;
                return;
            case 19899:
                this.A0B = -1;
                this.A0I = -1L;
                return;
            case 20533:
                this.A0O.A0c = true;
                return;
            case 21968:
                this.A0O.A0b = true;
                return;
            case 25152:
            default:
                return;
            case 408125543:
                long j10 = this.A0K;
                if (j10 == -1 || j10 == j7) {
                    this.A0K = j7;
                    this.A0L = j9;
                    return;
                }
                throw new C10259v(A03(717, 39, 113));
            case 475249515:
                this.A0Q = new C1207Hp();
                this.A0P = new C1207Hp();
                return;
            case 524531317:
                if (this.A0a) {
                    return;
                }
                if (this.A0o && this.A0F != -1) {
                    this.A0Y = true;
                    return;
                } else {
                    this.A0N.AFi(new C1606Xj(this.A0H));
                    this.A0a = true;
                    return;
                }
        }
    }

    public final void A0N(int i9, String str) throws C10259v {
        switch (i9) {
            case 134:
                this.A0O.A0Y = str;
                return;
            case 17026:
                if (A03(1034, 4, 113).equals(str) || A03(1016, 8, 122).equals(str)) {
                    return;
                } else {
                    throw new C10259v(A03(369, 8, 117) + str + A03(0, 14, 21));
                }
            case 2274716:
                CE.A02(this.A0O, str);
                return;
            default:
                return;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A0N = interfaceC1076Bu;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final int AEH(InterfaceC1075Bt interfaceC1075Bt, C1079Bz c1079Bz) throws IOException, InterruptedException {
        this.A0V = false;
        boolean z8 = true;
        while (z8 && !this.A0V) {
            z8 = this.A0d.AEJ(interfaceC1075Bt);
            if (z8 && A0E(c1079Bz, interfaceC1075Bt.A7i())) {
                return 1;
            }
        }
        if (z8) {
            return 0;
        }
        int i9 = 0;
        while (true) {
            SparseArray<CE> sparseArray = this.A0c;
            String[] strArr = A0q;
            String str = strArr[0];
            String str2 = strArr[2];
            int charAt = str.charAt(31);
            int i10 = str2.charAt(31);
            if (charAt == i10) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[3] = "Tajypdz7aNAm7FibYO8x24";
            strArr2[4] = "TBunjD0UUDKaUo7";
            int i11 = sparseArray.size();
            if (i9 < i11) {
                this.A0c.valueAt(i9).A07();
                i9++;
            } else {
                return -1;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x001e */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFh(long r3, long r5) {
        /*
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.A0E = r0
            r0 = 0
            r2.A04 = r0
            com.facebook.ads.redexgen.X.CA r0 = r2.A0d
            r0.reset()
            com.facebook.ads.redexgen.X.CH r0 = r2.A0e
            r0.A06()
            r2.A05()
            r1 = 0
        L18:
            android.util.SparseArray<com.facebook.ads.redexgen.X.CE> r0 = r2.A0c
            int r0 = r0.size()
            if (r1 >= r0) goto L2e
            android.util.SparseArray<com.facebook.ads.redexgen.X.CE> r0 = r2.A0c
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.CE r0 = (com.meta.analytics.dsp.uinode.CE) r0
            r0.A08()
            int r1 = r1 + 1
            goto L18
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XX.AFh(long, long):void");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final boolean AGR(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        return new CG().A01(interfaceC1075Bt);
    }
}
