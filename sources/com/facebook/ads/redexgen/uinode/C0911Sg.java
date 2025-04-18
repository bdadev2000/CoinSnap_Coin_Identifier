package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0911Sg extends KT {
    public static byte[] A01;
    public static String[] A02 = {"aQtlI1Us5cYHMsIV", "ql6TdDFLVKaOF", "ILd0cBh", "B0sTrIURZDTgtQOqZ9wP44Me", "PUGSIMdaF2lm0BEktB", "ig45kctSq2tkP", "eb7l2wEenDPHh06UHeaR81tCSX", "F61vU5UciYvMkd8uRJU0Fm"};
    public final /* synthetic */ C9Q A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[7] = "csAIefbP6dEHufce3C5MSz";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 117);
            i13++;
        }
    }

    public static void A02() {
        A01 = new byte[]{67, 86, 81, 82, 92, Ascii.CR, 91, 82, 99, 82, 95, Ascii.CR, 96, 97, 78, 95, 97, 82, 81, Ascii.CR, 93, 89, 78, 102, 86, 91, 84};
    }

    static {
        A02();
    }

    public C0911Sg(C9Q c9q) {
        this.A00 = c9q;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        z10 = this.A00.A08;
        if (!z10) {
            this.A00.A0G(A00(0, 27, 120));
        }
    }
}
