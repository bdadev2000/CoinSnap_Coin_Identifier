package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class YY extends CO {
    public static byte[] A03;
    public final long A00;
    public final List<YY> A01;
    public final List<YX> A02;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ Opcodes.FREM);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{121, 58, 54, 55, 45, 56, 48, 55, 60, 43, 42, 99, 121, 24, 84, 93, 89, 78, 93, 75, 2, 24};
    }

    public YY(int i2, long j2) {
        super(i2);
        this.A00 = j2;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final YY A06(int i2) {
        int size = this.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            YY yy = this.A01.get(i3);
            int childrenSize = ((CO) yy).A00;
            if (childrenSize == i2) {
                return yy;
            }
        }
        return null;
    }

    public final YX A07(int i2) {
        int size = this.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            YX yx = this.A02.get(i3);
            int childrenSize = ((CO) yx).A00;
            if (childrenSize == i2) {
                return yx;
            }
        }
        return null;
    }

    public final void A08(YY yy) {
        this.A01.add(yy);
    }

    public final void A09(YX yx) {
        this.A02.add(yx);
    }

    @Override // com.instagram.common.viewpoint.core.CO
    public final String toString() {
        return CO.A02(super.A00) + A04(13, 9, 74) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 43) + Arrays.toString(this.A01.toArray());
    }
}
