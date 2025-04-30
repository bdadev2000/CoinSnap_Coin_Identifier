package com.meta.analytics.dsp.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1477Sg extends KT {
    public static byte[] A01;
    public static String[] A02 = {"aQtlI1Us5cYHMsIV", "ql6TdDFLVKaOF", "ILd0cBh", "B0sTrIURZDTgtQOqZ9wP44Me", "PUGSIMdaF2lm0BEktB", "ig45kctSq2tkP", "eb7l2wEenDPHh06UHeaR81tCSX", "F61vU5UciYvMkd8uRJU0Fm"};
    public final /* synthetic */ C9Q A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[7] = "csAIefbP6dEHufce3C5MSz";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 117);
            i12++;
        }
    }

    public static void A02() {
        A01 = new byte[]{67, 86, 81, 82, 92, Ascii.CR, 91, 82, 99, 82, 95, Ascii.CR, 96, 97, 78, 95, 97, 82, 81, Ascii.CR, 93, 89, 78, 102, 86, 91, 84};
    }

    static {
        A02();
    }

    public C1477Sg(C9Q c9q) {
        this.A00 = c9q;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z8;
        z8 = this.A00.A08;
        if (!z8) {
            this.A00.A0G(A00(0, 27, 120));
        }
    }
}
