package com.meta.analytics.dsp.uinode;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1603Xg extends C6 {
    public static byte[] A03;
    public static String[] A04 = {"NGxGYCc4p5LcUzQMJWyw5DiDSRjOQe9F", "UCFVtk8FFiQwlTHXhlKlMorjx3xQRwUs", "gTYsvz0mqVjOzoMK", "3KonftsBU2Jf7i08alR6FL8DBvSTG56H", "D2cphfoCJeCyY12qt8LourkPjJ4neP20", "nKjfLlw2BnKut4cvipNa", "Z1RdCfwuszFRU44UcECPMtJ2BxVCI0wR", ""};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[6].charAt(5) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "nNsRewLEUEMjLhcIGLcqJY6DWywwxHcp";
            strArr[3] = "fafmuFk897DEXRggqTinAcDDyPNFBZka";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 126);
            i12++;
        }
    }

    public static void A01() {
        A03 = new byte[]{39, 91, 74, 79, 85, 6, 76, 85, 88, 83, 71, 90, 6, 84, 85, 90, 6, 89, 91, 86, 86, 85, 88, 90, 75, 74, 32, 6, 48, 68, 51, 56, 62, -2, 54, 6, 0, 0, -4, 48, 59, 48, 70, -33, -13, -30, -25, -19, -83, -27, -75, -81, -81, -85, -21, -22, -33, -11, -24, -4, -21, -16, -10, -74, -12, -9, -69, -24, -76, -13, -24, -5, -12, 41, 61, 44, 49, 55, -9, 53, 56, 45, 47};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C1603Xg(C4 c42) {
        super(c42);
    }

    @Override // com.meta.analytics.dsp.uinode.C6
    public final void A0B(C1217Hz c1217Hz, long j7) throws C10259v {
        if (this.A00 == 2) {
            int A042 = c1217Hz.A04();
            super.A00.AFR(c1217Hz, A042);
            super.A00.AFS(j7, 1, A042, 0, null);
            return;
        }
        int A0E = c1217Hz.A0E();
        if (A04[2].length() != 16) {
            throw new RuntimeException();
        }
        A04[7] = "";
        if (A0E == 0 && !this.A01) {
            byte[] bArr = new byte[c1217Hz.A04()];
            c1217Hz.A0c(bArr, 0, bArr.length);
            Pair<Integer, Integer> audioParams = AbstractC1196He.A03(bArr);
            super.A00.A5n(Format.A07(null, A00(58, 15, 9), null, -1, -1, ((Integer) audioParams.second).intValue(), ((Integer) audioParams.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            this.A01 = true;
            return;
        }
        if (this.A00 == 10 && A0E != 1) {
            return;
        }
        int A043 = c1217Hz.A04();
        super.A00.AFR(c1217Hz, A043);
        super.A00.AFS(j7, 1, A043, 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (r5 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r5 == 1) goto L22;
     */
    @Override // com.meta.analytics.dsp.uinode.C6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0C(com.meta.analytics.dsp.uinode.C1217Hz r18) throws com.meta.analytics.dsp.uinode.C1599Xc {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1603Xg.A0C(com.facebook.ads.redexgen.X.Hz):boolean");
    }
}
