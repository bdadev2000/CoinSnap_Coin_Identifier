package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class CD implements WP, InterfaceC1076Bu, H6<WT>, H9, FA {
    public static byte[] A0c;
    public static String[] A0d = {"uM3", "HhtEoeszujhq2hqW803X6wAUFNr2yIvk", "llgRlYE2HHrDKVr9Tlv1gg4sawaKL", "gd26Zevc0BeMQVnsPvgEWj4kMHitbDqE", "B56DgxYfwXnRdFUWoxgY8ZwWxUmrPQlR", "o6X9hbG4Io42IRbcZylLcsRNIhbJFPRA", "SBfu1SOz9uKNnyoy8", "5PtJb97AhuhjIJJCziWFyl83Esr9CMYA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C1 A07;
    public WQ A08;
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
    public final C1128Ek A0S;
    public final InterfaceC1129El A0T;
    public final F1 A0U;
    public final InterfaceC1179Gm A0V;
    public final InterfaceC1187Gu A0W;
    public final String A0b;
    public final C1564Vq A0X = new C1564Vq(A07(0, 27, 27));
    public final C1198Hg A0Y = new C1198Hg();
    public final Runnable A0Z = new RunnableC1126Ei(this);
    public final Runnable A0a = new RunnableC1127Ej(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public WO[] A0K = new WO[0];
    public long A06 = C.TIME_UNSET;
    public long A05 = -1;
    public long A03 = C.TIME_UNSET;

    public static String A07(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{78, 109, 99, 102, 103, 112, 56, 71, 122, 118, 112, 99, 97, 118, 109, 112, 79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.meta.analytics.dsp.uinode.WP
    public final long AFm(InterfaceC1173Gg[] interfaceC1173GgArr, boolean[] zArr, FB[] fbArr, boolean[] zArr2, long j7) {
        int i9;
        AbstractC1192Ha.A04(this.A0F);
        int i10 = this.A01;
        int i11 = 0;
        while (true) {
            int i12 = 0;
            if (i11 >= interfaceC1173GgArr.length) {
                boolean z8 = !this.A0I ? j7 == 0 : i10 != 0;
                for (int i13 = 0; i13 < interfaceC1173GgArr.length; i13++) {
                    if (fbArr[i13] == null && interfaceC1173GgArr[i13] != null) {
                        InterfaceC1173Gg interfaceC1173Gg = interfaceC1173GgArr[i13];
                        AbstractC1192Ha.A04(interfaceC1173Gg.length() == 1);
                        AbstractC1192Ha.A04(interfaceC1173Gg.A7C(0) == 0);
                        int A00 = this.A09.A00(interfaceC1173Gg.A8A());
                        AbstractC1192Ha.A04(!this.A0L[A00]);
                        this.A01++;
                        this.A0L[A00] = true;
                        fbArr[i13] = new WS(this, A00);
                        zArr2[i13] = true;
                        if (!z8) {
                            WO wo = this.A0K[A00];
                            wo.A0J();
                            z8 = wo.A0D(j7, true, true) == -1 && wo.A0B() != 0;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0E = false;
                    this.A0D = false;
                    if (this.A0X.A08()) {
                        WO[] woArr = this.A0K;
                        int length = woArr.length;
                        while (i12 < length) {
                            woArr[i12].A0H();
                            i12++;
                        }
                        this.A0X.A05();
                    } else {
                        WO[] woArr2 = this.A0K;
                        int length2 = woArr2.length;
                        while (i12 < length2) {
                            woArr2[i12].A0I();
                            i12++;
                        }
                    }
                } else if (z8) {
                    j7 = AFl(j7);
                    for (int i14 = 0; i14 < fbArr.length; i14++) {
                        if (fbArr[i14] != null) {
                            zArr2[i14] = true;
                        }
                    }
                }
                this.A0I = true;
                return j7;
            }
            FB fb = fbArr[i11];
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            A0d[2] = "mg4ta7ka0nUwB4FGZ9fOP";
            if (fb != null && (interfaceC1173GgArr[i11] == null || !zArr[i11])) {
                i9 = ((WS) fbArr[i11]).A00;
                AbstractC1192Ha.A04(this.A0L[i9]);
                this.A01--;
                this.A0L[i9] = false;
                fbArr[i11] = null;
            }
            i11++;
        }
    }

    static {
        A0B();
    }

    public CD(Uri uri, InterfaceC1187Gu interfaceC1187Gu, InterfaceC1074Bs[] interfaceC1074BsArr, int i9, F1 f12, InterfaceC1129El interfaceC1129El, InterfaceC1179Gm interfaceC1179Gm, String str, int i10) {
        this.A0Q = uri;
        this.A0W = interfaceC1187Gu;
        this.A0O = i9;
        this.A0U = f12;
        this.A0T = interfaceC1129El;
        this.A0V = interfaceC1179Gm;
        this.A0b = str;
        this.A0P = i10;
        this.A0S = new C1128Ek(interfaceC1074BsArr, this);
        this.A00 = i9 == -1 ? 3 : i9;
        f12.A03();
    }

    private int A00() {
        int i9 = 0;
        for (WO wo : this.A0K) {
            int extractedSamplesCount = wo.A0C();
            i9 += extractedSamplesCount;
        }
        return i9;
    }

    @Override // com.meta.analytics.dsp.uinode.H6
    /* renamed from: A01 */
    public final int AC2(WT wt, long j7, long j9, IOException iOException) {
        C1191Gy c1191Gy;
        long j10;
        long j11;
        boolean isErrorFatal = A0N(iOException);
        F1 f12 = this.A0U;
        c1191Gy = wt.A03;
        j10 = wt.A02;
        long j12 = this.A03;
        j11 = wt.A00;
        f12.A0H(c1191Gy, 1, -1, null, 0, null, j10, j12, j7, j9, j11, iOException, isErrorFatal);
        A0E(wt);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean madeProgress = A00 > this.A02;
        if (A0L(wt, A00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long j7 = Long.MIN_VALUE;
        for (WO wo : this.A0K) {
            long largestQueuedTimestampUs = wo.A0F();
            j7 = Math.max(j7, largestQueuedTimestampUs);
        }
        return j7;
    }

    public void A09() {
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (WO wo : this.A0K) {
            if (wo.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6r();
        int i9 = 0;
        while (true) {
            boolean isAudioVideo = true;
            if (i9 >= length) {
                break;
            }
            Format A0G = this.A0K[i9].A0G();
            trackGroupArr[i9] = new TrackGroup(A0G);
            String str = A0G.A0O;
            if (!AbstractC1210Hs.A0B(str) && !AbstractC1210Hs.A09(str)) {
                isAudioVideo = false;
            }
            this.A0N[i9] = isAudioVideo;
            this.A0A |= isAudioVideo;
            i9++;
        }
        this.A09 = new TrackGroupArray(trackGroupArr);
        if (this.A0O == -1 && this.A05 == -1 && this.A07.A6r() == C.TIME_UNSET) {
            String[] strArr = A0d;
            String str2 = strArr[4];
            String str3 = strArr[5];
            int charAt = str2.charAt(19);
            int trackCount = str3.charAt(19);
            if (charAt == trackCount) {
                throw new RuntimeException();
            }
            A0d[2] = "7a3gC0RfnKvRSexgB6r2d4KLSEZ";
            this.A00 = 6;
        }
        this.A0F = true;
        this.A0T.AD9(this.A03, this.A07.A9I());
        this.A08.ACj(this);
    }

    private void A0A() {
        C1191Gy c1191Gy;
        long j7;
        WT wt = new WT(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            AbstractC1192Ha.A04(A0I());
            long j9 = this.A03;
            if (j9 != C.TIME_UNSET && this.A06 >= j9) {
                this.A0B = true;
                this.A06 = C.TIME_UNSET;
                return;
            } else {
                wt.A04(this.A07.A7t(this.A06).A00.A00, this.A06);
                this.A06 = C.TIME_UNSET;
            }
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(wt, this, this.A00);
        F1 f12 = this.A0U;
        c1191Gy = wt.A03;
        j7 = wt.A02;
        f12.A0E(c1191Gy, 1, -1, null, 0, null, j7, this.A03, A04);
    }

    private void A0C(int i9) {
        if (!this.A0M[i9]) {
            Format A01 = this.A09.A01(i9).A01(0);
            this.A0U.A06(AbstractC1210Hs.A01(A01.A0O), A01, 0, null, this.A04);
            boolean[] zArr = this.A0M;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            A0d[2] = "eh27oOHcwVOmHzYfi8kDTS";
            zArr[i9] = true;
        }
    }

    private void A0D(int i9) {
        if (this.A0E && this.A0N[i9] && !this.A0K[i9].A0M()) {
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "sgNFiq5UDquEcD4Be";
            strArr2[0] = "0a9";
            this.A06 = 0L;
            this.A0E = false;
            this.A0D = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (WO wo : this.A0K) {
                wo.A0I();
            }
            this.A08.ABC(this);
        }
    }

    private void A0E(WT wt) {
        long j7;
        if (this.A05 != -1) {
            return;
        }
        j7 = wt.A01;
        this.A05 = j7;
    }

    @Override // com.meta.analytics.dsp.uinode.H6
    /* renamed from: A0F */
    public final void AC1(WT wt, long j7, long j9) {
        C1191Gy c1191Gy;
        long j10;
        long j11;
        long j12;
        if (this.A03 == C.TIME_UNSET) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = 10000 + A02;
            }
            this.A03 = j12;
            this.A0T.AD9(j12, this.A07.A9I());
        }
        F1 f12 = this.A0U;
        c1191Gy = wt.A03;
        j10 = wt.A02;
        long j13 = this.A03;
        j11 = wt.A00;
        f12.A0G(c1191Gy, 1, -1, null, 0, null, j10, j13, j7, j9, j11);
        A0E(wt);
        this.A0B = true;
        this.A08.ABC(this);
    }

    @Override // com.meta.analytics.dsp.uinode.H6
    /* renamed from: A0G */
    public final void ABz(WT wt, long j7, long j9, boolean z8) {
        C1191Gy c1191Gy;
        long j10;
        long j11;
        F1 f12 = this.A0U;
        c1191Gy = wt.A03;
        j10 = wt.A02;
        long j12 = this.A03;
        j11 = wt.A00;
        f12.A0F(c1191Gy, 1, -1, null, 0, null, j10, j12, j7, j9, j11);
        if (!z8) {
            A0E(wt);
            for (WO wo : this.A0K) {
                wo.A0I();
            }
            if (this.A01 > 0) {
                this.A08.ABC(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != C.TIME_UNSET;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j7) {
        int length = this.A0K.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                return true;
            }
            WO wo = this.A0K[i9];
            wo.A0J();
            int i10 = wo.A0D(j7, true, false);
            boolean seekInsideQueue = i10 != -1;
            if (!seekInsideQueue) {
                if (this.A0N[i9]) {
                    break;
                }
                boolean z8 = this.A0A;
                String[] strArr = A0d;
                String str = strArr[4];
                String str2 = strArr[5];
                int i11 = str.charAt(19);
                int trackCount = str2.charAt(19);
                if (i11 == trackCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0d;
                strArr2[7] = "iCn5X7g6PoYVWCe4GwpQYWYt9drfTGBT";
                strArr2[1] = "IDd3eJ2NBG0wgz78gdspZyWtrcrofueQ";
                if (!z8) {
                    break;
                }
            }
            i9++;
        }
        return false;
    }

    private boolean A0L(WT wt, int i9) {
        C1 c12;
        if (this.A05 != -1 || ((c12 = this.A07) != null && c12.A6r() != C.TIME_UNSET)) {
            this.A02 = i9;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[6] = "F1SGTXFlfQdsRtCv2";
            strArr[0] = "c29";
            return true;
        }
        if (this.A0F && !A0J()) {
            this.A0E = true;
            return false;
        }
        this.A0D = this.A0F;
        this.A04 = 0L;
        this.A02 = 0;
        for (WO wo : this.A0K) {
            wo.A0I();
        }
        wt.A04(0L, 0L);
        return true;
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof WM;
    }

    public final int A0O(int i9, long j7) {
        int A0D;
        if (A0J()) {
            return 0;
        }
        WO wo = this.A0K[i9];
        if (this.A0B && j7 > wo.A0F()) {
            A0D = wo.A0A();
        } else {
            A0D = wo.A0D(j7, true, true);
            String[] strArr = A0d;
            String str = strArr[4];
            String str2 = strArr[5];
            int skipCount = str.charAt(19);
            if (skipCount == str2.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "NIYG9FQCzFZSe10IE";
            strArr2[0] = "6cN";
            if (A0D == -1) {
                A0D = 0;
            }
        }
        if (A0D > 0) {
            A0C(i9);
        } else {
            A0D(i9);
        }
        return A0D;
    }

    public final int A0P(int i9, C10199p c10199p, C1614Xr c1614Xr, boolean z8) {
        if (A0J()) {
            return -3;
        }
        int A0E = this.A0K[i9].A0E(c10199p, c1614Xr, z8, this.A0B, this.A04);
        if (A0E == -4) {
            A0C(i9);
        } else if (A0E == -3) {
            A0D(i9);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (WO wo : this.A0K) {
                wo.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i9) {
        return !A0J() && (this.A0B || this.A0K[i9].A0M());
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final boolean A4T(long j7) {
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

    @Override // com.meta.analytics.dsp.uinode.WP
    public final void A5A(long j7, boolean z8) {
        int length = this.A0K.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.A0K[i9].A0K(j7, z8, this.A0L[i9]);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1076Bu
    public final void A5Y() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long A5x(long j7, AD ad) {
        if (!this.A07.A9I()) {
            return 0L;
        }
        C0 A7t = this.A07.A7t(j7);
        return IF.A0I(j7, ad, A7t.A00.A01, A7t.A01.A01);
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long A6D() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j7 = this.A06;
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A0d[3] = "ld4wWqv9tK9nTvU7QEEl8vpde5wWqGSi";
            return j7;
        }
        if (this.A0A) {
            A02 = Long.MAX_VALUE;
            int i9 = this.A0K.length;
            for (int i10 = 0; i10 < i9; i10++) {
                if (this.A0N[i10]) {
                    A02 = Math.min(A02, this.A0K[i10].A0F());
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

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long A7U() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A6D();
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final TrackGroupArray A8B() {
        return this.A09;
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final void AAN() throws IOException {
        A0Q();
    }

    @Override // com.meta.analytics.dsp.uinode.H9
    public final void AC6() {
        for (WO wo : this.A0K) {
            wo.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.meta.analytics.dsp.uinode.FA
    public final void ADS(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final void AE4(WQ wq, long j7) {
        this.A08 = wq;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long AEL() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        boolean z8 = this.A0D;
        String[] strArr = A0d;
        if (strArr[6].length() != strArr[0].length()) {
            A0d[2] = "";
            if (z8 && (this.A0B || A00() > this.A02)) {
                this.A0D = false;
                return this.A04;
            }
            String[] strArr2 = A0d;
            if (strArr2[7].charAt(26) == strArr2[1].charAt(26)) {
                String[] strArr3 = A0d;
                strArr3[4] = "a8TiTKBNhx8jXxPRrcAgh1BUcIw96G2f";
                strArr3[5] = "NHpS1UqcJuZi4hHtySMRiLK65X8yfSYb";
                return C.TIME_UNSET;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final void AER(long j7) {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1076Bu
    public final void AFi(C1 c12) {
        this.A07 = c12;
        this.A0R.post(this.A0Z);
    }

    @Override // com.meta.analytics.dsp.uinode.WP
    public final long AFl(long j7) {
        if (!this.A07.A9I()) {
            j7 = 0;
        }
        this.A04 = j7;
        this.A0D = false;
        if (!A0I()) {
            boolean A0K = A0K(j7);
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[4] = "4t4h1X84Q9aXzP6i3O1IFqP61fZwJyic";
            strArr2[5] = "YchhDxV7HDCpyjRy2lVbypcIuIxdt4SR";
            if (A0K) {
                return j7;
            }
        }
        this.A0E = false;
        this.A06 = j7;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (WO wo : this.A0K) {
                wo.A0I();
            }
        }
        return j7;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1076Bu
    public final C4 AGi(int i9, int i10) {
        int length = this.A0K.length;
        for (int i11 = 0; i11 < length; i11++) {
            int trackCount = this.A0J[i11];
            if (trackCount == i9) {
                return this.A0K[i11];
            }
        }
        WO wo = new WO(this.A0V);
        wo.A0L(this);
        int trackCount2 = length + 1;
        int[] copyOf = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J = copyOf;
        copyOf[length] = i9;
        int trackCount3 = length + 1;
        WO[] woArr = (WO[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K = woArr;
        woArr[length] = wo;
        return wo;
    }
}
