package com.meta.analytics.dsp.uinode;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class XN implements InterfaceC1074Bs {
    public static byte[] A0X;
    public static String[] A0Y = {"XdJWu", "FUlE3E4RGCFuY0n1jkLa4sDNStY", "LTfWg4MeBgD", "ea2mTe", "5aN4xnjUR54", "JRDUjTwIRED0cdRjG5ryaKaac6vLzQ8c", "s80pf3iUB", "VFz"};
    public static final InterfaceC1077Bv A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public InterfaceC1076Bu A0C;
    public CV A0D;
    public C1217Hz A0E;
    public boolean A0F;
    public boolean A0G;
    public C4[] A0H;
    public C4[] A0I;
    public final int A0J;
    public final SparseArray<CV> A0K;
    public final DrmInitData A0L;
    public final C4 A0M;
    public final C1083Ce A0N;
    public final C1217Hz A0O;
    public final C1217Hz A0P;
    public final C1217Hz A0Q;
    public final C1217Hz A0R;
    public final IB A0S;
    public final ArrayDeque<XT> A0T;
    public final ArrayDeque<CU> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 35
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static int A00(CV cv, int i9, long j7, int i10, C1217Hz c1217Hz, int i11) {
        int i12;
        int i13 = i11;
        long j9 = j7;
        c1217Hz.A0Y(8);
        int A00 = CJ.A00(c1217Hz.A08());
        C1083Ce c1083Ce = cv.A05;
        C1085Cg c1085Cg = cv.A07;
        CP cp = c1085Cg.A07;
        c1085Cg.A0E[i9] = c1217Hz.A0H();
        c1085Cg.A0G[i9] = c1085Cg.A05;
        if ((A00 & 1) != 0) {
            long[] jArr = c1085Cg.A0G;
            jArr[i9] = jArr[i9] + c1217Hz.A08();
        }
        boolean z8 = (A00 & 4) != 0;
        int i14 = cp.A01;
        if (z8) {
            i14 = c1217Hz.A0H();
        }
        boolean z9 = (A00 & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        boolean z10 = (A00 & 512) != 0;
        boolean z11 = (A00 & 1024) != 0;
        boolean z12 = (A00 & 2048) != 0;
        long j10 = 0;
        if (c1083Ce.A08 != null && c1083Ce.A08.length == 1 && c1083Ce.A08[0] == 0) {
            j10 = IF.A0F(c1083Ce.A09[0], 1000L, c1083Ce.A06);
        }
        int[] iArr = c1085Cg.A0D;
        int[] iArr2 = c1085Cg.A0C;
        long[] jArr2 = c1085Cg.A0F;
        boolean[] zArr = c1085Cg.A0I;
        boolean z13 = c1083Ce.A03 == 2 && (i10 & 1) != 0;
        int i15 = i13 + c1085Cg.A0E[i9];
        long j11 = c1083Ce.A06;
        if (i9 > 0) {
            j9 = c1085Cg.A06;
        }
        while (i13 < i15) {
            int A0H = z9 ? c1217Hz.A0H() : cp.A00;
            if (z10) {
                i12 = c1217Hz.A0H();
            } else {
                i12 = cp.A03;
                if (A0Y[5].charAt(2) == 'C') {
                    throw new RuntimeException();
                }
                A0Y[6] = "dkwnFPd0";
            }
            int A08 = (i13 == 0 && z8) ? i14 : z11 ? c1217Hz.A08() : cp.A01;
            if (z12) {
                iArr2[i13] = (int) ((c1217Hz.A08() * 1000) / j11);
            } else {
                iArr2[i13] = 0;
            }
            jArr2[i13] = IF.A0F(j9, 1000L, j11) - j10;
            iArr[i13] = i12;
            zArr[i13] = ((A08 >> 16) & 1) == 0 && (!z13 || i13 == 0);
            j9 += A0H;
            i13++;
        }
        c1085Cg.A06 = j9;
        return i15;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<Long, C1611Xo> A04(C1217Hz c1217Hz, long j7) throws C10259v {
        long A0N;
        long A0N2;
        c1217Hz.A0Y(8);
        int A01 = CJ.A01(c1217Hz.A08());
        c1217Hz.A0Z(4);
        long A0M = c1217Hz.A0M();
        if (A01 == 0) {
            A0N = c1217Hz.A0M();
            A0N2 = j7 + c1217Hz.A0M();
        } else {
            A0N = c1217Hz.A0N();
            A0N2 = j7 + c1217Hz.A0N();
        }
        long A0F = IF.A0F(A0N, 1000000L, A0M);
        c1217Hz.A0Z(2);
        int A0I = c1217Hz.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        long j9 = A0F;
        for (int i9 = 0; i9 < A0I; i9++) {
            int A08 = c1217Hz.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new C10259v(A0A(581, 28, 126));
            }
            long A0M2 = c1217Hz.A0M();
            iArr[i9] = Integer.MAX_VALUE & A08;
            jArr[i9] = A0N2;
            jArr3[i9] = j9;
            A0N += A0M2;
            j9 = IF.A0F(A0N, 1000000L, A0M);
            jArr2[i9] = j9 - jArr3[i9];
            c1217Hz.A0Z(4);
            A0N2 += iArr[i9];
        }
        return Pair.create(Long.valueOf(A0F), new C1611Xo(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static CV A09(C1217Hz c1217Hz, SparseArray<CV> sparseArray) {
        c1217Hz.A0Y(8);
        int A00 = CJ.A00(c1217Hz.A08());
        CV A08 = A08(sparseArray, c1217Hz.A08());
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0N = c1217Hz.A0N();
            A08.A07.A05 = A0N;
            A08.A07.A04 = A0N;
        }
        CP cp = A08.A04;
        A08.A07.A07 = new CP((A00 & 2) != 0 ? c1217Hz.A0H() - 1 : cp.A02, (A00 & 8) != 0 ? c1217Hz.A0H() : cp.A00, (A00 & 16) != 0 ? c1217Hz.A0H() : cp.A03, (A00 & 32) != 0 ? c1217Hz.A0H() : cp.A01);
        return A08;
    }

    public static String A0A(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{117, 121, 84, 97, 122, 120, 53, 102, 124, 111, 112, 53, 121, 112, 102, 102, 53, 97, 125, 116, 123, 53, 125, 112, 116, 113, 112, 103, 53, 121, 112, 123, 114, 97, 125, 53, 61, 96, 123, 102, 96, 101, 101, 122, 103, 97, 112, 113, 60, 59, 114, 89, 67, 69, 78, Ascii.ETB, 84, 88, 66, 89, 67, Ascii.ETB, 94, 89, Ascii.ETB, 68, 85, 80, 71, Ascii.ETB, Ascii.SYN, 10, Ascii.ETB, 6, Ascii.ETB, Ascii.US, 66, 89, 68, 66, 71, 71, 88, 69, 67, 82, 83, Ascii.RS, Ascii.EM, 119, 92, 70, 64, 75, Ascii.DC2, 81, 93, 71, 92, 70, Ascii.DC2, 91, 92, Ascii.DC2, 65, 85, 66, 86, Ascii.DC2, 19, Ascii.SI, Ascii.DC2, 3, Ascii.DC2, Ascii.SUB, 71, 92, 65, 71, 66, 66, 93, 64, 70, 87, 86, Ascii.ESC, Ascii.FS, 57, Ascii.CR, Ascii.RS, Ascii.CAN, Ascii.DC2, Ascii.SUB, 17, Ascii.VT, Ascii.SUB, Ascii.ESC, 50, Ascii.SI, 75, 58, 7, Ascii.VT, Ascii.CR, Ascii.RS, Ascii.FS, Ascii.VT, Ascii.DLE, Ascii.CR, 0, 46, 39, 38, 59, 32, 39, 46, 105, 39, 44, 46, 40, 61, 32, 63, 44, 105, 38, 47, 47, 58, 44, 61, 105, 61, 38, 105, 58, 40, 36, 57, 37, 44, 105, 45, 40, 61, 40, 103, 51, Ascii.SUB, Ascii.RS, Ascii.EM, 95, Ascii.RS, Ascii.VT, Ascii.DLE, Ascii.DC2, 95, Ascii.ESC, Ascii.SUB, Ascii.EM, Ascii.SYN, 17, Ascii.SUB, Ascii.FF, 95, Ascii.SUB, 7, Ascii.VT, Ascii.SUB, 17, Ascii.ESC, Ascii.SUB, Ascii.ESC, 95, Ascii.RS, Ascii.VT, Ascii.DLE, Ascii.DC2, 95, Ascii.FF, Ascii.SYN, 5, Ascii.SUB, 95, 87, 10, 17, Ascii.FF, 10, Ascii.SI, Ascii.SI, Ascii.DLE, Ascii.CR, Ascii.VT, Ascii.SUB, Ascii.ESC, 86, 81, Ascii.RS, 55, 51, 52, 114, 51, 38, 61, 63, 114, 37, 59, 38, 58, 114, 62, 55, 60, 53, 38, 58, 114, 108, 114, 96, 99, 102, 101, 102, 106, 97, 100, 102, 101, 114, 122, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 123, 124, 63, Ascii.SYN, Ascii.GS, Ascii.DC4, 7, Ascii.ESC, 83, Ascii.RS, Ascii.SUB, 0, Ascii.RS, Ascii.DC2, 7, Ascii.DLE, Ascii.ESC, 73, 83, Ascii.SI, 38, 38, 51, 37, 52, 96, 52, 47, 96, 37, 46, 35, 50, 57, 48, 52, 41, 47, 46, 96, 36, 33, 52, 33, 96, 55, 33, 51, 96, 46, 37, 39, 33, 52, 41, 54, 37, 110, Ascii.DLE, 57, 57, 44, 58, 43, Ascii.DEL, 43, 48, Ascii.DEL, 58, 49, 59, Ascii.DEL, 48, 57, Ascii.DEL, 50, 59, 62, 43, Ascii.DEL, 40, 62, 44, Ascii.DEL, 49, 58, 56, 62, 43, 54, 41, 58, 113, 106, 83, 64, 87, 87, 76, 65, 76, 75, 66, 5, 113, 87, 68, 70, 78, 96, 75, 70, 87, 92, 85, 81, 76, 74, 75, 103, 74, 93, 5, 85, 68, 87, 68, 72, 64, 81, 64, 87, 86, 5, 76, 86, 5, 80, 75, 86, 80, 85, 85, 74, 87, 81, 64, 65, Ascii.VT, Ascii.SO, 54, 52, 45, 45, 56, 57, 125, 45, 46, 46, 53, 125, 60, 41, 50, 48, 125, 117, 59, 60, 52, 49, 56, 57, 125, 41, 50, 125, 56, 37, 41, 47, 60, 62, 41, 125, 40, 40, 52, 57, 116, 54, Ascii.SO, Ascii.FF, Ascii.NAK, Ascii.NAK, Ascii.FF, Ascii.VT, 2, 69, 4, 17, 10, 8, 69, Ascii.DC2, Ascii.FF, 17, Ascii.CR, 69, 9, 0, Ascii.VT, 2, 17, Ascii.CR, 69, 91, 69, 87, 84, 81, 82, 81, 93, 86, 83, 81, 82, 69, 77, Ascii.DLE, Ascii.VT, Ascii.SYN, Ascii.DLE, Ascii.NAK, Ascii.NAK, 10, Ascii.ETB, 17, 0, 1, 76, 75, 62, 5, Ascii.SO, 19, Ascii.ESC, Ascii.SO, 8, Ascii.US, Ascii.SO, Ascii.SI, 75, 6, 4, 4, Ascii.GS, 75, 9, 4, 19, 69, Ascii.CR, 54, 61, 32, 40, 61, 59, 44, 61, 60, 120, 43, 57, 49, 55, 120, 61, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 98, 120, 76, 119, 113, 120, 119, 125, 117, 124, 125, 57, 112, 119, 125, 112, 107, 124, 122, 109, 57, 107, 124, Ascii.DEL, 124, 107, 124, 119, 122, 124, 58, Ascii.CR, Ascii.RS, 5, Ascii.CR, Ascii.SO, 0, 9, 76, 0, 9, 2, Ascii.VT, Ascii.CAN, 4, 76, 8, 9, Ascii.US, Ascii.SI, Ascii.RS, 5, Ascii.FS, Ascii.CAN, 5, 3, 2, 76, 5, 2, 76, Ascii.US, Ascii.VT, Ascii.FS, 8, 76, 10, 3, Ascii.EM, 2, 8, 76, 68, Ascii.EM, 2, Ascii.US, Ascii.EM, Ascii.FS, Ascii.FS, 3, Ascii.RS, Ascii.CAN, 9, 8, 69, Ascii.US, Ascii.SO, Ascii.SO, Ascii.DC2, Ascii.ETB, Ascii.GS, Ascii.US, 10, Ascii.ETB, 17, Ascii.DLE, 81, 6, 83, Ascii.ESC, 19, Ascii.CR, Ascii.EM, 3, Ascii.NAK, Ascii.EM, Ascii.ETB, Ascii.ETB, 8, 5, 4, Ascii.SO, 78, 9, 4, Ascii.ETB, 2, 6, Ascii.EM, Ascii.DC4, Ascii.NAK, Ascii.US, 95, Ascii.GS, 0, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0K(XT xt) throws C10259v {
        AbstractC1192Ha.A06(this.A0N == null, A0A(532, 20, 12));
        DrmInitData drmInitData = this.A0L;
        if (drmInitData == null) {
            drmInitData = A05(xt.A02);
        }
        XT A06 = xt.A06(CJ.A0n);
        SparseArray<CP> sparseArray = new SparseArray<>();
        long j7 = C.TIME_UNSET;
        int size = A06.A02.size();
        for (int i9 = 0; i9 < size; i9++) {
            XS xs = A06.A02.get(i9);
            if (((CJ) xs).A00 == CJ.A1N) {
                Pair<Integer, CP> A03 = A03(xs.A00);
                sparseArray.put(((Integer) A03.first).intValue(), (CP) A03.second);
            } else if (((CJ) xs).A00 == CJ.A0g) {
                j7 = A01(xs.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = xt.A01.size();
        for (int i10 = 0; i10 < size2; i10++) {
            XT xt2 = xt.A01.get(i10);
            if (((CJ) xt2).A00 == CJ.A1M) {
                C1083Ce A0C = CO.A0C(xt2, xt.A07(CJ.A0o), j7, drmInitData, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    sparseArray2.put(A0C.A00, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            AbstractC1192Ha.A04(this.A0K.size() == size3);
            for (int i11 = 0; i11 < size3; i11++) {
                C1083Ce c1083Ce = (C1083Ce) sparseArray2.valueAt(i11);
                this.A0K.get(c1083Ce.A00).A07(c1083Ce, A06(sparseArray, c1083Ce.A00));
            }
            return;
        }
        for (int i12 = 0; i12 < size3; i12++) {
            C1083Ce c1083Ce2 = (C1083Ce) sparseArray2.valueAt(i12);
            CV cv = new CV(this.A0C.AGi(i12, c1083Ce2.A03));
            cv.A07(c1083Ce2, A06(sparseArray, c1083Ce2.A00));
            this.A0K.put(c1083Ce2.A00, cv);
            this.A08 = Math.max(this.A08, c1083Ce2.A04);
        }
        A0C();
        this.A0C.A5Y();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0M(XT xt, SparseArray<CV> sparseArray, int i9, byte[] bArr) throws C10259v {
        CV A09 = A09(xt.A07(CJ.A1J).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        C1085Cg c1085Cg = A09.A07;
        long j7 = c1085Cg.A06;
        A09.A04();
        if (xt.A07(CJ.A1I) != null && (i9 & 2) == 0) {
            j7 = A02(xt.A07(CJ.A1I).A00);
        }
        A0N(xt, A09, j7, i9);
        C1084Cf A00 = A09.A05.A00(c1085Cg.A07.A02);
        XS A07 = xt.A07(CJ.A0v);
        if (A07 != null) {
            A0P(A00, A07.A00, c1085Cg);
        }
        XS A072 = xt.A07(CJ.A0u);
        if (A072 != null) {
            A0S(A072.A00, c1085Cg);
        }
        XS A073 = xt.A07(CJ.A11);
        if (A073 != null) {
            A0T(A073.A00, c1085Cg);
        }
        XS A074 = xt.A07(CJ.A0y);
        XS A075 = xt.A07(CJ.A12);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, c1085Cg);
        }
        int size = xt.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            XS xs = xt.A02.get(i10);
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "89j";
            XS xs2 = xs;
            if (((CJ) xs2).A00 == CJ.A1R) {
                A0U(xs2.A00, c1085Cg, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0P(C1084Cf c1084Cf, C1217Hz c1217Hz, C1085Cg c1085Cg) throws C10259v {
        int i9 = c1084Cf.A00;
        c1217Hz.A0Y(8);
        if ((CJ.A00(c1217Hz.A08()) & 1) == 1) {
            c1217Hz.A0Z(8);
        }
        int A0E = c1217Hz.A0E();
        int A0H = c1217Hz.A0H();
        if (A0H != c1085Cg.A00) {
            throw new C10259v(A0A(290, 17, 20) + A0H + A0A(0, 2, 62) + c1085Cg.A00);
        }
        int i10 = 0;
        if (A0E == 0) {
            boolean[] zArr = c1085Cg.A0H;
            for (int i11 = 0; i11 < A0H; i11++) {
                int A0E2 = c1217Hz.A0E();
                i10 += A0E2;
                zArr[i11] = A0E2 > i9;
            }
        } else {
            i10 = 0 + (A0E * A0H);
            Arrays.fill(c1085Cg.A0H, 0, A0H, A0E > i9);
        }
        c1085Cg.A02(i10);
        if (A0Y[6].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[2] = "tC3WLCXP6DZ";
        strArr[4] = "0Zxl8CEli3D";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0V(C1217Hz c1217Hz, C1217Hz c1217Hz2, String str, C1085Cg c1085Cg) throws C10259v {
        c1217Hz.A0Y(8);
        int A08 = c1217Hz.A08();
        int A082 = c1217Hz.A08();
        int i9 = A0a;
        if (A082 != i9) {
            return;
        }
        if (CJ.A01(A08) == 1) {
            c1217Hz.A0Z(4);
        }
        if (c1217Hz.A08() != 1) {
            throw new C10259v(A0A(50, 39, 80));
        }
        c1217Hz2.A0Y(8);
        int A083 = c1217Hz2.A08();
        if (c1217Hz2.A08() != i9) {
            return;
        }
        int A01 = CJ.A01(A083);
        if (A01 == 1) {
            if (c1217Hz2.A0M() == 0) {
                throw new C10259v(A0A(609, 55, 11));
            }
        } else if (A01 >= 2) {
            c1217Hz2.A0Z(4);
        }
        if (c1217Hz2.A0M() != 1) {
            throw new C10259v(A0A(89, 39, 85));
        }
        c1217Hz2.A0Z(1);
        int A0E = c1217Hz2.A0E();
        int i10 = (A0E & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i11 = A0E & 15;
        boolean z8 = c1217Hz2.A0E() == 1;
        if (z8) {
            int A0E2 = c1217Hz2.A0E();
            byte[] bArr = new byte[16];
            c1217Hz2.A0c(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (z8 && A0E2 == 0) {
                int A0E3 = c1217Hz2.A0E();
                bArr2 = new byte[A0E3];
                c1217Hz2.A0c(bArr2, 0, A0E3);
            }
            c1085Cg.A0A = true;
            c1085Cg.A08 = new C1084Cf(z8, str, A0E2, bArr, i10, i11, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new XO();
        A0a = IF.A08(A0A(682, 4, 23));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 25), Long.MAX_VALUE);
    }

    public XN() {
        this(0);
    }

    public XN(int i9) {
        this(i9, null);
    }

    public XN(int i9, IB ib) {
        this(i9, ib, null, null);
    }

    public XN(int i9, IB ib, C1083Ce c1083Ce, DrmInitData drmInitData) {
        this(i9, ib, c1083Ce, drmInitData, Collections.emptyList());
    }

    public XN(int i9, IB ib, C1083Ce c1083Ce, DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i9, ib, c1083Ce, drmInitData, closedCaptionFormats, null);
    }

    public XN(int i9, IB ib, C1083Ce c1083Ce, DrmInitData drmInitData, List<Format> closedCaptionFormats, C4 c42) {
        this.A0J = (c1083Ce != null ? 8 : 0) | i9;
        this.A0S = ib;
        this.A0N = c1083Ce;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = c42;
        this.A0O = new C1217Hz(16);
        this.A0R = new C1217Hz(AbstractC1213Hv.A03);
        this.A0Q = new C1217Hz(5);
        this.A0P = new C1217Hz();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = C.TIME_UNSET;
        this.A0A = C.TIME_UNSET;
        this.A0B = C.TIME_UNSET;
        A0B();
    }

    public static long A01(C1217Hz c1217Hz) {
        c1217Hz.A0Y(8);
        int fullAtom = c1217Hz.A08();
        return CJ.A01(fullAtom) == 0 ? c1217Hz.A0M() : c1217Hz.A0N();
    }

    public static long A02(C1217Hz c1217Hz) {
        c1217Hz.A0Y(8);
        int fullAtom = c1217Hz.A08();
        int version = CJ.A01(fullAtom);
        return version == 1 ? c1217Hz.A0N() : c1217Hz.A0M();
    }

    public static Pair<Integer, CP> A03(C1217Hz c1217Hz) {
        c1217Hz.A0Y(12);
        int defaultSampleDescriptionIndex = c1217Hz.A08();
        int trackId = c1217Hz.A0H();
        int defaultSampleFlags = c1217Hz.A0H();
        int defaultSampleSize = c1217Hz.A0H();
        int defaultSampleDuration = c1217Hz.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new CP(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<XS> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            XS xs = list.get(i9);
            int leafChildrenSize = ((CJ) xs).A00;
            if (leafChildrenSize == CJ.A0s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = xs.A00.A00;
                UUID A02 = AbstractC1081Cb.A02(bArr);
                int leafChildrenSize2 = A0Y[3].length();
                if (leafChildrenSize2 != 6) {
                    throw new RuntimeException();
                }
                A0Y[7] = "tzO";
                if (A02 == null) {
                    Log.w(A0A(128, 22, 24), A0A(437, 42, 58));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A02, A0A(696, 9, 23), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private CP A06(SparseArray<CP> sparseArray, int i9) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (CP) AbstractC1192Ha.A01(sparseArray.get(i9));
    }

    public static CV A07(SparseArray<CV> sparseArray) {
        CV cv = null;
        long trunOffset = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            CV valueAt = sparseArray.valueAt(i9);
            int i10 = valueAt.A02;
            if (A0Y[1].length() == 5) {
                throw new RuntimeException();
            }
            A0Y[0] = "VXm0n";
            if (i10 != valueAt.A07.A02) {
                long nextTrackRunOffset = valueAt.A07.A0G[valueAt.A02];
                if (nextTrackRunOffset < trunOffset) {
                    cv = valueAt;
                    trunOffset = nextTrackRunOffset;
                }
            }
        }
        return cv;
    }

    public static CV A08(SparseArray<CV> sparseArray, int i9) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i9);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0068 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0I
            if (r0 != 0) goto L42
            r0 = 2
            com.facebook.ads.redexgen.X.C4[] r5 = new com.meta.analytics.dsp.uinode.C4[r0]
            r6.A0I = r5
            r4 = 0
            com.facebook.ads.redexgen.X.C4 r1 = r6.A0M
            if (r1 == 0) goto L13
            int r0 = r4 + 1
            r5[r4] = r1
            r4 = r0
        L13:
            int r0 = r6.A0J
            r3 = 4
            r0 = r0 & r3
            if (r0 == 0) goto L2a
            int r2 = r4 + 1
            com.facebook.ads.redexgen.X.Bu r1 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.CV> r0 = r6.A0K
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C4 r0 = r1.AGi(r0, r3)
            r5[r4] = r0
            r4 = r2
        L2a:
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0I
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            com.facebook.ads.redexgen.X.C4[] r4 = (com.meta.analytics.dsp.uinode.C4[]) r4
            r6.A0I = r4
            int r3 = r4.length
            r2 = 0
        L36:
            if (r2 >= r3) goto L42
            r1 = r4[r2]
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.meta.analytics.dsp.uinode.XN.A0b
            r1.A5n(r0)
            int r2 = r2 + 1
            goto L36
        L42:
            com.facebook.ads.redexgen.X.C4[] r3 = r6.A0H
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.XN.A0Y
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.XN.A0Y
            java.lang.String r1 = "8HQd7O"
            r0 = 3
            r2[r0] = r1
            if (r3 != 0) goto L8c
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C4[] r0 = new com.meta.analytics.dsp.uinode.C4[r0]
            r6.A0H = r0
            r3 = 0
        L65:
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0H
            int r0 = r0.length
            if (r3 >= r0) goto L8c
            com.facebook.ads.redexgen.X.Bu r2 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.CV> r0 = r6.A0K
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.C4 r1 = r2.AGi(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) r0
            r1.A5n(r0)
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0H
            r0[r3] = r1
            int r3 = r3 + 1
            goto L65
        L8c:
            return
        L8d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XN.A0C():void");
    }

    private void A0E(long j7) {
        while (!this.A0U.isEmpty()) {
            CU removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j9 = j7 + removeFirst.A01;
            IB ib = this.A0S;
            if (ib != null) {
                j9 = ib.A06(j9);
            }
            C4[] c4Arr = this.A0I;
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "ltl";
            for (C4 c42 : c4Arr) {
                c42.AFS(j9, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j7) throws C10259v {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j7) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        int i9 = ((int) this.A07) - this.A00;
        C1217Hz c1217Hz = this.A0E;
        if (c1217Hz != null) {
            interfaceC1075Bt.readFully(c1217Hz.A00, 8, i9);
            int atomPayloadSize = this.A01;
            A0O(new XS(atomPayloadSize, this.A0E), interfaceC1075Bt.A7i());
        } else {
            interfaceC1075Bt.AGP(i9);
        }
        A0F(interfaceC1075Bt.A7i());
        String[] strArr = A0Y;
        String str = strArr[2];
        String str2 = strArr[4];
        int atomPayloadSize2 = str.length();
        if (atomPayloadSize2 != str2.length()) {
            throw new RuntimeException();
        }
        A0Y[1] = "jmSEpbOdW733bHBoDHkBty1cmj";
    }

    private void A0H(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        CV cv = null;
        long j7 = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i9 = 0; i9 < size; i9++) {
            CV nextTrackBundle = this.A0K.valueAt(i9);
            C1085Cg c1085Cg = nextTrackBundle.A07;
            if (c1085Cg.A0B && c1085Cg.A04 < j7) {
                j7 = c1085Cg.A04;
                cv = this.A0K.valueAt(i9);
            }
        }
        if (cv == null) {
            this.A02 = 3;
            return;
        }
        int A7i = (int) (j7 - interfaceC1075Bt.A7i());
        if (A7i >= 0) {
            interfaceC1075Bt.AGP(A7i);
            cv.A07.A04(interfaceC1075Bt);
            return;
        }
        throw new C10259v(A0A(307, 39, 39));
    }

    private void A0I(XT xt) throws C10259v {
        if (((CJ) xt).A00 == CJ.A0k) {
            A0K(xt);
            return;
        }
        int i9 = ((CJ) xt).A00;
        int i10 = CJ.A0j;
        String[] strArr = A0Y;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[6] = "QeKmRdkmErMZReeQj8";
        if (i9 == i10) {
            A0J(xt);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        XT peek = this.A0T.peek();
        if (A0Y[6].length() != 17) {
            A0Y[1] = "g8UpS1NyodMZ5eBXtPatKQwsoR";
            peek.A08(xt);
        } else {
            A0Y[5] = "mkv5is6F5Mu6y6USr0b4mkDGodGLaqlp";
            peek.A08(xt);
        }
    }

    private void A0J(XT xt) throws C10259v {
        DrmInitData A05;
        A0L(xt, this.A0K, this.A0J, this.A0W);
        if (this.A0L != null) {
            A05 = null;
        } else {
            List<XS> list = xt.A02;
            int trackCount = A0Y[3].length();
            if (trackCount != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[2] = "YTpzURZBrt0";
            strArr[4] = "jDJUPBNch9x";
            A05 = A05(list);
        }
        if (A05 != null) {
            int i9 = this.A0K.size();
            for (int trackCount2 = 0; trackCount2 < i9; trackCount2++) {
                this.A0K.valueAt(trackCount2).A06(A05);
            }
        }
        if (this.A0A != C.TIME_UNSET) {
            int size = this.A0K.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.A0K.valueAt(i10).A05(this.A0A);
            }
            this.A0A = C.TIME_UNSET;
        }
    }

    public static void A0L(XT xt, SparseArray<CV> sparseArray, int i9, byte[] bArr) throws C10259v {
        int size = xt.A01.size();
        for (int i10 = 0; i10 < size; i10++) {
            XT child = xt.A01.get(i10);
            int i11 = ((CJ) child).A00;
            int moofContainerChildrenSize = CJ.A1L;
            if (i11 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i9, bArr);
            }
        }
    }

    public static void A0N(XT xt, CV cv, long j7, int totalSampleCount) {
        int i9 = 0;
        int i10 = 0;
        List<XS> list = xt.A02;
        int size = list.size();
        for (int trunSampleCount = 0; trunSampleCount < size; trunSampleCount++) {
            XS xs = list.get(trunSampleCount);
            if (((CJ) xs).A00 == CJ.A1O) {
                C1217Hz trunData = xs.A00;
                trunData.A0Y(12);
                int A0H = trunData.A0H();
                if (A0H > 0) {
                    i10 += A0H;
                    i9++;
                }
            }
        }
        cv.A02 = 0;
        cv.A00 = 0;
        cv.A01 = 0;
        cv.A07.A03(i9, i10);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            XS xs2 = list.get(i13);
            int trunIndex = ((CJ) xs2).A00;
            if (trunIndex == CJ.A1O) {
                i12 = A00(cv, i11, j7, totalSampleCount, xs2.A00, i12);
                i11++;
            }
        }
    }

    private void A0O(XS xs, long j7) throws C10259v {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(xs);
            return;
        }
        if (((CJ) xs).A00 == CJ.A13) {
            Pair<Long, C1611Xo> A04 = A04(xs.A00, j7);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AFi((C1) A04.second);
            this.A0F = true;
            return;
        }
        if (((CJ) xs).A00 != CJ.A0Q) {
            return;
        }
        A0Q(xs.A00);
    }

    private void A0Q(C1217Hz c1217Hz) {
        C4[] c4Arr = this.A0I;
        if (c4Arr == null || c4Arr.length == 0) {
            return;
        }
        c1217Hz.A0Y(12);
        int sampleSize = c1217Hz.A04();
        c1217Hz.A0Q();
        c1217Hz.A0Q();
        long A0M = c1217Hz.A0M();
        long timescale = c1217Hz.A0M();
        long A0F = IF.A0F(timescale, 1000000L, A0M);
        for (C4 c42 : this.A0I) {
            c1217Hz.A0Y(12);
            c42.AFR(c1217Hz, sampleSize);
        }
        long j7 = this.A0B;
        if (j7 != C.TIME_UNSET) {
            long j9 = j7 + A0F;
            IB ib = this.A0S;
            if (ib != null) {
                j9 = ib.A06(j9);
            }
            for (C4 c43 : this.A0I) {
                c43.AFS(j9, 1, sampleSize, 0, null);
            }
            return;
        }
        this.A0U.addLast(new CU(A0F, sampleSize));
        this.A03 += sampleSize;
    }

    public static void A0R(C1217Hz c1217Hz, int i9, C1085Cg c1085Cg) throws C10259v {
        c1217Hz.A0Y(i9 + 8);
        int fullAtom = c1217Hz.A08();
        int flags = CJ.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z8 = fullAtom3 != 0;
            int sampleCount = c1217Hz.A0H();
            int fullAtom4 = c1085Cg.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c1085Cg.A0H, 0, sampleCount, z8);
                int fullAtom5 = c1217Hz.A04();
                c1085Cg.A02(fullAtom5);
                c1085Cg.A05(c1217Hz);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0A(290, 17, 20)).append(sampleCount).append(A0A(0, 2, 62));
            int fullAtom6 = c1085Cg.A00;
            throw new C10259v(append.append(fullAtom6).toString());
        }
        throw new C10259v(A0A(381, 56, 66));
    }

    public static void A0S(C1217Hz c1217Hz, C1085Cg c1085Cg) throws C10259v {
        c1217Hz.A0Y(8);
        int flags = c1217Hz.A08();
        int fullAtom = CJ.A00(flags) & 1;
        if (fullAtom == 1) {
            c1217Hz.A0Z(8);
        }
        int A0H = c1217Hz.A0H();
        if (A0H == 1) {
            int entryCount = CJ.A01(flags);
            c1085Cg.A04 += entryCount == 0 ? c1217Hz.A0M() : c1217Hz.A0N();
            return;
        }
        throw new C10259v(A0A(552, 29, 63) + A0H);
    }

    public static void A0T(C1217Hz c1217Hz, C1085Cg c1085Cg) throws C10259v {
        A0R(c1217Hz, 0, c1085Cg);
    }

    public static void A0U(C1217Hz c1217Hz, C1085Cg c1085Cg, byte[] bArr) throws C10259v {
        c1217Hz.A0Y(8);
        c1217Hz.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c1217Hz, 16, c1085Cg);
    }

    public static boolean A0W(int i9) {
        return i9 == CJ.A0k || i9 == CJ.A1M || i9 == CJ.A0e || i9 == CJ.A0i || i9 == CJ.A17 || i9 == CJ.A0j || i9 == CJ.A1L || i9 == CJ.A0n || i9 == CJ.A0O;
    }

    public static boolean A0X(int i9) {
        if (i9 != CJ.A0W && i9 != CJ.A0d && i9 != CJ.A0o && i9 != CJ.A13 && i9 != CJ.A1B) {
            int i10 = CJ.A1I;
            if (A0Y[6].length() != 17) {
                A0Y[0] = "0bfDB";
                if (i9 != i10 && i9 != CJ.A1J && i9 != CJ.A1K && i9 != CJ.A1N && i9 != CJ.A1O && i9 != CJ.A0s && i9 != CJ.A0v) {
                    int i11 = CJ.A0u;
                    if (A0Y[1].length() != 5) {
                        A0Y[5] = "GM1eDi9JpLsxcWxFcWWsCjSZthCJdr4f";
                        if (i9 != i11 && i9 != CJ.A11 && i9 != CJ.A1R && i9 != CJ.A0y && i9 != CJ.A12 && i9 != CJ.A0P) {
                            int i12 = CJ.A0g;
                            if (A0Y[3].length() == 6) {
                                A0Y[7] = "Eu3";
                                if (i9 != i12 && i9 != CJ.A0Q) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        r0 = r11.A7i() - r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r10.A01 != com.meta.analytics.dsp.uinode.CJ.A0j) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r9 = r10.A0K.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (r8 >= r9) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r2 = r10.A0K.valueAt(r8).A07;
        r2.A03 = r0;
        r2.A04 = r0;
        r2.A05 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (com.meta.analytics.dsp.uinode.XN.A0Y[3].length() == 6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        com.meta.analytics.dsp.uinode.XN.A0Y[0] = "GrBVN";
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        r7 = com.meta.analytics.dsp.uinode.XN.A0Y;
        r7[2] = "tKeeSnEBB5V";
        r7[4] = "1ppH9MP2kpM";
        r8 = r8 + 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        if (r10.A01 != com.meta.analytics.dsp.uinode.CJ.A0c) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        r10.A0D = null;
        r10.A09 = r10.A07 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if (r10.A0F != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
    
        r10.A0C.AFi(new com.meta.analytics.dsp.uinode.C1606Xj(r10.A08, r0));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0147, code lost:
    
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0151, code lost:
    
        if (A0W(r10.A01) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0153, code lost:
    
        r5 = (r11.A7i() + r10.A07) - 8;
        r10.A0T.push(new com.meta.analytics.dsp.uinode.XT(r10.A01, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
    
        if (r10.A07 != r10.A00) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0172, code lost:
    
        A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01dd, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0176, code lost:
    
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0192, code lost:
    
        if (A0X(r10.A01) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0194, code lost:
    
        r3 = r10.A00;
        r2 = com.meta.analytics.dsp.uinode.XN.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a6, code lost:
    
        if (r2[2].length() == r2[4].length()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b9, code lost:
    
        com.meta.analytics.dsp.uinode.XN.A0Y[7] = "6Yw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c0, code lost:
    
        if (r3 != 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c2, code lost:
    
        r2 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c6, code lost:
    
        if (r2 > 2147483647L) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c8, code lost:
    
        r10.A0E = new com.meta.analytics.dsp.uinode.C1217Hz((int) r2);
        java.lang.System.arraycopy(r10.A0O.A00, 0, r10.A0E.A00, 0, 8);
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ed, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A0A(241, 49, 53));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01fd, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A0A(190, 51, 24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b2, code lost:
    
        if (r10.A07 > 2147483647L) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b4, code lost:
    
        r10.A0E = null;
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020c, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A0A(479, 53, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0188, code lost:
    
        throw new com.meta.analytics.dsp.uinode.C10259v(A0A(2, 48, 114));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Y(com.meta.analytics.dsp.uinode.InterfaceC1075Bt r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XN.A0Y(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        r1 = r0.A06(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010d, code lost:
    
        if (r6.A01 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        r9 = r18.A0Q.A00;
        r9[0] = 0;
        r9[1] = 0;
        r9[2] = 0;
        r8 = r6.A01 + 1;
        r17 = 4 - r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
    
        if (r18.A04 >= r18.A06) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        r15 = r18.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0135, code lost:
    
        if (com.meta.analytics.dsp.uinode.XN.A0Y[1].length() == 5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0137, code lost:
    
        r16 = com.meta.analytics.dsp.uinode.XN.A0Y;
        r16[2] = "oY9Cfc6NZLH";
        r16[4] = "IHvoiGll8tT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        if (r15 != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018f, code lost:
    
        if (r18.A0G == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
    
        r18.A0P.A0W(r15);
        r19.readFully(r18.A0P.A00, r12, r18.A05);
        r5.AFR(r18.A0P, r18.A05);
        r3 = r18.A05;
        r15 = com.meta.analytics.dsp.uinode.AbstractC1213Hv.A02(r18.A0P.A00, r18.A0P.A07());
        r18.A0P.A0Y(A0A(686, 10, 6).equals(r6.A07.A0O) ? 1 : 0);
        r18.A0P.A0X(r15);
        com.meta.analytics.dsp.uinode.AbstractC1166Fy.A03(r1, r18.A0P, r18.A0H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01dd, code lost:
    
        r18.A04 += r3;
        r18.A05 -= r3;
        r14 = 4;
        r13 = 1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ec, code lost:
    
        r3 = r5.AFQ(r19, r15, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        r19.readFully(r9, r17, r8);
        r18.A0Q.A0Y(r12);
        r18.A05 = r18.A0Q.A0H() - r13;
        r18.A0R.A0Y(r12);
        r5.AFR(r18.A0R, r14);
        r5.AFR(r18.A0Q, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016a, code lost:
    
        if (r18.A0H.length <= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0176, code lost:
    
        if (com.meta.analytics.dsp.uinode.AbstractC1213Hv.A0C(r6.A07.A0O, r9[r14]) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0179, code lost:
    
        r18.A0G = r0;
        r18.A04 += 5;
        r18.A06 += r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0188, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018a, code lost:
    
        if (r15 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0222, code lost:
    
        r11 = r10.A0I[r4];
        r8 = null;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0229, code lost:
    
        if (r10.A0A == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022b, code lost:
    
        r11 = (r11 ? 1 : 0) | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        if (r10.A08 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0232, code lost:
    
        r0 = r10.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0234, code lost:
    
        r8 = r0.A01;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0254, code lost:
    
        r0 = r6.A00(r10.A07.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0236, code lost:
    
        r14 = r8;
        r5.AFS(r1, r11, r18.A06, 0, r14);
        A0E(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024a, code lost:
    
        if (r18.A0D.A08() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024c, code lost:
    
        r18.A0D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024f, code lost:
    
        r18.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0253, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0210, code lost:
    
        r0 = r18.A04;
        r3 = r18.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0214, code lost:
    
        if (r0 >= r3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0216, code lost:
    
        r18.A04 += r5.AFQ(r19, r3 - r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020c, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.meta.analytics.dsp.uinode.InterfaceC1075Bt r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.XN.A0Z(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void A8o(InterfaceC1076Bu interfaceC1076Bu) {
        this.A0C = interfaceC1076Bu;
        C1083Ce c1083Ce = this.A0N;
        if (c1083Ce != null) {
            CV cv = new CV(interfaceC1076Bu.AGi(0, c1083Ce.A03));
            cv.A07(this.A0N, new CP(0, 0, 0, 0));
            this.A0K.put(0, cv);
            A0C();
            this.A0C.A5Y();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final int AEH(InterfaceC1075Bt interfaceC1075Bt, C1079Bz c1079Bz) throws IOException, InterruptedException {
        while (true) {
            int i9 = this.A02;
            if (A0Y[6].length() != 17) {
                A0Y[6] = "Adcvl3OLLWBEEjCvRjB7l1tHvWvuGk";
                switch (i9) {
                    case 0:
                        if (!A0Y(interfaceC1075Bt)) {
                            return -1;
                        }
                        break;
                    case 1:
                        A0G(interfaceC1075Bt);
                        break;
                    case 2:
                        A0H(interfaceC1075Bt);
                        break;
                    default:
                        if (!A0Z(interfaceC1075Bt)) {
                            break;
                        } else {
                            return 0;
                        }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final void AFh(long j7, long j9) {
        int size = this.A0K.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.A0K.valueAt(i9).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j9;
        this.A0T.clear();
        A0B();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1074Bs
    public final boolean AGR(InterfaceC1075Bt interfaceC1075Bt) throws IOException, InterruptedException {
        return AbstractC1082Cc.A03(interfaceC1075Bt);
    }
}
