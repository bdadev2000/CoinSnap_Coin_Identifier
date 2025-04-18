package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class V6 implements N9 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-35, -23, -25, -88, -32, -37, -35, -33, -36, -23, -23, -27, -88, -37, -34, -19, -88, -29, -24, -18, -33, -20, -19, -18, -29, -18, -29, -37, -26, -88, -35, -26, -29, -35, -27, -33, -34, 40, 52, 50, -13, 43, 38, 40, 42, 39, 52, 52, 48, -13, 38, 41, 56, -13, 46, 51, 57, 42, 55, 56, 57, 46, 57, 46, 38, 49, -13, 42, 55, 55, 52, 55, -21, -9, -11, -74, -18, -23, -21, -19, -22, -9, -9, -13, -74, -23, -20, -5, -74, -15, -10, -4, -19, -6, -5, -4, -15, -4, -15, -23, -12, -74, -18, -15, -10, -15, -5, -16, -25, -23, -21, -4, -15, -2, -15, -4, 1, 42, 54, 52, -11, 45, 40, 42, 44, 41, 54, 54, 50, -11, 40, 43, 58, -11, 48, 53, 59, 44, 57, 58, 59, 48, 59, 48, 40, 51, -11, 48, 52, 55, 57, 44, 58, 58, 48, 54, 53, -11, 51, 54, 46, 46, 44, 43, -31, -19, -21, -84, -28, -33, -31, -29, -32, -19, -19, -23, -84, -33, -30, -15, -84, -25, -20, -14, -29, -16, -15, -14, -25, -14, -25, -33, -22, -84, -16, -29, -11, -33, -16, -30, 46, 58, 56, -7, 49, 44, 46, 48, 45, 58, 58, 54, -7, 44, 47, 62, -7, 52, 57, Utf8.REPLACEMENT_BYTE, 48, 61, 62, Utf8.REPLACEMENT_BYTE, 52, Utf8.REPLACEMENT_BYTE, 52, 44, 55, -7, 61, 48, 66, 44, 61, 47, 42, 62, 48, 61, 65, 48, 61, 42, 49, 44, 52, 55, 64, 61, 48, -44, -32, -34, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -46, -43, -28, -97, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35, -97, -29, -42, -24, -46, -29, -43, -48, -28, -42, -29, -25, -42, -29, -48, -28, -26, -44, -44, -42, -28, -28};
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final String A6F() {
        return A00(Opcodes.IF_ICMPLE, 36, 27);
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final String A6p() {
        return A00(0, 37, 23);
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final String A7I() {
        return A00(72, 45, 37);
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final String A7M() {
        return A00(37, 35, 98);
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final String A7Z() {
        return A00(Opcodes.LNEG, 47, 100);
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final String A83() {
        return AdPlacementType.INTERSTITIAL.toString();
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final String A8K() {
        return A00(200, 51, 104);
    }

    @Override // com.instagram.common.viewpoint.core.N9
    public final String A8L() {
        return A00(251, 51, 14);
    }
}
