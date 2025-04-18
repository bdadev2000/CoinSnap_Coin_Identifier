package com.facebook.ads.redexgen.uinode;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class XT extends CJ {
    public static byte[] A03;
    public final long A00;
    public final List<XT> A01;
    public final List<XS> A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{Ascii.FF, 79, 67, 66, 88, 77, 69, 66, 73, 94, 95, Ascii.SYN, Ascii.FF, 79, 3, 10, Ascii.SO, Ascii.EM, 10, Ascii.FS, 85, 79};
    }

    public XT(int i10, long j3) {
        super(i10);
        this.A00 = j3;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final XT A06(int i10) {
        int size = this.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            XT xt = this.A01.get(i11);
            int childrenSize = ((CJ) xt).A00;
            if (childrenSize == i10) {
                return xt;
            }
        }
        return null;
    }

    public final XS A07(int i10) {
        int size = this.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            XS xs = this.A02.get(i11);
            int childrenSize = ((CJ) xs).A00;
            if (childrenSize == i10) {
                return xs;
            }
        }
        return null;
    }

    public final void A08(XT xt) {
        this.A01.add(xt);
    }

    public final void A09(XS xs) {
        this.A02.add(xs);
    }

    @Override // com.facebook.ads.redexgen.uinode.CJ
    public final String toString() {
        return CJ.A02(super.A00) + A04(13, 9, 69) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 6) + Arrays.toString(this.A01.toArray());
    }
}
