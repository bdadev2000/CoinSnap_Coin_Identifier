package com.meta.analytics.dsp.uinode;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Je, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC1244Je implements Serializable {
    A04(320, 50),
    A07(0, 0),
    A05(-1, 50),
    A06(-1, 90),
    A08(-1, 250);

    public static byte[] A02 = null;
    public static final long serialVersionUID = 42;
    public final int A00;
    public final int A01;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-31, -32, -19, -19, -28, -15, -2, -46, -47, -49, -2, -44, -49, -54, -55, -42, -42, -51, -38, -25, -48, -51, -47, -49, -48, -36, -25, -67, -72, -78, -79, -66, -66, -75, -62, -49, -72, -75, -71, -73, -72, -60, -49, -87, -96, -40, -35, -29, -44, -31, -30, -29, -40, -29, -40, -48, -37, -94, -107, -109, -92, -111, -98, -105, -100, -107, -81, -104, -107, -103, -105, -104, -92, -81, -126, -123, Byte.MIN_VALUE};
    }

    static {
        A01();
    }

    EnumC1244Je(int i9, int i10) {
        this.A01 = i9;
        this.A00 = i10;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }
}
