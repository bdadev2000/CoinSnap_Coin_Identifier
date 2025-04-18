package com.instagram.common.viewpoint.core;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.http.StatusLine;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class YS implements InterfaceC0455Bx {
    public static byte[] A0X;
    public static String[] A0Y = {"NLNd4eI8orA1H4rBpr8HMLqUS8K0bIhZ", "4iV8K", "FgNr", "GaBUpY3lkp20WVhZ3rI", "4koLIaX6bKg5r0b1Lqm", "8ZnkkLJNVKhhCexk35olMcz5oR9RrYh", "DMCEbABAxHK2JHC68zvJPiYU4vzbcsY5", "h5GR"};
    public static final C0 A0Z;
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
    public InterfaceC0457Bz A0C;
    public C0458Ca A0D;
    public I4 A0E;
    public boolean A0F;
    public boolean A0G;
    public C9[] A0H;
    public C9[] A0I;
    public final int A0J;
    public final SparseArray<C0458Ca> A0K;
    public final DrmInitData A0L;
    public final C9 A0M;
    public final C0467Cj A0N;
    public final I4 A0O;
    public final I4 A0P;
    public final I4 A0Q;
    public final I4 A0R;
    public final IG A0S;
    public final ArrayDeque<YY> A0T;
    public final ArrayDeque<CZ> A0U;
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
    public static int A00(C0458Ca c0458Ca, int i2, long j2, int i3, I4 i4, int i5) {
        int i6 = i5;
        long j3 = j2;
        i4.A0Y(8);
        int A00 = CO.A00(i4.A08());
        C0467Cj c0467Cj = c0458Ca.A05;
        C0469Cl c0469Cl = c0458Ca.A07;
        CU cu = c0469Cl.A07;
        c0469Cl.A0E[i2] = i4.A0H();
        c0469Cl.A0G[i2] = c0469Cl.A05;
        if ((A00 & 1) != 0) {
            long[] jArr = c0469Cl.A0G;
            long j4 = jArr[i2];
            long A08 = i4.A08();
            String[] strArr = A0Y;
            if (strArr[0].charAt(25) == strArr[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[4] = "sBrX2EtwYh6muAXVYmp";
            strArr2[3] = "Nkb2elyGZGwJQHQIPXA";
            jArr[i2] = j4 + A08;
        }
        int i7 = A00 & 4;
        String[] strArr3 = A0Y;
        if (strArr3[1].length() == strArr3[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0Y;
        strArr4[4] = "HmZMGavRpWiJTUMCOGz";
        strArr4[3] = "B8AJYf0RCBxmiXX5ezT";
        boolean z2 = i7 != 0;
        int i8 = cu.A01;
        if (z2) {
            i8 = i4.A0H();
        }
        boolean z3 = (A00 & 256) != 0;
        boolean z4 = (A00 & 512) != 0;
        boolean z5 = (A00 & 1024) != 0;
        boolean z6 = (A00 & Opcodes.ACC_STRICT) != 0;
        long j5 = 0;
        if (c0467Cj.A08 != null && c0467Cj.A08.length == 1 && c0467Cj.A08[0] == 0) {
            j5 = IK.A0F(c0467Cj.A09[0], 1000L, c0467Cj.A06);
        }
        int[] iArr = c0469Cl.A0D;
        int[] iArr2 = c0469Cl.A0C;
        long[] jArr2 = c0469Cl.A0F;
        boolean[] zArr = c0469Cl.A0I;
        boolean z7 = c0467Cj.A03 == 2 && (i3 & 1) != 0;
        int i9 = i6 + c0469Cl.A0E[i2];
        long j6 = c0467Cj.A06;
        if (i2 > 0) {
            j3 = c0469Cl.A06;
        }
        String[] strArr5 = A0Y;
        if (strArr5[7].length() != strArr5[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr6 = A0Y;
        strArr6[7] = "ymkz";
        strArr6[2] = "tPkJ";
        while (i6 < i9) {
            int A0H = z3 ? i4.A0H() : cu.A00;
            int A0H2 = z4 ? i4.A0H() : cu.A03;
            int A082 = (i6 == 0 && z2) ? i8 : z5 ? i4.A08() : cu.A01;
            if (z6) {
                iArr2[i6] = (int) ((i4.A08() * 1000) / j6);
            } else {
                iArr2[i6] = 0;
            }
            jArr2[i6] = IK.A0F(j3, 1000L, j6) - j5;
            iArr[i6] = A0H2;
            zArr[i6] = ((A082 >> 16) & 1) == 0 && (!z7 || i6 == 0);
            j3 += A0H;
            i6++;
        }
        c0469Cl.A06 = j3;
        return i9;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Pair<Long, C1020Yt> A04(I4 i4, long j2) throws A0 {
        long A0N;
        long A0N2;
        i4.A0Y(8);
        int A01 = CO.A01(i4.A08());
        i4.A0Z(4);
        long A0M = i4.A0M();
        if (A01 == 0) {
            A0N = i4.A0M();
            A0N2 = j2 + i4.A0M();
        } else {
            A0N = i4.A0N();
            A0N2 = j2 + i4.A0N();
        }
        long A0F = IK.A0F(A0N, 1000000L, A0M);
        i4.A0Z(2);
        int A0I = i4.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        long j3 = A0F;
        for (int i2 = 0; i2 < A0I; i2++) {
            int A08 = i4.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new A0(A0A(581, 28, 60));
            }
            long A0M2 = i4.A0M();
            iArr[i2] = Integer.MAX_VALUE & A08;
            jArr[i2] = A0N2;
            jArr3[i2] = j3;
            A0N += A0M2;
            j3 = IK.A0F(A0N, 1000000L, A0M);
            jArr2[i2] = j3 - jArr3[i2];
            i4.A0Z(4);
            A0N2 += iArr[i2];
        }
        return Pair.create(Long.valueOf(A0F), new C1020Yt(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0458Ca A09(I4 i4, SparseArray<C0458Ca> sparseArray) {
        i4.A0Y(8);
        int A00 = CO.A00(i4.A08());
        C0458Ca A08 = A08(sparseArray, i4.A08());
        if (A08 == null) {
            return null;
        }
        int i2 = A00 & 1;
        String[] strArr = A0Y;
        if (strArr[4].length() == strArr[3].length()) {
            String[] strArr2 = A0Y;
            strArr2[7] = "FJhT";
            strArr2[2] = "Pkvr";
            if (i2 != 0) {
                long A0N = i4.A0N();
                A08.A07.A05 = A0N;
                A08.A07.A04 = A0N;
            }
            CU cu = A08.A04;
            int A0H = (A00 & 2) != 0 ? i4.A0H() - 1 : cu.A02;
            int i3 = A00 & 8;
            String[] strArr3 = A0Y;
            if (strArr3[1].length() != strArr3[5].length()) {
                String[] strArr4 = A0Y;
                strArr4[1] = "0FTku";
                strArr4[5] = "hJQPen4eUYzTZKVdfpRcJxs2T1l2JpI";
                A08.A07.A07 = new CU(A0H, i3 != 0 ? i4.A0H() : cu.A00, (A00 & 16) != 0 ? i4.A0H() : cu.A03, (A00 & 32) != 0 ? i4.A0H() : cu.A01);
                return A08;
            }
        }
        throw new RuntimeException();
    }

    public static String A0A(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{41, 37, 102, 83, 72, 74, 7, 84, 78, 93, 66, 7, 75, 66, 84, 84, 7, 83, 79, 70, 73, 7, 79, 66, 70, 67, 66, 85, 7, 75, 66, 73, 64, 83, 79, 7, 15, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 14, 9, 117, 94, 68, 66, 73, 16, 83, 95, 69, 94, 68, 16, 89, 94, 16, 67, 82, 87, 64, 16, 17, 13, 16, 1, 16, 24, 69, 94, 67, 69, 64, 64, 95, 66, 68, 85, 84, 25, 30, 56, 19, 9, 15, 4, 93, 30, 18, 8, 19, 9, 93, 20, 19, 93, 14, 26, 13, 25, 93, 92, 64, 93, 76, 93, 85, 8, 19, 14, 8, 13, 13, 18, 15, 9, 24, 25, 84, 83, 40, 28, 15, 9, 3, 11, 0, 26, 11, 10, 35, 30, 90, 43, 22, 26, 28, 15, 13, 26, 1, 28, 10, 36, 45, 44, 49, 42, 45, 36, 99, 45, 38, 36, 34, 55, 42, 53, 38, 99, 44, 37, 37, 48, 38, 55, 99, 55, 44, 99, 48, 34, 46, 51, 47, 38, 99, 39, 34, 55, 34, 109, 58, 19, 23, 16, 86, 23, 2, 25, 27, 86, 18, 19, 16, 31, 24, 19, 5, 86, 19, 14, 2, 19, 24, 18, 19, 18, 86, 23, 2, 25, 27, 86, 5, 31, 12, 19, 86, 94, 3, 24, 5, 3, 6, 6, 25, 4, 2, 19, 18, 95, 88, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 85, 75, 86, 74, 2, 78, 71, 76, 69, 86, 74, 2, 28, 2, 16, 19, 22, 21, 22, 26, 17, 20, 22, 21, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 11, 12, 122, 83, 88, 81, 66, 94, 22, 91, 95, 69, 91, 87, 66, 85, 94, 12, 22, 35, 10, 10, 31, 9, 24, 76, 24, 3, 76, 9, 2, 15, 30, 21, 28, 24, 5, 3, 2, 76, 8, 13, 24, 13, 76, 27, 13, 31, 76, 2, 9, 11, 13, 24, 5, 26, 9, 66, 69, 108, 108, 121, 111, 126, 42, 126, 101, 42, 111, 100, 110, 42, 101, 108, 42, 103, 110, 107, 126, 42, 125, 107, 121, 42, 100, 111, 109, 107, 126, 99, 124, 111, 36, 16, 41, 58, 45, 45, 54, 59, 54, 49, 56, Byte.MAX_VALUE, 11, 45, 62, 60, 52, 26, 49, 60, 45, 38, 47, 43, 54, 48, 49, 29, 48, 39, Byte.MAX_VALUE, 47, 62, 45, 62, 50, 58, 43, 58, 45, 44, Byte.MAX_VALUE, 54, 44, Byte.MAX_VALUE, 42, 49, 44, 42, 47, 47, 48, 45, 43, 58, 59, 113, 11, 51, 49, 40, 40, 61, 60, 120, 40, 43, 43, 48, 120, 57, 44, 55, 53, 120, 112, 62, 57, 49, 52, 61, 60, 120, 44, 55, 120, 61, 32, 44, 42, 57, 59, 44, 120, 45, 45, 49, 60, 113, 20, 44, 46, 55, 55, 46, 41, 32, 103, 38, 51, 40, 42, 103, 48, 46, 51, 47, 103, 43, 34, 41, 32, 51, 47, 103, 121, 103, 117, 118, 115, 112, 115, Byte.MAX_VALUE, 116, 113, 115, 112, 103, 111, 50, 41, 52, 50, 55, 55, 40, 53, 51, 34, 35, 110, 105, 77, 118, 125, 96, 104, 125, 123, 108, 125, 124, 56, 117, 119, 119, 110, 56, 122, 119, 96, 54, 72, 115, 120, 101, 109, 120, 126, 105, 120, 121, 61, 110, 124, 116, 114, 61, 120, 115, 105, 111, 100, 61, 126, 114, 104, 115, 105, 39, 61, 90, 97, 103, 110, 97, 107, 99, 106, 107, 47, 102, 97, 107, 102, 125, 106, 108, 123, 47, 125, 106, 105, 106, 125, 106, 97, 108, 106, 86, 97, 114, 105, 97, 98, 108, 101, 32, 108, 101, 110, 103, 116, 104, 32, 100, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110, 32, 105, 110, 32, 115, 103, 112, 100, 32, 102, 111, 117, 110, 100, 32, 40, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 41, 41, 56, 56, 36, 33, 43, 41, 60, 33, 39, 38, 103, 48, 101, 45, 37, 59, 47, 37, 51, Utf8.REPLACEMENT_BYTE, 49, 122, 101, 104, 105, 99, 35, 100, 105, 122, 111, 34, 61, 48, 49, 59, 123, 57, 36, 96};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0K(YY yy) throws A0 {
        AbstractC0576Hf.A06(this.A0N == null, A0A(532, 20, 43));
        DrmInitData drmInitData = this.A0L;
        String[] strArr = A0Y;
        if (strArr[1].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[0] = "cITVXbucFjOfeClWrkS0v9B8d8WyNU66";
        strArr2[6] = "gc4qcVgrZ1gcE7K2dExDGvJ4qDD8VQ1r";
        DrmInitData A05 = drmInitData != null ? this.A0L : A05(yy.A02);
        YY A06 = yy.A06(CO.A0m);
        SparseArray<CU> sparseArray = new SparseArray<>();
        long j2 = -9223372036854775807L;
        int size = A06.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            YX yx = A06.A02.get(i2);
            if (((CO) yx).A00 == CO.A1M) {
                Pair<Integer, CU> A03 = A03(yx.A00);
                sparseArray.put(((Integer) A03.first).intValue(), (CU) A03.second);
            } else if (((CO) yx).A00 == CO.A0f) {
                j2 = A01(yx.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = yy.A01.size();
        for (int i3 = 0; i3 < size2; i3++) {
            YY yy2 = yy.A01.get(i3);
            if (((CO) yy2).A00 == CO.A1L) {
                C0467Cj A0C = CT.A0C(yy2, yy.A07(CO.A0n), j2, A05, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    sparseArray2.put(A0C.A00, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            AbstractC0576Hf.A04(this.A0K.size() == size3);
            for (int i4 = 0; i4 < size3; i4++) {
                C0467Cj c0467Cj = (C0467Cj) sparseArray2.valueAt(i4);
                this.A0K.get(c0467Cj.A00).A07(c0467Cj, A06(sparseArray, c0467Cj.A00));
            }
            return;
        }
        for (int i5 = 0; i5 < size3; i5++) {
            C0467Cj c0467Cj2 = (C0467Cj) sparseArray2.valueAt(i5);
            C0458Ca c0458Ca = new C0458Ca(this.A0C.AHA(i5, c0467Cj2.A03));
            c0458Ca.A07(c0467Cj2, A06(sparseArray, c0467Cj2.A00));
            this.A0K.put(c0467Cj2.A00, c0458Ca);
            this.A08 = Math.max(this.A08, c0467Cj2.A04);
        }
        A0C();
        this.A0C.A5u();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0M(YY yy, SparseArray<C0458Ca> sparseArray, int i2, byte[] bArr) throws A0 {
        C0458Ca A09 = A09(yy.A07(CO.A1I).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        C0469Cl c0469Cl = A09.A07;
        long j2 = c0469Cl.A06;
        A09.A04();
        if (yy.A07(CO.A1H) != null && (i2 & 2) == 0) {
            j2 = A02(yy.A07(CO.A1H).A00);
        }
        A0N(yy, A09, j2, i2);
        C0467Cj c0467Cj = A09.A05;
        CU cu = c0469Cl.A07;
        String[] strArr = A0Y;
        if (strArr[4].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[4] = "WU7oMBOObJevND1f7OB";
        strArr2[3] = "wctXeW8hr2zoeToUczf";
        C0468Ck A00 = c0467Cj.A00(cu.A02);
        YX A07 = yy.A07(CO.A0u);
        if (A07 != null) {
            A0P(A00, A07.A00, c0469Cl);
        }
        YX A072 = yy.A07(CO.A0t);
        if (A072 != null) {
            A0S(A072.A00, c0469Cl);
        }
        YX A073 = yy.A07(CO.A10);
        if (A073 != null) {
            A0T(A073.A00, c0469Cl);
        }
        YX A074 = yy.A07(CO.A0x);
        YX A075 = yy.A07(CO.A11);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, c0469Cl);
        }
        int size = yy.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            List<YX> list = yy.A02;
            String[] strArr3 = A0Y;
            if (strArr3[0].charAt(25) == strArr3[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0Y;
            strArr4[1] = "paWge";
            strArr4[5] = "dXzfuXi73AxT86ALLJ8HbAy7LfB3Ldz";
            YX yx = list.get(i3);
            if (((CO) yx).A00 == CO.A1Q) {
                A0U(yx.A00, c0469Cl, bArr);
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
    public static void A0P(C0468Ck c0468Ck, I4 i4, C0469Cl c0469Cl) throws A0 {
        int i2 = c0468Ck.A00;
        i4.A0Y(8);
        if ((CO.A00(i4.A08()) & 1) == 1) {
            i4.A0Z(8);
        }
        int A0E = i4.A0E();
        int A0H = i4.A0H();
        if (A0H != c0469Cl.A00) {
            throw new A0(A0A(290, 17, 5) + A0H + A0A(0, 2, 54) + c0469Cl.A00);
        }
        int i3 = 0;
        if (A0E == 0) {
            boolean[] zArr = c0469Cl.A0H;
            for (int i5 = 0; i5 < A0H; i5++) {
                int A0E2 = i4.A0E();
                i3 += A0E2;
                zArr[i5] = A0E2 > i2;
            }
        } else {
            i3 = 0 + (A0E * A0H);
            Arrays.fill(c0469Cl.A0H, 0, A0H, A0E > i2);
        }
        c0469Cl.A02(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r4 == 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r4 == 1) goto L25;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 14
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
    public static void A0V(com.instagram.common.viewpoint.core.I4 r10, com.instagram.common.viewpoint.core.I4 r11, java.lang.String r12, com.instagram.common.viewpoint.core.C0469Cl r13) throws com.instagram.common.viewpoint.core.A0 {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.YS.A0V(com.facebook.ads.redexgen.X.I4, com.facebook.ads.redexgen.X.I4, java.lang.String, com.facebook.ads.redexgen.X.Cl):void");
    }

    static {
        A0D();
        A0Z = new YT();
        A0a = IK.A08(A0A(682, 4, 101));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, Opcodes.LSHR), Long.MAX_VALUE);
    }

    public YS() {
        this(0);
    }

    public YS(int i2) {
        this(i2, null);
    }

    public YS(int i2, IG ig) {
        this(i2, ig, null, null);
    }

    public YS(int i2, IG ig, C0467Cj c0467Cj, DrmInitData drmInitData) {
        this(i2, ig, c0467Cj, drmInitData, Collections.emptyList());
    }

    public YS(int i2, IG ig, C0467Cj c0467Cj, DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i2, ig, c0467Cj, drmInitData, closedCaptionFormats, null);
    }

    public YS(int i2, IG ig, C0467Cj c0467Cj, DrmInitData drmInitData, List<Format> closedCaptionFormats, C9 c9) {
        this.A0J = (c0467Cj != null ? 8 : 0) | i2;
        this.A0S = ig;
        this.A0N = c0467Cj;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = c9;
        this.A0O = new I4(16);
        this.A0R = new I4(I0.A03);
        this.A0Q = new I4(5);
        this.A0P = new I4();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    public static long A01(I4 i4) {
        i4.A0Y(8);
        int fullAtom = i4.A08();
        return CO.A01(fullAtom) == 0 ? i4.A0M() : i4.A0N();
    }

    public static long A02(I4 i4) {
        i4.A0Y(8);
        int fullAtom = i4.A08();
        int version = CO.A01(fullAtom);
        return version == 1 ? i4.A0N() : i4.A0M();
    }

    public static Pair<Integer, CU> A03(I4 i4) {
        i4.A0Y(12);
        int defaultSampleDescriptionIndex = i4.A08();
        int trackId = i4.A0H();
        int defaultSampleFlags = i4.A0H();
        int defaultSampleSize = i4.A0H();
        int defaultSampleDuration = i4.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new CU(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<YX> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            YX yx = list.get(i2);
            int leafChildrenSize = ((CO) yx).A00;
            if (leafChildrenSize == CO.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = yx.A00.A00;
                UUID A02 = AbstractC0464Cg.A02(bArr);
                if (A02 == null) {
                    Log.w(A0A(128, 22, 93), A0A(437, 42, 107));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A02, A0A(696, 9, 103), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private CU A06(SparseArray<CU> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (CU) AbstractC0576Hf.A01(sparseArray.get(i2));
    }

    public static C0458Ca A07(SparseArray<C0458Ca> sparseArray) {
        C0458Ca c0458Ca = null;
        long j2 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0458Ca valueAt = sparseArray.valueAt(i2);
            if (valueAt.A02 != valueAt.A07.A02) {
                long nextTrackRunOffset = valueAt.A07.A0G[valueAt.A02];
                if (nextTrackRunOffset < j2) {
                    c0458Ca = valueAt;
                    j2 = nextTrackRunOffset;
                }
            }
        }
        return c0458Ca;
    }

    public static C0458Ca A08(SparseArray<C0458Ca> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i2);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:17:0x005c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0I
            if (r0 != 0) goto L4a
            r0 = 2
            com.facebook.ads.redexgen.X.C9[] r0 = new com.instagram.common.viewpoint.core.C9[r0]
            r6.A0I = r0
            r5 = 0
            com.facebook.ads.redexgen.X.C9 r0 = r6.A0M
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.C9[] r2 = r6.A0I
            int r1 = r5 + 1
            com.facebook.ads.redexgen.X.C9 r0 = r6.A0M
            r2[r5] = r0
            r5 = r1
        L17:
            int r0 = r6.A0J
            r4 = 4
            r0 = r0 & r4
            if (r0 == 0) goto L30
            com.facebook.ads.redexgen.X.C9[] r3 = r6.A0I
            int r2 = r5 + 1
            com.facebook.ads.redexgen.X.Bz r1 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.Ca> r0 = r6.A0K
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C9 r0 = r1.AHA(r0, r4)
            r3[r5] = r0
            r5 = r2
        L30:
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0I
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            com.facebook.ads.redexgen.X.C9[] r0 = (com.instagram.common.viewpoint.core.C9[]) r0
            r6.A0I = r0
            com.facebook.ads.redexgen.X.C9[] r4 = r6.A0I
            int r3 = r4.length
            r2 = 0
        L3e:
            if (r2 >= r3) goto L4a
            r1 = r4[r2]
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.instagram.common.viewpoint.core.YS.A0b
            r1.A69(r0)
            int r2 = r2 + 1
            goto L3e
        L4a:
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0H
            if (r0 != 0) goto L80
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C9[] r0 = new com.instagram.common.viewpoint.core.C9[r0]
            r6.A0H = r0
            r3 = 0
        L59:
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0H
            int r0 = r0.length
            if (r3 >= r0) goto L80
            com.facebook.ads.redexgen.X.Bz r2 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.Ca> r0 = r6.A0K
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.C9 r1 = r2.AHA(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) r0
            r1.A69(r0)
            com.facebook.ads.redexgen.X.C9[] r0 = r6.A0H
            r0[r3] = r1
            int r3 = r3 + 1
            goto L59
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.YS.A0C():void");
    }

    private void A0E(long j2) {
        while (!this.A0U.isEmpty()) {
            CZ removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j3 = j2 + removeFirst.A01;
            if (this.A0S != null) {
                j3 = this.A0S.A06(j3);
            }
            for (C9 c9 : this.A0I) {
                c9.AFw(j3, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j2) throws A0 {
        while (!this.A0T.isEmpty()) {
            YY peek = this.A0T.peek();
            String[] strArr = A0Y;
            if (strArr[0].charAt(25) == strArr[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[4] = "gNXaBBDJLYyRWj2Z7QI";
            strArr2[3] = "TD4PDa0LhqSPzxNxfPG";
            if (peek.A00 != j2) {
                break;
            } else {
                A0I(this.A0T.pop());
            }
        }
        A0B();
    }

    private void A0G(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        int i2 = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC0456By.readFully(this.A0E.A00, 8, i2);
            int atomPayloadSize = this.A01;
            A0O(new YX(atomPayloadSize, this.A0E), interfaceC0456By.A86());
        } else {
            interfaceC0456By.AGq(i2);
        }
        A0F(interfaceC0456By.A86());
        String[] strArr = A0Y;
        String str = strArr[0];
        String str2 = strArr[6];
        int atomPayloadSize2 = str.charAt(25);
        if (atomPayloadSize2 == str2.charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[1] = "4FJvf";
        strArr2[5] = "L9aSIrlhJLOJ4gZHMUtL1skIFqYjh5f";
    }

    private void A0H(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        C0458Ca nextTrackBundle = null;
        long j2 = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0469Cl c0469Cl = this.A0K.valueAt(i2).A07;
            if (c0469Cl.A0B && c0469Cl.A04 < j2) {
                j2 = c0469Cl.A04;
                SparseArray<C0458Ca> sparseArray = this.A0K;
                String[] strArr = A0Y;
                if (strArr[4].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Y;
                strArr2[1] = "kt1A3";
                strArr2[5] = "mNo1CSqVUFLWh990elZl1WPNTwsUo12";
                C0458Ca nextTrackBundle2 = sparseArray.valueAt(i2);
                nextTrackBundle = nextTrackBundle2;
            }
        }
        if (nextTrackBundle == null) {
            this.A02 = 3;
            return;
        }
        int A86 = (int) (j2 - interfaceC0456By.A86());
        if (A86 >= 0) {
            interfaceC0456By.AGq(A86);
            nextTrackBundle.A07.A04(interfaceC0456By);
            return;
        }
        throw new A0(A0A(StatusLine.HTTP_TEMP_REDIRECT, 39, 95));
    }

    private void A0I(YY yy) throws A0 {
        if (((CO) yy).A00 == CO.A0j) {
            A0K(yy);
        } else if (((CO) yy).A00 == CO.A0i) {
            A0J(yy);
        } else {
            if (this.A0T.isEmpty()) {
                return;
            }
            this.A0T.peek().A08(yy);
        }
    }

    private void A0J(YY yy) throws A0 {
        A0L(yy, this.A0K, this.A0J, this.A0W);
        DrmInitData A05 = this.A0L != null ? null : A05(yy.A02);
        if (A05 != null) {
            int size = this.A0K.size();
            String[] strArr = A0Y;
            if (strArr[1].length() != strArr[5].length()) {
                String[] strArr2 = A0Y;
                strArr2[0] = "AYjZd4g6T0IxTHPvW5j6vW4JlA5KT5rF";
                strArr2[6] = "Mee0jY90dwUegeNg5bKbsrEqYZuyqQmD";
                int i2 = 0;
                while (i2 < size) {
                    C0458Ca valueAt = this.A0K.valueAt(i2);
                    String[] strArr3 = A0Y;
                    String str = strArr3[1];
                    String str2 = strArr3[5];
                    int trackCount = str.length();
                    if (trackCount != str2.length()) {
                        String[] strArr4 = A0Y;
                        strArr4[0] = "9D0DcxlbTrvCOM9kwdnib1tB4ktxoksB";
                        strArr4[6] = "xmyCm9TqbgmL7mY9bOatvH3VH7vFgkg3";
                        valueAt.A06(A05);
                        i2++;
                    } else {
                        valueAt.A06(A05);
                        i2++;
                    }
                }
            }
            throw new RuntimeException();
        }
        if (this.A0A != -9223372036854775807L) {
            int size2 = this.A0K.size();
            String[] strArr5 = A0Y;
            if (strArr5[0].charAt(25) == strArr5[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr6 = A0Y;
            strArr6[1] = "SLujA";
            strArr6[5] = "54hBL6ZhhAHwudix1T3OFjmqjeaVz8V";
            for (int i3 = 0; i3 < size2; i3++) {
                C0458Ca valueAt2 = this.A0K.valueAt(i3);
                long j2 = this.A0A;
                String[] strArr7 = A0Y;
                String str3 = strArr7[7];
                String str4 = strArr7[2];
                int trackCount2 = str3.length();
                if (trackCount2 != str4.length()) {
                    throw new RuntimeException();
                }
                String[] strArr8 = A0Y;
                strArr8[0] = "JzptpZA4eYxy2xJI1KlH0ejrbcDGS6Rm";
                strArr8[6] = "qWlvxcI9Vh7HD5II0LoLiUDgTr4SEUlu";
                valueAt2.A05(j2);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    public static void A0L(YY yy, SparseArray<C0458Ca> sparseArray, int i2, byte[] bArr) throws A0 {
        int size = yy.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            YY child = yy.A01.get(i3);
            int i4 = ((CO) child).A00;
            int moofContainerChildrenSize = CO.A1K;
            if (i4 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i2, bArr);
            }
        }
    }

    public static void A0N(YY yy, C0458Ca c0458Ca, long j2, int trunIndex) {
        int i2 = 0;
        int trunSampleCount = 0;
        List<YX> list = yy.A02;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            YX yx = list.get(i3);
            if (((CO) yx).A00 == CO.A1N) {
                I4 trunData = yx.A00;
                trunData.A0Y(12);
                int A0H = trunData.A0H();
                if (A0H > 0) {
                    trunSampleCount += A0H;
                    String[] strArr = A0Y;
                    if (strArr[4].length() != strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0Y;
                    strArr2[0] = "ra20oBhvV3095H1tQEj3cUfqdugQ0hdh";
                    strArr2[6] = "LUb7Sxx6Lbmy90ZTUB4vzQSJRbj77A9K";
                    i2++;
                } else {
                    continue;
                }
            }
        }
        c0458Ca.A02 = 0;
        c0458Ca.A00 = 0;
        c0458Ca.A01 = 0;
        c0458Ca.A07.A03(i2, trunSampleCount);
        int i4 = 0;
        int trunStartPosition = 0;
        for (int i5 = 0; i5 < size; i5++) {
            YX yx2 = list.get(i5);
            int trunIndex2 = ((CO) yx2).A00;
            if (trunIndex2 == CO.A1N) {
                trunStartPosition = A00(c0458Ca, i4, j2, trunIndex, yx2.A00, trunStartPosition);
                i4++;
            }
        }
    }

    private void A0O(YX yx, long j2) throws A0 {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(yx);
            return;
        }
        if (((CO) yx).A00 == CO.A12) {
            Pair<Long, C1020Yt> A04 = A04(yx.A00, j2);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AG8((C6) A04.second);
            this.A0F = true;
            return;
        }
        if (((CO) yx).A00 != CO.A0P) {
            return;
        }
        A0Q(yx.A00);
    }

    private void A0Q(I4 i4) {
        if (this.A0I == null || this.A0I.length == 0) {
            return;
        }
        i4.A0Y(12);
        int A04 = i4.A04();
        i4.A0Q();
        i4.A0Q();
        long A0F = IK.A0F(i4.A0M(), 1000000L, i4.A0M());
        for (C9 c9 : this.A0I) {
            i4.A0Y(12);
            c9.AFv(i4, A04);
        }
        if (this.A0B != -9223372036854775807L) {
            long j2 = this.A0B + A0F;
            if (this.A0S != null) {
                j2 = this.A0S.A06(j2);
            }
            for (C9 c92 : this.A0I) {
                c92.AFw(j2, 1, A04, 0, null);
            }
            return;
        }
        this.A0U.addLast(new CZ(A0F, A04));
        this.A03 += A04;
    }

    public static void A0R(I4 i4, int i2, C0469Cl c0469Cl) throws A0 {
        i4.A0Y(i2 + 8);
        int fullAtom = i4.A08();
        int flags = CO.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z2 = fullAtom3 != 0;
            int sampleCount = i4.A0H();
            int fullAtom4 = c0469Cl.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c0469Cl.A0H, 0, sampleCount, z2);
                int A04 = i4.A04();
                String[] strArr = A0Y;
                String str = strArr[7];
                String str2 = strArr[2];
                int flags2 = str.length();
                int fullAtom5 = str2.length();
                if (flags2 != fullAtom5) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Y;
                strArr2[7] = "AHUK";
                strArr2[2] = "TJdi";
                c0469Cl.A02(A04);
                c0469Cl.A05(i4);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0A(290, 17, 5)).append(sampleCount).append(A0A(0, 2, 54));
            int fullAtom6 = c0469Cl.A00;
            throw new A0(append.append(fullAtom6).toString());
        }
        throw new A0(A0A(381, 56, 108));
    }

    public static void A0S(I4 i4, C0469Cl c0469Cl) throws A0 {
        i4.A0Y(8);
        int flags = i4.A08();
        int fullAtom = CO.A00(flags) & 1;
        if (fullAtom == 1) {
            i4.A0Z(8);
        }
        int A0H = i4.A0H();
        if (A0H == 1) {
            int entryCount = CO.A01(flags);
            c0469Cl.A04 += entryCount == 0 ? i4.A0M() : i4.A0N();
            return;
        }
        throw new A0(A0A(552, 29, 46) + A0H);
    }

    public static void A0T(I4 i4, C0469Cl c0469Cl) throws A0 {
        A0R(i4, 0, c0469Cl);
    }

    public static void A0U(I4 i4, C0469Cl c0469Cl, byte[] bArr) throws A0 {
        i4.A0Y(8);
        i4.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(i4, 16, c0469Cl);
    }

    public static boolean A0W(int i2) {
        if (i2 != CO.A0j) {
            int i3 = CO.A1L;
            String[] strArr = A0Y;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[4] = "z52WapgDuUmRrJT6dfh";
            strArr2[3] = "pwB1eRxling54jqU6H4";
            if (i2 != i3 && i2 != CO.A0d && i2 != CO.A0h && i2 != CO.A16 && i2 != CO.A0i && i2 != CO.A1K && i2 != CO.A0m && i2 != CO.A0N) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (r4 != r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r4 == com.instagram.common.viewpoint.core.CO.A0O) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (r4 == com.instagram.common.viewpoint.core.CO.A0f) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (r4 != com.instagram.common.viewpoint.core.CO.A0P) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if (r4 != r3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0X(int r4) {
        /*
            int r0 = com.instagram.common.viewpoint.core.CO.A0V
            if (r4 == r0) goto Lae
            int r3 = com.instagram.common.viewpoint.core.CO.A0c
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.YS.A0Y
            r0 = 1
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lbb
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.YS.A0Y
            java.lang.String r1 = "7R4knsjQsoYw3FkbVRD"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "IJ7EeFeEp8TvkaWnmhI"
            r0 = 3
            r2[r0] = r1
            if (r4 == r3) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A0n
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A12
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A1A
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A1H
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A1I
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A1J
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A1M
            if (r4 == r0) goto Lae
            int r3 = com.instagram.common.viewpoint.core.CO.A1N
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.YS.A0Y
            r0 = 0
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lb5
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.YS.A0Y
            java.lang.String r1 = "XNpM"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "Sb63"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A0r
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A0u
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A0t
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A10
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A1Q
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A0x
            if (r4 == r0) goto Lae
            int r3 = com.instagram.common.viewpoint.core.CO.A11
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.YS.A0Y
            r0 = 0
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lb2
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.YS.A0Y
            java.lang.String r1 = "rn1A"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "2A15"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto Lae
        La2:
            int r0 = com.instagram.common.viewpoint.core.CO.A0O
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A0f
            if (r4 == r0) goto Lae
            int r0 = com.instagram.common.viewpoint.core.CO.A0P
            if (r4 != r0) goto Lb0
        Lae:
            r0 = 1
        Laf:
            return r0
        Lb0:
            r0 = 0
            goto Laf
        Lb2:
            if (r4 == r3) goto Lae
            goto La2
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lbb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.YS.A0X(int):boolean");
    }

    private boolean A0Y(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC0456By.AEp(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0Y(0);
            this.A07 = this.A0O.A0M();
            this.A01 = this.A0O.A08();
        }
        long j2 = this.A07;
        String[] strArr = A0Y;
        if (strArr[4].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[7] = "deGD";
        strArr2[2] = "uZkj";
        if (j2 == 1) {
            interfaceC0456By.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0N();
        } else if (this.A07 == 0) {
            long A7g = interfaceC0456By.A7g();
            if (A7g == -1 && !this.A0T.isEmpty()) {
                A7g = this.A0T.peek().A00;
            }
            if (A7g != -1) {
                long A86 = A7g - interfaceC0456By.A86();
                int trackCount = this.A00;
                this.A07 = A86 + trackCount;
            }
        }
        if (this.A07 >= this.A00) {
            long A862 = interfaceC0456By.A86() - this.A00;
            if (this.A01 == CO.A0i) {
                int size = this.A0K.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0469Cl c0469Cl = this.A0K.valueAt(i2).A07;
                    c0469Cl.A03 = A862;
                    c0469Cl.A04 = A862;
                    c0469Cl.A05 = A862;
                }
            }
            if (this.A01 == CO.A0b) {
                this.A0D = null;
                this.A09 = this.A07 + A862;
                if (!this.A0F) {
                    this.A0C.AG8(new C1015Yo(this.A08, A862));
                    this.A0F = true;
                }
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long A863 = (interfaceC0456By.A86() + this.A07) - 8;
                this.A0T.push(new YY(this.A01, A863));
                if (this.A07 == this.A00) {
                    A0F(A863);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw new A0(A0A(190, 51, 69));
                }
                if (this.A07 <= 2147483647L) {
                    this.A0E = new I4((int) this.A07);
                    System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new A0(A0A(241, 49, 17));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0E = null;
                String[] strArr3 = A0Y;
                if (strArr3[4].length() != strArr3[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0Y;
                strArr4[0] = "CFkyaDHKl829MEsfGeCJV98D86mxwRuG";
                strArr4[6] = "SvrGe4OZrAn9QexWiwFyRQyCjduNZ0ii";
                this.A02 = 1;
            } else {
                throw new A0(A0A(479, 53, 116));
            }
            return true;
        }
        throw new A0(A0A(2, 48, 20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0173, code lost:
    
        if (com.instagram.common.viewpoint.core.I0.A0C(r14, r13[r12]) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0175, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0196, code lost:
    
        if (com.instagram.common.viewpoint.core.I0.A0C(r14, r13[r12]) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.instagram.common.viewpoint.core.InterfaceC0456By r20) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.YS.A0Z(com.facebook.ads.redexgen.X.By):boolean");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void A9D(InterfaceC0457Bz interfaceC0457Bz) {
        this.A0C = interfaceC0457Bz;
        if (this.A0N != null) {
            C0458Ca c0458Ca = new C0458Ca(interfaceC0457Bz.AHA(0, this.A0N.A03));
            c0458Ca.A07(this.A0N, new CU(0, 0, 0, 0));
            this.A0K.put(0, c0458Ca);
            A0C();
            this.A0C.A5u();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final int AEk(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC0456By)) {
                        return -1;
                    }
                    break;
                case 1:
                    A0G(interfaceC0456By);
                    break;
                case 2:
                    A0H(interfaceC0456By);
                    break;
                default:
                    if (!A0Z(interfaceC0456By)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void AG7(long j2, long j3) {
        int size = this.A0K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0K.valueAt(i2).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j3;
        this.A0T.clear();
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final boolean AGs(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        return AbstractC0465Ch.A03(interfaceC0456By);
    }
}
