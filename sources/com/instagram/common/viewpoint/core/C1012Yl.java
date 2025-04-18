package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1012Yl extends CB {
    public static byte[] A03;
    public static String[] A04 = {"MnTWdM951NB9oGZP1CG5NnsEhYkCP8", "QwDeTs5q5za0qdY1WSe6ueQXGLdkg1", "4hJcjZyrIsJZOfYEUT6M4WEUSoiIDuHg", "NvyqI", "", "Uqt6HMzeyzNifd1RtwNGpM3hobOoUr", "fLwJP1YzFTUDRZVnEKYJl9lrW81R6C9X", "EFwXkzThb6vd1QA63LYXRhbBlUe2cUJO"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-119, -67, -84, -79, -73, 104, -82, -73, -70, -75, -87, -68, 104, -74, -73, -68, 104, -69, -67, -72, -72, -73, -70, -68, -83, -84, -126, 104, -111, -91, -108, -103, -97, 95, -105, 103, 97, 97, 93, -111, -100, -111, -89, -36, -16, -33, -28, -22, -86, -30, -78, -84, -84, -88, -24, -25, -36, -14, -56, -36, -53, -48, -42, -106, -44, -41, -101, -56, -108, -45, -56, -37, -44, -51, -31, -48, -43, -37, -101, -39, -36, -47, -45};
        if (A04[5].length() == 9) {
            throw new RuntimeException();
        }
        A04[5] = "9Qu4otgkdq";
        A03 = bArr;
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C1012Yl(C9 c9) {
        super(c9);
    }

    @Override // com.instagram.common.viewpoint.core.CB
    public final void A0B(I4 i4, long j2) throws A0 {
        if (this.A00 == 2) {
            int A042 = i4.A04();
            super.A00.AFv(i4, A042);
            super.A00.AFw(j2, 1, A042, 0, null);
            return;
        }
        int A0E = i4.A0E();
        if (A0E == 0 && !this.A01) {
            byte[] audioSpecificConfig = new byte[i4.A04()];
            i4.A0c(audioSpecificConfig, 0, audioSpecificConfig.length);
            Pair<Integer, Integer> A032 = AbstractC0580Hj.A03(audioSpecificConfig);
            super.A00.A69(Format.A07(null, A00(58, 15, 73), null, -1, -1, ((Integer) A032.second).intValue(), ((Integer) A032.first).intValue(), Collections.singletonList(audioSpecificConfig), null, 0, null));
            this.A01 = true;
            return;
        }
        int packetType = this.A00;
        if (packetType == 10 && A0E != 1) {
            return;
        }
        int A043 = i4.A04();
        super.A00.AFv(i4, A043);
        C9 c9 = super.A00;
        String[] strArr = A04;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[3] = "TTtvmK8O9EcovWjyT7nUIaB";
        c9.AFw(j2, 1, A043, 0, null);
    }

    @Override // com.instagram.common.viewpoint.core.CB
    public final boolean A0C(I4 i4) throws C1008Yh {
        String A00;
        if (!this.A02) {
            int A0E = i4.A0E();
            this.A00 = (A0E >> 4) & 15;
            if (this.A00 == 2) {
                int sampleRateIndex = (A0E >> 2) & 3;
                super.A00.A69(Format.A07(null, A00(73, 10, 78), null, -1, -1, 1, A05[sampleRateIndex], null, null, 0, null));
                this.A01 = true;
            } else if (this.A00 == 7 || this.A00 == 8) {
                if (this.A00 != 7) {
                    A00 = A00(43, 15, 93);
                } else {
                    if (A04[4].length() == 10) {
                        throw new RuntimeException();
                    }
                    A04[4] = "pIVu";
                    A00 = A00(28, 15, 18);
                }
                Format format = Format.A06(null, A00, null, -1, -1, 1, 8000, (A0E & 1) == 1 ? 2 : 3, null, null, 0, null);
                super.A00.A69(format);
                this.A01 = true;
            } else if (this.A00 != 10) {
                throw new C1008Yh(A00(0, 28, 42) + this.A00);
            }
            this.A02 = true;
        } else {
            i4.A0Z(1);
        }
        return true;
    }
}
