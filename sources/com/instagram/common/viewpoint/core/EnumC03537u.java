package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.7u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC03537u {
    A08(9000, A00(0, 30, 12)),
    A06(AdError.MEDIATION_ERROR_CODE, A00(Opcodes.IF_ICMPNE, 29, 104)),
    A05(3002, A00(Opcodes.LUSHR, 35, 75)),
    A07(3003, A00(Opcodes.ANEWARRAY, 33, 88)),
    A04(3004, A00(90, 35, 54));

    public static byte[] A02;
    public final int A00;
    public final String A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{92, -119, 59, -112, -119, -122, -119, -118, -110, -119, 59, UnsignedBytes.MAX_POWER_OF_TWO, -115, -115, -118, -115, 59, -125, 124, -114, 59, -118, 126, 126, -112, -115, -115, UnsignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE, 73, -66, -69, -50, -69, -68, -69, -51, -65, -39, -66, -65, -58, -65, -50, -65, -105, -108, -89, -108, -107, -108, -90, -104, -78, -100, -95, -90, -104, -91, -89, 126, 123, -114, 123, 124, 123, -115, Byte.MAX_VALUE, -103, -115, Byte.MAX_VALUE, -122, Byte.MAX_VALUE, 125, -114, 101, 98, 117, 98, 99, 98, 116, 102, UnsignedBytes.MAX_POWER_OF_TWO, 118, 113, 101, 98, 117, 102, -117, -90, -82, -79, -86, -87, 101, -71, -76, 101, -87, -86, -79, -86, -71, -86, 101, -73, -76, -68, 101, -85, -73, -76, -78, 101, -87, -90, -71, -90, -89, -90, -72, -86, 115, -96, -69, -61, -58, -65, -66, 122, -50, -55, 122, -61, -56, -51, -65, -52, -50, 122, -52, -55, -47, 122, -61, -56, -50, -55, 122, -66, -69, -50, -69, -68, -69, -51, -65, -120, -67, -40, -32, -29, -36, -37, -105, -21, -26, -105, -23, -36, -40, -37, -105, -35, -23, -26, -28, -105, -37, -40, -21, -40, -39, -40, -22, -36, -91, -83, -56, -48, -45, -52, -53, -121, -37, -42, -121, -36, -41, -53, -56, -37, -52, -121, -39, -42, -34, -121, -48, -43, -121, -53, -56, -37, -56, -55, -56, -38, -52, -107, 107, 100, 97, 100, 101, 109, 100};
    }

    static {
        A01();
    }

    EnumC03537u(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public final int A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
