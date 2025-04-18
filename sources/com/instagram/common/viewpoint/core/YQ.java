package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class YQ implements InterfaceC0455Bx, C6 {
    public static byte[] A0J;
    public static String[] A0K = {"wz4V52vnyaYzOzVosV2ggmqDE2de2aPD", "esit5oX7p0ewzuQ78yIb5IGBQ4Ll7QTy", "tMkVwszYh26uN0N48v", "KJWf5gllWosHtEG14Ww8x97Nig", "fJrikXC0LBawWnAwWRav5JxSrwLR9RG4", "RlENClTr9MFxo5IUenPz66cSFO", "MF3OfsQe3I", "XRSHK8nEMc6B"};
    public static final C0 A0L;
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
    public InterfaceC0457Bz A09;
    public I4 A0A;
    public boolean A0B;
    public C0461Cd[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final I4 A0F;
    public final I4 A0G;
    public final I4 A0H;
    public final ArrayDeque<YY> A0I;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{-18, 33, 28, 26, -51, 32, 22, 39, 18, -51, 25, 18, 32, 32, -51, 33, 21, 14, 27, -51, 21, 18, 14, 17, 18, 31, -51, 25, 18, 27, 20, 33, 21, -51, -43, 34, 27, 32, 34, 29, 29, 28, 31, 33, 18, 17, -42, -37, -5, -2, -86, -86};
    }

    static {
        A07();
        A0L = new YR();
        A0M = IK.A08(A04(48, 4, 25));
    }

    public YQ() {
        this(0);
    }

    public YQ(int i2) {
        this.A0E = i2;
        this.A0F = new I4(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new I4(I0.A03);
        this.A0G = new I4(4);
        this.A06 = -1;
    }

    private int A00(long j2) {
        long sampleAccumulatedBytes = Long.MAX_VALUE;
        int i2 = 1;
        int i3 = -1;
        long j3 = Long.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        for (int i4 = 0; i4 < this.A0C.length; i4++) {
            C0461Cd c0461Cd = this.A0C[i4];
            int i5 = c0461Cd.A00;
            if (i5 != c0461Cd.A03.A01) {
                long j5 = c0461Cd.A03.A06[i5];
                long j6 = this.A0D[i4][i5];
                long j7 = j5 - j2;
                int i6 = (j7 < 0 || j7 >= 262144) ? 1 : 0;
                if ((i6 == 0 && i2 != 0) || (i6 == i2 && j7 < sampleAccumulatedBytes)) {
                    i2 = i6;
                    sampleAccumulatedBytes = j7;
                    i3 = i4;
                    j3 = j6;
                }
                if (j6 < j4) {
                    j4 = j6;
                    trackIndex = i6;
                    minAccumulatedBytesTrackIndex = i4;
                }
            }
        }
        if (j4 == Long.MAX_VALUE || trackIndex == 0) {
            return i3;
        }
        if (A0K[0].charAt(24) != 'E') {
            throw new RuntimeException();
        }
        A0K[6] = "tZzV2qNllM";
        if (j3 < 10485760 + j4) {
            return i3;
        }
        return minAccumulatedBytesTrackIndex;
    }

    private int A01(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        int i2;
        long A86 = interfaceC0456By.A86();
        if (this.A06 == -1) {
            this.A06 = A00(A86);
            if (this.A06 == -1) {
                return -1;
            }
        }
        C0461Cd c0461Cd = this.A0C[this.A06];
        C9 trackOutput = c0461Cd.A01;
        int i3 = c0461Cd.A00;
        long j2 = c0461Cd.A03.A06[i3];
        int sampleSize = c0461Cd.A03.A05[i3];
        long j3 = (j2 - A86) + this.A04;
        if (j3 < 0 || j3 >= 262144) {
            c4.A00 = j2;
            return 1;
        }
        if (c0461Cd.A02.A02 == 1) {
            j3 += 8;
            sampleSize -= 8;
        }
        interfaceC0456By.AGq((int) j3);
        if (c0461Cd.A02.A01 != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[7].length()) {
                A0K[0] = "vyve0RiE3dygV6rbXBv0klsLEJYuli0L";
                bArr[2] = 0;
                int i4 = c0461Cd.A02.A01;
                int i5 = 4 - c0461Cd.A02.A01;
                while (this.A04 < sampleSize) {
                    if (this.A05 == 0) {
                        interfaceC0456By.readFully(this.A0G.A00, i5, i4);
                        this.A0G.A0Y(0);
                        this.A05 = this.A0G.A0H();
                        this.A0H.A0Y(0);
                        trackOutput.AFv(this.A0H, 4);
                        this.A04 += 4;
                        sampleSize += i5;
                    } else {
                        int AFu = trackOutput.AFu(interfaceC0456By, this.A05, false);
                        this.A04 += AFu;
                        this.A05 -= AFu;
                    }
                }
                i2 = 0;
            } else {
                throw new RuntimeException();
            }
        } else {
            while (true) {
                int i6 = this.A04;
                String[] strArr2 = A0K;
                if (strArr2[1].charAt(20) == strArr2[4].charAt(20)) {
                    A0K[6] = "5r7UGAoy7S";
                    if (i6 >= sampleSize) {
                        break;
                    }
                    int AFu2 = trackOutput.AFu(interfaceC0456By, sampleSize - this.A04, false);
                    this.A04 += AFu2;
                    this.A05 -= AFu2;
                } else {
                    if (i6 >= sampleSize) {
                        break;
                    }
                    int AFu22 = trackOutput.AFu(interfaceC0456By, sampleSize - this.A04, false);
                    this.A04 += AFu22;
                    this.A05 -= AFu22;
                }
            }
            i2 = 0;
        }
        trackOutput.AFw(c0461Cd.A03.A07[i3], c0461Cd.A03.A04[i3], sampleSize, 0, null);
        c0461Cd.A00++;
        this.A06 = -1;
        this.A04 = i2;
        this.A05 = i2;
        return i2;
    }

    public static int A02(C0470Cm c0470Cm, long j2) {
        int A00 = c0470Cm.A00(j2);
        if (A00 == -1) {
            return c0470Cm.A01(j2);
        }
        return A00;
    }

    public static long A03(C0470Cm c0470Cm, long j2, long j3) {
        int A02 = A02(c0470Cm, j2);
        if (A02 == -1) {
            return j3;
        }
        return Math.min(c0470Cm.A06[A02], j3);
    }

    private ArrayList<C0470Cm> A05(YY yy, C1 c12, boolean z2) throws A0 {
        C0467Cj A0C;
        ArrayList<C0470Cm> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < yy.A01.size(); i2++) {
            YY yy2 = yy.A01.get(i2);
            int i3 = ((CO) yy2).A00;
            if (i3 == CO.A1L && (A0C = CT.A0C(yy2, yy.A07(CO.A0n), -9223372036854775807L, null, z2, this.A0B)) != null) {
                C0470Cm A0E = CT.A0E(A0C, yy2.A06(CO.A0d).A06(CO.A0h).A06(CO.A16), c12);
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

    private void A08(long j2) throws A0 {
        while (true) {
            ArrayDeque<YY> arrayDeque = this.A0I;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[3] = "94GrU73F5EyrcbNA6j51EfMGM9";
            strArr2[5] = "F9uNEWGJqPBROLdqhW4wSeNvu2";
            if (arrayDeque.isEmpty() || this.A0I.peek().A00 != j2) {
                break;
            }
            YY pop = this.A0I.pop();
            if (((CO) pop).A00 == CO.A0j) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                YY containerAtom = this.A0I.peek();
                containerAtom.A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j2) {
        for (C0461Cd track : this.A0C) {
            C0470Cm c0470Cm = track.A03;
            int A00 = c0470Cm.A00(j2);
            if (A00 == -1) {
                A00 = c0470Cm.A01(j2);
            }
            track.A00 = A00;
        }
    }

    private void A0A(YY yy) throws A0 {
        ArrayList<C0470Cm> A05;
        int trackCount = -1;
        long j2 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C1 c12 = new C1();
        YX A07 = yy.A07(CO.A1P);
        if (A07 != null && (metadata = CT.A0F(A07, this.A0B)) != null) {
            c12.A05(metadata);
        }
        try {
            A05 = A05(yy, c12, (this.A0E & 1) != 0);
        } catch (YU unused) {
            c12 = new C1();
            A05 = A05(yy, c12, true);
        }
        int size = A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0470Cm c0470Cm = A05.get(i2);
            C0467Cj c0467Cj = c0470Cm.A03;
            C0461Cd c0461Cd = new C0461Cd(c0467Cj, c0470Cm, this.A09.AHA(i2, c0467Cj.A03));
            Format A0F = c0467Cj.A07.A0F(c0470Cm.A00 + 30);
            if (c0467Cj.A03 == 1) {
                if (c12.A03()) {
                    A0F = A0F.A0G(c12.A00, c12.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            c0461Cd.A01.A69(A0F);
            j2 = Math.max(j2, c0467Cj.A04 != -9223372036854775807L ? c0467Cj.A04 : c0470Cm.A02);
            if (c0467Cj.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(c0461Cd);
        }
        this.A02 = trackCount;
        this.A08 = j2;
        this.A0C = (C0461Cd[]) arrayList.toArray(new C0461Cd[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5u();
        this.A09.AG8(this);
    }

    public static boolean A0B(int i2) {
        return i2 == CO.A0j || i2 == CO.A1L || i2 == CO.A0d || i2 == CO.A0h || i2 == CO.A16 || i2 == CO.A0N;
    }

    public static boolean A0C(int i2) {
        if (i2 != CO.A0c && i2 != CO.A0n && i2 != CO.A0V && i2 != CO.A1A && i2 != CO.A1D && i2 != CO.A1B && i2 != CO.A0C && i2 != CO.A0O && i2 != CO.A19 && i2 != CO.A1C && i2 != CO.A1E && i2 != CO.A17 && i2 != CO.A0B) {
            int i3 = CO.A1J;
            String[] strArr = A0K;
            if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                throw new RuntimeException();
            }
            A0K[0] = "U3OZ2jnvkswrjx8Ur9vHK1X6EFaJhYJ7";
            if (i2 != i3 && i2 != CO.A0U && i2 != CO.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC0456By.AEp(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        if (this.A07 == 1) {
            interfaceC0456By.readFully(this.A0F.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0F.A0N();
        } else {
            long endPosition = this.A07;
            if (endPosition == 0) {
                long A7g = interfaceC0456By.A7g();
                if (A7g == -1 && !this.A0I.isEmpty()) {
                    A7g = this.A0I.peek().A00;
                }
                if (A7g != -1) {
                    long endPosition2 = interfaceC0456By.A86();
                    long j2 = A7g - endPosition2;
                    int i2 = this.A00;
                    String[] strArr = A0K;
                    if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0K;
                    strArr2[1] = "dzRUDibdLgOz76mBe3Hd5q70FZ39yex3";
                    strArr2[4] = "PQflqNZiVauK8bXoCB0g54EgUoVKXKVc";
                    long endPosition3 = i2;
                    this.A07 = j2 + endPosition3;
                }
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A86 = (interfaceC0456By.A86() + this.A07) - this.A00;
                this.A0I.push(new YY(this.A01, A86));
                if (this.A07 == this.A00) {
                    A08(A86);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                AbstractC0576Hf.A04(this.A00 == 8);
                AbstractC0576Hf.A04(this.A07 <= 2147483647L);
                this.A0A = new I4((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new A0(A04(0, 48, 60));
    }

    private boolean A0E(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        long j2 = this.A07 - this.A00;
        long A86 = interfaceC0456By.A86() + j2;
        boolean z2 = false;
        if (this.A0A != null) {
            interfaceC0456By.readFully(this.A0A.A00, this.A00, (int) j2);
            if (this.A01 == CO.A0U) {
                this.A0B = A0F(this.A0A);
            } else {
                boolean isEmpty = this.A0I.isEmpty();
                String[] strArr = A0K;
                if (strArr[1].charAt(20) != strArr[4].charAt(20)) {
                    throw new RuntimeException();
                }
                A0K[6] = "JSMKdVw6fi";
                if (!isEmpty) {
                    this.A0I.peek().A09(new YX(this.A01, this.A0A));
                }
            }
        } else if (j2 < 262144) {
            interfaceC0456By.AGq((int) j2);
        } else {
            c4.A00 = interfaceC0456By.A86() + j2;
            z2 = true;
        }
        A08(A86);
        return z2 && this.A03 != 2;
    }

    public static boolean A0F(I4 i4) {
        int A08;
        int majorBrand;
        i4.A0Y(8);
        int A082 = i4.A08();
        int majorBrand2 = A0M;
        if (A082 == majorBrand2) {
            return true;
        }
        i4.A0Z(4);
        do {
            int A04 = i4.A04();
            String[] strArr = A0K;
            String str = strArr[3];
            String str2 = strArr[5];
            int length = str.length();
            int majorBrand3 = str2.length();
            if (length != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "ak31gwjiZ7lchhs8qU";
            strArr2[7] = "SN9Txq6J8sCX";
            if (A04 > 0) {
                A08 = i4.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (A08 != majorBrand);
        return true;
    }

    public static long[][] A0G(C0461Cd[] c0461CdArr) {
        long[][] jArr = new long[c0461CdArr.length];
        int[] iArr = new int[c0461CdArr.length];
        long[] jArr2 = new long[c0461CdArr.length];
        boolean[] tracksFinished = new boolean[c0461CdArr.length];
        for (int i2 = 0; i2 < c0461CdArr.length; i2++) {
            jArr[i2] = new long[c0461CdArr[i2].A03.A01];
            jArr2[i2] = c0461CdArr[i2].A03.A07[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < c0461CdArr.length) {
            long j3 = Long.MAX_VALUE;
            int minTimeTrackIndex = -1;
            for (int i4 = 0; i4 < c0461CdArr.length; i4++) {
                if (!tracksFinished[i4]) {
                    long minTimeUs = jArr2[i4];
                    if (minTimeUs <= j3) {
                        minTimeTrackIndex = i4;
                        j3 = jArr2[i4];
                    }
                }
            }
            int i5 = iArr[minTimeTrackIndex];
            jArr[minTimeTrackIndex][i5] = j2;
            j2 += c0461CdArr[minTimeTrackIndex].A03.A05[i5];
            int i6 = i5 + 1;
            iArr[minTimeTrackIndex] = i6;
            if (i6 < jArr[minTimeTrackIndex].length) {
                jArr2[minTimeTrackIndex] = c0461CdArr[minTimeTrackIndex].A03.A07[i6];
            } else {
                tracksFinished[minTimeTrackIndex] = true;
                i3++;
            }
        }
        return jArr;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        long secondTimeUs;
        long j3;
        int sampleIndex;
        if (this.A0C.length == 0) {
            return new C5(C7.A04);
        }
        long j4 = -9223372036854775807L;
        long secondOffset = -1;
        int i2 = this.A02;
        if (A0K[6].length() == 10) {
            String[] strArr = A0K;
            strArr[1] = "zNPStOwPeWMWlu6U4cps5UEx93ZdGJzU";
            strArr[4] = "1Oiw5RRZUeL0D5PfWcAG5DXe0fbn2IOb";
            if (i2 != -1) {
                C0470Cm c0470Cm = this.A0C[this.A02].A03;
                int A02 = A02(c0470Cm, j2);
                if (A02 == -1) {
                    return new C5(C7.A04);
                }
                secondTimeUs = c0470Cm.A07[A02];
                j3 = c0470Cm.A06[A02];
                if (secondTimeUs < j2 && A02 < c0470Cm.A01 - 1 && (sampleIndex = c0470Cm.A01(j2)) != -1 && sampleIndex != A02) {
                    j4 = c0470Cm.A07[sampleIndex];
                    secondOffset = c0470Cm.A06[sampleIndex];
                }
            } else {
                secondTimeUs = j2;
                j3 = Long.MAX_VALUE;
            }
            for (int i3 = 0; i3 < this.A0C.length; i3++) {
                int i4 = this.A02;
                if (A0K[6].length() == 10) {
                    A0K[0] = "CBUdIpY9GLFYfu7LhTfnmGuFEDhohH6D";
                    if (i3 != i4) {
                        C0470Cm c0470Cm2 = this.A0C[i3].A03;
                        j3 = A03(c0470Cm2, secondTimeUs, j3);
                        if (j4 != -9223372036854775807L) {
                            secondOffset = A03(c0470Cm2, j4, secondOffset);
                        }
                    }
                }
            }
            C7 c7 = new C7(secondTimeUs, j3);
            if (j4 == -9223372036854775807L) {
                return new C5(c7);
            }
            return new C5(c7, new C7(j4, secondOffset));
        }
        throw new RuntimeException();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void A9D(InterfaceC0457Bz interfaceC0457Bz) {
        this.A09 = interfaceC0457Bz;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final int AEk(InterfaceC0456By interfaceC0456By, C4 c4) throws IOException, InterruptedException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (!A0D(interfaceC0456By)) {
                        return -1;
                    }
                    break;
                case 1:
                    if (!A0E(interfaceC0456By, c4)) {
                        break;
                    } else {
                        String[] strArr = A0K;
                        if (strArr[2].length() == strArr[7].length()) {
                            throw new RuntimeException();
                        }
                        A0K[6] = "Qacs7AJWJq";
                        return 1;
                    }
                case 2:
                    return A01(interfaceC0456By, c4);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final void AG7(long j2, long j3) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j2 == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0455Bx
    public final boolean AGs(InterfaceC0456By interfaceC0456By) throws IOException, InterruptedException {
        return AbstractC0465Ch.A04(interfaceC0456By);
    }
}
