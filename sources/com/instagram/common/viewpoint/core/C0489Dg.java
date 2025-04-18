package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dg */
/* loaded from: assets/audience_network.dex */
public final class C0489Dg implements XU, InterfaceC0457Bz, HB<XY>, HE, FF {
    public static byte[] A0c;
    public static String[] A0d = {"peLU6GbomQp3KTDTEO6fFbGDd5YKfbx5", "7mT0mr2NYOE5sZhPJJhz2OZpyXxRGG9d", "UXLPIbz1b38T7IFge1hDzhsuoxMK7yBR", "gCShhPyLIj5hpfUfS", "XuIiTKqZqLFDSY9gTXO0Gx3LpXWUQlMf", "5IJgqt6", "EtcMKAz9SJVscvNDduv2RLMG0vWKtUvv", "0mgYyHLWy1r45Lytf"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C6 A07;
    public XV A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final C0518Ep A0S;
    public final InterfaceC0519Eq A0T;
    public final F6 A0U;
    public final InterfaceC0562Gr A0V;
    public final InterfaceC0570Gz A0W;
    public final String A0b;
    public final C0973Wv A0X = new C0973Wv(A07(0, 27, 38));
    public final C0582Hl A0Y = new C0582Hl();
    public final Runnable A0Z = new En(this);
    public final Runnable A0a = new Eo(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public XT[] A0K = new XT[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{30, 61, 51, 54, 55, 32, 104, 23, 42, 38, 32, 51, 49, 38, 61, 32, 31, 55, 54, 59, 51, 2, 55, 32, 59, 61, 54};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.XU
    public final long AGC(InterfaceC0556Gl[] interfaceC0556GlArr, boolean[] zArr, FG[] fgArr, boolean[] zArr2, long j2) {
        int i2;
        int i3;
        AbstractC0576Hf.A04(this.A0F);
        int i4 = this.A01;
        int i5 = 0;
        while (true) {
            i2 = 0;
            if (i5 >= interfaceC0556GlArr.length) {
                break;
            }
            if (fgArr[i5] != null && (interfaceC0556GlArr[i5] == null || !zArr[i5])) {
                i3 = ((XX) fgArr[i5]).A00;
                AbstractC0576Hf.A04(this.A0L[i3]);
                this.A01--;
                this.A0L[i3] = false;
                fgArr[i5] = null;
            }
            i5++;
        }
        boolean z2 = !this.A0I ? j2 == 0 : i4 != 0;
        for (int i6 = 0; i6 < interfaceC0556GlArr.length; i6++) {
            if (fgArr[i6] == null && interfaceC0556GlArr[i6] != null) {
                InterfaceC0556Gl interfaceC0556Gl = interfaceC0556GlArr[i6];
                AbstractC0576Hf.A04(interfaceC0556Gl.length() == 1);
                AbstractC0576Hf.A04(interfaceC0556Gl.A7a(0) == 0);
                int A00 = this.A09.A00(interfaceC0556Gl.A8Y());
                AbstractC0576Hf.A04(!this.A0L[A00]);
                this.A01++;
                this.A0L[A00] = true;
                fgArr[i6] = new XX(this, A00);
                zArr2[i6] = true;
                if (!z2) {
                    XT xt = this.A0K[A00];
                    xt.A0J();
                    z2 = xt.A0D(j2, true, true) == -1 && xt.A0B() != 0;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0E = false;
            this.A0D = false;
            if (this.A0X.A08()) {
                XT[] xtArr = this.A0K;
                int length = xtArr.length;
                while (i2 < length) {
                    xtArr[i2].A0H();
                    i2++;
                }
                this.A0X.A05();
            } else {
                XT[] xtArr2 = this.A0K;
                int length2 = xtArr2.length;
                while (i2 < length2) {
                    xtArr2[i2].A0I();
                    i2++;
                }
            }
        } else if (z2) {
            j2 = AGB(j2);
            for (int i7 = 0; i7 < fgArr.length; i7++) {
                if (fgArr[i7] != null) {
                    zArr2[i7] = true;
                }
            }
        }
        this.A0I = true;
        return j2;
    }

    static {
        A0B();
    }

    public C0489Dg(Uri uri, InterfaceC0570Gz interfaceC0570Gz, InterfaceC0455Bx[] interfaceC0455BxArr, int i2, F6 f6, InterfaceC0519Eq interfaceC0519Eq, InterfaceC0562Gr interfaceC0562Gr, String str, int i3) {
        this.A0Q = uri;
        this.A0W = interfaceC0570Gz;
        this.A0O = i2;
        this.A0U = f6;
        this.A0T = interfaceC0519Eq;
        this.A0V = interfaceC0562Gr;
        this.A0b = str;
        this.A0P = i3;
        this.A0S = new C0518Ep(interfaceC0455BxArr, this);
        this.A00 = i2 == -1 ? 3 : i2;
        f6.A03();
    }

    private int A00() {
        int i2 = 0;
        for (XT xt : this.A0K) {
            int extractedSamplesCount = xt.A0C();
            i2 += extractedSamplesCount;
        }
        return i2;
    }

    @Override // com.instagram.common.viewpoint.core.HB
    /* renamed from: A01 */
    public final int ACT(XY xy, long j2, long j3, IOException iOException) {
        H3 h3;
        long j4;
        long j5;
        boolean isErrorFatal = A0N(iOException);
        F6 f6 = this.A0U;
        h3 = xy.A03;
        j4 = xy.A02;
        long j6 = this.A03;
        j5 = xy.A00;
        f6.A0H(h3, 1, -1, null, 0, null, j4, j6, j2, j3, j5, iOException, isErrorFatal);
        A0E(xy);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean madeProgress = A00 > this.A02;
        if (A0L(xy, A00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long j2 = Long.MIN_VALUE;
        for (XT xt : this.A0K) {
            long largestQueuedTimestampUs = xt.A0F();
            j2 = Math.max(j2, largestQueuedTimestampUs);
        }
        return j2;
    }

    public void A09() {
        if (this.A0G) {
            return;
        }
        boolean z2 = this.A0F;
        if (A0d[5].length() != 14) {
            A0d[1] = "ZlqthdC5a5V1gMLl5Bq31xGEZ23V1gO9";
            if (z2 || this.A07 == null || !this.A0H) {
                return;
            }
            for (XT xt : this.A0K) {
                if (xt.A0G() == null) {
                    return;
                }
            }
            this.A0Y.A01();
            int length = this.A0K.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length];
            this.A0N = new boolean[length];
            this.A0L = new boolean[length];
            this.A0M = new boolean[length];
            this.A03 = this.A07.A7F();
            int i2 = 0;
            while (true) {
                boolean z3 = true;
                if (i2 < length) {
                    Format A0G = this.A0K[i2].A0G();
                    trackGroupArr[i2] = new TrackGroup(A0G);
                    String str = A0G.A0O;
                    if (!AbstractC0594Hx.A0B(str)) {
                        boolean A09 = AbstractC0594Hx.A09(str);
                        String[] strArr = A0d;
                        String str2 = strArr[2];
                        String str3 = strArr[0];
                        int charAt = str2.charAt(13);
                        int trackCount = str3.charAt(13);
                        if (charAt == trackCount) {
                            break;
                        }
                        A0d[5] = "wjlt";
                        if (!A09) {
                            z3 = false;
                        }
                    }
                    this.A0N[i2] = z3;
                    this.A0A |= z3;
                    i2++;
                } else {
                    this.A09 = new TrackGroupArray(trackGroupArr);
                    if (this.A0O == -1 && this.A05 == -1 && this.A07.A7F() == -9223372036854775807L) {
                        if (A0d[1].charAt(24) != 'Q') {
                            String[] strArr2 = A0d;
                            strArr2[7] = "bvBqSLHYyRK7T41Ph";
                            strArr2[3] = "q1iL5o2Amc4Ds9Lvm";
                            this.A00 = 6;
                        } else {
                            A0d[5] = "4JTtgCqRPlniUROX";
                            this.A00 = 6;
                        }
                    }
                    this.A0F = true;
                    this.A0T.ADc(this.A03, this.A07.A9h());
                    this.A08.ADC(this);
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A0A() {
        H3 h3;
        long j2;
        XY xy = new XY(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            AbstractC0576Hf.A04(A0I());
            if (this.A03 != -9223372036854775807L) {
                long j3 = this.A06;
                long j4 = this.A03;
                if (A0d[5].length() == 14) {
                    throw new RuntimeException();
                }
                String[] strArr = A0d;
                strArr[4] = "EEVowzvPGAuoS8G3kXEqEFrH8fWZZ317";
                strArr[6] = "VR26HTJrPSZGT1wLH8eUhUMOdoWDO7dv";
                if (j3 >= j4) {
                    this.A0B = true;
                    this.A06 = -9223372036854775807L;
                    return;
                }
            }
            xy.A04(this.A07.A8H(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(xy, this, this.A00);
        F6 f6 = this.A0U;
        h3 = xy.A03;
        j2 = xy.A02;
        f6.A0E(h3, 1, -1, null, 0, null, j2, this.A03, A04);
    }

    private void A0C(int i2) {
        if (!this.A0M[i2]) {
            Format A01 = this.A09.A01(i2).A01(0);
            this.A0U.A06(AbstractC0594Hx.A01(A01.A0O), A01, 0, null, this.A04);
            this.A0M[i2] = true;
        }
    }

    private void A0D(int i2) {
        if (!this.A0E || !this.A0N[i2] || this.A0K[i2].A0M()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (XT xt : this.A0K) {
            xt.A0I();
        }
        this.A08.ABd(this);
    }

    private void A0E(XY xy) {
        long j2;
        if (this.A05 != -1) {
            return;
        }
        j2 = xy.A01;
        this.A05 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.HB
    /* renamed from: A0F */
    public final void ACS(XY xy, long j2, long j3) {
        H3 h3;
        long j4;
        long j5;
        long j6;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                j6 = 0;
            } else {
                j6 = 10000 + A02;
            }
            this.A03 = j6;
            this.A0T.ADc(this.A03, this.A07.A9h());
        }
        F6 f6 = this.A0U;
        h3 = xy.A03;
        j4 = xy.A02;
        long j7 = this.A03;
        j5 = xy.A00;
        f6.A0G(h3, 1, -1, null, 0, null, j4, j7, j2, j3, j5);
        A0E(xy);
        this.A0B = true;
        this.A08.ABd(this);
    }

    @Override // com.instagram.common.viewpoint.core.HB
    /* renamed from: A0G */
    public final void ACQ(XY xy, long j2, long j3, boolean z2) {
        H3 h3;
        long j4;
        long j5;
        F6 f6 = this.A0U;
        h3 = xy.A03;
        j4 = xy.A02;
        long j6 = this.A03;
        j5 = xy.A00;
        f6.A0F(h3, 1, -1, null, 0, null, j4, j6, j2, j3, j5);
        if (!z2) {
            A0E(xy);
            for (XT xt : this.A0K) {
                xt.A0I();
            }
            if (this.A01 > 0) {
                this.A08.ABd(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j2) {
        int length = this.A0K.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return true;
            }
            XT xt = this.A0K[i2];
            xt.A0J();
            int i3 = xt.A0D(j2, true, false);
            if ((i3 != -1) || (!this.A0N[i2] && this.A0A)) {
                i2++;
            }
        }
        return false;
    }

    private boolean A0L(XY xy, int i2) {
        if (this.A05 != -1 || (this.A07 != null && this.A07.A7F() != -9223372036854775807L)) {
            this.A02 = i2;
            if (A0d[5].length() != 14) {
                A0d[1] = "skDgVB0Ht0zuzgTIxTUQ6nUZxrKrp9x6";
                return true;
            }
        } else {
            if (this.A0F && !A0J()) {
                this.A0E = true;
                return false;
            }
            this.A0D = this.A0F;
            this.A04 = 0L;
            this.A02 = 0;
            for (XT xt : this.A0K) {
                xt.A0I();
                String[] strArr = A0d;
                if (strArr[4].charAt(26) == strArr[6].charAt(26)) {
                    String[] strArr2 = A0d;
                    strArr2[7] = "KZ8GDv2dcd7yDyxHm";
                    strArr2[3] = "atXiisDnWt347KW7D";
                }
            }
            xy.A04(0L, 0L);
            return true;
        }
        throw new RuntimeException();
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof XR;
    }

    public final int A0O(int i2, long j2) {
        int skipCount;
        if (A0J()) {
            return 0;
        }
        XT xt = this.A0K[i2];
        if (this.A0B && j2 > xt.A0F()) {
            skipCount = xt.A0A();
        } else {
            skipCount = xt.A0D(j2, true, true);
            if (skipCount == -1) {
                skipCount = 0;
            }
        }
        if (skipCount > 0) {
            A0C(i2);
        } else {
            A0D(i2);
        }
        return skipCount;
    }

    public final int A0P(int i2, C04029u c04029u, C1023Yw c1023Yw, boolean z2) {
        if (A0J()) {
            return -3;
        }
        XT xt = this.A0K[i2];
        String[] strArr = A0d;
        if (strArr[4].charAt(26) != strArr[6].charAt(26)) {
            throw new RuntimeException();
        }
        A0d[1] = "CFUr7kPjUmptptxTmpAlPyDYAkhTIB3I";
        int A0E = xt.A0E(c04029u, c1023Yw, z2, this.A0B, this.A04);
        if (A0E == -4) {
            A0C(i2);
        } else if (A0E == -3) {
            A0D(i2);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (XT xt : this.A0K) {
                xt.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i2) {
        return !A0J() && (this.A0B || this.A0K[i2].A0M());
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final boolean A4p(long j2) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean A02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return A02;
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final void A5W(long j2, boolean z2) {
        int length = this.A0K.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.A0K[i2].A0K(j2, z2, this.A0L[i2]);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0457Bz
    public final void A5u() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long A6L(long j2, AI ai) {
        if (!this.A07.A9h()) {
            return 0L;
        }
        C5 A8H = this.A07.A8H(j2);
        return IK.A0I(j2, ai, A8H.A00.A01, A8H.A01.A01);
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long A6b() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            return this.A06;
        }
        if (this.A0A) {
            A02 = Long.MAX_VALUE;
            int i2 = this.A0K.length;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.A0N[i3]) {
                    A02 = Math.min(A02, this.A0K[i3].A0F());
                }
            }
        } else {
            A02 = A02();
        }
        if (A02 == Long.MIN_VALUE) {
            return this.A04;
        }
        return A02;
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long A7s() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A6b();
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final TrackGroupArray A8Z() {
        return this.A09;
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final void AAn() throws IOException {
        A0Q();
    }

    @Override // com.instagram.common.viewpoint.core.HE
    public final void ACX() {
        for (XT xt : this.A0K) {
            xt.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.instagram.common.viewpoint.core.FF
    public final void ADv(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final void AEX(XV xv, long j2) {
        this.A08 = xv;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long AEo() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        if (this.A0D) {
            if (!this.A0B && A00() <= this.A02) {
                return -9223372036854775807L;
            }
            String[] strArr = A0d;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[4] = "8QQskbS2Pw4utxbEv0LyYmP5VjWpvONg";
            strArr2[6] = "uwG3ZIcw3rm7jy9KlanJYK16xJWMutQx";
            this.A0D = false;
            return this.A04;
        }
        return -9223372036854775807L;
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final void AEu(long j2) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0457Bz
    public final void AG8(C6 c6) {
        this.A07 = c6;
        this.A0R.post(this.A0Z);
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long AGB(long j2) {
        if (!this.A07.A9h()) {
            j2 = 0;
        }
        this.A04 = j2;
        this.A0D = false;
        if (!A0I() && A0K(j2)) {
            return j2;
        }
        this.A0E = false;
        this.A06 = j2;
        this.A0B = false;
        if (this.A0X.A08()) {
            C0973Wv c0973Wv = this.A0X;
            if (A0d[5].length() == 14) {
                throw new RuntimeException();
            }
            A0d[1] = "E7sj14dZL93fqj6GUgSTTa20SijXvEHd";
            c0973Wv.A05();
        } else {
            for (XT xt : this.A0K) {
                xt.A0I();
            }
        }
        return j2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0457Bz
    public final C9 AHA(int i2, int i3) {
        int length = this.A0K.length;
        for (int i4 = 0; i4 < length; i4++) {
            int trackCount = this.A0J[i4];
            if (trackCount == i2) {
                return this.A0K[i4];
            }
        }
        XT xt = new XT(this.A0V);
        xt.A0L(this);
        int trackCount2 = length + 1;
        this.A0J = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J[length] = i2;
        int trackCount3 = length + 1;
        this.A0K = (XT[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K[length] = xt;
        return xt;
    }
}
