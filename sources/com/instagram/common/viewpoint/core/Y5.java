package com.instagram.common.viewpoint.core;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class Y5 implements D3 {
    public static byte[] A0E;
    public static String[] A0F = {"MuM37mvTkzlYg2EyoGZNQeCtoH5o0amC", "mBjEqUiK3L9cxidSIeTlZKdFAvm", "XHnnymrKKOAQEyDjuW6Oc54SHnyt4GQm", "pkS5", "Uhg1", "yxzae7OE9DkPBU2323XK9iAPH766hQxt", "Bopy6Xk2MIHKC3K2u75K6Kfh", "uzVvOj5dUDYWkx4CAcwiCIxvqEsnaeE6"};
    public long A00;
    public long A01;
    public C9 A02;
    public D8 A03;
    public String A04;
    public boolean A05;
    public final DC A0B;
    public final boolean[] A0D = new boolean[3];
    public final D9 A0A = new D9(32, 128);
    public final D9 A08 = new D9(33, 128);
    public final D9 A06 = new D9(34, 128);
    public final D9 A07 = new D9(39, 128);
    public final D9 A09 = new D9(40, 128);
    public final I4 A0C = new I4();

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{119, 97, 101, 100, -127, -108, -112, -109, -108, -95, 114, -117, -126, -107, -115, -126, UnsignedBytes.MAX_POWER_OF_TWO, -111, -126, -127, 61, 126, -112, -115, -126, UnsignedBytes.MAX_POWER_OF_TWO, -111, 124, -113, 126, -111, -122, -116, 124, -122, -127, UnsignedBytes.MAX_POWER_OF_TWO, 61, -109, 126, -119, -110, -126, 87, 61, -79, -92, -97, -96, -86, 106, -93, -96, -79, -98};
    }

    static {
        A02();
    }

    public Y5(DC dc) {
        this.A0B = dc;
    }

    public static Format A00(String str, D9 d9, D9 d92, D9 d93) {
        byte[] csd = new byte[d9.A00 + d92.A00 + d93.A00];
        System.arraycopy(d9.A01, 0, csd, 0, d9.A00);
        System.arraycopy(d92.A01, 0, csd, d9.A00, d92.A00);
        System.arraycopy(d93.A01, 0, csd, d9.A00 + d92.A00, d93.A00);
        I5 i5 = new I5(d92.A01, 0, d92.A00);
        i5.A07(44);
        int i2 = i5.A05(3);
        i5.A06();
        i5.A07(88);
        i5.A07(8);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i5.A0A()) {
                i3 += 89;
            }
            if (i5.A0A()) {
                i3 += 8;
            }
        }
        i5.A07(i3);
        if (i2 > 0) {
            i5.A07((8 - i2) * 2);
        }
        i5.A04();
        int chromaFormatIdc = i5.A04();
        if (chromaFormatIdc == 3) {
            i5.A06();
        }
        int picHeightInLumaSamples = i5.A04();
        int confWinLeftOffset = i5.A04();
        if (i5.A0A()) {
            int toSkip = i5.A04();
            int A04 = i5.A04();
            int subHeightC = i5.A04();
            int A042 = i5.A04();
            picHeightInLumaSamples -= (toSkip + A04) * ((chromaFormatIdc == 1 || chromaFormatIdc == 2) ? 2 : 1);
            confWinLeftOffset -= (subHeightC + A042) * (chromaFormatIdc == 1 ? 2 : 1);
        }
        i5.A04();
        i5.A04();
        int A043 = i5.A04();
        for (int i6 = i5.A0A() ? 0 : i2; i6 <= i2; i6++) {
            i5.A04();
            i5.A04();
            i5.A04();
        }
        i5.A04();
        i5.A04();
        i5.A04();
        i5.A04();
        i5.A04();
        i5.A04();
        if (i5.A0A() && i5.A0A()) {
            A05(i5);
        }
        i5.A07(2);
        if (i5.A0A()) {
            i5.A07(8);
            i5.A04();
            i5.A04();
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0F[5] = "beliyUp3I";
            i5.A06();
        }
        A06(i5);
        if (i5.A0A()) {
            int log2MaxPicOrderCntLsbMinus4 = 0;
            while (true) {
                int maxSubLayersMinus1 = i5.A04();
                if (A0F[6].length() == 30) {
                    A0F[2] = "DqswfFoquAR3l8kr9ImxEhUsB68HngNw";
                    if (log2MaxPicOrderCntLsbMinus4 >= maxSubLayersMinus1) {
                        break;
                    }
                    i5.A07(A043 + 4 + 1);
                    log2MaxPicOrderCntLsbMinus4++;
                } else {
                    A0F[5] = "eP05A5uOer10TfC46mqSQX";
                    if (log2MaxPicOrderCntLsbMinus4 >= maxSubLayersMinus1) {
                        break;
                    }
                    i5.A07(A043 + 4 + 1);
                    log2MaxPicOrderCntLsbMinus4++;
                }
            }
        }
        i5.A07(2);
        float f2 = 1.0f;
        if (i5.A0A() && i5.A0A()) {
            int log2MaxPicOrderCntLsbMinus42 = i5.A05(8);
            if (log2MaxPicOrderCntLsbMinus42 == 255) {
                int A05 = i5.A05(16);
                int A052 = i5.A05(16);
                if (A05 != 0 && A052 != 0) {
                    f2 = A05 / A052;
                }
            } else {
                float[] fArr = I0.A04;
                if (A0F[5].length() == 23) {
                    throw new RuntimeException();
                }
                A0F[5] = "lNxPCo9oIuhji7Gv";
                if (log2MaxPicOrderCntLsbMinus42 < fArr.length) {
                    f2 = I0.A04[log2MaxPicOrderCntLsbMinus42];
                } else {
                    Log.w(A01(0, 10, 26), A01(10, 35, 8) + log2MaxPicOrderCntLsbMinus42);
                }
            }
        }
        return Format.A03(str, A01(45, 10, 38), null, -1, -1, picHeightInLumaSamples, confWinLeftOffset, -1.0f, Collections.singletonList(csd), -1, f2, null);
    }

    private void A03(long j2, int i2, int i3, long j3) {
        if (this.A05) {
            this.A03.A02(j2, i2);
        } else {
            D9 d9 = this.A0A;
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0F[5] = "T4Iekhb";
            d9.A04(i3);
            this.A08.A04(i3);
            this.A06.A04(i3);
            if (this.A0A.A03() && this.A08.A03() && this.A06.A03()) {
                this.A02.A69(A00(this.A04, this.A0A, this.A08, this.A06));
                this.A05 = true;
            }
        }
        boolean A04 = this.A07.A04(i3);
        if (A0F[2].charAt(9) == '6') {
            throw new RuntimeException();
        }
        A0F[5] = "5wZyobeJENeWPOGTXoMwsZ";
        if (A04) {
            this.A0C.A0b(this.A07.A01, I0.A02(this.A07.A01, this.A07.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j3, this.A0C);
        }
        if (this.A09.A04(i3)) {
            this.A0C.A0b(this.A09.A01, I0.A02(this.A09.A01, this.A09.A00));
            this.A0C.A0Z(5);
            this.A0B.A02(j3, this.A0C);
        }
    }

    private void A04(long j2, int i2, int i3, long j3) {
        if (this.A05) {
            this.A03.A03(j2, i2, i3, j3);
        } else {
            this.A0A.A01(i3);
            this.A08.A01(i3);
            D9 d9 = this.A06;
            if (A0F[2].charAt(9) == '6') {
                throw new RuntimeException();
            }
            A0F[2] = "afSaij9DosEsjnR5OQlOdYTC4yKMsCpR";
            d9.A01(i3);
        }
        this.A07.A01(i3);
        this.A09.A01(i3);
    }

    public static void A05(I5 i5) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (!i5.A0A()) {
                    i5.A04();
                } else {
                    int i6 = i2 << 1;
                    if (A0F[5].length() == 23) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0F;
                    strArr[7] = "Trv63JQRohtZ2guXV2KCLZkCXYmgTsG4";
                    strArr[0] = "BkNV2uBmbZiRokG0PRq1Sv9g32SKHwb9";
                    int sizeId = Math.min(64, 1 << (i6 + 4));
                    if (i2 > 1) {
                        i5.A03();
                    }
                    for (int i7 = 0; i7 < sizeId; i7++) {
                        i5.A03();
                    }
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    public static void A06(I5 i5) {
        int A04 = i5.A04();
        boolean z2 = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < A04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                z2 = i5.A0A();
            }
            if (z2) {
                i5.A06();
                i5.A04();
                for (int i2 = 0; i2 <= numNegativePics; i2++) {
                    if (i5.A0A()) {
                        i5.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = i5.A04();
                int A042 = i5.A04();
                numNegativePics = previousNumDeltaPocs + A042;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    i5.A04();
                    i5.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < A042; numShortTermRefPicSets2++) {
                    i5.A04();
                    i5.A06();
                }
            }
        }
    }

    private void A07(byte[] bArr, int i2, int i3) {
        if (this.A05) {
            this.A03.A04(bArr, i2, i3);
        } else {
            this.A0A.A02(bArr, i2, i3);
            this.A08.A02(bArr, i2, i3);
            this.A06.A02(bArr, i2, i3);
        }
        this.A07.A02(bArr, i2, i3);
        this.A09.A02(bArr, i2, i3);
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void A4n(I4 i4) {
        while (i4.A04() > 0) {
            int A06 = i4.A06();
            int A07 = i4.A07();
            byte[] bArr = i4.A00;
            long j2 = this.A01;
            int offset = i4.A04();
            this.A01 = j2 + offset;
            C9 c9 = this.A02;
            int offset2 = i4.A04();
            c9.AFv(i4, offset2);
            while (A06 < A07) {
                int A04 = I0.A04(bArr, A06, A07, this.A0D);
                if (A04 == A07) {
                    A07(bArr, A06, A07);
                    return;
                }
                int bytesWrittenPastPosition = I0.A00(bArr, A04);
                int i2 = A04 - A06;
                if (i2 > 0) {
                    A07(bArr, A06, A04);
                }
                int i3 = A07 - A04;
                long j3 = this.A01 - i3;
                int offset3 = i2 < 0 ? -i2 : 0;
                A03(j3, i3, offset3, this.A00);
                long absolutePosition = this.A00;
                A04(j3, i3, bytesWrittenPastPosition, absolutePosition);
                A06 = A04 + 3;
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void A5B(InterfaceC0457Bz interfaceC0457Bz, DH dh) {
        dh.A05();
        this.A04 = dh.A04();
        this.A02 = interfaceC0457Bz.AHA(dh.A03(), 2);
        this.A03 = new D8(this.A02);
        this.A0B.A03(interfaceC0457Bz, dh);
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AEL() {
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AEM(long j2, boolean z2) {
        this.A00 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.D3
    public final void AG6() {
        I0.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
