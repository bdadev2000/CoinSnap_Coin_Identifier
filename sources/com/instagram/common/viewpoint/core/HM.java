package com.instagram.common.viewpoint.core;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class HM extends AbstractC1235cz {
    public static byte[] A01;
    public final long A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 38);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -11, 12, -76, 7, -3, 14, -7, -76, 1, 9, 7, 8, -76, -10, -7, -76, 4, 3, 7, -3, 8, -3, 10, -7, -76, 2, 9, 1, -10, -7, 6, -75};
    }

    public HM(long j2) {
        if (j2 > 0) {
            this.A00 = j2;
            return;
        }
        throw new IllegalArgumentException(A00(0, 33, 110));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1235cz
    public final boolean A08(File file, long j2, int i2) {
        return j2 <= this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1235cz, com.instagram.common.viewpoint.core.C0B
    public final /* bridge */ /* synthetic */ void AH9(File file) throws IOException {
        super.AH9(file);
    }
}
